package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.SDKConfig;
import com.quickgame.android.sdk.model.C1607a;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1633d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014¨\u0006\u0011"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/FreeLoginActivity;", "Lcom/quickgame/android/sdk/mvp/MvpBaseActivity;", "Lcom/quickgame/android/sdk/mvp/presenter/FreeLoginLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/FreeLoginLoginPresenter$View;", "()V", "createPresenter", "loginFailed", "", "msg", "", "loginSuccess", "onAutoLoginFailed", "onAutoLoginSuccess", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class FreeLoginActivity extends MvpBaseActivity<C1633d> implements C1633d.C1634a {

    /* renamed from: c */
    public static final C1181a f721c = new C1181a((DefaultConstructorMarker) null);

    /* renamed from: com.quickgame.android.sdk.activity.FreeLoginActivity$a */
    public static final class C1181a {
        private C1181a() {
        }

        /* renamed from: a */
        public final void mo12096a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, FreeLoginActivity.class));
        }

        public /* synthetic */ C1181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo12092a() {
        mo12280p();
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* renamed from: b */
    public void mo12094b() {
        mo12280p();
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.sdk_activity_free_login);
        Log.d("QGFreeLoginActivity", "onCreate");
        mo12282w("");
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (!r.mo11999l().noAutoLogin()) {
            C1609b d = C1609b.m2099d();
            Intrinsics.checkNotNullExpressionValue(d, "LocalTokenManager.getInstance()");
            C1607a b = d.mo13085b();
            if (!TextUtils.isEmpty(b.mo13078b()) && !TextUtils.isEmpty(b.mo13080c())) {
                Log.d("QGFreeLoginActivity", "auto login");
                String c = b.mo13080c();
                Intrinsics.checkNotNullExpressionValue(c, "lastLoginToken");
                ((C1633d) this.f1648b).mo13126a(c);
                return;
            }
        }
        Log.d("QGFreeLoginActivity", "guest login");
        ((C1633d) this.f1648b).mo13127b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C1633d m1036r() {
        return new C1633d(this);
    }

    /* renamed from: a */
    public void mo12093a(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        ((C1633d) this.f1648b).mo13127b();
    }

    /* renamed from: b */
    public void mo12095b(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        mo12280p();
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        SDKConfig l = r.mo11999l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKImpl.getInstance().sdkConfig");
        if (l.isNoLoginView()) {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            C1128a.m798r().mo11957a(qGUserHolder);
        } else {
            HWLoginActivity.m1115a((Activity) this, false);
        }
        finish();
    }
}
