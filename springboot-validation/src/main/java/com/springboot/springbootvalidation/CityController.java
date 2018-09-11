package com.springboot.springbootvalidation;

import com.springboot.constant.CityErrorEnum;
import com.springboot.constant.GlobalErrorEnum;
import com.springboot.domain.City;
import com.springboot.result.BaseResult;
import com.springboot.result.ErrorService;
import com.springboot.result.GlobalErrorException;
import com.springboot.result.GlobalErrorHandler;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 11:42
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public BaseResult findOneCity(@RequestParam(value = "cityName", required = true) String cityName) throws GlobalErrorException{

        if (StringUtils.isEmpty(cityName)){

            return new BaseResult(CityErrorEnum.PARAMS_NO_COMPLETE);
        }
        return new BaseResult(cityService.findCityByName(cityName));


    }
}
