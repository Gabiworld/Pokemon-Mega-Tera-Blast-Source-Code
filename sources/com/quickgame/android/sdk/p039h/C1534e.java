package com.quickgame.android.sdk.p039h;

import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.listener.CheckThirdLoginListener;
import com.quickgame.android.sdk.listener.GooglePreRegisterListener;
import com.quickgame.android.sdk.model.QGUserHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo13302d2 = {"Lcom/quickgame/android/sdk/manager/SDKCallbackManager;", "", "()V", "checkThridLoginListener", "Lcom/quickgame/android/sdk/listener/CheckThirdLoginListener;", "customerServiceCallback", "Lcom/quickgame/android/sdk/QuickGameManager$CustomerServiceCallback;", "payCallBack", "Lcom/quickgame/android/sdk/QuickGameManager$QGPaymentCallback;", "preRegisterListener", "Lcom/quickgame/android/sdk/listener/GooglePreRegisterListener;", "sdkCallback", "Lcom/quickgame/android/sdk/QuickGameManager$SDKCallback;", "getCheckThirdLoginListener", "getCustomerServiceCallback", "getPayCallback", "getPreRegisterListener", "getSDKCallback", "setCheckThirdLoginListener", "", "callback", "setCustomerServiceCallback", "setPayCallback", "setPreRegisterListener", "setSDKCallback", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.h.e */
public final class C1534e {

    /* renamed from: a */
    private static QuickGameManager.CustomerServiceCallback f1457a;

    /* renamed from: b */
    private static QuickGameManager.SDKCallback f1458b;

    /* renamed from: c */
    private static GooglePreRegisterListener f1459c;

    /* renamed from: d */
    private static QuickGameManager.QGPaymentCallback f1460d;

    /* renamed from: e */
    private static CheckThirdLoginListener f1461e;

    /* renamed from: f */
    public static final C1534e f1462f = new C1534e();

    /* renamed from: com.quickgame.android.sdk.h.e$a */
    static final class C1535a implements QuickGameManager.CustomerServiceCallback {

        /* renamed from: a */
        public static final C1535a f1463a = new C1535a();

        C1535a() {
        }

        public final void onCustomerServiceClicked() {
        }
    }

    /* renamed from: com.quickgame.android.sdk.h.e$b */
    public static final class C1536b implements QuickGameManager.QGPaymentCallback {
        C1536b() {
        }

        public void onPayCancel(String str, String str2, String str3) {
        }

        public void onPayFailed(String str, String str2, String str3) {
        }

        public void onPaySuccess(String str, String str2, String str3, String str4) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.h.e$c */
    public static final class C1537c implements QuickGameManager.SDKCallback {
        C1537c() {
        }

        public void onGooglePlaySub(String str, String str2, boolean z, boolean z2) {
        }

        public void onInitFinished(boolean z) {
        }

        public void onLoginFinished(QGUserData qGUserData, QGUserHolder qGUserHolder) {
        }

        public void onLogout() {
        }
    }

    private C1534e() {
    }

    /* renamed from: a */
    public final void mo12818a(QuickGameManager.CustomerServiceCallback customerServiceCallback) {
        Intrinsics.checkNotNullParameter(customerServiceCallback, "callback");
        f1457a = customerServiceCallback;
    }

    /* renamed from: b */
    public final QuickGameManager.CustomerServiceCallback mo12823b() {
        QuickGameManager.CustomerServiceCallback customerServiceCallback = f1457a;
        return customerServiceCallback != null ? customerServiceCallback : C1535a.f1463a;
    }

    /* renamed from: c */
    public final QuickGameManager.QGPaymentCallback mo12824c() {
        QuickGameManager.QGPaymentCallback qGPaymentCallback = f1460d;
        return qGPaymentCallback != null ? qGPaymentCallback : new C1536b();
    }

    /* renamed from: d */
    public final GooglePreRegisterListener mo12825d() {
        return f1459c;
    }

    /* renamed from: e */
    public final QuickGameManager.SDKCallback mo12826e() {
        QuickGameManager.SDKCallback sDKCallback = f1458b;
        return sDKCallback != null ? sDKCallback : new C1537c();
    }

    /* renamed from: a */
    public final void mo12820a(QuickGameManager.SDKCallback sDKCallback) {
        f1458b = sDKCallback;
    }

    /* renamed from: a */
    public final void mo12822a(GooglePreRegisterListener googlePreRegisterListener) {
        Intrinsics.checkNotNullParameter(googlePreRegisterListener, "callback");
        f1459c = googlePreRegisterListener;
    }

    /* renamed from: a */
    public final void mo12819a(QuickGameManager.QGPaymentCallback qGPaymentCallback) {
        Intrinsics.checkNotNullParameter(qGPaymentCallback, "callback");
        f1460d = qGPaymentCallback;
    }

    /* renamed from: a */
    public final void mo12821a(CheckThirdLoginListener checkThirdLoginListener) {
        Intrinsics.checkNotNullParameter(checkThirdLoginListener, "callback");
        f1461e = checkThirdLoginListener;
    }

    /* renamed from: a */
    public final CheckThirdLoginListener mo12817a() {
        return f1461e;
    }
}
