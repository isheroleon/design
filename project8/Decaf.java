package com.zpkj.project8;
//被装饰对象
public class Decaf extends Beverage{

	public Decaf() {
		description = "无咖啡因咖啡";
	}

	@Override
	public double cost() {
		return 36;
	}

}
