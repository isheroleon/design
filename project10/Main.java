package com.zpkj.project10;

public class Main {
	public static void main(String[] args) {
		Thread thread = new Thread1();
		Thread thread2 = new Thread2();
		thread.start();
		thread2.start();
	}

}
