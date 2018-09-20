package com.zpkj.project8;
//装饰者具体实现
public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",摩卡";
	}

	@Override
	public double cost() {
		return beverage.cost()+5;
	}

}
