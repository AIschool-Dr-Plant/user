package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dr_plant.project.entity.SnsrDataTb;
import com.dr_plant.project.mapper.IntLocMapper;
import com.dr_plant.project.mapper.SensorDataMapper;
 

@Controller
public class DeviceDetailController {
	
    @Autowired
    private IntLocMapper intLocMapper;

    @Autowired
    private SensorDataMapper sensorDataMapper;
    
    // 환경정보수집장치 상세보기
    @GetMapping("/devicedetail")
    public String deviceDetail(
    		Model model,
    		@RequestParam("cusId") String cusId) {
    	
        System.out.println("//devicedetail//");
        
        model.addAttribute("cusId", cusId);
        
        List<String> locNickList = intLocMapper.findLocNickByCusId(cusId);
        model.addAttribute("locNickList", locNickList);
        
        return "/device/deviceDetail"; // signupForm.html 반환
    }
    
    @GetMapping("/getDeviceData")
    @ResponseBody
    public List<SnsrDataTb> getDeviceData(@RequestParam("locNick") String locNick) {
        String devId = intLocMapper.findDevIdByLocNick(locNick);
        return sensorDataMapper.findSnsrDataByDevId(devId);
    }
}

