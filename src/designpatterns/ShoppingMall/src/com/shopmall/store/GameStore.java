package com.shopmall.store;

import java.util.Iterator;
import java.util.UUID;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

public class GameStore extends Store {
	
	public GameStore(String name, UUID storeId) {
		super(name, storeId);
	}

	@Override
	public void enter(Customer c) {
		customers.add(c);
		System.out.println("顾客 " + c.getName() + " 进入了商店 " + super.getName());
	}

	@Override
	public void exit(Customer c) {
		customers.remove(c);
		System.out.println("顾客 " + c.getName() + " 离开了商店 " + super.getName());
	}

	@Override
	public Iterator<Customer> customers() {
		return customers.iterator();
	}

	@Override
	public Iterator<Item> items() {
		return items.iterator();
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
		super.notifyItemsChanged(this, item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

}
