package com.zpkj.project7;
/**
 * 装饰者模式
 */
public abstract class Pancake {
	
	public String desc = "我不是一个具体的煎饼";
	
	public abstract double price();

	public String getDesc() {
		return desc;
	}
	
	

}
