package com.observer.gamecenter;

public class Main {

	public static void main(String[] args) {
		
		AllyControlCenter controlCenter = new ConcreteAllyControlCenter();
		
		Observer player1 = new Player("player1");
		Observer player2 = new Player("player2");
		Observer player3 = new Player("player3");
		Observer player4 = new Player("player4");
		
		controlCenter.join(player1);
		controlCenter.join(player2);
		controlCenter.join(player3);
		controlCenter.join(player4);
		
		player1.beAttacked(controlCenter);
		
		player4.beAttacked(controlCenter);
		
	}

}
