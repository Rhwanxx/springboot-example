package com.springboot.springbootfreemarker;

import com.springboot.domain.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 13:39
 */
@Controller
public class FreeMarkerController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/findCity",method = RequestMethod.GET)
    public City findByName(String cityName){
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/findAll")
    public String findByName(Model model){
        List<City> cityList = cityService.findCity();
        model.addAttribute("cityList",cityList);
        return "cityList";
    }
}
