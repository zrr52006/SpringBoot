package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

   /* http://localhost:8088/queryListUser*/
    @RequestMapping(value = "queryListUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryList(){
      return  userMapper.queryUserList();
    }

    /*
     * @PathVariable 可以来映射 URL 中的占位符到目标方法的参数中.
     * @param id
     * @return
     */
    /**@RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable: " + id);
        return SUCCESS;
    }*/
    @RequestMapping(value = "deleteUser/{id}",method = RequestMethod.GET)
    public Boolean delete(@PathVariable("id") Integer id){
          userMapper.delete(id);
          return true;
    }


    @RequestMapping(value = "saveUser",method = RequestMethod.GET)
    public void save(User user ){
          userMapper.insert(user);
    }


    @RequestMapping(value = "updateUser",method = RequestMethod.GET)
    public void update(User user ){
        userMapper.update(user);
    }
}
