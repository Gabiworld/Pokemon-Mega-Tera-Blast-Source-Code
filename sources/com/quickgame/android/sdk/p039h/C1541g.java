package com.quickgame.android.sdk.p039h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.h.g */
public class C1541g {

    /* renamed from: a */
    public boolean f1478a = false;

    /* renamed from: b */
    public boolean f1479b = false;

    /* renamed from: c */
    public boolean f1480c = false;

    /* renamed from: d */
    public boolean f1481d = false;

    /* renamed from: e */
    public boolean f1482e = false;

    /* renamed from: f */
    public boolean f1483f = false;

    /* renamed from: g */
    public boolean f1484g = false;

    /* renamed from: h */
    public boolean f1485h = false;

    /* renamed from: i */
    public boolean f1486i = false;

    /* renamed from: j */
    public boolean f1487j;

    /* renamed from: k */
    public boolean f1488k;

    /* renamed from: l */
    public boolean f1489l;

    /* renamed from: m */
    public boolean f1490m;

    /* renamed from: n */
    public boolean f1491n;

    /* renamed from: o */
    public boolean f1492o;

    /* renamed from: p */
    public boolean f1493p;

    /* renamed from: q */
    public boolean f1494q = false;

    /* renamed from: com.quickgame.android.sdk.h.g$a */
    private static class C1542a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C1541g f1495a = new C1541g();
    }

    /* renamed from: a */
    public void mo12852a(Context context) {
        this.f1478a = C1601d.m2064a(context, "skipAFPurchase");
        this.f1479b = C1601d.m2064a(context, "skipAdjustPurchase");
        this.f1480c = C1601d.m2064a(context, "skipTapDBPurchase");
        TextUtils.isEmpty(C1601d.m2069c(context, "useSharePath"));
        this.f1485h = C1601d.m2066b(context, "noFloatViewBinding") == 1;
        this.f1482e = C1601d.m2064a(context, "KoreaVersion");
        this.f1483f = C1601d.m2064a(context, "JapanVersion");
        this.f1481d = C1601d.m2064a(context, "FloatingMenu");
        this.f1484g = C1601d.m2064a(context, "isWebPayWithUnit");
        C1601d.m2064a(context, "noticeEnabled.wallet");
        C1601d.m2064a(context, "ForUnity");
        this.f1486i = C1601d.m2064a(context, "showUserCenterUid");
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            this.f1488k = !TextUtils.isEmpty(C1601d.m2069c(context, "google-signin-client_id"));
        } catch (ClassNotFoundException unused) {
            Log.d("QGDebug_TAG", "ClassNotFoundException GoogleApiAvailability");
            this.f1488k = false;
        }
        try {
            Class.forName("com.facebook.FacebookActivity");
            this.f1487j = !TextUtils.isEmpty(C1601d.m2069c(context, FacebookSdk.APPLICATION_ID_PROPERTY));
        } catch (ClassNotFoundException unused2) {
            Log.d("QGDebug_TAG", "ClassNotFoundException FacebookActivity");
            this.f1487j = false;
        }
        this.f1489l = C1601d.m2064a(context, "isNeedVerify");
        this.f1490m = C1601d.m2064a(context, "showLoginLogo");
        this.f1491n = C1601d.m2064a(context, "ACLogoutDisable");
        this.f1492o = C1601d.m2064a(context, "IgnoreSSL");
        this.f1494q = C1601d.m2064a(context, "SDK_NO_EMAIL_LOGIN");
    }

    /* renamed from: a */
    public static C1541g m1887a() {
        return C1542a.f1495a;
    }
}
