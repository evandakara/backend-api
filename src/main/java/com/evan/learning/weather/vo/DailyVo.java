package com.evan.learning.weather.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DailyVo implements Serializable {
    private Integer clouds;
    private Double dew_point;
    private Integer dt;
    private FeelsLikeVo feelsLike;
    private Integer humidity;
    private Double moon_phase;
    private Integer moonrise;
    private Integer moonset;
    private Double pop;
    private Integer pressure;
    private Double rain;
    private Integer sunrise;
    private Integer sunset;
    private TempVo temp;
    private Double uvi;
    private List<WeatherVo> weather;
    private Integer windDeg;
    private Double windGust;
    private Double windSpeed;

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Double getDew_point() {
        return dew_point;
    }

    public void setDew_point(Double dew_point) {
        this.dew_point = dew_point;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public FeelsLikeVo getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLikeVo feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(Double moon_phase) {
        this.moon_phase = moon_phase;
    }

    public Integer getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(Integer moonrise) {
        this.moonrise = moonrise;
    }

    public Integer getMoonset() {
        return moonset;
    }

    public void setMoonset(Integer moonset) {
        this.moonset = moonset;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    public TempVo getTemp() {
        return temp;
    }

    public void setTemp(TempVo temp) {
        this.temp = temp;
    }

    public Double getUvi() {
        return uvi;
    }

    public void setUvi(Double uvi) {
        this.uvi = uvi;
    }
    public List<WeatherVo> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherVo> weather) {
        this.weather = weather;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
