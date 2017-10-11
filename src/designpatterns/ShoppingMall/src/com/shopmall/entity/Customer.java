package com.shopmall.entity;

import com.shopmall.store.Observer;
import com.shopmall.store.Store;


/**
 * Customer 实体类
 */
public class Customer implements Observer{
	
	// the name of the customer
	private String name;
	// the shopping cart being used by the customer
	private ShoppingCart shoppingCart;
	// the store the customer is currently in
	private Store store;
	
	public Customer(String name) {
		this.name = name;
	}
	
	/**
	 * @param item
	 * 添加item至购物车
	 */
	public void addItemToCart(Item item){
		shoppingCart.addItem(item);
		System.out.println("顾客 " + name + " 将物品 " + item.getItemName() + " 放入了购物车");
	}

	/**
	 * @param item
	 * 从购物车移除item
	 */
	public void removeItemFromCart(Item item){
		shoppingCart.removeItem(item);
		System.out.println("顾客 " + name + " 将物品 " + item.getItemName() + " 移出了购物车");
	}
	
	/**
	 * 观察者模式中的update具体方法，接收更新
	 */
	@Override
	public void receiveItemUpdate(Store store, Item item) {
		System.out.println("我是 " + this.name +" 收到 " + store.getName() + " 的 " + item.getItemName() + " 更新");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	
	public void setStore(Store store) {
		this.store = store;
	}
	
	public Store getStore() {
		return store;
	}

}
