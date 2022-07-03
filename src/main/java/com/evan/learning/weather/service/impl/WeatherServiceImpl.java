package com.evan.learning.weather.service.impl;

import com.evan.learning.weather.service.WeatherService;
import com.evan.learning.weather.vo.ForecastApiVo;
import com.evan.learning.weather.vo.WeatherApiVo;
import com.evan.learning.weather.vo.WeatherVo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public WeatherApiVo findWeatherByCityId(Integer cityId) {
        RestTemplate restTemplate = new RestTemplate();
        String weatherUrl = "https://openweathermap.org/data/2.5/weather?id="+ cityId +"&appid=439d4b804bc8187953eb36d2a8c26a02";
        WeatherApiVo weatherApiVo = restTemplate.getForObject(weatherUrl, WeatherApiVo.class);
        return weatherApiVo;
    }

    @Override
    public ForecastApiVo dailyForecast(String lat, String lon) {
        RestTemplate restTemplate = new RestTemplate();
        String weatherUrl = "https://openweathermap.org/data/2.5/onecall?lat="+ lat + "&lon="+ lon + "&appid=439d4b804bc8187953eb36d2a8c26a02";
        ForecastApiVo forecastApiVo = restTemplate.getForObject(weatherUrl, ForecastApiVo.class);
        return forecastApiVo;
    }

}
