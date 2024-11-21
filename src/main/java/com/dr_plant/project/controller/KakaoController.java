package com.dr_plant.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dr_plant.project.util.CommonUtil;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/kakao")
public class KakaoController {

	@Autowired
	CommonUtil util;
	
	@GetMapping("/map")
	public String map() {
		return "kakao/map"; // kakaomap.html 템플릿을 반환
	}

	@GetMapping("/message")
	public String message() {
		return "kakao/message"; // kakaotok.html 템플릿을 반환
	}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {

		String code = request.getParameter("code");
		String state = request.getParameter("state");
		
		response.addCookie(util.setCookie("kakao-token", code)); // 쿠키 추가
		response.addCookie(util.setCookie("state", state)); // 쿠키 추가
		
		
		return "kakao/message"; // kakaotok.html 템플릿을 반환
	}
}
