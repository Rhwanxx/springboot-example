package com.springboot.springbootelasticsearch;

import com.springboot.domain.UserInfo;
import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/13 15:58
 */

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String createCity(@RequestBody UserInfo userInfo) {
        return userInfoService.saveUserIfo(userInfo);
    }

}
