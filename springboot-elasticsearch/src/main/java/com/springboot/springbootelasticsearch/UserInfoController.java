package com.springboot.springbootelasticsearch;

import com.springboot.domain.UserInfo;
import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<UserInfo> searchUser(@RequestParam(value = "pageNumber") Integer pageNumber,//分页信息
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {//关键字
        return userInfoService.searchUser(pageNumber,pageSize,searchContent);
    }
}
