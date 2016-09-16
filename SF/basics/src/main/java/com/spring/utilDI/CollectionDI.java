package com.spring.utilDI;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class CollectionDI {

	Vector<Fruit> fruits;
	
	HashSet<Cricketer> cricketers;
	
	Hashtable<String,String>  countryCapMap;
	
	public CollectionDI(Vector<Fruit> fruits){
		this.fruits = fruits;
	}

	public void setCricketers(HashSet<Cricketer> cricketers) {
		this.cricketers = cricketers;
	}

	public void setCountryCapMap(Hashtable<String, String> countryCapMap) {
		this.countryCapMap = countryCapMap;
	}

	public void startPrinting() {
		for(Fruit f : fruits){
			System.out.println(f.toString());
		}
		for(Cricketer c : cricketers){
			System.out.println(c.toString());
		}
		Iterator itr = countryCapMap.keySet().iterator();
		while(itr.hasNext()){
			String key = (String)itr.next();
			System.out.println(key+": "+countryCapMap.get(key));
		}
	}
	
	
}
