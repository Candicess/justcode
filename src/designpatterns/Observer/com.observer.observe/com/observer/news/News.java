package com.observer.news;

import java.util.ArrayList;
import java.util.List;

public class News implements INews {

	private String news;
	
	private IAdminObserver adminObserver;
	private List<IUserObserver> users = new ArrayList<IUserObserver>();
	
	public News(String news, IAdminObserver adminObserver) {
		this.news = news;
		this.adminObserver = adminObserver;
	}

	@Override
	public void notifyAdmin() {
		adminObserver.check(this);
	}

	@Override
	public void notifyUser() {
		for (IUserObserver user : users) {
			user.receive(news);
		}
	}

	@Override
	public void addUser(IUserObserver user) {
		users.add(user);
	}

	@Override
	public void removeUser(IUserObserver user) {
		users.remove(user);
	}

}
