package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.by */
public final class C0538by {
    final Object AFInAppEventParameterName = new Object();
    private final C0543ca AFInAppEventType;
    private final C0536bw AFKeystoreWrapper;
    private final C0516bd AFVersionDeclaration;
    private final C0545cb AppsFlyer2dXConversionCallback;
    private final C0537bx getLevel;
    private final Executor init;
    private final C0453aa valueOf;
    C0493ap values;

    public C0538by(C0536bw bwVar, C0453aa aaVar, C0543ca caVar, C0537bx bxVar, C0516bd bdVar, C0545cb cbVar, Executor executor, C0482ai aiVar) {
        this.AFKeystoreWrapper = bwVar;
        this.valueOf = aaVar;
        this.AFInAppEventType = caVar;
        this.getLevel = bxVar;
        this.AFVersionDeclaration = bdVar;
        this.AppsFlyer2dXConversionCallback = cbVar;
        this.init = executor;
        aiVar.AFKeystoreWrapper.add(this);
    }

    public final void values(final C0535bv bvVar) {
        final C0532bs bsVar = new C0532bs(this.AFKeystoreWrapper, this.valueOf, this.AFInAppEventType, this.getLevel, this.AFVersionDeclaration, this.AppsFlyer2dXConversionCallback, "v1");
        this.init.execute(new Runnable() {
            public final void run() {
                try {
                    bsVar.call();
                    C0534bu buVar = bsVar.AFKeystoreWrapper;
                    if (buVar != C0534bu.USE_CACHED) {
                        C0538by byVar = C0538by.this;
                        C0493ap apVar = bsVar.valueOf;
                        synchronized (byVar.AFInAppEventParameterName) {
                            byVar.values = apVar;
                        }
                    }
                    if (buVar == null) {
                        AFLogger.AppsFlyer2dXConversionCallback("CFG: update RC returned null result, something went wrong!");
                        C0534bu buVar2 = C0534bu.FAILURE;
                    }
                    synchronized (C0538by.this.AFInAppEventParameterName) {
                    }
                } catch (Exception unused) {
                    C0534bu buVar3 = C0534bu.FAILURE;
                    C0538by byVar2 = C0538by.this;
                    C0493ap apVar2 = bsVar.valueOf;
                    synchronized (byVar2.AFInAppEventParameterName) {
                        byVar2.values = apVar2;
                        synchronized (C0538by.this.AFInAppEventParameterName) {
                        }
                    }
                }
            }
        });
    }

    public final C0493ap AFKeystoreWrapper() {
        C0493ap apVar;
        synchronized (this.AFInAppEventParameterName) {
            apVar = this.values;
            this.values = null;
        }
        return apVar;
    }
}
