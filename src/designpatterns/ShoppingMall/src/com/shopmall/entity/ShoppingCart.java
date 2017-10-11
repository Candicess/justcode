package com.shopmall.entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A shopping cart for the customer
 */
public class ShoppingCart {

	// items currently in the shopping cart
	private List<Item> items = new ArrayList<Item>();
	
	/**
	 * returns an enumeration of the items currently in the cart
	 */
	public Iterator<Item> items(){
		return items.iterator();
	}
	
	/**
	 * add item for cart
	 */
	public void addItem(Item item){
		items.add(item);
	}
	
	/**
	 * remove item from cart
	 */
	public void removeItem(Item item){
		items.remove(item);
	}
	

}
