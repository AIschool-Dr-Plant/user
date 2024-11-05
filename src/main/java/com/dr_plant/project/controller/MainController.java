package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

	@GetMapping("/")
	public String test() {
		System.out.println("/main/index");
		return "main";
	}

	@GetMapping("/tables")
	public String login() {
		System.out.println("/main/tables");
		return "tables";
	}

}
