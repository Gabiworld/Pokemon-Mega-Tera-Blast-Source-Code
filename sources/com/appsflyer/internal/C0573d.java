package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.d */
public final class C0573d {
    private static int AFInAppEventParameterName = 654970919;
    private static int AFInAppEventType = 46;
    private static long AFKeystoreWrapper = 2500677876331219564L;
    private static int AFLogger$LogLevel = 1;
    private static short[] AppsFlyer2dXConversionCallback = null;
    private static int getLevel = 0;
    private static byte[] valueOf = {-28, 82, -75, -77, -75, -112, -75, 92, 78, -75, -126, 85, -75, -107, 1, -75, -75, -75, -23, 71, -72, 65, 77, 86, 97, -115, -73, 85, -82, 87, -74, 85, -67, 126, -114, -65, -66, -71, 74, -78, 73, -31, -89, 77, 119, -22, 95, -89, 16, -102, -85, -86, -83, 94, -90, 93, -44, 122, -32, 47, 35, -46, 37, -33, 96, -103, 32, 29, -21, -51, 51, -47, -40, 90, -94, -91, 89, -109, -5, -52, -26, -43, 44, -33, 46, 33, 40, -63, 57, 111, -110, -34, 33, -40, 125, -110, -34, 57, -37, 122, -111, -41, 47, 40, -44, 105, -122, 37, -44, 109, -101, -47, 126, -106, -43, -45, 41, 34, 49};
    private static int values = -1788657313;

