package com.quickgame.android.sdk.p042k;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.p043l.C1601d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.quickgame.android.sdk.k.c */
public class C1593c {

    /* renamed from: c */
    private static volatile C1593c f1582c = null;

    /* renamed from: d */
    private static boolean f1583d = false;

    /* renamed from: a */
    private String f1584a = null;

    /* renamed from: b */
    private String f1585b = "";

    /* renamed from: com.quickgame.android.sdk.k.c$a */
    class C1594a implements AppsFlyerConversionListener {
        C1594a(C1593c cVar) {
        }

        public void onAppOpenAttribution(Map<String, String> map) {
            for (String next : map.keySet()) {
                Log.d("QGAppsFlyerManager", "attribute: " + next + " = " + map.get(next));
            }
        }

        public void onAttributionFailure(String str) {
            Log.d("QGAppsFlyerManager", "onAttributionFailure: " + str);
        }

        public void onConversionDataFail(String str) {
            Log.d("QGAppsFlyerManager", "onInstallConversionFailure: " + str);
        }

        public void onConversionDataSuccess(Map<String, Object> map) {
            for (String next : map.keySet()) {
                Log.d("QGAppsFlyerManager", "attribute: " + next + " = " + map.get(next));
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.c$b */
    class C1595b implements AppsFlyerInAppPurchaseValidatorListener {
        C1595b(C1593c cVar) {
        }

        public void onValidateInApp() {
            Log.d("QGAppsFlyerManager", "Purchase validated successfully");
        }

        public void onValidateInAppFailure(String str) {
            Log.d("QGAppsFlyerManager", "onValidateInAppFailure called: " + str);
        }
    }

    private C1593c() {
    }

    /* renamed from: a */
    public static C1593c m2008a() {
        if (f1582c == null) {
            synchronized (C1593c.class) {
                if (f1582c == null) {
                    f1582c = new C1593c();
                }
            }
        }
        return f1582c;
    }

    /* renamed from: b */
    public void mo13016b(String str, String str2, String str3) {
        Log.d("QGAppsFlyerManager", "registerSuccess");
        try {
            if (f1583d) {
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.CUSTOMER_USER_ID, str);
                hashMap.put("af_customer_username", str2);
                hashMap.put("register_method", str3);
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), AFInAppEventType.COMPLETE_REGISTRATION, hashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13009a(String str) {
        this.f1584a = str;
    }

    /* renamed from: a */
    public void mo13008a(Activity activity) {
        Log.d("QGAppsFlyerManager", "init");
        this.f1585b = C1128a.m798r().mo11999l().getMoreAppsFlyerPurchaseEvent();
        try {
            if (TextUtils.isEmpty(this.f1584a)) {
                this.f1584a = C1601d.m2069c(activity, "DEV_KEY");
            }
            if (TextUtils.isEmpty(this.f1584a)) {
                Log.d("QGAppsFlyerManager", "no DEV_KEY");
                f1583d = false;
                return;
            }
            f1583d = true;
            AppsFlyerLib.getInstance().init(this.f1584a, new C1594a(this), activity.getApplication());
            AppsFlyerLib.getInstance().start(activity.getApplication());
            AppsFlyerLib.getInstance().logSession(activity);
            AppsFlyerLib.getInstance().registerValidatorListener(activity, new C1595b(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13010a(String str, String str2, String str3) {
        Log.d("QGAppsFlyerManager", "loginSuccess");
        try {
            if (f1583d) {
                AppsFlyerLib.getInstance().setCustomerUserId(str);
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.CUSTOMER_USER_ID, str);
                hashMap.put("af_customer_username", str2);
                hashMap.put("login_method", str3);
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), AFInAppEventType.LOGIN, hashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13015a(boolean z) {
        Log.d("QGAppsFlyerManager", "completeTutorial");
        try {
            if (f1583d) {
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.SUCCESS, Boolean.valueOf(z));
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), AFInAppEventType.TUTORIAL_COMPLETION, hashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13014a(String str, Map<String, Object> map) {
        try {
            if (f1583d) {
                Log.d("QGAppsFlyerManager", "appsFlyerEvent " + str);
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), str, map);
            }
        } catch (Exception e) {
            Log.e("QGAppsFlyerManager", "appsFlyerEvent " + str + " Exception " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13013a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Log.d("QGAppsFlyerManager", "updateRoleInfo");
        try {
            if (f1583d) {
                HashMap hashMap = new HashMap();
                hashMap.put("af_roleId", str);
                hashMap.put("af_roleName", str2);
                hashMap.put("af_roleLevel", str3);
                hashMap.put("af_roleServerId", str4);
                hashMap.put("af_roleServerName", str5);
                hashMap.put("af_roleBalance", str6);
                hashMap.put("af_roleVipLevel", str7);
                hashMap.put("af_rolePartyName", str8);
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), "af_updateRoleInfo", hashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13011a(String str, String str2, String str3, String str4, String str5) {
        try {
            if (f1583d) {
                Log.d("QGAppsFlyerManager", "report purchase " + str2);
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.REVENUE, str);
                hashMap.put(AFInAppEventParameterName.CONTENT_TYPE, str4);
                hashMap.put(AFInAppEventParameterName.CONTENT_ID, str3);
                hashMap.put(AFInAppEventParameterName.CURRENCY, str5);
                hashMap.put("af_order_id", str2);
                AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), AFInAppEventType.PURCHASE, hashMap);
                if (!TextUtils.isEmpty(this.f1585b)) {
                    AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), this.f1585b, (Map<String, Object>) null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13012a(String str, String str2, String str3, String str4, String str5, Purchase purchase, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        Log.d("QGAppsFlyerManager", "paySuccessValidatePurchase");
        try {
            if (f1583d) {
                Log.d("QGAppsFlyerManager", "report purchase with pubKey " + str8);
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.REVENUE, str7);
                hashMap.put(AFInAppEventParameterName.CONTENT_TYPE, str10);
                hashMap.put(AFInAppEventParameterName.CONTENT_ID, str9);
                hashMap.put(AFInAppEventParameterName.CURRENCY, str11);
                hashMap.put("af_order_id", str8);
                Object obj = AFInAppEventParameterName.REVENUE;
                Object obj2 = "af_order_id";
                Object obj3 = AFInAppEventParameterName.CONTENT_TYPE;
                Object obj4 = AFInAppEventParameterName.CONTENT_ID;
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(C1128a.m798r().mo11981e(), str6, purchase.getSignature(), purchase.getOriginalJson(), str, str5, hashMap);
                if (!TextUtils.isEmpty(this.f1585b)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(obj, str7);
                    hashMap2.put(obj3, str10);
                    hashMap2.put(obj4, str9);
                    hashMap2.put(AFInAppEventParameterName.CURRENCY, str5);
                    hashMap2.put(obj2, str2);
                    AppsFlyerLib.getInstance().logEvent(C1128a.m798r().mo11981e(), this.f1585b, (Map<String, Object>) null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo13007a(Context context) {
        Log.d("QGAppsFlyerManager", "getAppsFlyerId");
        try {
            if (f1583d) {
                return AppsFlyerLib.getInstance().getAppsFlyerUID(context);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
