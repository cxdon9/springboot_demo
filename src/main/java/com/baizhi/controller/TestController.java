package com.baizhi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("test")
public class TestController {

    //@ResponseBody
    @RequestMapping("test")
    public String test(HttpSession session){
        session.setAttribute("a","aaa");
        return "Hello World!";
    }
}
