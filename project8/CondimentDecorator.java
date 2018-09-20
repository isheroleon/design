package com.zpkj.project8;

/**
 * 装饰者共同实现的接口(也可以是抽象类)
 */
public abstract class CondimentDecorator extends Beverage{
	
	protected Beverage beverage;
	
	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	public abstract String getDescription();
	
		
}
