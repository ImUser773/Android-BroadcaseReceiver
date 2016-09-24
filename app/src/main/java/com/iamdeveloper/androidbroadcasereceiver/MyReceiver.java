package com.iamdeveloper.androidbroadcasereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by IamDeveloper on 9/14/2016.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"configuration change",Toast.LENGTH_SHORT).show();
    }
}
