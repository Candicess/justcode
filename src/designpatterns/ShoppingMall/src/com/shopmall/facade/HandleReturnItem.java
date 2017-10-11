package com.shopmall.facade;

import com.shopmall.chain.Director;
import com.shopmall.chain.GeneralManager;
import com.shopmall.chain.Leader;
import com.shopmall.chain.Manager;
import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;


/**
 * 用户退货操作类--外观模式
 */
public class HandleReturnItem {
	
	public static void execute(Customer customer, Item item){
		Leader director = new Director("主任");
		Leader manager = new Manager("经理");
		Leader generalManager = new GeneralManager("总经理");
		
		// 责任链模式逐级设领导
		director.setSuccessor(manager);
		manager.setSuccessor(generalManager);
		// 最低级别人员开始 Handler
		director.handleRequest(customer, item);
	}
	
}
