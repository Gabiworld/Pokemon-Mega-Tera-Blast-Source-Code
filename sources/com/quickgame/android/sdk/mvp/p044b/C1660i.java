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

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/RecoverAccountPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/RecoverAccountPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/RecoverAccountPresenter$View;)V", "recover", "", "Companion", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.i */
public final class C1660i extends C1618a<C1662b> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.i$a */
    public static final class C1661a {
        private C1661a() {
        }

        public /* synthetic */ C1661a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.i$b */
    public interface C1662b {
        /* renamed from: d */
        void mo12022d();

        /* renamed from: q */
        void mo12023q(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.i$c */
    public static final class C1663c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1660i f1681a;

        C1663c(C1660i iVar) {
            this.f1681a = iVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1662b a = C1660i.m2249a(this.f1681a);
            if (a != null) {
                a.mo12022d();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1662b a = C1660i.m2249a(this.f1681a);
            if (a != null) {
                a.mo12023q(cVar.mo12663b());
            }
        }
    }

    static {
        new C1661a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1660i(C1662b bVar) {
        super(bVar);
        Intrinsics.checkNotNullParameter(bVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1662b m2249a(C1660i iVar) {
        return (C1662b) iVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13160b() {
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (l.mo12847i() == null) {
            C1662b bVar = (C1662b) this.f1649a;
            if (bVar != null) {
                bVar.mo12023q("user is not logged in");
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
        hashMap.put("tStatus", 2);
        C1428d.m1703a("/v1/auth/cUserTrash", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1663c(this));
    }
}
