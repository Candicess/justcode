package com.shopmall.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模式--动态代理
 */
public class ShopperHandler implements InvocationHandler {

	private Object object;
	
	public ShopperHandler(Object object) {
		this.object = object;
	}
	
	// 动态代理关键的invoke方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 尤其理解参数 args 的工作机制
		Object result = method.invoke(object, args);
		return result;
	}

}
