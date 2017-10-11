package com.shopmall.factory;

import java.util.UUID;

import com.shopmall.store.BookStore;
import com.shopmall.store.Store;

/**
 * 具体工厂类 + IODH
 */
public class BookStoreFactory implements StoreFactory {

	private BookStoreFactory() {}
	
	private static class HolderClass{
		private static final BookStoreFactory instance = new BookStoreFactory();
	}
	
	public static BookStoreFactory getInstance(){
		return HolderClass.instance;
	}
	
	@Override
	public Store createStore(String name) {
		return new BookStore(name, UUID.randomUUID());
	}

}
