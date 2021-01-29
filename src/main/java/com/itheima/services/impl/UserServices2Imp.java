package com.itheima.services.impl;

import com.itheima.services.UserServices;
import org.springframework.stereotype.Service;

@Service("user2")
public class UserServices2Imp implements UserServices {

    @Override
    public String getStr(String str) {
        return  null;//"userServices2Imp:"+str;
    }

    @Override
    public String getStr1(String str) {
        return "userServices2Imp:getStr1"+str;
    }
}
