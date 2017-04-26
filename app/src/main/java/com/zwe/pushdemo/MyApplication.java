package com.zwe.pushdemo;

import android.app.Application;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

/**
 * Created by Asus on 2017/4/26.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        PushManager.startWork(this, PushConstants.LOGIN_TYPE_API_KEY,"7NNcZSirjEkkL5M0s6UvSl56");
    }
}
