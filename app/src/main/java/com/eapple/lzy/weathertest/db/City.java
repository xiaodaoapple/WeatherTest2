package com.eapple.lzy.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lzy on 2017/4/9.
 */

public class City extends DataSupport {
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private String cityName;
    private int cityCode;
    private int provinceId;
}
