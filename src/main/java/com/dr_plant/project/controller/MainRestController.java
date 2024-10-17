package com.dr_plant.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dr_plant.project.entity.CmCodeTb;
import com.dr_plant.project.mapper.CmCodeMapper;
import com.dr_plant.project.mapper.SensorDataMapper;


@RestController
@RequestMapping("/api")
public class MainRestController {
	
	@Autowired
	SensorDataMapper sensorDataMapper;
	
	@Autowired
	CmCodeMapper cmCodeMapper;

	@GetMapping("/restTest")
	public String main() {
		return "test";
	}
	
	@GetMapping("/dbTest")
	public ArrayList<CmCodeTb> selectAllCode() {
		ArrayList<CmCodeTb> result = cmCodeMapper.select();
		return result;
	}
}
