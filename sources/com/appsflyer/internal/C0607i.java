package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.i */
public abstract class C0607i {
    AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public Application AFKeystoreWrapper;
    byte[] AFLogger$LogLevel;
    String AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    String getLevel;
    String init;
    String onDeepLinkingNative;
    private final boolean onInstallConversionDataLoadedNative;
    public int onInstallConversionFailureNative;
    String valueOf;
    Map<String, Object> values;

    public C0607i() {
        this((String) null, (String) null, (Boolean) null, (Context) null);
    }

    public C0607i(String str, String str2, Boolean bool, Context context) {
        boolean z;
        this.AFInAppEventType = new HashMap();
        this.getLevel = str;
        this.onDeepLinkingNative = str2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.onInstallConversionDataLoadedNative = z;
        if (context != null) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
    }

    public C0607i AFInAppEventType(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public final boolean valueOf() {
        return this.getLevel == null && this.init == null;
    }

    public final C0607i AFInAppEventParameterName(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventType.putAll(map);
        }
        return this;
    }

    public final Map<String, Object> values() {
        return this.AFInAppEventType;
    }

    public final C0607i valueOf(int i) {
        this.onInstallConversionFailureNative = i;
        synchronized (this.AFInAppEventType) {
            if (this.AFInAppEventType.containsKey("counter")) {
                this.AFInAppEventType.put("counter", Integer.toString(i));
            }
            if (this.AFInAppEventType.containsKey("launch_counter")) {
                this.AFInAppEventType.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.AFLogger$LogLevel;
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    /* access modifiers changed from: protected */
    public final String values(String str) {
        String AFInAppEventParameterName2 = C0458ac.AFInAppEventParameterName().AFInAppEventParameterName((Context) this.AFKeystoreWrapper);
        return AFInAppEventParameterName2 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName2).build().toString() : str;
    }
}
