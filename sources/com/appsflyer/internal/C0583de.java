package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.de */
public final class C0583de {
    private final List<C0580dd> AFInAppEventType = new ArrayList();

    public final synchronized void AFKeystoreWrapper(C0580dd ddVar) {
        this.AFInAppEventType.add(ddVar);
    }

    public final synchronized C0580dd[] AFInAppEventType() {
        return (C0580dd[]) this.AFInAppEventType.toArray(new C0580dd[0]);
    }
}
