package com.quickgame.android.sdk.p043l;

import android.content.Context;

/* renamed from: com.quickgame.android.sdk.l.e */
public class C1602e {
    /* renamed from: a */
    public static void m2075a(Context context, String str) {
        m2076a(context, "qg_Users", "qg_Users", (Object) str);
    }

    /* renamed from: b */
    public static String m2079b(Context context) {
        return context == null ? "" : m2074a(context, "qg_Users", "qg_Users", "").toString();
    }

    /* renamed from: c */
    public static void m2080c(Context context) {
        m2076a(context, "qg_agreement", "had_confirm", (Object) true);
    }

    /* renamed from: a */
    public static boolean m2077a(Context context) {
        if (context == null) {
            return false;
        }
        return m2078a(context, "qg_agreement", "had_confirm", false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0.equals("String") == false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2076a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) {
        /*
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r0.hashCode()
            int r4 = r0.hashCode()
            r2 = -1
            switch(r4) {
                case -1808118735: goto L_0x004a;
                case -672261858: goto L_0x003f;
                case 2374300: goto L_0x0034;
                case 67973692: goto L_0x0029;
                case 1729365000: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            r1 = -1
            goto L_0x0053
        L_0x001e:
            java.lang.String r4 = "Boolean"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x001c
        L_0x0027:
            r1 = 4
            goto L_0x0053
        L_0x0029:
            java.lang.String r4 = "Float"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x001c
        L_0x0032:
            r1 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r4 = "Long"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x003d
            goto L_0x001c
        L_0x003d:
            r1 = 2
            goto L_0x0053
        L_0x003f:
            java.lang.String r4 = "Integer"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0048
            goto L_0x001c
        L_0x0048:
            r1 = 1
            goto L_0x0053
        L_0x004a:
            java.lang.String r4 = "String"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0053
            goto L_0x001c
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0075;
                case 2: goto L_0x006b;
                case 3: goto L_0x0061;
                case 4: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0084
        L_0x0057:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r3.putBoolean(r5, r4)
            goto L_0x0084
        L_0x0061:
            java.lang.Float r6 = (java.lang.Float) r6
            float r4 = r6.floatValue()
            r3.putFloat(r5, r4)
            goto L_0x0084
        L_0x006b:
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r3.putLong(r5, r0)
            goto L_0x0084
        L_0x0075:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            r3.putInt(r5, r4)
            goto L_0x0084
        L_0x007f:
            java.lang.String r6 = (java.lang.String) r6
            r3.putString(r5, r6)
        L_0x0084:
            r3.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.p043l.C1602e.m2076a(android.content.Context, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    private static boolean m2078a(Context context, String str, String str2, boolean z) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    /* renamed from: a */
    private static String m2074a(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
