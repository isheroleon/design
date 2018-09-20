package com.zpkj.project8;
/**
 * Component
 * 装饰者模式 顶层
 */
public abstract class Beverage {
	
	protected String description;
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
