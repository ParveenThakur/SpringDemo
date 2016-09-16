package com.spring.di.collections;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ITPark {

	@Autowired
	List<Company> company;

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}
	
	public void getCompanies(){
		for(Company c : company){
			System.out.println(c.toString());
		}
	}
	
	/*@Autowired
	Map<Integer,Company> companyMap;
	
	public void setCompanyMap(Map<Integer,Company> companyMap){
		this.companyMap = companyMap;
	}
	
	public void getCompanyMap(){
		for(Map.Entry entrySet : companyMap.entrySet() ){
			System.out.println(entrySet.getKey()+":"+entrySet.getValue());
		}
	}*/
}
