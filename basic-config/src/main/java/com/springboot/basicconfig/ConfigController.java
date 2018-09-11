package com.springboot.basicconfig;

import com.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//注解相当于@ResponseBody ＋ @Controller合在一起的作用。
public class ConfigController {

    @Autowired
    private User user;

    @RequestMapping("/getUser")
    public String testConfig(){
        return user.getUsername()+","+user.getPassword()+","+user.getAge();
    }
}
