package com.p010qg.easyfloat.p018h;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.qg.easyfloat.h.e */
public final class C0940e {

    /* renamed from: a */
    public static final C0940e f199a = new C0940e();

    /* renamed from: b */
    private static String f200b = "EasyFloat--->";

    /* renamed from: c */
    private static boolean f201c;

    private C0940e() {
    }

    /* renamed from: a */
    public final void mo11502a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "msg");
        mo11503a(f200b, obj.toString());
    }

    /* renamed from: b */
    public final void mo11504b(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "msg");
        mo11505b(f200b, obj.toString());
    }

    /* renamed from: c */
    public final void mo11506c(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "msg");
        mo11507c(f200b, obj.toString());
    }

    /* renamed from: a */
    public final void mo11503a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "msg");
        if (f201c) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo11505b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "msg");
        if (f201c) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public final void mo11507c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "msg");
        if (f201c) {
            Log.w(str, str2);
        }
    }
}
