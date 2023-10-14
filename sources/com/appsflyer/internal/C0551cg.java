package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.cg */
public final class C0551cg {
    public static void AFInAppEventType(C0458ac acVar, C0607i iVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        C0458ac acVar2 = acVar;
        Context context2 = context;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (iVar.valueOf()) {
            if (C0458ac.AFKeystoreWrapper == null) {
                AFLogger.AFInAppEventParameterName("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb.append(iVar.onInstallConversionFailureNative);
            AFLogger.AFInAppEventParameterName(sb.toString());
            long j = sharedPreferences2.getLong("appsflyerConversionDataCacheExpiration", 0);
            if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                AFLogger.AFInAppEventParameterName("[GCD-E02] Cached conversion data expired");
                C0458ac.values(context2, "sixtyDayConversionData");
                C0458ac.valueOf(context2, "attributionId", (String) null);
                acVar.AFInAppEventType(context2, "appsflyerConversionDataCacheExpiration", 0);
            }
            if (sharedPreferences2.getString("attributionId", (String) null) != null) {
                if (acVar.valueOf(sharedPreferences2, false) > 1) {
                    try {
                        Map<String, Object> AFInAppEventParameterName = AFInAppEventParameterName(context);
                        if (AFInAppEventParameterName != null) {
                            try {
                                if (!AFInAppEventParameterName.containsKey("is_first_launch")) {
                                    AFInAppEventParameterName.put("is_first_launch", Boolean.FALSE);
                                }
                                C0546cc.values(AFInAppEventParameterName);
                            } catch (Throwable th2) {
                                AFLogger.valueOf(th2.getLocalizedMessage(), th2);
                            }
                        }
                    } catch (C0549ce e) {
                        AFLogger.valueOf(e.getMessage(), e);
                    }
                }
            } else if (th != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(th.getMessage());
                C0546cc.AFInAppEventParameterName(sb2.toString());
            } else if (num.intValue() != 200) {
                C0546cc.AFInAppEventParameterName("Launch status code: ".concat(String.valueOf(num)));
            } else {
                C0546cc ccVar = new C0546cc(acVar, (Application) context.getApplicationContext(), str);
                C0458ac.valueOf(ccVar.AFInAppEventParameterName, ccVar, 10, TimeUnit.MILLISECONDS);
            }
        }
    }

    static Map<String, Object> AFInAppEventParameterName(Context context) throws C0549ce {
        String string = C0458ac.AFInAppEventType(context).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return values(string);
        }
        throw new C0549ce();
    }

    static Map<String, Object> values(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }
}
