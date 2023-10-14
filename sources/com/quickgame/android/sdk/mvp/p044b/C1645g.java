package com.quickgame.android.sdk.mvp.p044b;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p038g.C1496f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, mo13302d2 = {"Lcom/quickgame/android/sdk/mvp/presenter/ModifyPwdPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/ModifyPwdPresenter$View;", "view", "(Lcom/quickgame/android/sdk/mvp/presenter/ModifyPwdPresenter$View;)V", "updatePwd", "", "oldPwd", "", "newPwd", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.mvp.b.g */
public final class C1645g extends C1618a<C1646a> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.g$a */
    public interface C1646a {
        /* renamed from: f */
        void mo12200f(String str);

        /* renamed from: m */
        void mo12201m();
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.g$b */
    public static final class C1647b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1645g f1666a;

        C1647b(C1645g gVar) {
            this.f1666a = gVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1646a a = C1645g.m2216a(this.f1666a);
            if (a != null) {
                a.mo12201m();
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1646a a = C1645g.m2216a(this.f1666a);
            if (a != null) {
                a.mo12200f(cVar.mo12663b());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1645g(C1646a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1646a m2216a(C1645g gVar) {
        return (C1646a) gVar.f1649a;
    }

    /* renamed from: a */
    public final void mo13138a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "oldPwd");
        Intrinsics.checkNotNullParameter(str2, "newPwd");
        C1496f.f1411a.mo12773b(str, str2, new C1647b(this));
    }
}
