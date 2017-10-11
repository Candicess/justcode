package com.shopmall.command;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;
import com.shopmall.entity.Mall;
import com.shopmall.entity.ShoppingCart;

/**
 * 命令模式的具体实现类--结算
 */
public class CheckoutCommand implements Command {
	
	private Customer customer;
	private ShoppingCart cart;
	
	public CheckoutCommand(Customer customer, ShoppingCart cart) {
		this.customer = customer;
		this.cart = cart;
	}

	@Override
	public void execute() {
		System.out.println("顾客 " + customer.getName() + " 正在结算");
		Mall.checkout(cart);
	}

	@Override
	public void undo() {
		System.out.println("结算暂时不支持撤销操作");
	}

}
