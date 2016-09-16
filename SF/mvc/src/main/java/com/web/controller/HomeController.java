package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.module.company.Company;

@Controller
@RequestMapping("/")
public class HomeController {

	private List<Company> companyList;
	
	@Autowired
	public HomeController(List<Company> companyList) {
		this.companyList = companyList;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/model",method=RequestMethod.GET)
	public String setListOnHome(Model model){
		model.addAttribute("companyLst", companyList);
		return "homewithmodel";
	}
	
	@RequestMapping(value="/fetchSingleCompany/{day}",method=RequestMethod.GET)
	public String fetchSingleCompany(@PathVariable("day") String day,@RequestParam("company_id") int compannyId,ModelMap modelMap){
		modelMap.addAttribute("company",companyList.get(compannyId));
		modelMap.addAttribute("day", day);
		return "desiredcompanylst";
	}
}
