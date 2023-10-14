package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;

/* renamed from: com.appsflyer.internal.cu */
public final class C0565cu extends C0564ct {
    public C0565cu(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    public final C0607i AFInAppEventType(String str) {
        return super.AFInAppEventType(values(str));
    }
}
