package com.zpkj.project8;

public class Test {
	
	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		Mocha mocha = new Mocha(beverage);
		System.out.println(mocha.getDescription()+mocha.cost());
		Whip whip = new Whip(mocha);
		System.out.println(whip.getDescription()+whip.cost());
		
	}
}
