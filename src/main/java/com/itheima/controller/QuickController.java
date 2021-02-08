package com.itheima.controller;


import com.itheima.domain.ResultMap;
import com.itheima.domain.UserModel;
import com.itheima.mapper.UserMapper;
import com.itheima.services.UserServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@Api(description = "数据用户接口")
@RestController
@RequestMapping("/quickController")
public class QuickController {
    @Qualifier("user1")
    @Autowired
    private UserServices userServices;


    @ApiOperation(value = "查询用户列表" ,  notes="新增注册")
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    @ResponseBody
    public ResultMap quick(){

//    return "hello SpringBoot";
        UserModel userModel=new UserModel("1","张然然","安徽亳州");
        ResultMap rm=new ResultMap(userModel,300,"ok");
        return rm;
    }

    @RequestMapping(value = "/quick5",method = RequestMethod.GET)
    @ResponseBody
    public  String quick5()
    {
        return  userServices.getStr1("zrr");
    }



}
