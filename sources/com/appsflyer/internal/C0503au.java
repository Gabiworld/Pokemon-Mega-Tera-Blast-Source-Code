package com.appsflyer.internal;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* renamed from: com.appsflyer.internal.au */
final class C0503au implements BillingClientStateListener {
    private /* synthetic */ C0504av AFKeystoreWrapper;

    public final void onBillingServiceDisconnected() {
    }

    C0503au(C0504av avVar) {
        this.AFKeystoreWrapper = avVar;
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        C0504av avVar = this.AFKeystoreWrapper;
        avVar.valueOf.submit(new Runnable(billingResult) {
            private /* synthetic */ BillingResult AFKeystoreWrapper;

            {
                this.AFKeystoreWrapper = r2;
            }

            public final void run() {
                try {
                    if (this.AFKeystoreWrapper.getResponseCode() == 0 && !C0504av.this.AFInAppEventParameterName.AFInAppEventParameterName("ars_history_sent")) {
                        Purchase.PurchasesResult queryPurchases = C0504av.this.values.queryPurchases(BillingClient.SkuType.SUBS);
                        List<Purchase> purchasesList = queryPurchases.getPurchasesList();
                        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
                            if (!purchasesList.isEmpty()) {
                                C0504av.AFInAppEventType(C0504av.this, true, purchasesList);
                                return;
                            }
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.AFInAppEventParameterName("Failed to log purchases history", th);
                }
            }
        });
    }
}
