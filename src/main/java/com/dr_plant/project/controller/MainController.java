package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dr_plant.project.entity.ExtrmnCmpTb;
import com.dr_plant.project.entity.NewsTb;
import com.dr_plant.project.entity.PstFcstTb;
import com.dr_plant.project.mapper.ExtrmnCmpMapper;
import com.dr_plant.project.mapper.NewsMapper;
import com.dr_plant.project.mapper.PstFcstMapper;


@Controller
public class MainController {
	
	@Autowired
    private PstFcstMapper pstFcstMapper;
	
    @Autowired
    private ExtrmnCmpMapper extrmnCmpMapper;
    
    @Autowired
    private NewsMapper newsMapper;
    
    // 메인 페이지 요청
    @GetMapping("/main")
    public String main(
    		Model model, 
    		@RequestParam(defaultValue = "1") int page,
    		@RequestParam(defaultValue = "1") int companyPage,
    		@RequestParam(defaultValue = "KDH") String cusId) {
    	// Existing pest forecast logic
        int pageSize = 6;
        int offset = (page - 1) * pageSize;
        int totalCount = pstFcstMapper.getTotalCount();
        int totalPages = (int) Math.ceil((double) totalCount / pageSize);

        List<PstFcstTb> paginatedData = pstFcstMapper.getPaginatedData(offset, pageSize);
        model.addAttribute("data", paginatedData);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        // New logic for ExtrmnCmpTb pagination
        int companyPageSize = 5;
        int companyOffset = (companyPage - 1) * companyPageSize;
        int companyTotalCount = extrmnCmpMapper.getTotalCompanyCount();
        int companyTotalPages = (int) Math.ceil((double) companyTotalCount / companyPageSize);

        List<ExtrmnCmpTb> companyData = extrmnCmpMapper.getPaginatedData(companyOffset, companyPageSize);
        model.addAttribute("companyData", companyData);
        model.addAttribute("companyCurrentPage", companyPage);
        model.addAttribute("companyTotalPages", companyTotalPages);
        
        //latest 10 news
        List<NewsTb> latestNews = newsMapper.findLatestNews();
        model.addAttribute("latestNews", latestNews);
        
        model.addAttribute("cusId", cusId);
        
        return "main/main";
    }  
}

