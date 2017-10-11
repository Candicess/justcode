package com.shopmall.command;

import com.shopmall.chain.Director;
import com.shopmall.chain.GeneralManager;
import com.shopmall.chain.Leader;
import com.shopmall.chain.Manager;
import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.facade.HandleReturnItem;

/**
 * 命令模式的具体实现类--退货
 */
public class ReturnItemCommand implements Command {
	
	private Customer customer;
	private Item item;
	
	public ReturnItemCommand(Customer customer, Item item) {
		this.customer = customer;
		this.item = item;
	}

	@Override
	public void execute() {
		HandleReturnItem.execute(customer, item);
	}

	@Override
	public void undo() {
		System.out.println("退货操作不提供撤销操作");
	}

}
