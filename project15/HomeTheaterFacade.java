package com.zpkj.project15;

public class HomeTheaterFacade {
	
	private Amplifier amplifier;
	
	private Tuner tuner;
	
	private DvdPlayer dvdPlayer;
	
	private CdPlayer cdPlayer;
	
	private Projector projector;
	
	private TheaterLight light;
	
	private Screen screen;
	
	private PopcornPopper popcornPopper;

	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
			TheaterLight light, Screen screen, PopcornPopper popcornPopper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.light = light;
		this.screen = screen;
		this.popcornPopper = popcornPopper;
	}
	
	
	
	public void watchMovie(){
		System.out.println("let’s go");
		popcornPopper.on();
		popcornPopper.pop();
		light.on();
		light.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.onDvd();
		amplifier.setSurroundSound();
		dvdPlayer.on();
		dvdPlayer.play();
		
	}
	
	public void endMovie(){
		System.out.println("shutting movie theater dowm...");
		popcornPopper.off();
		light.off();
		screen.up();
		projector.off();
		amplifier.offDvd();
		dvdPlayer.stop();
		dvdPlayer.off();
	}

}
