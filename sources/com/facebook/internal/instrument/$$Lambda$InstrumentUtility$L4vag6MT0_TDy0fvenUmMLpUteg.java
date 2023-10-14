package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.instrument.-$$Lambda$InstrumentUtility$L4vag6MT0_TDy0fvenUmMLpUteg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InstrumentUtility$L4vag6MT0_TDy0fvenUmMLpUteg implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$InstrumentUtility$L4vag6MT0_TDy0fvenUmMLpUteg INSTANCE = new $$Lambda$InstrumentUtility$L4vag6MT0_TDy0fvenUmMLpUteg();

    private /* synthetic */ $$Lambda$InstrumentUtility$L4vag6MT0_TDy0fvenUmMLpUteg() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m2576listExceptionAnalysisReportFiles$lambda2(file, str);
    }
}
