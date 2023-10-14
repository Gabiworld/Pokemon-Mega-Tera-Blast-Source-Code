package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* renamed from: com.appsflyer.internal.bx */
public final class C0537bx {
    public static final Charset AFInAppEventParameterName = Charset.forName("UTF-8");
    public long AFInAppEventType;
    public final C0535bv AFKeystoreWrapper;
    public long valueOf;
    public C0492ao values = values();

    public C0537bx(C0535bv bvVar) {
        this.AFKeystoreWrapper = bvVar;
        this.AFInAppEventType = bvVar.AFKeystoreWrapper("af_rc_timestamp");
        this.valueOf = bvVar.AFKeystoreWrapper("af_rc_max_age");
    }

    private C0492ao values() {
        String AFInAppEventType2 = this.AFKeystoreWrapper.AFInAppEventType("af_remote_config", (String) null);
        if (AFInAppEventType2 == null) {
            AFLogger.AFInAppEventParameterName("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new C0492ao(new String(Base64.decode(AFInAppEventType2, 2), AFInAppEventParameterName));
        } catch (Exception e) {
            AFLogger.AFInAppEventParameterName("CFG: Error reading malformed configuration from cache, requires fetching from remote again", (Throwable) e);
            return null;
        }
    }
}
