package com.zpkj.project10;


public class Singleton2 {
	
	/**
	 * jvm在加载这个类时马上创建唯一的单间实例,保证了任何线程在访问uniqueInstance静态变量之前,一定先创建此实例
	 * 利用"急切"创建实例,而不使用"延迟实例化的做法"
	 * 也就是一般所说的"饱汉模式"
	 */
	private static Singleton2 uniqueInstance = new Singleton2();
	
	private Singleton2() {
		super();
	}
	public static Singleton2 getInstance(){
		return uniqueInstance;
	}
	
	
	//其他方法

}
