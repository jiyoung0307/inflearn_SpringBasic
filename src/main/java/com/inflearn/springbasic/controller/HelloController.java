package com.inflearn.springbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Controller에 있는 data 키 값을 통해서 지금 이 글이 보이는 겁니다!!");
        return "hello";
    }
}
