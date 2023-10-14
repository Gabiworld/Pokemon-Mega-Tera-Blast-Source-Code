package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aq */
final class C0494aq extends C0490an {
    C0495a AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String init;
    boolean values = false;

    /* renamed from: com.appsflyer.internal.aq$a */
    interface C0495a {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    C0494aq(Uri uri, C0458ac acVar, Context context) {
        super(acVar, context, "GET");
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                if (uri.getHost().contains(strArr[i])) {
                    z = true;
                }
            }
            if (C0600f.AFLogger$LogLevel != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(C0600f.AFLogger$LogLevel));
                AFLogger.AFKeystoreWrapper(sb.toString());
                for (String str : C0600f.AFLogger$LogLevel) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.AFInAppEventParameterName("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.values = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.AFInAppEventParameterName = split[1];
                this.AFLogger$LogLevel = split[2];
                this.init = uri.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean AFInAppEventType() {
        return !TextUtils.isEmpty(this.AFInAppEventParameterName) && !TextUtils.isEmpty(this.AFLogger$LogLevel) && !this.AFInAppEventParameterName.equals("app");
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AppsFlyer2dXConversionCallback);
        String valueOf = String.valueOf(this.AFVersionDeclaration.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.AFVersionDeclaration.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.AFVersionDeclaration.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.AFVersionDeclaration.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.AFVersionDeclaration.get(ServerProtocol.DIALOG_PARAM_SDK_VERSION)));
        AFKeystoreWrapper(httpsURLConnection, this.valueOf, this.AppsFlyer2dXConversionCallback, this.AFInAppEventParameterName, this.AFLogger$LogLevel, valueOf);
    }

    /* access modifiers changed from: package-private */
    public final String values() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventType, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()}));
        sb.append("/");
        sb.append(this.AFInAppEventParameterName);
        sb.append("?id=");
        sb.append(this.AFLogger$LogLevel);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void valueOf(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFKeystoreWrapper.valueOf(hashMap);
        } catch (JSONException e) {
            this.AFKeystoreWrapper.AFKeystoreWrapper("Can't parse OneLink data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void valueOf() {
        String str = this.init;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFKeystoreWrapper.AFKeystoreWrapper(str);
    }
}
