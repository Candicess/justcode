package com.shopmall.memento;

/**
 * 备忘录模式--备忘录操作类
 */
public class Originator {
	
	private Object preObject;
	
	public Memento createMemento(){
		return new Memento(preObject);
	}
	
	public void restoreMemento(Memento memento){
		this.preObject = memento.getPreObject();
	}
	
	public void setPreObject(Object preObject) {
		this.preObject = preObject;
	}

	public Object getPreObject() {
		return preObject;
	}

}
