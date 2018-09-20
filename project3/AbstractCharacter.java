package com.zpkj.project3;
/**
 * 策略模式
 */
public abstract class AbstractCharacter {
	
	WeaponBehaviorInter  weaponBehavior;
	
	abstract void fight();
	
	void setWeaponBehavior(WeaponBehaviorInter  weaponBehavior){
		this.weaponBehavior = weaponBehavior;
	}

}
