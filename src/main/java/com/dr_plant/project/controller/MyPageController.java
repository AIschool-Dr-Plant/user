package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyPageController {
	
	//마이페이지(/mypage)
	@GetMapping("/mypage")
	public String signupForm() {
		System.out.println("//mypage//");
		return "/mypage/mypageForm"; // signupForm.html 반환
	}
	
}