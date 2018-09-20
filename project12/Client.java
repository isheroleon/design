package com.zpkj.project12;

public class Client {
	
	public static void main(String[] args) {
		Door door = new Door();
		DoorCommandInter doorCommandInter = new DoorCommand(door);
		DoorInvoker doorInvoker = new DoorInvoker(doorCommandInter, 2);
		DoorInvoker doorInvoker2 = new DoorInvoker(doorCommandInter, 1);
		doorInvoker.action();
		doorInvoker2.action();
		System.out.println("--------------------------------------------");
		Light light = new Light();
		LightCommandInter lightCommandInter = new LightCommand(light);
		LightInvoker lightInvoker = new LightInvoker(lightCommandInter, 2);
		LightInvoker lightInvoker2 = new LightInvoker(lightCommandInter, 1);
		lightInvoker.action();
		lightInvoker2.action();
		System.out.println("--------------------------------------------");
	}
}
