package com.observer.gamecenter;

public class Player implements Observer {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public void help(String attackName) {
		System.out.println("我是 " + name + "， 收到 " + attackName + " 被攻击，这就来营救！");
	}

	@Override
	public void beAttacked(AllyControlCenter controlCenter) {
		System.out.println("我是 " + name + "， 正在被攻击");
		controlCenter.notifyObservers(name);
	}
	
	public String getName() {
		return name;
	}

}
