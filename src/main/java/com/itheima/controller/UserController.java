package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：zhangrr
 * @date ：Created in 2021/1/31 17:05
 * @description：
 * @modified By：
 * @version:
 */
@Controller
/*@RequestMapping("/menglongdeyeController")*/
@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class UserController {
    @Autowired UserMapper  userMapper;

   /* http://localhost:8088/queryListUser*/

    @ApiOperation(value = "查询用户列表" ,  notes="新增注册")
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
    @ApiOperation(value = "删除用户信息" ,  notes="新增注册")
    @RequestMapping(value = "deleteUser/{id}",method = RequestMethod.GET)
    public Boolean delete(@PathVariable("id") Integer id){
          userMapper.delete(id);
          return true;
    }


    @RequestMapping(value = "saveUser",method = RequestMethod.GET)
/*    @ApiOperation(value="单独一个入参测试接口save", notes="接口描述，例如：只能输入‘朦胧的夜’save")*/
    public void save(User user ){
          userMapper.insert(user);
    }


    @RequestMapping(value = "updateUser",method = RequestMethod.GET)
/*    @ApiOperation(value="单独一个入参测试接口update", notes="接口描述，例如：只能输入‘朦胧的夜’update")*/
    public void update(User user ){
        userMapper.update(user);
    }
}
