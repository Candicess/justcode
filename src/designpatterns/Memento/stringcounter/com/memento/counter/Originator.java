package com.memento.counter;

public class Originator {
	
	private int counter;
	
	public Originator() {
		counter = 0;
	}
	
	public Memento createMemento(){
		return new Memento(counter);
	}
	
	public void restoreMemento(Memento memento){
		this.counter = memento.getCounter();
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void appendString() {
		counter++;
	}

}
