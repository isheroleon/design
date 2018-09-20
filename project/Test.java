package com.zpkj.project;

import java.io.FilterInputStream;

public class Test {
	public static void main(String[] args) {
		User1 user1 =new User1("张三");
		User1 user2 =new User1("李四");
		User1 user3 =new User1("王二麻子");
		Wechat wechat = new Wechat();
		wechat.registerObserver(user1);
		wechat.registerObserver(user2);
		wechat.registerObserver(user3);
		wechat.setInfomation("明天有暴雨,请注意出行安全");
	}

}
