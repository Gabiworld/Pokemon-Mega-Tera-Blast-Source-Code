package com.quickgame.android.sdk.firebase;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.easygametime.ezbkm.AppConstant;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class HWFirebaseManager {
    /* access modifiers changed from: private */
    public static String TAG = "QGFirebaseManager";
    private static HWFirebaseManager instance;
    /* access modifiers changed from: private */
    public HWFirebaseCallback callback = null;
    private FirebaseAnalytics firebaseAnalytics = null;
    private String token = "";

    public static HWFirebaseManager getInstance(Context context) {
        if (instance == null) {
            instance = new HWFirebaseManager();
        }
        return instance;
    }

    public HWFirebaseCallback getCallback() {
        return this.callback;
    }

    public void getFirebaseToken() {
        Log.d(TAG, "getFirebaseToken");
        if (this.callback == null) {
            Log.d(TAG, "getFirebaseToken error.need call setFirbMsgCallback first.");
        } else {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
                public void onComplete(Task<String> task) {
                    if (!task.isSuccessful()) {
                        String access$000 = HWFirebaseManager.TAG;
                        Log.i(access$000, "获取firebase令牌失败:" + task.getException());
                        HWFirebaseManager.this.callback.onGetToken(false, "");
                        return;
                    }
                    String str = (String) task.getResult();
                    HWFirebaseManager.this.callback.onGetToken(true, str);
                    String access$0002 = HWFirebaseManager.TAG;
                    Log.d(access$0002, "firebase令牌：" + str);
                }
            });
        }
    }

    public String getToken() {
        return this.token;
    }

    public void init(Context context) {
        try {
            Class<?> cls = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            String str = TAG;
            Log.d(str, "className " + cls.getSimpleName());
            try {
                this.firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            } catch (Exception e) {
                String str2 = TAG;
                Log.d(str2, "init ext " + e.getMessage());
            }
        } catch (ClassNotFoundException unused) {
            Log.d(TAG, "not found FirebaseAnalytics class");
        }
    }

    public void logBeginTutorialEvent() {
        FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.logEvent("tutorial_begin", (Bundle) null);
        }
    }

    public void logCompleteTutorialEvent() {
        FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.logEvent("tutorial_complete", (Bundle) null);
        }
    }

    public void logCustomEvent(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.logEvent(str, bundle);
        }
    }

    public void logEarnEvent(double d, String str) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putDouble(SDKConstants.PARAM_VALUE, d);
            bundle.putString("virtual_currency_name", str);
            this.firebaseAnalytics.logEvent("earn_virtual_currency", bundle);
        }
    }

    public void logJoinGroupEvent(String str) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("group_id", str);
            this.firebaseAnalytics.logEvent("join_group", bundle);
        }
    }

    public void logLevelEvent(String str, long j) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("level", j);
            bundle.putString("character", str);
            this.firebaseAnalytics.logEvent("level_up", bundle);
        }
    }

    @Deprecated
    public void logLoginEvent(String str) {
    }

    public void logLoginEvent(String str, String str2, String str3) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("name", str2);
            bundle.putString("method", str3);
            this.firebaseAnalytics.logEvent(AppConstant.SDK_LOGIN, bundle);
        }
    }

    public void logShareEvent(String str, String str2) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("content_type", str);
            bundle.putString("item_id", str2);
            this.firebaseAnalytics.logEvent(ShareDialog.WEB_SHARE_DIALOG, bundle);
        }
    }

    @Deprecated
    public void logSignUpEvent(String str) {
    }

    public void logSignUpEvent(String str, String str2, String str3) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("name", str2);
            bundle.putString("method", str3);
            this.firebaseAnalytics.logEvent("sign_up", bundle);
        }
    }

    public void logSpendEvent(String str, double d, String str2) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("item_name", str);
            bundle.putDouble(SDKConstants.PARAM_VALUE, d);
            bundle.putString("virtual_currency_name", str2);
            this.firebaseAnalytics.logEvent("spend_virtual_currency", bundle);
        }
    }

    public void logUnlockAchievement(String str) {
        if (this.firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("achievement_id", str);
            this.firebaseAnalytics.logEvent("unlock_achievement", bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void onNewToken() {
        try {
            String str = TAG;
            Log.d(str, "firebase onNewToken token:" + this.token);
            HashMap hashMap = new HashMap();
            hashMap.put("pushToken", this.token);
            C1428d.m1703a("/v1/system/onNewToken", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1426b<JSONObject>() {
                public void onFailed(C1427c cVar) {
                    String access$000 = HWFirebaseManager.TAG;
                    Log.w(access$000, "onNewToken result: " + cVar.mo12663b());
                }

                public void onSuccess(JSONObject jSONObject) {
                    String access$000 = HWFirebaseManager.TAG;
                    Log.d(access$000, "onNewToken result: " + jSONObject);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            QGLog.LogException(e);
        }
    }

    public void sendNotification(Context context, String str, String str2, Intent intent) {
        intent.addFlags(67108864);
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context, AppEventsConstants.EVENT_PARAM_VALUE_NO).setSmallIcon(C1124R.C1125drawable.hw_ico_read_mail).setContentTitle(str2).setContentText(str).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(PendingIntent.getActivity(context, 0, intent, 1107296256));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(AppEventsConstants.EVENT_PARAM_VALUE_NO, "Channel human readable title", 3));
        }
        notificationManager.notify(0, contentIntent.build());
    }

    public void setAnalyticsEnable(boolean z) {
        FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.setAnalyticsCollectionEnabled(z);
        }
    }

    public void setCallback(HWFirebaseCallback hWFirebaseCallback) {
        this.callback = hWFirebaseCallback;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public static HWFirebaseManager getInstance() {
        if (instance == null) {
            instance = new HWFirebaseManager();
        }
        return instance;
    }
}
