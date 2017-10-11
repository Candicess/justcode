package com.shopmall.factory;

import java.util.UUID;

import com.shopmall.store.GameStore;
import com.shopmall.store.Store;

/**
 * 具体工厂类 + IODH
 */
public class GameStoreFactory implements StoreFactory {

	private GameStoreFactory() {}
	
	private static class HolderClass{
		private static final GameStoreFactory instance = new GameStoreFactory();
	}
	
	public static GameStoreFactory getInstance(){
		return HolderClass.instance;
	}
	
	@Override
	public Store createStore(String name) {
		return new GameStore(name, UUID.randomUUID());
	}

}
