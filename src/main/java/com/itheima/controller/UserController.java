package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：zhangrr
 * @date ：Created in 2021/1/31 17:05
 * @description：
 * @modified By：
 * @version:
 */
@Controller
public class UserController {
    @Autowired UserMapper  userMapper;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryList(){
      return  userMapper.queryUserList();
    }
}
