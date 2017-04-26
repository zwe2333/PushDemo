package com.zwe.pushdemo;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.baidu.android.pushservice.PushMessageReceiver;

import java.util.List;

/**
 * Created by Asus on 2017/4/26.
 */

public class MPushReceiver extends PushMessageReceiver{
    public static final String TAG = MPushReceiver.class.getSimpleName();
    @Override
    public void onBind(Context context, int errorCode, String appid,
                       String userId, String channelId, String requestId) {
        String responseString = "onBind errorCode=" + errorCode + " appid="
                + appid + " userId=" + userId + " channelId=" + channelId
                + " requestId=" + requestId;
        Log.e(TAG, responseString);
        if (errorCode == 0) {
            Toast.makeText(context, "绑定成功!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "绑定失败!"+errorCode, Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onUnbind(Context context, int i, String s) {

    }

    @Override
    public void onSetTags(Context context, int i, List<String> list, List<String> list1, String s) {

    }

    @Override
    public void onDelTags(Context context, int i, List<String> list, List<String> list1, String s) {

    }

    @Override
    public void onListTags(Context context, int i, List<String> list, String s) {

    }

    @Override
    public void onMessage(Context context, String s, String s1) {

    }

    @Override
    public void onNotificationClicked(Context context, String s, String s1, String s2) {

    }

    @Override
    public void onNotificationArrived(Context context, String s, String s1, String s2) {

    }
}
