package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.bd */
public final class C0516bd {
    private static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug?app_id=";
    public static String AFKeystoreWrapper = "https://cdn-testsettings.appsflyersdk.com/android/v1/%s/settings";
    public static String values = "https://cdn-settings.appsflyersdk.com/android/v1/%s/settings";
    public final C0457ab AFInAppEventType;
    private final AppsFlyerProperties AFLogger$LogLevel;
    public final C0453aa valueOf;

    public C0516bd(C0457ab abVar, C0453aa aaVar, AppsFlyerProperties appsFlyerProperties) {
        this.AFInAppEventType = abVar;
        this.valueOf = aaVar;
        this.AFLogger$LogLevel = appsFlyerProperties;
    }

    public final C0524bl<String> AFKeystoreWrapper(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()}));
        sb.append(this.valueOf.AFInAppEventParameterName.getPackageName());
        C0630z zVar = new C0630z(sb.toString(), new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap(), false);
        C0522bj bjVar = new C0522bj();
        zVar.AFInAppEventParameterName = AFInAppEventType();
        C0457ab abVar = this.AFInAppEventType;
        return new C0524bl<>(zVar, abVar.AFKeystoreWrapper, abVar.valueOf, bjVar);
    }

    public final boolean AFInAppEventType() {
        return !this.AFLogger$LogLevel.getBoolean(AppsFlyerProperties.HTTP_CACHE, true);
    }
}
