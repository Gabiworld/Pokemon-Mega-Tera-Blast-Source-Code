package com.quickgame.android.sdk.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.p010qg.gson.Gson;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1641f;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.p034e.C1383q;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p039h.C1534e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p040i.C1545a;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.List;
import org.json.JSONObject;

public class NewGooglePlayActivity extends MvpBaseActivity<C1641f> implements C1383q.C1385b, C1641f.C1644c {

    /* renamed from: j */
    public static String f894j = "SIGNATURE-V3";

    /* renamed from: k */
    public static String f895k = "SUBSCRIPTIONS-V3";

    /* renamed from: l */
    public static String f896l = "SINGLEPLAYERGAME-V3";

    /* renamed from: c */
    private String f897c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public QGOrderInfo f898d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public QGRoleInfo f899e;

    /* renamed from: f */
    private boolean f900f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f901g = f894j;

    /* renamed from: h */
    private boolean f902h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f903i = false;

    /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$a */
    class C1251a implements C1545a.C1546a<List<Purchase>> {
        C1251a() {
        }

        /* renamed from: a */
        public void onSuccess(List<Purchase> list) {
            NewGooglePlayActivity.this.m1232b(list);
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            NewGooglePlayActivity.this.m1243y(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m1240s() {
        try {
            mo12280p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m1241t() {
        if (C1128a.m798r().mo11995j() != null) {
            C1128a.m798r().mo11995j().onPayCancel(this.f898d.getProductOrderId(), this.f898d.getQkOrderNo(), "1");
        }
        m1240s();
    }

    /* renamed from: u */
    private void m1242u() {
        C1545a.f1504d.mo12858a((Context) this, this.f898d.getGoodsId(), this.f898d.getSkuType().equals(BillingClient.SkuType.INAPP), (C1545a.C1546a<SkuDetails>) new C1256e());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m1243y(String str) {
        Log.d("QGNewGPActivity", "finishActivityForError: " + str);
        if (C1128a.m798r().mo11995j() != null) {
            C1128a.m798r().mo11995j().onPayFailed(this.f898d.getProductOrderId(), this.f898d.getQkOrderNo(), str);
        }
        m1240s();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m1244z(String str) {
        if (!TextUtils.isEmpty(str)) {
            Log.d("QGNewGPActivity", "save sp orderInfo " + this.f898d.toString());
            getSharedPreferences("quickOrder", 0).edit().putString(str, this.f898d.toString()).apply();
        }
    }

    /* renamed from: n */
    public void mo12239n(String str) {
        mo12283x(str);
        C1601d.m2062a("create order failed", str);
        m1243y(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_googleplay);
        this.f898d = (QGOrderInfo) getIntent().getParcelableExtra("orderInfo");
        QGRoleInfo qGRoleInfo = (QGRoleInfo) getIntent().getParcelableExtra("roleInfo");
        this.f899e = qGRoleInfo;
        if (this.f898d == null || qGRoleInfo == null) {
            if (C1128a.m798r().mo11995j() != null) {
                C1128a.m798r().mo11995j().onPayFailed("", "", "orderInfo or roleInfo is null");
            }
            m1240s();
            return;
        }
        this.f903i = C1538f.m1861l().mo12843e().mo13107d().mo13097f();
        if (BillingClient.SkuType.SUBS.equals(this.f898d.getSkuType())) {
            this.f901g = f895k;
            this.f902h = false;
        }
        if (this.f903i) {
            this.f901g = f896l;
        }
        if (TextUtils.isEmpty(this.f898d.getOrderSubject())) {
            Log.e("QGNewGPActivity", "orderInfo orderSubject is null");
            m1243y("orderInfo orderSubject is null");
        } else if (TextUtils.isEmpty(this.f898d.getSuggestCurrency())) {
            Log.e("QGNewGPActivity", "orderInfo suggestCurrency is null");
            m1243y("orderInfo suggestCurrency is null");
        } else {
            if (C1538f.m1861l().mo12843e().mo13107d().mo13094c()) {
                Log.d("QGNewGPActivity", "pay report test " + this.f898d);
                C1268a.m1312a(String.valueOf(this.f898d.getAmount()), this.f898d.getProductOrderId(), this.f898d.getGoodsId(), this.f898d.getOrderSubject(), this.f898d.getSuggestCurrency(), (Purchase) null, (String) null);
                if (C1128a.m798r().mo11995j() != null) {
                    C1128a.m798r().mo11995j().onPaySuccess(this.f898d.getProductOrderId(), this.f898d.getQkOrderNo(), this.f898d.getGoodsId(), this.f898d.getExtrasParams());
                }
                finish();
            }
            this.f898d.changeType(30);
            mo12282w("");
            this.f900f = true;
            C1545a.f1504d.mo12860a((Context) this, this.f902h, (C1545a.C1546a<List<Purchase>>) new C1251a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        QGLog.m2386d("QGNewGPActivity", "onDestroy");
        super.onDestroy();
        C1128a.f605p = true;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* renamed from: f */
    public void mo12077f() {
        if (this.f900f) {
            m1241t();
        } else {
            m1243y("user cancel");
        }
    }

    /* renamed from: r */
    public C1641f m1251r() {
        return new C1641f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1232b(List<Purchase> list) {
        if (list != null && !list.isEmpty()) {
            for (Purchase next : list) {
                if (next.getSkus().get(0).equals(this.f898d.getGoodsId()) && next.getPurchaseState() == 1) {
                    if (next.getAccountIdentifiers() != null && !TextUtils.isEmpty(next.getAccountIdentifiers().getObfuscatedProfileId())) {
                        String string = getSharedPreferences("quickOrder", 0).getString(next.getAccountIdentifiers().getObfuscatedProfileId(), "");
                        if (!TextUtils.isEmpty(string)) {
                            this.f898d = (QGOrderInfo) new Gson().mo11564a(string, QGOrderInfo.class);
                        }
                    }
                    if (this.f902h) {
                        ((C1641f) this.f1648b).mo13134a(next, this.f901g);
                        return;
                    } else if (!next.isAcknowledged()) {
                        if (next.getAccountIdentifiers() == null || TextUtils.isEmpty(next.getAccountIdentifiers().getObfuscatedProfileId())) {
                            C1545a.f1504d.mo12857a((Context) this, next, (C1545a.C1546a<Boolean>) null);
                            C1534e.f1462f.mo12826e().onGooglePlaySub(next.getSkus().get(0), next.getAccountIdentifiers().getObfuscatedProfileId(), next.isAutoRenewing(), true);
                            m1243y("you already had the sku");
                            return;
                        }
                        ((C1641f) this.f1648b).mo13134a(next, this.f901g);
                        return;
                    }
                }
            }
        }
        m1242u();
    }

    /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$e */
    class C1256e implements C1545a.C1546a<SkuDetails> {
        C1256e() {
        }

        /* renamed from: a */
        public void onSuccess(SkuDetails skuDetails) {
            if (skuDetails == null || !skuDetails.getSku().equals(NewGooglePlayActivity.this.f898d.getGoodsId())) {
                NewGooglePlayActivity newGooglePlayActivity = NewGooglePlayActivity.this;
                newGooglePlayActivity.m1243y("query sku failed, check " + NewGooglePlayActivity.this.f898d.getGoodsId() + " in google play");
                return;
            }
            ((C1641f) NewGooglePlayActivity.this.f1648b).mo13135a(NewGooglePlayActivity.this.f898d, NewGooglePlayActivity.this.f899e);
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            NewGooglePlayActivity.this.mo12283x(str);
            NewGooglePlayActivity.this.m1243y(str);
        }
    }

    /* renamed from: a */
    public void mo12238a(String str, String str2, String str3) {
        Log.d("QGNewGPActivity", "create order success " + str2);
        this.f898d.setQkOrderNo(str2);
        this.f897c = str3;
        mo12280p();
        m1244z(str2);
        C1545a.f1504d.mo12854a(this, str, C1538f.m1861l().mo12847i().getUid(), str2, new C1252b());
        this.f900f = false;
    }

    /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$c */
    class C1253c implements C1545a.C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Purchase f906a;

        C1253c(Purchase purchase) {
            this.f906a = purchase;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if (!NewGooglePlayActivity.this.f903i) {
                NewGooglePlayActivity.this.m1230b(this.f906a);
                if (C1128a.m798r().mo11995j() != null) {
                    C1128a.m798r().mo11995j().onPaySuccess(NewGooglePlayActivity.this.f898d.getProductOrderId(), NewGooglePlayActivity.this.f898d.getQkOrderNo(), NewGooglePlayActivity.this.f898d.getGoodsId(), NewGooglePlayActivity.this.f898d.getExtrasParams());
                }
            }
            NewGooglePlayActivity.this.m1240s();
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            NewGooglePlayActivity.this.m1243y(str);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$d */
    class C1254d implements C1545a.C1546a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Purchase f908a;

        /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$d$a */
        class C1255a implements Runnable {
            C1255a() {
            }

            public void run() {
                C1128a.m798r().mo11995j().onPaySuccess(NewGooglePlayActivity.this.f898d.getProductOrderId(), NewGooglePlayActivity.this.f898d.getQkOrderNo(), NewGooglePlayActivity.this.f898d.getGoodsId(), NewGooglePlayActivity.this.f898d.getExtrasParams());
            }
        }

        C1254d(Purchase purchase) {
            this.f908a = purchase;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if (!NewGooglePlayActivity.this.f903i) {
                NewGooglePlayActivity.this.m1230b(this.f908a);
                if (C1128a.m798r().mo11995j() != null) {
                    NewGooglePlayActivity.this.runOnUiThread(new C1255a());
                }
            }
            NewGooglePlayActivity.this.m1240s();
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            NewGooglePlayActivity.this.m1243y(str);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.NewGooglePlayActivity$b */
    class C1252b implements C1545a.C1547b {
        C1252b() {
        }

        /* renamed from: a */
        public void mo12242a(Purchase purchase, String str) {
            NewGooglePlayActivity.this.mo12282w("");
            NewGooglePlayActivity.this.m1244z(str);
            if (NewGooglePlayActivity.this.f903i) {
                NewGooglePlayActivity.this.m1230b(purchase);
                Log.d("QGNewGPActivity", "singlePlay, callback app");
                if (C1128a.m798r().mo11995j() != null) {
                    C1128a.m798r().mo11995j().onPaySuccess(NewGooglePlayActivity.this.f898d.getProductOrderId(), NewGooglePlayActivity.this.f898d.getQkOrderNo(), NewGooglePlayActivity.this.f898d.getGoodsId(), NewGooglePlayActivity.this.f898d.getExtrasParams());
                }
            }
            ((C1641f) NewGooglePlayActivity.this.f1648b).mo13134a(purchase, NewGooglePlayActivity.this.f901g);
        }

        /* renamed from: a */
        public void mo12243a(String str) {
            NewGooglePlayActivity.this.m1243y(str);
        }

        /* renamed from: a */
        public void mo12241a() {
            NewGooglePlayActivity.this.m1241t();
        }
    }

    /* renamed from: a */
    public void mo12236a(Purchase purchase) {
        if (C1545a.f1504d.mo12861a(purchase)) {
            C1545a.f1504d.mo12857a((Context) this, purchase, (C1545a.C1546a<Boolean>) new C1253c(purchase));
        } else {
            C1545a.f1504d.mo12863b(this, purchase, new C1254d(purchase));
        }
    }

    /* renamed from: a */
    public void mo12237a(Purchase purchase, C1427c cVar) {
        try {
            if (cVar.mo12662a() > 0) {
                C1545a.f1504d.mo12856a((Context) this, purchase, cVar.mo12662a());
            }
        } catch (Exception e) {
            Log.w("QGNewGPActivity", "onVerifyPurchaseFail getErrorId exception " + e.getMessage());
        }
        String b = cVar.mo12663b();
        mo12283x(b);
        C1601d.m2062a("verify purchase failed", b);
        m1243y(b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1230b(Purchase purchase) {
        Log.d("QGNewGPActivity", "uploadPayInfo");
        if (purchase != null && purchase.getAccountIdentifiers() != null && !TextUtils.isEmpty(purchase.getAccountIdentifiers().getObfuscatedProfileId())) {
            try {
                if (this.f898d.getQkOrderNo().equals(purchase.getAccountIdentifiers().getObfuscatedProfileId())) {
                    C1268a.m1312a(String.valueOf(this.f898d.getAmount()), this.f898d.getProductOrderId(), this.f898d.getGoodsId(), this.f898d.getOrderSubject(), this.f898d.getSuggestCurrency(), purchase, this.f897c);
                } else {
                    String string = getSharedPreferences("quickOrder", 0).getString(purchase.getAccountIdentifiers().getObfuscatedProfileId(), "");
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            Log.d("QGNewGPActivity", "sp have orderInfo " + string);
                            jSONObject = new JSONObject(string);
                        } catch (Exception e) {
                            Log.e("QGNewGPActivity", "orderInfoStr to json Exception:" + e.getMessage());
                        }
                    }
                    C1268a.m1312a(String.valueOf(this.f898d.getAmount()), jSONObject.optString("productOrderId"), this.f898d.getGoodsId(), this.f898d.getOrderSubject(), this.f898d.getSuggestCurrency(), purchase, this.f897c);
                }
                try {
                    getSharedPreferences("quickOrder", 0).edit().remove(purchase.getAccountIdentifiers().getObfuscatedProfileId()).apply();
                    Log.d("QGNewGPActivity", "remove sp orderInfo " + purchase.getAccountIdentifiers().getObfuscatedProfileId());
                } catch (Exception e2) {
                    Log.w("QGNewGPActivity", "rm sp orderInfo " + e2.getMessage());
                }
            } catch (Exception e3) {
                Log.e("QGNewGPActivity", "DataEventReport paySuccess exception: " + e3.getMessage());
                e3.printStackTrace();
                try {
                    getSharedPreferences("quickOrder", 0).edit().remove(purchase.getAccountIdentifiers().getObfuscatedProfileId()).apply();
                    Log.d("QGNewGPActivity", "remove sp orderInfo " + purchase.getAccountIdentifiers().getObfuscatedProfileId());
                } catch (Exception e4) {
                    Log.w("QGNewGPActivity", "rm sp orderInfo " + e4.getMessage());
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                try {
                    getSharedPreferences("quickOrder", 0).edit().remove(purchase.getAccountIdentifiers().getObfuscatedProfileId()).apply();
                    Log.d("QGNewGPActivity", "remove sp orderInfo " + purchase.getAccountIdentifiers().getObfuscatedProfileId());
                } catch (Exception e5) {
                    Log.w("QGNewGPActivity", "rm sp orderInfo " + e5.getMessage());
                }
                throw th2;
            }
        }
    }
}
