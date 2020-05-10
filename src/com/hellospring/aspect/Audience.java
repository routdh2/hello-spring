package com.hellospring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** com.hellospring.Tanmay.play(..))")
	public void playPointcut() {}
	
	@Around("playPointcut()")
	public void aroundPlayAdvice(ProceedingJoinPoint jp) {
		
		
		try {
			System.out.println("Silencing mobile phones.");
			System.out.println("taking seats");
			jp.proceed();
			System.out.println("clap clap clap!!");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("demaning refunds");
		}
		System.out.println("Finally");
	}
	
//	@Before("playPointcut()") //These are called Pointcut expressions
//	public void SilenceMobile() { //These are called advice
//		System.out.println("Silencing the mobile phones.");
//	}
//	
//	@Before("playPointcut()")
//	public void takeSeats() {
//		System.out.println("Taking seats.");
//	}
//	
//	@AfterReturning("playPointcut()")
//	public void applaud() {
//		System.out.println("Clap clap clap!!");
//	}
//	@AfterThrowing("playPointcut()")
//	public void demandRefund() {
//		System.out.println("Demanding refund for tickets.");
//	}
	
	
}
