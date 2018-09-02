package com.example.hp.broadcastexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for (int i = 0; i < 20 ; ++i) {
            Toast.makeText(this, "Started......", Toast.LENGTH_SHORT).show();
        }
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
      return null;
    }
}
