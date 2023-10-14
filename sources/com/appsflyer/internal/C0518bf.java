package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.bf */
public final class C0518bf implements C0519bg {
    private C0504av AFInAppEventParameterName;
    private C0520bh AFInAppEventType;
    public final C0517be AFKeystoreWrapper = new C0517be();
    private C0457ab AFLogger$LogLevel;
    private C0538by AFVersionDeclaration;
    private C0556cl AppsFlyer2dXConversionCallback;
    private C0453aa getLevel;
    private C0482ai init;
    private C0583de onAppOpenAttributionNative;
    private C0543ca onInstallConversionDataLoadedNative;
    private C0611l onInstallConversionFailureNative;
    private ExecutorService valueOf;
    private final int values = ((int) TimeUnit.SECONDS.toMillis(30));

    public final C0516bd valueOf() {
        return new C0516bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance());
    }

    private synchronized C0457ab onAppOpenAttributionNative() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new C0457ab(new C0526bm(this.values), onDeepLinkingNative());
        }
        return this.AFLogger$LogLevel;
    }

    private synchronized ExecutorService onDeepLinkingNative() {
        if (this.valueOf == null) {
            this.valueOf = Executors.newCachedThreadPool();
        }
        return this.valueOf;
    }

    public final synchronized C0453aa AFInAppEventType() {
        if (this.getLevel == null) {
            Context context = this.AFKeystoreWrapper.values;
            if (context != null) {
                this.getLevel = new C0453aa(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getLevel;
    }

    public final C0535bv AFInAppEventParameterName() {
        Context context = this.AFKeystoreWrapper.values;
        if (context != null) {
            return new C0515bc(C0458ac.AFInAppEventType(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private synchronized C0520bh onInstallConversionDataLoadedNative() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new C0520bh();
        }
        return this.AFInAppEventType;
    }

    public final synchronized C0504av AFKeystoreWrapper() {
        if (this.AFInAppEventParameterName == null) {
            C0520bh onInstallConversionDataLoadedNative2 = onInstallConversionDataLoadedNative();
            Context context = this.AFKeystoreWrapper.values;
            if (context != null) {
                this.AFInAppEventParameterName = new C0504av(onInstallConversionDataLoadedNative2, new C0514bb(context), AFInAppEventParameterName(), onDeepLinkingNative(), new C0516bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance()));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AFInAppEventParameterName;
    }

    public final synchronized C0538by values() {
        if (this.AFVersionDeclaration == null) {
            C0537bx bxVar = new C0537bx(AFInAppEventParameterName());
            this.AFVersionDeclaration = new C0538by(new C0536bw(), AFInAppEventType(), init(), bxVar, new C0516bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance()), new C0545cb(AFInAppEventType(), bxVar), Executors.newSingleThreadExecutor(), onInstallConversionFailureNative());
        }
        return this.AFVersionDeclaration;
    }

    public final synchronized C0556cl getLevel() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new C0556cl(AFInAppEventParameterName());
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    private synchronized C0482ai onInstallConversionFailureNative() {
        if (this.init == null) {
            new ThreadPoolExecutor(0, 4, 180, TimeUnit.SECONDS, new LinkedBlockingQueue());
            this.init = new C0482ai((byte) 0);
        }
        return this.init;
    }

    public final synchronized C0484ak AppsFlyer2dXConversionCallback() {
        return C0484ak.AFInAppEventType();
    }

    public final synchronized C0583de AFLogger$LogLevel() {
        if (this.onAppOpenAttributionNative == null) {
            this.onAppOpenAttributionNative = new C0583de();
        }
        return this.onAppOpenAttributionNative;
    }

    public final synchronized C0543ca init() {
        if (this.onInstallConversionDataLoadedNative == null) {
            this.onInstallConversionDataLoadedNative = new C0543ca(onAttributionFailureNative());
        }
        return this.onInstallConversionDataLoadedNative;
    }

    private synchronized C0517be onAttributionFailureNative() {
        return this.AFKeystoreWrapper;
    }

    public final synchronized C0611l AFVersionDeclaration() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new C0611l(onAttributionFailureNative());
        }
        return this.onInstallConversionFailureNative;
    }
}
