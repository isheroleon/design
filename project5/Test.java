package com.zpkj.project5;


public class Test {
	public static void main(String[] args) {
		User user1 =new User("张三");
		User user2 =new User("李四");
		User user3 =new User("王二麻子");
		WeChatService chatService = new WeChatService();
		chatService.addObserver(user1);
		chatService.addObserver(user2);
		chatService.addObserver(user3);
		chatService.setInfomation("明天有暴雨,请注意出行安全");
	}
}
