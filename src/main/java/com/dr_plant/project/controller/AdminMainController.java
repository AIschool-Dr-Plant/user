package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminMainController {	
	@GetMapping("/adminmain")
	public String adminmain() {
		System.out.println("//adminmain//");
		return "admin/admin_main";
	}
	
}
