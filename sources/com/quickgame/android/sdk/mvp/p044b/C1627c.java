package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0010"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/FacebookSharePresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/FacebookSharePresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/FacebookSharePresenter$View;)V", "confirmLikeEvent", "", "serverId", "", "roleId", "fburl", "confirmShareEvent", "getFbActivity", "getFbLikeOrShareGift", "actId", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.c */
public final class C1627c extends C1618a<C1628a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.c$a */
    public interface C1628a {
        /* renamed from: a */
        void mo12073a(JSONArray jSONArray);

        /* renamed from: b */
        void mo12074b(JSONArray jSONArray);

        /* renamed from: c */
        void mo12075c(JSONArray jSONArray);

        /* renamed from: d */
        void mo12076d(JSONArray jSONArray);

        /* renamed from: h */
        void mo12078h(String str);

        /* renamed from: j */
        void mo12079j(String str);

        /* renamed from: k */
        void mo12080k(String str);

        /* renamed from: s */
        void mo12081s(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.c$b */
    public static final class C1629b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1627c f1654a;

        C1629b(C1627c cVar) {
            this.f1654a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1628a a = C1627c.m2155a(this.f1654a);
            if (a != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                Intrinsics.checkNotNull(optJSONArray);
                a.mo12075c(optJSONArray);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1628a a = C1627c.m2155a(this.f1654a);
            if (a != null) {
                a.mo12080k(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.c$c */
    public static final class C1630c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1627c f1655a;

        C1630c(C1627c cVar) {
            this.f1655a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1628a a = C1627c.m2155a(this.f1655a);
            if (a != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                Intrinsics.checkNotNull(optJSONArray);
                a.mo12073a(optJSONArray);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1628a a = C1627c.m2155a(this.f1655a);
            if (a != null) {
                a.mo12081s(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.c$d */
    public static final class C1631d implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1627c f1656a;

        C1631d(C1627c cVar) {
            this.f1656a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1628a a = C1627c.m2155a(this.f1656a);
            if (a != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                Intrinsics.checkNotNull(optJSONArray);
                a.mo12076d(optJSONArray);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1628a a = C1627c.m2155a(this.f1656a);
            if (a != null) {
                a.mo12079j(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.c$e */
    public static final class C1632e implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1627c f1657a;

        C1632e(C1627c cVar) {
            this.f1657a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1628a a = C1627c.m2155a(this.f1657a);
            if (a != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                Intrinsics.checkNotNull(optJSONArray);
                a.mo12074b(optJSONArray);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1628a a = C1627c.m2155a(this.f1657a);
            if (a != null) {
                a.mo12078h(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1627c(C1628a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1628a m2155a(C1627c cVar) {
        return (C1628a) cVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13120b(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "serverId");
        Intrinsics.checkNotNullParameter(str2, "roleId");
        Intrinsics.checkNotNullParameter(str3, "fburl");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("serverInfo", str);
        hashMap.put("roleInfo", str2);
        hashMap.put("fburl", str3);
        hashMap.put("shareStatus", "1");
        C1428d.m1703a("/v1/auth/fbShareEvent", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1630c(this));
    }

    /* renamed from: c */
    public final void mo13121c(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "serverId");
        Intrinsics.checkNotNullParameter(str2, "roleId");
        Intrinsics.checkNotNullParameter(str3, "actId");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("serverInfo", str);
        hashMap.put("roleInfo", str2);
        hashMap.put("actId", str3);
        hashMap.put("claimStatus", "1");
        C1428d.m1703a("/v1/auth/fbUserClaimEvent", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1632e(this));
    }

    /* renamed from: a */
    public final void mo13118a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "serverId");
        Intrinsics.checkNotNullParameter(str2, "roleId");
        HashMap hashMap = new HashMap();
        hashMap.put("serverInfo", str);
        hashMap.put("roleInfo", str2);
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        C1428d.m1703a("/v1/auth/fbActInit", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1631d(this));
    }

    /* renamed from: a */
    public final void mo13119a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "serverId");
        Intrinsics.checkNotNullParameter(str2, "roleId");
        Intrinsics.checkNotNullParameter(str3, "fburl");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("serverInfo", str);
        hashMap.put("roleInfo", str2);
        hashMap.put("edgeType", "1");
        hashMap.put("fburl", str3);
        C1428d.m1703a("/v1/auth/fbLikeEvent", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1629b(this));
    }
}
