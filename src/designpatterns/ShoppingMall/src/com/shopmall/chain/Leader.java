package com.shopmall.chain;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

/**
 * 责任链模式的抽象类
 */
public abstract class Leader {
	
	public String name;
	public Leader successor;
	
	public Leader(String name) {
		this.name = name;
	}
	
	// 设置上级
	public void setSuccessor(Leader successor){
		this.successor = successor;
	}
	
	public String getName() {
		return name;
	}
	
	// 责任链模式中很关键的处理方法，决定如何冒泡
	public abstract void handleRequest(Customer customer, Item item);

}
