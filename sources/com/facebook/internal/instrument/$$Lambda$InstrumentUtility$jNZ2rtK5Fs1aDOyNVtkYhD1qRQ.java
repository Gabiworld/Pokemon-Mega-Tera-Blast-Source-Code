package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.instrument.-$$Lambda$InstrumentUtility$jNZ-2rtK5Fs1aDOyNVtkYhD1qRQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InstrumentUtility$jNZ2rtK5Fs1aDOyNVtkYhD1qRQ implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$InstrumentUtility$jNZ2rtK5Fs1aDOyNVtkYhD1qRQ INSTANCE = new $$Lambda$InstrumentUtility$jNZ2rtK5Fs1aDOyNVtkYhD1qRQ();

    private /* synthetic */ $$Lambda$InstrumentUtility$jNZ2rtK5Fs1aDOyNVtkYhD1qRQ() {
    }

    public final boolean accept(File file, String str) {
        return InstrumentUtility.m2577listExceptionReportFiles$lambda3(file, str);
    }
}
