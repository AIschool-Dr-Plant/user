package com.dr_plant.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kakao")
public class KakaoController {

	@GetMapping("/map")
	public String kakaomap() {
		return "kakao/kakaomap"; // kakaomap.html 템플릿을 반환
	}

	@GetMapping("/me")
	public String kakaome() {
		return "kakao/kakaome"; // kakaotok.html 템플릿을 반환
	}

	@GetMapping("/me2")
	public String kakaome2(Model model) {
		
		return "kakao/kakaome"; // kakaotok.html 템플릿을 반환
	}
}
