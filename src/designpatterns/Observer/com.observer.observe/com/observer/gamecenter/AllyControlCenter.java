package com.observer.gamecenter;

public interface AllyControlCenter {
	
	public void join(Observer observer);
	
	public void quit(Observer observer);
	
	public void notifyObservers(String attackName);
	
}
