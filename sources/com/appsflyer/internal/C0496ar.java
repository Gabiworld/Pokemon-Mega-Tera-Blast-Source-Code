package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C0490an;
import com.appsflyer.internal.C0580dd;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ar */
public final class C0496ar extends C0557cm {
    public static long onInstallConversionDataLoadedNative = 0;
    private static String onResponseErrorNative = "https://%sdlsdk.%s/v1.0/android/";
    private final List<C0580dd> onAppOpenAttribution = new ArrayList();
    public final C0556cl onAppOpenAttributionNative;
    private boolean onAttributionFailure;
    public int onAttributionFailureNative;
    private int onConversionDataFail;
    private int onDeepLinking;
    private final CountDownLatch onResponseNative = new CountDownLatch(1);

    public C0496ar(Context context, C0556cl clVar) {
        super((String) null, onResponseErrorNative, Boolean.FALSE, Boolean.TRUE, (Boolean) null, context);
        this.onAppOpenAttributionNative = clVar;
    }

    private boolean AFKeystoreWrapper() {
        int i;
        List list = (List) this.AFInAppEventType.get("referrers");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= this.onDeepLinking || this.AFInAppEventType.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AFInAppEventParameterName(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = r9.onAttributionFailureNative
            r1 = 1
            int r0 = r0 + r1
            r9.onAttributionFailureNative = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Preparing request "
            r0.<init>(r2)
            int r2 = r9.onAttributionFailureNative
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            int r0 = r9.onAttributionFailureNative
            java.lang.String r2 = "-"
            if (r0 != r1) goto L_0x00ae
            com.appsflyer.internal.ac r0 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            boolean r4 = com.appsflyer.internal.C0458ac.AFKeystoreWrapper((android.content.Context) r10)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "is_first"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getLanguage()
            r4.append(r5)
            r4.append(r2)
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getCountry()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "lang"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "os"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r5 = "type"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.String r4 = r0.getAppsFlyerUID(r10)
            java.lang.String r5 = "request_id"
            r3.put(r5, r4)
            com.appsflyer.internal.y r0 = r0.getLevel
            if (r0 == 0) goto L_0x0087
            java.lang.String[] r0 = r0.AFInAppEventParameterName
            if (r0 == 0) goto L_0x0087
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.String r4 = "sharing_filter"
            r3.put(r4, r0)
        L_0x0087:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.g r0 = com.appsflyer.internal.C0457ab.AFKeystoreWrapper(r10, r0)
            java.util.Map r0 = r9.valueOf((com.appsflyer.internal.C0602g) r0)
            com.appsflyer.internal.g r3 = com.appsflyer.internal.C0457ab.AFInAppEventType((android.content.Context) r10)
            java.util.Map r3 = r9.valueOf((com.appsflyer.internal.C0602g) r3)
            if (r0 == 0) goto L_0x00a5
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.AFInAppEventType
            java.lang.String r5 = "gaid"
            r4.put(r5, r0)
        L_0x00a5:
            if (r3 == 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.AFInAppEventType
            java.lang.String r4 = "oaid"
            r0.put(r4, r3)
        L_0x00ae:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.AFInAppEventType
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            r3.<init>(r5, r4)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "UTC"
            java.util.TimeZone r6 = java.util.TimeZone.getTimeZone(r6)
            r3.setTimeZone(r6)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r4)
            java.lang.String r3 = r3.format(r6)
            java.lang.String r4 = "timestamp"
            r0.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.AFInAppEventType
            int r3 = r9.onAttributionFailureNative
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "request_count"
            r0.put(r5, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.appsflyer.internal.dd> r3 = r9.onAppOpenAttribution
            java.util.Iterator r3 = r3.iterator()
        L_0x00ec:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0129
            java.lang.Object r5 = r3.next()
            com.appsflyer.internal.dd r5 = (com.appsflyer.internal.C0580dd) r5
            com.appsflyer.internal.dd$d r6 = r5.AFInAppEventParameterName
            com.appsflyer.internal.dd$d r7 = com.appsflyer.internal.C0580dd.C0582d.FINISHED
            if (r6 != r7) goto L_0x0122
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r5.AFInAppEventType
            java.lang.String r8 = "referrer"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0122
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.AFInAppEventType
            java.lang.String r8 = "source"
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            r6.put(r8, r5)
            java.lang.String r5 = "value"
            r6.put(r5, r7)
            goto L_0x0123
        L_0x0122:
            r6 = 0
        L_0x0123:
            if (r6 == 0) goto L_0x00ec
            r0.add(r6)
            goto L_0x00ec
        L_0x0129:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0136
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.AFInAppEventType
            java.lang.String r5 = "referrers"
            r3.put(r5, r0)
        L_0x0136:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getDevKey()
            com.appsflyer.internal.ac r3 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()
            java.lang.String r3 = r3.AFInAppEventParameterName((android.content.Context) r10)
            if (r3 == 0) goto L_0x015b
            java.lang.String r5 = r3.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x015b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            goto L_0x015d
        L_0x015b:
            java.lang.String r2 = ""
        L_0x015d:
            java.lang.String r3 = onResponseErrorNative
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            com.appsflyer.AppsFlyerLib r7 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r7 = r7.getHostPrefix()
            r5[r6] = r7
            com.appsflyer.internal.ac r6 = com.appsflyer.internal.C0458ac.AFInAppEventParameterName()
            java.lang.String r6 = r6.getHostName()
            r5[r1] = r6
            java.lang.String r1 = java.lang.String.format(r3, r5)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r10.getPackageName()
            r3.append(r10)
            r3.append(r2)
            java.lang.String r10 = r3.toString()
            android.net.Uri$Builder r10 = r1.appendPath(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.AFInAppEventType
            java.lang.Object r2 = r2.get(r4)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.appsflyer.internal.C0474ag.valueOf(r1, r0)
            java.lang.String r1 = "af_sig"
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r1, r0)
            java.lang.String r0 = com.appsflyer.internal.C0458ac.AFInAppEventType
            java.lang.String r1 = "sdk_version"
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r1, r0)
            android.net.Uri r10 = r10.build()
            java.lang.String r10 = r10.toString()
            r9.AFInAppEventType(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0496ar.AFInAppEventParameterName(android.content.Context):void");
    }

    /* renamed from: com.appsflyer.internal.ar$2 */
    static /* synthetic */ class C04982 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.internal.dd$d[] r0 = com.appsflyer.internal.C0580dd.C0582d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFInAppEventParameterName = r0
                com.appsflyer.internal.dd$d r1 = com.appsflyer.internal.C0580dd.C0582d.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.dd$d r1 = com.appsflyer.internal.C0580dd.C0582d.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0496ar.C04982.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void values(C0580dd ddVar) {
        if (AFInAppEventType(ddVar)) {
            this.onAppOpenAttribution.add(ddVar);
            this.onResponseNative.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(ddVar.getClass().getSimpleName());
            AFLogger.AFInAppEventParameterName(sb.toString());
            return;
        }
        int i = this.onConversionDataFail + 1;
        this.onConversionDataFail = i;
        if (i == this.onDeepLinking) {
            this.onResponseNative.countDown();
        }
    }

    private static boolean AFInAppEventType(C0580dd ddVar) {
        Long l = (Long) ddVar.AFInAppEventType.get("click_ts");
        if (l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    private Map<String, Object> valueOf(final C0602g gVar) {
        Boolean bool;
        boolean z = false;
        if (!(gVar == null || gVar.values == null || ((bool = gVar.AFKeystoreWrapper) != null && bool.booleanValue()))) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() {
                {
                    put("type", "unhashed");
                    put(SDKConstants.PARAM_VALUE, C0602g.this.values);
                }
            };
        }
        return null;
    }

    static /* synthetic */ void valueOf(C0496ar arVar) {
        ArrayList<C0580dd> arrayList = new ArrayList<>();
        for (C0580dd ddVar : C0458ac.AFInAppEventParameterName().valueOf()) {
            if (!(ddVar == null || ddVar.AFInAppEventParameterName == C0580dd.C0582d.NOT_STARTED)) {
                arrayList.add(ddVar);
            }
        }
        arVar.onDeepLinking = arrayList.size();
        for (final C0580dd ddVar2 : arrayList) {
            int i = C04982.AFInAppEventParameterName[ddVar2.AFInAppEventParameterName.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(ddVar2.AFInAppEventType.get(ShareConstants.FEED_SOURCE_PARAM));
                sb.append(" referrer collected earlier");
                AFLogger.AFInAppEventParameterName(sb.toString());
                arVar.values(ddVar2);
            } else if (i == 2) {
                ddVar2.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb = new StringBuilder("[DDL] ");
                        sb.append(ddVar2.AFInAppEventType.get(ShareConstants.FEED_SOURCE_PARAM));
                        sb.append(" referrer collected via observer");
                        AFLogger.AFInAppEventParameterName(sb.toString());
                        C0496ar.this.values((C0580dd) observable);
                    }
                });
            }
        }
    }

