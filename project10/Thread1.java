package com.zpkj.project10;

public class Thread1 extends Thread{

	@Override
	public void run() {
		super.run();
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
	}
	

}
