package com.shopmall.proxy;

import com.shopmall.entity.Customer;
import com.shopmall.entity.Item;

/**
 * 代理模式--代理者接口
 */
public interface IShopper {
	
	public void addItem(Customer customer, Item item);
	
	public void removeItem(Customer customer, Item item);

}
