package com.shopmall.command;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.memento.CareTaker;
import com.shopmall.memento.Originator;
import com.shopmall.store.Store;

/**
 * 命令模式的具体实现类--顾客退出商店
 */
public class ExitStoreCommand implements Command {

	private Customer customer;
	private Store store;
	// 备忘录对象，负责保存上次添加到购物车的状态
	private Originator ori = new Originator();
	private CareTaker taker = new CareTaker();
	
	public ExitStoreCommand(Customer customer, Store store) {
		this.customer = customer;
		this.store = store;
	}

	@Override
	public void execute() {
		store.exit(customer);
		customer.setStore(null);
		// 将本次状态保存至备忘录
		ori.setPreObject(customer);
		taker.saveMemento(ori.createMemento());
	}

	@Override
	public void undo() {
		// 备忘录模式取回上次状态
		ori.restoreMemento(taker.retrieveMemento());
		Customer preCustomer =  (Customer) ori.getPreObject();
		System.out.println("顾客 " + preCustomer.getName() + " 执行了撤销操作 即将回到商店 " + store.getName());
		store.enter(preCustomer);
		customer.setStore(store);
	}

}
