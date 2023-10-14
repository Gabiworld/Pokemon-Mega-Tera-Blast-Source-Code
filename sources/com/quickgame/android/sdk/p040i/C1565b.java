package com.quickgame.android.sdk.p040i;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import com.gaa.sdk.iap.ConsumeListener;
import com.gaa.sdk.iap.ConsumeParams;
import com.gaa.sdk.iap.IapResult;
import com.gaa.sdk.iap.IapResultListener;
import com.gaa.sdk.iap.ProductDetailsListener;
import com.gaa.sdk.iap.ProductDetailsParams;
import com.gaa.sdk.iap.PurchaseClient;
import com.gaa.sdk.iap.PurchaseClientStateListener;
import com.gaa.sdk.iap.PurchaseData;
import com.gaa.sdk.iap.PurchaseFlowParams;
import com.gaa.sdk.iap.PurchasesListener;
import com.gaa.sdk.iap.PurchasesUpdatedListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.quickgame.android.sdk.i.b */
public final class C1565b implements PurchasesUpdatedListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f1529a = C1565b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f1530b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public PurchaseClient f1531c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1575g f1532d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Set<String> f1533e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f1534f;

    /* renamed from: com.quickgame.android.sdk.i.b$a */
    class C1566a implements Runnable {
        C1566a() {
        }

        public void run() {
            C1565b.this.f1532d.mo12259g();
            Log.d(C1565b.this.f1529a, "Setup successful.");
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$b */
    class C1567b implements PurchaseClientStateListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f1536a;

        /* renamed from: com.quickgame.android.sdk.i.b$b$a */
        class C1568a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IapResult f1538a;

            C1568a(IapResult iapResult) {
                this.f1538a = iapResult;
            }

            public void run() {
                C1565b.this.m1937a(this.f1538a);
            }
        }

        C1567b(Runnable runnable) {
            this.f1536a = runnable;
        }

        public void onServiceDisconnected() {
            boolean unused = C1565b.this.f1534f = false;
        }

        public void onSetupFinished(IapResult iapResult) {
            if (iapResult.isSuccess()) {
                boolean unused = C1565b.this.f1534f = true;
                Runnable runnable = this.f1536a;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            new Handler().postDelayed(new C1568a(iapResult), 300);
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$c */
    class C1569c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PurchaseFlowParams f1540a;

        C1569c(PurchaseFlowParams purchaseFlowParams) {
            this.f1540a = purchaseFlowParams;
        }

        public void run() {
            C1565b.this.f1531c.launchPurchaseFlow(C1565b.this.f1530b, this.f1540a);
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$d */
    class C1570d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1542a;

        /* renamed from: b */
        final /* synthetic */ String f1543b;

        /* renamed from: c */
        final /* synthetic */ ProductDetailsListener f1544c;

        C1570d(String str, String str2, ProductDetailsListener productDetailsListener) {
            this.f1542a = str;
            this.f1543b = str2;
            this.f1544c = productDetailsListener;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f1542a);
            C1565b.this.f1531c.queryProductDetailsAsync(ProductDetailsParams.newBuilder().setProductIdList(arrayList).setProductType(this.f1543b).build(), this.f1544c);
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$e */
    class C1571e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PurchaseData f1546a;

        /* renamed from: com.quickgame.android.sdk.i.b$e$a */
        class C1572a implements ConsumeListener {
            C1572a() {
            }

            public void onConsumeResponse(IapResult iapResult, PurchaseData purchaseData) {
                if (!iapResult.isSuccess()) {
                    C1565b.this.m1937a(iapResult);
                } else if (purchaseData.getPurchaseToken().equals(C1571e.this.f1546a.getPurchaseToken())) {
                    C1565b.this.f1533e.remove(C1571e.this.f1546a.getPurchaseToken());
                    C1565b.this.f1532d.mo12253a(purchaseData, iapResult);
                } else {
                    C1565b.this.f1532d.onError("purchaseToken not equal");
                }
            }
        }

        C1571e(PurchaseData purchaseData) {
            this.f1546a = purchaseData;
        }

        public void run() {
            C1565b.this.f1531c.consumeAsync(ConsumeParams.newBuilder().setPurchaseData(this.f1546a).build(), new C1572a());
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$f */
    class C1573f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1549a;

        /* renamed from: b */
        final /* synthetic */ long f1550b;

        /* renamed from: com.quickgame.android.sdk.i.b$f$a */
        class C1574a implements PurchasesListener {
            C1574a() {
            }

            public void onPurchasesResponse(IapResult iapResult, List<PurchaseData> list) {
                String b = C1565b.this.f1529a;
                Log.i(b, C1573f.this.f1549a + " - Querying purchases elapsed time: " + (System.currentTimeMillis() - C1573f.this.f1550b) + "ms");
                if (iapResult.isSuccess()) {
                    C1565b.this.f1532d.mo12251a(iapResult, list);
                    return;
                }
                String b2 = C1565b.this.f1529a;
                Log.w(b2, C1573f.this.f1549a + " - queryPurchasesAsync() got an error response code: " + iapResult.getResponseCode());
                C1565b.this.m1937a(iapResult);
            }
        }

        C1573f(String str, long j) {
            this.f1549a = str;
            this.f1550b = j;
        }

        public void run() {
            C1565b.this.f1531c.queryPurchasesAsync(this.f1549a, new C1574a());
        }
    }

    /* renamed from: com.quickgame.android.sdk.i.b$g */
    public interface C1575g {
        /* renamed from: a */
        void mo12251a(IapResult iapResult, List<PurchaseData> list);

        /* renamed from: a */
        void mo12253a(PurchaseData purchaseData, IapResult iapResult);

        /* renamed from: a */
        void mo12255a(List<PurchaseData> list);

        /* renamed from: g */
        void mo12259g();

        /* renamed from: i */
        void mo12260i();

        /* renamed from: l */
        void mo12261l();

        /* renamed from: n */
        void mo12262n();

        void onError(String str);
    }

    public C1565b(Activity activity, C1575g gVar) {
        this.f1530b = activity;
        this.f1532d = gVar;
        this.f1531c = PurchaseClient.newBuilder(activity).setBase64PublicKey(C1576c.m1961b().f1555a).setListener(this).build();
        mo12879a((Runnable) new C1566a());
    }

    public void onPurchasesUpdated(IapResult iapResult, List<PurchaseData> list) {
        if (iapResult.isSuccess()) {
            this.f1532d.mo12255a(list);
        } else {
            m1937a(iapResult);
        }
    }

    /* renamed from: b */
    private void m1941b(Runnable runnable) {
        if (this.f1534f) {
            runnable.run();
        } else {
            mo12879a(runnable);
        }
    }

    /* renamed from: a */
    public void mo12875a() {
        PurchaseClient purchaseClient = this.f1531c;
        if (purchaseClient != null) {
            purchaseClient.endConnection();
            this.f1531c = null;
        }
    }

    /* renamed from: b */
    public void mo12882b(IapResultListener iapResultListener) {
        this.f1531c.launchUpdateOrInstallFlow(this.f1530b, iapResultListener);
    }

    /* renamed from: a */
    public void mo12879a(Runnable runnable) {
        this.f1531c.startConnection(new C1567b(runnable));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1937a(IapResult iapResult) {
        if (iapResult.getResponseCode() == 10) {
            Log.w(this.f1529a, "handleErrorCode() RESULT_NEED_LOGIN");
            this.f1532d.mo12261l();
        } else if (iapResult.getResponseCode() == 11) {
            Log.w(this.f1529a, "handleErrorCode() RESULT_NEED_UPDATE");
            this.f1532d.mo12262n();
        } else if (iapResult.getResponseCode() == 1) {
            Log.w(this.f1529a, "handleErrorCode() RESULT_USER_CANCELED");
            this.f1532d.mo12260i();
        } else {
            String str = iapResult.getMessage() + "(" + iapResult.getResponseCode() + ")";
            Log.d(this.f1529a, "handleErrorCode() error: " + str);
            this.f1532d.onError(str);
        }
    }

    /* renamed from: a */
    public void mo12876a(IapResultListener iapResultListener) {
        this.f1531c.launchLoginFlowAsync(this.f1530b, iapResultListener);
    }

    /* renamed from: a */
    public void mo12878a(PurchaseFlowParams purchaseFlowParams) {
        m1941b((Runnable) new C1569c(purchaseFlowParams));
    }

    /* renamed from: a */
    public void mo12881a(String str, String str2, ProductDetailsListener productDetailsListener) {
        m1941b((Runnable) new C1570d(str, str2, productDetailsListener));
    }

    /* renamed from: a */
    public void mo12877a(PurchaseData purchaseData) {
        Set<String> set = this.f1533e;
        if (set == null) {
            this.f1533e = new HashSet();
        } else if (set.contains(purchaseData.getPurchaseToken())) {
            Log.i(this.f1529a, "Token was already scheduled to be consumed - skipping...");
            return;
        }
        this.f1533e.add(purchaseData.getPurchaseToken());
        m1941b((Runnable) new C1571e(purchaseData));
    }

    /* renamed from: a */
    public void mo12880a(String str) {
        m1941b((Runnable) new C1573f(str, System.currentTimeMillis()));
    }
}
