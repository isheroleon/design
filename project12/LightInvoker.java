package com.zpkj.project12;

public class LightInvoker {
	
	private int status;
	
	private LightCommandInter lightCommandInter;
	
	public LightInvoker(LightCommandInter lightCommandInter, int status) {
		this.lightCommandInter = lightCommandInter;
		this.status = status;
	}
	
	public void action(){
		if(status==1){
			lightCommandInter.undo(); 
		}else if(status==2){
			lightCommandInter.execute();
		}else{
			System.out.println("指令错误");
		}	
	}
	
	
}
