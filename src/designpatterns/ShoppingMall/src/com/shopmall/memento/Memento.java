package com.shopmall.memento;

/**
 * 备忘录模式--备忘录实体
 */
public class Memento {
	
	private Object preObject;

	public Memento(Object preObject) {
		this.preObject = preObject;
	}
	
	public void setPreObject(Object preObject) {
		this.preObject = preObject;
	}
	
	public Object getPreObject() {
		return preObject;
	}
	
	

}