    static /* synthetic */ DeepLinkResult AFInAppEventType(C0496ar arVar, Context context) throws IOException, JSONException, InterruptedException {
        DeepLink deepLink;
        while (true) {
            C0556cl clVar = arVar.onAppOpenAttributionNative;
            int i = arVar.onAttributionFailureNative;
            if (i <= 0 || i > 2) {
                AFLogger.values((Throwable) new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                clVar.AFVersionDeclaration[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    if (clVar.AppsFlyer2dXConversionCallback != 0) {
                        clVar.AFKeystoreWrapper.put("from_fg", Long.valueOf(clVar.AFVersionDeclaration[i2] - clVar.AppsFlyer2dXConversionCallback));
                        clVar.valueOf.AFInAppEventParameterName("ddl", new JSONObject(clVar.AFKeystoreWrapper).toString());
                    } else {
                        AFLogger.values("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection values = new C0490an.C0491c(arVar).values();
            C0556cl clVar2 = arVar.onAppOpenAttributionNative;
            int i3 = arVar.onAttributionFailureNative;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.values((Throwable) new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                clVar2.init[i4] = System.currentTimeMillis();
                if (clVar2.AFVersionDeclaration[i4] != 0) {
                    clVar2.AFLogger$LogLevel[i4] = clVar2.init[i4] - clVar2.AFVersionDeclaration[i4];
                    clVar2.AFKeystoreWrapper.put("net", clVar2.AFLogger$LogLevel);
                    clVar2.valueOf.AFInAppEventParameterName("ddl", new JSONObject(clVar2.AFKeystoreWrapper).toString());
                } else {
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i4);
                    sb.append("] ts is missing");
                    AFLogger.values(sb.toString());
                }
            }
            if (values.getResponseCode() == 200) {
                C0458ac.AFInAppEventParameterName();
                JSONObject jSONObject = new JSONObject(C0458ac.AFInAppEventParameterName(values));
                arVar.onAttributionFailure = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    deepLink = null;
                } else {
                    deepLink = DeepLink.AFInAppEventParameterName(jSONObject.optJSONObject("click_event"));
                    deepLink.valueOf.put("is_deferred", true);
                }
                if (deepLink != null) {
                    return new DeepLinkResult(deepLink, (DeepLinkResult.Error) null);
                }
                if (arVar.onAttributionFailureNative <= 1 && arVar.AFKeystoreWrapper() && arVar.onAttributionFailure) {
                    AFLogger.AFInAppEventParameterName("[DDL] Waiting for referrers...");
                    arVar.onResponseNative.await();
                    C0556cl clVar3 = arVar.onAppOpenAttributionNative;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (clVar3.init[0] != 0) {
                        clVar3.AFKeystoreWrapper.put("rfr_wait", Long.valueOf(currentTimeMillis - clVar3.init[0]));
                        clVar3.valueOf.AFInAppEventParameterName("ddl", new JSONObject(clVar3.AFKeystoreWrapper).toString());
                    } else {
                        AFLogger.values("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (arVar.onConversionDataFail == arVar.onDeepLinking) {
                        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
                    }
                    arVar.AFInAppEventParameterName(context);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb2.append(values.getResponseCode());
                AFLogger.AFInAppEventParameterName(sb2.toString());
                return new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
    }
}
