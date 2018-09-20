package com.zpkj.project9;
/**
 * 子类实例化工厂方法
 */
public class NYStyleCheesePizza extends Pizza{

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
