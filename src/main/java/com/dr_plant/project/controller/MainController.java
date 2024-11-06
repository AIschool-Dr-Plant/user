package com.dr_plant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dr_plant.project.entity.ExtrmnCmpTb;
import com.dr_plant.project.entity.IntLocTb;
import com.dr_plant.project.entity.NajuWeatherTb;
import com.dr_plant.project.entity.NewsTb;
import com.dr_plant.project.entity.TemPestTb;
import com.dr_plant.project.mapper.ExtrmnCmpMapper;
import com.dr_plant.project.mapper.ImageService;
import com.dr_plant.project.mapper.IntLocMapper;
import com.dr_plant.project.mapper.NajuWeatherMapper;
import com.dr_plant.project.mapper.NewsMapper;
import com.dr_plant.project.mapper.TemPestMapper;


@Controller
public class MainController {
	
    @Autowired
    private IntLocMapper intLocMapper;
    
    @Autowired
    private TemPestMapper temPestMapper;
    
    @Autowired
    private ExtrmnCmpMapper extrmnCmpMapper;
    
    @Autowired
    private NewsMapper newsMapper;
    
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private NajuWeatherMapper najuWeatherMapper;
    
    @GetMapping("/main")
    public String main(Model model) {
        System.out.println("//main//");
        
        if (model.containsAttribute("cusId")) {
            String cusId = (String) model.getAttribute("cusId");
            model.addAttribute("cusId", cusId);
            
            List<IntLocTb> intLocList = intLocMapper.findBycusId(cusId);
            if (!intLocList.isEmpty()) {
                model.addAttribute("intLocList", intLocList);
                model.addAttribute("locNickList", intLocList.stream().map(IntLocTb::getLOC_NICK).toList());
            } else {
                model.addAttribute("error_IntLoc", "등록된 위치 정보가 없습니다.");
            }
        } else {
            model.addAttribute("error_cusId", "사용자 정보를 찾을 수 없습니다.");
        }
        
        // Fetch the latest news items
        List<NewsTb> latestNews = newsMapper.findLatestNews();
        // Fetch and set image URLs for each news item
        latestNews.forEach(news -> {
            imageService.extractImageUrl(news.getURL()).ifPresent(news::setImageUrl);
        });

        model.addAttribute("latestNews", latestNews);
        
        // Fetch the latest weather data
        List<NajuWeatherTb> latestWeatherData = najuWeatherMapper.findLatestWeatherData();
        model.addAttribute("latestWeatherData", latestWeatherData);

        return "main/main";
    }  
    
    // locNick을 바탕으로 RGN_ID를 얻어서 temPest테이블의 최신값을 불러오기
    @GetMapping("/getPestData")
    @ResponseBody
    public List<TemPestTb> getPestData(@RequestParam String locNick) {
        IntLocTb location = intLocMapper.findByLocNick(locNick).orElse(null);
        if (location != null) {
            return temPestMapper.findByRgnId(location.getRGN_ID());
        }
        return List.of();
    }
    //locNick을 바탕으로 RGN_ID를 얻어서 ExtrmnCmp테이블의 값을 불러오기
    @GetMapping("/getCompanies")
    @ResponseBody
    public List<ExtrmnCmpTb> getCompanies(@RequestParam String locNick) {
        IntLocTb location = intLocMapper.findByLocNick(locNick).orElse(null);
        if (location != null) {
            return extrmnCmpMapper.findByrgnId(location.getRGN_ID());
        }
        return List.of();
    }

}

