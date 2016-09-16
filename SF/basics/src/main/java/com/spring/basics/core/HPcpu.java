package com.spring.basics.core;

import org.springframework.stereotype.Component;

@Component
public class HPcpu implements CPU{

	public void cpuConfiguration(){
		System.out.println("Ram : 6gb ; Hard-drive : 500gb");
	}
}
