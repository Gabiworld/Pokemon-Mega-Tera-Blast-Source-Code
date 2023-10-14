package com.quickgame.android.sdk.firebase;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.quickgame.android.sdk.C1124R;

public class HWFirebaseMessagingService extends FirebaseMessagingService {
    private static String TAG = "FirebaseMessagingService";
    private static String messageBody;
    private HWFirebaseCallback callback;

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.quickgame.android.sdk.firebase.HWFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService] */
    private void sendNotification(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.quickgame.overseas.MainActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        Intent intent = new Intent(this, cls);
        intent.addFlags(67108864);
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(this, AppEventsConstants.EVENT_PARAM_VALUE_NO).setSmallIcon(C1124R.C1125drawable.hw_btn_claim_selector).setContentTitle("firebase标题").setContentText(str).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(PendingIntent.getActivity(this, 0, intent, 1073741824));
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(AppEventsConstants.EVENT_PARAM_VALUE_NO, "Channel human readable title", 3));
        }
        notificationManager.notify(0, contentIntent.build());
    }

    public void onCreate() {
        HWFirebaseMessagingService.super.onCreate();
        this.callback = HWFirebaseManager.getInstance(getApplicationContext()).getCallback();
    }

    public void onDeletedMessages() {
        Log.d(TAG, "onDeletedMessages");
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            messageBody = remoteMessage.getNotification().getBody();
            String str = TAG;
            Log.e(str, "消息from:" + remoteMessage.getFrom());
            String str2 = TAG;
            Log.e(str2, "消息data:" + remoteMessage.getData());
            String str3 = TAG;
            Log.e(str3, "消息Title:" + remoteMessage.getNotification().getTitle());
            String str4 = TAG;
            Log.e(str4, "消息messageBody:" + messageBody);
            String str5 = TAG;
            Log.e(str5, "消息clickAction:" + remoteMessage.getNotification().getClickAction());
            HWFirebaseCallback hWFirebaseCallback = this.callback;
            if (hWFirebaseCallback != null) {
                hWFirebaseCallback.onMessageReceived(remoteMessage);
            }
        }
    }

    public void onMessageSent(String str) {
        String str2 = TAG;
        Log.d(str2, "onMessageSent:" + str);
    }

    public void onNewToken(String str) {
        String str2 = TAG;
        Log.e(str2, "Refreshed token: " + str);
        HWFirebaseManager.getInstance(getApplicationContext()).setToken(str);
        HWFirebaseManager.getInstance(getApplicationContext()).onNewToken();
        HWFirebaseCallback hWFirebaseCallback = this.callback;
        if (hWFirebaseCallback != null) {
            hWFirebaseCallback.onNewToken(str);
        }
    }
}
