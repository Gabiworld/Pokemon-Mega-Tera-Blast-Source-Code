package com.quickgame.android.sdk.p043l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.UByte;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.l.d */
public class C1601d {

    /* renamed from: a */
    private static String f1601a = "SdkUtils";

    /* renamed from: b */
    private static final String f1602b = System.getProperty("line.separator");

    /* renamed from: a */
    public static long m2059a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null) {
                return -1;
            }
            return (long) packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static int m2065b() {
        return 22102409;
    }

    /* renamed from: b */
    public static String m2067b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null) {
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
    }

    /* renamed from: c */
    public static String m2069c(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey(str)) {
                String str2 = "" + applicationInfo.metaData.get(str);
                QGLog.m2386d("SDKUtils", "meta " + str + CertificateUtil.DELIMITER + str2);
                return str2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(f1601a, "getMetaData Exception " + e.getMessage());
        }
        return "";
    }

    /* renamed from: d */
    public static String m2070d(Context context) {
        try {
            return context.getResources().getConfiguration().locale.getCountry().toUpperCase();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static int m2071e(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getSubtype() == 1) {
            return 1;
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if ("46002".equals(simOperator)) {
                return 2;
            }
            if ("46000".equals(simOperator)) {
                return 2;
            }
            if ("46001".equals(simOperator)) {
                return 3;
            }
            if ("46003".equals(simOperator)) {
                return 4;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static int[] m2072f(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi};
    }

    /* renamed from: g */
    public static boolean m2073g(Context context) {
        boolean z = context.getSharedPreferences("preRegistration", 0).getBoolean("preRegistration", false);
        String str = f1601a;
        Log.d(str, "login finish isPreRegistration: " + z);
        return z;
    }

    /* renamed from: a */
    public static boolean m2064a(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str)) {
                return false;
            }
            boolean z = applicationInfo.metaData.getBoolean(str);
            QGLog.m2386d("SDKUtils", "metaData " + str + " is:" + z);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            String str2 = f1601a;
            Log.e(str2, "getBooleanMetaData Exception " + e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static int m2066b(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str)) {
                return -1;
            }
            int i = applicationInfo.metaData.getInt(str);
            QGLog.m2386d("SDKUtils", "metaData is:" + i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            String str2 = f1601a;
            Log.e(str2, "getIntMetaData Exception " + e.getMessage());
            return -1;
        }
    }

    /* renamed from: c */
    public static String m2068c(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m2061a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m2060a() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: a */
    private static void m2063a(boolean z) {
        if (z) {
            Log.w("QGDebug", "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.w("QGDebug", "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }

    /* renamed from: a */
    public static void m2062a(String str, String str2) {
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith("[")) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        m2063a(true);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = f1602b;
        sb.append(str3);
        sb.append(str2);
        for (String str4 : sb.toString().split(str3)) {
            Log.w("QGDebug", "║ " + str4);
        }
        m2063a(false);
    }
}
