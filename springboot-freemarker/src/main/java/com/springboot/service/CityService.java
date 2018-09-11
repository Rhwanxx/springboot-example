package com.springboot.service;

import com.springboot.domain.City;

import java.util.List;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 11:42
 */
public interface CityService {
    City findCityByName(String cityName);

    List<City> findCity();
}
