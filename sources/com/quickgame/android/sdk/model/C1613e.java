package com.quickgame.android.sdk.model;

import com.p010qg.gson.Gson;
import com.p010qg.gson.p024w.C1117a;
import com.quickgame.android.sdk.innerbean.PayType;
import com.quickgame.android.sdk.innerbean.ServerInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.quickgame.android.sdk.model.e */
public class C1613e {

    /* renamed from: h */
    public static int f1625h = 0;

    /* renamed from: i */
    public static List<ServerInfo> f1626i = null;

    /* renamed from: j */
    public static boolean f1627j = false;

    /* renamed from: k */
    public static int f1628k = 0;

    /* renamed from: l */
    public static String f1629l = "";

    /* renamed from: m */
    public static boolean f1630m = false;

    /* renamed from: n */
    public static boolean f1631n = false;

    /* renamed from: o */
    public static boolean f1632o = false;

    /* renamed from: p */
    public static boolean f1633p = false;

    /* renamed from: q */
    public static boolean f1634q = false;

    /* renamed from: r */
    public static boolean f1635r = false;

    /* renamed from: s */
    public static boolean f1636s = false;

    /* renamed from: t */
    public static boolean f1637t = false;

    /* renamed from: u */
    public static boolean f1638u = false;

    /* renamed from: v */
    public static boolean f1639v = false;

    /* renamed from: w */
    public static boolean f1640w = false;

    /* renamed from: a */
    private C1611c f1641a;

    /* renamed from: b */
    private C1612d f1642b;

    /* renamed from: c */
    private String f1643c = "";

    /* renamed from: d */
    private List<PayType> f1644d = null;

    /* renamed from: e */
    public int f1645e = 0;

    /* renamed from: f */
    public List<String> f1646f = new ArrayList();

    /* renamed from: g */
    private int f1647g;

    /* renamed from: com.quickgame.android.sdk.model.e$a */
    class C1614a extends C1117a<List<ServerInfo>> {
        C1614a() {
        }
    }

    /* renamed from: com.quickgame.android.sdk.model.e$b */
    class C1615b extends C1117a<List<String>> {
        C1615b() {
        }
    }

    /* renamed from: com.quickgame.android.sdk.model.e$c */
    class C1616c extends C1117a<List<PayType>> {
        C1616c() {
        }
    }

