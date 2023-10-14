package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appsflyer.internal.cc */
public final class C0546cc implements Runnable {
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    final ScheduledExecutorService AFInAppEventParameterName;
    private final Application AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final C0458ac AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger AppsFlyer2dXConversionCallback;

    C0546cc(C0458ac acVar, Application application, String str) {
        if (C0608k.values == null) {
            C0608k.values = new C0608k();
        }
        this.AFInAppEventParameterName = C0608k.values.AFKeystoreWrapper();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = acVar;
        this.AFInAppEventType = application;
        this.AFKeystoreWrapper = str;
        this.AFVersionDeclaration = 0;
    }

    private C0546cc(C0546cc ccVar) {
        if (C0608k.values == null) {
            C0608k.values = new C0608k();
        }
        this.AFInAppEventParameterName = C0608k.values.AFKeystoreWrapper();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = ccVar.AFLogger$LogLevel;
        this.AFInAppEventType = ccVar.AFInAppEventType;
        this.AFKeystoreWrapper = ccVar.AFKeystoreWrapper;
        this.AFVersionDeclaration = ccVar.AFVersionDeclaration + 1;
    }

    static void values(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.AFInAppEventParameterName(sb.toString());
        C0458ac.AFKeystoreWrapper.onConversionDataSuccess(map);
    }

