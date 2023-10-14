package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.ap */
public final class C0493ap {
    private long AFInAppEventParameterName;
    private int AFInAppEventType;
    private String AFKeystoreWrapper;
    private C0567cw AFLogger$LogLevel;
    private Throwable AppsFlyer2dXConversionCallback;
    private long valueOf;
    private String values;

    public C0493ap() {
    }

    public static Uri AFKeystoreWrapper(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public C0493ap(String str, String str2, long j, long j2, int i, C0567cw cwVar, Throwable th) {
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.valueOf = j;
        this.AFInAppEventParameterName = j2;
        this.AFInAppEventType = i;
        this.AFLogger$LogLevel = cwVar;
        this.AppsFlyer2dXConversionCallback = th;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("cdn_token", this.AFKeystoreWrapper);
        String str = this.values;
        if (str != null) {
            hashMap.put("c_ver", str);
        }
        long j = this.valueOf;
        if (j > 0) {
            hashMap.put("latency", Long.valueOf(j));
        }
        long j2 = this.AFInAppEventParameterName;
        if (j2 > 0) {
            hashMap.put("delay", Long.valueOf(j2));
        }
        int i = this.AFInAppEventType;
        if (i > 0) {
            hashMap.put("res_code", Integer.valueOf(i));
        }
        if (this.AppsFlyer2dXConversionCallback != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AppsFlyer2dXConversionCallback.getClass().getSimpleName());
            sb.append(": ");
            sb.append(this.AppsFlyer2dXConversionCallback.getMessage());
            hashMap.put("error", sb.toString());
        }
        C0567cw cwVar = this.AFLogger$LogLevel;
        if (cwVar != null) {
            hashMap.put("sig", cwVar.toString());
        }
        return hashMap;
    }
}
