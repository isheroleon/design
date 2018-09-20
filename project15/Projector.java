package com.zpkj.project15;
/**
 * 投影仪设配
 */
public class Projector {
	
	private DvdPlayer dvdPlayer;

	public Projector(DvdPlayer dvdPlayer) {
		super();
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on(){
		System.out.println("开启投影");
	}
	public void off(){
		System.out.println("关闭投影");
	}
	
	public void tvMode(){
		System.out.println("观影模式");
	}
	
	public void wideScreenMode(){
		System.out.println("宽屏模式");
	}
}
