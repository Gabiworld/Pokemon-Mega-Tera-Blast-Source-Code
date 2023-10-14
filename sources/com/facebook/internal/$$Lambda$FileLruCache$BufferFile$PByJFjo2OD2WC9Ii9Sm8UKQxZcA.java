package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.-$$Lambda$FileLruCache$BufferFile$PByJFjo2OD2WC9Ii9Sm8UKQxZcA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FileLruCache$BufferFile$PByJFjo2OD2WC9Ii9Sm8UKQxZcA implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$FileLruCache$BufferFile$PByJFjo2OD2WC9Ii9Sm8UKQxZcA INSTANCE = new $$Lambda$FileLruCache$BufferFile$PByJFjo2OD2WC9Ii9Sm8UKQxZcA();

    private /* synthetic */ $$Lambda$FileLruCache$BufferFile$PByJFjo2OD2WC9Ii9Sm8UKQxZcA() {
    }

    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m2552filterExcludeBufferFiles$lambda0(file, str);
    }
}
