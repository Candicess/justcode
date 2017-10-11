package com.shopmall.command;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.memento.CareTaker;
import com.shopmall.memento.Originator;

/**
 * 命令模式的具体实现类--添加商品至购物车
 */
public class AddToCartCommand implements Command {
	
	private Customer customer;
	private Item item;
	// 备忘录对象，负责保存上次添加到购物车的状态
	private Originator ori = new Originator();
	private CareTaker taker = new CareTaker();
	
	public AddToCartCommand(Customer customer, Item item) {
		this.customer = customer;
		this.item = item;
	}
	
	@Override
	public void execute() {
		customer.addItemToCart(item);
		// 将本次状态保存至备忘录
		ori.setPreObject(item);
		taker.saveMemento(ori.createMemento());
	}

	@Override
	public void undo() {
		// 备忘录模式取回上次状态
		ori.restoreMemento(taker.retrieveMemento());
		Item preItem = (Item) ori.getPreObject();
		System.out.println("顾客 " + customer.getName() + " 执行了撤销操作 即将将商品 " + preItem.getItemName() + " 移出购物车");
		customer.removeItemFromCart(preItem);
	}

}
