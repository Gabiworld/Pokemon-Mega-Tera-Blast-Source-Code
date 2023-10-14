package com.quickgame.android.sdk.p038g;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1544i;
import com.quickgame.android.sdk.p043l.C1601d;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ.\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u0016\u0010\u0016\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ.\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ@\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¨\u0006!"}, mo13302d2 = {"Lcom/quickgame/android/sdk/login/UserController;", "", "()V", "accountLogin", "", "account", "", "passWord", "callBack", "Lcom/quickgame/android/sdk/http/HttpCallBack;", "Lorg/json/JSONObject;", "autoLogin", "token", "changePassword", "oldPwd", "newPwd", "getEmailCode", "email", "sendType", "", "guestBindEmail", "code", "guestLogin", "registerEmailAccount", "password", "resetPassword", "newPassword", "thirdLogin", "openType", "userOpenId", "userName", "accessToken", "appToken", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.g.f */
public final class C1496f {

    /* renamed from: a */
    public static final C1496f f1411a = new C1496f();

    /* renamed from: com.quickgame.android.sdk.g.f$a */
    public static final class C1497a implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1412a;

        C1497a(C1426b bVar) {
            this.f1412a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 13);
            C1426b bVar = this.f1412a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1412a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$b */
    public static final class C1498b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1413a;

        C1498b(C1426b bVar) {
            this.f1413a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 11);
            C1426b bVar = this.f1413a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1413a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$c */
    public static final class C1499c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1414a;

