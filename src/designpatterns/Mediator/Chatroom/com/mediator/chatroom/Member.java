package com.mediator.chatroom;

public abstract class Member {
	
	protected AbstractChatroom chatroom;
	protected String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	public abstract void sendText(String to, String message);
	
	public abstract void sendImage(String to, String image);
	
	public void receiveText(String from, String message){
		System.out.println("我是 " + getName() + ", 从" + from + "收到消息: " + message);
	}
	
	public void receiveImage(String from, String image){
		System.out.println("我是 " + getName() + ", 从" + from + "收到图片: " + image);
	}

	public AbstractChatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
