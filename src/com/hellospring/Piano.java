package com.hellospring;

import org.springframework.stereotype.Component;

@Component("piano")
public class Piano implements Instrument{
	@Override
	public void play() {
		System.out.println("Playing piano now..");
	}
}
