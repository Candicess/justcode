package com.template.db;

public abstract class DBOperate {
	
	protected abstract void connDB();
	protected void openDB() {
		System.out.println("打开数据库");
	}
	protected void useDB() {
		System.out.println("使用数据库");
	}
	protected void closeDB() {
		System.out.println("关闭数据库");
	}
	
	public void operate(){
		connDB();
		openDB();
		useDB();
		closeDB();
	}
	
}
