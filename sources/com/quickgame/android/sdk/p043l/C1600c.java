package com.quickgame.android.sdk.p043l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import java.util.Locale;

/* renamed from: com.quickgame.android.sdk.l.c */
public class C1600c {

    /* renamed from: i */
    private static C1600c f1592i;

    /* renamed from: a */
    private int f1593a;

    /* renamed from: b */
    private long f1594b;

    /* renamed from: c */
    private String f1595c;

    /* renamed from: d */
    private int f1596d;

    /* renamed from: e */
    private String f1597e;

    /* renamed from: f */
    private String f1598f;

    /* renamed from: g */
    private String f1599g = "";

    /* renamed from: h */
    private String f1600h;

    private C1600c(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("qk_sdk", 0);
            this.f1598f = "" + Build.BOARD + Build.BRAND + Build.CPU_ABI + Build.DEVICE + Build.DISPLAY + Build.ID + Build.MANUFACTURER;
            this.f1597e = C1599b.m2044a();
            String string = sharedPreferences.getString("qk_sdk_device_id", "");
            this.f1595c = string;
            if (TextUtils.isEmpty(string)) {
                this.f1595c = C1599b.m2047c(context);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("qk_sdk_device_id", this.f1595c);
                edit.apply();
            }
            this.f1593a = C1601d.m2065b();
            this.f1594b = C1601d.m2059a(context);
            C1601d.m2067b(context);
            this.f1596d = 1;
            String str = Build.MODEL;
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            telephonyManager.getSimCountryIso();
            telephonyManager.getSimState();
            this.f1599g = String.valueOf(Build.VERSION.SDK_INT);
            C1599b.m2046b(context.getApplicationContext());
            Locale.getDefault().getLanguage();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(new DisplayMetrics());
            Log.d("DeviceInfo", "serialNum=" + this.f1597e);
            Log.d("DeviceInfo", "deviceShortId=" + this.f1598f);
        }
    }

    /* renamed from: a */
    public static C1600c m2049a(Context context) {
        if (f1592i == null) {
            synchronized (C1600c.class) {
                if (f1592i == null) {
                    f1592i = new C1600c(context);
                }
            }
        }
        return f1592i;
    }

    /* renamed from: b */
    public String mo13040b() {
        return this.f1595c;
    }

    /* renamed from: c */
    public String mo13041c() {
        return this.f1600h;
    }

    /* renamed from: d */
    public long mo13042d() {
        return this.f1594b;
    }

    /* renamed from: e */
    public String mo13043e() {
        return this.f1599g;
    }

    /* renamed from: f */
    public int mo13044f() {
        return this.f1596d;
    }

    /* renamed from: g */
    public int mo13045g() {
        return this.f1593a;
    }

    /* renamed from: h */
    public String mo13046h() {
        return this.f1597e;
    }

    public String toString() {
        return "DeviceInfo{sdkVersion=" + this.f1593a + ", gameVersion=" + this.f1594b + ", deviceId='" + this.f1595c + '\'' + ", serialNum=" + this.f1597e + ", deviceShortId=" + this.f1598f + ", platform=" + this.f1596d + '}';
    }

    /* renamed from: a */
    public String mo13038a() {
        return this.f1598f;
    }

    /* renamed from: a */
    public void mo13039a(String str) {
        this.f1600h = str;
    }
}
