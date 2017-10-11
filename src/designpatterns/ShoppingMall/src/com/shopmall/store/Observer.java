package com.shopmall.store;

import com.shopmall.entity.Item;

public interface Observer {
	
	// 观察者模式 -- 当 Store 中商品有更新时通知 Customer
	public void receiveItemUpdate(Store store, Item item);

}
