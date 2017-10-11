package com.memento.counter;

public class Memento {
	
	private int counter;

	public Memento(int counter) {
		this.counter = counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}

}
