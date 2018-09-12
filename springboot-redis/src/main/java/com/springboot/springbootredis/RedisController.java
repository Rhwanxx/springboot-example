package com.springboot.springbootredis;

import com.springboot.domain.UserInfo;
import com.springboot.service.RedisBootService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/12 10:48
 */
@RestController
public class RedisController {

    @Autowired
    private RedisBootService redisBootService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<UserInfo> getAllUser(){
        return redisBootService.getAllUser();
    }

    @RequestMapping(value = "/getAll/{userId}")
    public UserInfo getAllUser(@PathVariable("userId")int userId){//@PathVariable 该注解可以将URL中的userId占位符绑定到入参中
        return redisBootService.getUserById(userId);
    }

}
