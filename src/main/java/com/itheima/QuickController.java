package com.itheima;


import com.itheima.domain.ResultMap;
import com.itheima.domain.UserModel;
import com.itheima.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class QuickController {
    @Qualifier("user1")
    @Autowired
    private UserServices userServices;

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
