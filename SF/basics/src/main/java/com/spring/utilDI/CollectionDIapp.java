package com.spring.utilDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDIapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");
		CollectionDI collection = context.getBean(CollectionDI.class);
		collection.startPrinting();
	}
}
