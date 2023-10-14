package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.-$$Lambda$FileLruCache$BufferFile$BhCOfMBEP2bxstCjA6OJyFLMPLI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FileLruCache$BufferFile$BhCOfMBEP2bxstCjA6OJyFLMPLI implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$FileLruCache$BufferFile$BhCOfMBEP2bxstCjA6OJyFLMPLI INSTANCE = new $$Lambda$FileLruCache$BufferFile$BhCOfMBEP2bxstCjA6OJyFLMPLI();

    private /* synthetic */ $$Lambda$FileLruCache$BufferFile$BhCOfMBEP2bxstCjA6OJyFLMPLI() {
    }

    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m2553filterExcludeNonBufferFiles$lambda1(file, str);
    }
}
