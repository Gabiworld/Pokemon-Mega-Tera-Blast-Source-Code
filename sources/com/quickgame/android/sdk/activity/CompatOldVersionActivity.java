package com.quickgame.android.sdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1544i;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/CompatOldVersionActivity;", "Lcom/quickgame/android/sdk/base/BaseActivity;", "()V", "facebookManager", "Lcom/quickgame/android/sdk/thirdlogin/FacebookManager;", "googleLoginManager", "Lcom/quickgame/android/sdk/thirdlogin/GoogleLoginManager;", "lineManager", "Lcom/quickgame/android/sdk/thirdlogin/LineManager;", "thirdLoginListener", "com/quickgame/android/sdk/activity/CompatOldVersionActivity$thirdLoginListener$1", "Lcom/quickgame/android/sdk/activity/CompatOldVersionActivity$thirdLoginListener$1;", "twitterManager", "Lcom/quickgame/android/sdk/thirdlogin/TwitterManager;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "thirdLoginFailed", "errorMsg", "", "thirdLoginSuccess", "yimiThirdLogin", "loginType", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class CompatOldVersionActivity extends BaseActivity {

    /* renamed from: b */
    private TwitterManager f677b;

    /* renamed from: c */
    private C1691e f678c;

    /* renamed from: d */
    private C1684b f679d;

    /* renamed from: e */
    private C1687c f680e;

    /* renamed from: f */
    private final C1167b f681f = new C1167b(this);

    /* renamed from: com.quickgame.android.sdk.activity.CompatOldVersionActivity$a */
    public static final class C1166a {
        private C1166a() {
        }

        public /* synthetic */ C1166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J0\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\r"}, mo13302d2 = {"com/quickgame/android/sdk/activity/CompatOldVersionActivity$thirdLoginListener$1", "Lcom/quickgame/android/sdk/thirdlogin/ThirdLoginListener;", "onLoginCancel", "", "onLoginError", "message", "", "onLoginSuccessful", "uid", "userName", "accessToken", "appToken", "openType", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.activity.CompatOldVersionActivity$b */
    public static final class C1167b extends C1710i {

        /* renamed from: a */
        final /* synthetic */ CompatOldVersionActivity f682a;

        /* renamed from: com.quickgame.android.sdk.activity.CompatOldVersionActivity$b$a */
        public static final class C1168a implements C1426b<JSONObject> {

            /* renamed from: a */
            final /* synthetic */ C1167b f683a;

            C1168a(C1167b bVar) {
                this.f683a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(JSONObject jSONObject) {
                Intrinsics.checkNotNullParameter(jSONObject, "result");
                if (C1544i.m1891a(jSONObject.optString("data"), 13)) {
                    this.f683a.f682a.m962r();
                } else {
                    this.f683a.f682a.m963y("json parse exception");
                }
            }

            public void onFailed(C1427c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "error");
                this.f683a.f682a.m963y(cVar.mo12663b());
            }
        }

        C1167b(CompatOldVersionActivity compatOldVersionActivity) {
            this.f682a = compatOldVersionActivity;
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "uid");
            Intrinsics.checkNotNullParameter(str2, "userName");
            Intrinsics.checkNotNullParameter(str3, SDKConstants.PARAM_ACCESS_TOKEN);
            Intrinsics.checkNotNullParameter(str4, "appToken");
            Intrinsics.checkNotNullParameter(str5, "openType");
            CompatOldVersionActivity compatOldVersionActivity = this.f682a;
            compatOldVersionActivity.mo12282w(compatOldVersionActivity.getString(C1124R.string.hw_msg_login));
            HashMap hashMap = new HashMap();
            hashMap.put("openType", str5);
            hashMap.put("userOpenId", str);
            hashMap.put("otherAccountName", str2);
            hashMap.put("access_token", str3);
            hashMap.put("appToken", str4);
            C1128a r = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
            if (C1601d.m2073g(r.mo11981e())) {
                hashMap.put("prereg", "1");
            }
            C1538f l = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
            QGUserData i = l.mo12847i();
            Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
            String uid = i.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
            hashMap.put("uid", uid);
            C1538f l2 = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
            String f = l2.mo12844f();
            Intrinsics.checkNotNullExpressionValue(f, "SDKDataManager.getInstance().requestAuthToken");
            hashMap.put("authToken", f);
            C1428d.m1703a("/v1/auth/cksnslogin", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1168a(this));
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            this.f682a.finish();
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            qGUserHolder.setMsg(str);
            C1128a.m798r().mo11957a(qGUserHolder);
        }

        public void onLoginCancel() {
            this.f682a.finish();
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(2);
            C1128a.m798r().mo11957a(qGUserHolder);
        }
    }

    static {
        new C1166a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m962r() {
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m963y(String str) {
        mo12281q();
        Log.w("CompatOldVersionAct", "account login fail");
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setMsg(str);
        qGUserHolder.setStateCode(3);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r2 = new com.quickgame.android.sdk.thirdlogin.C1684b();
        r1.f679d = r2;
        r2.mo13196a((com.quickgame.android.sdk.thirdlogin.C1690d) r1.f681f);
        r2.mo13195a((android.app.Activity) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r2.equals("line") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r2.equals("Line") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r2 = new com.quickgame.android.sdk.thirdlogin.C1691e();
        r1.f678c = r2;
        r2.mo13210a((android.app.Activity) r1, (com.quickgame.android.sdk.thirdlogin.C1690d) r1.f681f);
        r2.mo13214b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r2.equals("twitter") != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r2 = new com.quickgame.android.sdk.thirdlogin.TwitterManager();
        r1.f677b = r2;
        r2.mo13177a(r1, r1.f681f);
        r2.mo13181b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2.equals("google") != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r2 = new com.quickgame.android.sdk.thirdlogin.C1687c();
        r1.f680e = r2;
        r2.mo13201a(r1, r1.f681f);
        r2.mo13202b((android.app.Activity) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.equals("Google") != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r2.equals("Twitter") != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2.equals("Facebook") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r2.equals(com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN) != false) goto L_0x002d;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m964z(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1240244679: goto L_0x0076;
                case -916346253: goto L_0x005e;
                case 2368532: goto L_0x0046;
                case 3321844: goto L_0x003d;
                case 497130182: goto L_0x0025;
                case 561774310: goto L_0x001c;
                case 748307027: goto L_0x0013;
                case 2138589785: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x008e
        L_0x0009:
            java.lang.String r0 = "Google"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
            goto L_0x007e
        L_0x0013:
            java.lang.String r0 = "Twitter"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
            goto L_0x0066
        L_0x001c:
            java.lang.String r0 = "Facebook"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
            goto L_0x002d
        L_0x0025:
            java.lang.String r0 = "facebook"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
        L_0x002d:
            com.quickgame.android.sdk.thirdlogin.b r2 = new com.quickgame.android.sdk.thirdlogin.b
            r2.<init>()
            r1.f679d = r2
            com.quickgame.android.sdk.activity.CompatOldVersionActivity$b r0 = r1.f681f
            r2.mo13196a((com.quickgame.android.sdk.thirdlogin.C1690d) r0)
            r2.mo13195a((android.app.Activity) r1)
            goto L_0x0091
        L_0x003d:
            java.lang.String r0 = "line"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
            goto L_0x004e
        L_0x0046:
            java.lang.String r0 = "Line"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
        L_0x004e:
            com.quickgame.android.sdk.thirdlogin.e r2 = new com.quickgame.android.sdk.thirdlogin.e
            r2.<init>()
            r1.f678c = r2
            com.quickgame.android.sdk.activity.CompatOldVersionActivity$b r0 = r1.f681f
            r2.mo13210a((android.app.Activity) r1, (com.quickgame.android.sdk.thirdlogin.C1690d) r0)
            r2.mo13214b(r1)
            goto L_0x0091
        L_0x005e:
            java.lang.String r0 = "twitter"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
        L_0x0066:
            com.quickgame.android.sdk.thirdlogin.TwitterManager r2 = new com.quickgame.android.sdk.thirdlogin.TwitterManager
            r2.<init>()
            r1.f677b = r2
            com.quickgame.android.sdk.activity.CompatOldVersionActivity$b r0 = r1.f681f
            r2.mo13177a(r1, r0)
            r2.mo13181b(r1)
            goto L_0x0091
        L_0x0076:
            java.lang.String r0 = "google"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008e
        L_0x007e:
            com.quickgame.android.sdk.thirdlogin.c r2 = new com.quickgame.android.sdk.thirdlogin.c
            r2.<init>()
            r1.f680e = r2
            com.quickgame.android.sdk.activity.CompatOldVersionActivity$b r0 = r1.f681f
            r2.mo13201a(r1, r0)
            r2.mo13202b((android.app.Activity) r1)
            goto L_0x0091
        L_0x008e:
            r1.finish()
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.activity.CompatOldVersionActivity.m964z(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1687c cVar = this.f680e;
        if (cVar != null) {
            cVar.mo13199a(i, i2, intent);
        }
        C1684b bVar = this.f679d;
        if (bVar != null) {
            bVar.mo13194a(i, i2, intent);
        }
        C1691e eVar = this.f678c;
        if (eVar != null) {
            eVar.mo13208a(i, i2, intent);
        }
        TwitterManager twitterManager = this.f677b;
        if (twitterManager != null) {
            twitterManager.mo13175a(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, SDKConstants.PARAM_INTENT);
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1656171416 && action.equals("action_1")) {
            String stringExtra = getIntent().getStringExtra("loginType");
            if (stringExtra == null) {
                stringExtra = "";
            }
            Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(\"loginType\") ?: \"\"");
            m964z(stringExtra);
            return;
        }
        finish();
    }
}
