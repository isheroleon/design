package com.zpkj.project16;

public class Cilent {
	
	public static void main(String[] args) {
		CaffeineBeverage beverage1 = new Tea();
		CaffeineBeverage beverage2 = new Coffee();
		beverage1.prepareRecipe();
		System.out.println("-------------------");
		beverage2.prepareRecipe();
	}
	
}
