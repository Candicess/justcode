package com.shopmall.store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

public abstract class Store {

	// the name of the store
	private String name;
	// unique ID for the store   可以改为UID
	private UUID storeId;
	// items available for sale in the store
	protected List<Item> items = new ArrayList<Item>();
	// the customers currently in the store
	protected List<Customer> customers = new ArrayList<Customer>();
	// substore---composite
	private Store subStore;
	
	// Observers
	public void notifyItemsChanged(Store store, Item item){
		for (Customer customer : customers) {
			customer.receiveItemUpdate(store, item);
		}
	}
	
	public Store(String name, UUID storeId) {
		this.name = name;
		this.storeId = storeId;
	}
	
	// 组合模式 商店中可以包含子商店
	public void addSubStore(Store subStore){
		this.subStore = subStore;
	}
	
	public String getName(){
		return this.name;
	}
	
	public UUID getStoreId(){
		return storeId;
	}
	
	/**
	 * customer c enters the store
	 */
	public abstract void enter(Customer c);
	
	/**
	 * customer c exits the store
	 */
	public abstract void exit(Customer c);
	
	/**
	 * returns an enumeration of the customers in the store
	 */
	public abstract Iterator<Customer> customers();
	
	/**
	 * returns an enumeration of the items available for sale in the store
	 */
	public abstract Iterator<Item> items();
	
	/**
	 * add an item to the shopping cart   改成了如下
	 */
	public abstract void addItem(Item item);
	
	/**
	 * remove an item from the shopping cart  改成了如下
	 */
	public abstract void removeItem(Item item);	
}
