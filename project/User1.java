package com.zpkj.project;

public class User1 implements ObserverInter{
	
	private String msg;
	
	private String name;
	public User1(String name) {
		super();
		this.name =name;
	}

	@Override
	public void update(String message) {
		this.msg = message;
		read();
	}
	
	public void read(){
	System.out.println(name+"已收到推送消息"+msg);
	}
	

}
