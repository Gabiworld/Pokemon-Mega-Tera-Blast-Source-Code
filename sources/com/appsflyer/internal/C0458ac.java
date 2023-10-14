package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C0450a;
import com.appsflyer.internal.C0475ah;
import com.appsflyer.internal.C0490an;
import com.appsflyer.internal.C0494aq;
import com.appsflyer.internal.C0580dd;
import com.appsflyer.internal.C0611l;
import com.appsflyer.internal.C0618v;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ac */
public final class C0458ac extends AppsFlyerLib {
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    public static final String AFInAppEventType;
    public static AppsFlyerConversionListener AFKeystoreWrapper = null;
    private static String AFLogger$LogLevel = "https://%sstats.%s/stats";
    private static long enableLocationCollection = 0;
    private static String onAppOpenAttributionNative = null;
    private static String onAttributionFailureNative = null;
    private static C0458ac onConversionDataFail = new C0458ac();
    private static String onDeepLinkingNative = null;
    private static final String onInstallConversionDataLoadedNative;
    private static String onInstallConversionFailureNative = null;
    private static String onResponseErrorNative = null;
    private static int setCustomerIdAndLogSession = 1;
    static final String valueOf = "168";
    public static final String values;
    private static int waitForCustomerUserId;
    long AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    private boolean AppsFlyerConversionListener = false;
    private boolean AppsFlyerInAppPurchaseValidatorListener;
    private boolean AppsFlyerLib;
    private boolean getInstance = false;
    public C0629y getLevel;
    private SharedPreferences getSdkVersion;
    String init;
    private long onAppOpenAttribution = -1;
    @Deprecated
    private ScheduledExecutorService onAttributionFailure = null;
    private long onConversionDataSuccess = TimeUnit.SECONDS.toMillis(5);
    private String onDeepLinking;
    private String onPause;
    private Map<Long, String> onResponse;
    private boolean onResponseError = false;
    private long onResponseNative = -1;
    private boolean onValidateInApp = false;
    private final C0485al onValidateInAppFailure = new C0485al();
    private C0578dc setAndroidIdData;
    private final C0518bf setCustomerUserId;
    private boolean setDebugLog = false;
    private C0512az setImeiData;
    private final Executor setOaidData = Executors.newSingleThreadExecutor();
    private Application stop;
    private Map<String, Object> updateServerUninstallToken;

    static void AFVersionDeclaration() {
        enableLocationCollection = -8666534478441341805L;
    }

    static /* synthetic */ Application AFInAppEventParameterName(C0458ac acVar) {
        int i = waitForCustomerUserId + 41;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        Application application = acVar.stop;
        int i4 = i2 + 37;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
        return application;
    }

