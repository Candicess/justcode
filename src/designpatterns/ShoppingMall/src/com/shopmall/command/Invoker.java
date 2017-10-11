package com.shopmall.command;

/**
 * 命令模式的具体执行者
 */
public class Invoker {
	
	// 关联关系
	public Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	
	public void undo(){
		command.undo();
	}

}
