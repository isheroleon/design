package com.zpkj.project15;
/**
 * 公放类
 */
public class Amplifier {
	
	private Tuner tuner;
	
	private CdPlayer cdPlayer;
	
	private DvdPlayer dvdPlayer;

	public Amplifier(Tuner tuner, CdPlayer cdPlayer, DvdPlayer dvdPlayer) {
		super();
		this.tuner = tuner;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void onDvd(){
		System.out.println("开启公放");
		
	}
	public void offDvd(){
		System.out.println("关闭公放");
	}
	
	public void setSurroundSound(){
		dvdPlayer.setSurroundAudio();
	}
	public void dvdPlay(){
		dvdPlayer.play();
	}

}
