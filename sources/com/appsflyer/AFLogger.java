package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.internal.C0458ac;
import com.appsflyer.internal.C0484ak;
import com.appsflyer.internal.C0511ay;

public final class AFLogger {
    private static final long AFInAppEventType = System.currentTimeMillis();

    public static void values(String str, boolean z) {
        if (valueOf(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.5.3", AFInAppEventParameterName(str, false));
        }
        if (z) {
            C0484ak.AFInAppEventType().AFInAppEventParameterName("I", AFInAppEventParameterName(str, true));
        }
    }

    private static String AFInAppEventParameterName(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFInAppEventType);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    private static void AFInAppEventParameterName(String str, Throwable th, boolean z, boolean z2) {
        long j;
        if (valueOf(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String AFInAppEventParameterName = AFInAppEventParameterName(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.5.3", AFInAppEventParameterName, th);
            } else if (z) {
                Log.d("AppsFlyer_6.5.3", AFInAppEventParameterName);
            }
        }
        C0484ak.AFInAppEventType().valueOf(th);
        if (C0511ay.AFInAppEventParameterName != null) {
            SharedPreferences.Editor edit = C0458ac.AFInAppEventType((Context) C0511ay.AFInAppEventParameterName).edit();
            if (C0511ay.AFInAppEventParameterName == null) {
                j = -1;
            } else {
                j = C0458ac.AFInAppEventType((Context) C0511ay.AFInAppEventParameterName).getLong("exception_number", 0);
            }
            edit.putLong("exception_number", j + 1).apply();
        }
    }

    public static void valueOf(String str) {
        if (valueOf(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.5.3", AFInAppEventParameterName(str, false));
        }
        C0484ak.AFInAppEventType().AFInAppEventParameterName("W", AFInAppEventParameterName(str, true));
    }

    public static void AFKeystoreWrapper(String str) {
        if (valueOf(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.5.3", AFInAppEventParameterName(str, false));
        }
        C0484ak.AFInAppEventType().AFInAppEventParameterName("V", AFInAppEventParameterName(str, true));
    }

    private static boolean valueOf(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFInAppEventType(String str) {
        if (!AFInAppEventParameterName()) {
            Log.d("AppsFlyer_6.5.3", AFInAppEventParameterName(str, false));
        }
        C0484ak.AFInAppEventType().AFInAppEventParameterName("F", str);
    }

    private static boolean AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void values(String str) {
        values(str, true);
    }

    public static void valueOf(String str, Throwable th) {
        AFInAppEventParameterName(str, th, true, false);
    }

    public static void AFInAppEventParameterName(String str, Throwable th) {
        AFInAppEventParameterName(str, th, true, true);
    }

    public static void values(Throwable th) {
        AFInAppEventParameterName((String) null, th, false, false);
    }

    public static void AppsFlyer2dXConversionCallback(String str) {
        valueOf(str);
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventParameterName;

        private LogLevel(int i) {
            this.AFInAppEventParameterName = i;
        }

        public final int getLevel() {
            return this.AFInAppEventParameterName;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (valueOf(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.5.3", AFInAppEventParameterName(str, false));
        }
        C0484ak.AFInAppEventType().AFInAppEventParameterName("D", AFInAppEventParameterName(str, true));
    }
}
