package com.evan.learning.weather.vo;

import sun.applet.Main;

import java.io.Serializable;
import java.util.List;

public class WeatherApiVo implements Serializable {
    private Integer id;
    private String name;
    private Integer timezone;
    private CoordVo coord;
    private MainVo main;
    private List<WeatherVo> weather;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public CoordVo getCoord() {
        return coord;
    }

    public void setCoord(CoordVo coord) {
        this.coord = coord;
    }

    public MainVo getMain() {
        return main;
    }

    public void setMain(MainVo main) {
        this.main = main;
    }

    public List<WeatherVo> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherVo> weather) {
        this.weather = weather;
    }
}
