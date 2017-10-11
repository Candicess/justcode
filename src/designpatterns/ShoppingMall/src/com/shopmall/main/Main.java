package com.shopmall.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.UUID;

import com.shopmall.command.AddToCartCommand;
import com.shopmall.command.CheckoutCommand;
import com.shopmall.command.Command;
import com.shopmall.command.EnterStoreCommand;
import com.shopmall.command.ExitStoreCommand;
import com.shopmall.command.Invoker;
import com.shopmall.command.ReturnItemCommand;
import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.entity.Mall;
import com.shopmall.factory.BookStoreFactory;
import com.shopmall.factory.CaffeeStoreFactory;
import com.shopmall.factory.GameStoreFactory;
import com.shopmall.factory.ShoeStoreFactory;
import com.shopmall.factory.StoreFactory;
import com.shopmall.proxy.IShopper;
import com.shopmall.proxy.Shopper;
import com.shopmall.proxy.ShopperHandler;
import com.shopmall.store.Store;

public class Main {
	
	public static void main(String[] args) {
		// ---初始化开始---
		StoreFactory factory = null;
		// 单例+工厂得到 BookStoreFactory 和 BookStore 对象
		factory = BookStoreFactory.getInstance();
		Store bookStore = factory.createStore("bookstore");
		
		// 组合模式为 bookstore 加入 substore-caffeestore
		factory = CaffeeStoreFactory.getInstance();
		Store caffeeStore = factory.createStore("caffeestore");
		bookStore.addSubStore(caffeeStore);
		
		// 单例+工厂得到 ShoeStoreFactory 和 ShoeStore 对象
		factory = ShoeStoreFactory.getInstance();
		Store shoeStore = factory.createStore("shoestore");
		
		// 单例+工厂得到 GameStoreFactory 和 GameStore 对象
		factory = GameStoreFactory.getInstance();
		Store gameStore = factory.createStore("gamestore");
		
		// 初始化两个Item
		Item item1 = new Item("bookitem1", UUID.randomUUID(), bookStore.getStoreId(), 12);
		Item item2 = new Item("bookitem2", UUID.randomUUID(), bookStore.getStoreId(), 24);
		bookStore.addItem(item1);
		
		// 向 Mall 中添加三个商店
		Mall mall = new Mall();
		mall.addStore(bookStore);
		mall.addStore(shoeStore);
		mall.addStore(gameStore);
		
		// 初始化两个顾客进入到mall中
		Customer c1 = new Customer("c1");
		Customer c2 = new Customer("c2");
		mall.enter(c1);
		mall.enter(c2);
		c1.setShoppingCart(mall.getShoppingCart());
		c2.setShoppingCart(mall.getShoppingCart());
		// ---初始化结束---
		
		// 进入商店命令
		Command enterStoreCommand = new EnterStoreCommand(c1, bookStore);
		Invoker invoker = new Invoker(enterStoreCommand);
		invoker.execute();
		
		// 退出商店命令 + 撤销（备忘录模式）
		invoker.setCommand(new ExitStoreCommand(c1, bookStore));
		invoker.execute();
		invoker.undo();
		
		// 商店物品更新（观察者模式）
		bookStore.addItem(item2);
		
		// 加入到购物车命令 + 撤销操作
		invoker.setCommand(new AddToCartCommand(c1, item1));
		invoker.execute();
		invoker.undo();
		
		// 动态代理模式(售货员帮忙购物)
		IShopper shopper = new Shopper();
		InvocationHandler handler = new ShopperHandler(shopper);
		IShopper client = (IShopper) Proxy.newProxyInstance(shopper.getClass()
				.getClassLoader(), shopper.getClass().getInterfaces(), handler);
		client.addItem(c1, item2);
		
		// 结算命令
		invoker.setCommand(new CheckoutCommand(c1, c1.getShoppingCart()));
		invoker.execute();
		
		// 顾客退货（责任链模式 级级审批）
		invoker.setCommand(new ReturnItemCommand(c1, item2));
		invoker.execute();
		
	}

}
