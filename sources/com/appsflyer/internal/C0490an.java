package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import kotlin.text.Typography;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.an */
public abstract class C0490an implements Runnable {
    protected static String AFInAppEventType = null;
    private static String AFKeystoreWrapper = "v2";
    private static int AFLogger$LogLevel = 0;
    private static long init = 0;
    private static char onAppOpenAttributionNative = '\u0000';
    private static int onAttributionFailureNative = 1;
    private static int onInstallConversionDataLoadedNative;
    public String AFInAppEventParameterName;
    public final Map<String, Object> AFVersionDeclaration = AFInAppEventParameterName();
    public final String AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
    private final Context getLevel;
    public final String valueOf;
    private final C0458ac values;

    static void AFKeystoreWrapper() {
        init = 5852232774877074978L;
        onAppOpenAttributionNative = 0;
        AFLogger$LogLevel = 0;
    }

    /* access modifiers changed from: protected */
    public abstract void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* access modifiers changed from: protected */
    public abstract void valueOf();

    /* access modifiers changed from: protected */
    public abstract void valueOf(String str);

    /* access modifiers changed from: protected */
    public abstract String values();

    static {
        AFKeystoreWrapper();
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(AFKeystoreWrapper);
        AFInAppEventType = sb.toString();
        int i = onAttributionFailureNative + 11;
        onInstallConversionDataLoadedNative = i % 128;
        if (!(i % 2 == 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public C0490an(C0458ac acVar, Context context, String str) {
        this.values = acVar;
        this.getLevel = context;
        this.valueOf = str;
    }

    public void run() {
        int i = onInstallConversionDataLoadedNative + 21;
        onAttributionFailureNative = i % 128;
        boolean z = i % 2 != 0;
        AFInAppEventType();
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventType() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r6.values()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "oneLinkUrl: "
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2)
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x006a }
            r2.<init>(r1)     // Catch:{ all -> 0x006a }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x006a }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "content-type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch:{ all -> 0x006a }
            r3 = 3000(0xbb8, float:4.204E-42)
            r2.setReadTimeout(r3)     // Catch:{ all -> 0x006a }
            r2.setConnectTimeout(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x006a }
            r2.setRequestMethod(r3)     // Catch:{ all -> 0x006a }
            r6.AFInAppEventParameterName(r2)     // Catch:{ all -> 0x006a }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x006a }
            java.lang.String r2 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName((java.net.HttpURLConnection) r2)     // Catch:{ all -> 0x006a }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0051
            int r3 = onInstallConversionDataLoadedNative
            int r3 = r3 + 41
            int r4 = r3 % 128
            onAttributionFailureNative = r4
            int r3 = r3 % 2
            java.lang.String r3 = "Status 200 ok"
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0093
        L_0x0051:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0068 }
            r0.append(r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = " content = "
            r0.append(r3)     // Catch:{ all -> 0x0068 }
            r0.append(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0068 }
            goto L_0x0093
        L_0x0068:
            r0 = move-exception
            goto L_0x006e
        L_0x006a:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L_0x006e:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.valueOf(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " stacktrace: "
            r3.append(r1)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0093:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 29
            if (r1 == 0) goto L_0x009e
            r1 = 83
            goto L_0x00a0
        L_0x009e:
            r1 = 29
        L_0x00a0:
            if (r1 == r3) goto L_0x00dd
            int r0 = onInstallConversionDataLoadedNative
            int r0 = r0 + 1
            int r1 = r0 % 128
            onAttributionFailureNative = r1
            int r0 = r0 % 2
            r1 = 31
            if (r0 != 0) goto L_0x00b3
            r0 = 31
            goto L_0x00b5
        L_0x00b3:
            r0 = 64
        L_0x00b5:
            java.lang.String r3 = "Connection call succeeded: "
            if (r0 == r1) goto L_0x00c8
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r3.concat(r0)
            com.appsflyer.AFLogger.values((java.lang.String) r0)
            r6.valueOf(r2)
            return
        L_0x00c8:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r3.concat(r0)
            com.appsflyer.AFLogger.values((java.lang.String) r0)
            r6.valueOf(r2)
            r0 = 11
            int r0 = r0 / 0
            return
        L_0x00db:
            r0 = move-exception
            throw r0
        L_0x00dd:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r0)
            r6.valueOf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0490an.AFInAppEventType():void");
    }

    /* renamed from: com.appsflyer.internal.an$c */
    public static class C0491c implements Runnable {
        private final C0557cm AFKeystoreWrapper;

        public C0491c() {
        }

        public C0491c(C0557cm cmVar) {
            this.AFKeystoreWrapper = cmVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r0v11, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x017c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.net.HttpURLConnection values() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = ""
                com.appsflyer.internal.cm r0 = r1.AFKeystoreWrapper
                java.lang.String r3 = r0.onDeepLinkingNative
                com.appsflyer.internal.cm r0 = r1.AFKeystoreWrapper
                java.util.Map r0 = r0.values()
                org.json.JSONObject r0 = com.appsflyer.internal.C0614n.AFInAppEventType(r0)
                java.lang.String r0 = r0.toString()
                com.appsflyer.internal.cm r4 = r1.AFKeystoreWrapper
                boolean r4 = r4.AFLogger$LogLevel()
                com.appsflyer.internal.cm r5 = r1.AFKeystoreWrapper
                boolean r5 = r5.AppsFlyer2dXConversionCallback()
                com.appsflyer.internal.cm r6 = r1.AFKeystoreWrapper
                boolean r6 = r6.getLevel()
                com.appsflyer.internal.cm r7 = r1.AFKeystoreWrapper
                boolean r7 = r7.AFInAppEventType()
                byte[] r8 = r0.getBytes()
                r9 = 0
                if (r4 == 0) goto L_0x0036
                return r9
            L_0x0036:
                r4 = 0
                r10 = 1
                java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x0160 }
                r11.<init>(r3)     // Catch:{ all -> 0x0160 }
                if (r6 == 0) goto L_0x0080
                com.appsflyer.internal.ak r12 = com.appsflyer.internal.C0484ak.AFInAppEventType()     // Catch:{ all -> 0x0160 }
                java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x0160 }
                r12.AFInAppEventType((java.lang.String) r13, (java.lang.String) r0)     // Catch:{ all -> 0x0160 }
                java.lang.String r12 = "UTF-8"
                byte[] r12 = r0.getBytes(r12)     // Catch:{ all -> 0x0160 }
                int r12 = r12.length     // Catch:{ all -> 0x0160 }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
                java.lang.String r14 = "call = "
                r13.<init>(r14)     // Catch:{ all -> 0x0160 }
                r13.append(r11)     // Catch:{ all -> 0x0160 }
                java.lang.String r14 = "; size = "
                r13.append(r14)     // Catch:{ all -> 0x0160 }
                r13.append(r12)     // Catch:{ all -> 0x0160 }
                java.lang.String r14 = " byte"
                r13.append(r14)     // Catch:{ all -> 0x0160 }
                if (r12 <= r10) goto L_0x006d
                java.lang.String r12 = "s"
                goto L_0x006e
            L_0x006d:
                r12 = r2
            L_0x006e:
                r13.append(r12)     // Catch:{ all -> 0x0160 }
                java.lang.String r12 = "; body = "
                r13.append(r12)     // Catch:{ all -> 0x0160 }
                r13.append(r0)     // Catch:{ all -> 0x0160 }
                java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0160 }
                com.appsflyer.internal.C0482ai.AFKeystoreWrapper(r0)     // Catch:{ all -> 0x0160 }
            L_0x0080:
                java.lang.String r0 = "AppsFlyer"
                int r0 = r0.hashCode()     // Catch:{ all -> 0x0160 }
                android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x0160 }
                java.net.URLConnection r0 = r11.openConnection()     // Catch:{ all -> 0x0160 }
                r12 = r0
                java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x0160 }
                r0 = 30000(0x7530, float:4.2039E-41)
                r12.setReadTimeout(r0)     // Catch:{ all -> 0x015d }
                r12.setConnectTimeout(r0)     // Catch:{ all -> 0x015d }
                java.lang.String r0 = "POST"
                r12.setRequestMethod(r0)     // Catch:{ all -> 0x015d }
                r12.setDoInput(r10)     // Catch:{ all -> 0x015d }
                r12.setDoOutput(r10)     // Catch:{ all -> 0x015d }
                java.lang.String r0 = "Content-Type"
                if (r7 == 0) goto L_0x00aa
                java.lang.String r13 = "application/octet-stream"
                goto L_0x00ac
            L_0x00aa:
                java.lang.String r13 = "application/json"
            L_0x00ac:
                r12.setRequestProperty(r0, r13)     // Catch:{ all -> 0x015d }
                java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x015d }
                if (r7 == 0) goto L_0x0130
                com.appsflyer.internal.cm r7 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x015d }
                java.lang.String r7 = r7.AFVersionDeclaration     // Catch:{ all -> 0x015d }
                java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x0127 }
                r13[r4] = r7     // Catch:{ all -> 0x0127 }
                int r7 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0127 }
                int r7 = r7 >> 16
                int r7 = r7 + 24
                int r14 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x0127 }
                int r14 = r14 >> 16
                int r14 = r14 + 24
                r15 = 0
                float r16 = android.graphics.PointF.length(r15, r15)     // Catch:{ all -> 0x0127 }
                int r15 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
                char r15 = (char) r15     // Catch:{ all -> 0x0127 }
                java.lang.Object r7 = com.appsflyer.internal.C0599e.AFInAppEventParameterName(r7, r14, r15)     // Catch:{ all -> 0x0127 }
                java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x0127 }
                java.lang.String r14 = "AFInAppEventParameterName"
                java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ all -> 0x0127 }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r4] = r16     // Catch:{ all -> 0x0127 }
                java.lang.reflect.Method r7 = r7.getMethod(r14, r15)     // Catch:{ all -> 0x0127 }
                java.lang.Object r7 = r7.invoke(r9, r13)     // Catch:{ all -> 0x0127 }
                java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ all -> 0x011e }
                r9[r4] = r8     // Catch:{ all -> 0x011e }
                int r8 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x011e }
                int r8 = r8 >> 16
                int r8 = 24 - r8
                int r13 = android.os.Process.getGidForName(r2)     // Catch:{ all -> 0x011e }
                int r13 = 23 - r13
                int r14 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x011e }
                int r14 = r14 >> 16
                char r14 = (char) r14     // Catch:{ all -> 0x011e }
                java.lang.Object r8 = com.appsflyer.internal.C0599e.AFInAppEventParameterName(r8, r13, r14)     // Catch:{ all -> 0x011e }
                java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x011e }
                java.lang.String r13 = "values"
                java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x011e }
                java.lang.Class<byte[]> r15 = byte[].class
                r14[r4] = r15     // Catch:{ all -> 0x011e }
                java.lang.reflect.Method r8 = r8.getDeclaredMethod(r13, r14)     // Catch:{ all -> 0x011e }
                java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ all -> 0x011e }
                r8 = r7
                byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x011e }
                goto L_0x0130
            L_0x011e:
                r0 = move-exception
                java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x015d }
                if (r4 == 0) goto L_0x0126
                throw r4     // Catch:{ all -> 0x015d }
            L_0x0126:
                throw r0     // Catch:{ all -> 0x015d }
            L_0x0127:
                r0 = move-exception
                java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x015d }
                if (r4 == 0) goto L_0x012f
                throw r4     // Catch:{ all -> 0x015d }
            L_0x012f:
                throw r0     // Catch:{ all -> 0x015d }
            L_0x0130:
                r0.write(r8)     // Catch:{ all -> 0x015d }
                r0.close()     // Catch:{ all -> 0x015d }
                r12.connect()     // Catch:{ all -> 0x015d }
                int r0 = r12.getResponseCode()     // Catch:{ all -> 0x015d }
                if (r5 == 0) goto L_0x0146
                com.appsflyer.internal.C0458ac.AFInAppEventParameterName()     // Catch:{ all -> 0x015d }
                java.lang.String r2 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName((java.net.HttpURLConnection) r12)     // Catch:{ all -> 0x015d }
            L_0x0146:
                if (r6 == 0) goto L_0x0153
                com.appsflyer.internal.ak r5 = com.appsflyer.internal.C0484ak.AFInAppEventType()     // Catch:{ all -> 0x015d }
                java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x015d }
                r5.values(r6, r0, r2)     // Catch:{ all -> 0x015d }
            L_0x0153:
                r5 = 200(0xc8, float:2.8E-43)
                if (r0 != r5) goto L_0x016f
                java.lang.String r0 = "Status 200 ok"
                com.appsflyer.AFLogger.values((java.lang.String) r0)     // Catch:{ all -> 0x015d }
                goto L_0x0170
            L_0x015d:
                r0 = move-exception
                r9 = r12
                goto L_0x0161
            L_0x0160:
                r0 = move-exception
            L_0x0161:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r4 = "Error while calling "
                java.lang.String r3 = r4.concat(r3)
                com.appsflyer.AFLogger.valueOf(r3, r0)
                r12 = r9
            L_0x016f:
                r4 = 1
            L_0x0170:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "Connection "
                r0.<init>(r3)
                if (r4 == 0) goto L_0x017c
                java.lang.String r3 = "error"
                goto L_0x017e
            L_0x017c:
                java.lang.String r3 = "call succeeded"
            L_0x017e:
                r0.append(r3)
                java.lang.String r3 = ": "
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.appsflyer.AFLogger.values((java.lang.String) r0)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0490an.C0491c.values():java.net.HttpURLConnection");
        }

        public void run() {
            HttpURLConnection values = values();
            if (values != null) {
                values.disconnect();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, AFKeystoreWrapper);
        String AFInAppEventParameterName2 = C0474ag.AFInAppEventParameterName((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getDevKey());
        sb.append(this.AppsFlyer2dXConversionCallback);
        sb.append(AFKeystoreWrapper);
        httpsURLConnection.setRequestProperty(AFKeystoreWrapper("ዺ力￻쬣꠻ጵ삸瑃뜂ᣫ?", "뾎숵?⒗", "嘢쥲亳儷", -1 - TextUtils.indexOf("", '0', 0), (char) (-1 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), C0474ag.valueOf(AFInAppEventParameterName2, sb.toString()));
        int i = onAttributionFailureNative + 89;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
    }

    private Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.5.3");
        hashMap.put("counter", Integer.valueOf(this.values.valueOf(C0458ac.AFInAppEventType(this.getLevel), false)));
        hashMap.put("model", Build.MODEL);
        hashMap.put(AFKeystoreWrapper("粞Რ䥕穷작", "Ẩ⋾", "嘢쥲亳儷", -1460880153 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65054)).intern(), Build.BRAND);
        hashMap.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.getLevel.getPackageManager().getPackageInfo(this.getLevel.getPackageName(), 0).versionName);
            int i = onInstallConversionDataLoadedNative + 77;
            onAttributionFailureNative = i % 128;
            int i2 = i % 2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.getLevel.getPackageName());
        hashMap.put("platformextension", new C0485al().AFInAppEventType());
        int i3 = onInstallConversionDataLoadedNative + 31;
        onAttributionFailureNative = i3 % 128;
        if ((i3 % 2 == 0 ? Typography.less : 14) == 14) {
            return hashMap;
        }
        int i4 = 7 / 0;
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, char r11) {
        /*
            if (r9 == 0) goto L_0x0006
            char[] r9 = r9.toCharArray()
        L_0x0006:
            char[] r9 = (char[]) r9
            if (r8 == 0) goto L_0x000e
            char[] r8 = r8.toCharArray()
        L_0x000e:
            char[] r8 = (char[]) r8
            if (r7 == 0) goto L_0x0016
            char[] r7 = r7.toCharArray()
        L_0x0016:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.appsflyer.internal.C0595dp.valueOf
            monitor-enter(r0)
            java.lang.Object r8 = r8.clone()     // Catch:{ all -> 0x0092 }
            char[] r8 = (char[]) r8     // Catch:{ all -> 0x0092 }
            java.lang.Object r9 = r9.clone()     // Catch:{ all -> 0x0092 }
            char[] r9 = (char[]) r9     // Catch:{ all -> 0x0092 }
            r1 = 0
            char r2 = r8[r1]     // Catch:{ all -> 0x0092 }
            r11 = r11 ^ r2
            char r11 = (char) r11     // Catch:{ all -> 0x0092 }
            r8[r1] = r11     // Catch:{ all -> 0x0092 }
            r11 = 2
            char r2 = r9[r11]     // Catch:{ all -> 0x0092 }
            char r10 = (char) r10     // Catch:{ all -> 0x0092 }
            int r2 = r2 + r10
            char r10 = (char) r2     // Catch:{ all -> 0x0092 }
            r9[r11] = r10     // Catch:{ all -> 0x0092 }
            int r10 = r7.length     // Catch:{ all -> 0x0092 }
            char[] r2 = new char[r10]     // Catch:{ all -> 0x0092 }
            com.appsflyer.internal.C0595dp.AFInAppEventParameterName = r1     // Catch:{ all -> 0x0092 }
        L_0x003b:
            int r1 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            if (r1 >= r10) goto L_0x008b
            int r1 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            int r1 = r1 + r11
            int r1 = r1 % 4
            int r3 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            int r3 = r3 + 3
            int r3 = r3 % 4
            int r4 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            int r4 = r4 % 4
            char r4 = r8[r4]     // Catch:{ all -> 0x0092 }
            int r4 = r4 * 32718
            char r5 = r9[r1]     // Catch:{ all -> 0x0092 }
            int r4 = r4 + r5
            r5 = 65535(0xffff, float:9.1834E-41)
            int r4 = r4 % r5
            char r4 = (char) r4     // Catch:{ all -> 0x0092 }
            com.appsflyer.internal.C0595dp.AFInAppEventType = r4     // Catch:{ all -> 0x0092 }
            char r4 = r8[r3]     // Catch:{ all -> 0x0092 }
            int r4 = r4 * 32718
            char r1 = r9[r1]     // Catch:{ all -> 0x0092 }
            int r4 = r4 + r1
            int r4 = r4 / r5
            char r1 = (char) r4     // Catch:{ all -> 0x0092 }
            r9[r3] = r1     // Catch:{ all -> 0x0092 }
            char r1 = com.appsflyer.internal.C0595dp.AFInAppEventType     // Catch:{ all -> 0x0092 }
            r8[r3] = r1     // Catch:{ all -> 0x0092 }
            int r1 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            int r4 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            char r4 = r7[r4]     // Catch:{ all -> 0x0092 }
            char r3 = r8[r3]     // Catch:{ all -> 0x0092 }
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch:{ all -> 0x0092 }
            long r5 = init     // Catch:{ all -> 0x0092 }
            long r3 = r3 ^ r5
            int r5 = AFLogger$LogLevel     // Catch:{ all -> 0x0092 }
            long r5 = (long) r5     // Catch:{ all -> 0x0092 }
            long r3 = r3 ^ r5
            char r5 = onAppOpenAttributionNative     // Catch:{ all -> 0x0092 }
            long r5 = (long) r5     // Catch:{ all -> 0x0092 }
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch:{ all -> 0x0092 }
            char r3 = (char) r4     // Catch:{ all -> 0x0092 }
            r2[r1] = r3     // Catch:{ all -> 0x0092 }
            int r1 = com.appsflyer.internal.C0595dp.AFInAppEventParameterName     // Catch:{ all -> 0x0092 }
            int r1 = r1 + 1
            com.appsflyer.internal.C0595dp.AFInAppEventParameterName = r1     // Catch:{ all -> 0x0092 }
            goto L_0x003b
        L_0x008b:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0092 }
            r7.<init>(r2)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r7
        L_0x0092:
            r7 = move-exception
            monitor-exit(r0)
            goto L_0x0096
        L_0x0095:
            throw r7
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0490an.AFKeystoreWrapper(java.lang.String, java.lang.String, java.lang.String, int, char):java.lang.String");
    }
}
