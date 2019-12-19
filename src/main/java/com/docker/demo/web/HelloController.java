package com.docker.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "你好！！！！！！！！！！！！！！！！";
    }

    @RequestMapping(path = {"/page","/"},method = {RequestMethod.GET,RequestMethod.POST})
    public String page(){
        return "index";
    }
}
