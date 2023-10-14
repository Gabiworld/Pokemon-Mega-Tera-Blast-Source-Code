package com.appsflyer.internal;

import android.content.Context;

/* renamed from: com.appsflyer.internal.cm */
public abstract class C0557cm extends C0607i {
    private final boolean onAttributionFailureNative;
    public boolean onConversionDataSuccess;
    private final boolean onInstallConversionDataLoadedNative;

    C0557cm() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Context) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0557cm(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        boolean z = true;
        this.onAttributionFailureNative = bool != null ? bool.booleanValue() : true;
        this.onInstallConversionDataLoadedNative = bool2 != null ? bool2.booleanValue() : z;
    }

    public final boolean AFLogger$LogLevel() {
        return this.onConversionDataSuccess;
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onAttributionFailureNative;
    }

    public final boolean getLevel() {
        return this.onInstallConversionDataLoadedNative;
    }
}
