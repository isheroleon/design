package com.zpkj.project9;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	/**
	 * 工厂方法 
	 */
	abstract Pizza createPizza(String type);

}
