package com.eapple.lzy.weathertest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by lzy on 2017/4/9.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
