package com.appsflyer.internal;

import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.ak */
public final class C0484ak {
    private static char AppsFlyer2dXConversionCallback = '긓';
    private static char init = '';
    private static char onAppOpenAttributionNative = '㲅';
    private static int onDeepLinkingNative = 0;
    private static int onInstallConversionDataLoadedNative = 1;
    private static char onInstallConversionFailureNative = '➪';
    private static C0484ak values;
    private int AFInAppEventParameterName = 0;
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFKeystoreWrapper = true;
    private boolean AFLogger$LogLevel = (true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false));
    private boolean AFVersionDeclaration = false;
    private String getLevel = "-1";
    private Map<String, Object> valueOf;

    private C0484ak() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (values == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (values == null) goto L_0x001d;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.C0484ak AFInAppEventType() {
        /*
            int r0 = onDeepLinkingNative
            int r0 = r0 + 51
            int r1 = r0 % 128
            onInstallConversionDataLoadedNative = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x0017
            com.appsflyer.internal.ak r0 = values
            if (r0 != 0) goto L_0x002e
            goto L_0x001d
        L_0x0017:
            com.appsflyer.internal.ak r0 = values
            r2 = 4
            int r2 = r2 / r1
            if (r0 != 0) goto L_0x002e
        L_0x001d:
            com.appsflyer.internal.ak r0 = new com.appsflyer.internal.ak
            r0.<init>()
            values = r0
            int r0 = onInstallConversionDataLoadedNative
            int r0 = r0 + 91
            int r1 = r0 % 128
            onDeepLinkingNative = r1
            int r0 = r0 % 2
        L_0x002e:
            com.appsflyer.internal.ak r0 = values
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventType():com.appsflyer.internal.ak");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void values(String str) {
        int i = onInstallConversionDataLoadedNative + 111;
        onDeepLinkingNative = i % 128;
        if ((i % 2 != 0 ? '`' : 20) != '`') {
            this.getLevel = str;
        } else {
            this.getLevel = str;
            Object obj = null;
            super.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void AFKeystoreWrapper() {
        this.AFVersionDeclaration = true;
        boolean z = false;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i = onDeepLinkingNative + 19;
        onInstallConversionDataLoadedNative = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            Object obj = null;
            super.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void AFInAppEventParameterName() {
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFVersionDeclaration = false;
        this.AFKeystoreWrapper = false;
        int i = onDeepLinkingNative + 23;
        onInstallConversionDataLoadedNative = i % 128;
        if ((i % 2 == 0 ? 'H' : 13) != 13) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Object>, com.appsflyer.internal.ak] */
    /* access modifiers changed from: package-private */
    public final synchronized void values() {
        int i = onDeepLinkingNative;
        int i2 = i + 7;
        onInstallConversionDataLoadedNative = i2 % 128;
        int i3 = i2 % 2;
        ? r1 = 0;
        this.valueOf = r1;
        values = r1;
        int i4 = i + 9;
        onInstallConversionDataLoadedNative = i4 % 128;
        if ((i4 % 2 == 0 ? 13 : '`') != '`') {
            int length = r1.length;
        }
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventType(String str, PackageManager packageManager) {
        int i = onDeepLinkingNative + 35;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        try {
            AFInAppEventParameterName(str, packageManager);
            C0524bl<String> AFKeystoreWrapper2 = C0458ac.AFInAppEventParameterName().values().valueOf().AFKeystoreWrapper(AFLogger$LogLevel());
            boolean z = true;
            if (!AFKeystoreWrapper2.valueOf.getAndSet(true)) {
                AFKeystoreWrapper2.AFKeystoreWrapper.submit(new Runnable((C0521bi) null) {
                    private /* synthetic */ C0521bi AFInAppEventParameterName;

                    {
                        this.AFInAppEventParameterName = r2;
                    }

                    public final void run() {
                        try {
                            C0531br<String> AFInAppEventType2 = C0524bl.this.values.AFInAppEventType(C0524bl.this.AFInAppEventType);
                            if (this.AFInAppEventParameterName != null) {
                                try {
                                    this.AFInAppEventParameterName.values(new C0531br(C0524bl.this.AFInAppEventParameterName.values((String) AFInAppEventType2.valueOf), AFInAppEventType2.values, AFInAppEventType2.AFKeystoreWrapper, AFInAppEventType2.AFInAppEventParameterName, AFInAppEventType2.AFInAppEventType));
                                } catch (JSONException e) {
                                    this.AFInAppEventParameterName.values((Throwable) new ParsingException(e.getMessage(), e, AFInAppEventType2));
                                }
                            }
                        } catch (IOException e2) {
                            C0521bi biVar = this.AFInAppEventParameterName;
                            if (biVar != null) {
                                biVar.values((Throwable) e2);
                            }
                        }
                    }
                });
                int i3 = onInstallConversionDataLoadedNative + 1;
                onDeepLinkingNative = i3 % 128;
                if (i3 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    int i4 = 63 / 0;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Http call is already executed");
        } catch (Throwable th) {
            AFLogger.values(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r4.AFVersionDeclaration ? ';' : 27) != 27) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean AppsFlyer2dXConversionCallback() {
        /*
            r4 = this;
            boolean r0 = r4.AFLogger$LogLevel
            r1 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r4.AFKeystoreWrapper
            r2 = 1
            if (r0 != 0) goto L_0x000c
            r0 = 0
            goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            if (r0 == r2) goto L_0x0026
            int r0 = onDeepLinkingNative
            int r0 = r0 + 15
            int r3 = r0 % 128
            onInstallConversionDataLoadedNative = r3
            int r0 = r0 % 2
            boolean r0 = r4.AFVersionDeclaration
            r3 = 27
            if (r0 == 0) goto L_0x0022
            r0 = 59
            goto L_0x0024
        L_0x0022:
            r0 = 27
        L_0x0024:
            if (r0 == r3) goto L_0x0027
        L_0x0026:
            return r2
        L_0x0027:
            int r0 = onInstallConversionDataLoadedNative
            int r0 = r0 + 25
            int r2 = r0 % 128
            onDeepLinkingNative = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0039
            r0 = 20
            int r0 = r0 / r1
            return r1
        L_0x0037:
            r0 = move-exception
            throw r0
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AppsFlyer2dXConversionCallback():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r6.length() > 0) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFInAppEventParameterName(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "쉝鏭碻壨﮻"
            r2 = 0
            int r3 = android.view.View.combineMeasuredStates(r2, r2)     // Catch:{ all -> 0x00ce }
            int r3 = 5 - r3
            java.lang.String r1 = AFInAppEventParameterName((java.lang.String) r1, (int) r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r1.intern()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ all -> 0x00ce }
            r0.put(r1, r3)     // Catch:{ all -> 0x00ce }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ all -> 0x00ce }
            r0.put(r1, r3)     // Catch:{ all -> 0x00ce }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "platform"
            java.lang.String r3 = "Android"
            r0.put(r1, r3)     // Catch:{ all -> 0x00ce }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "platform_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00ce }
            r0.put(r1, r3)     // Catch:{ all -> 0x00ce }
            r0 = 1
            if (r5 == 0) goto L_0x0063
            int r1 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x0060 }
            int r1 = r1 + 113
            int r3 = r1 % 128
            onDeepLinkingNative = r3     // Catch:{ all -> 0x0060 }
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x004c
            int r1 = r5.length()     // Catch:{ all -> 0x00ce }
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x00ce }
            if (r1 <= 0) goto L_0x0063
            goto L_0x0058
        L_0x004c:
            int r1 = r5.length()     // Catch:{ all -> 0x00ce }
            if (r1 <= 0) goto L_0x0054
            r1 = 0
            goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            if (r1 == 0) goto L_0x0058
            goto L_0x0063
        L_0x0058:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "advertiserId"
            r1.put(r3, r5)     // Catch:{ all -> 0x00ce }
            goto L_0x0063
        L_0x0060:
            r5 = move-exception
            goto L_0x00ca
        L_0x0063:
            if (r6 == 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 == 0) goto L_0x0097
            int r5 = onDeepLinkingNative     // Catch:{ all -> 0x0060 }
            int r5 = r5 + 29
            int r1 = r5 % 128
            onInstallConversionDataLoadedNative = r1     // Catch:{ all -> 0x0060 }
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0080
            int r5 = r6.length()     // Catch:{ all -> 0x00ce }
            r1 = 32
            int r1 = r1 / r2
            if (r5 <= 0) goto L_0x0097
            goto L_0x0086
        L_0x0080:
            int r5 = r6.length()     // Catch:{ all -> 0x00ce }
            if (r5 <= 0) goto L_0x0097
        L_0x0086:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "imei"
            r5.put(r1, r6)     // Catch:{ all -> 0x00ce }
            int r5 = onDeepLinkingNative     // Catch:{ all -> 0x0060 }
            int r5 = r5 + 107
            int r6 = r5 % 128
            onInstallConversionDataLoadedNative = r6     // Catch:{ all -> 0x0060 }
            int r5 = r5 % 2
        L_0x0097:
            if (r7 == 0) goto L_0x00cc
            int r5 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x0060 }
            int r5 = r5 + 15
            int r6 = r5 % 128
            onDeepLinkingNative = r6     // Catch:{ all -> 0x0060 }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x00a7
            r5 = 1
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 == 0) goto L_0x00b8
            int r5 = r7.length()     // Catch:{ all -> 0x00ce }
            r6 = 87
            int r6 = r6 / r2
            if (r5 <= 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r2 = 1
        L_0x00b5:
            if (r2 == r0) goto L_0x00cc
            goto L_0x00c2
        L_0x00b8:
            int r5 = r7.length()     // Catch:{ all -> 0x00ce }
            if (r5 <= 0) goto L_0x00bf
            r2 = 1
        L_0x00bf:
            if (r2 == r0) goto L_0x00c2
            goto L_0x00cc
        L_0x00c2:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.valueOf     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = "android_id"
            r5.put(r6, r7)     // Catch:{ all -> 0x00ce }
            goto L_0x00cc
        L_0x00ca:
            monitor-exit(r4)
            throw r5
        L_0x00cc:
            monitor-exit(r4)
            return
        L_0x00ce:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventParameterName(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0072, code lost:
        if ((r6.length() > 0 ? 'W' : 29) != 29) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFInAppEventType(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = onDeepLinkingNative     // Catch:{ all -> 0x0092 }
            int r0 = r0 + 107
            int r1 = r0 % 128
            onInstallConversionDataLoadedNative = r1     // Catch:{ all -> 0x0092 }
            int r0 = r0 % 2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.valueOf     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r4)     // Catch:{ all -> 0x0090 }
            r4 = 0
            r0 = 1
            if (r5 == 0) goto L_0x0048
            int r1 = onDeepLinkingNative     // Catch:{ all -> 0x0092 }
            int r1 = r1 + r0
            int r2 = r1 % 128
            onInstallConversionDataLoadedNative = r2     // Catch:{ all -> 0x0092 }
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0031
            int r1 = r5.length()     // Catch:{ all -> 0x0090 }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0090 }
            if (r1 <= 0) goto L_0x002d
            r1 = 0
            goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            if (r1 == r0) goto L_0x0048
            goto L_0x0041
        L_0x0031:
            int r1 = r5.length()     // Catch:{ all -> 0x0090 }
            r2 = 8
            if (r1 <= 0) goto L_0x003c
            r1 = 8
            goto L_0x003e
        L_0x003c:
            r1 = 45
        L_0x003e:
            if (r1 == r2) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.valueOf     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "devkey"
            r1.put(r2, r5)     // Catch:{ all -> 0x0090 }
        L_0x0048:
            if (r6 == 0) goto L_0x007b
            int r5 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x0092 }
            int r5 = r5 + 107
            int r1 = r5 % 128
            onDeepLinkingNative = r1     // Catch:{ all -> 0x0092 }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 == r0) goto L_0x0062
            int r5 = r6.length()     // Catch:{ all -> 0x0090 }
            if (r5 <= 0) goto L_0x007b
            goto L_0x0074
        L_0x0062:
            int r5 = r6.length()     // Catch:{ all -> 0x0090 }
            r1 = 32
            int r1 = r1 / r4
            r1 = 29
            if (r5 <= 0) goto L_0x0070
            r5 = 87
            goto L_0x0072
        L_0x0070:
            r5 = 29
        L_0x0072:
            if (r5 == r1) goto L_0x007b
        L_0x0074:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.valueOf     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "originalAppsFlyerId"
            r5.put(r1, r6)     // Catch:{ all -> 0x0090 }
        L_0x007b:
            if (r7 == 0) goto L_0x008e
            int r5 = r7.length()     // Catch:{ all -> 0x0090 }
            if (r5 <= 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = 1
        L_0x0085:
            if (r4 == r0) goto L_0x008e
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.valueOf     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "uid"
            r4.put(r5, r7)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r3)
            return
        L_0x0090:
            monitor-exit(r3)
            return
        L_0x0092:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventType(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r6 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008a, code lost:
        if (r8.length() > 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00af, code lost:
        if (r9.length() > 0) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036 A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039 A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC, Splitter:B:39:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0095 A[SYNTHETIC, Splitter:B:53:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void valueOf(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00c6 }
            int r0 = r0 + 23
            int r1 = r0 % 128
            onDeepLinkingNative = r1     // Catch:{ all -> 0x00c6 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001d
            int r0 = r3.length     // Catch:{ all -> 0x00c4 }
            r0 = 36
            if (r6 == 0) goto L_0x0018
            r4 = 36
            goto L_0x001a
        L_0x0018:
            r4 = 82
        L_0x001a:
            if (r4 == r0) goto L_0x001f
            goto L_0x0032
        L_0x001d:
            if (r6 == 0) goto L_0x0032
        L_0x001f:
            int r0 = r6.length()     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x0027
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.valueOf     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "app_id"
            r0.put(r4, r6)     // Catch:{ all -> 0x00c4 }
        L_0x0032:
            r6 = 44
            if (r7 == 0) goto L_0x0039
            r0 = 44
            goto L_0x003b
        L_0x0039:
            r0 = 80
        L_0x003b:
            if (r0 == r6) goto L_0x003e
            goto L_0x006c
        L_0x003e:
            int r6 = r7.length()     // Catch:{ all -> 0x00c4 }
            r0 = 9
            if (r6 <= 0) goto L_0x0049
            r6 = 9
            goto L_0x004b
        L_0x0049:
            r6 = 28
        L_0x004b:
            if (r6 == r0) goto L_0x004e
            goto L_0x006c
        L_0x004e:
            int r6 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00c6 }
            int r6 = r6 + 121
            int r0 = r6 % 128
            onDeepLinkingNative = r0     // Catch:{ all -> 0x00c6 }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0065
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.valueOf     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "app_version"
            r6.put(r0, r7)     // Catch:{ all -> 0x00c4 }
            super.hashCode()     // Catch:{ all -> 0x00c4 }
            goto L_0x006c
        L_0x0065:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.valueOf     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "app_version"
            r6.put(r0, r7)     // Catch:{ all -> 0x00c4 }
        L_0x006c:
            if (r8 == 0) goto L_0x0093
            int r6 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00c6 }
            int r6 = r6 + 81
            int r7 = r6 % 128
            onDeepLinkingNative = r7     // Catch:{ all -> 0x00c6 }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0086
            int r6 = r8.length()     // Catch:{ all -> 0x00c4 }
            int r7 = r3.length     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r1 = 1
        L_0x0083:
            if (r1 == 0) goto L_0x008c
            goto L_0x0093
        L_0x0086:
            int r6 = r8.length()     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x0093
        L_0x008c:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.valueOf     // Catch:{ all -> 0x00c4 }
            java.lang.String r7 = "channel"
            r6.put(r7, r8)     // Catch:{ all -> 0x00c4 }
        L_0x0093:
            if (r9 == 0) goto L_0x00b8
            int r6 = onDeepLinkingNative     // Catch:{ all -> 0x00c6 }
            int r6 = r6 + 35
            int r7 = r6 % 128
            onInstallConversionDataLoadedNative = r7     // Catch:{ all -> 0x00c6 }
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x00ab
            int r6 = r9.length()     // Catch:{ all -> 0x00c4 }
            super.hashCode()     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x00b8
            goto L_0x00b1
        L_0x00ab:
            int r6 = r9.length()     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x00b8
        L_0x00b1:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.valueOf     // Catch:{ all -> 0x00c4 }
            java.lang.String r7 = "preInstall"
            r6.put(r7, r9)     // Catch:{ all -> 0x00c4 }
        L_0x00b8:
            int r6 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00c6 }
            int r6 = r6 + 99
            int r7 = r6 % 128
            onDeepLinkingNative = r7     // Catch:{ all -> 0x00c6 }
            int r6 = r6 % 2
            monitor-exit(r5)
            return
        L_0x00c4:
            monitor-exit(r5)
            return
        L_0x00c6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.valueOf(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(String str, String... strArr) {
        int i = onInstallConversionDataLoadedNative + 83;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        int i3 = onInstallConversionDataLoadedNative + 17;
        onDeepLinkingNative = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void valueOf(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = !(cause != null) ? th.getMessage() : cause.getMessage();
        if ((cause == null ? (char) 18 : 27) != 27) {
            int i = onInstallConversionDataLoadedNative + 5;
            onDeepLinkingNative = i % 128;
            int i2 = i % 2;
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = cause.getStackTrace();
            int i3 = onDeepLinkingNative + 87;
            onInstallConversionDataLoadedNative = i3 % 128;
            int i4 = i3 % 2;
        }
        AFInAppEventParameterName("exception", simpleName, values(message, stackTraceElementArr));
    }

    public final void AFInAppEventType(String str, String str2) {
        int i = onDeepLinkingNative + 59;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName("server_request", str, str2);
        int i3 = onDeepLinkingNative + 9;
        onInstallConversionDataLoadedNative = i3 % 128;
        if ((i3 % 2 == 0 ? 'T' : 'O') == 'T') {
            int i4 = 56 / 0;
        }
    }

    public final void values(String str, int i, String str2) {
        int i2 = onDeepLinkingNative + 57;
        onInstallConversionDataLoadedNative = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
        int i4 = onInstallConversionDataLoadedNative + 27;
        onDeepLinkingNative = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        int i = onInstallConversionDataLoadedNative + 91;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName((String) null, str, str2);
        int i3 = onDeepLinkingNative + 57;
        onInstallConversionDataLoadedNative = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFInAppEventParameterName(java.lang.String r5, java.lang.String r6, java.lang.String... r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00ac }
            int r0 = r0 + 33
            int r1 = r0 % 128
            onDeepLinkingNative = r1     // Catch:{ all -> 0x00ac }
            int r0 = r0 % 2
            boolean r0 = r4.AppsFlyer2dXConversionCallback()     // Catch:{ all -> 0x00ac }
            r1 = 1
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x00aa
            int r0 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00ac }
            r2 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r2) goto L_0x0020
            goto L_0x00aa
        L_0x0020:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = ", "
            java.lang.String r7 = android.text.TextUtils.join(r0, r7)     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x0061
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r0.<init>()     // Catch:{ all -> 0x00a8 }
            r0.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = " "
            r0.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00a8 }
            long r2 = r2.getId()     // Catch:{ all -> 0x00a8 }
            r0.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = " _/AppsFlyer_6.5.3 ["
            r0.append(r2)     // Catch:{ all -> 0x00a8 }
            r0.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "] "
            r0.append(r5)     // Catch:{ all -> 0x00a8 }
            r0.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = " "
            r0.append(r5)     // Catch:{ all -> 0x00a8 }
            r0.append(r7)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00a8 }
            goto L_0x008d
        L_0x0061:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r5.<init>()     // Catch:{ all -> 0x00a8 }
            r5.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = " "
            r5.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00a8 }
            long r2 = r0.getId()     // Catch:{ all -> 0x00a8 }
            r5.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = " "
            r5.append(r0)     // Catch:{ all -> 0x00a8 }
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "/AppsFlyer_6.5.3 "
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            r5.append(r7)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a8 }
        L_0x008d:
            java.util.List<java.lang.String> r6 = r4.AFInAppEventType     // Catch:{ all -> 0x00a8 }
            r6.add(r5)     // Catch:{ all -> 0x00a8 }
            int r6 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00a8 }
            int r5 = r5.length()     // Catch:{ all -> 0x00a8 }
            int r5 = r5 << r1
            int r6 = r6 + r5
            r4.AFInAppEventParameterName = r6     // Catch:{ all -> 0x00a8 }
            int r5 = onDeepLinkingNative     // Catch:{ all -> 0x00ac }
            int r5 = r5 + 75
            int r6 = r5 % 128
            onInstallConversionDataLoadedNative = r6     // Catch:{ all -> 0x00ac }
            int r5 = r5 % 2
            monitor-exit(r4)
            return
        L_0x00a8:
            monitor-exit(r4)
            return
        L_0x00aa:
            monitor-exit(r4)
            return
        L_0x00ac:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventParameterName(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    private synchronized Map<String, Object> AFLogger$LogLevel() {
        int i = onInstallConversionDataLoadedNative + 23;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
        this.valueOf.put("data", this.AFInAppEventType);
        init();
        Map<String, Object> map = this.valueOf;
        int i3 = onDeepLinkingNative + 115;
        onInstallConversionDataLoadedNative = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return map;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r7.valueOf = new java.util.HashMap();
        r3 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName();
        AFInAppEventParameterName(r0.getString("advertiserId"), r3.AppsFlyer2dXConversionCallback, r3.init);
        r3 = new java.lang.StringBuilder("6.5.3.");
        r3.append(com.appsflyer.internal.C0458ac.valueOf);
        AFInAppEventType(r3.toString(), r0.getDevKey(), r0.getString("KSAppsFlyerId"), r0.getString("uid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9 = r9.getPackageInfo(r8, 0).versionCode;
        valueOf(r8, java.lang.String.valueOf(r9), r0.getString(com.appsflyer.AppsFlyerProperties.CHANNEL), r0.getString("preInstallName"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r8 = onDeepLinkingNative + 99;
        onInstallConversionDataLoadedNative = r8 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if ((r8 % 2) != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFInAppEventParameterName(java.lang.String r8, android.content.pm.PackageManager r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = onDeepLinkingNative     // Catch:{ all -> 0x00c6 }
            int r0 = r0 + 29
            int r1 = r0 % 128
            onInstallConversionDataLoadedNative = r1     // Catch:{ all -> 0x00c6 }
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x001f
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x00c6 }
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0046
            goto L_0x002b
        L_0x001d:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x001f:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x0046
        L_0x002b:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x00bb }
            r8.<init>(r3)     // Catch:{ all -> 0x00bb }
            java.util.Map r8 = com.appsflyer.internal.C0614n.valueOf((org.json.JSONObject) r8)     // Catch:{ all -> 0x00bb }
            r7.valueOf = r8     // Catch:{ all -> 0x00bb }
            int r8 = onInstallConversionDataLoadedNative     // Catch:{ all -> 0x00c6 }
            int r8 = r8 + 31
            int r9 = r8 % 128
            onDeepLinkingNative = r9     // Catch:{ all -> 0x00c6 }
            int r8 = r8 % 2
            r9 = 1
            if (r8 == 0) goto L_0x0044
            goto L_0x00bb
        L_0x0044:
            r1 = 1
            goto L_0x00bb
        L_0x0046:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00c6 }
            r3.<init>()     // Catch:{ all -> 0x00c6 }
            r7.valueOf = r3     // Catch:{ all -> 0x00c6 }
            com.appsflyer.internal.ac r3 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = "advertiserId"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r3.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = r3.init     // Catch:{ all -> 0x00c6 }
            r7.AFInAppEventParameterName((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r3)     // Catch:{ all -> 0x00c6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = "6.5.3."
            r3.<init>(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = com.appsflyer.internal.C0458ac.valueOf     // Catch:{ all -> 0x00c6 }
            r3.append(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r0.getDevKey()     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "KSAppsFlyerId"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = "uid"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ all -> 0x00c6 }
            r7.AFInAppEventType(r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r8, r1)     // Catch:{ all -> 0x00ad }
            int r9 = r9.versionCode     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "preInstallName"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ad }
            r7.valueOf(r8, r9, r1, r3)     // Catch:{ all -> 0x00ad }
            int r8 = onDeepLinkingNative     // Catch:{ all -> 0x00c6 }
            int r8 = r8 + 99
            int r9 = r8 % 128
            onInstallConversionDataLoadedNative = r9     // Catch:{ all -> 0x00c6 }
            int r8 = r8 % 2
            r9 = 23
            if (r8 != 0) goto L_0x00ab
            r8 = 59
            goto L_0x00ad
        L_0x00ab:
            r8 = 23
        L_0x00ad:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x00c6 }
            java.util.Map<java.lang.String, java.lang.Object> r9 = r7.valueOf     // Catch:{ all -> 0x00c6 }
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00c6 }
            r0.set((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ all -> 0x00c6 }
        L_0x00bb:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r7.valueOf     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "launch_counter"
            java.lang.String r0 = r7.getLevel     // Catch:{ all -> 0x00c6 }
            r8.put(r9, r0)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r7)
            return
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventParameterName(java.lang.String, android.content.pm.PackageManager):void");
    }

    private static String[] values(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i = onDeepLinkingNative + 109;
            onInstallConversionDataLoadedNative = i % 128;
            int i2 = i % 2;
            return new String[]{str};
        }
        String[] strArr = new String[(stackTraceElementArr.length + 1)];
        strArr[0] = str;
        int i3 = 1;
        while (true) {
            if ((i3 < stackTraceElementArr.length ? 1 : '`') == '`') {
                return strArr;
            }
            int i4 = onDeepLinkingNative + 49;
            onInstallConversionDataLoadedNative = i4 % 128;
            if ((i4 % 2 == 0 ? (char) 5 : 9) != 9) {
                strArr[i3] = stackTraceElementArr[i3].toString();
                i3 += 23;
            } else {
                strArr[i3] = stackTraceElementArr[i3].toString();
                i3++;
            }
            int i5 = onDeepLinkingNative + 17;
            onInstallConversionDataLoadedNative = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private synchronized void init() {
        this.AFInAppEventType = new ArrayList();
        this.AFInAppEventParameterName = 0;
        int i = onInstallConversionDataLoadedNative + 33;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void valueOf() {
        int i = onDeepLinkingNative + 103;
        onInstallConversionDataLoadedNative = i % 128;
        if ((i % 2 == 0 ? 14 : '=') != 14) {
            this.AFKeystoreWrapper = false;
        } else {
            this.AFKeystoreWrapper = true;
        }
        init();
        int i2 = onInstallConversionDataLoadedNative + 113;
        onDeepLinkingNative = i2 % 128;
        int i3 = i2 % 2;
    }

    /* access modifiers changed from: package-private */
    public final void getLevel() {
        int i = onDeepLinkingNative + 95;
        onInstallConversionDataLoadedNative = i % 128;
        if (i % 2 == 0) {
        }
        this.AFLogger$LogLevel = false;
    }

    /* access modifiers changed from: package-private */
    public final boolean AFVersionDeclaration() {
        int i = onDeepLinkingNative;
        int i2 = i + 119;
        onInstallConversionDataLoadedNative = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AFVersionDeclaration;
        int i4 = i + 29;
        onInstallConversionDataLoadedNative = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventParameterName(java.lang.String r12, int r13) {
        /*
            if (r12 == 0) goto L_0x0006
            char[] r12 = r12.toCharArray()
        L_0x0006:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.appsflyer.internal.C0597dt.valueOf
            monitor-enter(r0)
            int r1 = r12.length     // Catch:{ all -> 0x0082 }
            char[] r1 = new char[r1]     // Catch:{ all -> 0x0082 }
            r2 = 0
            com.appsflyer.internal.C0597dt.AFInAppEventType = r2     // Catch:{ all -> 0x0082 }
            r3 = 2
            char[] r4 = new char[r3]     // Catch:{ all -> 0x0082 }
        L_0x0014:
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            int r6 = r12.length     // Catch:{ all -> 0x0082 }
            if (r5 >= r6) goto L_0x007b
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            char r5 = r12[r5]     // Catch:{ all -> 0x0082 }
            r4[r2] = r5     // Catch:{ all -> 0x0082 }
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            r6 = 1
            int r5 = r5 + r6
            char r5 = r12[r5]     // Catch:{ all -> 0x0082 }
            r4[r6] = r5     // Catch:{ all -> 0x0082 }
            r5 = 58224(0xe370, float:8.1589E-41)
            r7 = 0
        L_0x002b:
            r8 = 16
            if (r7 >= r8) goto L_0x0068
            char r8 = r4[r6]     // Catch:{ all -> 0x0082 }
            char r9 = r4[r2]     // Catch:{ all -> 0x0082 }
            int r9 = r9 + r5
            char r10 = r4[r2]     // Catch:{ all -> 0x0082 }
            int r10 = r10 << 4
            char r11 = onInstallConversionFailureNative     // Catch:{ all -> 0x0082 }
            int r10 = r10 + r11
            r9 = r9 ^ r10
            char r10 = r4[r2]     // Catch:{ all -> 0x0082 }
            int r10 = r10 >>> 5
            char r11 = onAppOpenAttributionNative     // Catch:{ all -> 0x0082 }
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r8 = r8 - r9
            char r8 = (char) r8     // Catch:{ all -> 0x0082 }
            r4[r6] = r8     // Catch:{ all -> 0x0082 }
            char r8 = r4[r2]     // Catch:{ all -> 0x0082 }
            char r9 = r4[r6]     // Catch:{ all -> 0x0082 }
            int r9 = r9 + r5
            char r10 = r4[r6]     // Catch:{ all -> 0x0082 }
            int r10 = r10 << 4
            char r11 = init     // Catch:{ all -> 0x0082 }
            int r10 = r10 + r11
            r9 = r9 ^ r10
            char r10 = r4[r6]     // Catch:{ all -> 0x0082 }
            int r10 = r10 >>> 5
            char r11 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0082 }
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r8 = r8 - r9
            char r8 = (char) r8     // Catch:{ all -> 0x0082 }
            r4[r2] = r8     // Catch:{ all -> 0x0082 }
            r8 = 40503(0x9e37, float:5.6757E-41)
            int r5 = r5 - r8
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0068:
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            char r7 = r4[r2]     // Catch:{ all -> 0x0082 }
            r1[r5] = r7     // Catch:{ all -> 0x0082 }
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            int r5 = r5 + r6
            char r6 = r4[r6]     // Catch:{ all -> 0x0082 }
            r1[r5] = r6     // Catch:{ all -> 0x0082 }
            int r5 = com.appsflyer.internal.C0597dt.AFInAppEventType     // Catch:{ all -> 0x0082 }
            int r5 = r5 + r3
            com.appsflyer.internal.C0597dt.AFInAppEventType = r5     // Catch:{ all -> 0x0082 }
            goto L_0x0014
        L_0x007b:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0082 }
            r12.<init>(r1, r2, r13)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r12
        L_0x0082:
            r12 = move-exception
            monitor-exit(r0)
            goto L_0x0086
        L_0x0085:
            throw r12
        L_0x0086:
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0484ak.AFInAppEventParameterName(java.lang.String, int):java.lang.String");
    }
}