    static /* synthetic */ ScheduledExecutorService AFInAppEventParameterName(C0458ac acVar, ScheduledExecutorService scheduledExecutorService) {
        int i = waitForCustomerUserId + 37;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        acVar.onAttributionFailure = scheduledExecutorService;
        int i4 = i2 + 47;
        waitForCustomerUserId = i4 % 128;
        if (i4 % 2 == 0) {
            return scheduledExecutorService;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return scheduledExecutorService;
    }

    static /* synthetic */ void AFInAppEventParameterName(C0458ac acVar, C0607i iVar) {
        int i = setCustomerIdAndLogSession + 83;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        acVar.valueOf(iVar);
        int i3 = setCustomerIdAndLogSession + 37;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? 'I' : 22) == 'I') {
            int i4 = 26 / 0;
        }
    }

    static /* synthetic */ boolean AFInAppEventParameterName(C0458ac acVar, C0607i iVar, SharedPreferences sharedPreferences) {
        int i = waitForCustomerUserId + 33;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 != 0;
        boolean valueOf2 = acVar.valueOf(iVar, sharedPreferences);
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
        return valueOf2;
    }

    static /* synthetic */ void AFInAppEventType(C0458ac acVar, C0607i iVar) throws IOException {
        int i = waitForCustomerUserId + 59;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        acVar.AFInAppEventParameterName(iVar);
        int i3 = waitForCustomerUserId + 67;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 28 : 30) == 28) {
            int i4 = 28 / 0;
        }
    }

    static /* synthetic */ boolean AFInAppEventType(C0458ac acVar) {
        int i = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i % 128;
        char c = i % 2 == 0 ? '6' : 20;
        boolean z = acVar.onResponseError;
        if (c == '6') {
            Object obj = null;
            super.hashCode();
        }
        int i2 = waitForCustomerUserId + 43;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    static /* synthetic */ Map AFKeystoreWrapper(C0458ac acVar) {
        int i = waitForCustomerUserId + 67;
        setCustomerIdAndLogSession = i % 128;
        char c = i % 2 == 0 ? 18 : '-';
        Map<String, Object> map = acVar.updateServerUninstallToken;
        if (c != '-') {
            int i2 = 72 / 0;
        }
        return map;
    }

    static /* synthetic */ ScheduledExecutorService getLevel(C0458ac acVar) {
        int i = waitForCustomerUserId;
        int i2 = i + 65;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        ScheduledExecutorService scheduledExecutorService = acVar.onAttributionFailure;
        int i4 = i + 3;
        setCustomerIdAndLogSession = i4 % 128;
        if ((i4 % 2 == 0 ? '\\' : 'c') != '\\') {
            return scheduledExecutorService;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return scheduledExecutorService;
    }

    static /* synthetic */ C0578dc valueOf(C0458ac acVar) {
        int i = setCustomerIdAndLogSession + 19;
        waitForCustomerUserId = i % 128;
        boolean z = i % 2 != 0;
        C0578dc dcVar = acVar.setAndroidIdData;
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        return dcVar;
    }

    static /* synthetic */ C0518bf values(C0458ac acVar) {
        int i = setCustomerIdAndLogSession + 99;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        C0518bf bfVar = acVar.setCustomerUserId;
        int i4 = i2 + 117;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return bfVar;
    }

    static /* synthetic */ boolean values(C0458ac acVar, boolean z) {
        int i = waitForCustomerUserId;
        int i2 = i + 25;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        acVar.onResponseError = z;
        int i4 = i + 5;
        setCustomerIdAndLogSession = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return z;
        }
        int i5 = 31 / 0;
        return z;
    }

    static {
        AFVersionDeclaration();
        String substring = "6.5.3".substring(0, "6.5.3".lastIndexOf(values("Ჽ", View.MeasureSpec.makeMeasureSpec(0, 0) + 28643).intern()));
        AFInAppEventType = substring;
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.5.3&app_id=");
        values = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(substring);
        sb2.append("/android?buildnumber=6.5.3&app_id=");
        onInstallConversionFailureNative = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        onInstallConversionDataLoadedNative = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        onDeepLinkingNative = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        onAppOpenAttributionNative = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        onAttributionFailureNative = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        onResponseErrorNative = sb7.toString();
        int i = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
    }

    public final C0519bg values() {
        int i = setCustomerIdAndLogSession + 73;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 31 : 'N') != 31) {
            return this.setCustomerUserId;
        }
        int i2 = 85 / 0;
        return this.setCustomerUserId;
    }

    public C0458ac() {
        AFVersionDeclaration.init();
        this.setCustomerUserId = new C0518bf();
    }

    public static C0458ac AFInAppEventParameterName() {
        C0458ac acVar;
        int i = setCustomerIdAndLogSession + 17;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? ':' : Typography.amp) != ':') {
            acVar = onConversionDataFail;
        } else {
            acVar = onConversionDataFail;
            Object obj = null;
            super.hashCode();
        }
        int i2 = waitForCustomerUserId + 81;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 != 0) {
            return acVar;
        }
        int i3 = 28 / 0;
        return acVar;
    }

    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = waitForCustomerUserId + 99;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        if ((uri != null ? 8 : '(') != '(') {
            int i4 = i2 + 109;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(context);
                    sb.append("\"");
                    C0492ao.AFInAppEventType(sb.toString(), DeepLinkResult.Error.NETWORK);
                    int i6 = waitForCustomerUserId + 75;
                    setCustomerIdAndLogSession = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                C0600f.valueOf().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        C0492ao.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = waitForCustomerUserId + 81;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners(strArr);
        int i3 = waitForCustomerUserId + 113;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = setCustomerIdAndLogSession + 17;
        waitForCustomerUserId = i % 128;
        boolean z = false;
        if (i % 2 != 0) {
            String[] strArr = new String[1];
            strArr[1] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i2 = waitForCustomerUserId + 73;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void setSharingFilterForPartners(String... strArr) {
        this.getLevel = new C0629y(strArr);
        int i = waitForCustomerUserId + 87;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
    }

    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 11 : 'A') != 11) {
            C0600f valueOf2 = C0600f.valueOf();
            valueOf2.AFVersionDeclaration = str;
            valueOf2.getLevel = map;
        } else {
            C0600f valueOf3 = C0600f.valueOf();
            valueOf3.AFVersionDeclaration = str;
            valueOf3.getLevel = map;
            Object obj = null;
            super.hashCode();
        }
        int i2 = setCustomerIdAndLogSession + 27;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = waitForCustomerUserId + 35;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '?' : 'E') != 'E') {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3));
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3));
        }
        int i2 = waitForCustomerUserId + 47;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = setCustomerIdAndLogSession + 33;
        waitForCustomerUserId = i % 128;
        if (i % 2 == 0) {
            C0600f.valueOf().values = deepLinkListener;
            C0496ar.onInstallConversionDataLoadedNative = j;
            return;
        }
        C0600f.valueOf().values = deepLinkListener;
        C0496ar.onInstallConversionDataLoadedNative = j;
        Object[] objArr = null;
        int length = objArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r5 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r2 == true) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r5 = r5.getApplicationContext();
        r2 = r3.setCustomerUserId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r5 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r0 = r2.AFKeystoreWrapper;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r5 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0.values = r5.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r0 = values().getLevel();
        r3.setOaidData.execute(new com.appsflyer.internal.C0458ac.C04634(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        com.appsflyer.internal.C0492ao.AFInAppEventType("performOnDeepLinking was called with null context", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
        r4 = setCustomerIdAndLogSession + 57;
        waitForCustomerUserId = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if ((r4 % 2) == 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4 = r4.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if ((r4 == null ? ' ' : ',') != ',') goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void performOnDeepLinking(final android.content.Intent r4, android.content.Context r5) {
        /*
            r3 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 99
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x001d
            r0 = 7
            int r0 = r0 / r1
            r0 = 44
            if (r4 != 0) goto L_0x0016
            r2 = 32
            goto L_0x0018
        L_0x0016:
            r2 = 44
        L_0x0018:
            if (r2 == r0) goto L_0x0027
            goto L_0x001f
        L_0x001b:
            r4 = move-exception
            throw r4
        L_0x001d:
            if (r4 != 0) goto L_0x0027
        L_0x001f:
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            java.lang.String r5 = "performOnDeepLinking was called with null intent"
            com.appsflyer.internal.C0492ao.AFInAppEventType(r5, r4)
            return
        L_0x0027:
            r0 = 1
            if (r5 != 0) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 == r0) goto L_0x0057
            android.content.Context r5 = r5.getApplicationContext()
            com.appsflyer.internal.bf r2 = r3.setCustomerUserId
            if (r5 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x0044
            com.appsflyer.internal.be r0 = r2.AFKeystoreWrapper
            if (r5 == 0) goto L_0x0044
            android.content.Context r1 = r5.getApplicationContext()
            r0.values = r1
        L_0x0044:
            com.appsflyer.internal.bg r0 = r3.values()
            com.appsflyer.internal.cl r0 = r0.getLevel()
            java.util.concurrent.Executor r1 = r3.setOaidData
            com.appsflyer.internal.ac$4 r2 = new com.appsflyer.internal.ac$4
            r2.<init>(r4, r5, r0)
            r1.execute(r2)
            return
        L_0x0057:
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            java.lang.String r5 = "performOnDeepLinking was called with null context"
            com.appsflyer.internal.C0492ao.AFInAppEventType(r5, r4)
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 57
            int r5 = r4 % 128
            waitForCustomerUserId = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x006f
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r4 = move-exception
            throw r4
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.performOnDeepLinking(android.content.Intent, android.content.Context):void");
    }

    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = waitForCustomerUserId + 47;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        List asList = Arrays.asList(strArr);
        List<List<String>> list = C0600f.valueOf().init;
        if ((!list.contains(asList) ? 'V' : 'c') == 'V') {
            int i3 = waitForCustomerUserId + 57;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            list.add(asList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ((r4 % 2 != 0 ? 'X' : 'N') != 'X') goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDisableAdvertisingIdentifiers(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "setDisableAdvertisingIdentifiers: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 == 0) goto L_0x002c
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 15
            int r2 = r4 % 128
            waitForCustomerUserId = r2
            int r4 = r4 % 2
            r2 = 88
            if (r4 == 0) goto L_0x0027
            r4 = 88
            goto L_0x0029
        L_0x0027:
            r4 = 78
        L_0x0029:
            if (r4 == r2) goto L_0x0036
            goto L_0x0037
        L_0x002c:
            int r4 = waitForCustomerUserId
            int r4 = r4 + 27
            int r0 = r4 % 128
            setCustomerIdAndLogSession = r0
            int r4 = r4 % 2
        L_0x0036:
            r0 = 0
        L_0x0037:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.appsflyer.internal.C0457ab.AFInAppEventType = r4
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "advertiserIdEnabled"
            r4.remove(r0)
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "advertiserId"
            r4.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.setDisableAdvertisingIdentifiers(boolean):void");
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        int i = waitForCustomerUserId + 59;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (!(intent.getStringExtra("appsflyer_preinstall") == null)) {
            AFInAppEventType(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.values("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.values("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if ((stringExtra != null ? 23 : 'Q') != 'Q') {
            valueOf(context, "referrer", stringExtra);
            AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            instance.set("AF_REFERRER", stringExtra);
            instance.valueOf = stringExtra;
            if (AppsFlyerProperties.getInstance().values()) {
                z = true;
            }
            if (z) {
                int i3 = waitForCustomerUserId + 73;
                setCustomerIdAndLogSession = i3 % 128;
                if (i3 % 2 == 0) {
                    AFLogger.values("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, C0552ch.onReceive);
                    AFInAppEventType(context, stringExtra);
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    AFLogger.values("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, C0552ch.onReceive);
                    AFInAppEventType(context, stringExtra);
                }
                int i4 = setCustomerIdAndLogSession + 55;
                waitForCustomerUserId = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void valueOf(org.json.JSONObject r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r14.keys()
        L_0x0009:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0047 }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0047 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x0047 }
            int r2 = setCustomerIdAndLogSession
            int r2 = r2 + 63
            int r6 = r2 % 128
            waitForCustomerUserId = r6
            int r2 = r2 % 2
            r2 = 0
        L_0x002d:
            int r6 = r5.length()     // Catch:{ JSONException -> 0x0047 }
            if (r2 >= r6) goto L_0x0035
            r6 = 0
            goto L_0x0036
        L_0x0035:
            r6 = 1
        L_0x0036:
            if (r6 == 0) goto L_0x0039
            goto L_0x0009
        L_0x0039:
            long r6 = r5.getLong(r2)     // Catch:{ JSONException -> 0x0047 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ JSONException -> 0x0047 }
            r0.add(r6)     // Catch:{ JSONException -> 0x0047 }
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0047:
            goto L_0x0009
        L_0x0049:
            java.util.Collections.sort(r0)
            java.util.Iterator r1 = r14.keys()
            r2 = 0
        L_0x0051:
            r5 = r2
        L_0x0052:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00d2
            if (r5 != 0) goto L_0x00d2
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Object r8 = r14.get(r6)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x00d0 }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x00d0 }
            r8 = 0
        L_0x006c:
            int r9 = r7.length()     // Catch:{ JSONException -> 0x00d0 }
            r10 = 89
            if (r8 >= r9) goto L_0x0077
            r9 = 89
            goto L_0x0079
        L_0x0077:
            r9 = 74
        L_0x0079:
            if (r9 == r10) goto L_0x0086
            int r6 = waitForCustomerUserId
            int r6 = r6 + 91
            int r7 = r6 % 128
            setCustomerIdAndLogSession = r7
            int r6 = r6 % 2
            goto L_0x0052
        L_0x0086:
            int r9 = setCustomerIdAndLogSession
            int r9 = r9 + 7
            int r10 = r9 % 128
            waitForCustomerUserId = r10
            int r9 = r9 % 2
            long r9 = r7.getLong(r8)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Object r11 = r0.get(r3)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ JSONException -> 0x00d0 }
            long r11 = r11.longValue()     // Catch:{ JSONException -> 0x00d0 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0051
            long r9 = r7.getLong(r8)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Object r11 = r0.get(r4)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ JSONException -> 0x00d0 }
            long r11 = r11.longValue()     // Catch:{ JSONException -> 0x00d0 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0051
            long r9 = r7.getLong(r8)     // Catch:{ JSONException -> 0x00d0 }
            int r11 = r0.size()     // Catch:{ JSONException -> 0x00d0 }
            int r11 = r11 - r4
            java.lang.Object r11 = r0.get(r11)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ JSONException -> 0x00d0 }
            long r11 = r11.longValue()     // Catch:{ JSONException -> 0x00d0 }
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x00cc
            goto L_0x0051
        L_0x00cc:
            int r8 = r8 + 1
            r5 = r6
            goto L_0x006c
        L_0x00d0:
            goto L_0x0052
        L_0x00d2:
            if (r5 == 0) goto L_0x00e7
            int r0 = waitForCustomerUserId
            int r0 = r0 + 27
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r14.remove(r5)
            if (r0 != 0) goto L_0x00e7
            int r14 = r2.length     // Catch:{ all -> 0x00e5 }
            goto L_0x00e7
        L_0x00e5:
            r14 = move-exception
            throw r14
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.valueOf(org.json.JSONObject):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = new org.json.JSONObject(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r3.has(r15) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r2 = new org.json.JSONArray((java.lang.String) r3.get(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r2 = new org.json.JSONArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r12 = r3;
        r3 = r2;
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void valueOf(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 95
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 37
            if (r0 == 0) goto L_0x0011
            r0 = 37
            goto L_0x0013
        L_0x0011:
            r0 = 98
        L_0x0013:
            java.lang.String r2 = "received a new (extra) referrer: "
            r3 = 0
            java.lang.String r4 = "extraReferrers"
            if (r0 == r1) goto L_0x0034
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            android.content.SharedPreferences r2 = AFInAppEventType((android.content.Context) r14)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            java.lang.String r2 = r2.getString(r4, r3)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            if (r2 != 0) goto L_0x0063
            goto L_0x004e
        L_0x0034:
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            android.content.SharedPreferences r2 = AFInAppEventType((android.content.Context) r14)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            java.lang.String r2 = r2.getString(r4, r3)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            int r3 = r3.length     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            if (r2 != 0) goto L_0x0063
        L_0x004e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r2.<init>()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r3.<init>()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            int r5 = waitForCustomerUserId
            int r5 = r5 + 93
            int r6 = r5 % 128
            setCustomerIdAndLogSession = r6
            int r5 = r5 % 2
            goto L_0x0082
        L_0x0063:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            boolean r2 = r3.has(r15)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            if (r2 == 0) goto L_0x007a
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            java.lang.Object r5 = r3.get(r15)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            goto L_0x007f
        L_0x007a:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r2.<init>()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
        L_0x007f:
            r12 = r3
            r3 = r2
            r2 = r12
        L_0x0082:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            long r5 = (long) r5     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r7 = 5
            r9 = 89
            r10 = 11
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0094
            r5 = 89
            goto L_0x0096
        L_0x0094:
            r5 = 11
        L_0x0096:
            if (r5 == r9) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r3.put(r0)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
        L_0x009c:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            long r0 = (long) r0
            r5 = 4
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00b3
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + r10
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            valueOf((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
        L_0x00b3:
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            r2.put(r15, r0)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            valueOf((android.content.Context) r14, (java.lang.String) r4, (java.lang.String) r0)     // Catch:{ JSONException -> 0x00d9, all -> 0x00c2 }
            return
        L_0x00c2:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't save referrer - "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = ": "
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.appsflyer.AFLogger.valueOf(r15, r14)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.valueOf(android.content.Context, java.lang.String):void");
    }

    private static void AFInAppEventType(SharedPreferences.Editor editor) {
        int i = setCustomerIdAndLogSession + 105;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        editor.apply();
        int i3 = waitForCustomerUserId + 89;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? 20 : 'T') != 'T') {
            int i4 = 13 / 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stop(boolean r6, android.content.Context r7) {
        /*
            r5 = this;
            r5.getInstance = r6
            com.appsflyer.internal.bg r6 = r5.values()
            com.appsflyer.internal.l r6 = r6.AFVersionDeclaration()
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0093 }
            com.appsflyer.internal.be r6 = r6.AFKeystoreWrapper     // Catch:{ Exception -> 0x0093 }
            android.content.Context r6 = r6.values     // Catch:{ Exception -> 0x0093 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = "AFRequestCache"
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0093 }
            boolean r6 = r0.exists()     // Catch:{ Exception -> 0x0093 }
            r1 = 0
            if (r6 != 0) goto L_0x0022
            r6 = 0
            goto L_0x0023
        L_0x0022:
            r6 = 1
        L_0x0023:
            if (r6 == 0) goto L_0x0070
            java.io.File[] r6 = r0.listFiles()     // Catch:{ Exception -> 0x0093 }
            if (r6 != 0) goto L_0x0036
            int r6 = setCustomerIdAndLogSession
            int r6 = r6 + 125
            int r0 = r6 % 128
            waitForCustomerUserId = r0
            int r6 = r6 % 2
            goto L_0x0099
        L_0x0036:
            int r0 = r6.length     // Catch:{ Exception -> 0x0093 }
        L_0x0037:
            if (r1 >= r0) goto L_0x0099
            r2 = r6[r1]     // Catch:{ Exception -> 0x0093 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = "CACHE: Found cached request"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = r2.getName()     // Catch:{ Exception -> 0x0093 }
            r3.append(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0093 }
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ Exception -> 0x0093 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = "CACHE: Deleting "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = r2.getName()     // Catch:{ Exception -> 0x0093 }
            r3.append(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = " from cache"
            r3.append(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0093 }
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ Exception -> 0x0093 }
            r2.delete()     // Catch:{ Exception -> 0x0093 }
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0070:
            int r6 = setCustomerIdAndLogSession
            int r6 = r6 + 31
            int r1 = r6 % 128
            waitForCustomerUserId = r1
            int r6 = r6 % 2
            r1 = 12
            if (r6 == 0) goto L_0x0081
            r6 = 12
            goto L_0x0083
        L_0x0081:
            r6 = 35
        L_0x0083:
            if (r6 == r1) goto L_0x0089
            r0.mkdir()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0099
        L_0x0089:
            r0.mkdir()     // Catch:{ Exception -> 0x0093 }
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x0091 }
            goto L_0x0099
        L_0x0091:
            r6 = move-exception
            throw r6
        L_0x0093:
            r6 = move-exception
            java.lang.String r0 = "CACHE: Could not cache request"
            com.appsflyer.AFLogger.valueOf(r0, r6)
        L_0x0099:
            boolean r6 = r5.getInstance
            if (r6 == 0) goto L_0x00a2
            java.lang.String r6 = "is_stop_tracking_used"
            values((android.content.Context) r7, (java.lang.String) r6)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.stop(boolean, android.content.Context):void");
    }

    public final String getSdkVersion() {
        C0484ak.AFInAppEventType().AFKeystoreWrapper("getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.5.3 (build ");
        sb.append(valueOf);
        sb.append(")");
        String obj = sb.toString();
        int i = setCustomerIdAndLogSession + 43;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 != 0)) {
            return obj;
        }
        int i2 = 46 / 0;
        return obj;
    }

    public final void onPause(Context context) {
        int i = setCustomerIdAndLogSession + 79;
        waitForCustomerUserId = i % 128;
        if (i % 2 != 0) {
            C0475ah.C0481e eVar = C0475ah.AFInAppEventParameterName;
            Object[] objArr = null;
            int length = objArr.length;
            if ((eVar != null ? '\'' : 'V') == 'V') {
                return;
            }
        } else if (C0475ah.AFInAppEventParameterName == null) {
            return;
        }
        C0475ah.AFInAppEventParameterName.valueOf(context);
        int i2 = waitForCustomerUserId + 113;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void updateServerUninstallToken(Context context, String str) {
        new C0547cd(context).AFInAppEventParameterName(str);
        int i = waitForCustomerUserId + 69;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        if ((z ? '1' : ']') != ']') {
            int i = setCustomerIdAndLogSession + 95;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
        int i3 = waitForCustomerUserId + 13;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setImeiData(String str) {
        int i = setCustomerIdAndLogSession + 29;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        boolean z = false;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setImeiData", str);
        this.AppsFlyer2dXConversionCallback = str;
        int i3 = setCustomerIdAndLogSession + 125;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void setOaidData(String str) {
        int i = setCustomerIdAndLogSession + 7;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 'J' : '[') != 'J') {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setOaidData", str);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setOaidData", str);
        }
        C0457ab.AFInAppEventParameterName = str;
    }

    public final void setAndroidIdData(String str) {
        int i = waitForCustomerUserId + 63;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        }
        this.init = str;
    }

    public final AppsFlyerLib enableLocationCollection(boolean z) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 73;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        this.AppsFlyerConversionListener = z;
        int i4 = i + 1;
        waitForCustomerUserId = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return this;
        }
        Object obj = null;
        super.hashCode();
        return this;
    }

    public static void valueOf(Context context, String str, String str2) {
        int i = waitForCustomerUserId + 51;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '-' : '\'') != '\'') {
            SharedPreferences.Editor edit = AFInAppEventType(context).edit();
            edit.putString(str, str2);
            AFInAppEventType(edit);
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            SharedPreferences.Editor edit2 = AFInAppEventType(context).edit();
            edit2.putString(str, str2);
            AFInAppEventType(edit2);
        }
        int i2 = setCustomerIdAndLogSession + 3;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void values(Context context, String str) {
        SharedPreferences.Editor edit;
        boolean z;
        int i = setCustomerIdAndLogSession + 65;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? '%' : 'c') != 'c') {
            edit = AFInAppEventType(context).edit();
            z = false;
        } else {
            edit = AFInAppEventType(context).edit();
            z = true;
        }
        edit.putBoolean(str, z);
        AFInAppEventType(edit);
    }

    private static void valueOf(Context context, String str, int i) {
        int i2 = setCustomerIdAndLogSession + 79;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor edit = AFInAppEventType(context).edit();
        edit.putInt(str, i);
        AFInAppEventType(edit);
        int i4 = setCustomerIdAndLogSession + 25;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AFInAppEventType(Context context, String str, long j) {
        int i = setCustomerIdAndLogSession + 67;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName(AFInAppEventType(context), str, j);
        int i3 = waitForCustomerUserId + 101;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 10 : 6) != 6) {
            Object obj = null;
            super.hashCode();
        }
    }

    private static void AFInAppEventParameterName(SharedPreferences sharedPreferences, String str, long j) {
        int i = waitForCustomerUserId + 5;
        setCustomerIdAndLogSession = i % 128;
        boolean z = false;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, j);
            AFInAppEventType(edit);
            int length = objArr.length;
        } else {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putLong(str, j);
            AFInAppEventType(edit2);
        }
        int i2 = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        }
        if (!z) {
            super.hashCode();
        }
    }

    private static void values(String str, String str2) {
        int i = waitForCustomerUserId + 75;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i3 = waitForCustomerUserId + 69;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? '9' : 7) != 7) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static void values(String str, boolean z) {
        int i = setCustomerIdAndLogSession + 89;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i3 = setCustomerIdAndLogSession + 13;
        waitForCustomerUserId = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 29 / 0;
        }
    }

    private static String AFInAppEventParameterName(String str) {
        String str2;
        int i = waitForCustomerUserId + 13;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            str2 = AppsFlyerProperties.getInstance().getString(str);
            int i2 = 46 / 0;
        } else {
            str2 = AppsFlyerProperties.getInstance().getString(str);
        }
        int i3 = waitForCustomerUserId + 85;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private static boolean AFKeystoreWrapper(String str, boolean z) {
        boolean z2;
        int i = setCustomerIdAndLogSession + 51;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 'E' : 'H') != 'H') {
            z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
        }
        int i2 = waitForCustomerUserId + 19;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        return z2;
    }

    public final boolean AFKeystoreWrapper() {
        int i = setCustomerIdAndLogSession + 115;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if (AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            if ((AFInAppEventType() == null ? 3 : '3') == 3) {
                int i3 = setCustomerIdAndLogSession + 113;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        int i5 = waitForCustomerUserId + 25;
        setCustomerIdAndLogSession = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final void waitForCustomerUserId(boolean z) {
        int i = waitForCustomerUserId + 45;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z2 = true;
        AFLogger.values("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i3 = waitForCustomerUserId + 111;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 == 0) {
            z2 = false;
        }
        if (!z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void setCustomerIdAndLogSession(String str, Context context) {
        if ((context != null ? ':' : Typography.less) == ':') {
            if (AFKeystoreWrapper()) {
                setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.values(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                AFInAppEventParameterName(context, C0552ch.setCustomerIdAndLogSession);
                String devKey = AppsFlyerProperties.getInstance().getDevKey();
                Object[] objArr = null;
                if ((referrer == null ? Typography.dollar : 'S') == '$') {
                    int i = setCustomerIdAndLogSession + 79;
                    int i2 = i % 128;
                    waitForCustomerUserId = i2;
                    if (i % 2 != 0) {
                        int length = objArr.length;
                    }
                    int i3 = i2 + 59;
                    setCustomerIdAndLogSession = i3 % 128;
                    int i4 = i3 % 2;
                    referrer = "";
                }
                String str2 = referrer;
                if ((context instanceof Activity ? '`' : '+') != '+') {
                    int i5 = waitForCustomerUserId + 87;
                    setCustomerIdAndLogSession = i5 % 128;
                    if ((i5 % 2 == 0 ? 'N' : '_') != 'N') {
                        ((Activity) context).getIntent();
                    } else {
                        ((Activity) context).getIntent();
                        super.hashCode();
                    }
                }
                AFInAppEventParameterName(context, devKey, (String) null, (Map<String, Object>) null, str2, (String) null);
                return;
            }
            setCustomerUserId(str);
            AFLogger.values("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String] */
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        ? r3 = 0;
        if ((string != null ? '5' : '1') != '1') {
            int i = setCustomerIdAndLogSession + 49;
            waitForCustomerUserId = i % 128;
            if (i % 2 == 0) {
                return string;
            }
            int length = r3.length;
            return string;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
        if (AFKeystoreWrapper2 != null) {
            int i2 = setCustomerIdAndLogSession + 57;
            waitForCustomerUserId = i2 % 128;
            int i3 = i2 % 2;
            return AFKeystoreWrapper2;
        }
        AFLogger.values("No out-of-store value set");
        return r3;
    }

    public final void setOutOfStore(String str) {
        int i = setCustomerIdAndLogSession + 123;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if (str == null) {
            AFLogger.valueOf("Cannot set setOutOfStore with null");
            return;
        }
        String lowerCase = str.toLowerCase();
        AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
        AFLogger.values("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i3 = setCustomerIdAndLogSession + 105;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if ((!r4.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) ? kotlin.text.Typography.dollar : '%') != '%') goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAppInviteOneLink(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 119
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            com.appsflyer.internal.ak r0 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "setAppInviteOneLink"
            r0.AFKeystoreWrapper(r2, r1)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "setAppInviteOneLink = "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.values((java.lang.String) r0)
            r0 = 96
            if (r4 == 0) goto L_0x002d
            r1 = 96
            goto L_0x002f
        L_0x002d:
            r1 = 65
        L_0x002f:
            java.lang.String r2 = "oneLinkSlug"
            if (r1 == r0) goto L_0x0034
            goto L_0x0055
        L_0x0034:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 59
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r2)
            boolean r0 = r4.equals(r0)
            r1 = 37
            if (r0 != 0) goto L_0x0051
            r0 = 36
            goto L_0x0053
        L_0x0051:
            r0 = 37
        L_0x0053:
            if (r0 == r1) goto L_0x0070
        L_0x0055:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkDomain"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkVersion"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkScheme"
            r0.remove(r1)
        L_0x0070:
            values((java.lang.String) r2, (java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.setAppInviteOneLink(java.lang.String):void");
    }

    public final void setAdditionalData(Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 37;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if (map != null) {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i3 = setCustomerIdAndLogSession + 111;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? '\\' : 'Z') == '\\') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            r3 = 71
            if (r17 == 0) goto L_0x000d
            r4 = 32
            goto L_0x000f
        L_0x000d:
            r4 = 71
        L_0x000f:
            java.lang.String r5 = "sendPushNotificationData"
            r6 = 0
            r7 = 1
            r8 = 2
            if (r4 == r3) goto L_0x0044
            android.content.Intent r3 = r17.getIntent()
            if (r3 == 0) goto L_0x0044
            com.appsflyer.internal.ak r3 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r9 = r17.getLocalClassName()
            r4[r6] = r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "activity_intent_"
            r6.<init>(r9)
            android.content.Intent r9 = r17.getIntent()
            java.lang.String r9 = r9.toString()
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4[r7] = r6
            r3.AFKeystoreWrapper(r5, r4)
            goto L_0x0075
        L_0x0044:
            if (r17 == 0) goto L_0x0048
            r3 = 0
            goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 == r7) goto L_0x005f
            com.appsflyer.internal.ak r3 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r9 = r17.getLocalClassName()
            r4[r6] = r9
            java.lang.String r6 = "activity_intent_null"
            r4[r7] = r6
            r3.AFKeystoreWrapper(r5, r4)
            goto L_0x0075
        L_0x005f:
            com.appsflyer.internal.ak r3 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String r4 = "activity_null"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.AFKeystoreWrapper(r5, r4)
            int r3 = setCustomerIdAndLogSession
            int r3 = r3 + 13
            int r4 = r3 % 128
            waitForCustomerUserId = r4
            int r3 = r3 % r8
        L_0x0075:
            java.lang.String r3 = AFInAppEventParameterName((android.app.Activity) r17)
            r1.onDeepLinking = r3
            r4 = 36
            if (r3 == 0) goto L_0x0082
            r3 = 36
            goto L_0x0084
        L_0x0082:
            r3 = 27
        L_0x0084:
            if (r3 == r4) goto L_0x0088
            goto L_0x01ab
        L_0x0088:
            long r3 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.onResponse
            java.lang.String r6 = ")"
            if (r5 != 0) goto L_0x00aa
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.values((java.lang.String) r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.onResponse = r0
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 43
            int r2 = r0 % 128
            waitForCustomerUserId = r2
            int r0 = r0 % r8
            r11 = r3
            goto L_0x016d
        L_0x00aa:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0152 }
            java.lang.String r7 = "pushPayloadMaxAging"
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            long r9 = r5.getLong(r7, r9)     // Catch:{ all -> 0x0152 }
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.onResponse     // Catch:{ all -> 0x0152 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0152 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0152 }
            r11 = r3
        L_0x00c2:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x016d
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0150 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0150 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x0150 }
            java.lang.String r14 = r1.onDeepLinking     // Catch:{ all -> 0x0150 }
            r13.<init>(r14)     // Catch:{ all -> 0x0150 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0150 }
            java.util.Map<java.lang.Long, java.lang.String> r15 = r1.onResponse     // Catch:{ all -> 0x0150 }
            java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0150 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0150 }
            r14.<init>(r15)     // Catch:{ all -> 0x0150 }
            java.lang.Object r15 = r13.opt(r2)     // Catch:{ all -> 0x0150 }
            java.lang.Object r8 = r14.opt(r2)     // Catch:{ all -> 0x0150 }
            boolean r8 = r15.equals(r8)     // Catch:{ all -> 0x0150 }
            if (r8 == 0) goto L_0x0128
            int r8 = setCustomerIdAndLogSession
            int r8 = r8 + 65
            int r15 = r8 % 128
            waitForCustomerUserId = r15
            r15 = 2
            int r8 = r8 % r15
            java.lang.Object r8 = r13.opt(r0)     // Catch:{ all -> 0x0150 }
            java.lang.Object r15 = r14.opt(r0)     // Catch:{ all -> 0x0150 }
            boolean r8 = r8.equals(r15)     // Catch:{ all -> 0x0150 }
            if (r8 == 0) goto L_0x0128
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x0150 }
            r0.append(r14)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x0150 }
            r0.append(r13)     // Catch:{ all -> 0x0150 }
            r0.append(r6)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0150 }
            com.appsflyer.AFLogger.values((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            r0 = 0
            r1.onDeepLinking = r0     // Catch:{ all -> 0x0150 }
            return
        L_0x0128:
            long r13 = r7.longValue()     // Catch:{ all -> 0x0150 }
            long r13 = r3 - r13
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0137
            java.util.Map<java.lang.Long, java.lang.String> r8 = r1.onResponse     // Catch:{ all -> 0x0150 }
            r8.remove(r7)     // Catch:{ all -> 0x0150 }
        L_0x0137:
            long r13 = r7.longValue()     // Catch:{ all -> 0x0150 }
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x0143
            long r11 = r7.longValue()     // Catch:{ all -> 0x0150 }
        L_0x0143:
            int r7 = setCustomerIdAndLogSession
            int r7 = r7 + 69
            int r8 = r7 % 128
            waitForCustomerUserId = r8
            r8 = 2
            int r7 = r7 % r8
            r8 = 2
            goto L_0x00c2
        L_0x0150:
            r0 = move-exception
            goto L_0x0154
        L_0x0152:
            r0 = move-exception
            r11 = r3
        L_0x0154:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while handling push notification measurement: "
            r2.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.valueOf(r2, r0)
        L_0x016d:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r5 = 2
            int r0 = r0.getInt(r2, r5)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.onResponse
            int r2 = r2.size()
            if (r2 != r0) goto L_0x019d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r11)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.values((java.lang.String) r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.onResponse
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0.remove(r2)
        L_0x019d:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.onResponse
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r1.onDeepLinking
            r0.put(r2, r3)
            r16.start(r17)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.sendPushNotificationData(android.app.Activity):void");
    }

    public final void setUserEmails(String... strArr) {
        int i = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        String str = null;
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i = waitForCustomerUserId + 89;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (!(i3 >= length)) {
                String str2 = strArr[i3];
                if (C04669.values[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(C0474ag.AFInAppEventParameterName(str2));
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
                i3++;
                int i4 = setCustomerIdAndLogSession + 123;
                waitForCustomerUserId = i4 % 128;
                int i5 = i4 % 2;
            } else {
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
                return;
            }
        }
    }

    public final void setCollectAndroidID(boolean z) {
        int i = setCustomerIdAndLogSession + 73;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 == 0)) {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectAndroidID", strArr);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        }
        values(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        values(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i2 = waitForCustomerUserId + 125;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setCollectIMEI(boolean z) {
        int i = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? ',' : Typography.quote) != '\"') {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectIMEI", strArr);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        }
        values(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        values(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i2 = waitForCustomerUserId + 9;
        setCustomerIdAndLogSession = i2 % 128;
        if ((i2 % 2 == 0 ? 'O' : '=') != '=') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = waitForCustomerUserId + 109;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z2 = false;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        values(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i3 = waitForCustomerUserId + 35;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 == 0) {
            z2 = true;
        }
        if (z2) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = waitForCustomerUserId + 27;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z = true;
        AFLogger.AFInAppEventParameterName(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        C0600f.AFKeystoreWrapper = strArr;
        int i3 = setCustomerIdAndLogSession + 109;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        }
        if (z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = setCustomerIdAndLogSession + 49;
        waitForCustomerUserId = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[0] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)});
        }
        AFLogger.AFInAppEventParameterName(str);
        C0600f.AFLogger$LogLevel = strArr;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.appsflyer.internal.bv, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r11 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r11 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.AppsFlyerLib init(java.lang.String r9, com.appsflyer.AppsFlyerConversionListener r10, android.content.Context r11) {
        /*
            r8 = this;
            boolean r0 = r8.AppsFlyerInAppPurchaseValidatorListener
            r1 = 6
            if (r0 == 0) goto L_0x0008
            r0 = 18
            goto L_0x0009
        L_0x0008:
            r0 = 6
        L_0x0009:
            r2 = 0
            r3 = 2
            if (r0 == r1) goto L_0x001f
            int r9 = setCustomerIdAndLogSession
            int r9 = r9 + 31
            int r10 = r9 % 128
            waitForCustomerUserId = r10
            int r9 = r9 % r3
            if (r9 == 0) goto L_0x001e
            super.hashCode()     // Catch:{ all -> 0x001c }
            return r8
        L_0x001c:
            r9 = move-exception
            throw r9
        L_0x001e:
            return r8
        L_0x001f:
            r0 = 1
            r8.AppsFlyerInAppPurchaseValidatorListener = r0
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.setDevKey(r9)
            com.appsflyer.internal.C0482ai.AFInAppEventType(r9)
            r1 = 0
            if (r11 == 0) goto L_0x00e1
            android.content.Context r4 = r11.getApplicationContext()
            android.app.Application r4 = (android.app.Application) r4
            r8.stop = r4
            com.appsflyer.internal.bf r4 = r8.setCustomerUserId
            if (r11 == 0) goto L_0x003d
            r5 = 0
            goto L_0x003e
        L_0x003d:
            r5 = 1
        L_0x003e:
            if (r5 == r0) goto L_0x005d
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 117
            int r6 = r5 % 128
            waitForCustomerUserId = r6
            int r5 = r5 % r3
            if (r5 == 0) goto L_0x0053
            com.appsflyer.internal.be r4 = r4.AFKeystoreWrapper
            int r5 = r2.length     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x005d
            goto L_0x0057
        L_0x0051:
            r9 = move-exception
            throw r9
        L_0x0053:
            com.appsflyer.internal.be r4 = r4.AFKeystoreWrapper
            if (r11 == 0) goto L_0x005d
        L_0x0057:
            android.content.Context r5 = r11.getApplicationContext()
            r4.values = r5
        L_0x005d:
            com.appsflyer.internal.bg r4 = r8.values()
            com.appsflyer.internal.cl r4 = r4.getLevel()
            long r5 = java.lang.System.currentTimeMillis()
            r4.AFInAppEventType = r5
            com.appsflyer.internal.bg r4 = r8.values()
            com.appsflyer.internal.by r4 = r4.values()
            r4.values(r2)
            com.appsflyer.internal.bg r2 = r8.values()
            com.appsflyer.internal.de r2 = r2.AFLogger$LogLevel()
            com.appsflyer.internal.cx r4 = new com.appsflyer.internal.cx
            com.appsflyer.internal.ac$1 r5 = new com.appsflyer.internal.ac$1
            r5.<init>()
            r4.<init>(r5)
            com.appsflyer.internal.ac$2 r5 = new com.appsflyer.internal.ac$2
            r5.<init>(r4)
            r2.AFKeystoreWrapper(r4)
            com.appsflyer.internal.cy r4 = new com.appsflyer.internal.cy
            r4.<init>(r5)
            r2.AFKeystoreWrapper(r4)
            com.appsflyer.internal.df r4 = new com.appsflyer.internal.df
            r4.<init>(r5)
            r2.AFKeystoreWrapper(r4)
            com.appsflyer.internal.dd[] r2 = r2.AFInAppEventType()
            int r4 = r2.length
            r5 = 0
        L_0x00a6:
            if (r5 >= r4) goto L_0x00b2
            r6 = r2[r5]
            android.app.Application r7 = r8.stop
            r6.AFInAppEventParameterName(r7)
            int r5 = r5 + 1
            goto L_0x00a6
        L_0x00b2:
            com.appsflyer.internal.bf r2 = r8.setCustomerUserId
            com.appsflyer.internal.ca r2 = r2.init()
            r2.values()
            android.app.Application r2 = r8.stop
            com.appsflyer.internal.C0511ay.AFInAppEventParameterName = r2
            android.content.SharedPreferences r2 = AFInAppEventType((android.content.Context) r11)
            int r2 = r8.valueOf((android.content.SharedPreferences) r2, (boolean) r1)
            if (r2 != 0) goto L_0x00e6
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r2 < r4) goto L_0x00e6
            com.appsflyer.internal.dc r2 = new com.appsflyer.internal.dc
            r2.<init>(r11)
            r8.setAndroidIdData = r2
            java.lang.Thread r11 = new java.lang.Thread
            java.util.concurrent.FutureTask<java.util.List<java.lang.String>> r2 = r2.AFInAppEventParameterName
            r11.<init>(r2)
            r11.start()
            goto L_0x00e6
        L_0x00e1:
            java.lang.String r11 = "context is null, Google Install Referrer will be not initialized"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r11)
        L_0x00e6:
            com.appsflyer.internal.ak r11 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r2 = new java.lang.String[r3]
            r2[r1] = r9
            if (r10 != 0) goto L_0x00f2
            r9 = 0
            goto L_0x00f4
        L_0x00f2:
            r9 = 35
        L_0x00f4:
            if (r9 == 0) goto L_0x00f9
            java.lang.String r9 = "conversionDataListener"
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r9 = "null"
        L_0x00fb:
            r2[r0] = r9
            java.lang.String r9 = "init"
            r11.AFKeystoreWrapper(r9, r2)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r11 = "6.5.3"
            r9[r1] = r11
            java.lang.String r11 = valueOf
            r9[r0] = r11
            java.lang.String r11 = "Initializing AppsFlyer SDK: (v%s.%s)"
            java.lang.String r9 = java.lang.String.format(r11, r9)
            com.appsflyer.AFLogger.AFInAppEventType(r9)
            AFKeystoreWrapper = r10
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.init(java.lang.String, com.appsflyer.AppsFlyerConversionListener, android.content.Context):com.appsflyer.AppsFlyerLib");
    }

    private void valueOf(Context context) {
        this.updateServerUninstallToken = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        C04623 r2 = new C0611l.C0613d() {
            public final void valueOf(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.values("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                    C0458ac.AFKeystoreWrapper(C0458ac.this).put("link", str);
                    if (str2 != null) {
                        C0458ac.AFKeystoreWrapper(C0458ac.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(ShareConstants.PROMO_CODE, str3);
                        hashMap.put(ShareConstants.DEEPLINK_CONTEXT, hashMap2);
                        C0458ac.AFKeystoreWrapper(C0458ac.this).put("extras", hashMap);
                    }
                } else {
                    C0458ac.AFKeystoreWrapper(C0458ac.this).put("link", "");
                }
                C0458ac.AFKeystoreWrapper(C0458ac.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            public final void values(String str) {
                C0458ac.AFKeystoreWrapper(C0458ac.this).put("error", str);
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler(cls, r2) {
                private /* synthetic */ Class valueOf;
                private /* synthetic */ C0613d values;

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.l.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.l.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                int i = setCustomerIdAndLogSession + 7;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                r2.values("Facebook app id not defined in resources");
                return;
            }
            method.invoke((Object) null, new Object[]{context, string, newProxyInstance});
            int i3 = waitForCustomerUserId + 115;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        } catch (NoSuchMethodException e) {
            r2.values(e.toString());
        } catch (InvocationTargetException e2) {
            r2.values(e2.toString());
        } catch (ClassNotFoundException e3) {
            r2.values(e3.toString());
        } catch (IllegalAccessException e4) {
            r2.values(e4.toString());
        }
    }

    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = setCustomerIdAndLogSession + 25;
        waitForCustomerUserId = i % 128;
        char c = i % 2 != 0 ? '9' : ']';
        this.setDebugLog = z;
        if (c != ']') {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void start(Context context) {
        int i = waitForCustomerUserId + 31;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 == 0;
        start(context, (String) null);
        if (z) {
            int i2 = 40 / 0;
        }
        int i3 = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.appsflyer.attribution.AppsFlyerRequestListener] */
    public final void start(Context context, String str) {
        int i = waitForCustomerUserId + 95;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 != 0;
        ? r1 = 0;
        start(context, str, r1);
        if (!z) {
            int length = r1.length;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.appsflyer.internal.bv, java.lang.Object] */
    public final void start(Context context, final String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (C0475ah.AFInAppEventParameterName == null) {
            boolean z = false;
            if (!(this.AppsFlyerInAppPurchaseValidatorListener)) {
                AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str == null) {
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C0513ba.AFInAppEventParameterName);
                        return;
                    }
                    return;
                }
            }
            C0518bf bfVar = this.setCustomerUserId;
            ? r4 = 0;
            if (!(context == null)) {
                C0517be beVar = bfVar.AFKeystoreWrapper;
                if (context != null) {
                    int i = setCustomerIdAndLogSession + 23;
                    waitForCustomerUserId = i % 128;
                    if (i % 2 != 0) {
                        beVar.values = context.getApplicationContext();
                        super.hashCode();
                    } else {
                        beVar.values = context.getApplicationContext();
                    }
                }
            }
            final C0556cl level = values().getLevel();
            level.valueOf(C0614n.AFInAppEventParameterName(context));
            this.stop = (Application) context.getApplicationContext();
            C0484ak.AFInAppEventType().AFKeystoreWrapper("start", str);
            String str2 = valueOf;
            AFLogger.values(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.5.3", str2}));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str2);
            AFLogger.values(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.stop.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerProperties.getInstance().setDevKey(str);
                C0482ai.AFInAppEventType(str);
            } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getDevKey())) {
                int i2 = setCustomerIdAndLogSession + 123;
                waitForCustomerUserId = i2 % 128;
                if (i2 % 2 != 0) {
                    AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                    int length = r4.length;
                    if (appsFlyerRequestListener == null) {
                        return;
                    }
                } else {
                    AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                    if (appsFlyerRequestListener != null) {
                        z = true;
                    }
                    if (!z) {
                        return;
                    }
                }
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C0513ba.AFInAppEventParameterName);
                int i3 = waitForCustomerUserId + 77;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            values().values().values(r4);
            AppsFlyer2dXConversionCallback(this.stop.getBaseContext());
            if (this.setDebugLog) {
                valueOf(this.stop.getApplicationContext());
            }
            C0475ah.AFKeystoreWrapper(context, new C0475ah.C0481e() {
                public final void valueOf(Activity activity) {
                    level.AFKeystoreWrapper();
                    C0458ac.this.values().values().values((C0535bv) null);
                    int valueOf2 = C0458ac.this.valueOf(C0458ac.AFInAppEventType((Context) activity), false);
                    AFLogger.values("onBecameForeground");
                    if (valueOf2 < 2) {
                        C0620w AFKeystoreWrapper = C0620w.AFKeystoreWrapper((Context) activity);
                        AFKeystoreWrapper.AFKeystoreWrapper.post(AFKeystoreWrapper.getLevel);
                        AFKeystoreWrapper.AFKeystoreWrapper.post(AFKeystoreWrapper.AFInAppEventParameterName);
                    }
                    C0560cp cpVar = new C0560cp();
                    C0600f.valueOf().valueOf(cpVar.values(), level, activity.getIntent(), C0458ac.this.values().AFInAppEventParameterName(), activity.getApplication());
                    C0458ac acVar = C0458ac.this;
                    if (activity != null) {
                        cpVar.AFKeystoreWrapper = (Application) activity.getApplicationContext();
                    }
                    cpVar.AFVersionDeclaration = str;
                    cpVar.AFInAppEventParameterName = appsFlyerRequestListener;
                    acVar.AFKeystoreWrapper((C0607i) cpVar, activity);
                }

                public final void valueOf(Context context) {
                    AFLogger.values("onBecameBackground");
                    C0556cl clVar = level;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (clVar.AppsFlyer2dXConversionCallback != 0) {
                        long j = currentTimeMillis - clVar.AppsFlyer2dXConversionCallback;
                        if (j > 0 && j < 1000) {
                            j = 1000;
                        }
                        clVar.onDeepLinkingNative = TimeUnit.MILLISECONDS.toSeconds(j);
                        clVar.valueOf.AFKeystoreWrapper("prev_session_dur", clVar.onDeepLinkingNative);
                    } else {
                        AFLogger.values("Metrics: fg ts is missing");
                    }
                    AFLogger.values("callStatsBackground background call");
                    C0458ac.this.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(context));
                    C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
                    if (AFInAppEventType2.AFVersionDeclaration()) {
                        AFInAppEventType2.AFInAppEventParameterName();
                        if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                            AFInAppEventType2.AFInAppEventType(context.getPackageName(), context.getPackageManager());
                        }
                        AFInAppEventType2.values();
                    } else {
                        AFLogger.AFInAppEventParameterName("RD status is OFF");
                    }
                    if (C0608k.values == null) {
                        C0608k.values = new C0608k();
                    }
                    C0608k kVar = C0608k.values;
                    try {
                        C0608k.valueOf(kVar.AFKeystoreWrapper);
                        if (kVar.AFInAppEventParameterName instanceof ThreadPoolExecutor) {
                            C0608k.valueOf((ThreadPoolExecutor) kVar.AFInAppEventParameterName);
                        }
                    } catch (Throwable th) {
                        AFLogger.valueOf("failed to stop Executors", th);
                    }
                    C0620w AFKeystoreWrapper = C0620w.AFKeystoreWrapper(context);
                    AFKeystoreWrapper.AFKeystoreWrapper.post(AFKeystoreWrapper.getLevel);
                }
            }, this.setOaidData);
        }
    }

    private static void AppsFlyer2dXConversionCallback(Context context) {
        try {
            boolean z = false;
            if (!((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) == 0)) {
                int i = setCustomerIdAndLogSession + 103;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    int i3 = setCustomerIdAndLogSession + 125;
                    waitForCustomerUserId = i3 % 128;
                    if (i3 % 2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        AFLogger.values("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    } else {
                        AFLogger.values("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    }
                } else {
                    AFLogger.valueOf("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    int i4 = setCustomerIdAndLogSession + 61;
                    waitForCustomerUserId = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } catch (Exception e) {
            AFLogger.AFKeystoreWrapper("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private static void getLevel(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.internal.C0630z.valueOf()
            if (r0 == 0) goto L_0x000e
            r0 = 23
            java.lang.String r1 = "OPPO device found"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1)
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00b9
            java.lang.String r0 = "keyPropDisableAFKeystore"
            r1 = 1
            boolean r0 = AFKeystoreWrapper((java.lang.String) r0, (boolean) r1)
            if (r0 != 0) goto L_0x00b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "OS SDK is="
            r0.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.append(r2)
            java.lang.String r2 = "; use KeyStore"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r2 = r0.AFKeystoreWrapper()
            if (r2 != 0) goto L_0x0056
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.C0473af.valueOf(r1)
            r0.values = r4
            r4 = 0
            r0.AFInAppEventType = r4
            java.lang.String r4 = r0.valueOf()
            r0.AFKeystoreWrapper(r4)
            goto L_0x009f
        L_0x0056:
            java.lang.String r4 = r0.valueOf()
            java.lang.Object r2 = r0.AFInAppEventParameterName
            monitor-enter(r2)
            int r3 = r0.AFInAppEventType     // Catch:{ all -> 0x00b6 }
            int r3 = r3 + r1
            r0.AFInAppEventType = r3     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x00b6 }
            com.appsflyer.AFLogger.values((java.lang.String) r1)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r1 = r0.AFInAppEventParameterName     // Catch:{ KeyStoreException -> 0x007c }
            monitor-enter(r1)     // Catch:{ KeyStoreException -> 0x007c }
            java.security.KeyStore r3 = r0.valueOf     // Catch:{ all -> 0x0079 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r1)     // Catch:{ all -> 0x0079 }
            goto L_0x0097
        L_0x0079:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ KeyStoreException -> 0x007c }
            throw r4     // Catch:{ KeyStoreException -> 0x007c }
        L_0x007c:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Exception "
            r1.<init>(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00b6 }
            r1.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = " occurred"
            r1.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b6 }
            com.appsflyer.AFLogger.valueOf(r1, r4)     // Catch:{ all -> 0x00b6 }
        L_0x0097:
            monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = r0.valueOf()
            r0.AFKeystoreWrapper(r4)
        L_0x009f:
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r1 = r0.values()
            values((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r4 = "KSAppsFlyerRICounter"
            int r0 = r0.AFInAppEventType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            values((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x00b6:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L_0x00b9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4.append(r0)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.getLevel(android.content.Context):void");
    }

    public static String AFInAppEventType() {
        int i = waitForCustomerUserId + 3;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 == 0)) {
            return AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
        }
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
        Object[] objArr = null;
        int length = objArr.length;
        return AFInAppEventParameterName2;
    }

    public final void setCustomerUserId(String str) {
        int i = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.values("setCustomerUserId = ".concat(String.valueOf(str)));
        values(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i3 = setCustomerIdAndLogSession + 37;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
    }

    public final void setPhoneNumber(String str) {
        int i = waitForCustomerUserId + 15;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 == 0;
        this.onPause = C0474ag.AFInAppEventParameterName(str);
        if (z) {
            Object obj = null;
            super.hashCode();
        }
    }

    private static String init() {
        int i = setCustomerIdAndLogSession + 101;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_ID);
        int i3 = waitForCustomerUserId + 53;
        setCustomerIdAndLogSession = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return AFInAppEventParameterName2;
        }
        int i4 = 83 / 0;
        return AFInAppEventParameterName2;
    }

    public final void setAppId(String str) {
        int i = setCustomerIdAndLogSession + 63;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setAppId", str);
        values(AppsFlyerProperties.APP_ID, str);
        int i3 = waitForCustomerUserId + 117;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? 21 : '1') == 21) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void setExtension(String str) {
        int i = setCustomerIdAndLogSession + 93;
        waitForCustomerUserId = i % 128;
        boolean z = false;
        if (!(i % 2 == 0)) {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventType2.AFKeystoreWrapper("setExtension", strArr);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i2 = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final void setIsUpdate(boolean z) {
        int i = waitForCustomerUserId + 1;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 == 0)) {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        } else {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setIsUpdate", strArr);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public final void setCurrencyCode(String str) {
        int i = waitForCustomerUserId + 33;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i3 = setCustomerIdAndLogSession + 33;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void logLocation(Context context, double d, double d2) {
        C0484ak.AFInAppEventType().AFKeystoreWrapper("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFInAppEventParameterName(context, AFInAppEventType.LOCATION_COORDINATES, (Map<String, Object>) hashMap);
        int i = setCustomerIdAndLogSession + 7;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 31 : Typography.amp) != '&') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(WeakReference<Context> weakReference) {
        int i = setCustomerIdAndLogSession + 11;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if (weakReference.get() != null) {
            AFLogger.values("app went to background");
            SharedPreferences AFInAppEventType2 = AFInAppEventType(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
            long j = values().getLevel().onDeepLinkingNative;
            HashMap hashMap = new HashMap();
            String devKey = AppsFlyerProperties.getInstance().getDevKey();
            if ((devKey == null ? 'D' : Typography.quote) != '\"') {
                AFLogger.AppsFlyer2dXConversionCallback("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String AFInAppEventParameterName2 = AFInAppEventParameterName("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
            C0602g AFInAppEventType3 = C0457ab.AFInAppEventType(weakReference.get().getContentResolver());
            if (AFInAppEventType3 != null) {
                hashMap.put("amazon_aid", AFInAppEventType3.values);
                hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventType3.AFKeystoreWrapper));
            }
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", devKey);
            hashMap.put("uid", C0473af.valueOf(weakReference));
            hashMap.put("time_in_app", String.valueOf(j));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(valueOf(AFInAppEventType2, false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName(weakReference.get()));
            if (AFInAppEventParameterName2 != null) {
                int i3 = setCustomerIdAndLogSession + 67;
                waitForCustomerUserId = i3 % 128;
                if ((i3 % 2 != 0 ? '%' : 'V') == '%') {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } else {
                int i4 = setCustomerIdAndLogSession + 67;
                waitForCustomerUserId = i4 % 128;
                int i5 = i4 % 2;
                AFInAppEventParameterName2 = "";
            }
            hashMap.put("originalAppsflyerId", AFInAppEventParameterName2);
            if (this.onValidateInApp) {
                try {
                    AFLogger.AFInAppEventParameterName("Running callStats task");
                    C0566cv cvVar = new C0566cv();
                    cvVar.onConversionDataSuccess = isStopped();
                    new Thread(new C0490an.C0491c((C0557cm) cvVar.AFInAppEventParameterName(hashMap).AFInAppEventType(String.format(AFLogger$LogLevel, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()})))).start();
                } catch (Throwable th) {
                    AFLogger.valueOf("Could not send callStats request", th);
                }
            } else {
                AFLogger.AFInAppEventParameterName("Stats call is disabled, ignore ...");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Map, java.lang.Object, java.lang.String] */
    public final void logSession(Context context) {
        int i = setCustomerIdAndLogSession + 49;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        boolean z = false;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("logSession", new String[0]);
        C0484ak.AFInAppEventType().getLevel();
        AFInAppEventParameterName(context, C0552ch.logSession);
        ? r0 = 0;
        AFInAppEventParameterName(context, (String) r0, (Map<String, Object>) r0);
        int i3 = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (z) {
            super.hashCode();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r5 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if ((r5 == null) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r5, com.appsflyer.internal.C0552ch r6) {
        /*
            r4 = this;
            com.appsflyer.internal.bf r0 = r4.setCustomerUserId
            r1 = 1
            if (r5 == 0) goto L_0x0035
            int r2 = waitForCustomerUserId
            int r2 = r2 + 19
            int r3 = r2 % 128
            setCustomerIdAndLogSession = r3
            int r2 = r2 % 2
            r3 = 69
            if (r2 != 0) goto L_0x0016
            r2 = 83
            goto L_0x0018
        L_0x0016:
            r2 = 69
        L_0x0018:
            if (r2 == r3) goto L_0x0025
            com.appsflyer.internal.be r0 = r0.AFKeystoreWrapper
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x0035
            goto L_0x002f
        L_0x0023:
            r5 = move-exception
            throw r5
        L_0x0025:
            com.appsflyer.internal.be r0 = r0.AFKeystoreWrapper
            if (r5 == 0) goto L_0x002b
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            android.content.Context r2 = r5.getApplicationContext()
            r0.values = r2
        L_0x0035:
            com.appsflyer.internal.bg r0 = r4.values()
            com.appsflyer.internal.cl r0 = r0.getLevel()
            com.appsflyer.internal.cj r5 = com.appsflyer.internal.C0614n.AFInAppEventParameterName(r5)
            boolean r2 = r0.AFInAppEventType()
            if (r2 == 0) goto L_0x0068
            int r2 = waitForCustomerUserId
            int r2 = r2 + 71
            int r3 = r2 % 128
            setCustomerIdAndLogSession = r3
            int r2 = r2 % 2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.AFInAppEventParameterName
            java.lang.String r6 = r6.toString()
            java.lang.String r3 = "api_name"
            r2.put(r3, r6)
            r0.valueOf((com.appsflyer.internal.C0554cj) r5)
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + r1
            int r6 = r5 % 128
            waitForCustomerUserId = r6
            int r5 = r5 % 2
        L_0x0068:
            r0.AFKeystoreWrapper()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(android.content.Context, com.appsflyer.internal.ch):void");
    }

    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int i = waitForCustomerUserId + 93;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C0518bf bfVar = this.setCustomerUserId;
        boolean z = false;
        if (context != null) {
            C0517be beVar = bfVar.AFKeystoreWrapper;
            if (context == null) {
                z = true;
            }
            if (!z) {
                int i3 = setCustomerIdAndLogSession + 107;
                waitForCustomerUserId = i3 % 128;
                if (i3 % 2 != 0) {
                    beVar.values = context.getApplicationContext();
                    Object obj = null;
                    super.hashCode();
                } else {
                    beVar.values = context.getApplicationContext();
                }
            }
        }
        C0555ck ckVar = new C0555ck();
        if (context != null) {
            ckVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        ckVar.values = map;
        AFKeystoreWrapper((C0607i) ckVar);
    }

    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 111;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        logEvent(context, str, map, (AppsFlyerRequestListener) null);
        int i3 = setCustomerIdAndLogSession + 9;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r3 = this;
            com.appsflyer.internal.co r0 = new com.appsflyer.internal.co
            r0.<init>()
            r1 = 61
            if (r4 == 0) goto L_0x000c
            r2 = 61
            goto L_0x000e
        L_0x000c:
            r2 = 25
        L_0x000e:
            if (r2 == r1) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            android.content.Context r1 = r4.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            r0.AFKeystoreWrapper = r1
            int r1 = waitForCustomerUserId
            int r1 = r1 + 57
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
        L_0x0023:
            r0.getLevel = r5
            r0.values = r6
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            r6 = 0
            if (r5 == 0) goto L_0x004e
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 29
            int r1 = r5 % 128
            waitForCustomerUserId = r1
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0043
            android.app.Activity r4 = (android.app.Activity) r4
            int r5 = r6.length     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r4 = move-exception
            throw r4
        L_0x0043:
            android.app.Activity r4 = (android.app.Activity) r4
        L_0x0045:
            r6 = r4
            int r1 = r1 + 111
            int r4 = r1 % 128
            setCustomerIdAndLogSession = r4
            int r1 = r1 % 2
        L_0x004e:
            r3.AFKeystoreWrapper((com.appsflyer.internal.C0607i) r0, (android.app.Activity) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(android.content.Context, java.lang.String, java.util.Map):void");
    }

    public final void anonymizeUser(boolean z) {
        int i = setCustomerIdAndLogSession + 105;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 == 0)) {
            C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("anonymizeUser", strArr);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i2 = setCustomerIdAndLogSession + 93;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? 'X' : '@') == 'X') {
            int i3 = 91 / 0;
        }
    }

    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = waitForCustomerUserId + 33;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z = false;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        int i3 = setCustomerIdAndLogSession + 19;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    private static void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = waitForCustomerUserId;
        int i2 = i + 95;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        if (appsFlyerConversionListener == null) {
            int i4 = i + 31;
            setCustomerIdAndLogSession = i4 % 128;
            if ((i4 % 2 == 0 ? 25 : Typography.dollar) != '$') {
                Object obj = null;
                super.hashCode();
                return;
            }
            return;
        }
        AFKeystoreWrapper = appsFlyerConversionListener;
    }

    public final void unregisterConversionListener() {
        int i = setCustomerIdAndLogSession + 21;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 == 0)) {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        } else {
            C0484ak.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        }
        AFKeystoreWrapper = null;
    }

    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = waitForCustomerUserId + 57;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z = false;
        C0484ak.AFInAppEventType().AFKeystoreWrapper("registerValidatorListener", new String[0]);
        AFLogger.AFInAppEventParameterName("registerValidatorListener called");
        if ((appsFlyerInAppPurchaseValidatorListener == null ? 'J' : '3') != 'J') {
            AFInAppEventParameterName = appsFlyerInAppPurchaseValidatorListener;
            int i3 = waitForCustomerUserId + 105;
            setCustomerIdAndLogSession = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        AFLogger.AFInAppEventParameterName("registerValidatorListener null listener");
        int i4 = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = setCustomerIdAndLogSession + 125;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        return format;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r6 != null) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 13
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x001f
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x001d }
            if (r6 == 0) goto L_0x001a
            r1 = 0
        L_0x001a:
            if (r1 == 0) goto L_0x0021
            goto L_0x003c
        L_0x001d:
            r4 = move-exception
            throw r4
        L_0x001f:
            if (r6 == 0) goto L_0x003c
        L_0x0021:
            int r0 = waitForCustomerUserId
            int r0 = r0 + 115
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            com.appsflyer.internal.co r0 = new com.appsflyer.internal.co
            r0.<init>()
            goto L_0x004b
        L_0x003c:
            com.appsflyer.internal.cp r0 = new com.appsflyer.internal.cp
            r0.<init>()
            int r1 = waitForCustomerUserId
            int r1 = r1 + 29
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
        L_0x004b:
            if (r4 == 0) goto L_0x005f
            int r1 = waitForCustomerUserId
            int r1 = r1 + 75
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
            android.content.Context r4 = r4.getApplicationContext()
            android.app.Application r4 = (android.app.Application) r4
            r0.AFKeystoreWrapper = r4
        L_0x005f:
            r0.getLevel = r6
            r0.AFVersionDeclaration = r5
            r0.values = r7
            r0.AppsFlyer2dXConversionCallback = r8
            r0.valueOf = r9
            r3.values((com.appsflyer.internal.C0607i) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(android.content.Context, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void");
    }

    private boolean getLevel() {
        int i = waitForCustomerUserId + 29;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (this.onAppOpenAttribution > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onAppOpenAttribution;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String valueOf2 = valueOf(simpleDateFormat, this.onAppOpenAttribution);
            String valueOf3 = valueOf(simpleDateFormat, this.onResponseNative);
            if ((currentTimeMillis < this.onConversionDataSuccess ? 9 : '/') == 9 && !isStopped()) {
                int i3 = waitForCustomerUserId + 79;
                setCustomerIdAndLogSession = i3 % 128;
                if (i3 % 2 == 0) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[1] = valueOf2;
                    objArr[1] = valueOf3;
                    objArr[3] = Long.valueOf(currentTimeMillis);
                    objArr[5] = Long.valueOf(this.onConversionDataSuccess);
                    AFLogger.values(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr));
                    return false;
                }
                AFLogger.values(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{valueOf2, valueOf3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onConversionDataSuccess)}));
                return true;
            }
            if (!isStopped()) {
                AFLogger.values(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{valueOf2, valueOf3, Long.valueOf(currentTimeMillis)}));
            }
        } else {
            if (!(isStopped())) {
                int i4 = setCustomerIdAndLogSession + 99;
                waitForCustomerUserId = i4 % 128;
                boolean z = i4 % 2 == 0;
                AFLogger.values("Sending first launch for this session!");
                if (!z) {
                    int i5 = 44 / 0;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (com.appsflyer.internal.C0608k.values == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r5 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventType(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            com.appsflyer.internal.cq r0 = new com.appsflyer.internal.cq
            r0.<init>()
            r1 = 8
            if (r5 == 0) goto L_0x000c
            r2 = 83
            goto L_0x000e
        L_0x000c:
            r2 = 8
        L_0x000e:
            if (r2 == r1) goto L_0x0022
            int r1 = waitForCustomerUserId
            int r1 = r1 + 45
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
            android.content.Context r1 = r5.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            r0.AFKeystoreWrapper = r1
        L_0x0022:
            r0.AppsFlyer2dXConversionCallback = r6
            if (r6 == 0) goto L_0x0087
            int r6 = r6.length()
            r1 = 5
            r2 = 1
            r3 = 0
            if (r6 <= r1) goto L_0x0031
            r6 = 1
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 == r2) goto L_0x0035
            goto L_0x0087
        L_0x0035:
            android.content.SharedPreferences r5 = AFInAppEventType((android.content.Context) r5)
            boolean r5 = r4.valueOf((com.appsflyer.internal.C0607i) r0, (android.content.SharedPreferences) r5)
            if (r5 == 0) goto L_0x0087
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 15
            int r6 = r5 % 128
            waitForCustomerUserId = r6
            int r5 = r5 % 2
            r6 = 39
            if (r5 == 0) goto L_0x0050
            r5 = 39
            goto L_0x0052
        L_0x0050:
            r5 = 33
        L_0x0052:
            if (r5 == r6) goto L_0x0059
            com.appsflyer.internal.k r5 = com.appsflyer.internal.C0608k.values
            if (r5 != 0) goto L_0x0072
            goto L_0x0061
        L_0x0059:
            com.appsflyer.internal.k r5 = com.appsflyer.internal.C0608k.values
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x0085 }
            if (r5 != 0) goto L_0x0072
        L_0x0061:
            com.appsflyer.internal.k r5 = new com.appsflyer.internal.k
            r5.<init>()
            com.appsflyer.internal.C0608k.values = r5
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 43
            int r6 = r5 % 128
            waitForCustomerUserId = r6
            int r5 = r5 % 2
        L_0x0072:
            com.appsflyer.internal.k r5 = com.appsflyer.internal.C0608k.values
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r5.AFKeystoreWrapper()
            com.appsflyer.internal.ac$b r6 = new com.appsflyer.internal.ac$b
            r6.<init>(r4, r0, r3)
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            valueOf(r5, r6, r0, r2)
            goto L_0x0087
        L_0x0085:
            r5 = move-exception
            throw r5
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean valueOf(com.appsflyer.internal.C0607i r6, android.content.SharedPreferences r7) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r5.valueOf((android.content.SharedPreferences) r7, (boolean) r0)
            r2 = 1
            if (r1 != r2) goto L_0x000e
            boolean r6 = r6 instanceof com.appsflyer.internal.C0553ci
            if (r6 != 0) goto L_0x000e
            r6 = 1
            goto L_0x0019
        L_0x000e:
            int r6 = setCustomerIdAndLogSession
            int r6 = r6 + 69
            int r3 = r6 % 128
            waitForCustomerUserId = r3
            int r6 = r6 % 2
            r6 = 0
        L_0x0019:
            java.lang.String r3 = "newGPReferrerSent"
            boolean r7 = r7.getBoolean(r3, r0)
            r3 = 40
            if (r7 != 0) goto L_0x0026
            r7 = 40
            goto L_0x0028
        L_0x0026:
            r7 = 66
        L_0x0028:
            r4 = 65
            if (r7 == r3) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            int r7 = setCustomerIdAndLogSession
            int r7 = r7 + r4
            int r3 = r7 % 128
            waitForCustomerUserId = r3
            int r7 = r7 % 2
            if (r1 != r2) goto L_0x003a
            r7 = 1
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            r1 = 30
            if (r7 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r4 = 30
        L_0x0042:
            if (r4 == r1) goto L_0x0048
            if (r6 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            return r0
        L_0x0048:
            int r6 = waitForCustomerUserId
            int r6 = r6 + 77
            int r7 = r6 % 128
            setCustomerIdAndLogSession = r7
            int r6 = r6 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.valueOf(com.appsflyer.internal.i, android.content.SharedPreferences):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 1
            if (r0 != 0) goto L_0x0043
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 33
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001c
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            java.lang.String r3 = "collectIMEIForceByUser"
            if (r0 == r1) goto L_0x002c
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x0037
            goto L_0x0043
        L_0x002c:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 125
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            if (r0 != 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == r1) goto L_0x004d
            goto L_0x00d8
        L_0x004d:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 125
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            java.lang.String r3 = "advertiserId"
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r5.get(r3)
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x006f }
            r3 = 62
            if (r0 == 0) goto L_0x006a
            r0 = 62
            goto L_0x006c
        L_0x006a:
            r0 = 63
        L_0x006c:
            if (r0 == r3) goto L_0x0077
            goto L_0x00d8
        L_0x006f:
            r5 = move-exception
            throw r5
        L_0x0071:
            java.lang.Object r0 = r5.get(r3)
            if (r0 == 0) goto L_0x00d8
        L_0x0077:
            java.lang.String r0 = r4.init     // Catch:{ Exception -> 0x00d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            if (r0 == r1) goto L_0x00a5
            int r0 = waitForCustomerUserId
            int r0 = r0 + 95
            int r3 = r0 % 128
            setCustomerIdAndLogSession = r3
            int r0 = r0 % 2
            java.lang.String r0 = "android_id"
            java.lang.Object r0 = r5.remove(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x00a5
            int r0 = waitForCustomerUserId
            int r0 = r0 + 75
            int r3 = r0 % 128
            setCustomerIdAndLogSession = r3
            int r0 = r0 % 2
            java.lang.String r0 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.values((java.lang.String) r0)     // Catch:{ Exception -> 0x00d2 }
        L_0x00a5:
            java.lang.String r0 = r4.AppsFlyer2dXConversionCallback     // Catch:{ Exception -> 0x00d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "imei"
            java.lang.Object r5 = r5.remove(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r5 == 0) goto L_0x00ba
            java.lang.String r5 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.values((java.lang.String) r5)     // Catch:{ Exception -> 0x00d2 }
        L_0x00ba:
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 71
            int r0 = r5 % 128
            waitForCustomerUserId = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x00c8
            r5 = 0
            goto L_0x00c9
        L_0x00c8:
            r5 = 1
        L_0x00c9:
            if (r5 == r1) goto L_0x00d1
            r5 = 67
            int r5 = r5 / r2
            return
        L_0x00cf:
            r5 = move-exception
            throw r5
        L_0x00d1:
            return
        L_0x00d2:
            r5 = move-exception
            java.lang.String r0 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.valueOf(r0, r5)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(java.util.Map):void");
    }

    private boolean AFLogger$LogLevel() {
        Map<String, Object> map = this.updateServerUninstallToken;
        if ((map != null ? '!' : 'M') == '!') {
            if (!map.isEmpty()) {
                int i = setCustomerIdAndLogSession;
                int i2 = i + 79;
                waitForCustomerUserId = i2 % 128;
                int i3 = i2 % 2;
                int i4 = i + 3;
                waitForCustomerUserId = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return true;
            }
        }
        return false;
    }

    private void valueOf(Map<String, Object> map) {
        C0493ap apVar;
        int i = setCustomerIdAndLogSession + 93;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 'D' : '#') != '#') {
            apVar = values().values().AFKeystoreWrapper();
            Object[] objArr = null;
            int length = objArr.length;
            if ((apVar != null ? '7' : 'J') != '7') {
                return;
            }
        } else {
            apVar = values().values().AFKeystoreWrapper();
            if (!(apVar != null)) {
                return;
            }
        }
        map.put("rc", apVar.AFKeystoreWrapper());
        int i2 = setCustomerIdAndLogSession + 49;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r2 != true) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0 = (java.util.Map) r4.get("meta");
        r4 = setCustomerIdAndLogSession + 5;
        waitForCustomerUserId = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r4.containsKey("meta") != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            int r0 = waitForCustomerUserId
            int r0 = r0 + 7
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = 12
            if (r0 != 0) goto L_0x0011
            r0 = 99
            goto L_0x0013
        L_0x0011:
            r0 = 12
        L_0x0013:
            r2 = 0
            java.lang.String r3 = "meta"
            if (r0 == r1) goto L_0x0024
            boolean r0 = r4.containsKey(r3)
            r1 = 11
            int r1 = r1 / r2
            if (r0 == 0) goto L_0x002e
            goto L_0x0037
        L_0x0022:
            r4 = move-exception
            throw r4
        L_0x0024:
            boolean r0 = r4.containsKey(r3)
            r1 = 1
            if (r0 == 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            if (r2 == r1) goto L_0x0037
        L_0x002e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.put(r3, r0)
            goto L_0x0048
        L_0x0037:
            java.lang.Object r4 = r4.get(r3)
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 5
            int r1 = r4 % 128
            waitForCustomerUserId = r1
            int r4 = r4 % 2
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(java.util.Map):java.util.Map");
    }

    public static boolean AFInAppEventType(SharedPreferences sharedPreferences) {
        int i = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean parseBoolean = Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
        int i3 = waitForCustomerUserId + 71;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return parseBoolean;
    }

    private static void values(Context context, Map<String, Object> map) {
        WindowManager windowManager;
        int i = setCustomerIdAndLogSession + 19;
        waitForCustomerUserId = i % 128;
        boolean z = false;
        if (i % 2 != 0) {
            windowManager = (WindowManager) context.getSystemService("window");
            Object obj = null;
            super.hashCode();
            if (windowManager == null) {
                z = true;
            }
            if (z) {
                return;
            }
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        int i2 = waitForCustomerUserId + 35;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        int rotation = windowManager.getDefaultDisplay().getRotation();
        map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : "p");
    }

    private void AFInAppEventParameterName(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", values("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", values("ro.product.cpu.abi2"));
        hashMap.put("arch", values("os.arch"));
        hashMap.put("build_display_id", values("ro.build.display.id"));
        if (z) {
            int i2 = waitForCustomerUserId + 31;
            setCustomerIdAndLogSession = i2 % 128;
            int i3 = i2 % 2;
            if (this.AppsFlyerConversionListener) {
                Map<String, Object> AFLogger$LogLevel2 = AFLogger$LogLevel(context);
                if ((!AFLogger$LogLevel2.isEmpty() ? 13 : '5') != '5') {
                    int i4 = setCustomerIdAndLogSession + 57;
                    waitForCustomerUserId = i4 % 128;
                    int i5 = i4 % 2;
                    hashMap.put("loc", AFLogger$LogLevel2);
                    int i6 = setCustomerIdAndLogSession + 17;
                    waitForCustomerUserId = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            AFKeystoreWrapper(context, (Map<String, Object>) hashMap);
            if (!(i > 2)) {
                int i8 = waitForCustomerUserId + 3;
                setCustomerIdAndLogSession = i8 % 128;
                int i9 = i8 % 2;
                hashMap.putAll(C0620w.AFKeystoreWrapper(context).AFKeystoreWrapper());
            }
        }
        hashMap.put("dim", C0629y.AFInAppEventType(context));
        map.put("deviceData", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r3.values != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if ((r3.values != null) != true) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void AFInAppEventType(android.content.Context r3, java.util.Map<java.lang.String, ? super java.lang.String> r4) {
        /*
            int r0 = waitForCustomerUserId
            int r0 = r0 + 37
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            java.lang.String r1 = "network"
            r2 = 0
            if (r0 != 0) goto L_0x002a
            com.appsflyer.internal.u r0 = com.appsflyer.internal.C0615u.C0617d.valueOf
            com.appsflyer.internal.u$a r3 = com.appsflyer.internal.C0615u.AFInAppEventType(r3)
            java.lang.String r0 = r3.AFKeystoreWrapper
            r4.put(r1, r0)
            java.lang.String r0 = r3.values
            r1 = 71
            int r1 = r1 / r2
            r1 = 1
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == r1) goto L_0x0039
            goto L_0x0057
        L_0x0028:
            r3 = move-exception
            throw r3
        L_0x002a:
            com.appsflyer.internal.u r0 = com.appsflyer.internal.C0615u.C0617d.valueOf
            com.appsflyer.internal.u$a r3 = com.appsflyer.internal.C0615u.AFInAppEventType(r3)
            java.lang.String r0 = r3.AFKeystoreWrapper
            r4.put(r1, r0)
            java.lang.String r0 = r3.values
            if (r0 == 0) goto L_0x0057
        L_0x0039:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 75
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            java.lang.String r1 = "operator"
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r3.values
            r4.put(r1, r0)
            r0 = 16
            int r0 = r0 / r2
            goto L_0x0057
        L_0x0050:
            r3 = move-exception
            throw r3
        L_0x0052:
            java.lang.String r0 = r3.values
            r4.put(r1, r0)
        L_0x0057:
            java.lang.String r0 = r3.AFInAppEventType
            r1 = 44
            if (r0 == 0) goto L_0x0060
            r0 = 44
            goto L_0x0062
        L_0x0060:
            r0 = 12
        L_0x0062:
            if (r0 == r1) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            java.lang.String r3 = r3.AFInAppEventType
            java.lang.String r0 = "carrier"
            r4.put(r0, r3)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(android.content.Context, java.util.Map):void");
    }

    private static void AFKeystoreWrapper(Context context, Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 49;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        C0450a.C0452d values2 = C0450a.C0451a.valueOf.values(context);
        map.put("btl", Float.toString(values2.AFInAppEventType));
        if ((values2.AFKeystoreWrapper != null ? 'D' : 'G') == 'D') {
            int i3 = waitForCustomerUserId + 23;
            setCustomerIdAndLogSession = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("btch", values2.AFKeystoreWrapper);
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            map.put("btch", values2.AFKeystoreWrapper);
        }
    }

    private static void values(Map<String, Object> map) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if ((string != null ? ')' : '1') != '1') {
            int i = setCustomerIdAndLogSession + 59;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i3 = setCustomerIdAndLogSession + 109;
            waitForCustomerUserId = i3 % 128;
            boolean z = i3 % 2 != 0;
            map.put("onelink_ver", string2);
            if (z) {
                Object obj = null;
                super.hashCode();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r7 != null ? (char) 2 : 30) != 2) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r7 != null ? '6' : '1') != '1') goto L_0x0027;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventParameterName(android.app.Activity r7) {
        /*
            java.lang.String r0 = "af"
            int r1 = waitForCustomerUserId
            int r1 = r1 + 103
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            if (r1 != 0) goto L_0x001e
            int r1 = r3.length     // Catch:{ all -> 0x001c }
            r1 = 49
            if (r7 == 0) goto L_0x0017
            r4 = 54
            goto L_0x0019
        L_0x0017:
            r4 = 49
        L_0x0019:
            if (r4 == r1) goto L_0x0086
            goto L_0x0027
        L_0x001c:
            r7 = move-exception
            throw r7
        L_0x001e:
            if (r7 == 0) goto L_0x0022
            r1 = 2
            goto L_0x0024
        L_0x0022:
            r1 = 30
        L_0x0024:
            if (r1 == r2) goto L_0x0027
            goto L_0x0086
        L_0x0027:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L_0x0086
            int r4 = waitForCustomerUserId
            int r4 = r4 + 73
            int r5 = r4 % 128
            setCustomerIdAndLogSession = r5
            int r4 = r4 % r2
            if (r4 != 0) goto L_0x0042
            android.os.Bundle r4 = r1.getExtras()     // Catch:{ all -> 0x007e }
            super.hashCode()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0086
            goto L_0x0048
        L_0x0042:
            android.os.Bundle r4 = r1.getExtras()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0086
        L_0x0048:
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 11
            int r6 = r5 % 128
            waitForCustomerUserId = r6
            int r5 = r5 % r2
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x007e }
            r5 = 1
            if (r3 == 0) goto L_0x005a
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = 1
        L_0x005b:
            if (r6 == r5) goto L_0x0086
            java.lang.String r5 = "Push Notification received af payload = "
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x007e }
            com.appsflyer.AFLogger.values((java.lang.String) r5)     // Catch:{ all -> 0x007e }
            r4.remove(r0)     // Catch:{ all -> 0x007e }
            android.content.Intent r0 = r1.putExtras(r4)     // Catch:{ all -> 0x007e }
            r7.setIntent(r0)     // Catch:{ all -> 0x007e }
            int r7 = setCustomerIdAndLogSession
            int r7 = r7 + 125
            int r0 = r7 % 128
            waitForCustomerUserId = r0
            int r7 = r7 % r2
            goto L_0x0086
        L_0x007e:
            r7 = move-exception
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.valueOf(r0, r7)
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(android.app.Activity):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        if (r10 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (com.appsflyer.internal.C0608k.values == null) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFInAppEventType(android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11, android.net.Uri r12) {
        /*
            r9 = this;
            java.lang.String r0 = "af_deeplink"
            boolean r1 = r11.containsKey(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = 0
            goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            if (r1 == 0) goto L_0x0011
            goto L_0x00a0
        L_0x0011:
            java.lang.String r1 = r12.toString()
            java.lang.String r1 = valueOf((java.lang.String) r1)
            com.appsflyer.internal.f r4 = com.appsflyer.internal.C0600f.valueOf()
            java.lang.String r5 = r4.AFVersionDeclaration
            r6 = 11
            if (r5 == 0) goto L_0x0026
            r5 = 21
            goto L_0x0028
        L_0x0026:
            r5 = 11
        L_0x0028:
            if (r5 == r6) goto L_0x009d
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.getLevel
            if (r5 == 0) goto L_0x009d
            java.lang.String r5 = r4.AFVersionDeclaration
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x009d
            int r5 = waitForCustomerUserId
            int r5 = r5 + 91
            int r6 = r5 % 128
            setCustomerIdAndLogSession = r6
            int r5 = r5 % 2
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri r5 = android.net.Uri.EMPTY
            android.net.Uri$Builder r5 = r5.buildUpon()
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.getLevel
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x005d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r1.appendQueryParameter(r7, r8)
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r5.appendQueryParameter(r7, r6)
            goto L_0x005d
        L_0x0088:
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            android.net.Uri r4 = r5.build()
            java.lang.String r4 = r4.getEncodedQuery()
            java.lang.String r5 = "appended_query_params"
            r11.put(r5, r4)
        L_0x009d:
            r11.put(r0, r1)
        L_0x00a0:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r12.toString()
            java.lang.String r4 = "link"
            r0.put(r4, r1)
            com.appsflyer.internal.aq r1 = new com.appsflyer.internal.aq
            r1.<init>(r12, r9, r10)
            boolean r4 = r1.values
            r5 = 82
            if (r4 == 0) goto L_0x00bc
            r4 = 82
            goto L_0x00be
        L_0x00bc:
            r4 = 52
        L_0x00be:
            r6 = 0
            if (r4 == r5) goto L_0x00c2
            goto L_0x00e5
        L_0x00c2:
            int r4 = waitForCustomerUserId
            int r4 = r4 + 105
            int r5 = r4 % 128
            setCustomerIdAndLogSession = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x00d0
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            java.lang.String r5 = "isBrandedDomain"
            if (r4 == 0) goto L_0x00e0
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r11.put(r5, r4)
            super.hashCode()     // Catch:{ all -> 0x00de }
            goto L_0x00e5
        L_0x00de:
            r10 = move-exception
            throw r10
        L_0x00e0:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r11.put(r5, r4)
        L_0x00e5:
            com.appsflyer.internal.C0630z.AFInAppEventType(r10, r0, r12)
            boolean r10 = r1.AFInAppEventType()
            if (r10 == 0) goto L_0x0127
            int r10 = setCustomerIdAndLogSession
            int r10 = r10 + 15
            int r11 = r10 % 128
            waitForCustomerUserId = r11
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r2 = 1
        L_0x00fc:
            if (r2 == r3) goto L_0x010c
            com.appsflyer.internal.aq$a r10 = r9.AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.String>) r0)
            r1.AFKeystoreWrapper = r10
            com.appsflyer.internal.k r10 = com.appsflyer.internal.C0608k.values
            int r11 = r6.length     // Catch:{ all -> 0x010a }
            if (r10 != 0) goto L_0x011d
            goto L_0x0116
        L_0x010a:
            r10 = move-exception
            throw r10
        L_0x010c:
            com.appsflyer.internal.aq$a r10 = r9.AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.String>) r0)
            r1.AFKeystoreWrapper = r10
            com.appsflyer.internal.k r10 = com.appsflyer.internal.C0608k.values
            if (r10 != 0) goto L_0x011d
        L_0x0116:
            com.appsflyer.internal.k r10 = new com.appsflyer.internal.k
            r10.<init>()
            com.appsflyer.internal.C0608k.values = r10
        L_0x011d:
            com.appsflyer.internal.k r10 = com.appsflyer.internal.C0608k.values
            java.util.concurrent.Executor r10 = r10.AFInAppEventType()
            r10.execute(r1)
            return
        L_0x0127:
            com.appsflyer.internal.C0492ao.AFInAppEventType((java.util.Map<java.lang.String, java.lang.String>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(android.content.Context, java.util.Map, android.net.Uri):void");
    }

    private static String valueOf(String str) {
        if (str == null) {
            int i = waitForCustomerUserId + 7;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            return null;
        } else if (!str.matches("fb\\d*?://authorize.*")) {
            return str;
        } else {
            int i3 = waitForCustomerUserId + 19;
            setCustomerIdAndLogSession = i3 % 128;
            if (!(i3 % 2 != 0)) {
                int i4 = 86 / 0;
                if (!str.contains("access_token")) {
                    return str;
                }
            } else if (!str.contains("access_token")) {
                return str;
            }
            String AFKeystoreWrapper2 = AFKeystoreWrapper(str);
            if (AFKeystoreWrapper2.length() == 0) {
                int i5 = waitForCustomerUserId + 23;
                setCustomerIdAndLogSession = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
            ArrayList arrayList = new ArrayList();
            if (AFKeystoreWrapper2.contains("&")) {
                arrayList = new ArrayList(Arrays.asList(AFKeystoreWrapper2.split("&")));
            } else {
                arrayList.add(AFKeystoreWrapper2);
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.contains("access_token")) {
                    it.remove();
                    int i7 = setCustomerIdAndLogSession + 65;
                    waitForCustomerUserId = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    if (!(sb.length() == 0)) {
                        int i9 = setCustomerIdAndLogSession + 117;
                        waitForCustomerUserId = i9 % 128;
                        boolean z = i9 % 2 != 0;
                        sb.append("&");
                        if (z) {
                            int i10 = 56 / 0;
                        }
                    } else if (!str2.startsWith("?")) {
                        int i11 = waitForCustomerUserId + 119;
                        setCustomerIdAndLogSession = i11 % 128;
                        if ((i11 % 2 == 0 ? 19 : '8') != '8') {
                            sb.append("?");
                            int i12 = 84 / 0;
                        } else {
                            sb.append("?");
                        }
                    }
                    sb.append(str2);
                }
            }
            return str.replace(AFKeystoreWrapper2, sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if ((r0 == -1 ? 'H' : 27) != 27) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        return r3.substring(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r0 == -1 ? 'B' : 'C') != 'C') goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.lang.String r3) {
        /*
            int r0 = waitForCustomerUserId
            int r0 = r0 + 65
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = -1
            if (r0 != 0) goto L_0x001f
            r0 = 35
            int r0 = r3.indexOf(r0)
            r2 = 67
            if (r0 != r1) goto L_0x001a
            r1 = 66
            goto L_0x001c
        L_0x001a:
            r1 = 67
        L_0x001c:
            if (r1 == r2) goto L_0x0046
            goto L_0x0030
        L_0x001f:
            r0 = 63
            int r0 = r3.indexOf(r0)
            r2 = 27
            if (r0 != r1) goto L_0x002c
            r1 = 72
            goto L_0x002e
        L_0x002c:
            r1 = 27
        L_0x002e:
            if (r1 == r2) goto L_0x0046
        L_0x0030:
            int r3 = setCustomerIdAndLogSession
            int r3 = r3 + 99
            int r0 = r3 % 128
            waitForCustomerUserId = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0043
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            r3 = move-exception
            throw r3
        L_0x0043:
            java.lang.String r3 = ""
            return r3
        L_0x0046:
            java.lang.String r3 = r3.substring(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    private C0494aq.C0495a AFKeystoreWrapper(final Map<String, String> map) {
        C04656 r0 = new C0494aq.C0495a() {
            public final void valueOf(Map<String, String> map) {
                for (String next : map.keySet()) {
                    map.put(next, map.get(next));
                }
                C0492ao.AFInAppEventType((Map<String, String>) map);
            }

            public final void AFKeystoreWrapper(String str) {
                C0492ao.AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }
        };
        int i = waitForCustomerUserId + 71;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '%' : 'Y') != '%') {
            return r0;
        }
        int i2 = 56 / 0;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
    private static void valueOf(Context context, Map<String, Object> map, String str) {
        int i = waitForCustomerUserId + 63;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        SharedPreferences.Editor edit = AFInAppEventType2.edit();
        ? r2 = 0;
        try {
            String string = AFInAppEventType2.getString("prev_event_name", r2);
            if (string != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", AFInAppEventType2.getLong("prev_event_timestamp", -1));
                jSONObject.put("prev_event_name", string);
                map.put("prev_event", jSONObject);
            }
            edit.putString("prev_event_name", str);
            edit.putLong("prev_event_timestamp", System.currentTimeMillis());
            AFInAppEventType(edit);
            int i3 = setCustomerIdAndLogSession + 21;
            waitForCustomerUserId = i3 % 128;
            if (i3 % 2 != 0) {
                int length = r2.length;
            }
        } catch (Exception e) {
            AFLogger.valueOf("Error while processing previous event.", e);
        }
    }

    private static boolean init(Context context) {
        int i = setCustomerIdAndLogSession + 1;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i3 = setCustomerIdAndLogSession + 113;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.valueOf("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.valueOf("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r13.AppsFlyer2dXConversionCallback) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (android.text.TextUtils.isEmpty(r13.AppsFlyer2dXConversionCallback) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if ((r5 != null ? (char) 23 : 19) != 19) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0173, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0174, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void valueOf(android.content.Context r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r13 = this;
            java.lang.String r0 = "use cached AndroidId: "
            java.lang.String r1 = "use cached IMEI: "
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = "deviceTrackingDisabled"
            r4 = 0
            boolean r5 = r2.getBoolean(r3, r4)
            r6 = 1
            if (r5 == 0) goto L_0x0014
            r5 = 1
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            if (r5 == 0) goto L_0x001d
            java.lang.String r14 = "true"
            r15.put(r3, r14)
            return
        L_0x001d:
            android.content.SharedPreferences r3 = AFInAppEventType((android.content.Context) r14)
            java.lang.String r5 = "collectIMEI"
            boolean r5 = r2.getBoolean(r5, r4)
            java.lang.String r7 = "imeiCached"
            r8 = 0
            java.lang.String r9 = r3.getString(r7, r8)
            if (r5 == 0) goto L_0x00e7
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 117
            int r10 = r5 % 128
            waitForCustomerUserId = r10
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = r13.AppsFlyer2dXConversionCallback
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r10 = 86
            int r10 = r10 / r4
            if (r5 == 0) goto L_0x00e7
            goto L_0x0052
        L_0x0048:
            r14 = move-exception
            throw r14
        L_0x004a:
            java.lang.String r5 = r13.AppsFlyer2dXConversionCallback
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00e7
        L_0x0052:
            boolean r5 = AFVersionDeclaration(r14)
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "phone"
            java.lang.Object r5 = r14.getSystemService(r5)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.Class r10 = r5.getClass()     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.String r11 = "getDeviceId"
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.Object r5 = r10.invoke(r5, r11)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            if (r5 == 0) goto L_0x0078
            r10 = 1
            goto L_0x0079
        L_0x0078:
            r10 = 0
        L_0x0079:
            if (r10 == 0) goto L_0x0087
            int r1 = waitForCustomerUserId
            int r1 = r1 + 65
            int r6 = r1 % 128
            setCustomerIdAndLogSession = r6
            int r1 = r1 % 2
            goto L_0x00f6
        L_0x0087:
            if (r9 == 0) goto L_0x008a
            r6 = 0
        L_0x008a:
            if (r6 == 0) goto L_0x008e
            r9 = r8
            goto L_0x00bf
        L_0x008e:
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            java.lang.String r5 = r1.concat(r5)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r5)     // Catch:{ InvocationTargetException -> 0x00c1, Exception -> 0x009a }
            goto L_0x00bf
        L_0x009a:
            r5 = move-exception
            if (r9 == 0) goto L_0x00a9
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String r1 = r1.concat(r6)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r1)
            goto L_0x00aa
        L_0x00a9:
            r9 = r8
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "WARNING: Can't collect IMEI: other reason: "
            r1.<init>(r6)
            java.lang.String r6 = r5.getMessage()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.valueOf(r1, r5)
        L_0x00bf:
            r5 = r9
            goto L_0x00f6
        L_0x00c1:
            r5 = move-exception
            if (r9 == 0) goto L_0x00d0
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String r1 = r1.concat(r6)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r1)
            goto L_0x00d1
        L_0x00d0:
            r9 = r8
        L_0x00d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "WARNING: Can't collect IMEI because of missing permissions: "
            r1.<init>(r6)
            java.lang.String r6 = r5.getMessage()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.valueOf(r1, r5)
            goto L_0x00bf
        L_0x00e7:
            java.lang.String r5 = r13.AppsFlyer2dXConversionCallback
            r1 = 19
            if (r5 == 0) goto L_0x00f0
            r6 = 23
            goto L_0x00f2
        L_0x00f0:
            r6 = 19
        L_0x00f2:
            if (r6 == r1) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r5 = r8
        L_0x00f6:
            if (r5 == 0) goto L_0x010b
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 29
            int r6 = r1 % 128
            waitForCustomerUserId = r6
            int r1 = r1 % 2
            valueOf((android.content.Context) r14, (java.lang.String) r7, (java.lang.String) r5)
            java.lang.String r1 = "imei"
            r15.put(r1, r5)
            goto L_0x0110
        L_0x010b:
            java.lang.String r1 = "IMEI was not collected."
            com.appsflyer.AFLogger.values((java.lang.String) r1)
        L_0x0110:
            java.lang.String r1 = "collectAndroidId"
            boolean r1 = r2.getBoolean(r1, r4)
            java.lang.String r2 = "androidIdCached"
            java.lang.String r3 = r3.getString(r2, r8)
            java.lang.String r4 = "android_id"
            if (r1 == 0) goto L_0x01a4
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 75
            int r5 = r1 % 128
            waitForCustomerUserId = r5
            int r1 = r1 % 2
            java.lang.String r1 = r13.init
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01a4
            boolean r1 = AFVersionDeclaration(r14)
            r5 = 59
            if (r1 == 0) goto L_0x013d
            r1 = 43
            goto L_0x013f
        L_0x013d:
            r1 = 59
        L_0x013f:
            if (r1 == r5) goto L_0x01b3
            android.content.ContentResolver r1 = r14.getContentResolver()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r4)     // Catch:{ Exception -> 0x0183 }
            r5 = 45
            if (r1 == 0) goto L_0x0150
            r6 = 56
            goto L_0x0152
        L_0x0150:
            r6 = 45
        L_0x0152:
            if (r6 == r5) goto L_0x0156
            r8 = r1
            goto L_0x01b3
        L_0x0156:
            if (r3 == 0) goto L_0x01b3
            int r1 = waitForCustomerUserId
            int r1 = r1 + 25
            int r5 = r1 % 128
            setCustomerIdAndLogSession = r5
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0176
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = r0.concat(r1)     // Catch:{ Exception -> 0x0183 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r1)     // Catch:{ Exception -> 0x0183 }
            int r0 = r8.length     // Catch:{ Exception -> 0x0173, all -> 0x0171 }
            goto L_0x0181
        L_0x0171:
            r14 = move-exception
            throw r14
        L_0x0173:
            r1 = move-exception
            r8 = r3
            goto L_0x0184
        L_0x0176:
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = r0.concat(r1)     // Catch:{ Exception -> 0x0183 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r1)     // Catch:{ Exception -> 0x0183 }
        L_0x0181:
            r8 = r3
            goto L_0x01b3
        L_0x0183:
            r1 = move-exception
        L_0x0184:
            if (r3 == 0) goto L_0x019c
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r5)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            int r0 = waitForCustomerUserId
            int r0 = r0 + 123
            int r5 = r0 % 128
            setCustomerIdAndLogSession = r5
            int r0 = r0 % 2
            r8 = r3
        L_0x019c:
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.valueOf(r0, r1)
            goto L_0x01b3
        L_0x01a4:
            java.lang.String r0 = r13.init
            if (r0 == 0) goto L_0x01b3
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 47
            int r3 = r1 % 128
            waitForCustomerUserId = r3
            int r1 = r1 % 2
            r8 = r0
        L_0x01b3:
            r0 = 83
            if (r8 == 0) goto L_0x01ba
            r1 = 13
            goto L_0x01bc
        L_0x01ba:
            r1 = 83
        L_0x01bc:
            if (r1 == r0) goto L_0x01cf
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 87
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            valueOf((android.content.Context) r14, (java.lang.String) r2, (java.lang.String) r8)
            r15.put(r4, r8)
            goto L_0x01d4
        L_0x01cf:
            java.lang.String r0 = "Android ID was not collected."
            com.appsflyer.AFLogger.values((java.lang.String) r0)
        L_0x01d4:
            com.appsflyer.internal.g r14 = com.appsflyer.internal.C0457ab.AFInAppEventType((android.content.Context) r14)
            if (r14 == 0) goto L_0x0205
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Boolean r1 = r14.AFInAppEventParameterName
            java.lang.String r2 = "isManual"
            r0.put(r2, r1)
            java.lang.String r1 = r14.values
            java.lang.String r2 = "val"
            r0.put(r2, r1)
            java.lang.Boolean r14 = r14.AFKeystoreWrapper
            if (r14 == 0) goto L_0x01f6
            java.lang.String r1 = "isLat"
            r0.put(r1, r14)
        L_0x01f6:
            java.lang.String r14 = "oaid"
            r15.put(r14, r0)
            int r14 = setCustomerIdAndLogSession
            int r14 = r14 + 119
            int r15 = r14 % 128
            waitForCustomerUserId = r15
            int r14 = r14 % 2
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.valueOf(android.content.Context, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean AFVersionDeclaration(android.content.Context r4) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r1) goto L_0x0014
            goto L_0x0037
        L_0x0014:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 57
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            java.lang.String r3 = "collectIMEIForceByUser"
            if (r0 == 0) goto L_0x002d
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 == 0) goto L_0x0043
            goto L_0x0037
        L_0x002d:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x0043
        L_0x0037:
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 83
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r3 = 77
            if (r0 != 0) goto L_0x004b
            r0 = 77
            goto L_0x004c
        L_0x004b:
            r0 = 6
        L_0x004c:
            if (r0 == r3) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            boolean r4 = init((android.content.Context) r4)
            if (r4 != 0) goto L_0x0056
        L_0x0055:
            return r1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFVersionDeclaration(android.content.Context):boolean");
    }

    public static boolean AFKeystoreWrapper(Context context) {
        if ((!AFInAppEventType(context).contains("appsFlyerCount") ? '+' : 25) == 25) {
            return false;
        }
        int i = setCustomerIdAndLogSession + 27;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        int i4 = i2 + 119;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private String onInstallConversionDataLoadedNative(Context context) {
        int i = setCustomerIdAndLogSession + 99;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String str = null;
        if ((AFInAppEventType2.contains("INSTALL_STORE") ? 'Y' : '0') != '0') {
            int i3 = setCustomerIdAndLogSession + 103;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            return AFInAppEventType2.getString("INSTALL_STORE", (String) null);
        }
        if (AFKeystoreWrapper(context)) {
            str = onDeepLinkingNative(context);
            int i5 = waitForCustomerUserId + 123;
            setCustomerIdAndLogSession = i5 % 128;
            int i6 = i5 % 2;
        }
        valueOf(context, "INSTALL_STORE", str);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return AFKeystoreWrapper(r4, "AF_STORE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r0 != null ? '@' : 'F') != 'F') goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String onDeepLinkingNative(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 47
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            java.lang.String r1 = "api_store_value"
            if (r0 == 0) goto L_0x0028
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            r1 = 81
            int r1 = r1 / 0
            r1 = 70
            if (r0 == 0) goto L_0x0021
            r2 = 64
            goto L_0x0023
        L_0x0021:
            r2 = 70
        L_0x0023:
            if (r2 == r1) goto L_0x0055
            goto L_0x0032
        L_0x0026:
            r4 = move-exception
            throw r4
        L_0x0028:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0055
        L_0x0032:
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 95
            int r1 = r4 % 128
            waitForCustomerUserId = r1
            int r4 = r4 % 2
            int r1 = r1 + 7
            int r4 = r1 % 128
            setCustomerIdAndLogSession = r4
            int r1 = r1 % 2
            r4 = 8
            if (r1 != 0) goto L_0x004b
            r1 = 8
            goto L_0x004d
        L_0x004b:
            r1 = 25
        L_0x004d:
            if (r1 == r4) goto L_0x0050
            return r0
        L_0x0050:
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x0053 }
            return r0
        L_0x0053:
            r4 = move-exception
            throw r4
        L_0x0055:
            java.lang.String r0 = "AF_STORE"
            java.lang.String r4 = r3.AFKeystoreWrapper((android.content.Context) r4, (java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.onDeepLinkingNative(android.content.Context):java.lang.String");
    }

    private static String values(String str) {
        Object obj;
        int i = waitForCustomerUserId + 13;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            try {
                obj = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            } catch (Throwable th) {
                AFLogger.valueOf(th.getMessage(), th);
                return null;
            }
        } else {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            Object[] objArr = new Object[1];
            objArr[1] = str;
            obj = method.invoke((Object) null, objArr);
        }
        return (String) obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String] */
    private String AFKeystoreWrapper(Context context, String str) {
        ? r0 = 0;
        if (context == null) {
            int i = waitForCustomerUserId + 101;
            setCustomerIdAndLogSession = i % 128;
            if ((i % 2 == 0 ? ']' : Typography.dollar) == '$') {
                return r0;
            }
            int length = r0.length;
            return r0;
        }
        C0518bf bfVar = this.setCustomerUserId;
        if ((context != null ? 21 : 'a') == 21) {
            int i2 = setCustomerIdAndLogSession + 27;
            waitForCustomerUserId = i2 % 128;
            int i3 = i2 % 2;
            C0517be beVar = bfVar.AFKeystoreWrapper;
            if ((context != null ? ',' : 'T') != 'T') {
                int i4 = setCustomerIdAndLogSession + 45;
                waitForCustomerUserId = i4 % 128;
                if (i4 % 2 != 0) {
                    beVar.values = context.getApplicationContext();
                    int length2 = r0.length;
                } else {
                    beVar.values = context.getApplicationContext();
                }
            }
        }
        return values().AFInAppEventType().AFInAppEventParameterName(str);
    }

    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.AFInAppEventParameterName("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        boolean z = true;
        if (str != null) {
            int i = setCustomerIdAndLogSession + 71;
            waitForCustomerUserId = i % 128;
            if (i % 2 != 0) {
                try {
                    jSONObject.put("pid", str);
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (JSONException e) {
                    AFLogger.valueOf(e.getMessage(), e);
                }
            } else {
                jSONObject.put("pid", str);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            int i2 = waitForCustomerUserId + 57;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            }
            values("preInstallName", jSONObject.toString());
            if (!z) {
                int i3 = 72 / 0;
                return;
            }
            return;
        }
        AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
    }

    private static void AFInAppEventType(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                int i = waitForCustomerUserId + 105;
                setCustomerIdAndLogSession = i % 128;
                int i2 = i % 2;
                values("preInstallName", str);
                return;
            }
            AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
            int i3 = waitForCustomerUserId + 25;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException e) {
            AFLogger.valueOf("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    private String onInstallConversionFailureNative(Context context) {
        File file;
        File AFLogger$LogLevel2 = AFLogger$LogLevel(values("ro.appsflyer.preinstall.path"));
        ? r2 = 0;
        if (AFInAppEventType(AFLogger$LogLevel2)) {
            int i = setCustomerIdAndLogSession + 69;
            waitForCustomerUserId = i % 128;
            if ((i % 2 != 0 ? 'A' : '*') != 'A') {
                AFLogger$LogLevel2 = AFLogger$LogLevel(AFKeystoreWrapper(context, "AF_PRE_INSTALL_PATH"));
            } else {
                AFLogger$LogLevel2 = AFLogger$LogLevel(AFKeystoreWrapper(context, "AF_PRE_INSTALL_PATH"));
                int length = r2.length;
            }
        }
        if ((AFInAppEventType(AFLogger$LogLevel2) ? '\\' : 23) != 23) {
            AFLogger$LogLevel2 = AFLogger$LogLevel("/data/local/tmp/pre_install.appsflyer");
        }
        boolean z = false;
        if (AFInAppEventType(file)) {
            int i2 = waitForCustomerUserId + 67;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 == 0) {
                file = AFLogger$LogLevel("/etc/pre_install.appsflyer");
                int i3 = 75 / 0;
            } else {
                file = AFLogger$LogLevel("/etc/pre_install.appsflyer");
            }
            int i4 = waitForCustomerUserId + 79;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!AFInAppEventType(file)) {
            z = true;
        }
        if (z) {
            return values(file, context.getPackageName());
        }
        int i6 = waitForCustomerUserId + 53;
        setCustomerIdAndLogSession = i6 % 128;
        int i7 = i6 % 2;
        return r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0044=Splitter:B:24:0x0044, B:33:0x005b=Splitter:B:33:0x005b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x005a, all -> 0x0042 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x005a, all -> 0x0042 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x005a, all -> 0x0042 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x005a, all -> 0x0042 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x005b, all -> 0x0040 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ FileNotFoundException -> 0x005b, all -> 0x0040 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x005b, all -> 0x0040 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.valueOf(r0, r5)
        L_0x0023:
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 37
            int r0 = r5 % 128
            waitForCustomerUserId = r0
            int r5 = r5 % 2
            r0 = 92
            if (r5 == 0) goto L_0x0034
            r5 = 67
            goto L_0x0036
        L_0x0034:
            r5 = 92
        L_0x0036:
            if (r5 == r0) goto L_0x003f
            r5 = 87
            int r5 = r5 / 0
            return r4
        L_0x003d:
            r4 = move-exception
            throw r4
        L_0x003f:
            return r4
        L_0x0040:
            r4 = move-exception
            goto L_0x0044
        L_0x0042:
            r4 = move-exception
            r2 = r0
        L_0x0044:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0076 }
            com.appsflyer.AFLogger.valueOf(r5, r4)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0075
        L_0x0051:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.valueOf(r5, r4)
            goto L_0x0075
        L_0x005a:
            r2 = r0
        L_0x005b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x0076 }
            r5.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0076 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r4)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0075:
            return r0
        L_0x0076:
            r4 = move-exception
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ all -> 0x007d }
            goto L_0x0086
        L_0x007d:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.valueOf(r0, r5)
            goto L_0x0090
        L_0x0086:
            int r5 = waitForCustomerUserId
            int r5 = r5 + 47
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % 2
        L_0x0090:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.values(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean AFInAppEventType(java.io.File r4) {
        /*
            int r0 = setCustomerIdAndLogSession
            int r1 = r0 + 63
            int r2 = r1 % 128
            waitForCustomerUserId = r2
            int r1 = r1 % 2
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            if (r3 == r1) goto L_0x0014
            goto L_0x003a
        L_0x0014:
            int r0 = r0 + 121
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            r3 = 26
            if (r0 == 0) goto L_0x0023
            r0 = 99
            goto L_0x0025
        L_0x0023:
            r0 = 26
        L_0x0025:
            boolean r4 = r4.exists()
            if (r0 == r3) goto L_0x0033
            r0 = 12
            int r0 = r0 / r2
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0031:
            r4 = move-exception
            throw r4
        L_0x0033:
            if (r4 != 0) goto L_0x0037
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r4 == 0) goto L_0x003b
        L_0x003a:
            return r1
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(java.io.File):boolean");
    }

    private static File AFLogger$LogLevel(String str) {
        if (str != null) {
            int i = setCustomerIdAndLogSession + 7;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.valueOf(th.getMessage(), th);
                return null;
            }
        }
        int i3 = setCustomerIdAndLogSession + 73;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
    private String onAttributionFailureNative(Context context) {
        String str;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String AFInAppEventParameterName2 = AFInAppEventParameterName("preInstallName");
        if ((AFInAppEventParameterName2 != null ? 'M' : 'a') != 'a') {
            int i = setCustomerIdAndLogSession + 27;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            return AFInAppEventParameterName2;
        }
        if (AFInAppEventType2.contains("preInstallName")) {
            int i3 = waitForCustomerUserId + 101;
            setCustomerIdAndLogSession = i3 % 128;
            ? r2 = 0;
            if (i3 % 2 == 0) {
                str = AFInAppEventType2.getString("preInstallName", r2);
                int length = r2.length;
            } else {
                str = AFInAppEventType2.getString("preInstallName", r2);
            }
        } else {
            if ((AFKeystoreWrapper(context) ? 4 : '0') == 4) {
                AFInAppEventParameterName2 = onInstallConversionFailureNative(context);
                if (AFInAppEventParameterName2 != null) {
                    int i4 = waitForCustomerUserId + 115;
                    setCustomerIdAndLogSession = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    AFInAppEventParameterName2 = AFKeystoreWrapper(context, "AF_PRE_INSTALL_NAME");
                }
            }
            if (AFInAppEventParameterName2 != null) {
                valueOf(context, "preInstallName", AFInAppEventParameterName2);
                int i6 = waitForCustomerUserId + 111;
                setCustomerIdAndLogSession = i6 % 128;
                int i7 = i6 % 2;
            }
            str = AFInAppEventParameterName2;
        }
        if ((str != null ? 'X' : '2') == 'X') {
            values("preInstallName", str);
        }
        return str;
    }

    private void onAppOpenAttributionNative(Context context) {
        if ((!this.onResponseError ? '9' : 26) != '9' || System.currentTimeMillis() - this.AFVersionDeclaration < 15000) {
            int i = waitForCustomerUserId + 85;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
        } else if (this.onAttributionFailure != null) {
            int i3 = setCustomerIdAndLogSession + 85;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (C0608k.values == null) {
                C0608k.values = new C0608k();
            }
            this.onAttributionFailure = C0608k.values.AFKeystoreWrapper();
            valueOf(this.onAttributionFailure, new C0469e(context), 1, TimeUnit.SECONDS);
        }
    }

    public final String AFInAppEventParameterName(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            int i = setCustomerIdAndLogSession + 71;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            string = AFKeystoreWrapper(context, "CHANNEL");
        }
        boolean z = true;
        if (string != null) {
            int i3 = setCustomerIdAndLogSession + 117;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            if (string.equals("")) {
                z = false;
            }
            if (z) {
                return string;
            }
            return null;
        }
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if ((r5.getPackageManager().getApplicationInfo(r5.getPackageName(), 0).flags | 0) != 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isPreInstalledApp(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 45
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0025
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r5 = r0.getApplicationInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0056 }
            int r5 = r5.flags     // Catch:{ NameNotFoundException -> 0x0056 }
            r5 = r5 & r1
            if (r5 == 0) goto L_0x005c
            goto L_0x0036
        L_0x0025:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r5 = r0.getApplicationInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0056 }
            int r5 = r5.flags     // Catch:{ NameNotFoundException -> 0x0056 }
            r5 = r5 | r2
            if (r5 == 0) goto L_0x005c
        L_0x0036:
            int r5 = waitForCustomerUserId
            int r5 = r5 + 123
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % 2
            r3 = 17
            if (r5 != 0) goto L_0x0047
            r5 = 17
            goto L_0x0049
        L_0x0047:
            r5 = 29
        L_0x0049:
            if (r5 == r3) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            int r0 = r0 + 119
            int r5 = r0 % 128
            waitForCustomerUserId = r5
            int r0 = r0 % 2
            return r1
        L_0x0056:
            r5 = move-exception
            java.lang.String r0 = "Could not check if app is pre installed"
            com.appsflyer.AFLogger.valueOf(r0, r5)
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.isPreInstalledApp(android.content.Context):boolean");
    }

    public final String AFInAppEventParameterName(Context context, String str) {
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        boolean z = true;
        if (!(!AFInAppEventType2.contains("CACHED_CHANNEL"))) {
            int i = waitForCustomerUserId + 111;
            setCustomerIdAndLogSession = i % 128;
            if (i % 2 == 0) {
                z = false;
            }
            String string = AFInAppEventType2.getString("CACHED_CHANNEL", (String) null);
            if (!z) {
                int i2 = 40 / 0;
            }
            return string;
        }
        valueOf(context, "CACHED_CHANNEL", str);
        int i3 = setCustomerIdAndLogSession + 71;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private String AFInAppEventType(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        int i = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String string = AFInAppEventType(context).getString("appsFlyerFirstInstall", (String) null);
        if ((string == null ? 1 : '.') != '.') {
            int i3 = setCustomerIdAndLogSession + 29;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            if (AFKeystoreWrapper(context)) {
                AFLogger.AFInAppEventParameterName("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            valueOf(context, "appsFlyerFirstInstall", string);
        }
        AFLogger.values("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventParameterName2 = new C0472ae(context).AFInAppEventParameterName();
            int i = waitForCustomerUserId + 73;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            return AFInAppEventParameterName2;
        } catch (Throwable th) {
            AFLogger.valueOf("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r1 == null) != true) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (AFInAppEventParameterName().getSdkVersion == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.content.SharedPreferences AFInAppEventType(android.content.Context r5) {
        /*
            java.lang.Class<com.appsflyer.internal.ac> r0 = com.appsflyer.internal.C0458ac.class
            monitor-enter(r0)
            int r1 = setCustomerIdAndLogSession     // Catch:{ all -> 0x005c }
            int r1 = r1 + 99
            int r2 = r1 % 128
            waitForCustomerUserId = r2     // Catch:{ all -> 0x005c }
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0013
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 == r3) goto L_0x0028
            com.appsflyer.internal.ac r1 = AFInAppEventParameterName()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r1 = r1.getSdkVersion     // Catch:{ all -> 0x005c }
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == r3) goto L_0x0030
            goto L_0x004a
        L_0x0026:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005c }
        L_0x0028:
            com.appsflyer.internal.ac r1 = AFInAppEventParameterName()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r1 = r1.getSdkVersion     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x004a
        L_0x0030:
            int r1 = waitForCustomerUserId     // Catch:{ all -> 0x005c }
            int r1 = r1 + 3
            int r3 = r1 % 128
            setCustomerIdAndLogSession = r3     // Catch:{ all -> 0x005c }
            int r1 = r1 % 2
            com.appsflyer.internal.ac r1 = AFInAppEventParameterName()     // Catch:{ all -> 0x005c }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "appsflyer-data"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r3, r2)     // Catch:{ all -> 0x005c }
            r1.getSdkVersion = r5     // Catch:{ all -> 0x005c }
        L_0x004a:
            com.appsflyer.internal.ac r5 = AFInAppEventParameterName()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r5 = r5.getSdkVersion     // Catch:{ all -> 0x005c }
            int r1 = setCustomerIdAndLogSession     // Catch:{ all -> 0x005c }
            int r1 = r1 + 19
            int r2 = r1 % 128
            waitForCustomerUserId = r2     // Catch:{ all -> 0x005c }
            int r1 = r1 % 2
            monitor-exit(r0)
            return r5
        L_0x005c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(android.content.Context):android.content.SharedPreferences");
    }

    public final C0535bv values(Context context) {
        C0518bf bfVar = this.setCustomerUserId;
        if (context != null) {
            C0517be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        Context context2 = this.setCustomerUserId.AFKeystoreWrapper.values;
        if (context2 != null) {
            return new C0515bc(AFInAppEventType(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final int valueOf(SharedPreferences sharedPreferences, boolean z) {
        int i = waitForCustomerUserId + 93;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int valueOf2 = valueOf(sharedPreferences, "appsFlyerCount", z);
        int i3 = waitForCustomerUserId + 61;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return valueOf2;
    }

    private int AFKeystoreWrapper(SharedPreferences sharedPreferences, boolean z) {
        int i = waitForCustomerUserId + 31;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int valueOf2 = valueOf(sharedPreferences, "appsFlyerInAppEventCount", z);
        int i3 = setCustomerIdAndLogSession + 39;
        waitForCustomerUserId = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return valueOf2;
        }
        int i4 = 81 / 0;
        return valueOf2;
    }

    private int valueOf(SharedPreferences sharedPreferences) {
        int i = waitForCustomerUserId + 69;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
        }
        return valueOf(sharedPreferences, "appsFlyerAdRevenueCount", true);
    }

    private static int valueOf(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = waitForCustomerUserId + 51;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int i3 = sharedPreferences.getInt(str, 0);
        if ((z ? '1' : 14) != 14) {
            int i4 = waitForCustomerUserId + 31;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            i3++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i3);
            AFInAppEventType(edit);
        }
        if (C0484ak.AFInAppEventType().AFVersionDeclaration()) {
            int i6 = waitForCustomerUserId + 25;
            setCustomerIdAndLogSession = i6 % 128;
            if ((i6 % 2 == 0 ? 17 : Typography.dollar) != 17) {
                C0484ak.AFInAppEventType().values(String.valueOf(i3));
            } else {
                C0484ak.AFInAppEventType().values(String.valueOf(i3));
                Object obj = null;
                super.hashCode();
            }
        }
        return i3;
    }

    private long onAppOpenAttribution(Context context) {
        long j;
        long j2;
        int i = setCustomerIdAndLogSession + 7;
        waitForCustomerUserId = i % 128;
        boolean z = false;
        if (i % 2 != 0) {
            j2 = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 1);
            j = System.currentTimeMillis();
            AFInAppEventType(context, "AppsFlyerTimePassedSincePrevLaunch", j);
            if (j2 > 1) {
                z = true;
            }
            if (!z) {
                return -1;
            }
        } else {
            j2 = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0);
            j = System.currentTimeMillis();
            AFInAppEventType(context, "AppsFlyerTimePassedSincePrevLaunch", j);
            if (j2 > 0) {
                z = true;
            }
            if (!z) {
                return -1;
            }
        }
        int i2 = setCustomerIdAndLogSession + 43;
        waitForCustomerUserId = i2 % 128;
        return ((i2 % 2 != 0 ? '0' : '-') != '-' ? j + j2 : j - j2) / 1000;
    }

    private void AFInAppEventParameterName(C0607i iVar) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(iVar.onDeepLinkingNative);
        AFLogger.values(sb.toString());
        if ((iVar.init != null ? (char) 29 : 22) != 22) {
            int i = setCustomerIdAndLogSession + 57;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            str = Base64.encodeToString(iVar.AFInAppEventParameterName(), 2);
            AFLogger.values("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(iVar.values()).toString();
            String replaceAll = str.replaceAll("\\p{C}", "*Non-printing character*");
            if ((!replaceAll.equals(str) ? Typography.dollar : 23) == '$') {
                AFLogger.AppsFlyer2dXConversionCallback("Payload contains non-printing characters");
                int i3 = setCustomerIdAndLogSession + 7;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                str = replaceAll;
            }
            C0482ai.AFKeystoreWrapper("data: ".concat(String.valueOf(str)));
        }
        C0484ak.AFInAppEventType().AFInAppEventType(iVar.onDeepLinkingNative, str);
        try {
            init(iVar);
        } catch (IOException e) {
            AFLogger.valueOf("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                init(iVar.AFInAppEventType(iVar.onDeepLinkingNative.replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.values(sb2.toString());
            throw e;
        }
    }

    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        C0484ak AFInAppEventType2 = C0484ak.AFInAppEventType();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str6;
        strArr[3] = str7;
        strArr[4] = str8;
        strArr[5] = map == null ? "" : map.toString();
        AFInAppEventType2.AFKeystoreWrapper("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            AFLogger.values(sb.toString());
        }
        if (str == null || str7 == null || str2 == null || str8 == null || str6 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (context2 instanceof Activity) {
            ((Activity) context2).getIntent();
        }
        new Thread(new C0470ad(applicationContext, devKey, str, str2, str3, str4, str5, map)).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if ((r3 != null ? (char) 6 : 23) != 23) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void valueOf(java.util.concurrent.ScheduledExecutorService r3, java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
        /*
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 19
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0017
            super.hashCode()     // Catch:{ RejectedExecutionException -> 0x0015, all -> 0x0013 }
            if (r3 == 0) goto L_0x0060
            goto L_0x0021
        L_0x0013:
            r3 = move-exception
            goto L_0x0066
        L_0x0015:
            r3 = move-exception
            goto L_0x006c
        L_0x0017:
            r0 = 23
            if (r3 == 0) goto L_0x001d
            r2 = 6
            goto L_0x001f
        L_0x001d:
            r2 = 23
        L_0x001f:
            if (r2 == r0) goto L_0x0060
        L_0x0021:
            boolean r0 = r3.isShutdown()     // Catch:{ RejectedExecutionException -> 0x0015, all -> 0x0013 }
            if (r0 != 0) goto L_0x0060
            int r0 = waitForCustomerUserId
            int r0 = r0 + 83
            int r2 = r0 % 128
            setCustomerIdAndLogSession = r2
            int r0 = r0 % 2
            boolean r0 = r3.isTerminated()     // Catch:{ RejectedExecutionException -> 0x0015, all -> 0x0013 }
            if (r0 != 0) goto L_0x0060
            int r0 = waitForCustomerUserId
            int r0 = r0 + 25
            int r2 = r0 % 128
            setCustomerIdAndLogSession = r2
            int r0 = r0 % 2
            r3.schedule(r4, r5, r7)     // Catch:{ RejectedExecutionException -> 0x0015, all -> 0x0013 }
            int r3 = setCustomerIdAndLogSession
            int r3 = r3 + 3
            int r4 = r3 % 128
            waitForCustomerUserId = r4
            int r3 = r3 % 2
            r4 = 43
            if (r3 == 0) goto L_0x0055
            r3 = 44
            goto L_0x0057
        L_0x0055:
            r3 = 43
        L_0x0057:
            if (r3 == r4) goto L_0x005f
            super.hashCode()     // Catch:{ all -> 0x005d }
            return
        L_0x005d:
            r3 = move-exception
            throw r3
        L_0x005f:
            return
        L_0x0060:
            java.lang.String r3 = "scheduler is null, shut downed or terminated"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r3)     // Catch:{ RejectedExecutionException -> 0x0015, all -> 0x0013 }
            return
        L_0x0066:
            java.lang.String r4 = "scheduleJob failed with Exception"
            com.appsflyer.AFLogger.valueOf(r4, r3)
            return
        L_0x006c:
            java.lang.String r4 = "scheduleJob failed with RejectedExecutionException Exception"
            com.appsflyer.AFLogger.valueOf(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.valueOf(java.util.concurrent.ScheduledExecutorService, java.lang.Runnable, long, java.util.concurrent.TimeUnit):void");
    }

    public final boolean isStopped() {
        int i = waitForCustomerUserId + 89;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? Typography.dollar : 'U') != '$') {
            return this.getInstance;
        }
        boolean z = this.getInstance;
        Object obj = null;
        super.hashCode();
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[SYNTHETIC, Splitter:B:30:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFInAppEventParameterName(java.net.HttpURLConnection r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 92
            java.io.InputStream r5 = r10.getErrorStream()     // Catch:{ all -> 0x0059 }
            r6 = 15
            if (r5 != 0) goto L_0x0015
            r7 = 92
            goto L_0x0017
        L_0x0015:
            r7 = 15
        L_0x0017:
            if (r7 == r6) goto L_0x001d
            java.io.InputStream r5 = r10.getInputStream()     // Catch:{ all -> 0x0059 }
        L_0x001d:
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0059 }
            r6.<init>(r5)     // Catch:{ all -> 0x0059 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0057 }
            r5.<init>(r6)     // Catch:{ all -> 0x0057 }
            int r2 = waitForCustomerUserId
            int r2 = r2 + 111
            int r7 = r2 % 128
            setCustomerIdAndLogSession = r7
            int r2 = r2 % 2
            r2 = 0
        L_0x0032:
            java.lang.String r7 = r5.readLine()     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x0041
            r2 = 10
            java.lang.Character r2 = java.lang.Character.valueOf(r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0043
        L_0x0041:
            java.lang.String r2 = ""
        L_0x0043:
            r0.append(r2)     // Catch:{ all -> 0x0052 }
            r0.append(r7)     // Catch:{ all -> 0x0052 }
            r2 = 1
            goto L_0x0032
        L_0x004b:
            r5.close()     // Catch:{ all -> 0x007a }
            r6.close()     // Catch:{ all -> 0x007a }
            goto L_0x0089
        L_0x0052:
            r2 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x005b
        L_0x0057:
            r5 = move-exception
            goto L_0x005b
        L_0x0059:
            r5 = move-exception
            r6 = r2
        L_0x005b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            java.lang.String r8 = "Could not read connection response from: "
            r7.<init>(r8)     // Catch:{ all -> 0x00ac }
            java.net.URL r10 = r10.getURL()     // Catch:{ all -> 0x00ac }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ac }
            r7.append(r10)     // Catch:{ all -> 0x00ac }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x00ac }
            com.appsflyer.AFLogger.valueOf(r10, r5)     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ all -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r10 = move-exception
            goto L_0x0086
        L_0x007c:
            if (r6 == 0) goto L_0x007f
            r1 = 1
        L_0x007f:
            if (r1 == r3) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            r6.close()     // Catch:{ all -> 0x007a }
            goto L_0x0089
        L_0x0086:
            com.appsflyer.AFLogger.values((java.lang.Throwable) r10)
        L_0x0089:
            java.lang.String r10 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0093 }
            r0.<init>(r10)     // Catch:{ JSONException -> 0x0093 }
            return r10
        L_0x0093:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r10)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r10 = r0.toString()     // Catch:{ JSONException -> 0x00a2 }
            return r10
        L_0x00a2:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r10 = r10.toString()
            return r10
        L_0x00ac:
            r10 = move-exception
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b5
        L_0x00b3:
            r0 = move-exception
            goto L_0x00cc
        L_0x00b5:
            if (r6 == 0) goto L_0x00ba
            r0 = 92
            goto L_0x00bc
        L_0x00ba:
            r0 = 41
        L_0x00bc:
            if (r0 != r4) goto L_0x00cf
            r6.close()     // Catch:{ all -> 0x00b3 }
            int r0 = waitForCustomerUserId
            int r0 = r0 + 13
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            goto L_0x00cf
        L_0x00cc:
            com.appsflyer.AFLogger.values((java.lang.Throwable) r0)
        L_0x00cf:
            goto L_0x00d1
        L_0x00d0:
            throw r10
        L_0x00d1:
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventParameterName(java.net.HttpURLConnection):java.lang.String");
    }

    private static float onResponseNative(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            boolean z = true;
            if (!(intExtra == -1)) {
                if (intExtra2 == -1) {
                    z = false;
                }
                if (z) {
                    float f = (((float) intExtra) / ((float) intExtra2)) * 100.0f;
                    int i = waitForCustomerUserId + 101;
                    setCustomerIdAndLogSession = i % 128;
                    int i2 = i % 2;
                    return f;
                }
            }
            int i3 = setCustomerIdAndLogSession + 47;
            waitForCustomerUserId = i3 % 128;
            if ((i3 % 2 != 0 ? 'F' : 'c') != 'F') {
                return 50.0f;
            }
            int i4 = 23 / 0;
            return 50.0f;
        } catch (Throwable th) {
            AFLogger.valueOf(th.getMessage(), th);
            return 1.0f;
        }
    }

    private static boolean onConversionDataSuccess(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                int i = setCustomerIdAndLogSession + 69;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4)) {
                            if (!networkCapabilities2.hasCapability(15)) {
                                int i3 = setCustomerIdAndLogSession + 47;
                                waitForCustomerUserId = i3 % 128;
                                if (i3 % 2 != 0) {
                                }
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.valueOf("Failed collecting ivc data", e);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (true) {
                        if (!(it.hasNext())) {
                            return arrayList.contains("tun0");
                        }
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            int i4 = waitForCustomerUserId + 119;
                            setCustomerIdAndLogSession = i4 % 128;
                            if (i4 % 2 == 0) {
                                arrayList.add(networkInterface.getName());
                                Object[] objArr = null;
                                int length = objArr.length;
                            } else {
                                arrayList.add(networkInterface.getName());
                            }
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.valueOf("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLogLevel(com.appsflyer.AFLogger.LogLevel r5) {
        /*
            r4 = this;
            int r0 = r5.getLevel()
            com.appsflyer.AFLogger$LogLevel r1 = com.appsflyer.AFLogger.LogLevel.NONE
            int r1 = r1.getLevel()
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L_0x0026
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 53
            int r1 = r0 % 128
            waitForCustomerUserId = r1
            int r0 = r0 % 2
            r1 = 40
            if (r0 == 0) goto L_0x001f
            r0 = 66
            goto L_0x0021
        L_0x001f:
            r0 = 40
        L_0x0021:
            if (r0 == r1) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.appsflyer.internal.ak r1 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "log"
            r1.AFKeystoreWrapper(r0, r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            int r5 = r5.getLevel()
            java.lang.String r1 = "logLevel"
            r0.set((java.lang.String) r1, (int) r5)
            int r5 = waitForCustomerUserId
            int r5 = r5 + 57
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % 2
            r0 = 45
            if (r5 != 0) goto L_0x0056
            r5 = 45
            goto L_0x0058
        L_0x0056:
            r5 = 89
        L_0x0058:
            if (r5 == r0) goto L_0x005b
            return
        L_0x005b:
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.setLogLevel(com.appsflyer.AFLogger$LogLevel):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r5 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r5 != null ? (char) 29 : 2) != 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setHost(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = waitForCustomerUserId
            int r0 = r0 + 103
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r0 = 48
            int r0 = r0 / r2
            if (r5 == 0) goto L_0x0015
            r0 = 29
            goto L_0x0016
        L_0x0015:
            r0 = 2
        L_0x0016:
            if (r0 == r1) goto L_0x002b
            goto L_0x001d
        L_0x0019:
            r5 = move-exception
            throw r5
        L_0x001b:
            if (r5 == 0) goto L_0x002b
        L_0x001d:
            java.lang.String r0 = "custom_host_prefix"
            values((java.lang.String) r0, (java.lang.String) r5)
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 35
            int r0 = r5 % 128
            waitForCustomerUserId = r0
            int r5 = r5 % r1
        L_0x002b:
            r5 = 83
            r0 = 47
            if (r6 == 0) goto L_0x0034
            r3 = 83
            goto L_0x0036
        L_0x0034:
            r3 = 47
        L_0x0036:
            if (r3 == r5) goto L_0x0039
            goto L_0x0060
        L_0x0039:
            boolean r5 = r6.isEmpty()
            r3 = 1
            if (r5 != 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x0060
            int r5 = waitForCustomerUserId
            int r5 = r5 + r0
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % r1
            if (r5 != 0) goto L_0x0050
            r2 = 1
        L_0x0050:
            java.lang.String r5 = "custom_host"
            if (r2 == 0) goto L_0x005c
            values((java.lang.String) r5, (java.lang.String) r6)
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r5 = move-exception
            throw r5
        L_0x005c:
            values((java.lang.String) r5, (java.lang.String) r6)
            return
        L_0x0060:
            java.lang.String r5 = "hostName cannot be null or empty"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.setHost(java.lang.String, java.lang.String):void");
    }

    public final String getHostName() {
        int i = waitForCustomerUserId + 11;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName("custom_host");
        boolean z = true;
        if (!(AFInAppEventParameterName2 != null)) {
            return "appsflyer.com";
        }
        int i3 = waitForCustomerUserId + 121;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return AFInAppEventParameterName2;
        }
        int i4 = 62 / 0;
        return AFInAppEventParameterName2;
    }

    public final String getHostPrefix() {
        int i = waitForCustomerUserId + 3;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName("custom_host_prefix");
        boolean z = true;
        if (!(AFInAppEventParameterName2 != null)) {
            return "";
        }
        int i3 = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return AFInAppEventParameterName2;
        }
        int i4 = 72 / 0;
        return AFInAppEventParameterName2;
    }

    public final void setMinTimeBetweenSessions(int i) {
        int i2 = setCustomerIdAndLogSession + 13;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        this.onConversionDataSuccess = TimeUnit.SECONDS.toMillis((long) i);
        int i4 = waitForCustomerUserId + 37;
        setCustomerIdAndLogSession = i4 % 128;
        if (!(i4 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public final C0580dd[] valueOf() {
        C0580dd[] ddVarArr;
        int i = setCustomerIdAndLogSession + 51;
        waitForCustomerUserId = i % 128;
        boolean z = true;
        if (!(i % 2 != 0)) {
            ddVarArr = values().AFLogger$LogLevel().AFInAppEventType();
        } else {
            ddVarArr = values().AFLogger$LogLevel().AFInAppEventType();
            int i2 = 90 / 0;
        }
        int i3 = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return ddVarArr;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return ddVarArr;
    }

    /* renamed from: com.appsflyer.internal.ac$b */
    class C0467b implements Runnable {
        private final C0607i values;

        /* synthetic */ C0467b(C0458ac acVar, C0607i iVar, byte b) {
            this(iVar);
        }

        private C0467b(C0607i iVar) {
            this.values = iVar;
        }

        public final void run() {
            C0458ac.AFInAppEventParameterName(C0458ac.this, this.values);
        }
    }

    /* renamed from: com.appsflyer.internal.ac$d */
    class C0468d implements Runnable {
        private final C0607i AFInAppEventType;

        /* synthetic */ C0468d(C0458ac acVar, C0607i iVar, byte b) {
            this(iVar);
        }

        private C0468d(C0607i iVar) {
            this.AFInAppEventType = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte[]} */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0197, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0198, code lost:
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0.getMessage(), r0);
            r2 = r1.AFInAppEventType.AFInAppEventParameterName;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a3, code lost:
            if (r2 != null) goto L_0x01a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a5, code lost:
            r2.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b0, code lost:
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e3, code lost:
            r0.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r12.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0197 A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:39:0x011c] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                com.appsflyer.internal.i r0 = r1.AFInAppEventType
                boolean r0 = r0.valueOf()
                com.appsflyer.internal.ac r2 = com.appsflyer.internal.C0458ac.this
                boolean r2 = r2.isStopped()
                if (r2 == 0) goto L_0x001e
                com.appsflyer.internal.i r0 = r1.AFInAppEventType
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFInAppEventParameterName
                if (r0 == 0) goto L_0x001d
                int r2 = com.appsflyer.attribution.RequestError.STOP_TRACKING
                java.lang.String r3 = com.appsflyer.internal.C0513ba.values
                r0.onError(r2, r3)
            L_0x001d:
                return
            L_0x001e:
                com.appsflyer.internal.i r2 = r1.AFInAppEventType
                java.util.Map r2 = r2.values()
                com.appsflyer.internal.i r3 = r1.AFInAppEventType
                java.lang.String r3 = r3.onDeepLinkingNative
                com.appsflyer.internal.i r4 = r1.AFInAppEventType
                int r4 = r4.onInstallConversionFailureNative
                com.appsflyer.internal.i r5 = r1.AFInAppEventType
                android.app.Application r9 = r5.AFKeystoreWrapper
                r5 = 0
                byte[] r6 = new byte[r5]
                r7 = 1
                r8 = 2
                if (r0 == 0) goto L_0x00f9
                if (r4 > r8) goto L_0x00f9
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.appsflyer.internal.ac r10 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.dd[] r10 = r10.valueOf()
                int r11 = r10.length
                r12 = 0
            L_0x0046:
                if (r12 >= r11) goto L_0x00a4
                r13 = r10[r12]
                boolean r14 = r13 instanceof com.appsflyer.internal.C0568cx
                int[] r15 = com.appsflyer.internal.C0458ac.C04669.AFKeystoreWrapper
                com.appsflyer.internal.dd$d r5 = r13.AFInAppEventParameterName
                int r5 = r5.ordinal()
                r5 = r15[r5]
                if (r5 == r7) goto L_0x007e
                if (r5 == r8) goto L_0x005b
                goto L_0x00a0
            L_0x005b:
                if (r4 != r8) goto L_0x00a0
                if (r14 != 0) goto L_0x00a0
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r14 = "source"
                java.lang.String r13 = r13.AFKeystoreWrapper
                r5.put(r14, r13)
                java.lang.String r13 = "response"
                java.lang.String r14 = "TIMEOUT"
                r5.put(r13, r14)
                com.appsflyer.internal.da r13 = new com.appsflyer.internal.da
                r13.<init>()
                r5.putAll(r13)
                r0.add(r5)
                goto L_0x00a0
            L_0x007e:
                if (r14 == 0) goto L_0x009b
                java.lang.String r5 = "rfr"
                r14 = r13
                com.appsflyer.internal.cx r14 = (com.appsflyer.internal.C0568cx) r14
                java.util.Map<java.lang.String, java.lang.Object> r14 = r14.valueOf
                r2.put(r5, r14)
                android.content.SharedPreferences r5 = com.appsflyer.internal.C0458ac.AFInAppEventType((android.content.Context) r9)
                android.content.SharedPreferences$Editor r5 = r5.edit()
                java.lang.String r14 = "newGPReferrerSent"
                android.content.SharedPreferences$Editor r5 = r5.putBoolean(r14, r7)
                r5.apply()
            L_0x009b:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r13.AFInAppEventType
                r0.add(r5)
            L_0x00a0:
                int r12 = r12 + 1
                r5 = 0
                goto L_0x0046
            L_0x00a4:
                boolean r4 = r0.isEmpty()
                if (r4 != 0) goto L_0x00af
                java.lang.String r4 = "referrers"
                r2.put(r4, r0)
            L_0x00af:
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                java.util.Map r0 = com.appsflyer.internal.C0458ac.AFKeystoreWrapper((com.appsflyer.internal.C0458ac) r0)
                if (r0 == 0) goto L_0x00c2
                java.lang.String r0 = "fb_ddl"
                com.appsflyer.internal.ac r4 = com.appsflyer.internal.C0458ac.this
                java.util.Map r4 = com.appsflyer.internal.C0458ac.AFKeystoreWrapper((com.appsflyer.internal.C0458ac) r4)
                r2.put(r0, r4)
            L_0x00c2:
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.dc r0 = com.appsflyer.internal.C0458ac.valueOf((com.appsflyer.internal.C0458ac) r0)
                if (r0 == 0) goto L_0x00f9
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.dc r0 = com.appsflyer.internal.C0458ac.valueOf((com.appsflyer.internal.C0458ac) r0)
                boolean r0 = r0.AFKeystoreWrapper()
                if (r0 == 0) goto L_0x00ee
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.dc r0 = com.appsflyer.internal.C0458ac.valueOf((com.appsflyer.internal.C0458ac) r0)
                java.util.List r0 = r0.values()
                if (r0 == 0) goto L_0x00f9
                boolean r4 = r0.isEmpty()
                if (r4 != 0) goto L_0x00f9
                java.lang.String r4 = "preload_id"
                r2.put(r4, r0)
                goto L_0x00f9
            L_0x00ee:
                java.lang.String r0 = "preload_id"
                java.lang.String r4 = "timeout"
                java.util.List r4 = java.util.Collections.singletonList(r4)
                r2.put(r0, r4)
            L_0x00f9:
                com.appsflyer.internal.i r0 = r1.AFInAppEventType
                boolean r0 = r0 instanceof com.appsflyer.internal.C0555ck
                if (r0 != 0) goto L_0x011c
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.bf r0 = com.appsflyer.internal.C0458ac.values((com.appsflyer.internal.C0458ac) r0)
                com.appsflyer.internal.ca r0 = r0.init()
                com.appsflyer.internal.d$d r4 = new com.appsflyer.internal.d$d
                com.appsflyer.internal.be r5 = r0.AFInAppEventType
                android.content.Context r5 = r5.values
                r4.<init>(r2, r5)
                r2.putAll(r4)
                java.util.Map r0 = r0.AFInAppEventParameterName()
                r2.putAll(r0)
            L_0x011c:
                com.appsflyer.internal.i r0 = r1.AFInAppEventType     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                boolean r0 = r0 instanceof com.appsflyer.internal.C0555ck     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                if (r0 == 0) goto L_0x012b
                java.lang.String r0 = "af_key"
                java.lang.Object r0 = r2.get(r0)     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                goto L_0x0133
            L_0x012b:
                java.lang.String r0 = "appsflyerKey"
                java.lang.Object r0 = r2.get(r0)     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
            L_0x0133:
                com.appsflyer.internal.i r4 = r1.AFInAppEventType     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                r4.AFVersionDeclaration = r0     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                monitor-enter(r2)     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                com.appsflyer.internal.i r4 = r1.AFInAppEventType     // Catch:{ all -> 0x0194 }
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x018b }
                r5[r7] = r0     // Catch:{ all -> 0x018b }
                r0 = 0
                r5[r0] = r4     // Catch:{ all -> 0x018b }
                int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x018b }
                int r4 = r4 >> 16
                int r4 = r4 + 24
                int r10 = android.view.KeyEvent.getDeadChar(r0, r0)     // Catch:{ all -> 0x018b }
                int r10 = r10 + 48
                long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x018b }
                r13 = 0
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                int r0 = r0 + 14196
                char r0 = (char) r0     // Catch:{ all -> 0x018b }
                java.lang.Object r0 = com.appsflyer.internal.C0599e.AFInAppEventParameterName(r4, r10, r0)     // Catch:{ all -> 0x018b }
                java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x018b }
                java.lang.String r4 = "AFInAppEventType"
                java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x018b }
                java.lang.Class<com.appsflyer.internal.i> r10 = com.appsflyer.internal.C0607i.class
                r11 = 0
                r8[r11] = r10     // Catch:{ all -> 0x018b }
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r8[r7] = r10     // Catch:{ all -> 0x018b }
                java.lang.reflect.Method r0 = r0.getMethod(r4, r8)     // Catch:{ all -> 0x018b }
                r4 = 0
                java.lang.Object r0 = r0.invoke(r4, r5)     // Catch:{ all -> 0x018b }
                r4 = r0
                byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x018b }
                monitor-exit(r2)     // Catch:{ all -> 0x0188 }
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this     // Catch:{ IOException -> 0x0184, all -> 0x0197 }
                com.appsflyer.internal.i r2 = r1.AFInAppEventType     // Catch:{ IOException -> 0x0184, all -> 0x0197 }
                r2.AFLogger$LogLevel = r4     // Catch:{ IOException -> 0x0184, all -> 0x0197 }
                com.appsflyer.internal.C0458ac.AFInAppEventType((com.appsflyer.internal.C0458ac) r0, (com.appsflyer.internal.C0607i) r2)     // Catch:{ IOException -> 0x0184, all -> 0x0197 }
                return
            L_0x0184:
                r0 = move-exception
                r12 = r0
                r6 = r4
                goto L_0x01b1
            L_0x0188:
                r0 = move-exception
                r6 = r4
                goto L_0x0195
            L_0x018b:
                r0 = move-exception
                java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0194 }
                if (r4 == 0) goto L_0x0193
                throw r4     // Catch:{ all -> 0x0194 }
            L_0x0193:
                throw r0     // Catch:{ all -> 0x0194 }
            L_0x0194:
                r0 = move-exception
            L_0x0195:
                monitor-exit(r2)     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
                throw r0     // Catch:{ IOException -> 0x01af, all -> 0x0197 }
            L_0x0197:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                com.appsflyer.AFLogger.AFInAppEventParameterName((java.lang.String) r2, (java.lang.Throwable) r0)
                com.appsflyer.internal.i r2 = r1.AFInAppEventType
                com.appsflyer.attribution.AppsFlyerRequestListener r2 = r2.AFInAppEventParameterName
                if (r2 == 0) goto L_0x01ae
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r0 = r0.getMessage()
                r2.onError(r3, r0)
            L_0x01ae:
                return
            L_0x01af:
                r0 = move-exception
                r12 = r0
            L_0x01b1:
                java.lang.String r0 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.valueOf(r0, r12)
                if (r6 == 0) goto L_0x01dd
                if (r9 == 0) goto L_0x01dd
                java.lang.String r0 = "&isCachedRequest=true&timeincache="
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L_0x01dd
                com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.bg r0 = r0.values()
                com.appsflyer.internal.l r0 = r0.AFVersionDeclaration()
                com.appsflyer.internal.n r2 = new com.appsflyer.internal.n
                java.lang.String r4 = "6.5.3"
                r2.<init>(r3, r6, r4)
                r0.AFInAppEventParameterName(r2)
                java.lang.String r0 = r12.getMessage()
                com.appsflyer.AFLogger.valueOf(r0, r12)
            L_0x01dd:
                com.appsflyer.internal.i r0 = r1.AFInAppEventType
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFInAppEventParameterName
                if (r0 == 0) goto L_0x01ec
                int r2 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r3 = r12.getMessage()
                r0.onError(r2, r3)
            L_0x01ec:
                com.appsflyer.internal.ac r6 = com.appsflyer.internal.C0458ac.this
                com.appsflyer.internal.i r7 = r1.AFInAppEventType
                java.lang.String r8 = r7.AFVersionDeclaration
                android.content.SharedPreferences r10 = com.appsflyer.internal.C0458ac.AFInAppEventType((android.content.Context) r9)
                r11 = 0
                com.appsflyer.internal.C0551cg.AFInAppEventType(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.C0468d.run():void");
        }
    }

    /* renamed from: com.appsflyer.internal.ac$9 */
    static /* synthetic */ class C04669 {
        static final /* synthetic */ int[] AFKeystoreWrapper;
        static final /* synthetic */ int[] values;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.appsflyer.internal.dd$d[] r0 = com.appsflyer.internal.C0580dd.C0582d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFKeystoreWrapper = r0
                r1 = 1
                com.appsflyer.internal.dd$d r2 = com.appsflyer.internal.C0580dd.C0582d.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = AFKeystoreWrapper     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.dd$d r3 = com.appsflyer.internal.C0580dd.C0582d.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                values = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r3 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = values     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.C04669.<clinit>():void");
        }
    }

    /* renamed from: com.appsflyer.internal.ac$e */
    class C0469e implements Runnable {
        private final Application AFKeystoreWrapper;

        public C0469e(Context context) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }

        public final void run() {
            if (!C0458ac.AFInAppEventType(C0458ac.this)) {
                C0458ac.this.AFVersionDeclaration = System.currentTimeMillis();
                C0458ac.values(C0458ac.this, true);
                try {
                    String devKey = AppsFlyerProperties.getInstance().getDevKey();
                    for (C0614n next : C0458ac.this.values().AFVersionDeclaration().AFInAppEventType()) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(next.valueOf);
                        AFLogger.values(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(next.AFInAppEventParameterName, 10);
                            C0458ac acVar = C0458ac.this;
                            C0558cn cnVar = new C0558cn();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next.valueOf);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            C0607i AFInAppEventType2 = cnVar.AFInAppEventType(sb2.toString());
                            AFInAppEventType2.AFLogger$LogLevel = next.AFInAppEventParameterName();
                            AFInAppEventType2.AFVersionDeclaration = devKey;
                            Application application = this.AFKeystoreWrapper;
                            if (application != null) {
                                AFInAppEventType2.AFKeystoreWrapper = (Application) application.getApplicationContext();
                            }
                            AFInAppEventType2.init = next.AFInAppEventParameterName;
                            C0458ac.AFInAppEventType(acVar, AFInAppEventType2);
                        } catch (Exception e) {
                            AFLogger.valueOf("Failed to resend cached request", e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.valueOf("failed to check cache. ", e2);
                } catch (Throwable th) {
                    C0458ac.values(C0458ac.this, false);
                    throw th;
                }
                C0458ac.values(C0458ac.this, false);
                C0458ac.getLevel(C0458ac.this).shutdown();
                C0458ac.AFInAppEventParameterName(C0458ac.this, (ScheduledExecutorService) null);
            }
        }
    }

    public final void setPartnerData(String str, Map<String, Object> map) {
        String str2;
        int i = waitForCustomerUserId + 103;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (this.setImeiData == null) {
            this.setImeiData = new C0512az();
        }
        C0512az azVar = this.setImeiData;
        if (str != null) {
            if ((str.isEmpty() ? 'Z' : '`') == '`') {
                boolean z = true;
                if (!(map == null)) {
                    if ((map.isEmpty() ? 'T' : 'S') == 'S') {
                        StringBuilder sb = new StringBuilder("Setting partner data for ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(map);
                        AFLogger.AFInAppEventParameterName(sb.toString());
                        int length = new JSONObject(map).toString().length();
                        if (length > 1000) {
                            AFLogger.AppsFlyer2dXConversionCallback("Partner data 1000 characters limit exceeded");
                            HashMap hashMap = new HashMap();
                            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                            azVar.valueOf.put(str, hashMap);
                            return;
                        }
                        azVar.values.put(str, map);
                        azVar.valueOf.remove(str);
                        return;
                    }
                }
                if (azVar.values.remove(str) == null) {
                    z = false;
                }
                if (z) {
                    str2 = "Cleared partner data for ".concat(String.valueOf(str));
                } else {
                    int i3 = waitForCustomerUserId + 121;
                    int i4 = i3 % 128;
                    setCustomerIdAndLogSession = i4;
                    if (i3 % 2 == 0) {
                        int i5 = 32 / 0;
                    }
                    int i6 = i4 + 59;
                    waitForCustomerUserId = i6 % 128;
                    int i7 = i6 % 2;
                    str2 = "Partner data is missing or `null`";
                }
                AFLogger.AppsFlyer2dXConversionCallback(str2);
                int i8 = waitForCustomerUserId + 67;
                setCustomerIdAndLogSession = i8 % 128;
                if (i8 % 2 == 0) {
                    Object obj = null;
                    super.hashCode();
                    return;
                }
                return;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("Partner ID is missing or `null`");
    }

    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        C0518bf bfVar = this.setCustomerUserId;
        if (context != null) {
            C0517be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        C0559co coVar = new C0559co();
        if (context != null) {
            coVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        coVar.getLevel = str;
        coVar.AFInAppEventParameterName = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.valueOf("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            coVar.AFInAppEventParameterName(singletonMap);
        }
        coVar.values = hashMap;
        C0484ak AppsFlyer2dXConversionCallback2 = values().AppsFlyer2dXConversionCallback();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(coVar.values == null ? new HashMap() : coVar.values).toString();
        AppsFlyer2dXConversionCallback2.AFKeystoreWrapper("logEvent", strArr);
        if (str != null) {
            C0620w.AFKeystoreWrapper(context).AFInAppEventType();
        } else {
            AFInAppEventParameterName(context, C0552ch.logEvent);
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        AFKeystoreWrapper((C0607i) coVar, activity);
    }

    private void AFKeystoreWrapper(C0607i iVar) {
        C0607i iVar2 = iVar;
        Application application = iVar2.AFKeystoreWrapper;
        String format = String.format(onInstallConversionFailureNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()});
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(application.getPackageName());
        String obj = sb.toString();
        SharedPreferences AFInAppEventType2 = AFInAppEventType((Context) application);
        int valueOf2 = valueOf(AFInAppEventType2, false);
        int valueOf3 = valueOf(AFInAppEventType2);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", iVar2.values);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf3));
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        hashMap.put("af_key", devKey);
        hashMap.put("launch_counter", Integer.valueOf(valueOf2));
        String str = devKey;
        int i = valueOf2;
        hashMap.put(values("ᳲ洀Ｆ䤸?┷띈œ鍏ᵯ潬磻", 29172 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))).intern(), Long.toString(new Date().getTime()));
        hashMap.put("uid", C0473af.valueOf(new WeakReference(application)));
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (string2 != null) {
            int i2 = waitForCustomerUserId + 69;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 == 0) {
                hashMap.put("advertiserIdEnabled", string2);
                Object obj2 = null;
                try {
                    super.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashMap.put("advertiserIdEnabled", string2);
            }
        }
        if (string != null) {
            boolean z = true;
            int i3 = setCustomerIdAndLogSession + 1;
            waitForCustomerUserId = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            if (z) {
                hashMap.put("advertiserId", string);
            } else {
                hashMap.put("advertiserId", string);
                try {
                    int i4 = 35 / 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        hashMap.put("device", Build.DEVICE);
        values((Context) application, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            hashMap.put("install_date", valueOf(simpleDateFormat, packageInfo.firstInstallTime));
            String string3 = AFInAppEventType2.getString("appsFlyerFirstInstall", (String) null);
            if ((string3 == null ? 12 : '?') == 12) {
                int i5 = setCustomerIdAndLogSession + 23;
                waitForCustomerUserId = i5 % 128;
                if (i5 % 2 != 0) {
                    string3 = AFInAppEventType(simpleDateFormat, (Context) application);
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    string3 = AFInAppEventType(simpleDateFormat, (Context) application);
                }
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th3) {
            AFLogger.valueOf("AdRevenue - Exception while collecting app version data ", th3);
        }
        C0607i valueOf4 = iVar2.AFInAppEventType(obj).AFInAppEventParameterName(hashMap).valueOf(i);
        valueOf4.AFVersionDeclaration = str;
        C0468d dVar = new C0468d(this, valueOf4, (byte) 0);
        if (C0608k.values == null) {
            C0608k.values = new C0608k();
            int i6 = waitForCustomerUserId + 93;
            setCustomerIdAndLogSession = i6 % 128;
            int i7 = i6 % 2;
        }
        valueOf(C0608k.values.AFKeystoreWrapper(), dVar, 1, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r9.getIntent() != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFKeystoreWrapper(com.appsflyer.internal.C0607i r8, android.app.Activity r9) {
        /*
            r7 = this;
            android.app.Application r0 = r8.AFKeystoreWrapper
            r1 = 82
            r2 = 28
            if (r9 == 0) goto L_0x000b
            r3 = 82
            goto L_0x000d
        L_0x000b:
            r3 = 28
        L_0x000d:
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            if (r3 == r2) goto L_0x0065
            int r2 = setCustomerIdAndLogSession
            int r2 = r2 + 67
            int r3 = r2 % 128
            waitForCustomerUserId = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x002c
            android.content.Intent r2 = r9.getIntent()
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0065
            goto L_0x0032
        L_0x002a:
            r8 = move-exception
            throw r8
        L_0x002c:
            android.content.Intent r2 = r9.getIntent()
            if (r2 == 0) goto L_0x0065
        L_0x0032:
            int r2 = setCustomerIdAndLogSession
            int r2 = r2 + 29
            int r3 = r2 % 128
            waitForCustomerUserId = r3
            int r2 = r2 % 2
            android.net.Uri r9 = com.appsflyer.internal.C0493ap.AFKeystoreWrapper(r9)
            if (r9 == 0) goto L_0x0044
            r2 = 0
            goto L_0x0045
        L_0x0044:
            r2 = 1
        L_0x0045:
            if (r2 == 0) goto L_0x0048
            goto L_0x0065
        L_0x0048:
            int r2 = waitForCustomerUserId
            int r2 = r2 + 11
            int r3 = r2 % 128
            setCustomerIdAndLogSession = r3
            int r2 = r2 % 2
            r3 = 10
            if (r2 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r1 = 10
        L_0x0059:
            java.lang.String r9 = r9.toString()
            if (r1 == r3) goto L_0x0066
            r1 = 88
            int r1 = r1 / r6
            goto L_0x0066
        L_0x0063:
            r8 = move-exception
            throw r8
        L_0x0065:
            r9 = r4
        L_0x0066:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r1.getDevKey()
            if (r1 != 0) goto L_0x00aa
            int r9 = setCustomerIdAndLogSession
            int r9 = r9 + 37
            int r0 = r9 % 128
            waitForCustomerUserId = r0
            int r9 = r9 % 2
            java.lang.String r9 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
            com.appsflyer.attribution.AppsFlyerRequestListener r8 = r8.AFInAppEventParameterName
            if (r8 == 0) goto L_0x0094
            int r9 = setCustomerIdAndLogSession
            int r9 = r9 + 35
            int r0 = r9 % 128
            waitForCustomerUserId = r0
            int r9 = r9 % 2
            int r9 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.C0513ba.AFInAppEventParameterName
            r8.onError(r9, r0)
        L_0x0094:
            int r8 = waitForCustomerUserId
            int r8 = r8 + 25
            int r9 = r8 % 128
            setCustomerIdAndLogSession = r9
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x00a1
            r5 = 0
        L_0x00a1:
            if (r5 == 0) goto L_0x00a4
            return
        L_0x00a4:
            r8 = 91
            int r8 = r8 / r6
            return
        L_0x00a8:
            r8 = move-exception
            throw r8
        L_0x00aa:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r1.getReferrer(r0)
            if (r0 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r6 = 1
        L_0x00b6:
            if (r6 == r5) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r4 = r0
        L_0x00ba:
            r8.AppsFlyer2dXConversionCallback = r4
            r8.valueOf = r9
            r7.values((com.appsflyer.internal.C0607i) r8)
            int r8 = setCustomerIdAndLogSession
            int r8 = r8 + 75
            int r9 = r8 % 128
            waitForCustomerUserId = r9
            int r8 = r8 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFKeystoreWrapper(com.appsflyer.internal.i, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if ((com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, false) ? '1' : kotlin.text.Typography.dollar) != '1') goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        com.appsflyer.AFLogger.values("Allowing multiple launches within a 5 second time window.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void values(com.appsflyer.internal.C0607i r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getLevel
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0012
            int r0 = waitForCustomerUserId
            int r0 = r0 + 57
            int r3 = r0 % 128
            setCustomerIdAndLogSession = r3
            int r0 = r0 % 2
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            boolean r3 = r4.AFKeystoreWrapper()
            if (r3 == 0) goto L_0x002f
            int r5 = waitForCustomerUserId
            int r5 = r5 + 51
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % 2
            java.lang.String r0 = "CustomerUserId not set, reporting is disabled"
            if (r5 != 0) goto L_0x002b
            com.appsflyer.AFLogger.values(r0, r2)
            return
        L_0x002b:
            com.appsflyer.AFLogger.values(r0, r1)
            return
        L_0x002f:
            if (r0 == 0) goto L_0x0084
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 47
            int r3 = r0 % 128
            waitForCustomerUserId = r3
            int r0 = r0 % 2
            java.lang.String r3 = "launchProtectEnabled"
            if (r0 == 0) goto L_0x0053
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r2)
            r1 = 49
            if (r0 == 0) goto L_0x004e
            r0 = 49
            goto L_0x0050
        L_0x004e:
            r0 = 36
        L_0x0050:
            if (r0 == r1) goto L_0x005d
            goto L_0x0079
        L_0x0053:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 == 0) goto L_0x0079
        L_0x005d:
            boolean r0 = r4.getLevel()
            r1 = 20
            if (r0 == 0) goto L_0x0068
            r0 = 20
            goto L_0x006a
        L_0x0068:
            r0 = 39
        L_0x006a:
            if (r0 == r1) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.AFInAppEventParameterName
            if (r5 == 0) goto L_0x0078
            int r0 = com.appsflyer.attribution.RequestError.EVENT_TIMEOUT
            java.lang.String r1 = com.appsflyer.internal.C0513ba.valueOf
            r5.onError(r0, r1)
        L_0x0078:
            return
        L_0x0079:
            java.lang.String r0 = "Allowing multiple launches within a 5 second time window."
            com.appsflyer.AFLogger.values((java.lang.String) r0)
        L_0x007e:
            long r0 = java.lang.System.currentTimeMillis()
            r4.onAppOpenAttribution = r0
        L_0x0084:
            com.appsflyer.internal.k r0 = com.appsflyer.internal.C0608k.values
            if (r0 != 0) goto L_0x008f
            com.appsflyer.internal.k r0 = new com.appsflyer.internal.k
            r0.<init>()
            com.appsflyer.internal.C0608k.values = r0
        L_0x008f:
            com.appsflyer.internal.k r0 = com.appsflyer.internal.C0608k.values
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.AFKeystoreWrapper()
            com.appsflyer.internal.ac$b r1 = new com.appsflyer.internal.ac$b
            r1.<init>(r4, r5, r2)
            r2 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            valueOf(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.values(com.appsflyer.internal.i):void");
    }

    private void valueOf(C0607i iVar) {
        String str;
        boolean z;
        ScheduledExecutorService scheduledExecutorService;
        C0580dd[] ddVarArr;
        int i;
        int i2;
        Application application = iVar.AFKeystoreWrapper;
        if (application == null) {
            AFLogger.AFInAppEventParameterName("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences AFInAppEventType2 = AFInAppEventType((Context) application);
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(application.getClass().getName());
            AFLogger.values(sb.toString());
        }
        boolean valueOf2 = iVar.valueOf();
        boolean z2 = iVar instanceof C0561cq;
        boolean z3 = iVar instanceof C0553ci;
        Map<String, Object> AFInAppEventType3 = AFInAppEventType(iVar);
        String str2 = (String) AFInAppEventType3.get("appsflyerKey");
        boolean z4 = false;
        if (!(str2 == null) && str2.length() != 0) {
            if (!isStopped()) {
                AFLogger.values("AppsFlyerLib.sendWithEvent");
            }
            int valueOf3 = valueOf(AFInAppEventType2, false);
            if (z3 || z2) {
                str = String.format(onResponseErrorNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()});
            } else if (valueOf2) {
                int i3 = waitForCustomerUserId + 23;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                if (valueOf3 >= 2) {
                    str = String.format(onAppOpenAttributionNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()});
                } else {
                    str = String.format(onDeepLinkingNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()});
                }
            } else {
                str = String.format(onAttributionFailureNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()});
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(application.getPackageName());
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("&buildnumber=6.5.3");
            String obj2 = sb3.toString();
            String AFInAppEventParameterName2 = AFInAppEventParameterName((Context) application);
            if (AFInAppEventParameterName2 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append("&channel=");
                sb4.append(AFInAppEventParameterName2);
                obj2 = sb4.toString();
            }
            AFInAppEventParameterName(AFInAppEventType3);
            C0468d dVar = new C0468d(this, iVar.AFInAppEventType(obj2).AFInAppEventParameterName(AFInAppEventType3).valueOf(valueOf3), (byte) 0);
            if (valueOf2) {
                int i5 = waitForCustomerUserId + 119;
                setCustomerIdAndLogSession = i5 % 128;
                if (i5 % 2 == 0) {
                    ddVarArr = valueOf();
                    i2 = ddVarArr.length;
                    i = 1;
                } else {
                    ddVarArr = valueOf();
                    i2 = ddVarArr.length;
                    i = 0;
                }
                z = false;
                while (true) {
                    if ((i < i2 ? Typography.dollar : '+') == '+') {
                        break;
                    }
                    C0580dd ddVar = ddVarArr[i];
                    if (ddVar.AFInAppEventParameterName == C0580dd.C0582d.STARTED) {
                        StringBuilder sb5 = new StringBuilder("Failed to get ");
                        sb5.append(ddVar.AFKeystoreWrapper);
                        sb5.append(" referrer, wait ...");
                        AFLogger.AFInAppEventParameterName(sb5.toString());
                        z = true;
                    }
                    i++;
                }
                if (this.setDebugLog) {
                    int i6 = setCustomerIdAndLogSession + 21;
                    waitForCustomerUserId = i6 % 128;
                    int i7 = i6 % 2;
                    if (!AFLogger$LogLevel()) {
                        int i8 = setCustomerIdAndLogSession + 41;
                        waitForCustomerUserId = i8 % 128;
                        int i9 = i8 % 2;
                        AFLogger.AFInAppEventParameterName("fetching Facebook deferred AppLink data, wait ...");
                        z = true;
                    }
                }
                if (this.setCustomerUserId.init().AFInAppEventType()) {
                    int i10 = setCustomerIdAndLogSession + 123;
                    waitForCustomerUserId = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                }
            } else {
                z = false;
            }
            if (C0600f.AFInAppEventParameterName) {
                AFLogger.AFKeystoreWrapper("ESP deeplink: execute launch on SerialExecutor");
                if (C0608k.values == null) {
                    C0608k.values = new C0608k();
                }
                C0608k kVar = C0608k.values;
                if (kVar.valueOf != null) {
                    z4 = true;
                }
                if (!z4) {
                    kVar.valueOf = Executors.newSingleThreadScheduledExecutor(kVar.AFInAppEventType);
                }
                scheduledExecutorService = kVar.valueOf;
            } else {
                if (C0608k.values == null) {
                    C0608k.values = new C0608k();
                }
                scheduledExecutorService = C0608k.values.AFKeystoreWrapper();
            }
            valueOf(scheduledExecutorService, dVar, z ? 500 : 0, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.AFInAppEventParameterName("Not sending data yet, waiting for dev key");
        AppsFlyerRequestListener appsFlyerRequestListener = iVar.AFInAppEventParameterName;
        if (!(appsFlyerRequestListener == null)) {
            int i12 = waitForCustomerUserId + 25;
            setCustomerIdAndLogSession = i12 % 128;
            if (i12 % 2 != 0) {
                z4 = true;
            }
            appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C0513ba.AFInAppEventParameterName);
            if (!z4) {
                Object obj3 = null;
                super.hashCode();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x036f A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037c A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0382 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0395 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03a7 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b8 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03e2 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03fd A[SYNTHETIC, Splitter:B:173:0x03fd] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x041d A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0430 A[Catch:{ Exception -> 0x0436 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04de A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0583 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x058c A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05bf A[SYNTHETIC, Splitter:B:267:0x05bf] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0607 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0626 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0656 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0658 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0666 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06db A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06e4 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06e5 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0721 A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x079d A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07ae A[Catch:{ Exception -> 0x00fa, all -> 0x0805 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType(com.appsflyer.internal.C0607i r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.lang.String r3 = "is_stop_tracking_used"
            java.lang.String r4 = "ddl"
            java.lang.String r5 = "af_deeplink"
            java.lang.String r6 = "advertiserId"
            java.lang.String r7 = "versionCode"
            java.lang.String r8 = "Exception while collecting facebook's attribution ID. "
            java.lang.String r9 = "appid"
            java.lang.String r10 = "sdkExtension"
            java.lang.String r11 = "extraReferrers"
            java.lang.String r12 = "AFRequestCache"
            java.lang.String r13 = "yyyy-MM-dd_HHmmssZ"
            android.app.Application r14 = r2.AFKeystoreWrapper
            java.lang.String r15 = r2.AFVersionDeclaration
            r16 = r3
            java.lang.String r3 = r2.getLevel
            r17 = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r18 = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.values
            if (r6 != 0) goto L_0x0032
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            goto L_0x0034
        L_0x0032:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.values
        L_0x0034:
            r4.<init>(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = r2.AppsFlyer2dXConversionCallback
            r19 = r5
            android.content.SharedPreferences r5 = AFInAppEventType((android.content.Context) r14)
            r20 = r7
            boolean r7 = r33.valueOf()
            r21 = r13
            java.lang.String r13 = r2.valueOf
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.AFInAppEventType
            com.appsflyer.internal.C0457ab.AFKeystoreWrapper(r14, r2)
            java.lang.Boolean r22 = com.appsflyer.internal.C0457ab.AFInAppEventType
            r23 = r13
            if (r22 == 0) goto L_0x0078
            boolean r24 = r22.booleanValue()
            if (r24 != 0) goto L_0x0078
            java.util.Map r13 = AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r22 = r22.booleanValue()
            r24 = 1
            r22 = r22 ^ 1
            r24 = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r22)
            r22 = r9
            java.lang.String r9 = "ad_ids_disabled"
            r13.put(r9, r8)
            goto L_0x007c
        L_0x0078:
            r24 = r8
            r22 = r9
        L_0x007c:
            java.util.Date r8 = new java.util.Date
            r8.<init>()
            long r8 = r8.getTime()
            int r13 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r13 = r13 >> 16
            int r13 = 29173 - r13
            r25 = r4
            java.lang.String r4 = "ᳲ洀Ｆ䤸?┷띈œ鍏ᵯ潬磻"
            java.lang.String r4 = values((java.lang.String) r4, (int) r13)
            java.lang.String r4 = r4.intern()
            java.lang.String r13 = java.lang.Long.toString(r8)
            r2.put(r4, r13)
            java.lang.String r4 = com.appsflyer.internal.C0573d.AFKeystoreWrapper((android.content.Context) r14, (long) r8)
            if (r4 == 0) goto L_0x00ab
            java.lang.String r8 = "cksm_v1"
            r2.put(r8, r4)
        L_0x00ab:
            boolean r4 = r32.isStopped()     // Catch:{ all -> 0x0805 }
            if (r4 != 0) goto L_0x00c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            java.lang.String r8 = "******* sendTrackingWithEvent: "
            r4.<init>(r8)     // Catch:{ all -> 0x0805 }
            if (r7 == 0) goto L_0x00bd
            java.lang.String r8 = "Launch"
            goto L_0x00be
        L_0x00bd:
            r8 = r3
        L_0x00be:
            r4.append(r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0805 }
            com.appsflyer.AFLogger.values((java.lang.String) r4)     // Catch:{ all -> 0x0805 }
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r4 = "Reporting has been stopped"
            com.appsflyer.AFLogger.values((java.lang.String) r4)     // Catch:{ all -> 0x0805 }
        L_0x00ce:
            com.appsflyer.internal.bg r4 = r32.values()     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.l r4 = r4.AFVersionDeclaration()     // Catch:{ all -> 0x0805 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00fa }
            com.appsflyer.internal.be r9 = r4.AFKeystoreWrapper     // Catch:{ Exception -> 0x00fa }
            android.content.Context r9 = r9.values     // Catch:{ Exception -> 0x00fa }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ Exception -> 0x00fa }
            r8.<init>(r9, r12)     // Catch:{ Exception -> 0x00fa }
            boolean r8 = r8.exists()     // Catch:{ Exception -> 0x00fa }
            if (r8 != 0) goto L_0x0101
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00fa }
            com.appsflyer.internal.be r4 = r4.AFKeystoreWrapper     // Catch:{ Exception -> 0x00fa }
            android.content.Context r4 = r4.values     // Catch:{ Exception -> 0x00fa }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ Exception -> 0x00fa }
            r8.<init>(r4, r12)     // Catch:{ Exception -> 0x00fa }
            r8.mkdir()     // Catch:{ Exception -> 0x00fa }
            goto L_0x0101
        L_0x00fa:
            r0 = move-exception
            r4 = r0
            java.lang.String r8 = "CACHE: Could not create cache directory"
            com.appsflyer.AFLogger.valueOf(r8, r4)     // Catch:{ all -> 0x0805 }
        L_0x0101:
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ Exception -> 0x013d }
            java.lang.String r8 = r14.getPackageName()     // Catch:{ Exception -> 0x013d }
            r9 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r8, r9)     // Catch:{ Exception -> 0x013d }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ Exception -> 0x013d }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ Exception -> 0x013d }
            java.lang.String r8 = "android.permission.INTERNET"
            boolean r8 = r4.contains(r8)     // Catch:{ Exception -> 0x013d }
            if (r8 != 0) goto L_0x0122
            java.lang.String r8 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r8)     // Catch:{ Exception -> 0x013d }
        L_0x0122:
            java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r8 = r4.contains(r8)     // Catch:{ Exception -> 0x013d }
            if (r8 != 0) goto L_0x012f
            java.lang.String r8 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r8)     // Catch:{ Exception -> 0x013d }
        L_0x012f:
            java.lang.String r8 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = r4.contains(r8)     // Catch:{ Exception -> 0x013d }
            if (r4 != 0) goto L_0x0144
            java.lang.String r4 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r4)     // Catch:{ Exception -> 0x013d }
            goto L_0x0144
        L_0x013d:
            r0 = move-exception
            r4 = r0
            java.lang.String r8 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.valueOf(r8, r4)     // Catch:{ all -> 0x0805 }
        L_0x0144:
            java.lang.String r4 = "af_events_api"
            java.lang.String r8 = "Ტ"
            r9 = 41800(0xa348, float:5.8574E-41)
            r12 = 0
            int r13 = android.graphics.ImageFormat.getBitsPerPixel(r12)     // Catch:{ all -> 0x0805 }
            int r9 = r9 - r13
            java.lang.String r8 = values((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x0805 }
            java.lang.String r8 = r8.intern()     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "ᳱ쪼끈鿪䖃"
            r8 = 54878(0xd65e, float:7.69E-41)
            long r26 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x0805 }
            r12 = 0
            int r28 = (r26 > r12 ? 1 : (r26 == r12 ? 0 : -1))
            int r8 = r8 - r28
            java.lang.String r4 = values((java.lang.String) r4, (int) r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x0805 }
            java.lang.String r8 = android.os.Build.BRAND     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "device"
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "product"
            java.lang.String r8 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "sdk"
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0805 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "model"
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "deviceType"
            java.lang.String r8 = android.os.Build.TYPE     // Catch:{ all -> 0x0805 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0805 }
            values((android.content.Context) r14, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.ax r8 = new com.appsflyer.internal.ax     // Catch:{ all -> 0x0805 }
            r8.<init>(r14)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.bg r26 = r32.values()     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.cl r9 = r26.getLevel()     // Catch:{ all -> 0x0805 }
            if (r7 == 0) goto L_0x02a4
            boolean r13 = AFKeystoreWrapper((android.content.Context) r14)     // Catch:{ all -> 0x0805 }
            if (r13 == 0) goto L_0x0205
            boolean r13 = r4.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0805 }
            if (r13 != 0) goto L_0x01ce
            float r13 = onResponseNative(r14)     // Catch:{ all -> 0x0805 }
            java.lang.String r12 = "batteryLevel"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0805 }
            r2.put(r12, r13)     // Catch:{ all -> 0x0805 }
        L_0x01ce:
            getLevel((android.content.Context) r14)     // Catch:{ all -> 0x0805 }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0805 }
            r13 = 23
            if (r12 < r13) goto L_0x01e0
            java.lang.Class<android.app.UiModeManager> r12 = android.app.UiModeManager.class
            java.lang.Object r12 = r14.getSystemService(r12)     // Catch:{ all -> 0x0805 }
            android.app.UiModeManager r12 = (android.app.UiModeManager) r12     // Catch:{ all -> 0x0805 }
            goto L_0x01e8
        L_0x01e0:
            java.lang.String r12 = "uimode"
            java.lang.Object r12 = r14.getSystemService(r12)     // Catch:{ all -> 0x0805 }
            android.app.UiModeManager r12 = (android.app.UiModeManager) r12     // Catch:{ all -> 0x0805 }
        L_0x01e8:
            if (r12 == 0) goto L_0x01f8
            int r12 = r12.getCurrentModeType()     // Catch:{ all -> 0x0805 }
            r13 = 4
            if (r12 != r13) goto L_0x01f8
            java.lang.String r12 = "tv"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0805 }
            r2.put(r12, r13)     // Catch:{ all -> 0x0805 }
        L_0x01f8:
            boolean r12 = com.appsflyer.internal.C0550cf.values(r14)     // Catch:{ all -> 0x0805 }
            if (r12 == 0) goto L_0x0205
            java.lang.String r12 = "inst_app"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0805 }
            r2.put(r12, r13)     // Catch:{ all -> 0x0805 }
        L_0x0205:
            java.lang.String r12 = "timepassedsincelastlaunch"
            long r30 = r1.onAppOpenAttribution(r14)     // Catch:{ all -> 0x0805 }
            java.lang.String r13 = java.lang.Long.toString(r30)     // Catch:{ all -> 0x0805 }
            r2.put(r12, r13)     // Catch:{ all -> 0x0805 }
            values((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2, (com.appsflyer.internal.C0556cl) r9)     // Catch:{ all -> 0x0805 }
            java.lang.String r12 = r1.onPause     // Catch:{ all -> 0x0805 }
            if (r12 == 0) goto L_0x0221
            java.lang.String r13 = "phone"
            r2.put(r13, r12)     // Catch:{ all -> 0x0805 }
        L_0x0221:
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r13 = "referrer"
            if (r12 != 0) goto L_0x022c
            r2.put(r13, r6)     // Catch:{ all -> 0x0805 }
        L_0x022c:
            r6 = 0
            java.lang.String r12 = r5.getString(r11, r6)     // Catch:{ all -> 0x0805 }
            if (r12 == 0) goto L_0x0236
            r2.put(r11, r12)     // Catch:{ all -> 0x0805 }
        L_0x0236:
            java.lang.String r6 = r4.getReferrer(r14)     // Catch:{ all -> 0x0805 }
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0805 }
            if (r11 != 0) goto L_0x0249
            java.lang.Object r11 = r2.get(r13)     // Catch:{ all -> 0x0805 }
            if (r11 != 0) goto L_0x0249
            r2.put(r13, r6)     // Catch:{ all -> 0x0805 }
        L_0x0249:
            long r11 = r9.onDeepLinkingNative     // Catch:{ all -> 0x0805 }
            r28 = 0
            int r6 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r6 == 0) goto L_0x025a
            java.lang.String r6 = "prev_session_dur"
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0805 }
            r2.put(r6, r11)     // Catch:{ all -> 0x0805 }
        L_0x025a:
            android.app.Application r6 = com.appsflyer.internal.C0511ay.AFInAppEventParameterName     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = "exception_number"
            if (r6 != 0) goto L_0x0263
            r12 = -1
            goto L_0x0271
        L_0x0263:
            android.app.Application r6 = com.appsflyer.internal.C0511ay.AFInAppEventParameterName     // Catch:{ all -> 0x0805 }
            android.content.SharedPreferences r6 = AFInAppEventType((android.content.Context) r6)     // Catch:{ all -> 0x0805 }
            r12 = 0
            long r30 = r6.getLong(r11, r12)     // Catch:{ all -> 0x0805 }
            r12 = r30
        L_0x0271:
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0805 }
            r2.put(r11, r6)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.az r6 = r1.setImeiData     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x02a7
            java.util.Map<java.lang.String, java.lang.Object> r11 = r6.values     // Catch:{ all -> 0x0805 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0805 }
            java.lang.String r12 = "partner_data"
            if (r11 != 0) goto L_0x028b
            java.util.Map<java.lang.String, java.lang.Object> r11 = r6.values     // Catch:{ all -> 0x0805 }
            r2.put(r12, r11)     // Catch:{ all -> 0x0805 }
        L_0x028b:
            java.util.Map<java.lang.String, java.lang.Object> r11 = r6.valueOf     // Catch:{ all -> 0x0805 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0805 }
            if (r11 != 0) goto L_0x02a7
            java.util.Map r11 = AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            java.util.Map<java.lang.String, java.lang.Object> r13 = r6.valueOf     // Catch:{ all -> 0x0805 }
            r11.put(r12, r13)     // Catch:{ all -> 0x0805 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x0805 }
            r11.<init>()     // Catch:{ all -> 0x0805 }
            r6.valueOf = r11     // Catch:{ all -> 0x0805 }
            goto L_0x02a7
        L_0x02a4:
            valueOf((android.content.Context) r14, (java.util.Map<java.lang.String, java.lang.Object>) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0805 }
        L_0x02a7:
            java.lang.String r6 = "KSAppsFlyerId"
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = "KSAppsFlyerRICounter"
            java.lang.String r11 = AFInAppEventParameterName((java.lang.String) r11)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x02cb
            if (r11 == 0) goto L_0x02cb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0805 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0805 }
            if (r12 <= 0) goto L_0x02cb
            java.lang.String r12 = "reinstallCounter"
            r2.put(r12, r11)     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = "originalAppsflyerId"
            r2.put(r11, r6)     // Catch:{ all -> 0x0805 }
        L_0x02cb:
            java.lang.String r6 = "additionalCustomData"
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x02d8
            java.lang.String r11 = "customData"
            r2.put(r11, r6)     // Catch:{ all -> 0x0805 }
        L_0x02d8:
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ Exception -> 0x02ec }
            java.lang.String r11 = r14.getPackageName()     // Catch:{ Exception -> 0x02ec }
            java.lang.String r6 = r6.getInstallerPackageName(r11)     // Catch:{ Exception -> 0x02ec }
            if (r6 == 0) goto L_0x02f3
            java.lang.String r11 = "installer_package"
            r2.put(r11, r6)     // Catch:{ Exception -> 0x02ec }
            goto L_0x02f3
        L_0x02ec:
            r0 = move-exception
            r6 = r0
            java.lang.String r11 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.valueOf(r11, r6)     // Catch:{ all -> 0x0805 }
        L_0x02f3:
            java.lang.String r6 = r4.getString(r10)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0302
            int r11 = r6.length()     // Catch:{ all -> 0x0805 }
            if (r11 <= 0) goto L_0x0302
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x0302:
            java.lang.String r6 = r1.AFInAppEventParameterName((android.content.Context) r14)     // Catch:{ all -> 0x0805 }
            java.lang.String r10 = r1.AFInAppEventParameterName((android.content.Context) r14, (java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            if (r10 == 0) goto L_0x0312
            boolean r11 = r10.equals(r6)     // Catch:{ all -> 0x0805 }
            if (r11 == 0) goto L_0x0316
        L_0x0312:
            if (r10 != 0) goto L_0x031b
            if (r6 == 0) goto L_0x031b
        L_0x0316:
            java.lang.String r10 = "af_latestchannel"
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x031b:
            java.lang.String r6 = r1.onInstallConversionDataLoadedNative(r14)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x032a
            java.lang.String r10 = "af_installstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0805 }
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x032a:
            java.lang.String r6 = r1.onAttributionFailureNative(r14)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0339
            java.lang.String r10 = "af_preinstall_name"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0805 }
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x0339:
            java.lang.String r6 = r1.onDeepLinkingNative(r14)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0348
            java.lang.String r10 = "af_currentstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x0805 }
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x0348:
            java.lang.String r6 = "appsflyerKey"
            if (r15 == 0) goto L_0x0356
            int r10 = r15.length()     // Catch:{ all -> 0x0805 }
            if (r10 <= 0) goto L_0x0356
            r2.put(r6, r15)     // Catch:{ all -> 0x0805 }
            goto L_0x0369
        L_0x0356:
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0805 }
            java.lang.String r10 = r10.getDevKey()     // Catch:{ all -> 0x0805 }
            if (r10 == 0) goto L_0x07f9
            int r11 = r10.length()     // Catch:{ all -> 0x0805 }
            if (r11 <= 0) goto L_0x07f9
            r2.put(r6, r10)     // Catch:{ all -> 0x0805 }
        L_0x0369:
            java.lang.String r6 = AFInAppEventType()     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0374
            java.lang.String r10 = "appUserId"
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x0374:
            java.lang.String r6 = "userEmails"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0382
            java.lang.String r10 = "user_emails"
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
            goto L_0x0393
        L_0x0382:
            java.lang.String r6 = "userEmail"
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0393
            java.lang.String r10 = "sha1_el"
            java.lang.String r6 = com.appsflyer.internal.C0474ag.valueOf(r6)     // Catch:{ all -> 0x0805 }
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x0393:
            if (r3 == 0) goto L_0x03a1
            java.lang.String r6 = "eventName"
            r2.put(r6, r3)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "eventValue"
            r10 = r25
            r2.put(r6, r10)     // Catch:{ all -> 0x0805 }
        L_0x03a1:
            java.lang.String r6 = init()     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x03b0
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r22)     // Catch:{ all -> 0x0805 }
            r10 = r22
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x03b0:
            java.lang.String r6 = "currencyCode"
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x03da
            int r10 = r6.length()     // Catch:{ all -> 0x0805 }
            r11 = 3
            if (r10 == r11) goto L_0x03d5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = "WARNING: currency code should be 3 characters!!! '"
            r10.<init>(r11)     // Catch:{ all -> 0x0805 }
            r10.append(r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = "' is not a legal value."
            r10.append(r11)     // Catch:{ all -> 0x0805 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0805 }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r10)     // Catch:{ all -> 0x0805 }
        L_0x03d5:
            java.lang.String r10 = "currency"
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x03da:
            java.lang.String r6 = "IS_UPDATE"
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r6)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x03e7
            java.lang.String r10 = "isUpdate"
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
        L_0x03e7:
            boolean r6 = r1.isPreInstalledApp(r14)     // Catch:{ all -> 0x0805 }
            java.lang.String r10 = "af_preinstalled"
            java.lang.String r6 = java.lang.Boolean.toString(r6)     // Catch:{ all -> 0x0805 }
            r2.put(r10, r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "collectFacebookAttrId"
            r10 = 1
            boolean r6 = r4.getBoolean(r6, r10)     // Catch:{ all -> 0x0805 }
            if (r6 == 0) goto L_0x0422
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0415, all -> 0x040c }
            java.lang.String r10 = "com.facebook.katana"
            r11 = 0
            r6.getApplicationInfo(r10, r11)     // Catch:{ NameNotFoundException -> 0x0415, all -> 0x040c }
            java.lang.String r10 = r1.getAttributionId(r14)     // Catch:{ NameNotFoundException -> 0x0415, all -> 0x040c }
            goto L_0x041b
        L_0x040c:
            r0 = move-exception
            r10 = r0
            r11 = r24
            com.appsflyer.AFLogger.valueOf(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x0413:
            r10 = 0
            goto L_0x041b
        L_0x0415:
            r11 = r24
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r11)     // Catch:{ all -> 0x0805 }
            goto L_0x0413
        L_0x041b:
            if (r10 == 0) goto L_0x0422
            java.lang.String r11 = "fb"
            r2.put(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x0422:
            r1.valueOf((android.content.Context) r14, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0436 }
            r10.<init>(r14)     // Catch:{ Exception -> 0x0436 }
            java.lang.String r10 = com.appsflyer.internal.C0473af.valueOf(r10)     // Catch:{ Exception -> 0x0436 }
            if (r10 == 0) goto L_0x044d
            java.lang.String r11 = "uid"
            r2.put(r11, r10)     // Catch:{ Exception -> 0x0436 }
            goto L_0x044d
        L_0x0436:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            java.lang.String r12 = "ERROR: could not get uid "
            r11.<init>(r12)     // Catch:{ all -> 0x0805 }
            java.lang.String r12 = r10.getMessage()     // Catch:{ all -> 0x0805 }
            r11.append(r12)     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0805 }
            com.appsflyer.AFLogger.valueOf(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x044d:
            java.lang.String r10 = "lang"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x045b }
            java.lang.String r11 = r11.getDisplayLanguage()     // Catch:{ Exception -> 0x045b }
            r2.put(r10, r11)     // Catch:{ Exception -> 0x045b }
            goto L_0x0462
        L_0x045b:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.valueOf(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x0462:
            java.lang.String r10 = "lang_code"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r11 = r11.getLanguage()     // Catch:{ Exception -> 0x0470 }
            r2.put(r10, r11)     // Catch:{ Exception -> 0x0470 }
            goto L_0x0477
        L_0x0470:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.valueOf(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x0477:
            java.lang.String r10 = "country"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r11 = r11.getCountry()     // Catch:{ Exception -> 0x0485 }
            r2.put(r10, r11)     // Catch:{ Exception -> 0x0485 }
            goto L_0x048c
        L_0x0485:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.valueOf(r11, r10)     // Catch:{ all -> 0x0805 }
        L_0x048c:
            java.lang.String r10 = "platformextension"
            com.appsflyer.internal.al r11 = r1.onValidateInAppFailure     // Catch:{ all -> 0x0805 }
            java.lang.String r11 = r11.AFInAppEventType()     // Catch:{ all -> 0x0805 }
            r2.put(r10, r11)     // Catch:{ all -> 0x0805 }
            AFInAppEventType((android.content.Context) r14, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x0805 }
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0805 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0805 }
            r12 = r21
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0805 }
            android.content.pm.PackageManager r11 = r14.getPackageManager()     // Catch:{ Exception -> 0x04bf }
            java.lang.String r13 = r14.getPackageName()     // Catch:{ Exception -> 0x04bf }
            r6 = 0
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r13, r6)     // Catch:{ Exception -> 0x04bf }
            r13 = r7
            long r6 = r11.firstInstallTime     // Catch:{ Exception -> 0x04bd }
            java.lang.String r11 = "installDate"
            java.lang.String r6 = valueOf((java.text.SimpleDateFormat) r10, (long) r6)     // Catch:{ Exception -> 0x04bd }
            r2.put(r11, r6)     // Catch:{ Exception -> 0x04bd }
            goto L_0x04c7
        L_0x04bd:
            r0 = move-exception
            goto L_0x04c1
        L_0x04bf:
            r0 = move-exception
            r13 = r7
        L_0x04c1:
            r6 = r0
            java.lang.String r7 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.valueOf(r7, r6)     // Catch:{ all -> 0x0805 }
        L_0x04c7:
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ all -> 0x0558 }
            java.lang.String r7 = r14.getPackageName()     // Catch:{ all -> 0x0558 }
            r11 = 0
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r11)     // Catch:{ all -> 0x0558 }
            r7 = r20
            int r15 = r5.getInt(r7, r11)     // Catch:{ all -> 0x0558 }
            int r11 = r6.versionCode     // Catch:{ all -> 0x0558 }
            if (r11 <= r15) goto L_0x04e3
            int r11 = r6.versionCode     // Catch:{ all -> 0x0558 }
            valueOf((android.content.Context) r14, (java.lang.String) r7, (int) r11)     // Catch:{ all -> 0x0558 }
        L_0x04e3:
            java.lang.String r7 = "app_version_code"
            int r11 = r6.versionCode     // Catch:{ all -> 0x0558 }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ all -> 0x0558 }
            r2.put(r7, r11)     // Catch:{ all -> 0x0558 }
            java.lang.String r7 = "app_version_name"
            java.lang.String r11 = r6.versionName     // Catch:{ all -> 0x0558 }
            r2.put(r7, r11)     // Catch:{ all -> 0x0558 }
            r11 = r8
            long r7 = r6.firstInstallTime     // Catch:{ all -> 0x054f }
            r15 = r3
            r20 = r4
            long r3 = r6.lastUpdateTime     // Catch:{ all -> 0x054d }
            java.lang.String r6 = "date1"
            r21 = r11
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x054b }
            r22 = r9
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0549 }
            r11.<init>(r12, r9)     // Catch:{ all -> 0x0549 }
            java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x0549 }
            r9.<init>(r7)     // Catch:{ all -> 0x0549 }
            java.lang.String r7 = r11.format(r9)     // Catch:{ all -> 0x0549 }
            r2.put(r6, r7)     // Catch:{ all -> 0x0549 }
            java.lang.String r6 = "date2"
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0549 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0549 }
            r7.<init>(r12, r8)     // Catch:{ all -> 0x0549 }
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x0549 }
            r8.<init>(r3)     // Catch:{ all -> 0x0549 }
            java.lang.String r3 = r7.format(r8)     // Catch:{ all -> 0x0549 }
            r2.put(r6, r3)     // Catch:{ all -> 0x0549 }
            java.lang.String r3 = r1.AFInAppEventType((java.text.SimpleDateFormat) r10, (android.content.Context) r14)     // Catch:{ all -> 0x0549 }
            java.lang.String r4 = "ᳵ넹䝧ᖩ꯫砐๠?狥ܫ핥殶㧖츀鱜"
            r6 = 44482(0xadc2, float:6.2333E-41)
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0549 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r11 = r11 + r6
            java.lang.String r4 = values((java.lang.String) r4, (int) r11)     // Catch:{ all -> 0x0549 }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x0549 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0549 }
            goto L_0x0566
        L_0x0549:
            r0 = move-exception
            goto L_0x0560
        L_0x054b:
            r0 = move-exception
            goto L_0x055e
        L_0x054d:
            r0 = move-exception
            goto L_0x0553
        L_0x054f:
            r0 = move-exception
            r15 = r3
            r20 = r4
        L_0x0553:
            r22 = r9
            r21 = r11
            goto L_0x0560
        L_0x0558:
            r0 = move-exception
            r15 = r3
            r20 = r4
            r21 = r8
        L_0x055e:
            r22 = r9
        L_0x0560:
            r3 = r0
            java.lang.String r4 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.valueOf(r4, r3)     // Catch:{ all -> 0x0805 }
        L_0x0566:
            boolean r3 = com.appsflyer.internal.C0547cd.AFKeystoreWrapper((android.content.Context) r14)     // Catch:{ all -> 0x0805 }
            r1.AppsFlyerLib = r3     // Catch:{ all -> 0x0805 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "didConfigureTokenRefreshService="
            r3.<init>(r4)     // Catch:{ all -> 0x0805 }
            boolean r4 = r1.AppsFlyerLib     // Catch:{ all -> 0x0805 }
            r3.append(r4)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0805 }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3)     // Catch:{ all -> 0x0805 }
            boolean r3 = r1.AppsFlyerLib     // Catch:{ all -> 0x0805 }
            if (r3 != 0) goto L_0x058a
            java.lang.String r3 = "tokenRefreshConfigured"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
        L_0x058a:
            if (r13 == 0) goto L_0x05bd
            java.lang.String r3 = r1.onDeepLinking     // Catch:{ all -> 0x0805 }
            if (r3 == 0) goto L_0x05b3
            r3 = r19
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0805 }
            if (r4 == 0) goto L_0x059e
            java.lang.String r3 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3)     // Catch:{ all -> 0x0805 }
            goto L_0x05b3
        L_0x059e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = r1.onDeepLinking     // Catch:{ all -> 0x0805 }
            r4.<init>(r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "isPush"
            java.lang.String r7 = "true"
            r4.put(r6, r7)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
        L_0x05b3:
            r3 = 0
            r1.onDeepLinking = r3     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "open_referrer"
            r4 = r23
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
        L_0x05bd:
            if (r13 != 0) goto L_0x0601
            com.appsflyer.internal.w r3 = com.appsflyer.internal.C0620w.AFKeystoreWrapper((android.content.Context) r14)     // Catch:{ Exception -> 0x05ea }
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x05ea }
            r4.<init>()     // Catch:{ Exception -> 0x05ea }
            java.util.List r3 = r3.AFInAppEventParameterName()     // Catch:{ Exception -> 0x05ea }
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x05ea }
            java.lang.String r7 = "sensors"
            if (r6 != 0) goto L_0x05e1
            com.appsflyer.internal.h r6 = new com.appsflyer.internal.h     // Catch:{ Exception -> 0x05ea }
            r6.<init>()     // Catch:{ Exception -> 0x05ea }
            java.util.Map r3 = r6.values((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) r3)     // Catch:{ Exception -> 0x05ea }
            r4.put(r7, r3)     // Catch:{ Exception -> 0x05ea }
            goto L_0x05e6
        L_0x05e1:
            java.lang.String r3 = "na"
            r4.put(r7, r3)     // Catch:{ Exception -> 0x05ea }
        L_0x05e6:
            r2.putAll(r4)     // Catch:{ Exception -> 0x05ea }
            goto L_0x0601
        L_0x05ea:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "Unexpected exception from AFSensorManager: "
            r4.<init>(r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0805 }
            r4.append(r3)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0805 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ all -> 0x0805 }
        L_0x0601:
            java.lang.String r3 = AFInAppEventParameterName((java.lang.String) r18)     // Catch:{ all -> 0x0805 }
            if (r3 != 0) goto L_0x061c
            com.appsflyer.internal.C0457ab.AFKeystoreWrapper(r14, r2)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "GAID_retry"
            java.lang.String r4 = AFInAppEventParameterName((java.lang.String) r18)     // Catch:{ all -> 0x0805 }
            if (r4 == 0) goto L_0x0614
            r4 = 1
            goto L_0x0615
        L_0x0614:
            r4 = 0
        L_0x0615:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
        L_0x061c:
            android.content.ContentResolver r3 = r14.getContentResolver()     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.g r3 = com.appsflyer.internal.C0457ab.AFInAppEventType((android.content.ContentResolver) r3)     // Catch:{ all -> 0x0805 }
            if (r3 == 0) goto L_0x0638
            java.lang.String r4 = "amazon_aid"
            java.lang.String r6 = r3.values     // Catch:{ all -> 0x0805 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "amazon_aid_limit"
            java.lang.Boolean r3 = r3.AFKeystoreWrapper     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
        L_0x0638:
            boolean r3 = com.appsflyer.internal.C0547cd.AFInAppEventType(r5)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "registeredUninstall"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            int r3 = r1.valueOf((android.content.SharedPreferences) r5, (boolean) r13)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "counter"
            java.lang.String r6 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "iaecounter"
            if (r15 == 0) goto L_0x0658
            r6 = 1
            goto L_0x0659
        L_0x0658:
            r6 = 0
        L_0x0659:
            int r6 = r1.AFKeystoreWrapper((android.content.SharedPreferences) r5, (boolean) r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0805 }
            if (r13 == 0) goto L_0x06db
            java.util.Map r4 = AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            r1.valueOf((java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "first_launch"
            r7 = 1
            if (r3 == r7) goto L_0x068f
            r7 = 2
            if (r3 == r7) goto L_0x0677
        L_0x0675:
            r9 = 1
            goto L_0x06cf
        L_0x0677:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0805 }
            r8 = r22
            java.util.Map<java.lang.String, java.lang.Object> r9 = r8.AFInAppEventParameterName     // Catch:{ all -> 0x0805 }
            r7.<init>(r9)     // Catch:{ all -> 0x0805 }
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x0805 }
            if (r9 != 0) goto L_0x0689
            r4.put(r6, r7)     // Catch:{ all -> 0x0805 }
        L_0x0689:
            com.appsflyer.internal.bv r7 = r8.valueOf     // Catch:{ all -> 0x0805 }
            r7.AFInAppEventType(r6)     // Catch:{ all -> 0x0805 }
            goto L_0x0675
        L_0x068f:
            r7 = r20
            r8 = r22
            r9 = 1
            r7.AFInAppEventParameterName = r9     // Catch:{ all -> 0x0805 }
            java.lang.String r7 = "waitForCustomerId"
            r10 = 0
            boolean r7 = AFKeystoreWrapper((java.lang.String) r7, (boolean) r10)     // Catch:{ all -> 0x0805 }
            if (r7 == 0) goto L_0x06a8
            java.lang.String r7 = "wait_cid"
            java.lang.String r11 = java.lang.Boolean.toString(r9)     // Catch:{ all -> 0x0805 }
            r2.put(r7, r11)     // Catch:{ all -> 0x0805 }
        L_0x06a8:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0805 }
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.AFKeystoreWrapper     // Catch:{ all -> 0x0805 }
            r7.<init>(r11)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.bv r11 = r8.valueOf     // Catch:{ all -> 0x0805 }
            r12 = r17
            r11.AFInAppEventType(r12)     // Catch:{ all -> 0x0805 }
            boolean r11 = r7.isEmpty()     // Catch:{ all -> 0x0805 }
            if (r11 != 0) goto L_0x06bf
            r4.put(r12, r7)     // Catch:{ all -> 0x0805 }
        L_0x06bf:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0805 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.AFInAppEventParameterName     // Catch:{ all -> 0x0805 }
            r7.<init>(r8)     // Catch:{ all -> 0x0805 }
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0805 }
            if (r8 != 0) goto L_0x06cf
            r4.put(r6, r7)     // Catch:{ all -> 0x0805 }
        L_0x06cf:
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0805 }
            if (r4 == 0) goto L_0x06dc
            java.lang.String r4 = "meta"
            r2.remove(r4)     // Catch:{ all -> 0x0805 }
            goto L_0x06dc
        L_0x06db:
            r9 = 1
        L_0x06dc:
            java.lang.String r4 = "isFirstCall"
            boolean r6 = AFInAppEventType((android.content.SharedPreferences) r5)     // Catch:{ all -> 0x0805 }
            if (r6 != 0) goto L_0x06e5
            goto L_0x06e6
        L_0x06e5:
            r9 = 0
        L_0x06e6:
            java.lang.String r6 = java.lang.Boolean.toString(r9)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0805 }
            r1.AFInAppEventParameterName(r14, r13, r2, r3)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.ag r3 = new com.appsflyer.internal.ag     // Catch:{ all -> 0x0805 }
            r3.<init>()     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = com.appsflyer.internal.C0474ag.values((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "af_v"
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.ag r3 = new com.appsflyer.internal.ag     // Catch:{ all -> 0x0805 }
            r3.<init>()     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = com.appsflyer.internal.C0474ag.AFInAppEventParameterName((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "af_v2"
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            boolean r3 = onConversionDataSuccess(r14)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            r3 = r16
            boolean r4 = r5.contains(r3)     // Catch:{ all -> 0x0805 }
            if (r4 == 0) goto L_0x072f
            java.lang.String r4 = "istu"
            r6 = 0
            boolean r3 = r5.getBoolean(r3, r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0805 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
        L_0x072f:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0805 }
            r3.<init>()     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ all -> 0x0805 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0805 }
            int r5 = r5.mcc     // Catch:{ all -> 0x0805 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0805 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ all -> 0x0805 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0805 }
            int r5 = r5.mnc     // Catch:{ all -> 0x0805 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0805 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "sig"
            r4 = r21
            android.app.Application r5 = r4.valueOf     // Catch:{ all -> 0x0805 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0805 }
            android.app.Application r4 = r4.valueOf     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = com.appsflyer.internal.C0630z.AFInAppEventParameterName(r5, r4)     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "last_boot_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0805 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0805 }
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "disk"
            android.os.StatFs r4 = new android.os.StatFs     // Catch:{ all -> 0x0805 }
            java.io.File r5 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x0805 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0805 }
            r4.<init>(r5)     // Catch:{ all -> 0x0805 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0805 }
            r6 = 18
            if (r5 < r6) goto L_0x07ae
            long r5 = r4.getBlockSizeLong()     // Catch:{ all -> 0x0805 }
            long r7 = r4.getAvailableBlocksLong()     // Catch:{ all -> 0x0805 }
            long r7 = r7 * r5
            long r9 = r4.getBlockCountLong()     // Catch:{ all -> 0x0805 }
            long r9 = r9 * r5
            goto L_0x07c0
        L_0x07ae:
            int r5 = r4.getBlockSize()     // Catch:{ all -> 0x0805 }
            int r6 = r4.getAvailableBlocks()     // Catch:{ all -> 0x0805 }
            int r6 = r6 * r5
            long r7 = (long) r6     // Catch:{ all -> 0x0805 }
            int r4 = r4.getBlockCount()     // Catch:{ all -> 0x0805 }
            int r4 = r4 * r5
            long r9 = (long) r4     // Catch:{ all -> 0x0805 }
        L_0x07c0:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = java.lang.Math.pow(r4, r11)     // Catch:{ all -> 0x0805 }
            double r6 = (double) r7
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r4
            long r6 = (long) r6
            double r8 = (double) r9
            java.lang.Double.isNaN(r8)
            double r8 = r8 / r4
            long r4 = (long) r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0805 }
            r8.<init>()     // Catch:{ all -> 0x0805 }
            r8.append(r6)     // Catch:{ all -> 0x0805 }
            java.lang.String r6 = "/"
            r8.append(r6)     // Catch:{ all -> 0x0805 }
            r8.append(r4)     // Catch:{ all -> 0x0805 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0805 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0805 }
            com.appsflyer.internal.y r3 = r1.getLevel     // Catch:{ all -> 0x0805 }
            if (r3 == 0) goto L_0x080e
            java.lang.String[] r3 = r3.AFInAppEventParameterName     // Catch:{ all -> 0x0805 }
            if (r3 == 0) goto L_0x080e
            java.lang.String r4 = "sharing_filter"
            r2.put(r4, r3)     // Catch:{ all -> 0x0805 }
            goto L_0x080e
        L_0x07f9:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ all -> 0x0805 }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.values((java.lang.String) r3)     // Catch:{ all -> 0x0805 }
            r2 = 0
            return r2
        L_0x0805:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.AFInAppEventParameterName((java.lang.String) r4, (java.lang.Throwable) r3)
        L_0x080e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.AFInAppEventType(com.appsflyer.internal.i):java.util.Map");
    }

    private static Map<String, Object> AFLogger$LogLevel(Context context) {
        Location valueOf2 = C0618v.C0619b.AFKeystoreWrapper.valueOf(context);
        HashMap hashMap = new HashMap(3);
        if (valueOf2 != null) {
            hashMap.put("lat", String.valueOf(valueOf2.getLatitude()));
            hashMap.put("lon", String.valueOf(valueOf2.getLongitude()));
            hashMap.put("ts", String.valueOf(valueOf2.getTime()));
            int i = setCustomerIdAndLogSession + 65;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
        }
        int i3 = setCustomerIdAndLogSession + 63;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            return hashMap;
        }
        Object obj = null;
        super.hashCode();
        return hashMap;
    }

    private static void AFInAppEventType(Map<String, Object> map, C0556cl clVar) {
        HashMap hashMap = new HashMap(clVar.values);
        clVar.values.clear();
        clVar.valueOf.AFInAppEventType("gcd");
        if ((!hashMap.isEmpty() ? (char) 20 : 15) == 20) {
            int i = setCustomerIdAndLogSession + 27;
            waitForCustomerUserId = i % 128;
            if (!(i % 2 == 0)) {
                AFInAppEventType(map).put("gcd", hashMap);
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            AFInAppEventType(map).put("gcd", hashMap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        return com.appsflyer.internal.C0473af.valueOf(new java.lang.ref.WeakReference(new com.appsflyer.internal.C0453aa(r6).AFInAppEventParameterName));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getAppsFlyerUID(android.content.Context r6) {
        /*
            r5 = this;
            int r0 = waitForCustomerUserId
            int r0 = r0 + 85
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = 23
            if (r0 != 0) goto L_0x0011
            r0 = 40
            goto L_0x0013
        L_0x0011:
            r0 = 23
        L_0x0013:
            r2 = 1
            java.lang.String r3 = "getAppsFlyerUID"
            r4 = 0
            if (r0 == r1) goto L_0x0029
            com.appsflyer.internal.ak r0 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r1 = new java.lang.String[r4]
            r0.AFKeystoreWrapper(r3, r1)
            if (r6 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0044
            goto L_0x0038
        L_0x0029:
            com.appsflyer.internal.ak r0 = com.appsflyer.internal.C0484ak.AFInAppEventType()
            java.lang.String[] r1 = new java.lang.String[r4]
            r0.AFKeystoreWrapper(r3, r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 == 0) goto L_0x0044
        L_0x0038:
            r6 = 0
            int r0 = waitForCustomerUserId
            int r0 = r0 + 9
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            return r6
        L_0x0044:
            com.appsflyer.internal.aa r0 = new com.appsflyer.internal.aa
            r0.<init>(r6)
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.content.Context r0 = r0.AFInAppEventParameterName
            r6.<init>(r0)
            java.lang.String r6 = com.appsflyer.internal.C0473af.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0102, code lost:
        if ((r3 ? 'O' : 'F') != 'F') goto L_0x0104;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181 A[SYNTHETIC, Splitter:B:75:0x0181] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.appsflyer.internal.C0607i r15) throws java.io.IOException {
        /*
            r14 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r15.onDeepLinkingNative
            r0.<init>(r1)
            byte[] r1 = r15.AFInAppEventParameterName()
            java.lang.String r4 = r15.AFVersionDeclaration
            java.lang.String r2 = r15.init
            boolean r3 = r15.valueOf()
            android.app.Application r5 = r15.AFKeystoreWrapper
            com.appsflyer.attribution.AppsFlyerRequestListener r6 = r15.AFInAppEventParameterName
            com.appsflyer.internal.bg r7 = r14.values()
            com.appsflyer.internal.cl r7 = r7.getLevel()
            if (r3 == 0) goto L_0x003a
            int r8 = waitForCustomerUserId
            int r8 = r8 + 117
            int r9 = r8 % 128
            setCustomerIdAndLogSession = r9
            int r8 = r8 % 2
            int r8 = r15.onInstallConversionFailureNative
            r7.valueOf((int) r8)
            int r8 = setCustomerIdAndLogSession
            int r8 = r8 + 59
            int r9 = r8 % 128
            waitForCustomerUserId = r9
            int r8 = r8 % 2
        L_0x003a:
            r8 = 0
            java.net.URLConnection r9 = r0.openConnection()     // Catch:{ all -> 0x0188 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ all -> 0x0188 }
            java.lang.String r10 = "POST"
            r9.setRequestMethod(r10)     // Catch:{ all -> 0x0185 }
            int r10 = r1.length     // Catch:{ all -> 0x0185 }
            java.lang.String r11 = "Content-Length"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0185 }
            r9.setRequestProperty(r11, r10)     // Catch:{ all -> 0x0185 }
            java.lang.String r10 = "Content-Type"
            boolean r11 = r15.AFInAppEventType()     // Catch:{ all -> 0x0185 }
            java.lang.String r12 = "application/octet-stream"
            if (r11 == 0) goto L_0x0068
            int r11 = waitForCustomerUserId
            int r11 = r11 + 121
            int r13 = r11 % 128
            setCustomerIdAndLogSession = r13
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x006a
            int r11 = r8.length     // Catch:{ all -> 0x0185 }
            goto L_0x006a
        L_0x0068:
            java.lang.String r12 = "application/json"
        L_0x006a:
            r9.setRequestProperty(r10, r12)     // Catch:{ all -> 0x0185 }
            r10 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r10)     // Catch:{ all -> 0x0185 }
            r10 = 1
            r9.setDoOutput(r10)     // Catch:{ all -> 0x0185 }
            com.appsflyer.AppsFlyerProperties r11 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0185 }
            java.lang.String r12 = "http_cache"
            boolean r11 = r11.getBoolean(r12, r10)     // Catch:{ all -> 0x0185 }
            r12 = 0
            if (r11 != 0) goto L_0x0086
            r9.setUseCaches(r12)     // Catch:{ all -> 0x0185 }
        L_0x0086:
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch:{ all -> 0x017e }
            java.io.OutputStream r13 = r9.getOutputStream()     // Catch:{ all -> 0x017e }
            r11.<init>(r13)     // Catch:{ all -> 0x017e }
            r11.write(r1)     // Catch:{ all -> 0x017b }
            r11.close()     // Catch:{ all -> 0x0185 }
            int r1 = r9.getResponseCode()     // Catch:{ all -> 0x0185 }
            r8 = 50
            if (r3 == 0) goto L_0x00a0
            r11 = 50
            goto L_0x00a2
        L_0x00a0:
            r11 = 61
        L_0x00a2:
            if (r11 == r8) goto L_0x00a5
            goto L_0x00b4
        L_0x00a5:
            int r8 = setCustomerIdAndLogSession
            int r8 = r8 + 11
            int r11 = r8 % 128
            waitForCustomerUserId = r11
            int r8 = r8 % 2
            int r8 = r15.onInstallConversionFailureNative     // Catch:{ all -> 0x0185 }
            r7.AFInAppEventType(r8)     // Catch:{ all -> 0x0185 }
        L_0x00b4:
            java.lang.String r7 = AFInAppEventParameterName((java.net.HttpURLConnection) r9)     // Catch:{ all -> 0x0185 }
            com.appsflyer.internal.ak r8 = com.appsflyer.internal.C0484ak.AFInAppEventType()     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0185 }
            r8.values(r0, r1, r7)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = "response code: "
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = r0.concat(r8)     // Catch:{ all -> 0x0185 }
            com.appsflyer.AFLogger.values((java.lang.String) r0)     // Catch:{ all -> 0x0185 }
            android.content.SharedPreferences r0 = AFInAppEventType((android.content.Context) r5)     // Catch:{ all -> 0x0185 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r1 != r8) goto L_0x014d
            r8 = 46
            if (r5 == 0) goto L_0x00df
            r11 = 46
            goto L_0x00e1
        L_0x00df:
            r11 = 32
        L_0x00e1:
            if (r11 == r8) goto L_0x00e4
            goto L_0x0111
        L_0x00e4:
            int r8 = setCustomerIdAndLogSession
            int r8 = r8 + 115
            int r11 = r8 % 128
            waitForCustomerUserId = r11
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x00f9
            r8 = 2
            int r8 = r8 / r12
            if (r3 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r10 = 0
        L_0x00f6:
            if (r10 == 0) goto L_0x0111
            goto L_0x0104
        L_0x00f9:
            r8 = 70
            if (r3 == 0) goto L_0x0100
            r3 = 79
            goto L_0x0102
        L_0x0100:
            r3 = 70
        L_0x0102:
            if (r3 == r8) goto L_0x0111
        L_0x0104:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0185 }
            r14.onResponseNative = r10     // Catch:{ all -> 0x0185 }
            com.appsflyer.internal.bg r3 = r14.values()     // Catch:{ all -> 0x0185 }
            r3.AFKeystoreWrapper()     // Catch:{ all -> 0x0185 }
        L_0x0111:
            if (r6 == 0) goto L_0x0116
            r6.onSuccess()     // Catch:{ all -> 0x0185 }
        L_0x0116:
            if (r2 == 0) goto L_0x012e
            com.appsflyer.internal.bg r3 = r14.values()     // Catch:{ all -> 0x0185 }
            com.appsflyer.internal.l r3 = r3.AFVersionDeclaration()     // Catch:{ all -> 0x0185 }
            r3.valueOf(r2)     // Catch:{ all -> 0x0185 }
            int r2 = setCustomerIdAndLogSession
            int r2 = r2 + 85
            int r3 = r2 % 128
            waitForCustomerUserId = r3
            int r2 = r2 % 2
            goto L_0x0138
        L_0x012e:
            java.lang.String r2 = "sentSuccessfully"
            java.lang.String r3 = "true"
            valueOf((android.content.Context) r5, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0185 }
            r14.onAppOpenAttributionNative(r5)     // Catch:{ all -> 0x0185 }
        L_0x0138:
            com.appsflyer.internal.cd r2 = new com.appsflyer.internal.cd     // Catch:{ all -> 0x0185 }
            r2.<init>(r5)     // Catch:{ all -> 0x0185 }
            r2.AFKeystoreWrapper()     // Catch:{ all -> 0x0185 }
            org.json.JSONObject r2 = com.appsflyer.internal.C0501as.AFInAppEventParameterName(r7)     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = "send_background"
            boolean r2 = r2.optBoolean(r3, r12)     // Catch:{ all -> 0x0185 }
            r14.onValidateInApp = r2     // Catch:{ all -> 0x0185 }
            goto L_0x016a
        L_0x014d:
            if (r6 == 0) goto L_0x016a
            int r2 = com.appsflyer.attribution.RequestError.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x0185 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r3.<init>()     // Catch:{ all -> 0x0185 }
            java.lang.String r7 = com.appsflyer.internal.C0513ba.AFInAppEventType     // Catch:{ all -> 0x0185 }
            r3.append(r7)     // Catch:{ all -> 0x0185 }
            java.lang.String r7 = " "
            r3.append(r7)     // Catch:{ all -> 0x0185 }
            r3.append(r1)     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0185 }
            r6.onError(r2, r3)     // Catch:{ all -> 0x0185 }
        L_0x016a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0185 }
            r8 = 0
            r2 = r14
            r3 = r15
            r6 = r0
            com.appsflyer.internal.C0551cg.AFInAppEventType(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0185 }
            if (r9 == 0) goto L_0x017a
            r9.disconnect()
        L_0x017a:
            return
        L_0x017b:
            r15 = move-exception
            r8 = r11
            goto L_0x017f
        L_0x017e:
            r15 = move-exception
        L_0x017f:
            if (r8 == 0) goto L_0x0184
            r8.close()     // Catch:{ all -> 0x0185 }
        L_0x0184:
            throw r15     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r15 = move-exception
            r8 = r9
            goto L_0x0189
        L_0x0188:
            r15 = move-exception
        L_0x0189:
            if (r8 == 0) goto L_0x018e
            r8.disconnect()
        L_0x018e:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.init(com.appsflyer.internal.i):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.lang.String r6, int r7) {
        /*
            if (r6 == 0) goto L_0x0006
            char[] r6 = r6.toCharArray()
        L_0x0006:
            char[] r6 = (char[]) r6
            java.lang.Object r0 = com.appsflyer.internal.C0593dn.valueOf
            monitor-enter(r0)
            com.appsflyer.internal.C0593dn.AFInAppEventType = r7     // Catch:{ all -> 0x003b }
            int r7 = r6.length     // Catch:{ all -> 0x003b }
            char[] r7 = new char[r7]     // Catch:{ all -> 0x003b }
            r1 = 0
            com.appsflyer.internal.C0593dn.values = r1     // Catch:{ all -> 0x003b }
        L_0x0013:
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r2 = r6.length     // Catch:{ all -> 0x003b }
            if (r1 >= r2) goto L_0x0034
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r2 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            char r2 = r6[r2]     // Catch:{ all -> 0x003b }
            int r3 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r4 = com.appsflyer.internal.C0593dn.AFInAppEventType     // Catch:{ all -> 0x003b }
            int r3 = r3 * r4
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            long r4 = enableLocationCollection     // Catch:{ all -> 0x003b }
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch:{ all -> 0x003b }
            char r2 = (char) r3     // Catch:{ all -> 0x003b }
            r7[r1] = r2     // Catch:{ all -> 0x003b }
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r1 = r1 + 1
            com.appsflyer.internal.C0593dn.values = r1     // Catch:{ all -> 0x003b }
            goto L_0x0013
        L_0x0034:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x003b }
            r6.<init>(r7)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r6
        L_0x003b:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x003f
        L_0x003e:
            throw r6
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0458ac.values(java.lang.String, int):java.lang.String");
    }
}
