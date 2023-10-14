package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.cb */
public final class C0545cb {
    private static final long AFInAppEventParameterName = TimeUnit.HOURS.toSeconds(24);
    private final C0453aa AFInAppEventType;
    private final C0537bx values;

    public C0545cb(C0453aa aaVar, C0537bx bxVar) {
        this.AFInAppEventType = aaVar;
        this.values = bxVar;
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.rc.sandbox"));
    }

    public final long valueOf() {
        String AFInAppEventParameterName2 = this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventParameterName2 == null) {
            return AFInAppEventParameterName;
        }
        try {
            return Long.parseLong(AFInAppEventParameterName2);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(e.getMessage());
            AFLogger.valueOf(sb.toString(), e);
            return AFInAppEventParameterName;
        }
    }

    public final boolean AFInAppEventParameterName() {
        if (this.values.values == null) {
            AFLogger.values("CFG: active config is missing - fetching from CDN");
            return true;
        } else if (System.currentTimeMillis() - this.values.AFInAppEventType > TimeUnit.SECONDS.toMillis(this.values.valueOf)) {
            return true;
        } else {
            return false;
        }
    }
}
