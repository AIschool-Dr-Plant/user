package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/main")
	public String test() {
		System.out.println("/main/index");
		return "/main/main";
	}
	
	@GetMapping("/main/tables")
	public String login() {
		System.out.println("/main/tables");
		return "/main/tables";
	}
	
}
