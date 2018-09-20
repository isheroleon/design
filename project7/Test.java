package com.zpkj.project7;

public class Test {
	public static void main(String[] args) {
		Pancake pancake = new TornCake();
		System.out.println(pancake.getDesc()+pancake.price());
		Pancake roujiamo = new Roujiamo();
		Condiment firedEgg = new FiredEgg(roujiamo);
		System.out.println(firedEgg.getDesc()+firedEgg.price());
		firedEgg = new Ham(roujiamo);
		System.out.println(firedEgg.getDesc()+firedEgg.price());
	}

}
