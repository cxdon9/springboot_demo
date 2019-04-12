package com.baizhi.controller;

import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("select")
    @ResponseBody
    public Map select(){
        return userService.select();
    }
    @RequestMapping("select2")
    public String select(ModelMap modelMap){
        List list = userService.selectAll();
        modelMap.addAttribute("list",list);
        return "index";
    }
}
