package com.quickgame.android.sdk.p042k;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1601d;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: com.quickgame.android.sdk.k.d */
public class C1596d {

    /* renamed from: a */
    private static AppEventsLogger f1586a = null;

    /* renamed from: b */
    private static C1596d f1587b = null;

    /* renamed from: c */
    private static String f1588c = "AppEventsLogManager";

    private C1596d() {
    }

    /* renamed from: b */
    public static C1596d m2019b() {
        if (f1587b == null) {
            f1587b = new C1596d();
        }
        return f1587b;
    }

    /* renamed from: a */
    public void mo13019a(Activity activity) {
        Log.d(f1588c, "initEventLogger");
        if (!C1541g.m1887a().f1487j) {
            Log.d(f1588c, "no facebook config");
            return;
        }
        boolean equalsIgnoreCase = "fbEventDebug".equalsIgnoreCase(C1601d.m2069c(activity, "fbEventDebug"));
        String str = f1588c;
        Log.d(str, "fbDebugEvent:" + equalsIgnoreCase);
        f1586a = AppEventsLogger.newLogger(activity);
        if (equalsIgnoreCase) {
            FacebookSdk.setIsDebugEnabled(true);
            FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
        }
    }

    /* renamed from: b */
    public void mo13031b(String str, String str2, String str3) {
        if (f1586a != null) {
            Log.d(f1588c, "loginSuccess");
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("name", str2);
            bundle.putString("login_method", str3);
            f1586a.logEvent("fb_custom_login_user_name", bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13017a() {
        AppEventsLogger appEventsLogger = f1586a;
        if (appEventsLogger != null) {
            appEventsLogger.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP);
            f1586a.flush();
        }
    }

    /* renamed from: b */
    public void mo13030b(String str, String str2) {
        if (f1586a != null) {
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_DESCRIPTION, str);
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, str2);
            f1586a.logEvent(AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13028a(boolean z) {
        if (f1586a != null) {
            Log.d(f1588c, "logCompleteTutorialEvent");
            Bundle bundle = new Bundle();
            bundle.putBoolean("Success", z);
            f1586a.logEvent(AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: b */
    public void mo13029b(String str) {
        AppEventsLogger appEventsLogger = f1586a;
        if (appEventsLogger != null) {
            appEventsLogger.logEvent(str);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13024a(String str, String str2) {
        if (f1586a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("name", str2);
            f1586a.logEvent("Create Role", bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13026a(String str, String str2, String str3) {
        if (f1586a != null) {
            Log.d(f1588c, "logCompleteRegistrationEvent");
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("name", str2);
            bundle.putString("register_method", str3);
            f1586a.logEvent(AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, bundle);
            f1586a.logEvent("fb_custom_login_new_user");
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13020a(String str) {
        if (f1586a != null) {
            Log.d(f1588c, "logAchieveLevelEvent");
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_LEVEL, str);
            f1586a.logEvent(AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13025a(String str, String str2, double d) {
        if (f1586a != null) {
            Log.d(f1588c, "logPurchaseEvent");
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, str);
            bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, str2);
            f1586a.logEvent("Purchase", d, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13027a(String str, String str2, String str3, int i, boolean z, String str4, double d) {
        if (f1586a != null) {
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT, str);
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, str2);
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, str3);
            bundle.putInt(AppEventsConstants.EVENT_PARAM_NUM_ITEMS, i);
            bundle.putInt(AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE, z ? 1 : 0);
            bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, str4);
            f1586a.logEvent(AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, d, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13023a(String str, Bundle bundle) {
        AppEventsLogger appEventsLogger = f1586a;
        if (appEventsLogger != null) {
            appEventsLogger.logEvent(str, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13021a(String str, double d) {
        AppEventsLogger appEventsLogger = f1586a;
        if (appEventsLogger != null) {
            appEventsLogger.logEvent(str, d);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13022a(String str, double d, Bundle bundle) {
        AppEventsLogger appEventsLogger = f1586a;
        if (appEventsLogger != null) {
            appEventsLogger.logEvent(str, d, bundle);
            f1586a.flush();
        }
    }

    /* renamed from: a */
    public void mo13018a(double d, String str, Bundle bundle) {
        if (f1586a != null) {
            Log.d(f1588c, "logFbPurchase");
            f1586a.logPurchase(BigDecimal.valueOf(d), Currency.getInstance(str), bundle);
            f1586a.flush();
        }
    }
}
