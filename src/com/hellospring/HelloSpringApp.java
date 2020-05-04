package com.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.JavaConfig;

public class HelloSpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Player dhananjay = context.getBean("player", Player.class);
//		dhananjay.perform();
//		Player player = context.getBean("player", Player.class);
//		player.perform();
//		System.out.println(dhananjay == player);
//		ServerConfig config = context.getBean("serverconfig",ServerConfig.class);
//		System.out.println(config);
//		ServerConfig config2 = context.getBean("serverconfig2",ServerConfig.class);
//		System.out.println(config2);
		
//		SecureStoreAccessApp app = context.getBean("thirdparty",SecureStoreAccessApp.class);
//		app.storeData();
//		app.getData();
//		app.disconnect();
//		context.close();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Player player=context.getBean("player", Player.class);
		player.perform();
		SecureStoreAccessApp app = context.getBean("thirdparty",SecureStoreAccessApp.class);
		app.storeData();
		app.getData();
		app.disconnect();
		ServerConfig config=context.getBean("config",ServerConfig.class);
		System.out.println(config);
		context.close();
		 
	}

}
