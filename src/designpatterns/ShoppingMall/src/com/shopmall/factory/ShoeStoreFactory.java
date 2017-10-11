package com.shopmall.factory;

import java.util.UUID;

import com.shopmall.store.ShoeStore;
import com.shopmall.store.Store;

/**
 * 具体工厂类 + IODH
 */
public class ShoeStoreFactory implements StoreFactory {

	private ShoeStoreFactory() {}
	
	private static class HolderClass{
		private static final ShoeStoreFactory instance = new ShoeStoreFactory();
	}
	
	public static ShoeStoreFactory getInstance(){
		return HolderClass.instance;
	}
	
	@Override
	public Store createStore(String name) {
		return new ShoeStore(name, UUID.randomUUID());
	}

}
