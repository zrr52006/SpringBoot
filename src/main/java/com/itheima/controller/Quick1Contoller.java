package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick1Contoller {

    @Value("${name}")
    private String name;
    @Value("${person.addr}")
    private String addr;
    @RequestMapping("/quick1")
    @ResponseBody
    public String quick1() {
        return "name:"+name+"addr:"+addr;
    }

}
