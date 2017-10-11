package com.state.paint;

public class Pencil implements State {

	private String name;

	public Pencil(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("我是 " + name+ " 我可以用铅笔画");
	}

}