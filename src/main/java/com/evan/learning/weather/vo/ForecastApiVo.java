package com.evan.learning.weather.vo;

import java.io.Serializable;
import java.util.List;

public class ForecastApiVo implements Serializable {
    private List<DailyVo> daily;

    public List<DailyVo> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyVo> daily) {
        this.daily = daily;
    }
}
