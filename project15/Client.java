package com.zpkj.project15;


public class Client {
	
	public static void main(String[] args) {
		Tuner tuner = new Tuner();
		CdPlayer cdPlayer = new CdPlayer();
		DvdPlayer dvdPlayer = new DvdPlayer();
		Amplifier amplifier = new  Amplifier(tuner, cdPlayer, dvdPlayer);
		Projector projector = new Projector(dvdPlayer);
		TheaterLight theaterLight = new TheaterLight();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLight, screen, popcornPopper);
		homeTheaterFacade.watchMovie();
		System.out.println("-----------------");
		homeTheaterFacade.endMovie();
	}

}
