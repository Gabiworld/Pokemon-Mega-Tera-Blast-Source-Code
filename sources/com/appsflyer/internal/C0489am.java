package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.am */
public final class C0489am {
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;
    private final boolean values;

    public C0489am() {
    }

    public static Map<String, String> AFKeystoreWrapper(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode((String) next.getKey(), "utf-8"), URLEncoder.encode((String) next.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.values((Throwable) e);
            }
        }
        return hashMap;
    }

    public C0489am(String str, long j, boolean z) {
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = j;
        this.values = z;
    }

    public final boolean values() {
        return this.values;
    }
}
