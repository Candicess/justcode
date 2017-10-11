package com.template.db;

public class Main {

	public static void main(String[] args) {
		
		DBOperate operate = null;
		
		operate = new SQLServer();
		operate.operate();
		
		operate = new Oracle();
		operate.operate();
		

	}

}
