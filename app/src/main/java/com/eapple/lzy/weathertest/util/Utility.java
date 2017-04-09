package com.eapple.lzy.weathertest.util;

import android.text.TextUtils;

import com.eapple.lzy.weathertest.db.City;
import com.eapple.lzy.weathertest.db.County;
import com.eapple.lzy.weathertest.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析服务器返回的数据
 * Created by lzy on 2017/4/9.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response)
    {
        //下面的函数既可以判断字符串是否为空对象，也可以判断长度为空
        if(!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray allProvinces=new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++)
                {
                    JSONObject provinceObject=allProvinces.getJSONObject(i);
                    //下面数据是LitPal添加数据的方法
                    Province province=new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException ee)
            {
                ee.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String reponse,int provinceId)
    {
        if (!TextUtils.isEmpty(reponse))
        {
            try
            {
                JSONArray allCities=new JSONArray(reponse);
                for(int i=0;i<allCities.length();i++)
                {
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,int cityId)
    {
        if(!TextUtils.isEmpty(response))
        {
            try {
                JSONArray allCounties=new JSONArray(response);
                for(int i=0;i<allCounties.length();i++)
                {
                    JSONObject countyObject=allCounties.getJSONObject(i);
                    County county=new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return false;
    }

}
