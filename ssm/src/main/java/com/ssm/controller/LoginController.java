package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.ISystemService;

@Controller
public class LoginController {

	@Autowired
	ISystemService systemService;
	
	@RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("接收到请求 ，Hello");
        model.addAttribute("pd", "hello world!");
        return "index";
    }
}
