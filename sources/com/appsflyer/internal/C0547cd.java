package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C0490an;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.cd */
public final class C0547cd extends C0557cm {
    private static int onAppOpenAttribution = 0;
    private static String onAttributionFailureNative = null;
    private static char onConversionDataFail = '\u0000';
    private static char[] onResponseErrorNative = null;
    private static int onResponseNative = 1;
    private final C0535bv onAppOpenAttributionNative;
    private final SharedPreferences onInstallConversionDataLoadedNative;

    static void AFVersionDeclaration() {
        onResponseErrorNative = new char[]{'b', 'r', 'a', 'n', 'd', 'c', 'e', 'f', 'g'};
        onConversionDataFail = 3;
    }

    static /* synthetic */ void valueOf(C0547cd cdVar) {
        int i = onResponseNative + 63;
        onAppOpenAttribution = i % 128;
        boolean z = i % 2 == 0;
        cdVar.init();
        if (!z) {
            int i2 = 84 / 0;
        }
    }

    static {
        AFVersionDeclaration();
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(C0458ac.values);
        onAttributionFailureNative = sb.toString();
        int i = onAppOpenAttribution + 9;
        onResponseNative = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0547cd(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = onAttributionFailureNative
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.appsflyer.AppsFlyerLib r3 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r3 = r3.getHostPrefix()
            r4 = 0
            r2[r4] = r3
            com.appsflyer.internal.ac r3 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()
            java.lang.String r3 = r3.getHostName()
            r4 = 1
            r2[r4] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r1 = r10.getPackageName()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.content.SharedPreferences r0 = com.appsflyer.internal.C0458ac.AFInAppEventType((android.content.Context) r10)
            r9.onInstallConversionDataLoadedNative = r0
            com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()
            com.appsflyer.internal.bv r10 = r0.values((android.content.Context) r10)
            r9.onAppOpenAttributionNative = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0547cd.<init>(android.content.Context):void");
    }

    public static boolean AFKeystoreWrapper(Context context) {
        int i = onResponseNative + 81;
        onAppOpenAttribution = i % 128;
        int i2 = i % 2;
        if (!AppsFlyerLib.getInstance().isStopped()) {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
                return C0630z.AFKeystoreWrapper(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri) null, context, FirebaseMessagingServiceListener.class));
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                AFLogger.valueOf("An error occurred while trying to verify manifest declarations: ", th);
            }
        } else {
            int i3 = onResponseNative + 91;
            onAppOpenAttribution = i3 % 128;
            return (i3 % 2 != 0 ? (char) 26 : 6) != 6;
        }
    }

    public static boolean AFInAppEventType(SharedPreferences sharedPreferences) {
        int i = onResponseNative + 3;
        onAppOpenAttribution = i % 128;
        boolean z = i % 2 != 0 ? sharedPreferences.getBoolean("sentRegisterRequestToAF", true) : sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
        int i2 = onResponseNative + 97;
        onAppOpenAttribution = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public final void AFInAppEventParameterName(String str) {
        if (str != null) {
            AFLogger.values("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C0489am onInstallConversionDataLoadedNative2 = onInstallConversionDataLoadedNative();
            if (onInstallConversionDataLoadedNative2 == null || !str.equals(onInstallConversionDataLoadedNative2.AFInAppEventType)) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = C0458ac.AFInAppEventType(this.onInstallConversionDataLoadedNative) && (onInstallConversionDataLoadedNative2 == null || currentTimeMillis - onInstallConversionDataLoadedNative2.AFKeystoreWrapper > TimeUnit.SECONDS.toMillis(2));
                values(new C0489am(str, currentTimeMillis, !z));
                if (z) {
                    AFKeystoreWrapper(str);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r1 ? 'B' : 'X') != 'X') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0.values() != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFKeystoreWrapper() {
        /*
            r3 = this;
            com.appsflyer.internal.am r0 = r3.onInstallConversionDataLoadedNative()
            if (r0 == 0) goto L_0x0046
            int r1 = onAppOpenAttribution
            int r1 = r1 + 43
            int r2 = r1 % 128
            onResponseNative = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0014
            r1 = 0
            goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x001e
            boolean r1 = r0.values()
            if (r1 == 0) goto L_0x0046
            goto L_0x0031
        L_0x001e:
            boolean r1 = r0.values()
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0044 }
            r2 = 88
            if (r1 == 0) goto L_0x002d
            r1 = 66
            goto L_0x002f
        L_0x002d:
            r1 = 88
        L_0x002f:
            if (r1 == r2) goto L_0x0046
        L_0x0031:
            java.lang.String r0 = r0.AFInAppEventType
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Resending Uninstall token to AF servers: "
            java.lang.String r1 = r2.concat(r1)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r1)
            r3.AFKeystoreWrapper((java.lang.String) r0)
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            throw r0
        L_0x0046:
            int r0 = onResponseNative
            int r0 = r0 + 49
            int r1 = r0 % 128
            onAppOpenAttribution = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0547cd.AFKeystoreWrapper():void");
    }

    private void init() {
        int i = onResponseNative + 83;
        onAppOpenAttribution = i % 128;
        int i2 = i % 2;
        this.onAppOpenAttributionNative.AFInAppEventType("sentRegisterRequestToAF", true);
        AFLogger.AFInAppEventParameterName("Successfully registered for Uninstall Tracking");
        int i3 = onAppOpenAttribution + 69;
        onResponseNative = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.appsflyer.internal.am, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if ((r12 != null) != true) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r12 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r1.length >= 3) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r1.length >= 2) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.appsflyer.internal.C0489am onInstallConversionDataLoadedNative() {
        /*
            r14 = this;
            android.content.SharedPreferences r0 = r14.onInstallConversionDataLoadedNative
            java.lang.String r1 = "afUninstallToken"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            android.content.SharedPreferences r3 = r14.onInstallConversionDataLoadedNative
            java.lang.String r4 = "afUninstallToken_received_time"
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            android.content.SharedPreferences r7 = r14.onInstallConversionDataLoadedNative
            java.lang.String r8 = "afUninstallToken_queued"
            r9 = 0
            boolean r7 = r7.getBoolean(r8, r9)
            com.appsflyer.internal.bv r10 = r14.onAppOpenAttributionNative
            r10.AFInAppEventType((java.lang.String) r8, (boolean) r9)
            java.lang.String r8 = ","
            r10 = 1
            r11 = 2
            if (r0 != 0) goto L_0x0057
            int r12 = onResponseNative
            int r12 = r12 + 77
            int r13 = r12 % 128
            onAppOpenAttribution = r13
            int r12 = r12 % r11
            if (r12 == 0) goto L_0x0045
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r12 = r12.getString(r1)
            int r13 = r2.length     // Catch:{ all -> 0x0043 }
            if (r12 == 0) goto L_0x003f
            r13 = 1
            goto L_0x0040
        L_0x003f:
            r13 = 0
        L_0x0040:
            if (r13 == r10) goto L_0x004f
            goto L_0x0057
        L_0x0043:
            r0 = move-exception
            throw r0
        L_0x0045:
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r12 = r12.getString(r1)
            if (r12 == 0) goto L_0x0057
        L_0x004f:
            java.lang.String[] r0 = r12.split(r8)
            int r12 = r0.length
            int r12 = r12 - r10
            r0 = r0[r12]
        L_0x0057:
            r12 = 87
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x0060
            r5 = 87
            goto L_0x0062
        L_0x0060:
            r5 = 76
        L_0x0062:
            if (r5 == r12) goto L_0x0065
            goto L_0x0094
        L_0x0065:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0094
            int r5 = onAppOpenAttribution
            int r5 = r5 + 63
            int r6 = r5 % 128
            onResponseNative = r6
            int r5 = r5 % r11
            if (r5 != 0) goto L_0x0083
            java.lang.String[] r1 = r1.split(r8)
            int r5 = r1.length
            r6 = 3
            if (r5 < r6) goto L_0x0094
            goto L_0x008a
        L_0x0083:
            java.lang.String[] r1 = r1.split(r8)
            int r5 = r1.length
            if (r5 < r11) goto L_0x0094
        L_0x008a:
            int r5 = r1.length     // Catch:{ NumberFormatException -> 0x0093 }
            int r5 = r5 - r11
            r1 = r1[r5]     // Catch:{ NumberFormatException -> 0x0093 }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0093 }
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            if (r0 == 0) goto L_0x009c
            com.appsflyer.internal.am r1 = new com.appsflyer.internal.am
            r1.<init>(r0, r3, r7)
            return r1
        L_0x009c:
            int r0 = onAppOpenAttribution
            int r0 = r0 + 107
            int r1 = r0 % 128
            onResponseNative = r1
            int r0 = r0 % r11
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r9 = 1
        L_0x00a9:
            if (r9 == r10) goto L_0x00af
            int r0 = r2.length     // Catch:{ all -> 0x00ad }
            return r2
        L_0x00ad:
            r0 = move-exception
            throw r0
        L_0x00af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0547cd.onInstallConversionDataLoadedNative():com.appsflyer.internal.am");
    }

    private void values(C0489am amVar) {
        int i = onAppOpenAttribution + 3;
        onResponseNative = i % 128;
        int i2 = i % 2;
        this.onInstallConversionDataLoadedNative.edit().putString("afUninstallToken", amVar.AFInAppEventType).putLong("afUninstallToken_received_time", amVar.AFKeystoreWrapper).putBoolean("afUninstallToken_queued", amVar.values()).apply();
        int i3 = onAppOpenAttribution + 21;
        onResponseNative = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private void AFKeystoreWrapper(String str) {
        Application application = this.AFKeystoreWrapper;
        final C0458ac AFInAppEventParameterName = C0458ac.AFInAppEventParameterName();
        if (AFInAppEventParameterName.AFKeystoreWrapper()) {
            int i = onAppOpenAttribution + 73;
            onResponseNative = i % 128;
            int i2 = i % 2;
            AFLogger.values("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null) {
            int i3 = onResponseNative + 91;
            onAppOpenAttribution = i3 % 128;
            if (i3 % 2 != 0) {
                AFLogger.AppsFlyer2dXConversionCallback("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            AFLogger.AppsFlyer2dXConversionCallback("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        boolean z = false;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.AFInAppEventType.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.AFInAppEventType.put("app_version_name", packageInfo.versionName);
            this.AFInAppEventType.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            this.AFInAppEventType.put("installDate", C0458ac.valueOf(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.valueOf("Exception while collecting application version info.", th);
        }
        C0458ac.AFInAppEventType((Context) application, (Map<String, ? super String>) this.AFInAppEventType);
        String AFInAppEventType = C0458ac.AFInAppEventType();
        if (AFInAppEventType != null) {
            int i4 = onAppOpenAttribution + 29;
            onResponseNative = i4 % 128;
            if (i4 % 2 == 0) {
                this.AFInAppEventType.put("appUserId", AFInAppEventType);
                int i5 = 80 / 0;
            } else {
                this.AFInAppEventType.put("appUserId", AFInAppEventType);
            }
        }
        try {
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put(AFKeystoreWrapper((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, (byte) (95 - TextUtils.lastIndexOf("", '0')), "\u0001\u0002\u0000\u0005Ä").intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.valueOf("Exception while collecting device brand and model.", th2);
        }
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) ? (char) 9 : 29) != 29) {
            this.AFInAppEventType.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            int i6 = onResponseNative + 93;
            onAppOpenAttribution = i6 % 128;
            int i7 = i6 % 2;
        }
        C0602g AFInAppEventType2 = C0457ab.AFInAppEventType(application.getContentResolver());
        if ((AFInAppEventType2 != null ? 2 : 'F') != 'F') {
            this.AFInAppEventType.put("amazon_aid", AFInAppEventType2.values);
            this.AFInAppEventType.put("amazon_aid_limit", String.valueOf(AFInAppEventType2.AFKeystoreWrapper));
            int i8 = onResponseNative + 25;
            onAppOpenAttribution = i8 % 128;
            int i9 = i8 % 2;
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            this.AFInAppEventType.put("advertiserId", string);
        }
        this.AFInAppEventType.put("devkey", devKey);
        this.AFInAppEventType.put("uid", C0473af.valueOf(new WeakReference(application)));
        this.AFInAppEventType.put("af_gcm_token", str);
        this.AFInAppEventType.put("launch_counter", Integer.toString(AFInAppEventParameterName.valueOf(this.onInstallConversionDataLoadedNative, false)));
        this.AFInAppEventType.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        String AFInAppEventParameterName2 = AFInAppEventParameterName.AFInAppEventParameterName((Context) application);
        if (AFInAppEventParameterName2 != null) {
            z = true;
        }
        if (z) {
            this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName2);
        }
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C0547cd cdVar = C0547cd.this;
                    cdVar.onConversionDataSuccess = AFInAppEventParameterName.isStopped();
                    HttpURLConnection values2 = new C0490an.C0491c(cdVar).values();
                    if (values2 != null) {
                        if (values2.getResponseCode() == 200) {
                            C0547cd.valueOf(C0547cd.this);
                        }
                        values2.disconnect();
                    }
                } catch (Throwable th) {
                    AFLogger.valueOf(th.getMessage(), th);
                }
            }
        }).start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(int r8, byte r9, java.lang.String r10) {
        /*
            if (r10 == 0) goto L_0x0006
            char[] r10 = r10.toCharArray()
        L_0x0006:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.appsflyer.internal.C0594do.AFVersionDeclaration
            monitor-enter(r0)
            char[] r1 = onResponseErrorNative     // Catch:{ all -> 0x00eb }
            char r2 = onConversionDataFail     // Catch:{ all -> 0x00eb }
            char[] r3 = new char[r8]     // Catch:{ all -> 0x00eb }
            int r4 = r8 % 2
            if (r4 == 0) goto L_0x001d
            int r8 = r8 + -1
            char r4 = r10[r8]     // Catch:{ all -> 0x00eb }
            int r4 = r4 - r9
            char r4 = (char) r4     // Catch:{ all -> 0x00eb }
            r3[r8] = r4     // Catch:{ all -> 0x00eb }
        L_0x001d:
            r4 = 1
            if (r8 <= r4) goto L_0x00e4
            r5 = 0
            com.appsflyer.internal.C0594do.values = r5     // Catch:{ all -> 0x00eb }
        L_0x0023:
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            if (r5 >= r8) goto L_0x00e4
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            char r5 = r10[r5]     // Catch:{ all -> 0x00eb }
            com.appsflyer.internal.C0594do.AFInAppEventType = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r4
            char r5 = r10[r5]     // Catch:{ all -> 0x00eb }
            com.appsflyer.internal.C0594do.valueOf = r5     // Catch:{ all -> 0x00eb }
            char r5 = com.appsflyer.internal.C0594do.AFInAppEventType     // Catch:{ all -> 0x00eb }
            char r6 = com.appsflyer.internal.C0594do.valueOf     // Catch:{ all -> 0x00eb }
            if (r5 != r6) goto L_0x004d
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            char r6 = com.appsflyer.internal.C0594do.AFInAppEventType     // Catch:{ all -> 0x00eb }
            int r6 = r6 - r9
            char r6 = (char) r6     // Catch:{ all -> 0x00eb }
            r3[r5] = r6     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r4
            char r6 = com.appsflyer.internal.C0594do.valueOf     // Catch:{ all -> 0x00eb }
            int r6 = r6 - r9
            char r6 = (char) r6     // Catch:{ all -> 0x00eb }
            r3[r5] = r6     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x004d:
            char r5 = com.appsflyer.internal.C0594do.AFInAppEventType     // Catch:{ all -> 0x00eb }
            int r5 = r5 / r2
            com.appsflyer.internal.C0594do.AFKeystoreWrapper = r5     // Catch:{ all -> 0x00eb }
            char r5 = com.appsflyer.internal.C0594do.AFInAppEventType     // Catch:{ all -> 0x00eb }
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.init = r5     // Catch:{ all -> 0x00eb }
            char r5 = com.appsflyer.internal.C0594do.valueOf     // Catch:{ all -> 0x00eb }
            int r5 = r5 / r2
            com.appsflyer.internal.C0594do.AFInAppEventParameterName = r5     // Catch:{ all -> 0x00eb }
            char r5 = com.appsflyer.internal.C0594do.valueOf     // Catch:{ all -> 0x00eb }
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.getLevel = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.init     // Catch:{ all -> 0x00eb }
            int r6 = com.appsflyer.internal.C0594do.getLevel     // Catch:{ all -> 0x00eb }
            if (r5 != r6) goto L_0x0091
            int r5 = com.appsflyer.internal.C0594do.AFKeystoreWrapper     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.AFKeystoreWrapper = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.AFInAppEventParameterName     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.AFInAppEventParameterName = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.AFKeystoreWrapper     // Catch:{ all -> 0x00eb }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C0594do.init     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C0594do.AFInAppEventParameterName     // Catch:{ all -> 0x00eb }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C0594do.getLevel     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            char r5 = r1[r5]     // Catch:{ all -> 0x00eb }
            r3[r7] = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r4
            char r6 = r1[r6]     // Catch:{ all -> 0x00eb }
            r3[r5] = r6     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x0091:
            int r5 = com.appsflyer.internal.C0594do.AFKeystoreWrapper     // Catch:{ all -> 0x00eb }
            int r6 = com.appsflyer.internal.C0594do.AFInAppEventParameterName     // Catch:{ all -> 0x00eb }
            if (r5 != r6) goto L_0x00c1
            int r5 = com.appsflyer.internal.C0594do.init     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.init = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.getLevel     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C0594do.getLevel = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.AFKeystoreWrapper     // Catch:{ all -> 0x00eb }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C0594do.init     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C0594do.AFInAppEventParameterName     // Catch:{ all -> 0x00eb }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C0594do.getLevel     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            char r5 = r1[r5]     // Catch:{ all -> 0x00eb }
            r3[r7] = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r4
            char r6 = r1[r6]     // Catch:{ all -> 0x00eb }
            r3[r5] = r6     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x00c1:
            int r5 = com.appsflyer.internal.C0594do.AFKeystoreWrapper     // Catch:{ all -> 0x00eb }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C0594do.getLevel     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C0594do.AFInAppEventParameterName     // Catch:{ all -> 0x00eb }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C0594do.init     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            char r5 = r1[r5]     // Catch:{ all -> 0x00eb }
            r3[r7] = r5     // Catch:{ all -> 0x00eb }
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r4
            char r6 = r1[r6]     // Catch:{ all -> 0x00eb }
            r3[r5] = r6     // Catch:{ all -> 0x00eb }
        L_0x00dc:
            int r5 = com.appsflyer.internal.C0594do.values     // Catch:{ all -> 0x00eb }
            int r5 = r5 + 2
            com.appsflyer.internal.C0594do.values = r5     // Catch:{ all -> 0x00eb }
            goto L_0x0023
        L_0x00e4:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00eb }
            r8.<init>(r3)     // Catch:{ all -> 0x00eb }
            monitor-exit(r0)     // Catch:{ all -> 0x00eb }
            return r8
        L_0x00eb:
            r8 = move-exception
            monitor-exit(r0)
            goto L_0x00ef
        L_0x00ee:
            throw r8
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0547cd.AFKeystoreWrapper(int, byte, java.lang.String):java.lang.String");
    }
}
