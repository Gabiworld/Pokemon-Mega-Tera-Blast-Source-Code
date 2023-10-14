package com.p010qg.easyfloat.p016g.p017a;

import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.qg.easyfloat.g.a.a */
public final class C0934a {

    /* renamed from: a */
    public static final C0934a f193a = new C0934a();

    private C0934a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[SYNTHETIC, Splitter:B:26:0x005b] */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m173a(java.lang.String r6) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils--->"
            java.lang.String r2 = "propName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.String r4 = "getprop "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r6)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.Process r3 = r3.exec(r4)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.String r3 = r4.readLine()     // Catch:{ Exception -> 0x003d }
            java.lang.String r5 = "input.readLine()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ Exception -> 0x003d }
            r4.close()     // Catch:{ Exception -> 0x003d }
            r4.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x003c:
            return r3
        L_0x003d:
            r3 = move-exception
            goto L_0x0043
        L_0x003f:
            r6 = move-exception
            goto L_0x0059
        L_0x0041:
            r3 = move-exception
            r4 = r2
        L_0x0043:
            java.lang.String r5 = "Unable to read sysprop "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r6)     // Catch:{ all -> 0x0057 }
            android.util.Log.e(r1, r6, r3)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0056
            r4.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x0056:
            return r2
        L_0x0057:
            r6 = move-exception
            r2 = r4
        L_0x0059:
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0063:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p016g.p017a.C0934a.m173a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final boolean mo11477b() {
        return !TextUtils.isEmpty(m173a("ro.miui.ui.version.name"));
    }

    /* renamed from: c */
    public final boolean mo11478c() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "VIVO", false, 2, (Object) null)) {
            String str2 = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str2, "MANUFACTURER");
            return StringsKt.contains$default((CharSequence) str2, (CharSequence) "vivo", false, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public final boolean mo11476a() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "HUAWEI", false, 2, (Object) null);
    }
}
