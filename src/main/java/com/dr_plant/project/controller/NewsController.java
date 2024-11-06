package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NewsController {
	
	//농업뉴스(/News)
	@GetMapping("/news")
	public String news(
			@RequestParam(value = "cusId", required = false) String cusId, 
			Model model) {
		System.out.println("//mypage//");
		if (cusId != null) {
	        model.addAttribute("cusId", cusId);
	    }
		return "/news/news"; 
	}
	
}