package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* renamed from: com.appsflyer.internal.cz */
public abstract class C0572cz extends C0580dd {
    C0572cz(String str, Runnable runnable) {
        super(str, runnable);
    }

    /* access modifiers changed from: package-private */
    public final void values(Context context, C0508aw<Map<String, Object>> awVar) {
        if (C0458ac.AFInAppEventParameterName().valueOf(C0458ac.AFInAppEventType(context), false) <= 0 && awVar.values()) {
            new Thread(awVar.AFInAppEventType).start();
            values();
        }
    }
}
