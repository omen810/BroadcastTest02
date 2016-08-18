package com.omen.broadcasttest02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/18.
 */
public class AnotherBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接收到广播，来自BroadcastTest01", Toast.LENGTH_SHORT).show();
    }
}
