package com.quickgame.android.sdk.p026b;

import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.facebook.AccessToken;
import com.facebook.GraphResponse;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.firebase.HWFirebaseManager;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p042k.C1591b;
import com.quickgame.android.sdk.p042k.C1593c;
import com.quickgame.android.sdk.p042k.C1596d;
import com.quickgame.android.sdk.p042k.C1597e;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.b.a */
public class C1268a {

    /* renamed from: com.quickgame.android.sdk.b.a$a */
    class C1269a implements C1426b<JSONObject> {
        C1269a() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Log.d("QGDataEventReport", "submit RoleInfo success!");
        }

        public void onFailed(C1427c cVar) {
            Log.d("QGDataEventReport", "submit RoleInfo failed!");
        }
    }

    /* renamed from: com.quickgame.android.sdk.b.a$b */
    class C1270b implements C1426b<JSONObject> {
        C1270b() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            QGLog.m2386d("QGDataEventReport", "dataDeliverEvent success!");
        }

        public void onFailed(C1427c cVar) {
            QGLog.m2386d("QGDataEventReport", "dataDeliverEvent failed:" + cVar.toString());
        }
    }

    /* renamed from: a */
    public static void m1309a() {
        m1310a(17210001);
    }

    /* renamed from: b */
    public static void m1315b(String str) {
        C1601d.m2062a("init failed", str);
        HashMap hashMap = new HashMap();
        hashMap.put("init", "failed:" + str);
        C1593c.m2008a().mo13014a("qk_sdk_log", hashMap);
        m1310a(17210003);
    }

    /* renamed from: c */
    public static void m1318c(String str) {
        m1310a(17210007);
    }

    /* renamed from: d */
    public static void m1320d(String str) {
        m1310a(17210012);
    }

    /* renamed from: e */
    public static void m1321e() {
        m1310a(17210004);
    }

    /* renamed from: f */
    public static void m1322f() {
        m1310a(17210009);
    }

    /* renamed from: a */
    public static void m1311a(String str, String str2, String str3) {
        String a = m1308a(str3);
        C1591b.m1999c().mo13002a(str, str2, a);
        C1593c.m2008a().mo13010a(str, str2, a);
        C1597e.m2035a().mo13036a(str, str2, a);
        HWFirebaseManager.getInstance().logLoginEvent(str, str2, a);
        C1596d.m2019b().mo13031b(str, str2, a);
        m1310a(17210005);
    }

    /* renamed from: c */
    public static void m1317c() {
        m1310a(17210008);
    }

    /* renamed from: d */
    public static void m1319d() {
        m1310a(17210011);
    }

    /* renamed from: b */
    public static void m1314b() {
        new HashMap().put("init", GraphResponse.SUCCESS_KEY);
        m1310a(17210002);
    }

    /* renamed from: a */
    public static void m1313a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str3;
        String str10 = str5;
        C1593c.m2008a().mo13013a(str, str2, str3, str4, str5, str6, str7, str8);
        C1597e.m2035a().mo13034a(str3, str5);
        if (C1538f.m1861l().mo12847i() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("uid", C1538f.m1861l().mo12847i().getUid());
            String str11 = str;
            hashMap.put("gameRoleId", str);
            String str12 = str2;
            hashMap.put("gameRoleName", str2);
            hashMap.put("serverName", str5);
            hashMap.put("gameRoleLevel", str3);
            hashMap.put("vipLevel", str7);
            hashMap.put("partyName", str8);
            hashMap.put("gameRoleBalance", str6);
            C1428d.m1703a("/v1/auth/setGameRoleInfo", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1269a());
        }
    }

    /* renamed from: b */
    public static void m1316b(String str, String str2, String str3) {
        String a = m1308a(str3);
        C1593c.m2008a().mo13016b(str, str2, a);
        C1591b.m1999c().mo13005c(str, str2, a);
        C1596d.m2019b().mo13026a(str, str2, a);
        HWFirebaseManager.getInstance().logSignUpEvent(str, str2, a);
    }

    /* renamed from: a */
    public static void m1312a(String str, String str2, String str3, String str4, String str5, Purchase purchase, String str6) {
        if (!C1541g.m1887a().f1479b) {
            C1591b.m1999c().mo13004b(str2, str, str5);
        }
        if (!C1541g.m1887a().f1480c) {
            C1597e.m2035a().mo13035a(str2, str4, BigDecimal.valueOf(Double.parseDouble(str)).multiply(BigDecimal.valueOf(100)).longValue(), str5, "30");
        }
        if (!C1541g.m1887a().f1478a) {
            if (TextUtils.isEmpty(str6) || purchase == null) {
                C1593c.m2008a().mo13011a(str, str2, str3, str4, str5);
            } else {
                C1593c.m2008a().mo13012a(str, str2, str3, str4, str5, purchase, str6);
            }
        }
        m1310a(17210010);
    }

    /* renamed from: a */
    private static void m1310a(int i) {
        if (C1128a.m800t()) {
            try {
                Log.d("QGDataEventReport", "dataDeliverEvent:Code=" + i);
                HashMap hashMap = new HashMap();
                hashMap.put("func_code", Integer.valueOf(i));
                hashMap.put("evtParams", "");
                C1428d.m1703a("/v1/system/dmsg", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1270b());
            } catch (Exception e) {
                Log.e("QGDataEventReport", "dataDeliverEvent exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static String m1308a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 54:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_FACEBOOK)) {
                    c = 1;
                    break;
                }
                break;
            case 56:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_GOOGLE)) {
                    c = 2;
                    break;
                }
                break;
            case 1567:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_TWITTER)) {
                    c = 3;
                    break;
                }
                break;
            case 1568:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_LINE)) {
                    c = 4;
                    break;
                }
                break;
            case 1570:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_EMAIL)) {
                    c = 5;
                    break;
                }
                break;
            case 1571:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_VK)) {
                    c = 6;
                    break;
                }
                break;
            case 1573:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_APPLE)) {
                    c = 7;
                    break;
                }
                break;
            case 1574:
                if (str.equals(QGConstant.LOGIN_OPEN_TYPE_PLAYGAME)) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "guest";
            case 1:
                return AccessToken.DEFAULT_GRAPH_DOMAIN;
            case 2:
                return "google";
            case 3:
                return "twitter";
            case 4:
                return "line";
            case 5:
                return "email";
            case 6:
                return "vk";
            case 7:
                return "apple";
            case 8:
                return "play_game";
            default:
                return "auto_login";
        }
    }
}
