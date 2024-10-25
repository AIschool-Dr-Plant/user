package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dr_plant.project.entity.CusTb;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping({"","/"})
	public String login() {
		System.out.println("/login/");
		return "login/loginForm"; // login.html 반환
	}
	
	@PostMapping("/action")
	public void loginAction(@ModelAttribute CusTb cus) {
		System.out.println(cus.toString());
		System.out.println("#!@");
	}
}