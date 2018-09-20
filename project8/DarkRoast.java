package com.zpkj.project8;

//被装饰对象
public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		description = "深焙咖啡";
	}
	
	@Override
	public double cost() {
		return 24;
	}

}
