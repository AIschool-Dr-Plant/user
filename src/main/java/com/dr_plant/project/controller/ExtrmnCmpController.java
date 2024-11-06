package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ExtrmnCmpController {
	
	//방제업체리스트(/ExtrmnCmp)
	@GetMapping("/extrmncmp")
	public String extrmnCmp(
			@RequestParam(value = "cusId", required = false) String cusId, 
			Model model) {
		System.out.println("//ExtrmnCmp//");
		if (cusId != null) {
	        model.addAttribute("cusId", cusId);
	    }
		return "/extrmnCmp/extrmnCmp"; 
	}
	
}