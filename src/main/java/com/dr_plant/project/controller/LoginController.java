package com.dr_plant.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dr_plant.project.entity.CusTb;
import com.dr_plant.project.entity.ManagerTb;
import com.dr_plant.project.mapper.CustomerMapper;
import com.dr_plant.project.mapper.ManagerMapper;

@Controller
public class LoginController {
    // CusTb에 대한 매퍼 호출
    @Autowired
    private CustomerMapper customerMapper;
    
    // ManagerTb에 대한 매퍼 호출
    @Autowired
    private ManagerMapper managerMapper;

    // 로그인(login) 폼
    @GetMapping("/login")
    public String loginForm() {
        System.out.println("//login//");
        return "/login/loginForm"; // loginForm.html 반환
    }

    // 로그인 처리
    @PostMapping("/login")
    public String login(
            @RequestParam("cusId") String cusId, // 고객 아이디 파라미터
            @RequestParam("cusPw") String cusPw, // 고객 비밀번호 파라미터
            @RequestParam(value = "adminLogin", required = false) Boolean adminLogin, // 관리자 로그인 여부 파라미터
            Model model, // 모델 객체
            RedirectAttributes redirectAttributes) { // 리다이렉트 속성 객체

        System.out.println(cusId);
        System.out.println(cusPw);

        // 관리자 로그인 처리
        if (adminLogin != null && adminLogin) {
            ManagerTb manager = managerMapper.findBymanagerId(cusId);
            if (manager != null && manager.getMGR_PW().equals(cusPw)) {
                redirectAttributes.addFlashAttribute("cusId", cusId);
                // 로그인 성공 시 관리자 메인 페이지로 리다이렉트
                return "redirect:adminmain";
            } else {
                // 관리자 로그인 실패 시 에러 메시지 설정 및 로그인 페이지로 이동
                model.addAttribute("error", "잘못된 관리자 이름 또는 비밀번호입니다.");
                return "login/loginForm";
            }
        } else {
            // 일반 사용자 로그인 처리
            CusTb customer = customerMapper.findBycusId(cusId);
            
            if (customer != null && cusPw.equals(customer.getCUS_PW())) {
                redirectAttributes.addFlashAttribute("cusId", cusId);
                // 로그인 성공 시 메인 페이지로 리다이렉트
                return "redirect:main";
            } else {
                // 사용자 로그인 실패 시 에러 메시지 설정 및 로그인 페이지로 이동
                model.addAttribute("error", "잘못된 사용자 이름 또는 비밀번호입니다.");
                return "login/loginForm";
            }
        }
    }

    // 회원가입(signup) 폼
    @GetMapping("/login/signup")
    public String signupForm() {
        System.out.println("//signup//");
        return "/login/signupForm"; // signupForm.html 반환
    }

    // 아이디 찾기(findid) 폼
    @GetMapping("/login/findid")
    public String findidForm() {
        System.out.println("//findid//");
        return "/login/findidForm"; // findidForm.html 반환
    }

    // 새 비밀번호 설정(newpw) 폼
    @GetMapping("/login/newpw")
    public String newpw() {
        System.out.println("//newpw//");
        return "/login/newpwForm"; // newpwForm.html 반환
    }
}
