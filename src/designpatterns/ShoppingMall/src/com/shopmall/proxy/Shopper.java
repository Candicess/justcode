package com.shopmall.proxy;

import com.shopmall.command.AddToCartCommand;
import com.shopmall.command.Invoker;
import com.shopmall.command.RemoveFromCartCommand;
import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

/**
 * 代理模式--具体代理者
 */
public class Shopper implements IShopper {

	private Invoker invoker;
	
	public Shopper() {
		invoker = new Invoker(null);
	}

	@Override
	public void addItem(Customer customer, Item item) {
		System.out.println("我是导购 为顾客 " + customer.getName() + " 向购物车添加商品 " + item.getItemName());
		invoker.setCommand(new AddToCartCommand(customer, item));
		invoker.execute();
	}

	@Override
	public void removeItem(Customer customer, Item item) {
		System.out.println("我是导购 为顾客 " + customer.getName() + " 从购物车移除商品 " + item.getItemName());
		invoker.setCommand(new RemoveFromCartCommand(customer, item));
		invoker.execute();
	}

}
