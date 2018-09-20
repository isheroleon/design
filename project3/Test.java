package com.zpkj.project3;

public class Test {
	
	public static void main(String[] args) {
		King king =new King();
		king.fight();
		king.perform();
		king.setWeaponBehavior(new AxeBehaviorImpl());
		king.perform();
	}
	

}
