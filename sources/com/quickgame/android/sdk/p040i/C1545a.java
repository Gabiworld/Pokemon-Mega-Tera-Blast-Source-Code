package com.quickgame.android.sdk.p040i;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.p010qg.gson.Gson;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.activity.NewGooglePlayActivity;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.listener.GooglePreRegisterListener;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1506a;
import com.quickgame.android.sdk.p039h.C1534e;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u000223B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J \u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J.\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tJ \u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u000eH\u0002J.\u0010,\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00152\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010.\u0018\u00010\u0014J0\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00152\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0014J2\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040.2\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0.\u0018\u00010\u0014J \u00101\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00064"}, mo13302d2 = {"Lcom/quickgame/android/sdk/pay/GooglePlayHelper;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "()V", "CP_ORDER_ID", "", "TAG", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "payCallBack", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$PayCallBack;", "skuMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/android/billingclient/api/SkuDetails;", "ackPurchase", "", "context", "Landroid/content/Context;", "purchase", "Lcom/android/billingclient/api/Purchase;", "callBack", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "addDeveloperPayload", "purchaseOriginalJson", "checkPendingPurchases", "checkPreRegPurchases", "clearSpOrderInfo", "consumePurchase", "handleErrorOrder", "error_id", "", "init", "isSubsPurchase", "launchBilling", "Landroid/app/Activity;", "goodsId", "uid", "orderId", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchases", "", "preRegister", "queryPendingPurchase", "isConsumableSku", "", "querySkuDetail", "goodsIds", "verifyHistoryPurchase", "DataCallBack", "PayCallBack", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.i.a */
public final class C1545a implements PurchasesUpdatedListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static BillingClient f1501a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ConcurrentHashMap<String, SkuDetails> f1502b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static C1547b f1503c;

    /* renamed from: d */
    public static final C1545a f1504d = new C1545a();

    /* renamed from: com.quickgame.android.sdk.i.a$a */
    public interface C1546a<T> {
        /* renamed from: a */
        void mo12013a(String str);

        void onSuccess(T t);
    }

    /* renamed from: com.quickgame.android.sdk.i.a$b */
    public interface C1547b {
        /* renamed from: a */
        void mo12241a();

        /* renamed from: a */
        void mo12242a(Purchase purchase, String str);

        /* renamed from: a */
        void mo12243a(String str);
    }

    /* renamed from: com.quickgame.android.sdk.i.a$d */
    public static final class C1550d implements C1546a<List<? extends Purchase>> {

        /* renamed from: a */
        final /* synthetic */ Context f1508a;

        C1550d(Context context) {
            this.f1508a = context;
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Purchase> list) {
            if (list != null) {
                for (Purchase purchase : list) {
                    if (purchase.getPurchaseState() == 1) {
                        C1545a.f1504d.m1894a(this.f1508a, purchase, true);
                    }
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.a$e */
    public static final class C1551e implements C1546a<List<? extends Purchase>> {

        /* renamed from: a */
        final /* synthetic */ Context f1509a;

        C1551e(Context context) {
            this.f1509a = context;
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Purchase> list) {
            if (list != null) {
                for (Purchase purchase : list) {
                    if (purchase.getPurchaseState() == 1) {
                        C1545a.f1504d.m1894a(this.f1509a, purchase, false);
                    }
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.a$f */
    public static final class C1552f implements C1546a<List<? extends Purchase>> {

        /* renamed from: a */
        final /* synthetic */ Context f1510a;

        C1552f(Context context) {
            this.f1510a = context;
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Purchase> list) {
            if (list != null) {
                for (Purchase purchase : list) {
                    C1128a r = C1128a.m798r();
                    Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                    if (r.mo11981e() != null && purchase.getPurchaseState() == 1 && TextUtils.isEmpty(purchase.getOrderId())) {
                        AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                        if (TextUtils.isEmpty(accountIdentifiers != null ? accountIdentifiers.getObfuscatedProfileId() : null)) {
                            Log.d("QGGooglePlayHelper", "is preReg order " + purchase);
                            C1545a.f1504d.mo12863b(this.f1510a, purchase, (C1546a<Boolean>) null);
                            C1128a r2 = C1128a.m798r();
                            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
                            Context e = r2.mo11981e();
                            Intrinsics.checkNotNull(e);
                            e.getSharedPreferences("preRegistration", 0).edit().putBoolean("preRegistration", true).apply();
                            C1545a.f1504d.m1893a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.a$h */
    public static final class C1555h implements BillingClientStateListener {

        /* renamed from: a */
        final /* synthetic */ C1546a f1514a;

        C1555h(C1546a aVar) {
            this.f1514a = aVar;
        }

        public void onBillingServiceDisconnected() {
            C1546a aVar = this.f1514a;
            if (aVar != null) {
                aVar.mo12013a("billingClient disconnected");
            }
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "result");
            Log.d("QGGooglePlayHelper", "billingClient conn result " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0) {
                C1546a aVar = this.f1514a;
                if (aVar != null) {
                    aVar.onSuccess(true);
                    return;
                }
                return;
            }
            C1546a aVar2 = this.f1514a;
            if (aVar2 != null) {
                aVar2.mo12013a("billingClient connect fail, code " + billingResult.getResponseCode());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.a$i */
    public static final class C1556i implements C1426b<JSONObject> {
        C1556i() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            C1128a r = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
            Context e = r.mo11981e();
            if (e != null) {
                SharedPreferences.Editor edit = e.getSharedPreferences("preRegistration", 0).edit();
                edit.putBoolean("preRegistration", false);
                edit.apply();
                GooglePreRegisterListener d = C1534e.f1462f.mo12825d();
                if (d != null) {
                    d.onCheckSuccess();
                }
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            Log.e("QGGooglePlayHelper", "bindPreRegUser error " + cVar);
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$queryPendingPurchase$1", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "onFail", "", "error", "", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$j */
    public static final class C1557j implements C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f1515a;

        /* renamed from: b */
        final /* synthetic */ C1546a f1516b;

        /* renamed from: com.quickgame.android.sdk.i.a$j$a */
        public static final class C1558a implements PurchasesResponseListener {

            /* renamed from: a */
            final /* synthetic */ C1557j f1517a;

            C1558a(C1557j jVar) {
                this.f1517a = jVar;
            }

            public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                Intrinsics.checkNotNullParameter(billingResult, "result");
                Intrinsics.checkNotNullParameter(list, "purchases");
                C1546a aVar = this.f1517a.f1516b;
                if (aVar != null) {
                    aVar.onSuccess(list);
                }
            }
        }

        C1557j(boolean z, C1546a aVar) {
            this.f1515a = z;
            this.f1516b = aVar;
        }

        /* renamed from: a */
        public void mo12870a(boolean z) {
            BillingClient a = C1545a.f1501a;
            Intrinsics.checkNotNull(a);
            a.queryPurchasesAsync(this.f1515a ? BillingClient.SkuType.INAPP : BillingClient.SkuType.SUBS, new C1558a(this));
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            mo12870a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            C1546a aVar = this.f1516b;
            if (aVar != null) {
                aVar.mo12013a(str);
            }
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$verifyHistoryPurchase$1", "Lcom/quickgame/android/sdk/http/HttpCallBack;", "Lorg/json/JSONObject;", "onFailed", "", "error", "Lcom/quickgame/android/sdk/http/ResponseError;", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$m */
    public static final class C1563m implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ Context f1525a;

        /* renamed from: b */
        final /* synthetic */ Purchase f1526b;

        /* renamed from: c */
        final /* synthetic */ boolean f1527c;

        /* renamed from: com.quickgame.android.sdk.i.a$m$a */
        public static final class C1564a implements C1546a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C1563m f1528a;

            C1564a(C1563m mVar) {
                this.f1528a = mVar;
            }

            /* renamed from: a */
            public void mo12013a(String str) {
                Intrinsics.checkNotNullParameter(str, "error");
            }

            /* renamed from: a */
            public void mo12874a(boolean z) {
                SharedPreferences sharedPreferences = this.f1528a.f1525a.getSharedPreferences("quickOrder", 0);
                AccountIdentifiers accountIdentifiers = this.f1528a.f1526b.getAccountIdentifiers();
                Intrinsics.checkNotNull(accountIdentifiers);
                Intrinsics.checkNotNullExpressionValue(accountIdentifiers, "purchase.accountIdentifiers!!");
                String str = "";
                String string = sharedPreferences.getString(accountIdentifiers.getObfuscatedProfileId(), str);
                if (string != null) {
                    str = string;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Log.d("QGGooglePlayHelper", "sp have orderInfo " + str);
                        QGOrderInfo qGOrderInfo = (QGOrderInfo) new Gson().mo11564a(str, QGOrderInfo.class);
                        Intrinsics.checkNotNullExpressionValue(qGOrderInfo, "orderInfo");
                        C1268a.m1312a(String.valueOf(qGOrderInfo.getAmount()), qGOrderInfo.getProductOrderId(), qGOrderInfo.getGoodsId(), qGOrderInfo.getOrderSubject(), qGOrderInfo.getSuggestCurrency(), this.f1528a.f1526b, "");
                        C1128a r = C1128a.m798r();
                        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                        if (r.mo11995j() != null) {
                            C1128a r2 = C1128a.m798r();
                            Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
                            C1506a j = r2.mo11995j();
                            String productOrderId = qGOrderInfo.getProductOrderId();
                            Intrinsics.checkNotNullExpressionValue(productOrderId, "orderInfo.productOrderId");
                            String qkOrderNo = qGOrderInfo.getQkOrderNo();
                            Intrinsics.checkNotNullExpressionValue(qkOrderNo, "orderInfo.qkOrderNo");
                            String goodsId = qGOrderInfo.getGoodsId();
                            Intrinsics.checkNotNullExpressionValue(goodsId, "orderInfo.goodsId");
                            String extrasParams = qGOrderInfo.getExtrasParams();
                            Intrinsics.checkNotNullExpressionValue(extrasParams, "orderInfo.extrasParams");
                            j.onPaySuccess(productOrderId, qkOrderNo, goodsId, extrasParams);
                        }
                    } catch (Exception e) {
                        Log.e("QGGooglePlayHelper", "orderInfoStr to json Exception:" + e.getMessage());
                    } catch (Throwable th) {
                        C1545a.f1504d.m1899b(this.f1528a.f1526b);
                        throw th;
                    }
                    C1545a.f1504d.m1899b(this.f1528a.f1526b);
                }
            }

            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                mo12874a(((Boolean) obj).booleanValue());
            }
        }

        C1563m(Context context, Purchase purchase, boolean z) {
            this.f1525a = context;
            this.f1526b = purchase;
            this.f1527c = z;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("message");
                Intrinsics.checkNotNullExpressionValue(optString, "dataJson.optString(\"message\")");
                if (StringsKt.contains$default((CharSequence) optString, (CharSequence) "AsyRequestSuccess", false, 2, (Object) null)) {
                    C1564a aVar = new C1564a(this);
                    if (this.f1527c) {
                        C1545a.f1504d.mo12863b(this.f1525a, this.f1526b, aVar);
                    } else {
                        C1545a.f1504d.mo12857a(this.f1525a, this.f1526b, (C1546a<Boolean>) aVar);
                    }
                }
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            try {
                C1545a.f1504d.mo12856a(this.f1525a, this.f1526b, cVar.mo12662a());
            } catch (Exception unused) {
            }
        }
    }

    private C1545a() {
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Log.d("QGGooglePlayHelper", "onPurchasesUpdated result:" + billingResult.getResponseCode());
        if (f1503c != null) {
            if (billingResult.getResponseCode() == 0 && list != null) {
                for (Purchase next : list) {
                    if (next.getPurchaseState() == 1) {
                        C1547b bVar = f1503c;
                        if (bVar != null) {
                            AccountIdentifiers accountIdentifiers = next.getAccountIdentifiers();
                            Intrinsics.checkNotNull(accountIdentifiers);
                            Intrinsics.checkNotNullExpressionValue(accountIdentifiers, "purchase.accountIdentifiers!!");
                            String obfuscatedProfileId = accountIdentifiers.getObfuscatedProfileId();
                            if (obfuscatedProfileId == null) {
                                obfuscatedProfileId = "";
                            }
                            Intrinsics.checkNotNullExpressionValue(obfuscatedProfileId, "purchase.accountIdentifi…                    ?: \"\"");
                            bVar.mo12242a(next, obfuscatedProfileId);
                        }
                    } else {
                        C1547b bVar2 = f1503c;
                        if (bVar2 != null) {
                            bVar2.mo12243a("purchase is pending");
                        }
                    }
                }
            } else if (billingResult.getResponseCode() == 1) {
                C1547b bVar3 = f1503c;
                if (bVar3 != null) {
                    bVar3.mo12241a();
                }
            } else {
                C1547b bVar4 = f1503c;
                if (bVar4 != null) {
                    bVar4.mo12243a("pay failed: code " + billingResult.getResponseCode());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12863b(Context context, Purchase purchase, C1546a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Log.d("QGGooglePlayHelper", "consumePurchase");
        m1895a(context, (C1546a<Boolean>) new C1553g(purchase, aVar));
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$ackPurchase$1", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "onFail", "", "error", "", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$c */
    public static final class C1548c implements C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Purchase f1505a;

        /* renamed from: b */
        final /* synthetic */ C1546a f1506b;

        /* renamed from: com.quickgame.android.sdk.i.a$c$a */
        static final class C1549a implements AcknowledgePurchaseResponseListener {

            /* renamed from: a */
            final /* synthetic */ C1548c f1507a;

            C1549a(C1548c cVar) {
                this.f1507a = cVar;
            }

            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (billingResult.getResponseCode() == 0) {
                    Log.d("QGGooglePlayHelper", "purchase acknowledge success");
                    C1546a aVar = this.f1507a.f1506b;
                    if (aVar != null) {
                        aVar.onSuccess(true);
                        return;
                    }
                    return;
                }
                Log.d("QGGooglePlayHelper", "purchase acknowledge failed");
                C1546a aVar2 = this.f1507a.f1506b;
                if (aVar2 != null) {
                    aVar2.mo12013a("acknowledge failed, code " + billingResult.getResponseCode());
                }
            }
        }

        C1548c(Purchase purchase, C1546a aVar) {
            this.f1505a = purchase;
            this.f1506b = aVar;
        }

        /* renamed from: a */
        public void mo12864a(boolean z) {
            AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(this.f1505a.getPurchaseToken()).build();
            Intrinsics.checkNotNullExpressionValue(build, "AcknowledgePurchaseParam…                 .build()");
            BillingClient a = C1545a.f1501a;
            Intrinsics.checkNotNull(a);
            a.acknowledgePurchase(build, new C1549a(this));
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            mo12864a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            C1546a aVar = this.f1506b;
            if (aVar != null) {
                aVar.mo12013a(str);
            }
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$consumePurchase$1", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "onFail", "", "error", "", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$g */
    public static final class C1553g implements C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Purchase f1511a;

        /* renamed from: b */
        final /* synthetic */ C1546a f1512b;

        /* renamed from: com.quickgame.android.sdk.i.a$g$a */
        static final class C1554a implements ConsumeResponseListener {

            /* renamed from: a */
            final /* synthetic */ C1553g f1513a;

            C1554a(C1553g gVar) {
                this.f1513a = gVar;
            }

            public final void onConsumeResponse(BillingResult billingResult, String str) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_PURCHASE_TOKEN);
                if (billingResult.getResponseCode() == 0) {
                    Log.d("QGGooglePlayHelper", "consume purchase success");
                    C1546a aVar = this.f1513a.f1512b;
                    if (aVar != null) {
                        aVar.onSuccess(true);
                        return;
                    }
                    return;
                }
                Log.e("QGGooglePlayHelper", "consume purchase failed");
                C1546a aVar2 = this.f1513a.f1512b;
                if (aVar2 != null) {
                    aVar2.mo12013a("consumePurchase failed, code " + billingResult.getResponseCode());
                }
            }
        }

        C1553g(Purchase purchase, C1546a aVar) {
            this.f1511a = purchase;
            this.f1512b = aVar;
        }

        /* renamed from: a */
        public void mo12868a(boolean z) {
            ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(this.f1511a.getPurchaseToken()).build();
            Intrinsics.checkNotNullExpressionValue(build, "ConsumeParams.newBuilder…                 .build()");
            BillingClient a = C1545a.f1501a;
            Intrinsics.checkNotNull(a);
            a.consumeAsync(build, new C1554a(this));
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            mo12868a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            C1546a aVar = this.f1512b;
            if (aVar != null) {
                aVar.mo12013a(str);
            }
        }
    }

    /* renamed from: a */
    private final void m1895a(Context context, C1546a<Boolean> aVar) {
        if (f1501a == null) {
            Log.d("QGGooglePlayHelper", "billingClient build");
            f1501a = BillingClient.newBuilder(context.getApplicationContext()).setListener(this).enablePendingPurchases().build();
        }
        BillingClient billingClient = f1501a;
        Intrinsics.checkNotNull(billingClient);
        if (!billingClient.isReady()) {
            Log.d("QGGooglePlayHelper", "billingClient start conn");
            BillingClient billingClient2 = f1501a;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C1555h(aVar));
            }
        } else if (aVar != null) {
            aVar.onSuccess(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m1899b(Purchase purchase) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        try {
            C1128a r = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
            Context e = r.mo11981e();
            if (e != null && (sharedPreferences = e.getSharedPreferences("quickOrder", 0)) != null && (edit = sharedPreferences.edit()) != null) {
                AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                Intrinsics.checkNotNull(accountIdentifiers);
                Intrinsics.checkNotNullExpressionValue(accountIdentifiers, "purchase.accountIdentifiers!!");
                SharedPreferences.Editor remove = edit.remove(accountIdentifiers.getObfuscatedProfileId());
                if (remove != null) {
                    remove.apply();
                }
            }
        } catch (Exception e2) {
            Log.w("QGGooglePlayHelper", "rm sp orderInfo " + e2.getMessage());
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$querySkuDetail$2", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "onFail", "", "error", "", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$l */
    public static final class C1561l implements C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f1522a;

        /* renamed from: b */
        final /* synthetic */ C1546a f1523b;

        /* renamed from: com.quickgame.android.sdk.i.a$l$a */
        static final class C1562a implements SkuDetailsResponseListener {

            /* renamed from: a */
            final /* synthetic */ C1561l f1524a;

            C1562a(C1561l lVar) {
                this.f1524a = lVar;
            }

            public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
                Intrinsics.checkNotNullParameter(billingResult, "result");
                if (billingResult.getResponseCode() != 0 || list == null || !(!list.isEmpty())) {
                    C1546a aVar = this.f1524a.f1523b;
                    if (aVar != null) {
                        aVar.mo12013a("query failed");
                        return;
                    }
                    return;
                }
                C1546a aVar2 = this.f1524a.f1523b;
                if (aVar2 != null) {
                    aVar2.onSuccess(list);
                }
            }
        }

        C1561l(List list, C1546a aVar) {
            this.f1522a = list;
            this.f1523b = aVar;
        }

        /* renamed from: a */
        public void mo12872a(boolean z) {
            SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(BillingClient.SkuType.INAPP).setSkusList(this.f1522a).build();
            Intrinsics.checkNotNullExpressionValue(build, "SkuDetailsParams.newBuil…                 .build()");
            BillingClient a = C1545a.f1501a;
            Intrinsics.checkNotNull(a);
            a.querySkuDetailsAsync(build, new C1562a(this));
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            mo12872a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            C1546a aVar = this.f1523b;
            if (aVar != null) {
                aVar.mo12013a(str);
            }
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo13302d2 = {"com/quickgame/android/sdk/pay/GooglePlayHelper$querySkuDetail$1", "Lcom/quickgame/android/sdk/pay/GooglePlayHelper$DataCallBack;", "", "onFail", "", "error", "", "onSuccess", "result", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.i.a$k */
    public static final class C1559k implements C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f1518a;

        /* renamed from: b */
        final /* synthetic */ C1546a f1519b;

        /* renamed from: c */
        final /* synthetic */ boolean f1520c;

        /* renamed from: com.quickgame.android.sdk.i.a$k$a */
        static final class C1560a implements SkuDetailsResponseListener {

            /* renamed from: a */
            final /* synthetic */ C1559k f1521a;

            C1560a(C1559k kVar) {
                this.f1521a = kVar;
            }

            public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
                Intrinsics.checkNotNullParameter(billingResult, "result");
                if (billingResult.getResponseCode() == 0 && list != null && (!list.isEmpty())) {
                    for (SkuDetails skuDetails : list) {
                        ConcurrentHashMap b = C1545a.f1502b;
                        Intrinsics.checkNotNullExpressionValue(skuDetails, "it");
                        String sku = skuDetails.getSku();
                        Intrinsics.checkNotNullExpressionValue(sku, "it.sku");
                        b.put(sku, skuDetails);
                    }
                    C1546a aVar = this.f1521a.f1519b;
                    if (aVar != null) {
                        aVar.onSuccess(C1545a.f1502b.get(this.f1521a.f1518a));
                    }
                } else if (!(billingResult.getResponseCode() == 0 && list == null) && (list == null || !list.isEmpty())) {
                    C1546a aVar2 = this.f1521a.f1519b;
                    if (aVar2 != null) {
                        aVar2.mo12013a("querySku failed, code " + billingResult.getResponseCode());
                    }
                } else {
                    C1546a aVar3 = this.f1521a.f1519b;
                    if (aVar3 != null) {
                        aVar3.mo12013a("please check the sku(" + this.f1521a.f1518a + ") has been added in google play backend");
                    }
                }
            }
        }

        C1559k(String str, C1546a aVar, boolean z) {
            this.f1518a = str;
            this.f1519b = aVar;
            this.f1520c = z;
        }

        /* renamed from: a */
        public void mo12871a(boolean z) {
            if (C1545a.f1502b.get(this.f1518a) != null) {
                String str = this.f1518a;
                SkuDetails skuDetails = (SkuDetails) C1545a.f1502b.get(this.f1518a);
                if (Intrinsics.areEqual((Object) str, (Object) skuDetails != null ? skuDetails.getSku() : null)) {
                    Log.d("QGGooglePlayHelper", "sku alreay exist");
                    C1546a aVar = this.f1519b;
                    if (aVar != null) {
                        aVar.onSuccess(C1545a.f1502b.get(this.f1518a));
                        return;
                    }
                    return;
                }
            }
            SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f1520c ? BillingClient.SkuType.INAPP : BillingClient.SkuType.SUBS).setSkusList(CollectionsKt.listOf(this.f1518a)).build();
            Intrinsics.checkNotNullExpressionValue(build, "SkuDetailsParams.newBuil…                 .build()");
            BillingClient a = C1545a.f1501a;
            if (a != null) {
                a.querySkuDetailsAsync(build, new C1560a(this));
            }
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            mo12871a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            C1546a aVar = this.f1519b;
            if (aVar != null) {
                aVar.mo12013a(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo12862b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mo12860a(context, true, (C1546a<List<Purchase>>) new C1552f(context));
    }

    /* renamed from: a */
    public final void mo12860a(Context context, boolean z, C1546a<List<Purchase>> aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("QGGooglePlayHelper", "query pendingPurchase");
        m1895a(context, (C1546a<Boolean>) new C1557j(z, aVar));
    }

    /* renamed from: a */
    public final void mo12858a(Context context, String str, boolean z, C1546a<SkuDetails> aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Log.d("QGGooglePlayHelper", "query sku:" + str);
        m1895a(context, (C1546a<Boolean>) new C1559k(str, aVar, z));
    }

    /* renamed from: a */
    public final void mo12859a(Context context, List<String> list, C1546a<List<SkuDetails>> aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "goodsIds");
        Log.d("QGGooglePlayHelper", "query sku:" + list);
        m1895a(context, (C1546a<Boolean>) new C1561l(list, aVar));
    }

    /* renamed from: a */
    public final void mo12857a(Context context, Purchase purchase, C1546a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Log.d("QGGooglePlayHelper", "ackPurchase");
        if (purchase.isAcknowledged()) {
            Log.d("QGGooglePlayHelper", "purchase isAcknowledged");
            if (aVar != null) {
                aVar.onSuccess(true);
                return;
            }
            return;
        }
        m1895a(context, (C1546a<Boolean>) new C1548c(purchase, aVar));
    }

    /* renamed from: a */
    public final void mo12854a(Activity activity, String str, String str2, String str3, C1547b bVar) {
        Intrinsics.checkNotNullParameter(activity, "context");
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Intrinsics.checkNotNullParameter(str2, "uid");
        Intrinsics.checkNotNullParameter(str3, "orderId");
        Intrinsics.checkNotNullParameter(bVar, "callBack");
        Log.d("QGGooglePlayHelper", "launchBilling goodsId:" + str);
        f1503c = bVar;
        BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
        SkuDetails skuDetails = f1502b.get(str);
        Intrinsics.checkNotNull(skuDetails);
        BillingFlowParams build = newBuilder.setSkuDetails(skuDetails).setObfuscatedAccountId(str2).setObfuscatedProfileId(str3).build();
        Intrinsics.checkNotNullExpressionValue(build, "BillingFlowParams.newBui…\n                .build()");
        BillingClient billingClient = f1501a;
        Intrinsics.checkNotNull(billingClient);
        BillingResult launchBillingFlow = billingClient.launchBillingFlow(activity, build);
        Intrinsics.checkNotNullExpressionValue(launchBillingFlow, "billingClient!!.launchBi…Flow(context, flowParams)");
        if (launchBillingFlow.getResponseCode() != 0) {
            bVar.mo12243a("launchBillingFlow failed: code " + launchBillingFlow.getResponseCode() + ", debugMsg " + launchBillingFlow.getDebugMessage());
        }
    }

    /* renamed from: a */
    public final boolean mo12861a(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        String originalJson = purchase.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "purchase.originalJson");
        return StringsKt.contains$default((CharSequence) originalJson, (CharSequence) "\"autoRenewing\":", false, 2, (Object) null);
    }

    /* renamed from: a */
    public final void mo12855a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mo12860a(context, true, (C1546a<List<Purchase>>) new C1550d(context));
        mo12860a(context, false, (C1546a<List<Purchase>>) new C1551e(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1894a(Context context, Purchase purchase, boolean z) {
        if (z || !purchase.isAcknowledged()) {
            HashMap hashMap = new HashMap();
            hashMap.put("signature", z ? NewGooglePlayActivity.f894j : NewGooglePlayActivity.f895k);
            String originalJson = purchase.getOriginalJson();
            Intrinsics.checkNotNullExpressionValue(originalJson, "purchase.originalJson");
            hashMap.put("purchaseData", mo12853a(originalJson));
            AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
            Intrinsics.checkNotNull(accountIdentifiers);
            Intrinsics.checkNotNullExpressionValue(accountIdentifiers, "purchase.accountIdentifiers!!");
            hashMap.put("orderNum", accountIdentifiers.getObfuscatedProfileId());
            C1428d.m1703a("/v1/user/postGooglePlayVerify", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1563m(context, purchase, z));
            return;
        }
        AccountIdentifiers accountIdentifiers2 = purchase.getAccountIdentifiers();
        Intrinsics.checkNotNull(accountIdentifiers2);
        Intrinsics.checkNotNullExpressionValue(accountIdentifiers2, "purchase.accountIdentifiers!!");
        C1534e.f1462f.mo12826e().onGooglePlaySub(purchase.getSkus().get(0), accountIdentifiers2.getObfuscatedProfileId(), purchase.isAutoRenewing(), true);
    }

    /* renamed from: a */
    public final void mo12856a(Context context, Purchase purchase, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (purchase != null) {
            switch (i) {
                case 50009:
                case 50010:
                case 50013:
                case 50014:
                case 50015:
                case 50023:
                case 50024:
                    mo12863b(context, purchase, (C1546a<Boolean>) null);
                    m1899b(purchase);
                    return;
                case 50025:
                    C1128a r = C1128a.m798r();
                    Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                    Context e = r.mo11981e();
                    if (e != null) {
                        SharedPreferences sharedPreferences = e.getSharedPreferences(purchase.getOrderId(), 0);
                        int i2 = sharedPreferences.getInt("times", 0);
                        if (i2 > 2) {
                            C1545a aVar = f1504d;
                            aVar.mo12863b(context, purchase, (C1546a<Boolean>) null);
                            sharedPreferences.edit().clear().apply();
                            aVar.m1899b(purchase);
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1893a() {
        if (C1534e.f1462f.mo12825d() != null) {
            C1538f l = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
            if (l.mo12847i() != null) {
                C1538f l2 = C1538f.m1861l();
                Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
                QGUserData i = l2.mo12847i();
                Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
                if (!TextUtils.isEmpty(i.getUid())) {
                    C1428d.m1703a("/v1/auth/bdPreUser", (Map<String, Object>) null, (C1426b<JSONObject>) new C1556i());
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo12853a(String str) {
        Intrinsics.checkNotNullParameter(str, "purchaseOriginalJson");
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put(SDKConstants.PARAM_DEVELOPER_PAYLOAD, jSONObject.getString("obfuscatedProfileId"));
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
            return jSONObject2;
        } catch (Exception e) {
            Log.e("QGGooglePlayHelper", "addDeveloperPayload exception " + e.getMessage());
            return str;
        }
    }
}
