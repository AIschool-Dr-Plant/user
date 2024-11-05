package com.dr_plant.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/main")
	public String test() {
		return "index";
	}
	@RequestMapping("kakao/map")
    public String kakaomap() {
        return "kakaomap";  // kakaomap.html 템플릿을 반환
    }
	
	@RequestMapping("/kakao/me")
    public String kakaome() {
        return "kakaome";  // kakaotok.html 템플릿을 반환
    }
	@RequestMapping("http://123.100.174.98:8180/kakao/me2")
    public String kakaome2() {
        return "help";  // kakaotok.html 템플릿을 반환
    }
	
	

}
