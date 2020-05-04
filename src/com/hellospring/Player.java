package com.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

	private String song;
	@Autowired
	private Instrument instrument;
	
	public Player(String song, Instrument instrument) {
		this.song=song;
		this.instrument=instrument;
	}
	
	public void perform() {
		System.out.println("Hello Spring. I am performing...");
		System.out.println(song);
		instrument.play();
	}

}
