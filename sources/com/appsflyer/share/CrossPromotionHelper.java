package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C0458ac;
import com.appsflyer.internal.C0577db;
import com.appsflyer.internal.C0586dg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    private static String AFInAppEventParameterName = "https://%simpression.%s";

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, (Map<String, String>) null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator valueOf = valueOf(context, str, str2, map, String.format(C0577db.AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new C0631d(valueOf.generateLink(), new C0586dg(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, (Map<String, String>) null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        new Thread(new C0631d(valueOf(context, str, str2, map, String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C0458ac.AFInAppEventParameterName().getHostName()})).generateLink(), (C0586dg) null, (Context) null, AppsFlyerLib.getInstance().isStopped())).start();
    }

    private static LinkGenerator valueOf(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && str2.equals("impression")) {
                    c = 1;
                }
            } else if (str2.equals("app")) {
                c = 0;
            }
            if (c == 0) {
                C0577db.AFInAppEventParameterName = str;
            } else if (c == 1) {
                AFInAppEventParameterName = str;
            }
        }
    }

    /* renamed from: com.appsflyer.share.CrossPromotionHelper$d */
    static class C0631d implements Runnable {
        private final C0586dg AFInAppEventParameterName;
        private final String AFKeystoreWrapper;
        private final WeakReference<Context> valueOf;
        private final boolean values;

        C0631d(String str, C0586dg dgVar, Context context, boolean z) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventParameterName = dgVar;
            this.valueOf = new WeakReference<>(context);
            this.values = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00be A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                boolean r0 = r6.values
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00b1 }
                java.lang.String r2 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00b1 }
                r1.<init>(r2)     // Catch:{ all -> 0x00b1 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00b1 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00b1 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x00af }
                r0 = 0
                r1.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00af }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00af }
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 == r3) goto L_0x0096
                r3 = 301(0x12d, float:4.22E-43)
                if (r2 == r3) goto L_0x0048
                r3 = 302(0x12e, float:4.23E-43)
                if (r2 == r3) goto L_0x0048
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
                java.lang.String r3 = "call to "
                r0.<init>(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r3 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00af }
                r0.append(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r3 = " failed: "
                r0.append(r3)     // Catch:{ all -> 0x00af }
                r0.append(r2)     // Catch:{ all -> 0x00af }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00af }
                com.appsflyer.AFLogger.values((java.lang.String) r0)     // Catch:{ all -> 0x00af }
                goto L_0x00a9
            L_0x0048:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
                java.lang.String r3 = "Cross promotion redirection success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r3 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00af }
                r2.append(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00af }
                com.appsflyer.AFLogger.values(r2, r0)     // Catch:{ all -> 0x00af }
                com.appsflyer.internal.dg r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00af }
                if (r0 == 0) goto L_0x00a9
                java.lang.ref.WeakReference<android.content.Context> r0 = r6.valueOf     // Catch:{ all -> 0x00af }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00af }
                if (r0 == 0) goto L_0x00a9
                com.appsflyer.internal.dg r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00af }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ all -> 0x00af }
                r0.values = r2     // Catch:{ all -> 0x00af }
                com.appsflyer.internal.dg r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00af }
                java.lang.ref.WeakReference<android.content.Context> r2 = r6.valueOf     // Catch:{ all -> 0x00af }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00af }
                android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x00af }
                java.lang.String r3 = r0.values     // Catch:{ all -> 0x00af }
                if (r3 == 0) goto L_0x00a9
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x00af }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r0 = r0.values     // Catch:{ all -> 0x00af }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00af }
                r3.<init>(r4, r0)     // Catch:{ all -> 0x00af }
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r0 = r3.setFlags(r0)     // Catch:{ all -> 0x00af }
                r2.startActivity(r0)     // Catch:{ all -> 0x00af }
                goto L_0x00a9
            L_0x0096:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
                java.lang.String r3 = "Cross promotion impressions success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r3 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00af }
                r2.append(r3)     // Catch:{ all -> 0x00af }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00af }
                com.appsflyer.AFLogger.values(r2, r0)     // Catch:{ all -> 0x00af }
            L_0x00a9:
                if (r1 == 0) goto L_0x00c1
                r1.disconnect()
                return
            L_0x00af:
                r0 = move-exception
                goto L_0x00b5
            L_0x00b1:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x00b5:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00c2 }
                com.appsflyer.AFLogger.AFInAppEventParameterName((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x00c1
                r1.disconnect()
            L_0x00c1:
                return
            L_0x00c2:
                r0 = move-exception
                if (r1 == 0) goto L_0x00c8
                r1.disconnect()
            L_0x00c8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.C0631d.run():void");
        }
    }
}
