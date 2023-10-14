package com.facebook.internal.instrument.crashreport;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.Comparator;

/* renamed from: com.facebook.internal.instrument.crashreport.-$$Lambda$CrashHandler$Companion$WtsPGsweIsnOue9CG5UA2hmg1lM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashHandler$Companion$WtsPGsweIsnOue9CG5UA2hmg1lM implements Comparator {
    public static final /* synthetic */ $$Lambda$CrashHandler$Companion$WtsPGsweIsnOue9CG5UA2hmg1lM INSTANCE = new $$Lambda$CrashHandler$Companion$WtsPGsweIsnOue9CG5UA2hmg1lM();

    private /* synthetic */ $$Lambda$CrashHandler$Companion$WtsPGsweIsnOue9CG5UA2hmg1lM() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashHandler.Companion.m2582sendExceptionReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
