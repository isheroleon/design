package com.zpkj.project16;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	boolean isCondiments() {
		return false;
	}
	
	

}
