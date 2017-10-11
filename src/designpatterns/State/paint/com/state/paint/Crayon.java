package com.state.paint;

public class Crayon implements State {

	private String name;

	public Crayon(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("我是 " + name+ " 我可以用蜡笔画");
	}

}