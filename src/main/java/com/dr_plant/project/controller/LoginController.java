package com.dr_plant.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dr_plant.project.entity.CusTb;
import com.dr_plant.project.mapper.CustomerMapper;



@Controller

public class LoginController {
	//CusTb에 대한 mapper호출
    @Autowired
    private CustomerMapper customerMapper;
    
    //로그인(login)관련
	@GetMapping("/login")
	public String loginForm() {
		System.out.println("//login//");
		return "/login/loginForm"; // loginForm.html 반환
	}
	@PostMapping("/login")
	public String login(@RequestParam String cusId, @RequestParam String cusPw, Model model) {
		System.out.println(cusId);
		System.out.println(cusPw);
		CusTb customer=customerMapper.findBycusId(cusId);
		if (customer != null && customer.getCUS_PW().equals(cusPw)) {
			model.addAttribute("cusId", cusId);
			return "/main/main";
		}else {
			model.addAttribute("error", "잘못된 사용자 이름 또는 비밀번호입니다.");
            return "/login/loginForm"; // 로그인 실패 시 다시 login 페이지
		}
	}
	
	//회원가입(signup)관련
	@GetMapping("/login/signup")
	public String signupForm() {
		System.out.println("//signup//");
		return "/login/signupForm"; // signupForm.html 반환
	}
	
	//아이디찾기(findid)관련
	@GetMapping("/login/findid")
	public String findidForm() {
		System.out.println("//findid//");
		return "/login/findidForm"; // findidForm.html 반환
	}
	
	//새 비밀번호 설정(newpw)관련
	@GetMapping("/login/newpw")
	public String newpw() {
		System.out.println("//newpw//");
		return "/login/newpwForm"; // newpwForm.html 반환
	}
}