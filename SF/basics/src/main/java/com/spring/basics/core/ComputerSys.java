package com.spring.basics.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerSys {

	private CPU cpu;
	
	@Autowired
	public void setCpu(CPU cpu){
		this.cpu = cpu;
	}
	
	public void getSysConfig(){
		cpu.cpuConfiguration();
	}
}
