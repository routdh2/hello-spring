package com.hellospring.aspect;

import java.util.HashMap;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CountTracks {
	
	HashMap<Integer,Integer> tracker = new HashMap<>();
	
	@Pointcut("execution(** com.hellospring.Tanmay.playTrack(int)) && args(trackNumber)")
	public void playTrackPointcut(int trackNumber) {}
	
	@Before("playTrackPointcut(trackNumber)")
	public void countTracks(int trackNumber) {
		tracker.put(trackNumber,tracker.getOrDefault(trackNumber, 0)+1);
	}
	
	public int getCount(int trackNumber) {
		return tracker.getOrDefault(trackNumber,0);
	}
	
	@AfterReturning("playTrackPointcut(trackNumber)")
	public void displayCount(int trackNumber) {
		System.out.println(getCount(trackNumber));
	}
}
