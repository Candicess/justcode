package com.state.paint;

public class Main {
	
	public static void main(String[] args) {
		
		// 保存状态的上下文对象
		ControlPanel context = new ControlPanel();
		
		// 各种状态
		Pencil pencil = new Pencil("铅笔");
		Crayon crayon = new Crayon("蜡笔");
		
		// 为上下文对象设置对象并调用
		context.setState(pencil);
		context.draw();
		
		context.setState(crayon);
		context.draw();
		
	}

}
