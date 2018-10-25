package com.zpkj.project16;

public abstract class CaffeineBeverage {
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(isCondiments()){
			addCondiments();			
		}
	}
	//将下层行为向上抽象
	abstract void brew();
	
	abstract void addCondiments();
	
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	boolean isCondiments(){
		return true;
	}

}
