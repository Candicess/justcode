package com.shopmall.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.shopmall.store.Store;

/**
 * Mall 实体类
 */
public class Mall {
	
	// the name of the mall
	private String name;
	// a collection of stores of different types
	private List<Store> stores = new ArrayList<Store>();
	// the customers currently in the mall
	private List<Customer> customers = new ArrayList<Customer>();
	
	/**
	 * customer c enters the mall
	 */
	public void enter(Customer c){
		customers.add(c);
	}
	
	/**
	 * customer c exits the mall
	 */
	public void exit(Customer c){
		customers.remove(c);
	}
	
	/**
	 * add a store to mall
	 */
	public void addStore(Store store){
		stores.add(store);
	}
	
	/**
	 * remove a store to mall
	 */
	public void removeStore(Store store){
		stores.remove(store);
	}
	
	/**
	 * returns an empty shopping cart
	 */
	public ShoppingCart getShoppingCart(){
		return new ShoppingCart();
	}
	
	/**
	 * returns an enumeration of the customers in the mall
	 */
	public Iterator<Customer> customers(){
		return customers.iterator();
	}
	
	/**
	 * returns an user according name
	 */
	public Customer getCustomer(String name){
		for (Customer customer : customers) {
			if (name.equals(customer.getName()))
				return customer;
		}
		return null;
	}
	
	/**
	 * checkout and purchase the items in the shopping cart
	 */
	public static void checkout(ShoppingCart cart){
		Iterator<Item> items = cart.items();
		double total = 0;
		while (items.hasNext()){
			total += items.next().getPrice();
		}
		System.out.println("最后结算金额为 " + total + " 元");
	}

}
