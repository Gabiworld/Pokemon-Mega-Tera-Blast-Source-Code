package com.facebook.internal.instrument.crashshield;

import kotlin.Metadata;

@Metadata(mo13301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017¨\u0006\u0004"}, mo13302d2 = {"com/facebook/internal/instrument/crashshield/CrashShieldHandler$scheduleCrashInDebug$1", "Ljava/lang/Runnable;", "run", "", "facebook-core_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* compiled from: CrashShieldHandler.kt */
public final class CrashShieldHandler$scheduleCrashInDebug$1 implements Runnable {

    /* renamed from: $e */
    final /* synthetic */ Throwable f46$e;

    CrashShieldHandler$scheduleCrashInDebug$1(Throwable th) {
        this.f46$e = th;
    }

    public void run() {
        throw new RuntimeException(this.f46$e);
    }
}
