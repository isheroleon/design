package com.zpkj.project12;

public class LightCommand implements LightCommandInter{

	private Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.onLight();
		
	}

	@Override
	public void undo() {
		light.offLight();
		
	}

}
