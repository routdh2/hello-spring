package com.hellospring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(** com.hellospring.Player.perform(..))")
	public void loggingAdvice() {
		System.out.println("This is logging advice.");
	}
	
	@After("execution(** com.hellospring.ServerConfig.*(..))")
	public void secondAdvice() {
		System.out.println("This is second Advice.");
	}
	
	@Before("pianoPointcut() && helloSpringPointcut()")
	public void thirdAdvice() {
		System.out.println("This is the third advice.");
	}
	
	@Pointcut("execution(* com.hellospring.Piano.*(..))")
	public void pianoPointcut() {}
	
	@Pointcut("within(com.hellospring.*)")// within is class level whereas execution is method level
	public void helloSpringPointcut() {}

}