    static String AFKeystoreWrapper(Context context, long j) {
        String str;
        long j2 = j;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        if ((valueOf(AFKeystoreWrapper("굱鿐괐ᗒ論犁蒮⮥팑╭﹥䉹薩ὶ퀑飄籺ை껒嘱ꯖ絭앩ࣅ艫圾ᬲ璞軀ㆂ픴⻄䡎", Color.red(0)).intern()) ? '#' : ':') != '#') {
            str = AFKeystoreWrapper("嗞磸嗮륣", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        } else {
            str = AFKeystoreWrapper("臏䓗臾႖", View.getDefaultSize(0, 0)).intern();
            int i = getLevel + 27;
            AFLogger$LogLevel = i % 128;
            int i2 = i % 2;
        }
        sb2.append(str);
        sb.append(AFKeystoreWrapper(context, sb2));
        try {
            sb.append(new SimpleDateFormat(AFKeystoreWrapper((Process.myTid() >> 22) - 47, (byte) (-75 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1788657434 - View.resolveSize(0, 0), (short) (TextUtils.indexOf("", '0') + 1), KeyEvent.getDeadChar(0, 0) - 654970919).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            int i3 = getLevel + 39;
            AFLogger$LogLevel = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                sb.append(j2);
                valueOf(sb3);
                return valueOf(AFInAppEventType(AFInAppEventType(values(sb.toString()), sb2.toString(), 99), sb3.toString(), 114), Long.valueOf(j));
            }
            sb.append(j2);
            valueOf(sb3);
            return valueOf(AFInAppEventType(AFInAppEventType(values(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return AFKeystoreWrapper("Ⲿ倨Ⳝ?膠锚ﳻ揚կ뼘꬛翧趀配减圶ၱ羽詊慢㨌▻ﳺઑ擜౞훺풝轩齃ཛྷ︤뤹ꃿ", TextUtils.indexOf("", "", 0)).intern();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r9 == null) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r9 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String valueOf(java.lang.String r8, java.lang.Long r9) {
        /*
            int r0 = AFLogger$LogLevel
            int r1 = r0 + 69
            int r2 = r1 % 128
            getLevel = r2
            int r1 = r1 % 2
            r1 = 86
            if (r8 == 0) goto L_0x0011
            r2 = 38
            goto L_0x0013
        L_0x0011:
            r2 = 86
        L_0x0013:
            r3 = 0
            r5 = 0
            if (r2 == r1) goto L_0x00c1
            int r0 = r0 + 5
            int r1 = r0 % 128
            getLevel = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x0030
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x002e }
            if (r9 == 0) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            goto L_0x00c1
        L_0x002e:
            r8 = move-exception
            throw r8
        L_0x0030:
            if (r9 == 0) goto L_0x00c1
        L_0x0032:
            int r0 = r8.length()
            r2 = 32
            if (r0 != r2) goto L_0x00c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = r9.toString()
            r9 = 0
            r2 = 0
        L_0x0045:
            int r6 = r8.length()
            r7 = 92
            if (r9 >= r6) goto L_0x0050
            r6 = 68
            goto L_0x0052
        L_0x0050:
            r6 = 92
        L_0x0052:
            if (r6 == r7) goto L_0x0060
            char r6 = r8.charAt(r9)
            int r6 = java.lang.Character.getNumericValue(r6)
            int r2 = r2 + r6
            int r9 = r9 + 1
            goto L_0x0045
        L_0x0060:
            java.lang.String r8 = java.lang.Integer.toHexString(r2)
            int r9 = r8.length()
            r2 = 7
            int r9 = r9 + r2
            r0.replace(r2, r9, r8)
            int r8 = getLevel
            int r8 = r8 + 115
            int r9 = r8 % 128
            AFLogger$LogLevel = r9
            int r8 = r8 % 2
            r8 = 0
        L_0x0078:
            int r9 = r0.length()
            if (r8 >= r9) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            if (r9 == 0) goto L_0x0090
            char r9 = r0.charAt(r8)
            int r9 = java.lang.Character.getNumericValue(r9)
            long r6 = (long) r9
            long r3 = r3 + r6
            int r8 = r8 + 1
            goto L_0x0078
        L_0x0090:
            r8 = 100
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0098
            r2 = 0
            goto L_0x0099
        L_0x0098:
            r2 = 1
        L_0x0099:
            if (r2 == 0) goto L_0x00bf
            int r8 = (int) r3
            r9 = 23
            r0.insert(r9, r8)
            r1 = 10
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ba
            java.lang.String r8 = ""
            int r8 = android.text.TextUtils.indexOf(r8, r8, r5)
            java.lang.String r1 = "嗞磸嗮륣"
            java.lang.String r8 = AFKeystoreWrapper((java.lang.String) r1, (int) r8)
            java.lang.String r8 = r8.intern()
            r0.insert(r9, r8)
        L_0x00ba:
            java.lang.String r8 = r0.toString()
            return r8
        L_0x00bf:
            long r3 = r3 % r8
            goto L_0x0090
        L_0x00c1:
            long r8 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
            java.lang.String r0 = "Ⲿ倨Ⳝ?膠锚ﳻ揚կ뼘꬛翧趀配减圶ၱ羽詊慢㨌▻ﳺઑ擜౞훺풝轩齃ཛྷ︤뤹ꃿ"
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            int r8 = -1 - r1
            java.lang.String r8 = AFKeystoreWrapper((java.lang.String) r0, (int) r8)
            java.lang.String r8 = r8.intern()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.valueOf(java.lang.String, java.lang.Long):java.lang.String");
    }

    private static boolean valueOf(String str) {
        int i = AFLogger$LogLevel + 19;
        getLevel = i % 128;
        int i2 = i % 2;
        try {
            Class.forName(str);
            int i3 = getLevel + 71;
            AFLogger$LogLevel = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFInAppEventType(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, AFInAppEventType(str2).charAt(0));
        String obj = sb.toString();
        int i2 = getLevel + 45;
        AFLogger$LogLevel = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    private static String AFInAppEventType(String str) {
        int i = AFLogger$LogLevel + 5;
        getLevel = i % 128;
        int i2 = i % 2;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        int i3 = AFLogger$LogLevel + 101;
        getLevel = i3 % 128;
        if ((i3 % 2 != 0 ? ',' : 'C') == 'C') {
            return num;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void valueOf(java.lang.StringBuilder r17) {
        /*
            r0 = r17
            r1 = 0
            int r2 = android.graphics.Color.alpha(r1)
            java.lang.String r3 = "Ⲵ軃ⳕӁ䕅凹宰쒆ի㪶箩౜羻卼ⵓ㙠凅觋퓙?訆뾖ﺐ苣ﲪ푾ꁪꭗ훦"
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r3, (int) r2)
            java.lang.String r2 = r2.intern()
            boolean r2 = valueOf((java.lang.String) r2)
            r3 = -1
            r4 = 1
            java.lang.String r5 = "嗞磸嗮륣"
            java.lang.String r6 = "臏䓗臾႖"
            r7 = 0
            if (r2 == 0) goto L_0x004d
            int r2 = AFLogger$LogLevel
            int r2 = r2 + 115
            int r9 = r2 % 128
            getLevel = r9
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0041
            long r9 = android.os.SystemClock.uptimeMillis()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            int r2 = r3 >> r2
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r6, (int) r2)
            java.lang.String r2 = r2.intern()
            goto L_0x005b
        L_0x0041:
            long r9 = android.os.SystemClock.uptimeMillis()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            int r2 = r2 + r3
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r6, (int) r2)
            goto L_0x0057
        L_0x004d:
            long r9 = android.widget.ExpandableListView.getPackedPositionForGroup(r1)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r5, (int) r2)
        L_0x0057:
            java.lang.String r2 = r2.intern()
        L_0x005b:
            r0.append(r2)
            int r2 = android.view.View.combineMeasuredStates(r1, r1)
            int r2 = -47 - r2
            java.lang.String r9 = ""
            int r10 = android.text.TextUtils.getOffsetAfter(r9, r1)
            r11 = 68
            int r10 = r10 + r11
            byte r10 = (byte) r10
            r12 = 1788657409(0x6a9cbf01, float:9.474721E25)
            long r13 = android.os.SystemClock.uptimeMillis()
            r15 = 48
            int r16 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            int r12 = r16 + r12
            int r13 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r13 = r13 >> 16
            short r13 = (short) r13
            r14 = -654970902(0xffffffffd8f5efea, float:-2.16328617E15)
            int r16 = android.text.TextUtils.lastIndexOf(r9, r15)
            int r14 = r14 - r16
            java.lang.String r2 = AFKeystoreWrapper(r2, r10, r12, r13, r14)
            java.lang.String r2 = r2.intern()
            boolean r2 = valueOf((java.lang.String) r2)
            if (r2 == 0) goto L_0x009b
            r2 = 1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 == r4) goto L_0x00ab
            int r2 = android.text.TextUtils.indexOf(r9, r9, r1)
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r5, (int) r2)
        L_0x00a6:
            java.lang.String r2 = r2.intern()
            goto L_0x00be
        L_0x00ab:
            int r2 = getLevel
            int r2 = r2 + 11
            int r10 = r2 % 128
            AFLogger$LogLevel = r10
            int r2 = r2 % 2
            int r2 = android.text.TextUtils.indexOf(r9, r9, r1, r1)
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r6, (int) r2)
            goto L_0x00a6
        L_0x00be:
            r0.append(r2)
            int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r7)
            java.lang.String r10 = "秠ᔅ禁鼇䥯巓?䘢倿ꅰ瞃軸⫯좺ⅹ듇҃ሀ?娕?⑈M"
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r10, (int) r2)
            java.lang.String r2 = r2.intern()
            boolean r2 = valueOf((java.lang.String) r2)
            if (r2 == 0) goto L_0x00fb
            int r2 = getLevel
            int r2 = r2 + 27
            int r3 = r2 % 128
            AFLogger$LogLevel = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x00ee
            int r2 = android.view.KeyEvent.normalizeMetaState(r4)
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r6, (int) r2)
            java.lang.String r2 = r2.intern()
            goto L_0x0112
        L_0x00ee:
            int r2 = android.view.KeyEvent.normalizeMetaState(r1)
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r6, (int) r2)
            java.lang.String r2 = r2.intern()
            goto L_0x0112
        L_0x00fb:
            int r2 = android.widget.ExpandableListView.getPackedPositionChild(r7)
            int r3 = r3 - r2
            java.lang.String r2 = AFKeystoreWrapper((java.lang.String) r5, (int) r3)
            java.lang.String r2 = r2.intern()
            int r3 = AFLogger$LogLevel
            int r3 = r3 + 71
            int r4 = r3 % 128
            getLevel = r4
            int r3 = r3 % 2
        L_0x0112:
            r0.append(r2)
            int r2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r2 = r2 >> 24
            int r2 = -47 - r2
            int r3 = android.text.TextUtils.lastIndexOf(r9, r15, r1)
            int r3 = 79 - r3
            byte r3 = (byte) r3
            r4 = 1788657410(0x6a9cbf02, float:9.474722E25)
            r7 = 0
            float r8 = android.graphics.PointF.length(r7, r7)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            int r7 = r7 + r4
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r8 = android.graphics.Color.rgb(r1, r1, r1)
            int r4 = r4 - r8
            short r4 = (short) r4
            r8 = -671748094(0xffffffffd7f5f002, float:-5.40822349E14)
            int r9 = android.graphics.Color.rgb(r1, r1, r1)
            int r8 = r8 - r9
            java.lang.String r2 = AFKeystoreWrapper(r2, r3, r7, r4, r8)
            java.lang.String r2 = r2.intern()
            boolean r2 = valueOf((java.lang.String) r2)
            if (r2 == 0) goto L_0x0150
            r2 = 53
            goto L_0x0152
        L_0x0150:
            r2 = 68
        L_0x0152:
            if (r2 == r11) goto L_0x0161
            int r1 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
            java.lang.String r1 = AFKeystoreWrapper((java.lang.String) r6, (int) r1)
        L_0x015c:
            java.lang.String r1 = r1.intern()
            goto L_0x016c
        L_0x0161:
            int r1 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r1 = r1 >> 16
            java.lang.String r1 = AFKeystoreWrapper((java.lang.String) r5, (int) r1)
            goto L_0x015c
        L_0x016c:
            r0.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.valueOf(java.lang.StringBuilder):void");
    }

    private static String values(String str) {
        String str2;
        int i = getLevel + 103;
        AFLogger$LogLevel = i % 128;
        boolean z = false;
        if (i % 2 != 0) {
            str2 = C0474ag.AFKeystoreWrapper(C0474ag.AFInAppEventParameterName(str));
        } else {
            str2 = C0474ag.AFKeystoreWrapper(C0474ag.AFInAppEventParameterName(str));
            int i2 = 19 / 0;
        }
        int i3 = AFLogger$LogLevel + 3;
        getLevel = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return str2;
        }
        Object obj = null;
        super.hashCode();
        return str2;
    }

    private static String AFKeystoreWrapper(String str) {
        int i = AFLogger$LogLevel + 43;
        getLevel = i % 128;
        int i2 = i % 2;
        if (!str.contains(AFKeystoreWrapper("均刄坩玨ס", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern())) {
            int i3 = getLevel + 37;
            int i4 = i3 % 128;
            AFLogger$LogLevel = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 75;
            getLevel = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        String[] split = str.split(AFKeystoreWrapper(-46 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), (byte) (Color.argb(0, 0, 0, 0) - 88), ImageFormat.getBitsPerPixel(0) + 1788657406, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) - 654970863).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i8 = length - 1;
        sb.append(split[i8]);
        sb.append(AFKeystoreWrapper("均刄坩玨ס", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i9 = 1;
        while (true) {
            if (i9 < i8) {
                sb.append(split[i9]);
                sb.append(AFKeystoreWrapper("均刄坩玨ס", TextUtils.indexOf("", '0', 0, 0) + 1).intern());
                i9++;
            } else {
                sb.append(split[0]);
                return sb.toString();
            }
        }
    }

    private static String values(Context context) {
        int i = AFLogger$LogLevel + 25;
        getLevel = i % 128;
        int i2 = i % 2;
        if ((System.getProperties().containsKey(AFKeystoreWrapper((ViewConfiguration.getMinimumFlingVelocity() >> 16) + -47, (byte) (38 - View.combineMeasuredStates(0, 0)), 1788657418 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), -654970860 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1))).intern()) ? 6 : 'Q') == 'Q') {
            return null;
        }
        int i3 = AFLogger$LogLevel + 13;
        getLevel = i3 % 128;
        int i4 = i3 % 2;
        try {
            Matcher matcher = Pattern.compile(AFKeystoreWrapper("鵴ꕴ鵚⼲尸䣏່釐뒷ᅂ折夊츾碑", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).matcher(context.getCacheDir().getPath().replace(AFKeystoreWrapper((ViewConfiguration.getScrollBarSize() >> 8) - 47, (byte) (TextUtils.getCapsMode("", 0, 0) - 89), Color.red(0) + 1788657360, (short) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) - 654970847).intern(), ""));
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        } catch (Exception e) {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String intern = AFKeystoreWrapper("奱倹夲?撾ﮙ炪?㌀੔趍觺क़␑圱瀠￟", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(AFKeystoreWrapper(((Process.getThreadPriority(0) + 20) >> 6) - 47, (byte) (Color.blue(0) + 42), 1788657382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0) - 654970841).intern());
            sb.append(e);
            AFInAppEventType2.AFInAppEventParameterName(intern, sb.toString());
            return null;
        }
    }

    private static String AFInAppEventType(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = AFLogger$LogLevel + 99;
        getLevel = i % 128;
        if (!(i % 2 == 0)) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        }
        String str = packageManager.getPackageInfo(packageName, 0).packageName;
        int i2 = AFLogger$LogLevel + 105;
        int i3 = i2 % 128;
        getLevel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        AFLogger$LogLevel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static String AFKeystoreWrapper(Context context, StringBuilder sb) {
        float complexToFloat;
        float f;
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFKeystoreWrapper2 = AFKeystoreWrapper(packageName);
        sb.append(AFKeystoreWrapper("臏䓗臾႖", ViewConfiguration.getScrollBarSize() >> 8).intern());
        sb2.append(AFKeystoreWrapper2);
        if (values(context) != null) {
            sb.append(AFKeystoreWrapper("臏䓗臾႖", AndroidCharacter.getMirror('0') - '0').intern());
            sb2.append(packageName);
        } else {
            sb.append(AFKeystoreWrapper("嗞磸嗮륣", (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1).intern());
            sb2.append(packageName);
        }
        String AFInAppEventType2 = AFInAppEventType(context);
        if (AFInAppEventType2 == null) {
            int i = getLevel + 89;
            AFLogger$LogLevel = i % 128;
            if (!(i % 2 != 0)) {
                complexToFloat = TypedValue.complexToFloat(1);
                f = 2.0f;
            } else {
                complexToFloat = TypedValue.complexToFloat(0);
                f = 0.0f;
            }
            sb.append(AFKeystoreWrapper("嗞磸嗮륣", (complexToFloat > f ? 1 : (complexToFloat == f ? 0 : -1))).intern());
            sb2.append(packageName);
            int i2 = getLevel + 85;
            AFLogger$LogLevel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            sb.append(AFKeystoreWrapper("臏䓗臾႖", Gravity.getAbsoluteGravity(0, 0)).intern());
            sb2.append(AFInAppEventType2);
            int i4 = AFLogger$LogLevel + 21;
            getLevel = i4 % 128;
            int i5 = i4 % 2;
        }
        sb2.append(Boolean.TRUE.toString());
        return sb2.toString();
    }

    /* renamed from: com.appsflyer.internal.d$d */
    public static class C0574d extends HashMap<String, Object> {
        private static int[] AFKeystoreWrapper = {-1041640720, -580952221, -682261191, 1975752198, 1596100974, 33660823, -2012054640, 786855284, -687188837, -557632087, -1752968691, -601168586, 1741490382, -853106437, 593608985, 2118353676, 665220696, -441603600};
        private static boolean AFLogger$LogLevel = true;
        private static int AFVersionDeclaration = 0;
        private static boolean AppsFlyer2dXConversionCallback = true;
        private static int getLevel = 1;
        private static char[] valueOf = {385, 401, 384, 397, 387, 394, 388, 389, 392, 395, 319, 390, 403, 408, 406, 391, 407, 386, 399, 398, 345, 402, 363, 404, 355, 332, 333, 329, 335, 340, 339, 344, 336, 337, 343, 396, 341, 325, 400};
        private static int values = 287;
        private final Map<String, Object> AFInAppEventParameterName;
        private final Context AFInAppEventType;

        public C0574d(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFInAppEventType = context;
            put(AFKeystoreWrapper(), valueOf());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Integer} */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
            if (r7 == null) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            if ((r7 == null ? (char) 11 : 23) != 11) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
            r7 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
            r2.append(java.lang.Integer.toHexString(r7.intValue()));
            r4 = r4 + 1;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.StringBuilder AFKeystoreWrapper(java.lang.String... r11) throws java.lang.Exception {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
            L_0x0007:
                r3 = 3
                if (r2 >= r3) goto L_0x0024
                r3 = r11[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 1
                int r3 = getLevel
                int r3 = r3 + 91
                int r4 = r3 % 128
                AFVersionDeclaration = r4
                int r3 = r3 % 2
                goto L_0x0007
            L_0x0024:
                java.util.Collections.sort(r0)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r4 = 0
            L_0x0037:
                if (r4 >= r0) goto L_0x009b
                int r5 = getLevel
                int r5 = r5 + 67
                int r6 = r5 % 128
                AFVersionDeclaration = r6
                int r5 = r5 % 2
                r5 = 0
                r7 = r5
                r6 = 0
            L_0x0046:
                if (r6 >= r3) goto L_0x004a
                r8 = 1
                goto L_0x004b
            L_0x004a:
                r8 = 0
            L_0x004b:
                if (r8 == 0) goto L_0x008d
                int r8 = AFVersionDeclaration
                int r8 = r8 + 29
                int r9 = r8 % 128
                getLevel = r9
                int r8 = r8 % 2
                r9 = 24
                if (r8 != 0) goto L_0x005e
                r8 = 79
                goto L_0x0060
            L_0x005e:
                r8 = 24
            L_0x0060:
                if (r8 == r9) goto L_0x006e
                r8 = r11[r6]
                char r8 = r8.charAt(r4)
                int r9 = r5.length     // Catch:{ all -> 0x006c }
                if (r7 != 0) goto L_0x007f
                goto L_0x0085
            L_0x006c:
                r11 = move-exception
                throw r11
            L_0x006e:
                r8 = r11[r6]
                char r8 = r8.charAt(r4)
                r9 = 11
                if (r7 != 0) goto L_0x007b
                r10 = 11
                goto L_0x007d
            L_0x007b:
                r10 = 23
            L_0x007d:
                if (r10 == r9) goto L_0x0085
            L_0x007f:
                int r7 = r7.intValue()
                r7 = r7 ^ r8
                goto L_0x0086
            L_0x0085:
                r7 = r8
            L_0x0086:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                int r6 = r6 + 1
                goto L_0x0046
            L_0x008d:
                int r5 = r7.intValue()
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r2.append(r5)
                int r4 = r4 + 1
                goto L_0x0037
            L_0x009b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.C0574d.AFKeystoreWrapper(java.lang.String[]):java.lang.StringBuilder");
        }

        private String AFKeystoreWrapper() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.AFInAppEventParameterName.get(AFKeystoreWrapper(new int[]{-1899588981, -1318960983, -1691895223, -558378366, 1030854471, 1371389815}, Process.getGidForName("") + 13).intern()).toString();
                String obj2 = this.AFInAppEventParameterName.get(values((String) null, (int[]) null, "", 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))).intern()).toString();
                if ((obj2 == null ? (char) 31 : 8) != 8) {
                    obj2 = AFKeystoreWrapper(new int[]{-2011555701, -332013502, -1705604504, 1213686013}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
                int length = AFKeystoreWrapper2.length();
                if (length > 4) {
                    int i = AFVersionDeclaration + 49;
                    getLevel = i % 128;
                    int i2 = i % 2;
                    AFKeystoreWrapper2.delete(4, length);
                } else {
                    while (true) {
                        if ((length < 4 ? '!' : 31) != '!') {
                            break;
                        }
                        length++;
                        AFKeystoreWrapper2.append('1');
                        int i3 = getLevel + 57;
                        AFVersionDeclaration = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                AFKeystoreWrapper2.insert(0, values((String) null, (int[]) null, "", 127 - (Process.myTid() >> 22)).intern());
                return AFKeystoreWrapper2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(values((String) null, (int[]) null, "", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127).intern());
                sb2.append(e);
                AFLogger.AFKeystoreWrapper(sb2.toString());
                return AFKeystoreWrapper(new int[]{1823803466, 2057373644, 1748011517, 210350023}, 7 - (Process.myTid() >> 22)).intern();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x036c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0374 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String valueOf() {
            /*
                r24 = this;
                r1 = r24
                java.lang.String r2 = ""
                r3 = 11
                r4 = 6
                r5 = 4
                r7 = 22
                r8 = 5
                r9 = 3
                r10 = 48
                r13 = 16
                r14 = 1
                r15 = 2
                r6 = 0
                r11 = 0
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.AFInAppEventParameterName     // Catch:{ Exception -> 0x00cc }
                int[] r12 = new int[r4]     // Catch:{ Exception -> 0x00cc }
                r19 = -1899588981(0xffffffff8ec6928b, float:-4.8951884E-30)
                r12[r6] = r19     // Catch:{ Exception -> 0x00cc }
                r19 = -1318960983(0xffffffffb16240a9, float:-3.2924083E-9)
                r12[r14] = r19     // Catch:{ Exception -> 0x00cc }
                r19 = -1691895223(0xffffffff9b27ba49, float:-1.3874108E-22)
                r12[r15] = r19     // Catch:{ Exception -> 0x00cc }
                r19 = -558378366(0xffffffffdeb7d282, float:-6.6228962E18)
                r12[r9] = r19     // Catch:{ Exception -> 0x00cc }
                r19 = 1030854471(0x3d719747, float:0.05898216)
                r12[r5] = r19     // Catch:{ Exception -> 0x00cc }
                r19 = 1371389815(0x51bdbf77, float:1.01870133E11)
                r12[r8] = r19     // Catch:{ Exception -> 0x00cc }
                int r19 = android.text.TextUtils.lastIndexOf(r2, r10)     // Catch:{ Exception -> 0x00cc }
                int r4 = 11 - r19
                java.lang.String r4 = AFKeystoreWrapper(r12, r4)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x00cc }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00cc }
                java.util.Map<java.lang.String, java.lang.Object> r4 = r1.AFInAppEventParameterName     // Catch:{ Exception -> 0x00cc }
                java.lang.String r12 = ""
                int r19 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ Exception -> 0x00cc }
                int r19 = r19 >> 16
                int r3 = 127 - r19
                java.lang.String r3 = values(r11, r11, r12, r3)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r3 = r3.intern()     // Catch:{ Exception -> 0x00cc }
                java.lang.Object r3 = r4.get(r3)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00cc }
                int[] r4 = new int[r5]     // Catch:{ Exception -> 0x00cc }
                r12 = 2132071032(0x7f14d278, float:1.9781856E38)
                r4[r6] = r12     // Catch:{ Exception -> 0x00cc }
                r12 = -601586316(0xffffffffdc248574, float:-1.85234518E17)
                r4[r14] = r12     // Catch:{ Exception -> 0x00cc }
                r12 = 322391274(0x13374cea, float:2.3135769E-27)
                r4[r15] = r12     // Catch:{ Exception -> 0x00cc }
                r12 = 1913071927(0x72072937, float:2.6771393E30)
                r4[r9] = r12     // Catch:{ Exception -> 0x00cc }
                int r12 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ Exception -> 0x00cc }
                int r12 = r12 >> r13
                int r12 = r12 + r8
                java.lang.String r4 = AFKeystoreWrapper(r4, r12)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x00cc }
                java.lang.String r12 = ""
                int r19 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00cc }
                int r19 = r19 >> 22
                int r8 = r19 + 127
                java.lang.String r8 = values(r11, r11, r12, r8)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x00cc }
                java.lang.String r4 = r4.replaceAll(r8, r2)     // Catch:{ Exception -> 0x00cc }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cc }
                r8.<init>()     // Catch:{ Exception -> 0x00cc }
                r8.append(r0)     // Catch:{ Exception -> 0x00cc }
                r8.append(r3)     // Catch:{ Exception -> 0x00cc }
                r8.append(r4)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00cc }
                java.lang.String r0 = com.appsflyer.internal.C0474ag.AFInAppEventParameterName((java.lang.String) r0)     // Catch:{ Exception -> 0x00cc }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cc }
                r3.<init>()     // Catch:{ Exception -> 0x00cc }
                r3.append(r2)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r0 = r0.substring(r6, r13)     // Catch:{ Exception -> 0x00cc }
                r3.append(r0)     // Catch:{ Exception -> 0x00cc }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00cc }
                goto L_0x0115
            L_0x00cc:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int[] r4 = new int[r7]
                r4 = {-1949264818, -580764174, 2116105142, -1956685057, 295240503, -746952577, -1167971128, -471731909, -1987558749, 1301340063, -1261330329, 477539634, 511241764, -1429573061, -1414121878, -90998272, -766132867, -1213863867, -1995737546, -681845067, -1483690074, 247335825} // fill-array
                r17 = 0
                int r8 = android.widget.ExpandableListView.getPackedPositionChild(r17)
                r12 = 43
                int r8 = 43 - r8
                java.lang.String r4 = AFKeystoreWrapper(r4, r8)
                java.lang.String r4 = r4.intern()
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                int r3 = android.text.TextUtils.indexOf(r2, r10, r6)
                int r3 = r3 + 128
                java.lang.String r4 = "£¡¢¡ "
                java.lang.String r3 = values(r11, r11, r4, r3)
                java.lang.String r3 = r3.intern()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
            L_0x0115:
                r3 = r0
                r4 = 13
                android.content.Context r0 = r1.AFInAppEventType     // Catch:{ Exception -> 0x0318 }
                android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0318 }
                r12 = 20
                int[] r12 = new int[r12]     // Catch:{ Exception -> 0x0318 }
                r19 = 2059820036(0x7ac65c04, float:5.1497054E35)
                r12[r6] = r19     // Catch:{ Exception -> 0x0318 }
                r19 = 1390753898(0x52e5386a, float:4.92246991E11)
                r12[r14] = r19     // Catch:{ Exception -> 0x0318 }
                r19 = -599243215(0xffffffffdc484631, float:-2.25488686E17)
                r12[r15] = r19     // Catch:{ Exception -> 0x0318 }
                r19 = 125346245(0x778a1c5, float:1.8704986E-34)
                r12[r9] = r19     // Catch:{ Exception -> 0x0318 }
                r19 = 1718122237(0x666876fd, float:2.74446E23)
                r12[r5] = r19     // Catch:{ Exception -> 0x0318 }
                r5 = -465653955(0xffffffffe43eaf3d, float:-1.4070034E22)
                r19 = 5
                r12[r19] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = -1904075570(0xffffffff8e821cce, float:-3.2075212E-30)
                r19 = 6
                r12[r19] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = 7
                r19 = -807816471(0xffffffffcfd9b2e9, float:-7.3047619E9)
                r12[r5] = r19     // Catch:{ Exception -> 0x0318 }
                r5 = -1964179853(0xffffffff8aecfe73, float:-2.2821687E-32)
                r19 = 8
                r12[r19] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = 9
                r20 = 620430317(0x24fb03ed, float:1.0886055E-16)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = 10
                r20 = 381720347(0x16c0971b, float:3.1114634E-25)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = 1115013456(0x4275c150, float:61.43878)
                r20 = 11
                r12[r20] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = 12
                r20 = 1290512775(0x4ceba987, float:1.23554872E8)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = -1514598378(0xffffffffa5b91016, float:-3.2103285E-16)
                r12[r4] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = 14
                r20 = -724876653(0xffffffffd4cb4293, float:-6.9839623E12)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = 15
                r20 = -1940554289(0xffffffff8c557dcf, float:-1.6446782E-31)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = -2077541635(0xffffffff842b3afd, float:-2.012804E-36)
                r12[r13] = r5     // Catch:{ Exception -> 0x0318 }
                r5 = 17
                r20 = 1490938601(0x58ddeae9, float:1.95200801E15)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = 18
                r20 = 215740391(0xcdbefe7, float:3.3886679E-31)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                r5 = 19
                r20 = -2037742076(0xffffffff868a8604, float:-5.210675E-35)
                r12[r5] = r20     // Catch:{ Exception -> 0x0318 }
                int r5 = android.text.TextUtils.lastIndexOf(r2, r10, r6)     // Catch:{ Exception -> 0x0318 }
                int r5 = 36 - r5
                java.lang.String r5 = AFKeystoreWrapper(r12, r5)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0318 }
                r8.<init>(r5)     // Catch:{ Exception -> 0x0318 }
                android.content.Intent r0 = r0.registerReceiver(r11, r8)     // Catch:{ Exception -> 0x0318 }
                if (r0 == 0) goto L_0x01b6
                r5 = 1
                goto L_0x01b7
            L_0x01b6:
                r5 = 0
            L_0x01b7:
                r8 = -2700(0xfffffffffffff574, float:NaN)
                if (r5 == 0) goto L_0x01f3
                int r5 = AFVersionDeclaration
                int r5 = r5 + 69
                int r12 = r5 % 128
                getLevel = r12
                int r5 = r5 % r15
                java.lang.String r12 = "¤"
                if (r5 != 0) goto L_0x01e0
                r5 = 61
                int r8 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ Exception -> 0x0318 }
                int r8 = r8 >> 71
                int r5 = r5 / r8
                java.lang.String r5 = values(r11, r11, r12, r5)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0318 }
                r8 = 30340(0x7684, float:4.2515E-41)
                int r8 = r0.getIntExtra(r5, r8)     // Catch:{ Exception -> 0x0318 }
                goto L_0x01f3
            L_0x01e0:
                int r5 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ Exception -> 0x0318 }
                int r5 = r5 >> r13
                int r5 = 127 - r5
                java.lang.String r5 = values(r11, r11, r12, r5)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0318 }
                int r8 = r0.getIntExtra(r5, r8)     // Catch:{ Exception -> 0x0318 }
            L_0x01f3:
                android.content.Context r0 = r1.AFInAppEventType     // Catch:{ Exception -> 0x0318 }
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ Exception -> 0x0318 }
                if (r0 == 0) goto L_0x0256
                int r5 = AFVersionDeclaration
                int r5 = r5 + 51
                int r12 = r5 % 128
                getLevel = r12
                int r5 = r5 % r15
                r12 = 84
                if (r5 != 0) goto L_0x020d
                r5 = 47
                goto L_0x020f
            L_0x020d:
                r5 = 84
            L_0x020f:
                if (r5 == r12) goto L_0x022e
                java.lang.String r5 = "¥£"
                r12 = 9457(0x24f1, float:1.3252E-41)
                long r20 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ Exception -> 0x0318 }
                r22 = 1
                int r16 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                int r12 = r12 / r16
                java.lang.String r5 = values(r11, r11, r5, r12)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0318 }
                boolean r0 = r0.contains(r5)     // Catch:{ Exception -> 0x0318 }
                if (r0 == 0) goto L_0x0256
                goto L_0x0254
            L_0x022e:
                java.lang.String r5 = "¥£"
                long r20 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ Exception -> 0x0318 }
                r17 = 0
                int r12 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
                int r12 = 128 - r12
                java.lang.String r5 = values(r11, r11, r5, r12)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0318 }
                boolean r0 = r0.contains(r5)     // Catch:{ Exception -> 0x0318 }
                if (r0 == 0) goto L_0x024d
                r5 = 43
                r12 = 43
                goto L_0x0251
            L_0x024d:
                r12 = 64
                r5 = 43
            L_0x0251:
                if (r12 == r5) goto L_0x0254
                goto L_0x0256
            L_0x0254:
                r0 = 1
                goto L_0x0257
            L_0x0256:
                r0 = 0
            L_0x0257:
                android.content.Context r5 = r1.AFInAppEventType     // Catch:{ Exception -> 0x0318 }
                java.lang.String r12 = ""
                long r20 = android.os.Process.getElapsedCpuTime()     // Catch:{ Exception -> 0x0318 }
                r16 = 0
                int r4 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
                int r4 = 128 - r4
                java.lang.String r4 = values(r11, r11, r12, r4)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x0318 }
                java.lang.Object r4 = r5.getSystemService(r4)     // Catch:{ Exception -> 0x0318 }
                android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4     // Catch:{ Exception -> 0x0318 }
                r5 = -1
                java.util.List r4 = r4.getSensorList(r5)     // Catch:{ Exception -> 0x0318 }
                int r4 = r4.size()     // Catch:{ Exception -> 0x0318 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0318 }
                r5.<init>()     // Catch:{ Exception -> 0x0318 }
                int[] r12 = new int[r15]     // Catch:{ Exception -> 0x0318 }
                r16 = 1526226703(0x5af85f0f, float:3.49551561E16)
                r12[r6] = r16     // Catch:{ Exception -> 0x0318 }
                r16 = -1938860710(0xffffffff8c6f555a, float:-1.8437575E-31)
                r12[r14] = r16     // Catch:{ Exception -> 0x0318 }
                r16 = 0
                int r7 = android.widget.ExpandableListView.getPackedPositionChild(r16)     // Catch:{ Exception -> 0x0318 }
                int r7 = -r7
                java.lang.String r7 = AFKeystoreWrapper(r12, r7)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x0318 }
                r5.append(r7)     // Catch:{ Exception -> 0x0318 }
                r5.append(r8)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r7 = "¦"
                int r8 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch:{ Exception -> 0x0318 }
                int r8 = r8 >> r13
                int r8 = r8 + 127
                java.lang.String r7 = values(r11, r11, r7, r8)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x0318 }
                r5.append(r7)     // Catch:{ Exception -> 0x0318 }
                r5.append(r0)     // Catch:{ Exception -> 0x0318 }
                int[] r0 = new int[r15]     // Catch:{ Exception -> 0x0318 }
                r7 = -1464259222(0xffffffffa8b92d6a, float:-2.0558821E-14)
                r0[r6] = r7     // Catch:{ Exception -> 0x0318 }
                r7 = -1415623062(0xffffffffab9f4e6a, float:-1.1319394E-12)
                r0[r14] = r7     // Catch:{ Exception -> 0x0318 }
                int r7 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ Exception -> 0x0318 }
                int r7 = r7 >> 8
                int r7 = 2 - r7
                java.lang.String r0 = AFKeystoreWrapper(r0, r7)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x0318 }
                r5.append(r0)     // Catch:{ Exception -> 0x0318 }
                r5.append(r4)     // Catch:{ Exception -> 0x0318 }
                int[] r0 = new int[r15]     // Catch:{ Exception -> 0x0318 }
                r4 = 773775018(0x2e1edeaa, float:3.6122806E-11)
                r0[r6] = r4     // Catch:{ Exception -> 0x0318 }
                r4 = 123656625(0x75ed9b1, float:1.6765397E-34)
                r0[r14] = r4     // Catch:{ Exception -> 0x0318 }
                int r2 = android.text.TextUtils.indexOf(r2, r10, r6, r6)     // Catch:{ Exception -> 0x0318 }
                int r2 = r2 + r9
                java.lang.String r0 = AFKeystoreWrapper(r0, r2)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x0318 }
                r5.append(r0)     // Catch:{ Exception -> 0x0318 }
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.AFInAppEventParameterName     // Catch:{ Exception -> 0x0318 }
                int r0 = r0.size()     // Catch:{ Exception -> 0x0318 }
                r5.append(r0)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0318 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0318 }
                r2.<init>()     // Catch:{ Exception -> 0x0318 }
                r2.append(r3)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = com.appsflyer.internal.C0573d.C0574d.C0575a.AFInAppEventParameterName((java.lang.String) r0)     // Catch:{ Exception -> 0x0318 }
                r2.append(r0)     // Catch:{ Exception -> 0x0318 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0318 }
                goto L_0x0361
            L_0x0318:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r4 = 22
                int[] r4 = new int[r4]
                r4 = {-1949264818, -580764174, 2116105142, -1956685057, 295240503, -746952577, -1167971128, -471731909, -1987558749, 1301340063, -1261330329, 477539634, 511241764, -1429573061, -1414121878, -90998272, -766132867, -1213863867, -1995737546, -681845067, -1483690074, 247335825} // fill-array
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
                int r5 = 44 - r5
                java.lang.String r4 = AFKeystoreWrapper(r4, r5)
                java.lang.String r4 = r4.intern()
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                int r2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
                int r2 = r2 >> 24
                int r2 = 127 - r2
                java.lang.String r3 = "¤¢¢¡¡§§"
                java.lang.String r2 = values(r11, r11, r3, r2)
                java.lang.String r2 = r2.intern()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
            L_0x0361:
                int r2 = AFVersionDeclaration
                r3 = 5
                int r2 = r2 + r3
                int r3 = r2 % 128
                getLevel = r3
                int r2 = r2 % r15
                if (r2 != 0) goto L_0x0374
                r2 = 13
                int r4 = r2 / 0
                return r0
            L_0x0371:
                r0 = move-exception
                r2 = r0
                throw r2
            L_0x0374:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.C0574d.valueOf():java.lang.String");
        }

        /* renamed from: com.appsflyer.internal.d$d$a */
        static class C0575a {
            private static boolean AFInAppEventParameterName = true;
            private static char[] AFInAppEventType = {265};
            private static int AFKeystoreWrapper = 0;
            private static int init = 1;
            private static int valueOf = 217;
            private static boolean values = true;

            C0575a() {
            }

            static String AFInAppEventParameterName(String str) throws Exception {
                int i = AFKeystoreWrapper + 13;
                init = i % 128;
                int i2 = i % 2;
                String valueOf2 = valueOf(AFInAppEventParameterName(AFInAppEventType(str)));
                int i3 = init + 61;
                AFKeystoreWrapper = i3 % 128;
                int i4 = i3 % 2;
                return valueOf2;
            }

            private static byte[] AFInAppEventType(String str) throws Exception {
                int i = AFKeystoreWrapper + 83;
                init = i % 128;
                boolean z = i % 2 != 0;
                byte[] bytes = str.getBytes();
                if (!z) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
                return bytes;
            }

            private static byte[] AFInAppEventParameterName(byte[] bArr) throws Exception {
                int i = AFKeystoreWrapper + 101;
                init = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (true) {
                    if (!(i3 < bArr.length)) {
                        int i4 = AFKeystoreWrapper + 65;
                        init = i4 % 128;
                        int i5 = i4 % 2;
                        return bArr;
                    }
                    bArr[i3] = (byte) (bArr[i3] ^ ((i3 % 2) + 42));
                    i3++;
                }
            }

            private static String valueOf(byte[] bArr) throws Exception {
                String str;
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = AFKeystoreWrapper + 61;
                    init = i2 % 128;
                    if ((i2 % 2 == 0 ? '2' : 1) != '2') {
                        str = Integer.toHexString(bArr[i]);
                        if (str.length() != 1) {
                            sb.append(str);
                            i++;
                            int i3 = AFKeystoreWrapper + 95;
                            init = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    } else {
                        str = Integer.toHexString(bArr[i]);
                        if (str.length() != 0) {
                            sb.append(str);
                            i++;
                            int i32 = AFKeystoreWrapper + 95;
                            init = i32 % 128;
                            int i42 = i32 % 2;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AFInAppEventType((String) null, (int[]) null, "", 126 - TextUtils.indexOf("", '0', 0)).intern());
                    sb2.append(str);
                    str = sb2.toString();
                    int i5 = init + 39;
                    AFKeystoreWrapper = i5 % 128;
                    int i6 = i5 % 2;
                    sb.append(str);
                    i++;
                    int i322 = AFKeystoreWrapper + 95;
                    init = i322 % 128;
                    int i422 = i322 % 2;
                }
                return sb.toString();
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: char[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String AFInAppEventType(java.lang.String r5, int[] r6, java.lang.String r7, int r8) {
                /*
                    if (r7 == 0) goto L_0x0008
                    java.lang.String r0 = "ISO-8859-1"
                    byte[] r7 = r7.getBytes(r0)
                L_0x0008:
                    byte[] r7 = (byte[]) r7
                    if (r5 == 0) goto L_0x0010
                    char[] r5 = r5.toCharArray()
                L_0x0010:
                    char[] r5 = (char[]) r5
                    java.lang.Object r0 = com.appsflyer.internal.C0596dq.valueOf
                    monitor-enter(r0)
                    char[] r1 = AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    int r2 = valueOf     // Catch:{ all -> 0x00a9 }
                    boolean r3 = values     // Catch:{ all -> 0x00a9 }
                    r4 = 0
                    if (r3 == 0) goto L_0x004b
                    int r5 = r7.length     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventType = r5     // Catch:{ all -> 0x00a9 }
                    char[] r5 = new char[r5]     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
                L_0x0025:
                    int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    if (r6 >= r3) goto L_0x0044
                    int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 + -1
                    int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r4
                    byte r3 = r7[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 + r8
                    char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                    r5[r6] = r3     // Catch:{ all -> 0x00a9 }
                    int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r6 = r6 + 1
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r6     // Catch:{ all -> 0x00a9 }
                    goto L_0x0025
                L_0x0044:
                    java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                    r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                    return r6
                L_0x004b:
                    boolean r7 = AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    if (r7 == 0) goto L_0x007c
                    int r6 = r5.length     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventType = r6     // Catch:{ all -> 0x00a9 }
                    char[] r6 = new char[r6]     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
                L_0x0056:
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    if (r7 >= r3) goto L_0x0075
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 + -1
                    int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r4
                    char r3 = r5[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r8
                    char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                    r6[r7] = r3     // Catch:{ all -> 0x00a9 }
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r7 = r7 + 1
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r7     // Catch:{ all -> 0x00a9 }
                    goto L_0x0056
                L_0x0075:
                    java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                    r5.<init>(r6)     // Catch:{ all -> 0x00a9 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                    return r5
                L_0x007c:
                    int r5 = r6.length     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventType = r5     // Catch:{ all -> 0x00a9 }
                    char[] r5 = new char[r5]     // Catch:{ all -> 0x00a9 }
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
                L_0x0083:
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    if (r7 >= r3) goto L_0x00a2
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 + -1
                    int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r4
                    r3 = r6[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r8
                    char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                    r5[r7] = r3     // Catch:{ all -> 0x00a9 }
                    int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                    int r7 = r7 + 1
                    com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r7     // Catch:{ all -> 0x00a9 }
                    goto L_0x0083
                L_0x00a2:
                    java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                    r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                    return r6
                L_0x00a9:
                    r5 = move-exception
                    monitor-exit(r0)
                    goto L_0x00ad
                L_0x00ac:
                    throw r5
                L_0x00ad:
                    goto L_0x00ac
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.C0574d.C0575a.AFInAppEventType(java.lang.String, int[], java.lang.String, int):java.lang.String");
            }
        }

        private static String AFKeystoreWrapper(int[] iArr, int i) {
            String str;
            synchronized (C0592dm.valueOf) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[(iArr.length << 1)];
                int[] iArr2 = (int[]) AFKeystoreWrapper.clone();
                C0592dm.AFInAppEventParameterName = 0;
                while (C0592dm.AFInAppEventParameterName < iArr.length) {
                    cArr[0] = (char) (iArr[C0592dm.AFInAppEventParameterName] >> 16);
                    cArr[1] = (char) iArr[C0592dm.AFInAppEventParameterName];
                    cArr[2] = (char) (iArr[C0592dm.AFInAppEventParameterName + 1] >> 16);
                    cArr[3] = (char) iArr[C0592dm.AFInAppEventParameterName + 1];
                    C0592dm.values = (cArr[0] << 16) + cArr[1];
                    C0592dm.AFKeystoreWrapper = (cArr[2] << 16) + cArr[3];
                    C0592dm.values(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = C0592dm.values ^ iArr2[i2];
                        C0592dm.values = i3;
                        C0592dm.AFKeystoreWrapper = C0592dm.AFInAppEventParameterName(i3) ^ C0592dm.AFKeystoreWrapper;
                        int i4 = C0592dm.values;
                        C0592dm.values = C0592dm.AFKeystoreWrapper;
                        C0592dm.AFKeystoreWrapper = i4;
                    }
                    int i5 = C0592dm.values;
                    C0592dm.values = C0592dm.AFKeystoreWrapper;
                    C0592dm.AFKeystoreWrapper = i5;
                    C0592dm.AFKeystoreWrapper = i5 ^ iArr2[16];
                    C0592dm.values ^= iArr2[17];
                    int i6 = C0592dm.values;
                    int i7 = C0592dm.AFKeystoreWrapper;
                    cArr[0] = (char) (C0592dm.values >>> 16);
                    cArr[1] = (char) C0592dm.values;
                    cArr[2] = (char) (C0592dm.AFKeystoreWrapper >>> 16);
                    cArr[3] = (char) C0592dm.AFKeystoreWrapper;
                    C0592dm.values(iArr2);
                    cArr2[C0592dm.AFInAppEventParameterName << 1] = cArr[0];
                    cArr2[(C0592dm.AFInAppEventParameterName << 1) + 1] = cArr[1];
                    cArr2[(C0592dm.AFInAppEventParameterName << 1) + 2] = cArr[2];
                    cArr2[(C0592dm.AFInAppEventParameterName << 1) + 3] = cArr[3];
                    C0592dm.AFInAppEventParameterName += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String values(java.lang.String r5, int[] r6, java.lang.String r7, int r8) {
            /*
                if (r7 == 0) goto L_0x0008
                java.lang.String r0 = "ISO-8859-1"
                byte[] r7 = r7.getBytes(r0)
            L_0x0008:
                byte[] r7 = (byte[]) r7
                if (r5 == 0) goto L_0x0010
                char[] r5 = r5.toCharArray()
            L_0x0010:
                char[] r5 = (char[]) r5
                java.lang.Object r0 = com.appsflyer.internal.C0596dq.valueOf
                monitor-enter(r0)
                char[] r1 = valueOf     // Catch:{ all -> 0x00a9 }
                int r2 = values     // Catch:{ all -> 0x00a9 }
                boolean r3 = AFLogger$LogLevel     // Catch:{ all -> 0x00a9 }
                r4 = 0
                if (r3 == 0) goto L_0x004b
                int r5 = r7.length     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventType = r5     // Catch:{ all -> 0x00a9 }
                char[] r5 = new char[r5]     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
            L_0x0025:
                int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                if (r6 >= r3) goto L_0x0044
                int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                int r3 = r3 + -1
                int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r4
                byte r3 = r7[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 + r8
                char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                r5[r6] = r3     // Catch:{ all -> 0x00a9 }
                int r6 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r6 = r6 + 1
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r6     // Catch:{ all -> 0x00a9 }
                goto L_0x0025
            L_0x0044:
                java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                return r6
            L_0x004b:
                boolean r7 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00a9 }
                if (r7 == 0) goto L_0x007c
                int r6 = r5.length     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventType = r6     // Catch:{ all -> 0x00a9 }
                char[] r6 = new char[r6]     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
            L_0x0056:
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                if (r7 >= r3) goto L_0x0075
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                int r3 = r3 + -1
                int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r4
                char r3 = r5[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r8
                char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                r6[r7] = r3     // Catch:{ all -> 0x00a9 }
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r7 = r7 + 1
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r7     // Catch:{ all -> 0x00a9 }
                goto L_0x0056
            L_0x0075:
                java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                r5.<init>(r6)     // Catch:{ all -> 0x00a9 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                return r5
            L_0x007c:
                int r5 = r6.length     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventType = r5     // Catch:{ all -> 0x00a9 }
                char[] r5 = new char[r5]     // Catch:{ all -> 0x00a9 }
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r4     // Catch:{ all -> 0x00a9 }
            L_0x0083:
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                if (r7 >= r3) goto L_0x00a2
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = com.appsflyer.internal.C0596dq.AFInAppEventType     // Catch:{ all -> 0x00a9 }
                int r3 = r3 + -1
                int r4 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r4
                r3 = r6[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r8
                char r3 = r1[r3]     // Catch:{ all -> 0x00a9 }
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch:{ all -> 0x00a9 }
                r5[r7] = r3     // Catch:{ all -> 0x00a9 }
                int r7 = com.appsflyer.internal.C0596dq.AFInAppEventParameterName     // Catch:{ all -> 0x00a9 }
                int r7 = r7 + 1
                com.appsflyer.internal.C0596dq.AFInAppEventParameterName = r7     // Catch:{ all -> 0x00a9 }
                goto L_0x0083
            L_0x00a2:
                java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00a9 }
                r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                return r6
            L_0x00a9:
                r5 = move-exception
                monitor-exit(r0)
                goto L_0x00ad
            L_0x00ac:
                throw r5
            L_0x00ad:
                goto L_0x00ac
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.C0574d.values(java.lang.String, int[], java.lang.String, int):java.lang.String");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.lang.String r8, int r9) {
        /*
            if (r8 == 0) goto L_0x0006
            char[] r8 = r8.toCharArray()
        L_0x0006:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.appsflyer.internal.C0591dl.AFInAppEventParameterName
            monitor-enter(r0)
            long r1 = AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            char[] r8 = com.appsflyer.internal.C0591dl.AFInAppEventType(r1, r8, r9)     // Catch:{ all -> 0x0047 }
            r9 = 4
            com.appsflyer.internal.C0591dl.AFKeystoreWrapper = r9     // Catch:{ all -> 0x0047 }
        L_0x0014:
            int r1 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            int r2 = r8.length     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x003e
            int r1 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            int r1 = r1 - r9
            com.appsflyer.internal.C0591dl.values = r1     // Catch:{ all -> 0x0047 }
            int r1 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            int r2 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            char r2 = r8[r2]     // Catch:{ all -> 0x0047 }
            int r3 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            int r3 = r3 % r9
            char r3 = r8[r3]     // Catch:{ all -> 0x0047 }
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x0047 }
            int r4 = com.appsflyer.internal.C0591dl.values     // Catch:{ all -> 0x0047 }
            long r4 = (long) r4     // Catch:{ all -> 0x0047 }
            long r6 = AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch:{ all -> 0x0047 }
            char r2 = (char) r3     // Catch:{ all -> 0x0047 }
            r8[r1] = r2     // Catch:{ all -> 0x0047 }
            int r1 = com.appsflyer.internal.C0591dl.AFKeystoreWrapper     // Catch:{ all -> 0x0047 }
            int r1 = r1 + 1
            com.appsflyer.internal.C0591dl.AFKeystoreWrapper = r1     // Catch:{ all -> 0x0047 }
            goto L_0x0014
        L_0x003e:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0047 }
            int r2 = r8.length     // Catch:{ all -> 0x0047 }
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r1
        L_0x0047:
            r8 = move-exception
            monitor-exit(r0)
            goto L_0x004b
        L_0x004a:
            throw r8
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0573d.AFKeystoreWrapper(java.lang.String, int):java.lang.String");
    }

    private static String AFKeystoreWrapper(int i, byte b, int i2, short s, int i3) {
        String obj;
        synchronized (C0598du.getLevel) {
            StringBuilder sb = new StringBuilder();
            int i4 = AFInAppEventType;
            int i5 = i + i4;
            int i6 = 0;
            boolean z = i5 == -1;
            if (z) {
                byte[] bArr = valueOf;
                if (bArr != null) {
                    i5 = (byte) (bArr[AFInAppEventParameterName + i3] + i4);
                } else {
                    i5 = (short) (AppsFlyer2dXConversionCallback[AFInAppEventParameterName + i3] + i4);
                }
            }
            if (i5 > 0) {
                int i7 = ((i3 + i5) - 2) + AFInAppEventParameterName;
                if (z) {
                    i6 = 1;
                }
                C0598du.AFKeystoreWrapper = i7 + i6;
                C0598du.AFInAppEventParameterName = b;
                C0598du.valueOf = (char) (i2 + values);
                sb.append(C0598du.valueOf);
                C0598du.AFInAppEventType = C0598du.valueOf;
                C0598du.values = 1;
                while (C0598du.values < i5) {
                    byte[] bArr2 = valueOf;
                    if (bArr2 != null) {
                        int i8 = C0598du.AFKeystoreWrapper;
                        C0598du.AFKeystoreWrapper = i8 - 1;
                        C0598du.valueOf = (char) (C0598du.AFInAppEventType + (((byte) (bArr2[i8] + s)) ^ C0598du.AFInAppEventParameterName));
                    } else {
                        short[] sArr = AppsFlyer2dXConversionCallback;
                        int i9 = C0598du.AFKeystoreWrapper;
                        C0598du.AFKeystoreWrapper = i9 - 1;
                        C0598du.valueOf = (char) (C0598du.AFInAppEventType + (((short) (sArr[i9] + s)) ^ C0598du.AFInAppEventParameterName));
                    }
                    sb.append(C0598du.valueOf);
                    C0598du.AFInAppEventType = C0598du.valueOf;
                    C0598du.values++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
