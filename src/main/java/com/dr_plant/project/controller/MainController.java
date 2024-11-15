package com.dr_plant.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MainController {
	

    
    // 메인 페이지 요청
    @GetMapping("/main")
    public String main(Model model) {
        System.out.println("//main//");
        

        return "main/main";
    }  
    


}

