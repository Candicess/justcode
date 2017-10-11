package com.memento.counter;

public class Main {

	public static void main(String[] args) {
		
		Originator ori = new Originator();
		CareTaker taker = new CareTaker();
		
		// 0 + 1  ====  1
		ori.appendString();
		taker.saveMemento(ori.createMemento());
		
		// 1 + 1  ====  2
		ori.appendString();
		
		// 恢复上一次的 counter
		ori.restoreMemento(taker.retrieveMemento());
		
		// 打印出counter的值应该为1
		System.out.println("counter = " + ori.getCounter());

	}

}
