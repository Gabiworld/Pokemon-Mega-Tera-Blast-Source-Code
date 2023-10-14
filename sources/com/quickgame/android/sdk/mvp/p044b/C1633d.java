package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p038g.C1496f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u000b"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/FreeLoginLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/FreeLoginLoginPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/FreeLoginLoginPresenter$View;)V", "autoLogin", "", "token", "", "guestLogin", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.d */
public final class C1633d extends C1618a<C1634a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.d$a */
    public interface C1634a {
        /* renamed from: a */
        void mo12092a();

        /* renamed from: a */
        void mo12093a(String str);

        /* renamed from: b */
        void mo12094b();

        /* renamed from: b */
        void mo12095b(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.d$b */
    public static final class C1635b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1633d f1658a;

        C1635b(C1633d dVar) {
            this.f1658a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1634a a = C1633d.m2172a(this.f1658a);
            if (a != null) {
                a.mo12092a();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1634a a = C1633d.m2172a(this.f1658a);
            if (a != null) {
                a.mo12093a(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.d$c */
    public static final class C1636c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1633d f1659a;

        C1636c(C1633d dVar) {
            this.f1659a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1634a a = C1633d.m2172a(this.f1659a);
            if (a != null) {
                a.mo12094b();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1634a a = C1633d.m2172a(this.f1659a);
            if (a != null) {
                a.mo12095b(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1633d(C1634a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1634a m2172a(C1633d dVar) {
        return (C1634a) dVar.f1649a;
    }

    /* renamed from: b */
    public final void mo13127b() {
        C1496f.f1411a.mo12767a(new C1636c(this));
    }

    /* renamed from: a */
    public final void mo13126a(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        C1496f.f1411a.mo12769a(str, new C1635b(this));
    }
}