    public static void AFInAppEventParameterName(String str) {
        if (C0458ac.AFKeystoreWrapper != null) {
            AFLogger.AFInAppEventParameterName("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            C0458ac.AFKeystoreWrapper.onConversionDataFail(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ae A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bd A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d2 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015f A[Catch:{ all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170 A[Catch:{ ce -> 0x0276, all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a7 A[Catch:{ ce -> 0x0276, all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "is_first_launch"
            java.lang.String r2 = "af_siteid"
            java.lang.String r3 = r1.AFKeystoreWrapper
            if (r3 == 0) goto L_0x02ec
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0012
            goto L_0x02ec
        L_0x0012:
            com.appsflyer.internal.ac r3 = r1.AFLogger$LogLevel
            boolean r3 = r3.isStopped()
            if (r3 == 0) goto L_0x0025
            java.lang.String r0 = "[GCD-E03] 'isStopTracking' enabled"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            java.lang.String r0 = "'isStopTracking' enabled"
            AFInAppEventParameterName(r0)
            return
        L_0x0025:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.AppsFlyer2dXConversionCallback
            r3.incrementAndGet()
            r3 = 0
            r4 = 10
            r6 = 2
            android.app.Application r7 = r1.AFInAppEventType     // Catch:{ all -> 0x02a9 }
            if (r7 != 0) goto L_0x0042
            java.lang.String r0 = "[GCD-E06] Context null"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = "Context null"
            AFInAppEventParameterName(r0)     // Catch:{ all -> 0x02a9 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            return
        L_0x0042:
            com.appsflyer.internal.ac r8 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x02a9 }
            java.lang.String r9 = r8.AFInAppEventParameterName((android.content.Context) r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = r8.AFInAppEventParameterName((android.content.Context) r7, (java.lang.String) r9)     // Catch:{ all -> 0x02a9 }
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L_0x0076
            java.util.List<java.lang.String> r11 = values     // Catch:{ all -> 0x02a9 }
            java.lang.String r12 = r7.toLowerCase()     // Catch:{ all -> 0x02a9 }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x02a9 }
            if (r11 != 0) goto L_0x0069
            java.lang.String r11 = "-"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = r11.concat(r7)     // Catch:{ all -> 0x02a9 }
            goto L_0x0077
        L_0x0069:
            java.lang.String r11 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x02a9 }
            r12[r10] = r7     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = java.lang.String.format(r11, r12)     // Catch:{ all -> 0x02a9 }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r7)     // Catch:{ all -> 0x02a9 }
        L_0x0076:
            r7 = r8
        L_0x0077:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a9 }
            r11.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.String r12 = valueOf     // Catch:{ all -> 0x02a9 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x02a9 }
            com.appsflyer.AppsFlyerLib r14 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ all -> 0x02a9 }
            java.lang.String r14 = r14.getHostPrefix()     // Catch:{ all -> 0x02a9 }
            r13[r10] = r14     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.ac r14 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()     // Catch:{ all -> 0x02a9 }
            java.lang.String r14 = r14.getHostName()     // Catch:{ all -> 0x02a9 }
            r13[r9] = r14     // Catch:{ all -> 0x02a9 }
            java.lang.String r12 = java.lang.String.format(r12, r13)     // Catch:{ all -> 0x02a9 }
            r11.append(r12)     // Catch:{ all -> 0x02a9 }
            android.app.Application r12 = r1.AFInAppEventType     // Catch:{ all -> 0x02a9 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x02a9 }
            r11.append(r12)     // Catch:{ all -> 0x02a9 }
            r11.append(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = "?devkey="
            r11.append(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x02a9 }
            r11.append(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = "&device_id="
            r11.append(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x02a9 }
            android.app.Application r12 = r1.AFInAppEventType     // Catch:{ all -> 0x02a9 }
            r7.<init>(r12)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = com.appsflyer.internal.C0473af.valueOf(r7)     // Catch:{ all -> 0x02a9 }
            r11.append(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.ak r11 = com.appsflyer.internal.C0484ak.AFInAppEventType()     // Catch:{ all -> 0x02a9 }
            r11.AFInAppEventType((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x02a9 }
            java.lang.String r8 = "[GCD-B01] URL: "
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.String r8 = r8.concat(r11)     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.C0482ai.AFKeystoreWrapper(r8)     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.ac r8 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.bg r8 = r8.values()     // Catch:{ all -> 0x02a9 }
            com.appsflyer.internal.cl r8 = r8.getLevel()     // Catch:{ all -> 0x02a9 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            r8.getLevel = r11     // Catch:{ all -> 0x02a9 }
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x02a9 }
            r11.<init>(r7)     // Catch:{ all -> 0x02a9 }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ all -> 0x02a9 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x02a9 }
            java.lang.String r3 = "GET"
            r11.setRequestMethod(r3)     // Catch:{ all -> 0x02a3 }
            r3 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r3 = "Connection"
            java.lang.String r12 = "close"
            r11.setRequestProperty(r3, r12)     // Catch:{ all -> 0x02a3 }
            r11.connect()     // Catch:{ all -> 0x02a3 }
            int r3 = r11.getResponseCode()     // Catch:{ all -> 0x02a3 }
            java.lang.String r12 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x02a3 }
            com.appsflyer.internal.ak r13 = com.appsflyer.internal.C0484ak.AFInAppEventType()     // Catch:{ all -> 0x02a3 }
            r13.values(r7, r3, r12)     // Catch:{ all -> 0x02a3 }
            r7 = 200(0xc8, float:2.8E-43)
            r13 = 404(0x194, float:5.66E-43)
            if (r3 == r7) goto L_0x0151
            if (r3 != r13) goto L_0x0123
            goto L_0x0151
        L_0x0123:
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x012b
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 < r0) goto L_0x013c
        L_0x012b:
            int r0 = r1.AFVersionDeclaration     // Catch:{ all -> 0x014d }
            if (r0 >= r6) goto L_0x013c
            com.appsflyer.internal.cc r0 = new com.appsflyer.internal.cc     // Catch:{ all -> 0x014d }
            r0.<init>(r1)     // Catch:{ all -> 0x014d }
            java.util.concurrent.ScheduledExecutorService r2 = r0.AFInAppEventParameterName     // Catch:{ all -> 0x014d }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x014d }
            com.appsflyer.internal.C0458ac.valueOf(r2, r0, r4, r3)     // Catch:{ all -> 0x014d }
            goto L_0x0149
        L_0x013c:
            java.lang.String r0 = "Error connection to server: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x014d }
            AFInAppEventParameterName(r0)     // Catch:{ all -> 0x014d }
        L_0x0149:
            r16 = r11
            goto L_0x0296
        L_0x014d:
            r0 = move-exception
            r3 = r11
            goto L_0x02aa
        L_0x0151:
            int r7 = r1.AFVersionDeclaration     // Catch:{ all -> 0x02a3 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a3 }
            long r4 = r8.getLevel     // Catch:{ all -> 0x02a3 }
            r16 = 0
            int r18 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0170
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.values     // Catch:{ all -> 0x02a3 }
            java.lang.String r5 = "net"
            r16 = r11
            long r10 = r8.getLevel     // Catch:{ all -> 0x02a1 }
            long r14 = r14 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x02a1 }
            r4.put(r5, r10)     // Catch:{ all -> 0x02a1 }
            goto L_0x0177
        L_0x0170:
            r16 = r11
            java.lang.String r4 = "Metrics: gcdStart ts is missing"
            com.appsflyer.AFLogger.values((java.lang.String) r4)     // Catch:{ all -> 0x02a1 }
        L_0x0177:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.values     // Catch:{ all -> 0x02a1 }
            java.lang.String r5 = "retries"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x02a1 }
            r4.put(r5, r7)     // Catch:{ all -> 0x02a1 }
            java.lang.String r4 = "gcd"
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values     // Catch:{ all -> 0x02a1 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x02a1 }
            r7.<init>(r5)     // Catch:{ all -> 0x02a1 }
            com.appsflyer.internal.bv r5 = r8.valueOf     // Catch:{ all -> 0x02a1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x02a1 }
            r5.AFInAppEventParameterName(r4, r7)     // Catch:{ all -> 0x02a1 }
            java.lang.String r4 = "Attribution data: "
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x02a1 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x02a1 }
            com.appsflyer.internal.C0482ai.AFKeystoreWrapper(r4)     // Catch:{ all -> 0x02a1 }
            int r4 = r12.length()     // Catch:{ all -> 0x02a1 }
            if (r4 <= 0) goto L_0x0296
            java.util.Map r4 = com.appsflyer.internal.C0551cg.values(r12)     // Catch:{ all -> 0x02a1 }
            java.lang.String r5 = "iscache"
            java.lang.Object r5 = r4.get(r5)     // Catch:{ all -> 0x02a1 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x02a1 }
            if (r3 != r13) goto L_0x01cd
            java.lang.String r3 = "error_reason"
            r4.remove(r3)     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = "status_code"
            r4.remove(r3)     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = "af_status"
            java.lang.String r7 = "Organic"
            r4.put(r3, r7)     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = "af_message"
            java.lang.String r7 = "organic install"
            r4.put(r3, r7)     // Catch:{ all -> 0x02a1 }
        L_0x01cd:
            if (r5 == 0) goto L_0x01e2
            boolean r3 = r5.booleanValue()     // Catch:{ all -> 0x02a1 }
            if (r3 != 0) goto L_0x01e2
            com.appsflyer.internal.ac r3 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x02a1 }
            android.app.Application r5 = r1.AFInAppEventType     // Catch:{ all -> 0x02a1 }
            java.lang.String r7 = "appsflyerConversionDataCacheExpiration"
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a1 }
            r3.AFInAppEventType((android.content.Context) r5, (java.lang.String) r7, (long) r10)     // Catch:{ all -> 0x02a1 }
        L_0x01e2:
            boolean r3 = r4.containsKey(r2)     // Catch:{ all -> 0x02a1 }
            java.lang.String r5 = "[Invite] Detected App-Invite via channel: "
            java.lang.String r7 = "af_channel"
            if (r3 == 0) goto L_0x0218
            boolean r3 = r4.containsKey(r7)     // Catch:{ all -> 0x02a1 }
            if (r3 == 0) goto L_0x0206
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r3.<init>(r5)     // Catch:{ all -> 0x02a1 }
            java.lang.Object r8 = r4.get(r7)     // Catch:{ all -> 0x02a1 }
            r3.append(r8)     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02a1 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3)     // Catch:{ all -> 0x02a1 }
            goto L_0x0218
        L_0x0206:
            java.lang.String r3 = "[CrossPromotion] App was installed via %s's Cross Promotion"
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ all -> 0x02a1 }
            java.lang.Object r10 = r4.get(r2)     // Catch:{ all -> 0x02a1 }
            r11 = 0
            r8[r11] = r10     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = java.lang.String.format(r3, r8)     // Catch:{ all -> 0x02a1 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3)     // Catch:{ all -> 0x02a1 }
        L_0x0218:
            boolean r2 = r4.containsKey(r2)     // Catch:{ all -> 0x02a1 }
            if (r2 == 0) goto L_0x0231
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x02a1 }
            java.lang.Object r3 = r4.get(r7)     // Catch:{ all -> 0x02a1 }
            r2.append(r3)     // Catch:{ all -> 0x02a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02a1 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r2)     // Catch:{ all -> 0x02a1 }
        L_0x0231:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02a1 }
            r4.put(r0, r2)     // Catch:{ all -> 0x02a1 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x02a1 }
            r2.<init>(r4)     // Catch:{ all -> 0x02a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02a1 }
            java.lang.String r3 = "attributionId"
            if (r2 == 0) goto L_0x0249
            android.app.Application r5 = r1.AFInAppEventType     // Catch:{ all -> 0x02a1 }
            com.appsflyer.internal.C0458ac.valueOf((android.content.Context) r5, (java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x02a1 }
            goto L_0x024e
        L_0x0249:
            android.app.Application r2 = r1.AFInAppEventType     // Catch:{ all -> 0x02a1 }
            com.appsflyer.internal.C0458ac.valueOf((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r12)     // Catch:{ all -> 0x02a1 }
        L_0x024e:
            com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.internal.C0458ac.AFKeystoreWrapper     // Catch:{ all -> 0x02a1 }
            if (r2 == 0) goto L_0x0296
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x02a1 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x02a1 }
            if (r2 > r9) goto L_0x0296
            android.app.Application r2 = r1.AFInAppEventType     // Catch:{ ce -> 0x0276 }
            java.util.Map r2 = com.appsflyer.internal.C0551cg.AFInAppEventParameterName(r2)     // Catch:{ ce -> 0x0276 }
            android.app.Application r3 = r1.AFInAppEventType     // Catch:{ ce -> 0x0276 }
            android.content.SharedPreferences r3 = com.appsflyer.internal.C0458ac.AFInAppEventType((android.content.Context) r3)     // Catch:{ ce -> 0x0276 }
            java.lang.String r5 = "sixtyDayConversionData"
            r7 = 0
            boolean r3 = r3.getBoolean(r5, r7)     // Catch:{ ce -> 0x0276 }
            if (r3 != 0) goto L_0x0274
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ ce -> 0x0276 }
            r2.put(r0, r3)     // Catch:{ ce -> 0x0276 }
        L_0x0274:
            r4 = r2
            goto L_0x027c
        L_0x0276:
            r0 = move-exception
            java.lang.String r2 = "Exception while trying to fetch attribution data. "
            com.appsflyer.AFLogger.valueOf(r2, r0)     // Catch:{ all -> 0x02a1 }
        L_0x027c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            java.lang.String r2 = "[GCD-A02] Calling onConversionDataSuccess with:\n"
            r0.<init>(r2)     // Catch:{ all -> 0x02a1 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x02a1 }
            r0.append(r2)     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02a1 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)     // Catch:{ all -> 0x02a1 }
            com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.internal.C0458ac.AFKeystoreWrapper     // Catch:{ all -> 0x02a1 }
            r0.onConversionDataSuccess(r4)     // Catch:{ all -> 0x02a1 }
        L_0x0296:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            if (r16 == 0) goto L_0x02d5
            r16.disconnect()
            goto L_0x02d5
        L_0x02a1:
            r0 = move-exception
            goto L_0x02a6
        L_0x02a3:
            r0 = move-exception
            r16 = r11
        L_0x02a6:
            r3 = r16
            goto L_0x02aa
        L_0x02a9:
            r0 = move-exception
        L_0x02aa:
            int r2 = r1.AFVersionDeclaration     // Catch:{ all -> 0x02e0 }
            if (r2 >= r6) goto L_0x02bd
            com.appsflyer.internal.cc r2 = new com.appsflyer.internal.cc     // Catch:{ all -> 0x02e0 }
            r2.<init>(r1)     // Catch:{ all -> 0x02e0 }
            java.util.concurrent.ScheduledExecutorService r4 = r2.AFInAppEventParameterName     // Catch:{ all -> 0x02e0 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02e0 }
            r6 = 10
            com.appsflyer.internal.C0458ac.valueOf(r4, r2, r6, r5)     // Catch:{ all -> 0x02e0 }
            goto L_0x02c4
        L_0x02bd:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02e0 }
            AFInAppEventParameterName(r2)     // Catch:{ all -> 0x02e0 }
        L_0x02c4:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02e0 }
            com.appsflyer.AFLogger.valueOf(r2, r0)     // Catch:{ all -> 0x02e0 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            if (r3 == 0) goto L_0x02d5
            r3.disconnect()
        L_0x02d5:
            java.util.concurrent.ScheduledExecutorService r0 = r1.AFInAppEventParameterName
            r0.shutdown()
            java.lang.String r0 = "[GCD-A03] Server retrieving attempt finished"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            return
        L_0x02e0:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback
            r2.decrementAndGet()
            if (r3 == 0) goto L_0x02eb
            r3.disconnect()
        L_0x02eb:
            throw r0
        L_0x02ec:
            java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            java.lang.String r0 = "AppsFlyer dev key is missing"
            AFInAppEventParameterName(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0546cc.run():void");
    }
}
