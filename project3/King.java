package com.zpkj.project3;

public class King extends AbstractCharacter{

	public King() {
		super();
		weaponBehavior = new SwordBehaviorImpl();
	}

	@Override
	void fight() {
		System.out.println("国王在战斗");	
	}
	
	public void perform(){
		weaponBehavior.useWeapon();
	}
	
	
}
