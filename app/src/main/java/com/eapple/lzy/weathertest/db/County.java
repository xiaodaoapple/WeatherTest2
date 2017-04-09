package com.eapple.lzy.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lzy on 2017/4/9.
 */

public class County extends DataSupport {
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private String countyName;
    private String weatherId;
    private int cityId;

}
