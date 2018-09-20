package com.zpkj.project10;

public class Singleton3 {
	
	/**
	 * volatile关键字确保,当uniqueInstance变量被初始化成Singleton3实例时,
	 * 每个线程从主存中读取uniqueInstance的值,保证正确处理uniqueInstance变量
	 */
	private volatile static Singleton3 uniqueInstance ;
	
	private Singleton3() {
	}
	/**
	 * 双重检查加锁
	 */
	public static Singleton3 getInstance(){
		if(uniqueInstance==null){
			synchronized (Singleton3.class) {
				if(uniqueInstance==null){
					uniqueInstance = new Singleton3();
				}
			}
		}
		return uniqueInstance;
		
	}

}
