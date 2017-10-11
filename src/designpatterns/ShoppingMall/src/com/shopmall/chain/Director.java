package com.shopmall.chain;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

/**
 * 责任链模式的具体实现类
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Customer customer, Item item) {
		if (item.getPrice() <= 3)
			System.out.println("我是 " + getName() + ", 我可以审批价格在3元以下的,允许退货");
		else{
			System.out.println("我是 " + getName() + ", 我审批不了，传递给我的上级");
			successor.handleRequest(customer, item);
		}
	}

}
