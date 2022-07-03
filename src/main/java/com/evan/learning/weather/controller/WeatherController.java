package com.evan.learning.weather.controller;

import com.evan.learning.weather.service.WeatherService;
import com.evan.learning.weather.service.impl.WeatherServiceImpl;
import com.evan.learning.weather.vo.ForecastApiVo;
import com.evan.learning.weather.vo.WeatherApiVo;
import com.evan.learning.weather.vo.WeatherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    WeatherServiceImpl weatherService;

    @GetMapping(value = "/findByCityId", produces = "application/json")
    public WeatherApiVo findByCityId(@RequestParam(required = true, name = "cityId") Integer cityId){
        return weatherService.findWeatherByCityId(cityId);
    }

    @GetMapping(value = "/dailyForecast", produces = "application/json")
    public ForecastApiVo dailyForecast(@RequestParam(required = true, name = "lat") String lat,
                                       @RequestParam(required = true, name = "lon") String lon) {
        return weatherService.dailyForecast(lat, lon);
    }
}
