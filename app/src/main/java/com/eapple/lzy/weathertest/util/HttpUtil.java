package com.eapple.lzy.weathertest.util;

import com.eapple.lzy.weathertest.R;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import static android.R.string.ok;

/**
 * Created by lzy on 2017/4/9.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(final  String address,final okhttp3.Callback callback)
    {
       OkHttpClient client=new OkHttpClient();
       Request request= new Request.Builder()
               .url(address)
               .build();

        client.newCall(request).enqueue(callback);
    }
}
