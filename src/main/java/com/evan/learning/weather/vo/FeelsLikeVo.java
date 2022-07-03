package com.evan.learning.weather.vo;

import java.io.Serializable;

public class FeelsLikeVo implements Serializable {
    private Double day;
    private Double eve;
    private Double morn;
    private Double night;

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getEve() {
        return eve;
    }

    public void setEve(Double eve) {
        this.eve = eve;
    }

    public Double getMorn() {
        return morn;
    }

    public void setMorn(Double morn) {
        this.morn = morn;
    }

    public Double getNight() {
        return night;
    }

    public void setNight(Double night) {
        this.night = night;
    }
}
