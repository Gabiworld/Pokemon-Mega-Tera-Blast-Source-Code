package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.listener.CheckThirdLoginListener;
import com.quickgame.android.sdk.p039h.C1534e;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/CheckThirdLoginBindActivity;", "Lcom/quickgame/android/sdk/base/BaseActivity;", "()V", "fbLoginManager", "Lcom/quickgame/android/sdk/thirdlogin/FacebookManager;", "googleManager", "Lcom/quickgame/android/sdk/thirdlogin/GoogleLoginManager;", "thirdLoginListener", "com/quickgame/android/sdk/activity/CheckThirdLoginBindActivity$thirdLoginListener$2$1", "getThirdLoginListener", "()Lcom/quickgame/android/sdk/activity/CheckThirdLoginBindActivity$thirdLoginListener$2$1;", "thirdLoginListener$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class CheckThirdLoginBindActivity extends BaseActivity {

    /* renamed from: e */
    public static final C1163a f671e = new C1163a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C1684b f672b = new C1684b();

    /* renamed from: c */
    private final C1687c f673c = new C1687c();

    /* renamed from: d */
    private final Lazy f674d = LazyKt.lazy(new C1164b(this));

    /* renamed from: com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity$a */
    public static final class C1163a {
        private C1163a() {
        }

        /* renamed from: a */
        public final void mo12064a(Activity activity, String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(str, "type");
            Intent intent = new Intent(activity, CheckThirdLoginBindActivity.class);
            intent.putExtra("type", str);
            activity.startActivity(intent);
        }

        public /* synthetic */ C1163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo13302d2 = {"<anonymous>", "com/quickgame/android/sdk/activity/CheckThirdLoginBindActivity$thirdLoginListener$2$1", "invoke", "()Lcom/quickgame/android/sdk/activity/CheckThirdLoginBindActivity$thirdLoginListener$2$1;"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity$b */
    static final class C1164b extends Lambda implements Function0<C1165a> {

        /* renamed from: a */
        final /* synthetic */ CheckThirdLoginBindActivity f675a;

        /* renamed from: com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity$b$a */
        public static final class C1165a extends C1710i {

            /* renamed from: a */
            final /* synthetic */ C1164b f676a;

            C1165a(C1164b bVar) {
                this.f676a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo12042a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r0 = this;
                    super.mo12042a(r1, r2, r3, r4, r5)
                    com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity$b r2 = r0.f676a
                    com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity r2 = r2.f675a
                    r2.mo12280p()
                    com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity$b r2 = r0.f676a
                    com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity r2 = r2.f675a
                    r2.finish()
                    if (r5 != 0) goto L_0x0015
                    goto L_0x00a5
                L_0x0015:
                    int r2 = r5.hashCode()
                    r3 = 54
                    if (r2 == r3) goto L_0x0092
                    r3 = 56
                    if (r2 == r3) goto L_0x007f
                    r3 = 1570(0x622, float:2.2E-42)
                    if (r2 == r3) goto L_0x006c
                    r3 = 1574(0x626, float:2.206E-42)
                    if (r2 == r3) goto L_0x0059
                    r3 = 1567(0x61f, float:2.196E-42)
                    if (r2 == r3) goto L_0x0046
                    r3 = 1568(0x620, float:2.197E-42)
                    if (r2 == r3) goto L_0x0033
                    goto L_0x00a5
                L_0x0033:
                    java.lang.String r2 = "11"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindLine()
                    goto L_0x00a6
                L_0x0046:
                    java.lang.String r2 = "10"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindTwitter()
                    goto L_0x00a6
                L_0x0059:
                    java.lang.String r2 = "17"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindPlay()
                    goto L_0x00a6
                L_0x006c:
                    java.lang.String r2 = "13"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindEmail()
                    goto L_0x00a6
                L_0x007f:
                    java.lang.String r2 = "8"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindGoogle()
                    goto L_0x00a6
                L_0x0092:
                    java.lang.String r2 = "6"
                    boolean r2 = r5.equals(r2)
                    if (r2 == 0) goto L_0x00a5
                    com.quickgame.android.sdk.h.f r2 = com.quickgame.android.sdk.p039h.C1538f.m1861l()
                    com.quickgame.android.sdk.innerbean.BindInfo r2 = r2.f1470g
                    com.quickgame.android.sdk.innerbean.ThirdInfo r2 = r2.getBindFB()
                    goto L_0x00a6
                L_0x00a5:
                    r2 = 0
                L_0x00a6:
                    if (r2 == 0) goto L_0x00c5
                    int r3 = r2.isBind()
                    r4 = 1
                    if (r3 != r4) goto L_0x00c5
                    java.lang.String r2 = r2.getBuid()
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
                    if (r1 == 0) goto L_0x00c5
                    com.quickgame.android.sdk.h.e r1 = com.quickgame.android.sdk.p039h.C1534e.f1462f
                    com.quickgame.android.sdk.listener.CheckThirdLoginListener r1 = r1.mo12817a()
                    if (r1 == 0) goto L_0x00c4
                    r1.onSameAccount()
                L_0x00c4:
                    return
                L_0x00c5:
                    com.quickgame.android.sdk.h.e r1 = com.quickgame.android.sdk.p039h.C1534e.f1462f
                    com.quickgame.android.sdk.listener.CheckThirdLoginListener r1 = r1.mo12817a()
                    if (r1 == 0) goto L_0x00d0
                    r1.onAnotherAccount()
                L_0x00d0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity.C1164b.C1165a.mo12042a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
            }

            /* renamed from: b */
            public void mo12043b(String str) {
                Intrinsics.checkNotNullParameter(str, "message");
                super.mo12043b(str);
                this.f676a.f675a.mo12280p();
                this.f676a.f675a.finish();
                CheckThirdLoginListener a = C1534e.f1462f.mo12817a();
                if (a != null) {
                    a.onError(str);
                }
            }

            public void onLoginCancel() {
                super.onLoginCancel();
                this.f676a.f675a.mo12280p();
                this.f676a.f675a.finish();
                CheckThirdLoginListener a = C1534e.f1462f.mo12817a();
                if (a != null) {
                    a.onCancel();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1164b(CheckThirdLoginBindActivity checkThirdLoginBindActivity) {
            super(0);
            this.f675a = checkThirdLoginBindActivity;
        }

        public final C1165a invoke() {
            return new C1165a(this);
        }
    }

    /* renamed from: r */
    private final C1164b.C1165a m956r() {
        return (C1164b.C1165a) this.f674d.getValue();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo12280p();
        this.f672b.mo13194a(i, i2, intent);
        this.f673c.mo13199a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo12282w("");
        String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != 54) {
                if (hashCode == 56 && stringExtra.equals(QGConstant.LOGIN_OPEN_TYPE_GOOGLE)) {
                    this.f673c.mo13201a(this, m956r());
                    this.f673c.mo13198a();
                    this.f673c.mo13202b((Activity) this);
                    return;
                }
            } else if (stringExtra.equals(QGConstant.LOGIN_OPEN_TYPE_FACEBOOK)) {
                this.f672b.mo13196a((C1690d) m956r());
                this.f672b.mo13195a((Activity) this);
                return;
            }
        }
        finish();
    }
}
