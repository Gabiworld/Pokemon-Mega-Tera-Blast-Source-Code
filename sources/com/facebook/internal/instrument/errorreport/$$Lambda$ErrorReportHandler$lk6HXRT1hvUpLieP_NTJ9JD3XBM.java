package com.facebook.internal.instrument.errorreport;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.instrument.errorreport.-$$Lambda$ErrorReportHandler$lk6HXRT1hvUpLieP_NTJ9JD3XBM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ErrorReportHandler$lk6HXRT1hvUpLieP_NTJ9JD3XBM implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$ErrorReportHandler$lk6HXRT1hvUpLieP_NTJ9JD3XBM INSTANCE = new $$Lambda$ErrorReportHandler$lk6HXRT1hvUpLieP_NTJ9JD3XBM();

    private /* synthetic */ $$Lambda$ErrorReportHandler$lk6HXRT1hvUpLieP_NTJ9JD3XBM() {
    }

    public final boolean accept(File file, String str) {
        return ErrorReportHandler.m2585listErrorReportFiles$lambda3(file, str);
    }
}
