package com.dr_plant.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dr_plant.project.entity.SnsrDataTb;
import com.dr_plant.project.mapper.SensorDataMapper;


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
}
