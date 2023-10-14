package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000f"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/ThirdLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/ThirdLoginPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/ThirdLoginPresenter$View;)V", "bindThirdLogin", "", "userOpenId", "", "otherAccountName", "openType", "accessToken", "appToken", "unBindThirdLogin", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.j */
public final class C1664j extends C1618a<C1665a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.j$a */
    public interface C1665a {
        /* renamed from: c */
        void mo12038c(String str);

        /* renamed from: e */
        void mo12039e(String str);

        /* renamed from: g */
        void mo12040g(String str);

        /* renamed from: t */
        void mo12041t(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.j$b */
    public static final class C1666b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1664j f1682a;

        C1666b(C1664j jVar) {
            this.f1682a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r2 = r2.optJSONObject("userData");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(org.json.JSONObject r5) {
            /*
                r4 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.quickgame.android.sdk.h.f r0 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                java.lang.String r1 = "SDKDataManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r1 = "data"
                org.json.JSONObject r2 = r5.optJSONObject(r1)
                if (r2 == 0) goto L_0x0025
                java.lang.String r3 = "userData"
                org.json.JSONObject r2 = r2.optJSONObject(r3)
                if (r2 == 0) goto L_0x0025
                java.lang.String r3 = "bindInfo"
                org.json.JSONObject r2 = r2.optJSONObject(r3)
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                com.quickgame.android.sdk.bean.QGUserBindInfo r2 = com.quickgame.android.sdk.p039h.C1544i.m1890a(r2)
                r0.mo12828a((com.quickgame.android.sdk.bean.QGUserBindInfo) r2)
                com.quickgame.android.sdk.mvp.b.j r0 = r4.f1682a
                com.quickgame.android.sdk.mvp.b.j$a r0 = com.quickgame.android.sdk.mvp.p044b.C1664j.m2254a(r0)
                if (r0 == 0) goto L_0x0041
                java.lang.String r5 = r5.optString(r1)
                java.lang.String r1 = "result.optString(\"data\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
                r0.mo12038c(r5)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.mvp.p044b.C1664j.C1666b.onSuccess(org.json.JSONObject):void");
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1665a a = C1664j.m2254a(this.f1682a);
            if (a != null) {
                a.mo12040g(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.j$c */
    public static final class C1667c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1664j f1683a;

        C1667c(C1664j jVar) {
            this.f1683a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r2 = r2.optJSONObject("userData");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(org.json.JSONObject r5) {
            /*
                r4 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.quickgame.android.sdk.h.f r0 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                java.lang.String r1 = "SDKDataManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r1 = "data"
                org.json.JSONObject r2 = r5.optJSONObject(r1)
                if (r2 == 0) goto L_0x0025
                java.lang.String r3 = "userData"
                org.json.JSONObject r2 = r2.optJSONObject(r3)
                if (r2 == 0) goto L_0x0025
                java.lang.String r3 = "bindInfo"
                org.json.JSONObject r2 = r2.optJSONObject(r3)
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                com.quickgame.android.sdk.bean.QGUserBindInfo r2 = com.quickgame.android.sdk.p039h.C1544i.m1890a(r2)
                r0.mo12828a((com.quickgame.android.sdk.bean.QGUserBindInfo) r2)
                com.quickgame.android.sdk.mvp.b.j r0 = r4.f1683a
                com.quickgame.android.sdk.mvp.b.j$a r0 = com.quickgame.android.sdk.mvp.p044b.C1664j.m2254a(r0)
                if (r0 == 0) goto L_0x0041
                java.lang.String r5 = r5.optString(r1)
                java.lang.String r1 = "result.optString(\"data\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
                r0.mo12041t(r5)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.mvp.p044b.C1664j.C1667c.onSuccess(org.json.JSONObject):void");
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1665a a = C1664j.m2254a(this.f1683a);
            if (a != null) {
                a.mo12039e(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1664j(C1665a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1665a m2254a(C1664j jVar) {
        return (C1665a) jVar.f1649a;
    }

    /* renamed from: a */
    public final void mo13163a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "userOpenId");
        Intrinsics.checkNotNullParameter(str2, "otherAccountName");
        Intrinsics.checkNotNullParameter(str3, "openType");
        Intrinsics.checkNotNullParameter(str4, SDKConstants.PARAM_ACCESS_TOKEN);
        Intrinsics.checkNotNullParameter(str5, "appToken");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("userOpenId", str);
        hashMap.put("otherAccountName", str2);
        hashMap.put("openType", str3);
        hashMap.put("access_token", str4);
        hashMap.put("appToken", str5);
        if (str3.equals(QGConstant.LOGIN_OPEN_TYPE_TAPTAP)) {
            hashMap.put("mac_key", str5);
            hashMap.put("appToken", "");
        }
        C1428d.m1703a("/v1/auth/userBindOtherSdk", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1666b(this));
    }

    /* renamed from: a */
    public final void mo13162a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "userOpenId");
        Intrinsics.checkNotNullParameter(str2, "openType");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("userOpenId", str);
        hashMap.put("openType", str2);
        C1428d.m1703a("/v1/auth/unBindOtherInfo", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1667c(this));
    }
}
