package com.zpkj.project9;

public class NYStyleClamPizza extends Pizza{
	
	public NYStyleClamPizza() {
		name="NY Style Sauce and Cheese Pizza";
		dough="Thin Crust Dough";
		sauce="Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}

	@Override
	public void prepare() {
		System.out.println("准备");
	}

	@Override
	public void bake() {
		System.out.println("烘焙");
	}

	@Override
	public void cut() {
		System.out.println("切割");
	}

	@Override
	public void box() {
		System.out.println("装盒");
	}


}
