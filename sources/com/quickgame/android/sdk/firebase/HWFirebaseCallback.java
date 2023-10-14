package com.quickgame.android.sdk.firebase;

import com.google.firebase.messaging.RemoteMessage;

public interface HWFirebaseCallback {
    void onGetToken(boolean z, String str);

    void onMessageReceived(RemoteMessage remoteMessage);

    void onNewToken(String str);
}
