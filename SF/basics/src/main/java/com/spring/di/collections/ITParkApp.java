package com.spring.di.collections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.basics.config.ITParkConfig;

public class ITParkApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ITParkConfig.class);
		ITPark itpark = app.getBean(ITPark.class);
		itpark.getCompanies();
	}
	
}
