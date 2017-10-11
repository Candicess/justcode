package com.observer.news;

public interface INews {
	
	public void notifyAdmin();
	
	public void notifyUser();
	
	public void addUser(IUserObserver user);
	
	public void removeUser(IUserObserver user);

}
