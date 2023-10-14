package com.quickgame.android.sdk.p043l;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.quickgame.android.sdk.l.b */
public class C1599b {

    /* renamed from: a */
    private static String f1591a = "";

    /* renamed from: a */
    static String m2044a() {
        try {
            if (!TextUtils.isEmpty("")) {
                return "";
            }
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", "unknown"});
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m2046b(Context context) {
        try {
            if (TextUtils.isEmpty(f1591a)) {
                f1591a = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            return f1591a;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    static String m2047c(Context context) {
        String str = "" + Build.BOARD + Build.BRAND + Build.CPU_ABI + Build.DEVICE + Build.DISPLAY + Build.ID + Build.MANUFACTURER;
        String b = m2046b(context);
        String a = m2044a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = "null";
        sb.append(str2);
        sb.append(TextUtils.isEmpty(b) ? str2 : b);
        if (!TextUtils.isEmpty(a)) {
            str2 = a;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        Log.d("QGDeviceIdUtil", "DeviceShortId:" + str);
        Log.d("QGDeviceIdUtil", "AndroidId:" + b);
        Log.d("QGDeviceIdUtil", "serialNum:" + a);
        return C1601d.m2061a(sb2).toUpperCase();
    }

    /* renamed from: d */
    public static String m2048d(Context context) {
        return "";
    }

    /* renamed from: a */
    public static String m2045a(Context context) {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            if (!Thread.currentThread().getName().equalsIgnoreCase("main")) {
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                } catch (Exception e) {
                    Log.d("QGDeviceIdUtil", "getAdID Exception: " + e.getMessage());
                    return "";
                }
            } else {
                throw new RuntimeException("cannot get adid in UIthread");
            }
        } catch (ClassNotFoundException unused) {
            Log.d("QGDeviceIdUtil", "not found AdvertisingIdClient class");
            return "";
        }
    }
}
