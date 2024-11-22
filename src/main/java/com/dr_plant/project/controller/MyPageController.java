package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dr_plant.project.entity.CusTb;
import com.dr_plant.project.entity.IntLocTb;
import com.dr_plant.project.mapper.CustomerMapper;
import com.dr_plant.project.mapper.IntLocMapper;


@Controller
public class MyPageController {
	
    @Autowired
    private CustomerMapper customerMapper;
    
    @Autowired
    private IntLocMapper intLocMapper;
    

	
	//마이페이지(/mypage)
	@GetMapping("/mypage")
	public String mypageForm(
			@RequestParam(value = "cusId", required = false) String cusId, 
			Model model) {
		System.out.println("//mypage//");
		if (cusId != null) {
            CusTb customer = customerMapper.findBycusId(cusId);
            if (customer != null) {
                model.addAttribute("alarmAgree", customer.getALARM_AGREE());
            }
            List<IntLocTb> locationList = intLocMapper.findBycusIdWithRegionName(cusId);
            model.addAttribute("locationList", locationList);
            model.addAttribute("cusId", cusId);
        }
		return "mypage/mypageForm"; 
	}
	
	@PostMapping("/updateAlarmAgree")
	@ResponseBody
	public String updateAlarmAgree(@RequestParam("cusId") String cusId, @RequestParam("alarmAgree") Integer alarmAgree) {
	    CusTb customer = customerMapper.findBycusId(cusId);
	    if (customer != null) {
	        customer.setALARM_AGREE(alarmAgree);
	        customerMapper.updateCustomerAlarmAgree(customer); // 업데이트 쿼리 실행
	        return "success";
	    }
	    return "fail";
	}
	
	@PostMapping("/deleteLocation")
	@ResponseBody
	public String deleteLocation(@RequestParam("locId") Integer locId) {
	    try {
	        intLocMapper.deleteByLocId(locId); // 삭제 메서드 호출
	        return "success";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "fail";
	    }
	}
	
	@PostMapping("/registerLocation")
	@ResponseBody
	public String registerLocation(
	        @RequestParam("locNick") String locNick,
	        @RequestParam("devId") String devId,
	        @RequestParam("rgnId") String rgnId,
	        @RequestParam("cusId") String cusId) {
	    try {
	        IntLocTb newLocation = new IntLocTb();
	        newLocation.setLOC_NICK(locNick);
	        newLocation.setDEV_ID(devId);
	        newLocation.setRGN_ID(rgnId);
	        newLocation.setCUS_ID(cusId);

	        intLocMapper.insertLocation(newLocation); // 삽입 메서드 호출
	        return "success";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "fail";
	    }
	}
}