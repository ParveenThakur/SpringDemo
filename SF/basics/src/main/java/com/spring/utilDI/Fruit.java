package com.spring.utilDI;

public class Fruit {

	public String name;
	public Integer quantity;
	public String color;
	
	public Fruit(String name,String color,Integer quantity){
		this.name = name;
		this.color = color;
		this.quantity = quantity;
	}
	
	public String toString(){
		return "Fruit : "+name+" "+color+" "+quantity;
	}
}
