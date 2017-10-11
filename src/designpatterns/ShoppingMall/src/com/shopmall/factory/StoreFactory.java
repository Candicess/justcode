package com.shopmall.factory;

import com.shopmall.store.Store;

/**
 * 抽象工厂类（工厂方法）
 */
public interface StoreFactory {

	public Store createStore(String name);
	
}
