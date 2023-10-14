package com.quickgame.android.sdk.utils.log;

import android.util.Log;

public class QGLog {

    /* renamed from: a */
    private static boolean f1760a = false;

    public static void LogException(Throwable th) {
        if (f1760a) {
            th.getLocalizedMessage();
        }
    }

    /* renamed from: d */
    public static void m2386d(String str, String str2) {
        if (f1760a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m2388e(String str, String str2) {
        if (f1760a) {
            Log.e(str, str2);
        }
    }

    public static boolean getDebugMod() {
        return f1760a;
    }

    /* renamed from: i */
    public static void m2391i(String str, String str2, Throwable th) {
        if (f1760a) {
            Log.i(str, str2, th);
        }
    }

    public static void setDebugMod(Boolean bool) {
        f1760a = bool.booleanValue();
    }

    /* renamed from: v */
    public static void m2393v(String str, String str2, Throwable th) {
        if (f1760a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m2394w(String str, String str2) {
        if (f1760a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m2387d(String str, String str2, Throwable th) {
        if (f1760a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m2389e(String str, String str2, Throwable th) {
        if (f1760a) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m2390i(String str, String str2) {
        if (f1760a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: v */
    public static void m2392v(String str, String str2) {
        if (f1760a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m2395w(String str, String str2, Throwable th) {
        if (f1760a) {
            Log.w(str, str2, th);
        }
    }
}
