package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ao */
public final class C0492ao {
    public final String AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public final C0563cs AFKeystoreWrapper;
    public final String valueOf;

    public C0492ao() {
    }

    public static void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (C0600f.valueOf().values != null) {
            AFLogger.AFInAppEventParameterName("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventType(new DeepLinkResult((DeepLink) null, error));
            return;
        }
        AFKeystoreWrapper(str);
    }

    public static void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (C0600f.valueOf().values != null) {
            try {
                DeepLink valueOf2 = DeepLink.valueOf(map);
                valueOf2.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(valueOf2, (DeepLinkResult.Error) null);
            } catch (JSONException e) {
                AFLogger.AFInAppEventParameterName("[DDL] Error occurred", (Throwable) e);
                deepLinkResult = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.UNEXPECTED);
            } catch (Throwable th) {
                AFInAppEventType(new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null));
                throw th;
            }
            AFInAppEventType(deepLinkResult);
            return;
        }
        AFKeystoreWrapper(map);
    }

    public static void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (C0600f.valueOf().values != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.AFInAppEventParameterName(sb.toString());
            try {
                C0600f.valueOf().values.onDeepLinking(deepLinkResult);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        } else {
            AFLogger.AFInAppEventParameterName("[DDL] skipping, no callback registered");
        }
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (C0458ac.AFKeystoreWrapper != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.AFInAppEventParameterName(sb.toString());
                C0458ac.AFKeystoreWrapper.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFKeystoreWrapper(String str) {
        if (C0458ac.AFKeystoreWrapper != null) {
            try {
                AFLogger.AFInAppEventParameterName("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                C0458ac.AFKeystoreWrapper.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    public C0492ao(String str) throws JSONException {
        C0563cs csVar;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.valueOf = string;
                this.AFInAppEventType = jSONObject.optBoolean("test_mode");
                this.AFInAppEventParameterName = str;
                if (string.startsWith("default")) {
                    csVar = C0563cs.DEFAULT;
                } else {
                    csVar = C0563cs.CUSTOM;
                }
                this.AFKeystoreWrapper = csVar;
            } catch (JSONException unused) {
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        } else {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0492ao aoVar = (C0492ao) obj;
        if (this.AFInAppEventType == aoVar.AFInAppEventType && this.valueOf.equals(aoVar.valueOf)) {
            return this.AFInAppEventParameterName.equals(aoVar.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.AFInAppEventType ? 1 : 0) * true) + this.valueOf.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }
}
