package com.zpkj.project8;
//被装饰对象
public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		description = "黑咖啡";
	}

	@Override
	public double cost() {
		return 28;
	}

}
