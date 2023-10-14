package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.instrument.-$$Lambda$InstrumentUtility$HBKsMUwnp42XtnLVnfnZb_rzfX4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InstrumentUtility$HBKsMUwnp42XtnLVnfnZb_rzfX4 implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$InstrumentUtility$HBKsMUwnp42XtnLVnfnZb_rzfX4 INSTANCE = new $$Lambda$InstrumentUtility$HBKsMUwnp42XtnLVnfnZb_rzfX4();

    private /* synthetic */ $$Lambda$InstrumentUtility$HBKsMUwnp42XtnLVnfnZb_rzfX4() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m2575listAnrReportFiles$lambda1(file, str);
    }
}
