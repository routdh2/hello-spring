package com.hellospring.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** com.hellospring.Tanmay.play(..))")
	public void playPointcut() {}
	
	@Before("playPointcut()") //These are called Pointcut expressions
	public void SilenceMobile() { //These are called advice
		System.out.println("Silencing the mobile phones.");
	}
	
	@Before("playPointcut()")
	public void takeSeats() {
		System.out.println("Taking seats.");
	}
	
	@AfterReturning("playPointcut()")
	public void applaud() {
		System.out.println("Clap clap clap!!");
	}
	@AfterThrowing("playPointcut()")
	public void demandRefund() {
		System.out.println("Demanding refund for tickets.");
	}
	
	
}
