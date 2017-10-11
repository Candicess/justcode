package com.shopmall.command;

/**
 * 命令模式的接口--包括执行和撤销操作
 */
public interface Command {
	
	public abstract void execute();
	
	public abstract void undo();

}
