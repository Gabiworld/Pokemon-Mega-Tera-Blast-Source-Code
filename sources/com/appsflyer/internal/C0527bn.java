package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appsflyer.internal.bn */
public abstract class C0527bn<Result> implements Comparable<C0527bn<?>>, Callable<C0528bo> {
    private static final AtomicInteger valueOf = new AtomicInteger();
    private final Set<C0533bt> AFInAppEventParameterName;
    private final int AFInAppEventType = valueOf.incrementAndGet();
    private final String AFKeystoreWrapper;
    private final C0533bt values;

    /* access modifiers changed from: protected */
    public abstract C0528bo values() throws Exception;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0527bn bnVar = (C0527bn) obj;
        int i = this.values.valueOf - bnVar.values.valueOf;
        return i == 0 ? this.AFInAppEventType - bnVar.AFInAppEventType : i;
    }

    public C0527bn(C0533bt btVar, C0533bt[] btVarArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        new HashSet();
        this.values = btVar;
        Collections.addAll(hashSet, btVarArr);
        this.AFKeystoreWrapper = str;
    }

    /* renamed from: AFInAppEventParameterName */
    public final C0528bo call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        try {
            return values();
        } catch (Throwable th) {
            C0528bo boVar = C0528bo.FAILURE;
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0527bn bnVar = (C0527bn) obj;
        if (this.values != bnVar.values) {
            return false;
        }
        return this.AFKeystoreWrapper.equals(bnVar.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return (this.values.hashCode() * 31) + this.AFKeystoreWrapper.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.values);
        sb.append("-");
        sb.append(this.AFKeystoreWrapper);
        String obj = sb.toString();
        if (String.valueOf(this.AFInAppEventType).equals(this.AFKeystoreWrapper)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.AFInAppEventType);
        return sb2.toString();
    }
}
