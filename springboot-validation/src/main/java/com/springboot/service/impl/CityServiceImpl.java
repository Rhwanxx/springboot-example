package com.springboot.service.impl;

import com.springboot.dao.CityMapper;
import com.springboot.domain.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 11:43
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City findCityByName(String cityName) {
        return cityMapper.findCityByName(cityName);
    }
}
