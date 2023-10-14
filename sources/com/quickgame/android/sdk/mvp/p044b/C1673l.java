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
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/UserCenterPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/UserCenterPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/UserCenterPresenter$View;)V", "getCdKey", "", "getUserInfo", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.l */
public final class C1673l extends C1618a<C1674a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.l$a */
    public interface C1674a {
        /* renamed from: a */
        void mo12121a(JSONObject jSONObject);

        /* renamed from: j */
        void mo12123j();

        /* renamed from: m */
        void mo12124m(String str);

        /* renamed from: v */
        void mo12128v(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.l$b */
    public static final class C1675b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1673l f1686a;

        C1675b(C1673l lVar) {
            this.f1686a = lVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1674a a = C1673l.m2270a(this.f1686a);
            if (a != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "result.getJSONObject(\"data\")");
                a.mo12121a(jSONObject2);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1674a a = C1673l.m2270a(this.f1686a);
            if (a != null) {
                a.mo12124m(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.l$c */
    public static final class C1676c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1673l f1687a;

        C1676c(C1673l lVar) {
            this.f1687a = lVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "result.getJSONObject(\"data\")");
            if (C1538f.m1861l().mo12836a(jSONObject2)) {
                C1674a a = C1673l.m2270a(this.f1687a);
                if (a != null) {
                    a.mo12123j();
                    return;
                }
                return;
            }
            C1674a a2 = C1673l.m2270a(this.f1687a);
            if (a2 != null) {
                String jSONObject3 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "result.toString()");
                a2.mo12128v(jSONObject3);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1674a a = C1673l.m2270a(this.f1687a);
            if (a != null) {
                a.mo12128v(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1673l(C1674a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1674a m2270a(C1673l lVar) {
        return (C1674a) lVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13170b() {
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        C1428d.m1703a("/v1/auth/viewMigCode", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1675b(this));
    }

    /* renamed from: c */
    public final void mo13171c() {
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        C1428d.m1703a("/v1/auth/getUserInfo", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1676c(this));
    }
}
