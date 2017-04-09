package com.eapple.lzy.weathertest;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * 通过这个文件可以随时得到Context，在程序的任何位置调用MyApplication.getContext()函数就可以
 * 需要在AndroidManifest.xml文件里添加 android:name="com.eapple.lzy.weathertest.MyApplication"
 * Created by lzy on 2017/4/9.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate()
    {
        context=getApplicationContext();
        LitePalApplication.initialize(context);
    }
    public static Context getContext()
    {
        return context;
    }
}
