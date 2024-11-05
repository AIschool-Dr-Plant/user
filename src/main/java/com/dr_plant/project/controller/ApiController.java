package com.dr_plant.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dr_plant.project.entity.SnsrDataTb;
import com.dr_plant.project.mapper.SensorDataMapper;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	SensorDataMapper sensorDataMapper;

	@GetMapping("/restTest")
	public String main() {
		return "test";
	}

	@GetMapping("/dbTest")
	public ArrayList<SnsrDataTb> selectAllCode() {
		ArrayList<SnsrDataTb> result = sensorDataMapper.select();
		result.get(0).setModId("test");
		return result;
	}

	@GetMapping("/kakaoLogin")
	public void kakaoLogin(@RequestParam("code") String code, @RequestParam("state") String state, HttpServletResponse response) {

		Cookie cookie = new Cookie("authorize-access-token", code);
		cookie.setMaxAge(1 * 60 * 60); // 1시간 동안 유지
		cookie.setPath("/"); // 쿠키의 유효 경로
		cookie.setHttpOnly(false); // 클라이언트 자바스크립트에서 접근할 수 없도록 설정 (보안 목적)
		response.addCookie(cookie); // 쿠키 추가

		// 리다이렉트 설정
		response.setStatus(HttpServletResponse.SC_FOUND); // 302 리다이렉트
		response.setHeader("Location", "/kakao/me2"); // 리다이렉트할 URL 설정
	}

}
