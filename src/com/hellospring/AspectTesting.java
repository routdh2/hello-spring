package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig;

public class AspectTesting {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Tanmay tanmay = context.getBean("tanmay", Tanmay.class);
//		tanmay.play();
		for(int i=0;i<5;i++) {
			tanmay.playTrack((int)(Math.random()*10));
		}

	}

}
