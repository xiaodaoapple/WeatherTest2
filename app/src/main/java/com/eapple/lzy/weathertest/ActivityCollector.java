package com.eapple.lzy.weathertest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来在程序的任何时候都可以关闭全部activity，并可以安全退出程序.
 * 创建BaseActivity作为任何活动的父类，在其onCreate事件里添加 ActivityCollector.addActivity(this);
 * 在其 onDestroy事件里添加ActivityCollector.removeActivity(this);。
 * 在以后创建的以BaseActivity作为父类的活动中调用ActivityCollector.finishAll()方法来退出程序
 *
 * Created by lzy on 2017/4/9.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity)
    {
        activities.remove(activity);
    }
    public static void finishAll()
    {
        for(Activity activity:activities)
        {
            if(!activity.isFinishing())
            {
                activity.finish();
            }
        }
    }
}
