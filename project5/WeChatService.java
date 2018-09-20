package com.zpkj.project5;

import java.util.Observable;

public class WeChatService extends Observable{
	
	private String message ;
	
	public void setInfomation(String msg){
		this.message = msg;
		System.out.println("微信服务更新消息");
		//消息更新,通知所有观察者
		setChanged();
		notifyObservers(message);
	}
}
