package com.appsflyer.internal;

import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.facebook.appevents.codeless.internal.Constants;

/* renamed from: com.appsflyer.internal.bw */
public final class C0536bw {
    private static int AFInAppEventParameterName = 1;
    private static char[] AFInAppEventType = {'3', 39097, 12579, 51629, 25115, 64132, 37643, 11248, 50275, 23779, 62803, 36311, 9802, 48950, 22456, 61476, 34962, 8476, 47488, 21003, 60154, 33643, 7144, 46174, 19652, 58698, 32304, 5834, 44846, 18321, 57369, 30855, 4470, 43516, 16993, 56042, 29534, 2995, 42057, 15665, 54694, 28255, 1681, 40815, 14223, 53363, 26879, 354, 39383, 12894, 51911, 25417, 64575, 38053, 11566, 50583, 24071, 63227, 36726, 10235, 49260, 22737, 61790, 35255};
    private static int valueOf;
    private static long values = -3780520048646514550L;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if ((r9 == null) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        if ((r9 != null ? 'K' : 3) != 3) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.C0511ay AFKeystoreWrapper(com.appsflyer.internal.C0492ao r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 1
        L_0x0007:
            if (r2 == r0) goto L_0x0043
            int r2 = valueOf
            int r2 = r2 + 99
            int r3 = r2 % 128
            AFInAppEventParameterName = r3
            int r2 = r2 % 2
            if (r8 == 0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 == 0) goto L_0x0043
            int r2 = r3 + 13
            int r4 = r2 % 128
            valueOf = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x0031
            r2 = 84
            int r2 = r2 / r1
            if (r9 == 0) goto L_0x002b
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x003a
            goto L_0x0043
        L_0x002f:
            r6 = move-exception
            throw r6
        L_0x0031:
            r2 = 3
            if (r9 == 0) goto L_0x0037
            r4 = 75
            goto L_0x0038
        L_0x0037:
            r4 = 3
        L_0x0038:
            if (r4 == r2) goto L_0x0043
        L_0x003a:
            int r3 = r3 + 25
            int r2 = r3 % 128
            valueOf = r2
            int r3 = r3 % 2
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x004e
            com.appsflyer.internal.ay r6 = new com.appsflyer.internal.ay
            com.appsflyer.internal.cw r7 = com.appsflyer.internal.C0567cw.INTERNAL_ERROR
            r6.<init>(r1, r7)
            return r6
        L_0x004e:
            com.appsflyer.internal.ay r6 = AFInAppEventType(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0536bw.AFKeystoreWrapper(com.appsflyer.internal.ao, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.ay");
    }

    private static C0511ay AFInAppEventType(C0492ao aoVar, String str, String str2, String str3) {
        String str4;
        boolean z = false;
        if (str == null) {
            if (aoVar.AFKeystoreWrapper == C0563cs.DEFAULT) {
                z = true;
            }
            return new C0511ay(z, C0567cw.NA);
        }
        String intern = values((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64, ExpandableListView.getPackedPositionType(0)).intern();
        if (aoVar.AFKeystoreWrapper == C0563cs.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = valueOf(new StringBuilder(str3).reverse().toString(), aoVar.AFInAppEventParameterName, Constants.PLATFORM, "v1", str4).equals(str);
        return new C0511ay(equals, equals ? C0567cw.SUCCESS : C0567cw.FAILURE);
    }

    private static String valueOf(String str, String str2, String str3, String str4, String str5) {
        int i = valueOf + 109;
        AFInAppEventParameterName = i % 128;
        int i2 = i % 2;
        String valueOf2 = C0474ag.valueOf(C0474ag.AFInAppEventParameterName(str2, str3, str4, str5, ""), str);
        if ((valueOf2.length() < 12 ? 'b' : 19) != 'b') {
            String substring = valueOf2.substring(0, 12);
            int i3 = valueOf + 119;
            AFInAppEventParameterName = i3 % 128;
            int i4 = i3 % 2;
            return substring;
        }
        int i5 = AFInAppEventParameterName + 51;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return valueOf2;
    }

    private static String values(char c, int i, int i2) {
        String str;
        synchronized (C0587dh.AFInAppEventParameterName) {
            char[] cArr = new char[i];
            C0587dh.values = 0;
            while (C0587dh.values < i) {
                cArr[C0587dh.values] = (char) ((int) ((((long) AFInAppEventType[C0587dh.values + i2]) ^ (((long) C0587dh.values) * values)) ^ ((long) c)));
                C0587dh.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
