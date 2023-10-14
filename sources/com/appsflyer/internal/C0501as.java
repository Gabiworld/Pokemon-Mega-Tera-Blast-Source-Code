package com.appsflyer.internal;

import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.as */
public final class C0501as {
    private final boolean AFInAppEventParameterName;
    public final Map<String, String> AFInAppEventType;
    private final boolean valueOf;
    public final List<Purchase> values;

    public C0501as() {
    }

    static JSONObject AFInAppEventParameterName(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (!jSONObject2.optBoolean("monitor", false) || z) {
                    C0484ak.AFInAppEventType().valueOf();
                    C0484ak.AFInAppEventType().AFInAppEventParameterName();
                } else {
                    C0484ak.AFInAppEventType().AFKeystoreWrapper();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String optString = jSONObject2.optString("ol_scheme", (String) null);
                String optString2 = jSONObject2.optString("ol_domain", (String) null);
                String optString3 = jSONObject2.optString("ol_ver", (String) null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.valueOf(th.getMessage(), th);
                C0484ak.AFInAppEventType().valueOf();
                C0484ak.AFInAppEventType().AFInAppEventParameterName();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
            AFLogger.valueOf(th.getMessage(), th);
            C0484ak.AFInAppEventType().valueOf();
            C0484ak.AFInAppEventType().AFInAppEventParameterName();
            return jSONObject;
        }
    }

    public C0501as(boolean z, boolean z2, List<Purchase> list, Map<String, String> map) {
        this.valueOf = z;
        this.AFInAppEventParameterName = z2;
        this.values = list;
        this.AFInAppEventType = map;
    }

    public final boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0501as asVar = (C0501as) obj;
            if (this.valueOf != asVar.valueOf || this.AFInAppEventParameterName != asVar.AFInAppEventParameterName || !this.values.equals(asVar.values)) {
                return false;
            }
            Map<String, String> map = this.AFInAppEventType;
            Map<String, String> map2 = asVar.AFInAppEventType;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.valueOf ? 1 : 0) * true) + (this.AFInAppEventParameterName ? 1 : 0)) * 31) + this.values.hashCode()) * 31;
        Map<String, String> map = this.AFInAppEventType;
        return hashCode + (map != null ? map.hashCode() : 0);
    }
}
