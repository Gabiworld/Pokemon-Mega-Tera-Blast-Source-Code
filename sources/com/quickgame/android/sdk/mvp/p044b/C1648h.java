package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p038g.C1496f;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1544i;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0006J0\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJ \u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b¨\u0006!"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/NormalLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/NormalLoginPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/NormalLoginPresenter$View;)V", "accountLogin", "", "account", "", "password", "autoLogin", "authToken", "checkGuestRegister", "CDKey", "getEmailCode", "email", "sendType", "", "guestBindEmail", "code", "guestLogin", "loginThird", "openType", "userOpenId", "userName", "accessToken", "appToken", "registerAccount", "resetEmailPassword", "verifyNumber", "newPassword", "useCdKeyLogin", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.h */
public final class C1648h extends C1618a<C1649a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$a */
    public interface C1649a {
        /* renamed from: a */
        void mo12102a();

        /* renamed from: a */
        void mo12103a(String str);

        /* renamed from: a */
        void mo12104a(String str, int i);

        /* renamed from: a */
        void mo12105a(String str, int i, String str2);

        /* renamed from: b */
        void mo12106b(JSONObject jSONObject);

        /* renamed from: k */
        void mo12107k();

        /* renamed from: u */
        void mo12111u(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$b */
    public static final class C1650b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1667a;

        C1650b(C1648h hVar) {
            this.f1667a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1271b.m1332e();
            C1649a a = C1648h.m2221a(this.f1667a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1271b.m1331d();
            C1649a a = C1648h.m2221a(this.f1667a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$c */
    public static final class C1651c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1668a;

        C1651c(C1648h hVar) {
            this.f1668a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1271b.m1327b();
            C1649a a = C1648h.m2221a(this.f1668a);
            if (a != null) {
                a.mo12102a();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1271b.m1325a();
            C1649a a = C1648h.m2221a(this.f1668a);
            if (a != null) {
                a.mo12103a(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$d */
    public static final class C1652d implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1669a;

        /* renamed from: b */
        final /* synthetic */ String f1670b;

        C1652d(C1648h hVar, String str) {
            this.f1669a = hVar;
            this.f1670b = str;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "result.getJSONObject(\"data\")");
            jSONObject2.put("cdkey", this.f1670b);
            C1649a a = C1648h.m2221a(this.f1669a);
            if (a != null) {
                a.mo12106b(jSONObject);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1649a a = C1648h.m2221a(this.f1669a);
            if (a != null) {
                a.mo12106b(new JSONObject());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$e */
    public static final class C1653e implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1671a;

        /* renamed from: b */
        final /* synthetic */ String f1672b;

        /* renamed from: c */
        final /* synthetic */ int f1673c;

        C1653e(C1648h hVar, String str, int i) {
            this.f1671a = hVar;
            this.f1672b = str;
            this.f1673c = i;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1649a a = C1648h.m2221a(this.f1671a);
            if (a != null) {
                a.mo12104a(this.f1672b, this.f1673c);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1649a a = C1648h.m2221a(this.f1671a);
            if (a != null) {
                a.mo12105a(this.f1672b, this.f1673c, cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$f */
    public static final class C1654f implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1674a;

        C1654f(C1648h hVar) {
            this.f1674a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1649a a = C1648h.m2221a(this.f1674a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1649a a = C1648h.m2221a(this.f1674a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$g */
    public static final class C1655g implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1675a;

        C1655g(C1648h hVar) {
            this.f1675a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1271b.m1343p();
            C1649a a = C1648h.m2221a(this.f1675a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1271b.m1342o();
            C1649a a = C1648h.m2221a(this.f1675a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$h */
    public static final class C1656h implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1676a;

        /* renamed from: b */
        final /* synthetic */ String f1677b;

        C1656h(C1648h hVar, String str) {
            this.f1676a = hVar;
            this.f1677b = str;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1271b.m1328b(this.f1677b);
            C1649a a = C1648h.m2221a(this.f1676a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1271b.m1326a(this.f1677b);
            C1649a a = C1648h.m2221a(this.f1676a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$i */
    public static final class C1657i implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1678a;

        C1657i(C1648h hVar) {
            this.f1678a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1271b.m1352y();
            C1649a a = C1648h.m2221a(this.f1678a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1271b.m1351x();
            C1649a a = C1648h.m2221a(this.f1678a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$j */
    public static final class C1658j implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1679a;

        C1658j(C1648h hVar) {
            this.f1679a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1649a a = C1648h.m2221a(this.f1679a);
            if (a != null) {
                a.mo12107k();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1649a a = C1648h.m2221a(this.f1679a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.h$k */
    public static final class C1659k implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1648h f1680a;

        C1659k(C1648h hVar) {
            this.f1680a = hVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            if (C1544i.m1891a(jSONObject.optString("data"), 14)) {
                C1649a a = C1648h.m2221a(this.f1680a);
                if (a != null) {
                    a.mo12107k();
                    return;
                }
                return;
            }
            C1649a a2 = C1648h.m2221a(this.f1680a);
            if (a2 != null) {
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "result.toString()");
                a2.mo12111u(jSONObject2);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1649a a = C1648h.m2221a(this.f1680a);
            if (a != null) {
                a.mo12111u(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1648h(C1649a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1649a m2221a(C1648h hVar) {
        return (C1649a) hVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13147b(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        C1271b.m1353z();
        C1496f.f1411a.mo12774b(str, str2, str3, new C1657i(this));
    }

    /* renamed from: c */
    public final void mo13149c(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "verifyNumber");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        C1496f.f1411a.mo12775c(str, str2, str3, new C1658j(this));
    }

    /* renamed from: a */
    public final void mo13144a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "openType");
        Intrinsics.checkNotNullParameter(str2, "userOpenId");
        Intrinsics.checkNotNullParameter(str4, SDKConstants.PARAM_ACCESS_TOKEN);
        Intrinsics.checkNotNullParameter(str5, "appToken");
        C1271b.m1330c(str);
        C1496f.f1411a.mo12772a(str, str2, str3, str4, str5, new C1656h(this, str));
    }

    /* renamed from: c */
    public final void mo13148c(String str) {
        Intrinsics.checkNotNullParameter(str, "CDKey");
        HashMap hashMap = new HashMap();
        hashMap.put("cdkey", str);
        C1428d.m1703a("/v1/user/actCdKey", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1659k(this));
    }

    /* renamed from: b */
    public final void mo13145b() {
        C1271b.m1344q();
        C1496f.f1411a.mo12767a(new C1655g(this));
    }

    /* renamed from: a */
    public final void mo13142a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "account");
        Intrinsics.checkNotNullParameter(str2, "password");
        C1271b.m1333f();
        C1538f.m1861l().mo12849k();
        C1496f.f1411a.mo12770a(str, str2, (C1426b<JSONObject>) new C1650b(this));
    }

    /* renamed from: b */
    public final void mo13146b(String str) {
        Intrinsics.checkNotNullParameter(str, "CDKey");
        C1428d.m1703a("/v1/user/ckRegVistor", (Map<String, Object>) null, (C1426b<JSONObject>) new C1652d(this, str));
    }

    /* renamed from: a */
    public final void mo13140a(String str) {
        Intrinsics.checkNotNullParameter(str, "authToken");
        C1271b.m1329c();
        C1496f.f1411a.mo12769a(str, new C1651c(this));
    }

    /* renamed from: a */
    public final void mo13141a(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "email");
        C1496f.f1411a.mo12768a(str, i, (C1426b<JSONObject>) new C1653e(this, str, i));
    }

    /* renamed from: a */
    public final void mo13143a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "password");
        C1496f.f1411a.mo12771a(str, str2, str3, new C1654f(this));
    }
}
