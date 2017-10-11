package com.shopmall.command;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.memento.CareTaker;
import com.shopmall.memento.Originator;
import com.shopmall.store.Store;

/**
 * 命令模式的具体实现类--顾客进入商店
 */
public class EnterStoreCommand implements Command {

	private Customer preCustomer;
	private Store preStore;
	private Customer customer;
	private Store store;
	// 备忘录对象，负责保存上次添加到购物车的状态
	private Originator ori = new Originator();
	private CareTaker taker = new CareTaker();
	
	public EnterStoreCommand(Customer customer, Store store) {
		this.customer = customer;
		this.store = store;
	}

	@Override
	public void execute() {
		store.enter(customer);
		customer.setStore(store);
		preCustomer = customer;
		preStore = store;
		// 将本次状态保存至备忘录
		ori.setPreObject(customer);
		taker.saveMemento(ori.createMemento());
	}

	@Override
	public void undo() {
		// 备忘录模式取回上次状态
		ori.restoreMemento(taker.retrieveMemento());
		Customer preCustomer =  (Customer) ori.getPreObject();
		System.out.println("顾客 " + preCustomer.getName() + " 执行了撤销操作 即将离开商店 " + store.getName());
		store.exit(preCustomer);
		customer.setStore(null);
	}

}
