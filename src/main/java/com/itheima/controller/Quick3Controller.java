package com.itheima.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：zhangrr
 * @date ：Created in 2021/1/20 21:39
 * @description：
 * @modified By：
 * @version:
 */

@Controller
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {

    private String name;
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick1() {
        return "name:"+name+"addr:"+addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}
