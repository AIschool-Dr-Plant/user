package com.dr_plant.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dr_plant.project.entity.SnsrDataTb;
import com.dr_plant.project.mapper.SensorDataMapper;

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
	public void kakaoLogin(@RequestParam String code, @RequestParam String state, HttpServletResponse response) {

		// 리다이렉트 설정
		response.setStatus(HttpServletResponse.SC_FOUND); // 302 리다이렉트
		response.setHeader("Location", "/kakao/me"); // 리다이렉트할 URL 설정
	}

}
