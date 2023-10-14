package com.appsflyer.internal;

import android.os.Build;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.av */
public final class C0504av implements Runnable {
    final C0535bv AFInAppEventParameterName;
    public final C0520bh AFInAppEventType;
    private C0514bb AFKeystoreWrapper;
    private final C0516bd getLevel;
    public final ExecutorService valueOf;
    BillingClient values;

    public C0504av(C0520bh bhVar, C0514bb bbVar, C0535bv bvVar, ExecutorService executorService, C0516bd bdVar) {
        this.AFInAppEventType = bhVar;
        this.AFKeystoreWrapper = bbVar;
        this.AFInAppEventParameterName = bvVar;
        this.valueOf = executorService;
        this.getLevel = bdVar;
    }

    static /* synthetic */ void AFInAppEventType(C0504av avVar, final boolean z, List list) {
        Map map;
        boolean z2;
        final C0483aj AFKeystoreWrapper2 = avVar.AFInAppEventType.AFKeystoreWrapper();
        String str = null;
        if (AFKeystoreWrapper2 != null) {
            z2 = AFKeystoreWrapper2.AFInAppEventType;
            map = AFKeystoreWrapper2.values != null ? AFKeystoreWrapper2.values.apply(list) : null;
        } else {
            map = null;
            z2 = false;
        }
        C0501as asVar = new C0501as(z2, z, list, map);
        C0516bd bdVar = avVar.getLevel;
        String format = String.format("https://%sars.%s/api/v1/android/validate_subscription", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()});
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", bdVar.valueOf.AFInAppEventParameterName.getPackageName());
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            hashMap.put("cuid", string);
        }
        C0453aa aaVar = bdVar.valueOf;
        hashMap.put("app_version_name", C0630z.AFKeystoreWrapper(aaVar.AFInAppEventParameterName, aaVar.AFInAppEventParameterName.getPackageName()));
        HashMap hashMap2 = new HashMap();
        C0602g AFKeystoreWrapper3 = C0457ab.AFKeystoreWrapper(bdVar.valueOf.AFInAppEventParameterName, new HashMap());
        if (AFKeystoreWrapper3 != null) {
            str = AFKeystoreWrapper3.values;
        }
        if (str != null) {
            hashMap2.put("advertising_id", str);
        }
        hashMap2.put("appsflyer_id", C0473af.valueOf(new WeakReference(bdVar.valueOf.AFInAppEventParameterName)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", C0458ac.AFInAppEventType);
        hashMap.put("device_data", hashMap2);
        hashMap.put("is_cached", Boolean.valueOf(asVar.valueOf()));
        hashMap.put("environment", asVar.AFInAppEventParameterName() ? "SANDBOX" : "PRODUCTION");
        hashMap.put("additional_parameters", asVar.AFInAppEventType);
        ArrayList arrayList = new ArrayList();
        for (Purchase next : asVar.values) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("token", next.getPurchaseToken());
            hashMap3.put("subscription_id", next.getSku());
            arrayList.add(hashMap3);
        }
        hashMap.put(BillingClient.FeatureType.SUBSCRIPTIONS, arrayList);
        C0630z zVar = new C0630z(format, new JSONObject(hashMap).toString().getBytes(), "POST", Collections.emptyMap(), false);
        C0522bj bjVar = new C0522bj();
        zVar.AFInAppEventParameterName = bdVar.AFInAppEventType();
        C0457ab abVar = bdVar.AFInAppEventType;
        C0524bl blVar = new C0524bl(zVar, abVar.AFKeystoreWrapper, abVar.valueOf, bjVar);
        C05063 r14 = new C0521bi<String>() {
            public final void values(C0531br<String> brVar) {
                if (brVar.values()) {
                    if (z) {
                        C0504av.this.AFInAppEventParameterName.AFInAppEventType("ars_history_sent", true);
                    }
                    C0483aj ajVar = AFKeystoreWrapper2;
                    if (ajVar != null && ajVar.AFKeystoreWrapper != null) {
                        AFKeystoreWrapper2.AFKeystoreWrapper.accept(brVar.valueOf);
                        return;
                    }
                    return;
                }
                C0483aj ajVar2 = AFKeystoreWrapper2;
                if (ajVar2 != null && ajVar2.AFInAppEventParameterName != null) {
                    AFKeystoreWrapper2.AFInAppEventParameterName.accept(brVar.valueOf);
                }
            }

            public final void values(Throwable th) {
                C0483aj ajVar = AFKeystoreWrapper2;
                if (!(ajVar == null || ajVar.AFInAppEventParameterName == null)) {
                    AFKeystoreWrapper2.AFInAppEventParameterName.accept(th.getMessage());
                }
                AFLogger.values(th);
            }
        };
        if (!blVar.valueOf.getAndSet(true)) {
            blVar.AFKeystoreWrapper.submit(new Runnable(r14) {
                private /* synthetic */ C0521bi AFInAppEventParameterName;

                {
                    this.AFInAppEventParameterName = r2;
                }

                public final void run() {
                    try {
                        C0531br<String> AFInAppEventType2 = C0524bl.this.values.AFInAppEventType(C0524bl.this.AFInAppEventType);
                        if (this.AFInAppEventParameterName != null) {
                            try {
                                this.AFInAppEventParameterName.values(new C0531br(C0524bl.this.AFInAppEventParameterName.values((String) AFInAppEventType2.valueOf), AFInAppEventType2.values, AFInAppEventType2.AFKeystoreWrapper, AFInAppEventType2.AFInAppEventParameterName, AFInAppEventType2.AFInAppEventType));
                            } catch (JSONException e) {
                                this.AFInAppEventParameterName.values((Throwable) new ParsingException(e.getMessage(), e, AFInAppEventType2));
                            }
                        }
                    } catch (IOException e2) {
                        C0521bi biVar = this.AFInAppEventParameterName;
                        if (biVar != null) {
                            biVar.values((Throwable) e2);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Http call is already executed");
    }

    public final void run() {
        try {
            if (this.values == null) {
                C0514bb bbVar = this.AFKeystoreWrapper;
                BillingClient build = BillingClient.newBuilder(bbVar.AFInAppEventParameterName).setListener(new C0502at(this)).enablePendingPurchases().build();
                this.values = build;
                build.startConnection(new C0503au(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventParameterName("Failed to setup Play billing", th);
        }
    }
}
