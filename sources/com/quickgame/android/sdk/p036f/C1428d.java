package com.quickgame.android.sdk.p036f;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.codeless.internal.Constants;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p043l.C1599b;
import com.quickgame.android.sdk.p043l.C1600c;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.f.d */
public class C1428d {

    /* renamed from: a */
    private static final ExecutorService f1257a = Executors.newCachedThreadPool();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Handler f1258b = new Handler(Looper.getMainLooper());

    /* renamed from: com.quickgame.android.sdk.f.d$a */
    class C1429a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f1259a;

        /* renamed from: b */
        final /* synthetic */ String f1260b;

        /* renamed from: c */
        final /* synthetic */ C1426b f1261c;

        /* renamed from: com.quickgame.android.sdk.f.d$a$a */
        class C1430a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSONObject f1262a;

            C1430a(JSONObject jSONObject) {
                this.f1262a = jSONObject;
            }

            public void run() {
                C1429a.this.f1261c.onSuccess(this.f1262a);
            }
        }

        /* renamed from: com.quickgame.android.sdk.f.d$a$b */
        class C1431b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSONObject f1264a;

            C1431b(JSONObject jSONObject) {
                this.f1264a = jSONObject;
            }

            public void run() {
                C1429a.this.f1261c.onFailed(new C1427c(C1428d.m1706c(this.f1264a), C1428d.m1707d(this.f1264a)));
            }
        }

        C1429a(Activity activity, String str, C1426b bVar) {
            this.f1259a = activity;
            this.f1260b = str;
            this.f1261c = bVar;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("deviceName", Build.MODEL);
            String a = C1599b.m2045a(this.f1259a);
            C1600c.m2049a((Context) this.f1259a).mo13039a(a);
            int i = 0;
            if (TextUtils.isEmpty(a)) {
                hashMap.put("ismobiledevice", 0);
            } else {
                hashMap.put("ismobiledevice", 1);
            }
            hashMap.put("isjailbroken", 0);
            String str = "";
            hashMap.put("pushToken", str);
            hashMap.put("gaid", a);
            hashMap.put("flashversion", str);
            hashMap.put("countryCode", C1601d.m2068c(this.f1259a));
            hashMap.put("bluetoothMac", str);
            hashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("javasupport", 1);
            hashMap.put("osName", Constants.PLATFORM);
            hashMap.put("defaultbrowser", str);
            hashMap.put("osLanguage", C1601d.m2060a());
            int[] f = C1601d.m2072f(this.f1259a);
            hashMap.put("screenWidth", Integer.valueOf(f[0]));
            hashMap.put("screenHeight", Integer.valueOf(f[1]));
            hashMap.put("dpi", Integer.valueOf(f[2]));
            hashMap.put("imsi", C1599b.m2048d(this.f1259a));
            hashMap.put("netType", Integer.valueOf(C1601d.m2071e(this.f1259a)));
            hashMap.put("longitude", 0);
            hashMap.put("latitude", 0);
            hashMap.put("imei", C1599b.m2046b(this.f1259a));
            hashMap.put("androidId", C1599b.m2046b(this.f1259a));
            hashMap.put("adId", C1599b.m2045a(this.f1259a));
            QGLog.m2386d("QGHttpUtils", "url " + this.f1260b + " thread name:" + Thread.currentThread().getName());
            Map<String, String> a2 = C1428d.m1701a((Map<String, Object>) hashMap);
            JSONObject jSONObject = null;
            while (true) {
                i++;
                if (i > 5) {
                    break;
                }
                if (i > 1) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException unused) {
                    }
                }
                jSONObject = C1423a.m1689a().mo12661a(this.f1260b, a2);
                if (jSONObject != null && jSONObject.optBoolean("result")) {
                    break;
                }
            }
            if (jSONObject != null && jSONObject.has("result") && jSONObject.optBoolean("result")) {
                C1428d.f1258b.post(new C1430a(jSONObject));
            } else if (jSONObject == null || !jSONObject.has("result")) {
                C1426b bVar = this.f1261c;
                if (jSONObject != null) {
                    str = jSONObject.toString();
                }
                bVar.onFailed(new C1427c(-999, str));
            } else {
                C1428d.f1258b.post(new C1431b(jSONObject));
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.f.d$b */
    class C1432b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1266a;

        /* renamed from: b */
        final /* synthetic */ Map f1267b;

        /* renamed from: c */
        final /* synthetic */ C1426b f1268c;

        /* renamed from: com.quickgame.android.sdk.f.d$b$a */
        class C1433a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSONObject f1269a;

            C1433a(JSONObject jSONObject) {
                this.f1269a = jSONObject;
            }

            public void run() {
                C1426b bVar = C1432b.this.f1268c;
                if (bVar != null) {
                    JSONObject jSONObject = this.f1269a;
                    if (jSONObject == null) {
                        bVar.onFailed(new C1427c(-999, "response is null"));
                    } else if (!jSONObject.has("result")) {
                        C1432b.this.f1268c.onFailed(new C1427c(-999, this.f1269a.toString()));
                    } else if (this.f1269a.optBoolean("result")) {
                        C1432b.this.f1268c.onSuccess(this.f1269a);
                    } else {
                        C1432b.this.f1268c.onFailed(new C1427c(C1428d.m1706c(this.f1269a), C1428d.m1707d(this.f1269a)));
                    }
                }
            }
        }

        C1432b(String str, Map map, C1426b bVar) {
            this.f1266a = str;
            this.f1267b = map;
            this.f1268c = bVar;
        }

        public void run() {
            QGLog.m2386d("QGHttpUtils", "url " + this.f1266a + " thread name:" + Thread.currentThread().getName());
            C1428d.f1258b.post(new C1433a(C1423a.m1689a().mo12661a(this.f1266a, C1428d.m1701a((Map<String, Object>) this.f1267b))));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m1706c(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("error").optInt("id");
        } catch (Exception unused) {
            return -999;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r3.getString("error");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1707d(org.json.JSONObject r3) {
        /*
            java.lang.String r0 = "error"
            boolean r1 = r3.has(r0)     // Catch:{ Exception -> 0x0023 }
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = r3.optString(r0)     // Catch:{ Exception -> 0x0023 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0023 }
            r2 = 2
            if (r1 <= r2) goto L_0x003e
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = "message"
            java.lang.String r3 = r1.getString(r2)     // Catch:{ Exception -> 0x001e }
            return r3
        L_0x001e:
            java.lang.String r3 = r3.getString(r0)     // Catch:{ Exception -> 0x0023 }
            return r3
        L_0x0023:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "exception "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "getErrorMsg"
            android.util.Log.d(r1, r0)
        L_0x003e:
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.p036f.C1428d.m1707d(org.json.JSONObject):java.lang.String");
    }

    /* renamed from: b */
    public static String m1704b(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        TreeMap treeMap = new TreeMap(map);
        StringBuilder sb = new StringBuilder();
        for (String str : treeMap.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(treeMap.get(str) == null ? "" : treeMap.get(str));
            sb.append("&");
        }
        sb.append("0b2a18e45d7df321");
        QGLog.m2386d("SDKUtils", "signData before MD5 is:" + sb.toString());
        return C1601d.m2061a(sb.toString());
    }

    /* renamed from: a */
    public static Map<String, String> m1700a(Context context, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        C1600c a = C1600c.m2049a(context);
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Exception e) {
                Log.e("QGHttpUtils", e.getMessage());
                QGLog.LogException(e);
                return null;
            }
        }
        map.put("sdkVersion", Integer.valueOf(a.mo13045g()));
        map.put("gameVersion", Long.valueOf(a.mo13042d()));
        map.put("deviceId", a.mo13040b());
        map.put("serialNum", a.mo13046h());
        map.put("devIDShort", a.mo13038a());
        map.put("platform", Integer.valueOf(a.mo13044f()));
        map.put("productCode", C1538f.m1861l().mo12841d());
        if (C1538f.m1861l().mo12837b().equals("default")) {
            map.put("channelCode", C1601d.m2070d(context));
        } else {
            map.put("channelCode", C1538f.m1861l().mo12837b());
        }
        if (!map.containsKey("authToken")) {
            String f = C1538f.m1861l().mo12844f();
            if (TextUtils.isEmpty(f)) {
                f = C1601d.m2061a(System.currentTimeMillis() + "");
            }
            map.put("authToken", f);
        }
        map.put("clientLang", Locale.getDefault().getLanguage());
        map.put("suggestCurrency", "");
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                obj = "";
            }
            jSONObject.put(next, obj);
        }
        QGLog.m2386d("QGHttpUtils", "mapParam: " + map);
        QGLog.m2386d("QGHttpUtils", "jsonObj: " + jSONObject.toString());
        String b = m1704b(map);
        HashMap hashMap = new HashMap();
        String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 0);
        hashMap.put("sv", "v2");
        hashMap.put("data", encodeToString);
        hashMap.put("sign", b);
        Log.i("QGHttpUtils", "data: " + encodeToString);
        QGLog.m2390i("QGHttpUtils", "sign:" + b);
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m1701a(Map<String, Object> map) {
        return m1700a(C1128a.m798r().mo11981e(), map);
    }

    /* renamed from: a */
    public static void m1702a(Activity activity, String str, C1426b<JSONObject> bVar) {
        f1257a.execute(new C1429a(activity, str, bVar));
    }

    /* renamed from: a */
    public static void m1703a(String str, Map<String, Object> map, C1426b<JSONObject> bVar) {
        f1257a.execute(new C1432b(str, map, bVar));
    }
}
