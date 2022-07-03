package com.evan.learning.weather.service;

import com.evan.learning.weather.vo.ForecastApiVo;
import com.evan.learning.weather.vo.WeatherApiVo;
import com.evan.learning.weather.vo.WeatherVo;

import java.io.Serializable;

public interface WeatherService extends Serializable {
    WeatherApiVo findWeatherByCityId (Integer cityId);
    ForecastApiVo dailyForecast (String lat, String lon);
}
