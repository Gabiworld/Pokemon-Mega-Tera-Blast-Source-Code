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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/TrashAccountPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/TrashAccountPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/TrashAccountPresenter$View;)V", "userTrash", "", "userTrashForKorea", "Companion", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.k */
public final class C1668k extends C1618a<C1670b> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.k$a */
    public static final class C1669a {
        private C1669a() {
        }

        public /* synthetic */ C1669a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.k$b */
    public interface C1670b {
        /* renamed from: h */
        void mo12272h();

        /* renamed from: i */
        void mo12273i(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.k$c */
    public static final class C1671c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1668k f1684a;

        C1671c(C1668k kVar) {
            this.f1684a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1670b a = C1668k.m2263a(this.f1684a);
            if (a != null) {
                a.mo12272h();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1670b a = C1668k.m2263a(this.f1684a);
            if (a != null) {
                a.mo12273i(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.k$d */
    public static final class C1672d implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1668k f1685a;

        C1672d(C1668k kVar) {
            this.f1685a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1670b a = C1668k.m2263a(this.f1685a);
            if (a != null) {
                a.mo12272h();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1670b a = C1668k.m2263a(this.f1685a);
            if (a != null) {
                a.mo12273i(cVar.mo12663b());
            }
        }
    }

    static {
        new C1669a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1668k(C1670b bVar) {
        super(bVar);
        Intrinsics.checkNotNullParameter(bVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1670b m2263a(C1668k kVar) {
        return (C1670b) kVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13166b() {
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (l.mo12847i() == null) {
            C1670b bVar = (C1670b) this.f1649a;
            if (bVar != null) {
                bVar.mo12273i("user is not logged in");
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        C1538f l2 = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
        QGUserData i = l2.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        C1428d.m1703a("/v1/auth/rmUser", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1671c(this));
    }

    /* renamed from: c */
    public final void mo13167c() {
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (l.mo12847i() == null) {
            C1670b bVar = (C1670b) this.f1649a;
            if (bVar != null) {
                bVar.mo12273i("user is not logged in");
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        C1538f l2 = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
        QGUserData i = l2.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("tStatus", 1);
        C1428d.m1703a("/v1/auth/cUserTrash", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1672d(this));
    }
}
