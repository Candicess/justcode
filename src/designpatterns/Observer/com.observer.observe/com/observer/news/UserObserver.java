package com.observer.news;

public class UserObserver implements IUserObserver {

	private String name;
	
	public UserObserver(String name) {
		this.name = name;
	}

	@Override
	public void receive(String news) {
		System.out.println("我是 " + name + ", 收到了新闻: " + news);
	}

}
