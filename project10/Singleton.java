package com.zpkj.project10;

public class Singleton {
	
	//利用一个静态变量来记录Singleton的唯一实例
	private static Singleton uniqueInstance;
	
	//构造器私有,只有内部才能调用构造器
	private Singleton() {
		super();
	}
	//返回实例对象
	public static synchronized Singleton getInstance(){
		/**
		 * 为空,还没有创建实例，如果我们不需要这个实例,它就永远不会被创建,这就是"延迟实例化"
		 * 懒汉模式
		 */
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	
	//其他方法

}
