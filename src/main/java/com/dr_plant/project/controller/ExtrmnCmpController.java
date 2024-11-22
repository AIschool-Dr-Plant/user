package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dr_plant.project.entity.ExtrmnCmpTb;
import com.dr_plant.project.mapper.ExtrmnCmpMapper;


@Controller
public class ExtrmnCmpController {
	
    @Autowired
    private ExtrmnCmpMapper extrmnCmpMapper;
	
	//방제업체리스트(/ExtrmnCmp)
	@GetMapping("/extrmncmp")
	public String extrmnCmp(
			@RequestParam(
					value = "cusId", required = false) String cusId, 
					@RequestParam(defaultValue = "1") int companyPage,
					Model model) {
		System.out.println("//ExtrmnCmp//");
		if (cusId != null) {
	        model.addAttribute("cusId", cusId);
	    }
		
		// New logic for ExtrmnCmpTb pagination
        int companyPageSize = 5;
        int companyOffset = (companyPage - 1) * companyPageSize;
        int companyTotalCount = extrmnCmpMapper.getTotalCompanyCount();
        int companyTotalPages = (int) Math.ceil((double) companyTotalCount / companyPageSize);

        List<ExtrmnCmpTb> companyData = extrmnCmpMapper.getPaginatedData(companyOffset, companyPageSize);
        model.addAttribute("companyData", companyData);
        model.addAttribute("companyCurrentPage", companyPage);
        model.addAttribute("companyTotalPages", companyTotalPages);
		
		return "extrmnCmp/extrmnCmp"; 
	}
	
}