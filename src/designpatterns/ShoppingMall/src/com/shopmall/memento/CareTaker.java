package com.shopmall.memento;


/**
 * 备忘录模式--备忘录保存类
 */
public class CareTaker {
	
	private Memento memento;
	
	public Memento retrieveMemento(){
		return memento;
	}
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}

}
