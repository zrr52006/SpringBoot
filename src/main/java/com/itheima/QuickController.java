package com.itheima;


import com.itheima.domain.ResultMap;
import com.itheima.domain.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public ResultMap quick(){
//    return "hello SpringBoot";
        UserModel userModel=new UserModel("1","朱振峰","安徽亳州");
        ResultMap rm=new ResultMap(userModel,300,"ok");
        return rm;
    }


}
