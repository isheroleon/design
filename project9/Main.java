package com.zpkj.project9;

public class Main {
	public static void main(String[] args) {
		
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza createPizza = pizzaStore.orderPizza("clam");
		System.out.println(createPizza.name);
		System.out.println(createPizza.dough);
		System.out.println(createPizza.sauce);
		System.out.println(createPizza.toppings);
	}
	
}
