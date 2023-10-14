package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p038g.C1496f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000f"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/BindEmailPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/BindEmailPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/BindEmailPresenter$View;)V", "getEmailCode", "", "email", "", "bindType", "", "guestRegisterEmailAccount", "code", "password", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.a */
public final class C1619a extends C1618a<C1620a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.a$a */
    public interface C1620a {
        /* renamed from: a */
        void mo12027a(C1427c cVar);

        /* renamed from: l */
        void mo12028l(String str);

        /* renamed from: o */
        void mo12029o();

        /* renamed from: p */
        void mo12031p(String str);
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.a$b */
    public static final class C1621b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1619a f1650a;

        C1621b(C1619a aVar) {
            this.f1650a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1620a a = C1619a.m2130a(this.f1650a);
            if (a != null) {
                a.mo12029o();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1620a a = C1619a.m2130a(this.f1650a);
            if (a != null) {
                a.mo12028l(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.a$c */
    public static final class C1622c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1619a f1651a;

        C1622c(C1619a aVar) {
            this.f1651a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1620a a = C1619a.m2130a(this.f1651a);
            if (a != null) {
                String optString = jSONObject.optString("data");
                Intrinsics.checkNotNullExpressionValue(optString, "result.optString(\"data\")");
                a.mo12031p(optString);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1620a a = C1619a.m2130a(this.f1651a);
            if (a != null) {
                a.mo12027a(cVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1619a(C1620a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1620a m2130a(C1619a aVar) {
        return (C1620a) aVar.f1649a;
    }

    /* renamed from: a */
    public final void mo13111a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "password");
        C1496f.f1411a.mo12771a(str, str2, str3, new C1622c(this));
    }

    /* renamed from: a */
    public final void mo13110a(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "email");
        C1496f.f1411a.mo12768a(str, i, (C1426b<JSONObject>) new C1621b(this));
    }
}