    /* renamed from: com.quickgame.android.sdk.model.e$d */
    class C1617d extends C1117a<List<PayType>> {
        C1617d(C1613e eVar) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:58|59|60|61|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0153 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.quickgame.android.sdk.model.C1613e m2120c(java.lang.String r20) {
        /*
            java.lang.String r0 = "lightPackage"
            java.lang.String r1 = "payFast"
            java.lang.String r2 = "otherpayType"
            java.lang.String r3 = "productConfig"
            java.lang.String r4 = "requestIp"
            java.lang.String r5 = "serverInfoData"
            java.lang.String r6 = "showShare"
            java.lang.String r7 = "removeEmail"
            java.lang.String r8 = "isNotGift"
            java.lang.String r9 = "deleteAccount"
            java.lang.String r10 = "serverInfo"
            java.lang.String r11 = "loginTypes"
            java.lang.String r12 = "nodes"
            java.lang.String r13 = "QGProductInfo"
            boolean r14 = android.text.TextUtils.isEmpty(r20)
            r15 = 0
            if (r14 == 0) goto L_0x0024
            return r15
        L_0x0024:
            com.quickgame.android.sdk.model.e r14 = new com.quickgame.android.sdk.model.e
            r14.<init>()
            com.qg.gson.Gson r15 = new com.qg.gson.Gson
            r15.<init>()
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x021d }
            r17 = r1
            r1 = r20
            r0.<init>(r1)     // Catch:{ JSONException -> 0x021d }
            boolean r1 = r0.has(r12)     // Catch:{ JSONException -> 0x021d }
            r18 = 0
            r19 = r2
            r2 = 1
            if (r1 == 0) goto L_0x00a2
            org.json.JSONObject r1 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x021d }
            boolean r12 = r1.has(r10)     // Catch:{ JSONException -> 0x021d }
            if (r12 == 0) goto L_0x0078
            int r10 = r1.getInt(r10)     // Catch:{ JSONException -> 0x021d }
            f1625h = r10     // Catch:{ JSONException -> 0x021d }
            if (r10 != r2) goto L_0x0078
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x021d }
            r10.<init>()     // Catch:{ JSONException -> 0x021d }
            f1626i = r10     // Catch:{ JSONException -> 0x021d }
            boolean r10 = r1.has(r5)     // Catch:{ JSONException -> 0x021d }
            if (r10 == 0) goto L_0x0078
            java.lang.String r5 = r1.getString(r5)     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.model.e$a r10 = new com.quickgame.android.sdk.model.e$a     // Catch:{ JSONException -> 0x021d }
            r10.<init>()     // Catch:{ JSONException -> 0x021d }
            java.lang.reflect.Type r10 = r10.mo11793b()     // Catch:{ JSONException -> 0x021d }
            java.lang.Object r5 = r15.mo11565a((java.lang.String) r5, (java.lang.reflect.Type) r10)     // Catch:{ JSONException -> 0x021d }
            java.util.List r5 = (java.util.List) r5     // Catch:{ JSONException -> 0x021d }
            f1626i = r5     // Catch:{ JSONException -> 0x021d }
        L_0x0078:
            boolean r5 = r1.has(r9)     // Catch:{ JSONException -> 0x021d }
            if (r5 == 0) goto L_0x0085
            int r5 = r1.getInt(r9)     // Catch:{ JSONException -> 0x021d }
            r14.mo13102a((int) r5)     // Catch:{ JSONException -> 0x021d }
        L_0x0085:
            boolean r5 = r1.has(r7)     // Catch:{ JSONException -> 0x021d }
            if (r5 == 0) goto L_0x0096
            int r1 = r1.getInt(r7)     // Catch:{ JSONException -> 0x021d }
            if (r1 != r2) goto L_0x0093
            r1 = 1
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            f1627j = r1     // Catch:{ JSONException -> 0x021d }
        L_0x0096:
            boolean r1 = f1627j     // Catch:{ JSONException -> 0x021d }
            if (r1 != 0) goto L_0x00a2
            com.quickgame.android.sdk.h.g r1 = com.quickgame.android.sdk.p039h.C1541g.m1887a()     // Catch:{ JSONException -> 0x021d }
            boolean r1 = r1.f1494q     // Catch:{ JSONException -> 0x021d }
            f1627j = r1     // Catch:{ JSONException -> 0x021d }
        L_0x00a2:
            boolean r1 = r0.has(r11)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0188
            java.lang.String r1 = r0.getString(r11)     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.model.e$b r5 = new com.quickgame.android.sdk.model.e$b     // Catch:{ JSONException -> 0x021d }
            r5.<init>()     // Catch:{ JSONException -> 0x021d }
            java.lang.reflect.Type r5 = r5.mo11793b()     // Catch:{ JSONException -> 0x021d }
            java.lang.Object r1 = r15.mo11565a((java.lang.String) r1, (java.lang.reflect.Type) r5)     // Catch:{ JSONException -> 0x021d }
            java.util.List r1 = (java.util.List) r1     // Catch:{ JSONException -> 0x021d }
            r14.f1646f = r1     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "12"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x00c9
            f1639v = r2     // Catch:{ JSONException -> 0x021d }
            f1627j = r2     // Catch:{ JSONException -> 0x021d }
        L_0x00c9:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "9"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x00d5
            f1634q = r2     // Catch:{ JSONException -> 0x021d }
        L_0x00d5:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "6"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x00e1
            f1631n = r2     // Catch:{ JSONException -> 0x021d }
        L_0x00e1:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "16"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x00ed
            f1632o = r2     // Catch:{ JSONException -> 0x021d }
        L_0x00ed:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "21"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x00f9
            f1640w = r2     // Catch:{ JSONException -> 0x021d }
        L_0x00f9:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "8"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0127
            com.quickgame.android.sdk.h.g r1 = com.quickgame.android.sdk.p039h.C1541g.m1887a()     // Catch:{ JSONException -> 0x021d }
            boolean r1 = r1.f1488k     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0120
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.a r5 = com.quickgame.android.sdk.C1128a.m798r()     // Catch:{ JSONException -> 0x021d }
            android.content.Context r5 = r5.mo11981e()     // Catch:{ JSONException -> 0x021d }
            int r1 = r1.isGooglePlayServicesAvailable(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 != 0) goto L_0x0120
            f1633p = r2     // Catch:{ JSONException -> 0x021d }
            goto L_0x0127
        L_0x0120:
            java.lang.String r1 = "not support google login"
            android.util.Log.w(r13, r1)     // Catch:{ JSONException -> 0x021d }
            f1633p = r18     // Catch:{ JSONException -> 0x021d }
        L_0x0127:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "17"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x015a
            com.quickgame.android.sdk.h.g r1 = com.quickgame.android.sdk.p039h.C1541g.m1887a()     // Catch:{ JSONException -> 0x021d }
            boolean r1 = r1.f1488k     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x015a
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.a r5 = com.quickgame.android.sdk.C1128a.m798r()     // Catch:{ JSONException -> 0x021d }
            android.content.Context r5 = r5.mo11981e()     // Catch:{ JSONException -> 0x021d }
            int r1 = r1.isGooglePlayServicesAvailable(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 != 0) goto L_0x015a
            java.lang.String r1 = "com.google.android.gms.games.Games"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0153 }
            f1635r = r2     // Catch:{ ClassNotFoundException -> 0x0153 }
            goto L_0x015a
        L_0x0153:
            f1635r = r18     // Catch:{ JSONException -> 0x021d }
            java.lang.String r1 = "not add play game sdk in gradle dependencies"
            android.util.Log.d(r13, r1)     // Catch:{ JSONException -> 0x021d }
        L_0x015a:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "1"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            f1630m = r1     // Catch:{ JSONException -> 0x021d }
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "10"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0170
            f1636s = r2     // Catch:{ JSONException -> 0x021d }
        L_0x0170:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "11"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x017c
            f1637t = r2     // Catch:{ JSONException -> 0x021d }
        L_0x017c:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            java.lang.String r5 = "14"
            boolean r1 = r1.contains(r5)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0188
            f1638u = r2     // Catch:{ JSONException -> 0x021d }
        L_0x0188:
            java.util.List<java.lang.String> r1 = r14.f1646f     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0192
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x0199
        L_0x0192:
            java.lang.String r1 = "missing loginTypes，only show default login"
            android.util.Log.d(r13, r1)     // Catch:{ JSONException -> 0x021d }
            f1627j = r18     // Catch:{ JSONException -> 0x021d }
        L_0x0199:
            boolean r1 = r0.has(r8)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x01a5
            int r1 = r0.getInt(r8)     // Catch:{ JSONException -> 0x021d }
            r14.f1645e = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01a5:
            boolean r1 = r0.has(r6)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x01b1
            int r1 = r0.getInt(r6)     // Catch:{ JSONException -> 0x021d }
            f1628k = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01b1:
            boolean r1 = r0.has(r4)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x01bd
            java.lang.String r1 = r0.getString(r4)     // Catch:{ JSONException -> 0x021d }
            f1629l = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01bd:
            boolean r1 = r0.has(r3)     // Catch:{ JSONException -> 0x021d }
            if (r1 == 0) goto L_0x01cd
            org.json.JSONObject r1 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.model.d r1 = com.quickgame.android.sdk.model.C1612d.m2111a(r1)     // Catch:{ JSONException -> 0x021d }
            r14.f1642b = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01cd:
            r1 = r19
            boolean r2 = r0.has(r1)     // Catch:{ JSONException -> 0x021d }
            if (r2 == 0) goto L_0x01db
            java.lang.String r1 = r0.getString(r1)     // Catch:{ JSONException -> 0x021d }
            r14.f1643c = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01db:
            r1 = r17
            boolean r2 = r0.has(r1)     // Catch:{ JSONException -> 0x021d }
            if (r2 == 0) goto L_0x01f8
            java.lang.String r1 = r0.getString(r1)     // Catch:{ JSONException -> 0x021d }
            com.quickgame.android.sdk.model.e$c r2 = new com.quickgame.android.sdk.model.e$c     // Catch:{ JSONException -> 0x021d }
            r2.<init>()     // Catch:{ JSONException -> 0x021d }
            java.lang.reflect.Type r2 = r2.mo11793b()     // Catch:{ JSONException -> 0x021d }
            java.lang.Object r1 = r15.mo11565a((java.lang.String) r1, (java.lang.reflect.Type) r2)     // Catch:{ JSONException -> 0x021d }
            java.util.List r1 = (java.util.List) r1     // Catch:{ JSONException -> 0x021d }
            r14.f1644d = r1     // Catch:{ JSONException -> 0x021d }
        L_0x01f8:
            r1 = r16
            boolean r2 = r0.has(r1)     // Catch:{ JSONException -> 0x021d }
            if (r2 == 0) goto L_0x020b
            com.quickgame.android.sdk.i.c r2 = com.quickgame.android.sdk.p040i.C1576c.m1961b()     // Catch:{ JSONException -> 0x021d }
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x021d }
            r2.mo12901b((java.lang.String) r1)     // Catch:{ JSONException -> 0x021d }
        L_0x020b:
            java.lang.String r1 = "version"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0218 }
            com.quickgame.android.sdk.model.c r0 = com.quickgame.android.sdk.model.C1611c.m2106a(r0)     // Catch:{ Exception -> 0x0218 }
            r14.f1641a = r0     // Catch:{ Exception -> 0x0218 }
            goto L_0x021c
        L_0x0218:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x021d }
        L_0x021c:
            return r14
        L_0x021d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse product exception "
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1)
            r0.printStackTrace()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.model.C1613e.m2120c(java.lang.String):com.quickgame.android.sdk.model.e");
    }

    /* renamed from: a */
    public C1611c mo13101a() {
        return this.f1641a;
    }

    /* renamed from: b */
    public void mo13105b(String str) {
        this.f1643c = str;
    }

    /* renamed from: d */
    public C1612d mo13107d() {
        if (this.f1642b == null) {
            this.f1642b = new C1612d();
        }
        return this.f1642b;
    }

    public String toString() {
        return "{productConfig=" + this.f1642b + ", isNotGift=" + this.f1645e + ", loginTypes=" + this.f1646f + ", isTrash=" + this.f1647g + '}';
    }

    /* renamed from: a */
    public void mo13103a(String str) {
        this.f1644d = (List) new Gson().mo11565a(str, new C1617d(this).mo11793b());
    }

    /* renamed from: b */
    public List<PayType> mo13104b() {
        return this.f1644d;
    }

    /* renamed from: a */
    public void mo13102a(int i) {
        this.f1647g = i;
    }

    /* renamed from: c */
    public String mo13106c() {
        return this.f1643c;
    }
}
