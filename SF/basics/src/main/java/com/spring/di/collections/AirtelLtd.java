package com.spring.di.collections;

import org.springframework.stereotype.Component;

@Component("airtelltd")
public class AirtelLtd implements Company{

	public String toString(){
		return "Airtel Private Limited";
	}
}
