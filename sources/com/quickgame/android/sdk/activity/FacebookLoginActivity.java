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
import com.quickgame.android.sdk.mvp.p044b.C1623b;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\"\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/FacebookLoginActivity;", "Lcom/quickgame/android/sdk/mvp/MvpBaseActivity;", "Lcom/quickgame/android/sdk/mvp/presenter/FacebookLoginPresenter;", "Lcom/quickgame/android/sdk/mvp/presenter/FacebookLoginPresenter$View;", "()V", "fbLoginManager", "Lcom/quickgame/android/sdk/thirdlogin/FacebookManager;", "createPresenter", "handleLoginCancelOrFailed", "", "msg", "", "isCancel", "", "loginFailed", "loginSuccess", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAutoLoginFailed", "onAutoLoginSuccess", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startFbLogin", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class FacebookLoginActivity extends MvpBaseActivity<C1623b> implements C1623b.C1626c {

    /* renamed from: d */
    public static final C1169a f684d = new C1169a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final C1684b f685c = new C1684b();

    /* renamed from: com.quickgame.android.sdk.activity.FacebookLoginActivity$a */
    public static final class C1169a {
        private C1169a() {
        }

        /* renamed from: a */
        public final void mo12071a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, FacebookLoginActivity.class));
        }

        public /* synthetic */ C1169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookLoginActivity$b */
    public static final class C1170b extends C1710i {

        /* renamed from: a */
        final /* synthetic */ FacebookLoginActivity f686a;

        C1170b(FacebookLoginActivity facebookLoginActivity) {
            this.f686a = facebookLoginActivity;
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            super.mo12042a(str, str2, str3, str4, str5);
            this.f686a.mo12282w("");
            FacebookLoginActivity.m968a(this.f686a).mo13115a(str, str2, str3);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            super.mo12043b(str);
            FacebookLoginActivity.m970a(this.f686a, str, false, 2, (Object) null);
            this.f686a.finish();
        }

        public void onLoginCancel() {
            super.onLoginCancel();
            this.f686a.m971a("cancel", true);
            this.f686a.finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1623b m968a(FacebookLoginActivity facebookLoginActivity) {
        return (C1623b) facebookLoginActivity.f1648b;
    }

    /* renamed from: s */
    private final void m972s() {
        this.f685c.mo13196a((C1690d) new C1170b(this));
        this.f685c.mo13195a((Activity) this);
    }

    /* renamed from: b */
    public void mo12069b() {
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
        this.f685c.mo13194a(i, i2, intent);
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
                ((C1623b) this.f1648b).mo13114a(c);
                return;
            }
        }
        m972s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C1623b m978r() {
        return new C1623b(this);
    }

    /* renamed from: a */
    public void mo12067a() {
        mo12280p();
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        finish();
    }

    /* renamed from: b */
    public void mo12070b(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        mo12280p();
        m970a(this, str, false, 2, (Object) null);
    }

    /* renamed from: a */
    public void mo12068a(String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        m972s();
    }

    /* renamed from: a */
    static /* synthetic */ void m970a(FacebookLoginActivity facebookLoginActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        facebookLoginActivity.m971a(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m971a(String str, boolean z) {
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
                qGUserHolder.setMsg(str);
            }
            C1128a.m798r().mo11957a(qGUserHolder);
        } else {
            HWLoginActivity.m1115a((Activity) this, false);
        }
        finish();
    }
}
