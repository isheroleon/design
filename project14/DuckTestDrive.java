package com.zpkj.project14;

import java.util.Enumeration;
import java.util.Vector;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		MallarDuck duck = new MallarDuck();
		WildTurkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("the Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("the Duck says...");
		testDuck(duck);
		System.out.println("the TurkeyAdapter say...");
		testDuck(turkeyAdapter);
	}
	
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