        C1499c(C1426b bVar) {
            this.f1414a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1426b bVar = this.f1414a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1414a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$d */
    public static final class C1500d implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1415a;

        C1500d(C1426b bVar) {
            this.f1415a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1426b bVar = this.f1415a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1415a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$e */
    public static final class C1501e implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1416a;

        C1501e(C1426b bVar) {
            this.f1416a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 12);
            C1426b bVar = this.f1416a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1416a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$f */
    public static final class C1502f implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1417a;

        C1502f(C1426b bVar) {
            this.f1417a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 14);
            C1426b bVar = this.f1417a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1417a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$g */
    public static final class C1503g implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1418a;

        C1503g(C1426b bVar) {
            this.f1418a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 13);
            C1426b bVar = this.f1418a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1418a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$h */
    public static final class C1504h implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1419a;

        C1504h(C1426b bVar) {
            this.f1419a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 12);
            C1426b bVar = this.f1419a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1419a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.f$i */
    public static final class C1505i implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1426b f1420a;

        C1505i(C1426b bVar) {
            this.f1420a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1544i.m1891a(jSONObject.optString("data"), 13);
            C1426b bVar = this.f1420a;
            if (bVar != null) {
                bVar.onSuccess(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1426b bVar = this.f1420a;
            if (bVar != null) {
                bVar.onFailed(cVar);
            }
        }
    }

    private C1496f() {
    }

    /* renamed from: a */
    public final void mo12767a(C1426b<JSONObject> bVar) {
        HashMap hashMap = new HashMap();
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (C1601d.m2073g(r.mo11981e())) {
            hashMap.put("prereg", "1");
        }
        C1428d.m1703a("/v1/user/registerVisitor", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1502f(bVar));
    }

    /* renamed from: b */
    public final void mo12774b(String str, String str2, String str3, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        HashMap hashMap = new HashMap();
        if (str3 != null && str3.length() > 0) {
            hashMap.put("vcode", str3);
        }
        hashMap.put("username", str);
        String a = C1601d.m2061a(str2);
        Intrinsics.checkNotNullExpressionValue(a, "SDKUtils.getMD5Str(password)");
        hashMap.put("password", a);
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (C1601d.m2073g(r.mo11981e())) {
            hashMap.put("prereg", "1");
        }
        C1428d.m1703a("/v1/user/registerUser", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1503g(bVar));
    }

    /* renamed from: c */
    public final void mo12775c(String str, String str2, String str3, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        hashMap.put("code", str2);
        String a = C1601d.m2061a(str3);
        Intrinsics.checkNotNullExpressionValue(a, "SDKUtils.getMD5Str(newPassword)");
        hashMap.put("newPassword", a);
        C1428d.m1703a("/v1/user/findPassByEmail", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1504h(bVar));
    }

    /* renamed from: a */
    public final void mo12769a(String str, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "token");
        HashMap hashMap = new HashMap();
        hashMap.put("authToken", str);
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (C1601d.m2073g(r.mo11981e())) {
            hashMap.put("prereg", "1");
        }
        C1428d.m1703a("/v1/user/autoLogin", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1498b(bVar));
    }

    /* renamed from: a */
    public final void mo12772a(String str, String str2, String str3, String str4, String str5, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "openType");
        Intrinsics.checkNotNullParameter(str2, "userOpenId");
        Intrinsics.checkNotNullParameter(str4, SDKConstants.PARAM_ACCESS_TOKEN);
        Intrinsics.checkNotNullParameter(str5, "appToken");
        HashMap hashMap = new HashMap();
        hashMap.put("openType", str);
        hashMap.put("userOpenId", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("otherAccountName", str3);
        hashMap.put("access_token", str4);
        hashMap.put("appToken", str5);
        if (QGConstant.LOGIN_OPEN_TYPE_TAPTAP.equals(str)) {
            hashMap.put("mac_key", str5);
            hashMap.put("appToken", "");
        }
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (C1601d.m2073g(r.mo11981e())) {
            hashMap.put("prereg", "1");
        }
        C1538f.m1861l().mo12849k();
        C1428d.m1703a("/v1/user/userLoginByOtherSdk", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1505i(bVar));
    }

    /* renamed from: b */
    public final void mo12773b(String str, String str2, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "oldPwd");
        Intrinsics.checkNotNullParameter(str2, "newPwd");
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (l.mo12847i() != null) {
            HashMap hashMap = new HashMap();
            C1538f l2 = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
            QGUserData i = l2.mo12847i();
            Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
            String uid = i.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
            hashMap.put("uid", uid);
            String a = C1601d.m2061a(str);
            Intrinsics.checkNotNullExpressionValue(a, "SDKUtils.getMD5Str(oldPwd)");
            hashMap.put("oldPassword", a);
            String a2 = C1601d.m2061a(str2);
            Intrinsics.checkNotNullExpressionValue(a2, "SDKUtils.getMD5Str(newPwd)");
            hashMap.put("newPassword", a2);
            C1428d.m1703a("/v1/auth/changePassword", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1499c(bVar));
        } else if (bVar != null) {
            bVar.onFailed(new C1427c(-1, "not login"));
        }
    }

    /* renamed from: a */
    public final void mo12770a(String str, String str2, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "account");
        Intrinsics.checkNotNullParameter(str2, "passWord");
        HashMap hashMap = new HashMap();
        hashMap.put("username", str);
        String a = C1601d.m2061a(str2);
        Intrinsics.checkNotNullExpressionValue(a, "SDKUtils.getMD5Str(passWord)");
        hashMap.put("password", a);
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (C1601d.m2073g(r.mo11981e())) {
            hashMap.put("prereg", "1");
        }
        C1428d.m1703a("/v1/user/loginByName", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1497a(bVar));
    }

    /* renamed from: a */
    public final void mo12771a(String str, String str2, String str3, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "passWord");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("email", str);
        hashMap.put("code", str2);
        String a = C1601d.m2061a(str3);
        Intrinsics.checkNotNullExpressionValue(a, "SDKUtils.getMD5Str(passWord)");
        hashMap.put("password", a);
        C1428d.m1703a("/v1/auth/bindMail", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1501e(bVar));
    }

    /* renamed from: a */
    public final void mo12768a(String str, int i, C1426b<JSONObject> bVar) {
        Intrinsics.checkNotNullParameter(str, "email");
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        hashMap.put("sendType", Integer.valueOf(i));
        C1428d.m1703a("/v1/user/sendCodeByEmail", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1500d(bVar));
    }
}
