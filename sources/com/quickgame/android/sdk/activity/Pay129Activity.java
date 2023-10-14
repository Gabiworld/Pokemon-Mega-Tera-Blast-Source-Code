package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.gaa.sdk.iap.IapResult;
import com.gaa.sdk.iap.IapResultListener;
import com.gaa.sdk.iap.ProductDetail;
import com.gaa.sdk.iap.ProductDetailsListener;
import com.gaa.sdk.iap.PurchaseData;
import com.gaa.sdk.iap.PurchaseFlowParams;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p039h.C1506a;
import com.quickgame.android.sdk.p040i.C1565b;
import com.quickgame.android.sdk.p040i.C1576c;
import com.quickgame.android.sdk.p041j.C1578a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001>B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u001c\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u000fH\u0014J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u000fH\u0016J \u0010-\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010/H\u0016J\u0016\u00100\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150/H\u0016J\b\u00101\u001a\u00020\u000fH\u0016J\u0018\u00102\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u00105\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u000203H\u0016J\u0010\u00106\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u00107\u001a\u00020\u000fH\u0002J\u0018\u00108\u001a\u00020\u000f2\u0006\u0010)\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u000fH\u0002J\b\u0010=\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/Pay129Activity;", "Lcom/quickgame/android/sdk/mvp/MvpBaseActivity;", "Lcom/quickgame/android/sdk/presenter/OneStorePayPresenter;", "Lcom/quickgame/android/sdk/pay/OneStorePurchaseManager$Callback;", "Lcom/quickgame/android/sdk/presenter/OneStorePayPresenter$View;", "()V", "gameOrderId", "", "goodsId", "oneStorePurchaseManager", "Lcom/quickgame/android/sdk/pay/OneStorePurchaseManager;", "qkOrderId", "skuType", "createPresenter", "finishActivity", "", "finishActivityForCancel", "finishActivityForError", "error", "finishActivityForSuccess", "purchaseData", "Lcom/gaa/sdk/iap/PurchaseData;", "handleErrorOrder", "context", "Landroid/content/Context;", "purchase", "error_id", "", "launchLoginFlow", "onAcknowledgeFinished", "iapResult", "Lcom/gaa/sdk/iap/IapResult;", "onConsumeFinished", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOrderFailed", "onCreateOrderSuccess", "orderId", "onDestroy", "onError", "message", "onNeedLogin", "onNeedUpdate", "onPurchaseClientSetupFinished", "onPurchaseHistoryUpdated", "purchases", "", "onPurchaseUpdated", "onUserCancel", "onVerifyHistoryPurchaseFailed", "Lcom/quickgame/android/sdk/http/ResponseError;", "onVerifyHistoryPurchaseSuccess", "onVerifyPurchaseFailed", "onVerifyPurchaseSuccess", "querySku", "showDialog", "", "listener", "Landroid/content/DialogInterface$OnClickListener;", "startPay", "updateOrInstallPaymentModule", "Companion", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class Pay129Activity extends MvpBaseActivity<C1578a> implements C1565b.C1575g, C1578a.C1579a {

    /* renamed from: h */
    public static final C1259a f915h = new C1259a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private String f916c = BillingClient.SkuType.INAPP;

    /* renamed from: d */
    private String f917d;

    /* renamed from: e */
    private String f918e;

    /* renamed from: f */
    private String f919f = "";

    /* renamed from: g */
    private C1565b f920g;

    /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$a */
    public static final class C1259a {
        private C1259a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo12265a(Activity activity, String str, String str2) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(str, "goodsId");
            Intrinsics.checkNotNullParameter(str2, "skuType");
            Intent intent = new Intent(activity, Pay129Activity.class);
            intent.putExtra("goodsId", str);
            intent.putExtra("skuType", str2);
            activity.startActivity(intent);
        }

        public /* synthetic */ C1259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo13302d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$b */
    static final class C1260b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Pay129Activity f921a;

        /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$b$a */
        static final class C1261a implements IapResultListener {

            /* renamed from: a */
            final /* synthetic */ C1260b f922a;

            C1261a(C1260b bVar) {
                this.f922a = bVar;
            }

            public final void onResponse(IapResult iapResult) {
                Intrinsics.checkNotNullExpressionValue(iapResult, "iapResult");
                if (!iapResult.isSuccess()) {
                    Log.w("QGPay129Activity", "launchLoginFlow() got an error response code: " + iapResult.getResponseCode() + ' ' + iapResult.getMessage());
                    this.f922a.f921a.m1282y("NeedLogin");
                }
            }
        }

        C1260b(Pay129Activity pay129Activity) {
            this.f921a = pay129Activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Pay129Activity.m1274c(this.f921a).mo12876a((IapResultListener) new C1261a(this));
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$c */
    static final class C1262c implements ProductDetailsListener {

        /* renamed from: a */
        final /* synthetic */ Pay129Activity f923a;

        C1262c(Pay129Activity pay129Activity) {
            this.f923a = pay129Activity;
        }

        public final void onProductDetailsResponse(IapResult iapResult, List<ProductDetail> list) {
            Intrinsics.checkNotNullExpressionValue(iapResult, "iapResult2");
            if (iapResult.isSuccess() && list != null) {
                ProductDetail productDetail = list.get(0);
                Intrinsics.checkNotNullExpressionValue(productDetail, "productDetails[0]");
                if (Intrinsics.areEqual((Object) productDetail.getProductId(), (Object) Pay129Activity.m1268a(this.f923a))) {
                    Log.d("QGPay129Activity", "querySku success " + Pay129Activity.m1268a(this.f923a));
                    C1578a b = Pay129Activity.m1273b(this.f923a);
                    QGOrderInfo qGOrderInfo = C1576c.m1961b().f1557c;
                    Intrinsics.checkNotNullExpressionValue(qGOrderInfo, "PayManager.getInstance().orderInfo");
                    QGRoleInfo qGRoleInfo = C1576c.m1961b().f1558d;
                    Intrinsics.checkNotNullExpressionValue(qGRoleInfo, "PayManager.getInstance().roleInfo");
                    b.mo12968a(qGOrderInfo, qGRoleInfo);
                    return;
                }
            }
            Pay129Activity pay129Activity = this.f923a;
            pay129Activity.m1282y("query product fail code " + iapResult.getResponseCode() + ' ' + iapResult.getMessage());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$d */
    static final class C1263d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Pay129Activity f924a;

        C1263d(Pay129Activity pay129Activity) {
            this.f924a = pay129Activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
            this.f924a.m1282y("need login");
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo13302d2 = {"<anonymous>", "", "iapResult", "Lcom/gaa/sdk/iap/IapResult;", "kotlin.jvm.PlatformType", "onResponse"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$e */
    static final class C1264e implements IapResultListener {

        /* renamed from: a */
        final /* synthetic */ Pay129Activity f925a;

        /* renamed from: com.quickgame.android.sdk.activity.Pay129Activity$e$a */
        static final class C1265a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1264e f926a;

            C1265a(C1264e eVar) {
                this.f926a = eVar;
            }

            public final void run() {
                this.f926a.f925a.mo12259g();
            }
        }

        C1264e(Pay129Activity pay129Activity) {
            this.f925a = pay129Activity;
        }

        public final void onResponse(IapResult iapResult) {
            Intrinsics.checkNotNullExpressionValue(iapResult, "iapResult");
            if (iapResult.isSuccess()) {
                Pay129Activity.m1274c(this.f925a).mo12879a((Runnable) new C1265a(this));
                return;
            }
            Log.w("QGPay129Activity", "launchUpdateOrInstall() got an error response code: " + iapResult.getResponseCode());
            this.f925a.m1282y("NeedUpdate");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m1269a(Activity activity, String str, String str2) {
        f915h.mo12265a(activity, str, str2);
    }

    /* renamed from: b */
    public static final /* synthetic */ C1578a m1273b(Pay129Activity pay129Activity) {
        return (C1578a) pay129Activity.f1648b;
    }

    /* renamed from: c */
    public static final /* synthetic */ C1565b m1274c(Pay129Activity pay129Activity) {
        C1565b bVar = pay129Activity.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        return bVar;
    }

    /* renamed from: s */
    private final void m1276s() {
        try {
            mo12280p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    /* renamed from: t */
    private final void m1277t() {
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (r.mo11995j() != null) {
            C1128a r2 = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
            C1506a j = r2.mo11995j();
            String str = this.f918e;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameOrderId");
            }
            j.onPayCancel(str, this.f919f, "1");
        }
        m1276s();
    }

    /* renamed from: u */
    private final void m1278u() {
        String string = getString(C1124R.string.pay_129_need_login);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.pay_129_need_login)");
        m1272a((CharSequence) string, (DialogInterface.OnClickListener) new C1260b(this));
    }

    /* renamed from: v */
    private final void m1279v() {
        StringBuilder sb = new StringBuilder();
        sb.append("querySku ");
        String str = this.f917d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goodsId");
        }
        sb.append(str);
        Log.d("QGPay129Activity", sb.toString());
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        String str2 = this.f917d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goodsId");
        }
        bVar.mo12881a(str2, this.f916c, new C1262c(this));
    }

    /* renamed from: w */
    private final void m1280w() {
        PurchaseFlowParams.Builder newBuilder = PurchaseFlowParams.newBuilder();
        String str = this.f917d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goodsId");
        }
        PurchaseFlowParams build = newBuilder.setProductId(str).setProductName("").setProductType(this.f916c).setDeveloperPayload(this.f919f).build();
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12878a(build);
    }

    /* renamed from: x */
    private final void m1281x() {
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12882b((IapResultListener) new C1264e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m1282y(String str) {
        Log.d("QGPay129Activity", "finishActivityForError: " + str);
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (r.mo11995j() != null) {
            C1128a r2 = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
            C1506a j = r2.mo11995j();
            String str2 = this.f918e;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameOrderId");
            }
            j.onPayFailed(str2, this.f919f, str);
        }
        m1276s();
    }

    /* renamed from: d */
    public void mo12258d(String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Log.d("QGPay129Activity", "createOrderSuccess " + str);
        this.f919f = str;
        C1576c.m1961b().mo12904d(this.f919f);
        m1280w();
    }

    /* renamed from: g */
    public void mo12259g() {
        Log.d("QGPay129Activity", "PurchaseClientSetupFinished");
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12880a(this.f916c);
    }

    /* renamed from: i */
    public void mo12260i() {
        Log.d("QGPay129Activity", "onUserCancel");
        m1277t();
    }

    /* renamed from: l */
    public void mo12261l() {
        Log.d("QGPay129Activity", "onNeedLogin");
        m1278u();
    }

    /* renamed from: n */
    public void mo12262n() {
        Log.d("QGPay129Activity", "onNeedUpdate");
        m1281x();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("skuType");
        if (stringExtra != null && Intrinsics.areEqual((Object) stringExtra, (Object) BillingClient.SkuType.SUBS)) {
            this.f916c = "auto";
        }
        String stringExtra2 = getIntent().getStringExtra("goodsId");
        Intrinsics.checkNotNull(stringExtra2);
        this.f917d = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("gameOrderId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f918e = stringExtra3;
        this.f920g = new C1565b(this, this);
        mo12282w("");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12875a();
        C1128a.f605p = true;
    }

    public void onError(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        Log.d("QGPay129Activity", "onError " + str);
        m1282y(str);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m1268a(Pay129Activity pay129Activity) {
        String str = pay129Activity.f917d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goodsId");
        }
        return str;
    }

    /* renamed from: c */
    private final void m1275c(PurchaseData purchaseData) {
        Log.d("QGPay129Activity", "finishActivityForError: " + purchaseData);
        mo12280p();
        QGOrderInfo qGOrderInfo = C1576c.m1961b().f1557c;
        String developerPayload = purchaseData.getDeveloperPayload();
        Intrinsics.checkNotNullExpressionValue(qGOrderInfo, "orderInfo");
        if ((!Intrinsics.areEqual((Object) developerPayload, (Object) qGOrderInfo.getQkOrderNo())) && C1576c.m1961b().mo12894a(purchaseData.getDeveloperPayload()) != null) {
            qGOrderInfo = C1576c.m1961b().mo12894a(purchaseData.getDeveloperPayload());
        }
        Intrinsics.checkNotNullExpressionValue(qGOrderInfo, "orderInfo");
        String valueOf = String.valueOf(qGOrderInfo.getAmount());
        String productOrderId = qGOrderInfo.getProductOrderId();
        String str = this.f917d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goodsId");
        }
        C1268a.m1312a(valueOf, productOrderId, str, qGOrderInfo.getOrderSubject(), qGOrderInfo.getSuggestCurrency(), (Purchase) null, "");
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        if (r.mo11995j() != null) {
            C1128a r2 = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
            C1506a j = r2.mo11995j();
            String productOrderId2 = qGOrderInfo.getProductOrderId();
            Intrinsics.checkNotNullExpressionValue(productOrderId2, "orderInfo.productOrderId");
            String developerPayload2 = purchaseData.getDeveloperPayload();
            if (developerPayload2 == null) {
                developerPayload2 = "";
            }
            String str2 = this.f917d;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goodsId");
            }
            String extrasParams = qGOrderInfo.getExtrasParams();
            Intrinsics.checkNotNullExpressionValue(extrasParams, "orderInfo.extrasParams");
            j.onPaySuccess(productOrderId2, developerPayload2, str2, extrasParams);
        }
        C1576c.m1961b().mo12903c(purchaseData.getDeveloperPayload());
        m1276s();
    }

    /* renamed from: b */
    public void mo12256b(PurchaseData purchaseData) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Log.d("QGPay129Activity", "verifyPurchaseSuccess " + purchaseData.getOriginalJson());
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12877a(purchaseData);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C1578a m1296r() {
        return new C1578a(this);
    }

    /* renamed from: a */
    public void mo12251a(IapResult iapResult, List<PurchaseData> list) {
        Intrinsics.checkNotNullParameter(iapResult, "iapResult");
        Log.d("QGPay129Activity", "PurchaseHistoryUpdated " + iapResult.getResponseCode());
        if (iapResult.isSuccess() && list != null && list.size() > 0) {
            for (PurchaseData next : list) {
                String productId = next.getProductId();
                String str = this.f917d;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("goodsId");
                }
                if (Intrinsics.areEqual((Object) productId, (Object) str)) {
                    ((C1578a) this.f1648b).mo12967a(next);
                    return;
                }
            }
        }
        m1279v();
    }

    /* renamed from: r */
    public void mo12264r(String str) {
        Intrinsics.checkNotNullParameter(str, "error");
        Log.d("QGPay129Activity", "createOrderFailed " + str);
        m1282y(str);
    }

    /* renamed from: b */
    public void mo12257b(PurchaseData purchaseData, C1427c cVar) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Intrinsics.checkNotNullParameter(cVar, "error");
        Log.d("QGPay129Activity", "verifyHistoryPurchaseFailed " + purchaseData.getOriginalJson());
        m1270a((Context) this, purchaseData, cVar.mo12662a());
        m1282y(cVar.mo12663b());
    }

    /* renamed from: a */
    public void mo12255a(List<PurchaseData> list) {
        Intrinsics.checkNotNullParameter(list, "purchases");
        Log.d("QGPay129Activity", "PurchaseUpdated " + list.size());
        for (PurchaseData next : list) {
            Log.d("QGPay129Activity", "PurchaseUpdated " + next.getOriginalJson());
            C1576c.m1961b().mo12904d(next.getDeveloperPayload());
            ((C1578a) this.f1648b).mo12969b(next);
        }
    }

    /* renamed from: a */
    public void mo12253a(PurchaseData purchaseData, IapResult iapResult) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Log.d("QGPay129Activity", "consumeFinished " + purchaseData.getOriginalJson());
        m1275c(purchaseData);
    }

    /* renamed from: a */
    private final void m1272a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(this).setMessage(charSequence).setPositiveButton(17039370, onClickListener).setNegativeButton(17039360, (DialogInterface.OnClickListener) new C1263d(this)).create().show();
    }

    /* renamed from: a */
    public void mo12254a(PurchaseData purchaseData, C1427c cVar) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Intrinsics.checkNotNullParameter(cVar, "error");
        Log.d("QGPay129Activity", "verifyPurchaseFailed " + purchaseData.getOriginalJson());
        m1282y(cVar.mo12663b());
    }

    /* renamed from: a */
    public void mo12252a(PurchaseData purchaseData) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Log.d("QGPay129Activity", "verifyHistoryPurchaseSuccess " + purchaseData.getOriginalJson());
        C1565b bVar = this.f920g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
        }
        bVar.mo12877a(purchaseData);
    }

    /* renamed from: a */
    private final void m1270a(Context context, PurchaseData purchaseData, int i) {
        Log.d("QGPay129Activity", "handleErrorOrder error_id " + i);
        if (purchaseData != null) {
            switch (i) {
                case 50009:
                case 50010:
                case 50013:
                case 50014:
                case 50015:
                case 50023:
                case 50024:
                    C1565b bVar = this.f920g;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
                    }
                    bVar.mo12877a(purchaseData);
                    return;
                case 50025:
                    C1128a r = C1128a.m798r();
                    Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                    Context e = r.mo11981e();
                    if (e != null) {
                        SharedPreferences sharedPreferences = e.getSharedPreferences(purchaseData.getOrderId(), 0);
                        int i2 = sharedPreferences.getInt("times", 0);
                        if (i2 > 2) {
                            C1565b bVar2 = this.f920g;
                            if (bVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("oneStorePurchaseManager");
                            }
                            bVar2.mo12877a(purchaseData);
                            sharedPreferences.edit().clear().apply();
                            return;
                        }
                        sharedPreferences.edit().putInt("times", i2 + 1).apply();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
