package com.observer.gamecenter;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAllyControlCenter implements AllyControlCenter{
	
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void join(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void quit(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String attackName) {
		for (Observer observer : observers) {
			if ( !((Player)observer).getName().equalsIgnoreCase(attackName) )
				observer.help(attackName);
		}
	}

}
