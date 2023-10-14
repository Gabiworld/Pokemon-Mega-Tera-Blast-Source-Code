package com.quickgame.android.sdk.p038g;

import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.p039h.C1541g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.quickgame.android.sdk.g.e */
public final class C1495e {

    /* renamed from: a */
    public static final C1495e f1410a = new C1495e();

    private C1495e() {
    }

    /* renamed from: a */
    public C1444a mo12763a() {
        C1444a aVar;
        if (C1541g.m1887a().f1482e) {
            C1481d c = C1481d.m1774c();
            Intrinsics.checkNotNullExpressionValue(c, "LoginFragmentKorea.newInstance()");
            return c;
        }
        if (C1541g.m1887a().f1483f) {
            aVar = C1468c.m1758c();
        } else {
            aVar = C1446b.m1737d();
        }
        Intrinsics.checkNotNullExpressionValue(aVar, "if (SDKMetaManager.getIn…t.newInstance()\n        }");
        return aVar;
    }

    /* renamed from: a */
    public void mo12764a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, SDKConstants.PARAM_INTENT);
    }

    /* renamed from: a */
    public void mo12765a(BaseActivity baseActivity, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "activity");
    }

    /* renamed from: b */
    public C1444a mo12766b() {
        C1446b d = C1446b.m1737d();
        Intrinsics.checkNotNullExpressionValue(d, "LoginFragment.newInstance()");
        return d;
    }
}
