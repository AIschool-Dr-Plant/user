package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dr_plant.project.entity.NewsTb;
import com.dr_plant.project.mapper.NewsMapper;


@Controller
public class NewsController {
	
    @Autowired
    private NewsMapper newsMapper;
    
	
	//농업뉴스(/News)
    @GetMapping("/news")
    public String news(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "cusId", required = false) String cusId, 
            Model model) {
        int pageSize = 10;
        int offset = (page - 1) * pageSize;
        int maxPagesToShow = 5; // Number of pages to show at a time

        // Fetch news items
        List<NewsTb> news = newsMapper.findNewsByPage(offset, pageSize);
        int totalNewsCount = newsMapper.countTotalNews();
        int totalPages = (int) Math.ceil((double) totalNewsCount / pageSize);

        // Calculate the start and end page for the pagination range
        int startPage = Math.max(1, page - maxPagesToShow / 2);
        int endPage = Math.min(totalPages, startPage + maxPagesToShow - 1);
        if (endPage - startPage < maxPagesToShow - 1) {
            startPage = Math.max(1, endPage - maxPagesToShow + 1);
        }

        model.addAttribute("News", news);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);

        if (cusId != null) {
            model.addAttribute("cusId", cusId);
        }
        
        return "news/news";
    }
	
}