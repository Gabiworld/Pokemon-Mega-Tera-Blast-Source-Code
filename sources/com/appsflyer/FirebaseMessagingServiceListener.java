package com.appsflyer;

import com.appsflyer.internal.C0547cd;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.appsflyer.FirebaseMessagingServiceListener] */
    public void onNewToken(String str) {
        new C0547cd(getApplicationContext()).AFInAppEventParameterName(str);
    }
}
