package com.spring.aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.basics.config.PerformanceConfig;

public class PerformanceApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerformanceConfig.class);
		Performance performance = (Performance) context.getBean(Performance.class);
		performance.perform(50000);
	}
}
