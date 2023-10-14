package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.appsflyer.internal.aw */
public abstract class C0508aw<T> {
    public final Context AFInAppEventParameterName;
    public final FutureTask<T> AFInAppEventType = new FutureTask<>(new Callable<T>() {
        public final T call() {
            if (C0508aw.this.values()) {
                return C0508aw.this.AFInAppEventType();
            }
            return null;
        }
    });
    public final String AFKeystoreWrapper;
    private final String[] valueOf;

    /* access modifiers changed from: protected */
    public abstract T AFInAppEventType();

    public C0508aw(Context context, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFKeystoreWrapper = str;
        this.valueOf = strArr;
    }

    public T AFKeystoreWrapper() {
        try {
            return this.AFInAppEventType.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    public final boolean values() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (resolveContentProvider == null || !Arrays.asList(this.valueOf).contains(C0630z.AFInAppEventParameterName(this.AFInAppEventParameterName.getPackageManager(), resolveContentProvider.packageName))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return false;
        }
    }
}
