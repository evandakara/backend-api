package com.evan.learning.weather.vo;

import java.io.Serializable;

public class CoordVo implements Serializable {
    private String lat;
    private String lon;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
