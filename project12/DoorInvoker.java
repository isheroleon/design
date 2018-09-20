package com.zpkj.project12;

public class DoorInvoker {
	
	private int status;
	
	private DoorCommandInter doorCommandInter;
	
	public DoorInvoker(DoorCommandInter doorCommandInter,int status) {
		this.doorCommandInter = doorCommandInter;
		this.status = status;
		
	}
	
	public void action(){
		if(status==1){
			doorCommandInter.undo();
		}else if(status==2){
			doorCommandInter.execute();
		}else{
			System.out.println("指令错误");
		}	
	}
	

}
