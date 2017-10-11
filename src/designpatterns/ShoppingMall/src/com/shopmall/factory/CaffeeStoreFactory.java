package com.shopmall.factory;

import java.util.UUID;

import com.shopmall.store.CaffeeStore;
import com.shopmall.store.Store;

/**
 * 具体工厂类 + IODH
 */
public class CaffeeStoreFactory implements StoreFactory {

	private CaffeeStoreFactory() {}
	
	private static class HolderClass{
		private static final CaffeeStoreFactory instance = new CaffeeStoreFactory();
	}
	
	public static CaffeeStoreFactory getInstance(){
		return HolderClass.instance;
	}
	
	@Override
	public Store createStore(String name) {
		return new CaffeeStore(name, UUID.randomUUID());
	}

}
