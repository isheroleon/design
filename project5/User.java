package com.zpkj.project5;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{

	private String msg;

	private String name;
	public User(String name) {
		super();
		this.name =name;
	}

	@Override
	public void update(Observable o, Object arg) {
		msg=arg.toString();
		read();
	}

	public void read(){
		System.out.println(name+"已收到推送消息"+msg);
	}


}
