package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dr_plant.project.entity.DevTb;
import com.dr_plant.project.entity.IntLocTb;
import com.dr_plant.project.entity.SnsrDataTb;
import com.dr_plant.project.mapper.DeviceMapper;
import com.dr_plant.project.mapper.IntLocMapper;
import com.dr_plant.project.mapper.SensorDataMapper;
import com.dr_plant.project.mapper.VeiwRgnMapper;
 

@Controller
public class DeviceDetailController {
	
    @Autowired
    private IntLocMapper intLocMapper;

    @Autowired
    private SensorDataMapper sensorDataMapper;
    
    @Autowired
    private DeviceMapper deviceMapper;
    
    @Autowired
    private VeiwRgnMapper veiwRgnMapper;
    
    // 환경정보수집장치 상세보기
    @GetMapping("/devicedetail")
    public String deviceDetail(
    		Model model,
    		@RequestParam("cusId") String cusId) {
    	
        System.out.println("//devicedetail//");
        
        model.addAttribute("cusId", cusId);
        
        List<String> locNickList = intLocMapper.findLocNickByCusId(cusId);
        model.addAttribute("locNickList", locNickList);
        
        return "device/deviceDetail"; // signupForm.html 반환
    }
    
    @GetMapping("/getDeviceData")
    @ResponseBody
    public List<SnsrDataTb> getDeviceData(@RequestParam("locNick") String locNick) {
        String devId = intLocMapper.findDevIdByLocNick(locNick);
        return sensorDataMapper.findSnsrDataByDevId(devId);
    }
    
    @GetMapping("/getDeviceInfo")
    @ResponseBody
    public DevTb getDeviceInfo(@RequestParam("locNick") String locNick) {
        String devId = intLocMapper.findDevIdByLocNick(locNick);
        System.out.println("Fetched devId: " + devId);
        DevTb device = deviceMapper.findDeviceByDevId(devId);
        System.out.println("Fetched device: " + device);
        return device;
    }
    
    @GetMapping("/getLocNickAndCusId")
    @ResponseBody
    public IntLocTb getLocNickAndCusId(@RequestParam("locNick") String locNick) {
    	IntLocTb intLocTb = intLocMapper.findLocNickAndCusIdByLocNick(locNick);
    	 if (intLocTb != null) {
             String rgnNm = veiwRgnMapper.findRgnNmByRgnId(intLocTb.getRGN_ID());
             intLocTb.setRGN_NM(rgnNm); // Overwrite RGN_ID with RGN_NM for display purposes
         }
    	 return intLocTb;
    } 
}

