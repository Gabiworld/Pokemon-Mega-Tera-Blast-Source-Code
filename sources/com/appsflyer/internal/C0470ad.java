package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C0490an;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ad */
public final class C0470ad implements Runnable {
    private static String AFInAppEventType = null;
    private static String valueOf = "https://%ssdk-services.%s/validate-android-signature";
    private String AFInAppEventParameterName;
    /* access modifiers changed from: private */
    public WeakReference<Context> AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    /* access modifiers changed from: private */
    public Map<String, String> AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(C0458ac.AFInAppEventType);
        sb.append("/androidevent?buildnumber=6.5.3&app_id=");
        AFInAppEventType = sb.toString();
    }

    C0470ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.values = str2;
        this.init = str4;
        this.AFVersionDeclaration = str5;
        this.AFLogger$LogLevel = str6;
        this.AppsFlyer2dXConversionCallback = map;
        this.getLevel = str3;
    }

    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.AFKeystoreWrapper.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.values);
                    hashMap.put("sig-data", this.init);
                    hashMap.put("signature", this.getLevel);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        public final void run() {
                            C0470ad adVar = C0470ad.this;
                            C0470ad.valueOf(adVar, hashMap2, adVar.AppsFlyer2dXConversionCallback, C0470ad.this.AFKeystoreWrapper);
                        }
                    }).start();
                    hashMap.put("dev_key", this.AFInAppEventParameterName);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                    if (string != null) {
                        hashMap.put("advertiserId", string);
                    }
                    String jSONObject = new JSONObject(hashMap).toString();
                    String format = String.format(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()});
                    C0484ak.AFInAppEventType().AFInAppEventType(format, jSONObject);
                    HttpURLConnection AFKeystoreWrapper2 = AFKeystoreWrapper((C0564ct) new C0562cr().AFInAppEventParameterName(hashMap).AFInAppEventType(format));
                    int i = -1;
                    if (AFKeystoreWrapper2 != null) {
                        i = AFKeystoreWrapper2.getResponseCode();
                    }
                    C0458ac.AFInAppEventParameterName();
                    String AFInAppEventParameterName2 = C0458ac.AFInAppEventParameterName(AFKeystoreWrapper2);
                    C0484ak.AFInAppEventType().values(format, i, AFInAppEventParameterName2);
                    JSONObject jSONObject2 = new JSONObject(AFInAppEventParameterName2);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.values(sb.toString());
                        AFKeystoreWrapper(jSONObject2.optBoolean("result"), this.init, this.AFVersionDeclaration, this.AFLogger$LogLevel, jSONObject2.toString());
                    } else {
                        AFLogger.values("Failed Validate request");
                        AFKeystoreWrapper(false, this.init, this.AFVersionDeclaration, this.AFLogger$LogLevel, jSONObject2.toString());
                    }
                    if (AFKeystoreWrapper2 != null) {
                        AFKeystoreWrapper2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private static HttpURLConnection AFKeystoreWrapper(C0564ct ctVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(ctVar.onDeepLinkingNative);
        AFLogger.AFInAppEventParameterName(sb.toString());
        ctVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new C0490an.C0491c(ctVar).values();
    }

    private static void AFKeystoreWrapper(boolean z, String str, String str2, String str3, String str4) {
        if (C0458ac.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.AFInAppEventParameterName(sb.toString());
            if (z) {
                AFLogger.AFInAppEventParameterName("Validate in app purchase success: ".concat(String.valueOf(str4)));
                C0458ac.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.AFInAppEventParameterName("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = C0458ac.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    static /* synthetic */ void valueOf(C0470ad adVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            C0620w.AFKeystoreWrapper((Context) weakReference.get()).AFInAppEventType();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventType, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()}));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = C0458ac.AFInAppEventType((Context) weakReference.get()).getString("referrer", "");
            C0565cu cuVar = new C0565cu((Context) weakReference.get());
            cuVar.AFVersionDeclaration = adVar.AFInAppEventParameterName;
            cuVar.AppsFlyer2dXConversionCallback = string;
            C0565cu cuVar2 = cuVar;
            C0458ac AFInAppEventParameterName2 = C0458ac.AFInAppEventParameterName();
            Map<String, Object> AFInAppEventType2 = AFInAppEventParameterName2.AFInAppEventType((C0607i) cuVar2);
            AFInAppEventType2.put("price", adVar.AFVersionDeclaration);
            AFInAppEventType2.put("currency", adVar.AFLogger$LogLevel);
            AFInAppEventType2.put("receipt_data", map);
            if (map2 != null) {
                AFInAppEventType2.put("extra_prms", map2);
            }
            AFInAppEventType2.putAll(AFInAppEventParameterName2.values().init().AFInAppEventParameterName());
            C0484ak.AFInAppEventType().AFInAppEventType(obj, new JSONObject(AFInAppEventType2).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection AFKeystoreWrapper2 = AFKeystoreWrapper((C0564ct) cuVar2.AFInAppEventParameterName(AFInAppEventType2).AFInAppEventType(obj));
                int i = -1;
                if (AFKeystoreWrapper2 != null) {
                    i = AFKeystoreWrapper2.getResponseCode();
                }
                String AFInAppEventParameterName3 = C0458ac.AFInAppEventParameterName(AFKeystoreWrapper2);
                C0484ak.AFInAppEventType().values(obj, i, AFInAppEventParameterName3);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(AFInAppEventParameterName3).toString());
                AFLogger.values(sb2.toString());
                if (AFKeystoreWrapper2 != null) {
                    AFKeystoreWrapper2.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }
}
