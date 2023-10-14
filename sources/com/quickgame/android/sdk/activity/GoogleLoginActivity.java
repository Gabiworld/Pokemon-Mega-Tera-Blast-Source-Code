package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.SDKConfig;
import com.quickgame.android.sdk.model.C1607a;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1637e;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\"\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/GoogleLoginActivity;", "Lcom/quickgame/android/sdk/mvp/MvpBaseActivity;", "Lcom/quickgame/android/sdk/mvp/presenter/GoogleLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/GoogleLoginPresenter$View;", "()V", "googleLoginManager", "Lcom/quickgame/android/sdk/thirdlogin/GoogleLoginManager;", "createPresenter", "handleLoginCancelOrFailed", "", "msg", "", "isCancel", "", "loginFailed", "loginSuccess", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAutoLoginFailed", "onAutoLoginSuccess", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startGoogleLogin", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class GoogleLoginActivity extends MvpBaseActivity<C1637e> implements C1637e.C1640c {

    /* renamed from: d */
    public static final C1182a f722d = new C1182a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final C1687c f723c = new C1687c();

    /* renamed from: com.quickgame.android.sdk.activity.GoogleLoginActivity$a */
    public static final class C1182a {
        private C1182a() {
        }

        /* renamed from: a */
        public final void mo12101a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, GoogleLoginActivity.class));
        }

        public /* synthetic */ C1182a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.GoogleLoginActivity$b */
    public static final class C1183b extends C1710i {

        /* renamed from: a */
        final /* synthetic */ GoogleLoginActivity f724a;

        C1183b(GoogleLoginActivity googleLoginActivity) {
            this.f724a = googleLoginActivity;
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            super.mo12042a(str, str2, str3, str4, str5);
            this.f724a.mo12282w("");
            GoogleLoginActivity.m1038a(this.f724a).mo13131a(str, str2, str3);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            super.mo12043b(str);
            GoogleLoginActivity.m1040a(this.f724a, str, false, 2, (Object) null);
        }

        public void onLoginCancel() {
            super.onLoginCancel();
            this.f724a.m1041a("cancel", true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1637e m1038a(GoogleLoginActivity googleLoginActivity) {
        return (C1637e) googleLoginActivity.f1648b;
    }

    /* renamed from: s */
    private final void m1042s() {
        this.f723c.mo13201a(this, new C1183b(this));
        this.f723c.mo13202b((Activity) this);
    }

    /* renamed from: b */
    public void mo12099b() {
        mo12280p();
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo12280p();
        this.f723c.mo13199a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo12282w("");
        C1609b d = C1609b.m2099d();
        Intrinsics.checkNotNullExpressionValue(d, "LocalTokenManager.getInstance()");
        C1607a b = d.mo13085b();
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (!r.mo11999l().noAutoLogin() && b != null) {
            String b2 = b.mo13078b();
            String c = b.mo13080c();
            if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(c)) {
                ((C1637e) this.f1648b).mo13130a(c);
                return;
            }
        }
        m1042s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C1637e m1048r() {
        return new C1637e(this);
    }

    /* renamed from: a */
    public void mo12097a() {
        mo12280p();
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* renamed from: b */
    public void mo12100b(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        mo12280p();
        m1040a(this, str, false, 2, (Object) null);
    }

    /* renamed from: a */
    public void mo12098a(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        m1042s();
    }

    /* renamed from: a */
    static /* synthetic */ void m1040a(GoogleLoginActivity googleLoginActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        googleLoginActivity.m1041a(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1041a(String str, boolean z) {
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        SDKConfig l = r.mo11999l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKImpl.getInstance().sdkConfig");
        if (l.isNoLoginView()) {
            QGUserHolder qGUserHolder = new QGUserHolder();
            if (z) {
                qGUserHolder.setStateCode(2);
            } else {
                qGUserHolder.setStateCode(3);
            }
            C1128a.m798r().mo11957a(qGUserHolder);
        } else {
            HWLoginActivity.m1115a((Activity) this, false);
        }
        finish();
    }
}
