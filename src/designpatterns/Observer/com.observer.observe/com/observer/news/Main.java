package com.observer.news;

public class Main {

	public static void main(String[] args) {

		IUserObserver user1 = new UserObserver("user1");
		IUserObserver user2 = new UserObserver("user2");
		IUserObserver user3 = new UserObserver("user3");
		IUserObserver user4 = new UserObserver("user4");
		IAdminObserver adminObserver = new AdminObserver();
		
		INews news = new News("今天我学习了观察者模式", adminObserver);
		news.addUser(user1);
		news.addUser(user2);
		news.addUser(user3);
		news.addUser(user4);
		
		news.notifyAdmin();
		
		
	}

}
