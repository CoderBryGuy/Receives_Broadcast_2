package com.example.hackeru.receives_broadcast_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hackeru on 17/04/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        int INT_3 = intent.getIntExtra("INT_3", 0);

        Toast.makeText(context, Integer.toString(INT_3), Toast.LENGTH_SHORT).show();
    }
}
