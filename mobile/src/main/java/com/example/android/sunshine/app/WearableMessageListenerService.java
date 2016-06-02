package com.example.android.sunshine.app;

import android.util.Log;

import com.example.android.sunshine.app.sync.SunshineSyncAdapter;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Developer: chipset
 * Package : com.example.android.sunshine.app
 * Project : ProjectSix
 * Date : 2/6/16
 */

public class WearableMessageListenerService extends WearableListenerService {
    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        super.onMessageReceived(messageEvent);
        Log.d("Message", "Rec");
        if (messageEvent.getPath().equals("/run_sync"))
            SunshineSyncAdapter.syncImmediately(getApplicationContext());
    }
}
