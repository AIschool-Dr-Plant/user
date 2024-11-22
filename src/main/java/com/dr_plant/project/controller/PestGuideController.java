package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PestGuideController {
	
	//농업뉴스(/News)
	@GetMapping("/pestguide")
	public String pestGuide(
			@RequestParam(value = "cusId", required = false) String cusId, 
			Model model) {
		System.out.println("//mypage//");
		if (cusId != null) {
	        model.addAttribute("cusId", cusId);
	    }
		return "pestGuide/pestGuide"; 
	}
	
}