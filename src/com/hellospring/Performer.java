package com.hellospring;

public class Performer implements Performance{
	
	@Override
	public void perform() {
		System.out.println("I am performing.");
	}
}
