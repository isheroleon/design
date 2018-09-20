package com.zpkj.project2;

import com.zpkj.project2.impl.FlyBehaviorImpl1;
import com.zpkj.project2.impl.QuackBehaviorImpl1;
/**
 * 设计原则:
 * 多用组合,少用继承
 */
public class WildDuck extends Duck{
	
	public WildDuck() {
		super();
		flyBehavior = new FlyBehaviorImpl1();
		quackBehavior = new QuackBehaviorImpl1();
	}

	@Override
	public void display() {
		System.out.println("我是一只野鸭子");
	}

}
