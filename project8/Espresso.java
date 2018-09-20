package com.zpkj.project8;
//被装饰对象
public class Espresso extends Beverage{
	
	public Espresso() {
		description ="浓缩咖啡";
	}

	@Override
	public double cost() {
		return 29;
	}

}
