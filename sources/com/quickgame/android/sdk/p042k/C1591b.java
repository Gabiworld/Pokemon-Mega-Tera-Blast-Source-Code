package com.quickgame.android.sdk.p042k;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAttributionChangedListener;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.listener.IAdjustListener;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;

/* renamed from: com.quickgame.android.sdk.k.b */
public class C1591b {

    /* renamed from: b */
    private static C1591b f1579b;

    /* renamed from: a */
    private boolean f1580a = false;

    /* renamed from: com.quickgame.android.sdk.k.b$a */
    class C1592a implements OnAttributionChangedListener {

        /* renamed from: a */
        final /* synthetic */ IAdjustListener f1581a;

        C1592a(C1591b bVar, IAdjustListener iAdjustListener) {
            this.f1581a = iAdjustListener;
        }

        public void onAttributionChanged(AdjustAttribution adjustAttribution) {
            this.f1581a.onAttributionChanged(adjustAttribution);
        }
    }

    /* renamed from: c */
    public static C1591b m1999c() {
        if (f1579b == null) {
            f1579b = new C1591b();
        }
        return f1579b;
    }

    /* renamed from: a */
    public void mo12999a(Context context) {
        mo13000a(context, (IAdjustListener) null);
    }

    /* renamed from: b */
    public void mo13003b() {
        if (this.f1580a) {
            Adjust.onResume();
        }
    }

    /* renamed from: a */
    public void mo12998a() {
        if (this.f1580a) {
            Adjust.onPause();
        }
    }

    /* renamed from: b */
    public void mo13004b(String str, String str2, String str3) {
        if (this.f1580a) {
            String c = C1601d.m2069c(C1128a.m798r().mo11981e(), "adj_purchase_token");
            if (TextUtils.isEmpty(c)) {
                Log.e("QGAdjustManager", "adjust purchase token is null");
                return;
            }
            Log.d("QGAdjustManager", "report purchase token:" + c);
            Log.d("QGAdjustManager", "report purchase amount:" + Double.parseDouble(str2) + ",currency:" + str3);
            AdjustEvent adjustEvent = new AdjustEvent(c);
            adjustEvent.setRevenue(Double.parseDouble(str2), str3);
            adjustEvent.setOrderId(str);
            Adjust.trackEvent(adjustEvent);
            return;
        }
        QGLog.m2386d("QGAdjustManager", "adjust not init");
    }

    /* renamed from: a */
    public void mo13000a(Context context, IAdjustListener iAdjustListener) {
        boolean z;
        Log.d("QGAdjustManager", "init adjust.");
        String c = C1601d.m2069c(context, "adjust.Token");
        boolean a = C1601d.m2064a(context, "adj_config_sendInBg");
        Log.d("QGAdjustManager", "adjust debug:" + C1601d.m2066b(context, "adjust.Debug"));
        Log.d("QGAdjustManager", "adjust config sendInBg:" + a);
        if (C1601d.m2066b(context, "adjust.Debug") == 1) {
            Log.d("QGAdjustManager", "adjust init debug is 1.");
            z = true;
        } else {
            z = false;
        }
        Log.d("QGAdjustManager", "adjust appToken is :" + c);
        if (!TextUtils.isEmpty(c)) {
            AdjustConfig adjustConfig = new AdjustConfig(context, c, z ? "sandbox" : "production");
            if (iAdjustListener != null) {
                adjustConfig.setOnAttributionChangedListener(new C1592a(this, iAdjustListener));
            }
            adjustConfig.setSendInBackground(a);
            adjustConfig.setLogLevel(LogLevel.VERBOSE);
            Adjust.onCreate(adjustConfig);
            this.f1580a = true;
            return;
        }
        Log.d("QGAdjustManager", "no adjust token");
    }

    /* renamed from: c */
    public void mo13005c(String str, String str2, String str3) {
        if (this.f1580a) {
            String c = C1601d.m2069c(C1128a.m798r().mo11981e(), "adj_complete_registration_token");
            if (TextUtils.isEmpty(c)) {
                Log.e("QGAdjustManager", "token is null");
                return;
            }
            QGLog.m2390i("QGAdjustManager", "adjust register eventToken:" + c);
            AdjustEvent adjustEvent = new AdjustEvent(c);
            Adjust.addSessionCallbackParameter("customer_user_id", str);
            Adjust.addSessionCallbackParameter("customer_user_name", str2);
            Adjust.addSessionCallbackParameter("register_method", str3);
            Adjust.trackEvent(adjustEvent);
            return;
        }
        QGLog.m2386d("QGAdjustManager", "adjust not init");
    }

    /* renamed from: a */
    public void mo13001a(String str, String str2, double d, String str3) {
        if (this.f1580a) {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            if (!TextUtils.isEmpty(str3) && d > 0.0d) {
                adjustEvent.setRevenue(d, str3);
                if (!TextUtils.isEmpty(str2)) {
                    adjustEvent.setOrderId(str2);
                }
            }
            Adjust.trackEvent(adjustEvent);
            return;
        }
        QGLog.m2390i("QGAdjustManager", "adjust not init");
    }

    /* renamed from: a */
    public void mo13002a(String str, String str2, String str3) {
        if (this.f1580a) {
            String c = C1601d.m2069c(C1128a.m798r().mo11981e(), "adj_login_token");
            if (TextUtils.isEmpty(c)) {
                Log.e("QGAdjustManager", "token is null");
                return;
            }
            QGLog.m2390i("QGAdjustManager", "adjust register eventToken:" + c);
            AdjustEvent adjustEvent = new AdjustEvent(c);
            Adjust.addSessionCallbackParameter("customer_user_id", str);
            Adjust.addSessionCallbackParameter("customer_user_name", str2);
            Adjust.trackEvent(adjustEvent);
            return;
        }
        QGLog.m2390i("QGAdjustManager", "adjust not init");
    }
}
