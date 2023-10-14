package com.quickgame.android.sdk.p040i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.p010qg.gson.Gson;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.activity.HWPayWayActivity;
import com.quickgame.android.sdk.activity.NewGooglePlayActivity;
import com.quickgame.android.sdk.activity.Pay129Activity;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.listener.PayCloseCallback;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1601d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.i.c */
public class C1576c {

    /* renamed from: g */
    private static volatile C1576c f1553g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f1554h = "";

    /* renamed from: a */
    String f1555a;

    /* renamed from: b */
    public String f1556b;

    /* renamed from: c */
    public QGOrderInfo f1557c;

    /* renamed from: d */
    public QGRoleInfo f1558d;

    /* renamed from: e */
    private boolean f1559e;

    /* renamed from: f */
    public PayCloseCallback f1560f;

    /* renamed from: com.quickgame.android.sdk.i.c$a */
    class C1577a implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ Activity f1561a;

        /* renamed from: b */
        final /* synthetic */ QGOrderInfo f1562b;

        /* renamed from: c */
        final /* synthetic */ QGRoleInfo f1563c;

        C1577a(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
            this.f1561a = activity;
            this.f1562b = qGOrderInfo;
            this.f1563c = qGRoleInfo;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                Log.d("QGPayManager", "payment ret " + optJSONObject.toString());
                if (optJSONObject.has("othpy_type")) {
                    C1538f.m1861l().mo12843e().mo13105b(optJSONObject.optString("othpy_type"));
                }
                if (optJSONObject.has("firstPy")) {
                    C1538f.m1861l().mo12843e().mo13103a(optJSONObject.optString("firstPy"));
                }
                if (optJSONObject.has("apiUrlH5")) {
                    C1576c.m1961b().f1556b = optJSONObject.optString("apiUrlH5");
                    Log.d("QGPayManager", "apiUrlH5=" + C1576c.m1961b());
                }
            }
            String c = C1538f.m1861l().mo12843e().mo13106c();
            if ("2".equals(c)) {
                C1576c.this.mo12897a(this.f1561a, this.f1562b, this.f1563c);
            } else if ("7".equals(c)) {
                C1576c.this.mo12900b(this.f1561a, this.f1562b, this.f1563c);
            } else {
                Intent intent = new Intent(this.f1561a, HWPayWayActivity.class);
                intent.putExtra("orderInfo", this.f1562b);
                intent.putExtra("roleInfo", this.f1563c);
                this.f1561a.startActivity(intent);
            }
        }

        public void onFailed(C1427c cVar) {
            String unused = C1576c.f1554h = cVar.mo12663b();
            C1128a.f605p = true;
            Toast.makeText(this.f1561a, C1576c.f1554h, 0).show();
            Log.d("QGPayManager", "get payment error:" + C1576c.f1554h);
            if (C1128a.m798r().mo11974c() != null) {
                C1128a.m798r().mo11974c().onPayFailed(this.f1562b.getProductOrderId(), this.f1562b.getQkOrderNo(), C1576c.f1554h);
            }
        }
    }

    private C1576c() {
        this.f1556b = "";
        this.f1559e = true;
        this.f1555a = C1601d.m2069c(C1128a.m798r().mo11981e(), "OneStorePublicKey");
        this.f1559e = true ^ TextUtils.isEmpty(C1601d.m2069c(C1128a.m798r().mo11981e(), "com.google.android.play.billingclient.version"));
    }

    /* renamed from: b */
    public static C1576c m1961b() {
        if (f1553g == null) {
            synchronized (C1576c.class) {
                if (f1553g == null) {
                    f1553g = new C1576c();
                }
            }
        }
        return f1553g;
    }

    /* renamed from: a */
    public void mo12895a(int i, int i2, Intent intent) {
    }

    /* renamed from: b */
    public void mo12901b(String str) {
    }

    /* renamed from: c */
    public void mo12902c(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
        Log.d("QGPayManager", "payment start");
        this.f1557c = qGOrderInfo;
        this.f1558d = qGRoleInfo;
        if (C1601d.m2066b(activity, "openPayRoleLevel") <= 0 || TextUtils.isEmpty(qGRoleInfo.getRoleLevel()) || Integer.parseInt(qGRoleInfo.getRoleLevel()) >= C1601d.m2066b(activity, "openPayRoleLevel")) {
            HashMap hashMap = new HashMap();
            hashMap.put("goodsId", qGOrderInfo.getGoodsId());
            hashMap.put("roleLevel", qGRoleInfo.getRoleLevel());
            if (C1541g.m1887a().f1484g) {
                hashMap.put("amount", qGOrderInfo.getAmount() + "");
                hashMap.put("currency", qGOrderInfo.getSuggestCurrency());
            }
            C1428d.m1703a("/v1/auth/jianchaLayLx", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1577a(activity, qGOrderInfo, qGRoleInfo));
            return;
        }
        mo12897a(activity, qGOrderInfo, qGRoleInfo);
    }

    /* renamed from: d */
    public void mo12904d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1557c.setQkOrderNo(str);
            Log.d("QGPayManager", "save sp orderInfo " + this.f1557c.toString());
            C1128a.m798r().mo11981e().getSharedPreferences("quickOrder", 0).edit().putString(str, this.f1557c.toString()).apply();
        }
    }

    /* renamed from: a */
    public void mo12897a(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
        Intent intent = new Intent(activity, NewGooglePlayActivity.class);
        intent.putExtra("orderInfo", qGOrderInfo);
        intent.putExtra("roleInfo", qGRoleInfo);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public void mo12896a(Activity activity) {
        if (this.f1559e) {
            C1545a.f1504d.mo12855a((Context) activity);
        }
    }

    /* renamed from: a */
    public void mo12898a(PayCloseCallback payCloseCallback) {
        this.f1560f = payCloseCallback;
    }

    /* renamed from: a */
    public QGOrderInfo mo12894a(String str) {
        String string = C1128a.m798r().mo11981e().getSharedPreferences("quickOrder", 0).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Log.d("QGPayManager", "sp have orderInfo " + string);
            return (QGOrderInfo) new Gson().mo11564a(string, QGOrderInfo.class);
        } catch (Exception e) {
            Log.e("QGPayManager", "orderInfoStr to json ex:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public void mo12900b(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
        Pay129Activity.m1269a(activity, qGOrderInfo.getGoodsId(), qGOrderInfo.getSkuType());
    }

    /* renamed from: b */
    public void mo12899b(Activity activity) {
        if (this.f1559e) {
            C1545a.f1504d.mo12862b((Context) activity);
        }
    }

    /* renamed from: c */
    public void mo12903c(String str) {
        C1128a.m798r().mo11981e().getSharedPreferences("quickOrder", 0).edit().remove(str).apply();
    }
}
