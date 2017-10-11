package com.observer.gamecenter;

public interface Observer {
	
	public void help(String attackName);
	
	public void beAttacked(AllyControlCenter controlCenter);
	
}
