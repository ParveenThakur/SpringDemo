package com.web.module.company;

import org.springframework.stereotype.Component;

@Component("infosys")
public class Infosys implements Company{

	public String toString(){
		return "Infosys Private Limited";
	}
}
