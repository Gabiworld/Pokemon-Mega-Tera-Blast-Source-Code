package com.quickgame.android.sdk.p039h;

import android.content.SharedPreferences;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.activity.GuestTipsAfterPayActivity;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.listener.GooglePreRegisterListener;
import com.quickgame.android.sdk.model.C1612d;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p040i.C1576c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.quickgame.android.sdk.h.a */
public final class C1506a implements QuickGameManager.SDKCallback, QuickGameManager.QGPaymentCallback {
    public void onGooglePlaySub(String str, String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "productId");
        Intrinsics.checkNotNullParameter(str2, "sdkOrder");
        C1534e.f1462f.mo12826e().onGooglePlaySub(str, str2, z, z2);
    }

    public void onInitFinished(boolean z) {
        C1534e.f1462f.mo12826e().onInitFinished(z);
    }

    public void onLoginFinished(QGUserData qGUserData, QGUserHolder qGUserHolder) {
        Intrinsics.checkNotNullParameter(qGUserHolder, "userHolder");
        if (qGUserData != null && 1 == qGUserHolder.getStateCode()) {
            C1271b.m1347t();
            C1268a.m1311a(qGUserData.getUid(), qGUserData.getUserName(), qGUserData.getOpenType());
        } else if (3 == qGUserHolder.getStateCode()) {
            C1268a.m1318c(qGUserHolder.getMsg());
            C1271b.m1346s();
        } else if (2 == qGUserHolder.getStateCode()) {
            C1271b.m1345r();
        }
        C1534e.f1462f.mo12826e().onLoginFinished(qGUserData, qGUserHolder);
        C1576c b = C1576c.m1961b();
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        b.mo12896a(r.mo11968b());
        if (qGUserData != null && qGUserHolder.getStateCode() == 1 && C1534e.f1462f.mo12825d() != null) {
            C1128a r2 = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
            SharedPreferences sharedPreferences = r2.mo11968b().getSharedPreferences("preRegistration", 0);
            if (sharedPreferences.getBoolean("preRegistration", false)) {
                GooglePreRegisterListener d = C1534e.f1462f.mo12825d();
                Intrinsics.checkNotNull(d);
                d.onCheckSuccess();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("preRegistration", false);
                edit.apply();
            }
        }
    }

    public void onLogout() {
        C1268a.m1317c();
        C1534e.f1462f.mo12826e().onLogout();
    }

    public void onPayCancel(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "productOrderId");
        Intrinsics.checkNotNullParameter(str3, "errorMessage");
        C1268a.m1319d();
        C1534e.f1462f.mo12824c().onPayCancel(str, str2, str3);
    }

    public void onPayFailed(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "productOrderId");
        Intrinsics.checkNotNullParameter(str3, "errorMessage");
        C1268a.m1320d(str3);
        C1534e.f1462f.mo12824c().onPayFailed(str, str2, str3);
    }

    public void onPaySuccess(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "productOrderId");
        Intrinsics.checkNotNullParameter(str2, "orderNo");
        Intrinsics.checkNotNullParameter(str3, "goodsId");
        Intrinsics.checkNotNullParameter(str4, "extraParams");
        C1534e.f1462f.mo12824c().onPaySuccess(str, str2, str3, str4);
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        C1538f l2 = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
        C1613e e = l2.mo12843e();
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        SharedPreferences sharedPreferences = r.mo11981e().getSharedPreferences("information", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "SDKImpl.getInstance().co…n\", Context.MODE_PRIVATE)");
        Intrinsics.checkNotNullExpressionValue(i, "userData");
        if (i.isGuest() && e != null) {
            C1612d d = e.mo13107d();
            Intrinsics.checkNotNullExpressionValue(d, "accessToken.productConfig");
            if (d.mo13095d() && sharedPreferences.getBoolean("guestTipsShow", true)) {
                C1128a r2 = C1128a.m798r();
                Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
                GuestTipsAfterPayActivity.m1054a(r2.mo11968b());
            }
        }
    }
}
