package com.itheima.services.impl;

import com.itheima.services.UserServices;
import org.springframework.stereotype.Service;

@Service("user1")
public class UserServices1Imp implements UserServices {
    @Override
    public String getStr(String str) {
        return null;
    }

    @Override
    public String getStr1(String str) {
        return "userServices1Imp "+str;
    }
}
