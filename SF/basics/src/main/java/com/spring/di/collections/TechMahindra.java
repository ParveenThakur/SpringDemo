package com.spring.di.collections;

import org.springframework.stereotype.Component;

@Component("techMahindra")
public class TechMahindra implements Company{

	public String toString(){
		return "Tech Mahindra Private Limited";
	}
}
