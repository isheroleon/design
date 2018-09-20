package com.zpkj.project12;

public class DoorCommand implements DoorCommandInter {
	
	private Door door;
	
	public DoorCommand(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.onDoor();
		
	}

	@Override
	public void undo() {
		door.offDoor();
	}

}
