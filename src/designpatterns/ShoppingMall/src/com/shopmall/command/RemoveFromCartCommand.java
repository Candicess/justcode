package com.shopmall.command;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.memento.CareTaker;
import com.shopmall.memento.Originator;

/**
 * 命令模式的具体实现类--将商品从购物车中移除
 */
public class RemoveFromCartCommand implements Command {
	
	private Customer customer;
	private Item item;
	// 备忘录对象，负责保存上次添加到购物车的状态
	private Originator ori = new Originator();
	private CareTaker taker = new CareTaker();
	
	public RemoveFromCartCommand(Customer customer, Item item) {
		this.customer = customer;
		this.item = item;
	}

	@Override
	public void execute() {
		customer.removeItemFromCart(item);
		// 将本次状态保存至备忘录
		ori.setPreObject(item);
		taker.saveMemento(ori.createMemento());
	}

	@Override
	public void undo() {
		// 备忘录模式取回上次状态
		ori.restoreMemento(taker.retrieveMemento());
		Item preItem = (Item) ori.getPreObject();
		System.out.println("顾客 " + customer.getName() + " 执行了撤销操作 即将将商品 " + preItem.getItemName() + " 重新加入购物车");
		customer.addItemToCart(preItem);
	}

}
