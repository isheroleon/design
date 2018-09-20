package com.zpkj.project8;
//装饰者具体实现
public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",奶泡";
	}

	@Override
	public double cost() {
		return beverage.cost()+2;
	}

}
