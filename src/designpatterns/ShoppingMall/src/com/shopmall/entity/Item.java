package com.shopmall.entity;

import java.util.UUID;

/**
 * 商品实体类--An item for sale in a store
 * @param itemName
 * @param itemId
 * @param storeId
 * @param price 
 */

public class Item {
	// the name of the item
	private String itemName;
	// unique ID for the item
	private UUID itemId;
	// the ID of the store from which the item came
	private UUID storeId;
	// the price of the item
	private double price;
	
	public Item(String itemName, UUID itemId, UUID storeId, double price) {
		this.itemName = itemName;
		this.itemId = itemId;
		this.storeId = storeId;
		this.price = price;
	}
	
	public Item() {
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public UUID getItemId() {
		return itemId;
	}

	public void setItemId(UUID itemId) {
		this.itemId = itemId;
	}

	public UUID getStoreId() {
		return storeId;
	}

	public void setStoreId(UUID storeId) {
		this.storeId = storeId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
