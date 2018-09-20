package com.zpkj.project14;
/**
 * 绿头鸭
 */
public class MallarDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
