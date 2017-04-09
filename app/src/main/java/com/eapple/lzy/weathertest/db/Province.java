package com.eapple.lzy.weathertest.db;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by lzy on 2017/4/9.
 * 当id是递增的时候，不需要定义。
 *
 */

public class Province extends DataSupport {
    @Column(nullable = false)
    private String provinceName;
    @Column(nullable = false)
    private int provinceCode;
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
