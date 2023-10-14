package com.quickgame.android.sdk.mvp.p044b;

import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.mvp.b.f */
public class C1641f extends C1618a<C1644c> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.f$a */
    class C1642a implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ QGOrderInfo f1662a;

        C1642a(QGOrderInfo qGOrderInfo) {
            this.f1662a = qGOrderInfo;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            if (jSONObject.has("data")) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("orderNo")) {
                        if (C1641f.this.f1649a != null) {
                            ((C1644c) C1641f.this.f1649a).mo12238a(this.f1662a.getGoodsId(), jSONObject2.optString("orderNo"), jSONObject2.optString("pubKey"));
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (C1641f.this.f1649a != null) {
                ((C1644c) C1641f.this.f1649a).mo12239n("" + jSONObject.toString());
            }
        }

        public void onFailed(C1427c cVar) {
            if (C1641f.this.f1649a != null) {
                ((C1644c) C1641f.this.f1649a).mo12239n(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.f$b */
    class C1643b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ Purchase f1664a;

        C1643b(Purchase purchase) {
            this.f1664a = purchase;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                Log.d("QGGPPresenter", "verify purchase message " + optJSONObject.optString("message"));
            }
            if (C1641f.this.f1649a != null) {
                ((C1644c) C1641f.this.f1649a).mo12236a(this.f1664a);
            }
        }

        public void onFailed(C1427c cVar) {
            Log.e("QGGPPresenter", "verify purchase failed " + cVar.toString());
            if (C1641f.this.f1649a != null) {
                ((C1644c) C1641f.this.f1649a).mo12237a(this.f1664a, cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.f$c */
    public interface C1644c {
        /* renamed from: a */
        void mo12236a(Purchase purchase);

        /* renamed from: a */
        void mo12237a(Purchase purchase, C1427c cVar);

        /* renamed from: a */
        void mo12238a(String str, String str2, String str3);

        /* renamed from: n */
        void mo12239n(String str);
    }

    public C1641f(C1644c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo13135a(QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
        if (C1538f.m1861l().mo12847i() == null) {
            V v = this.f1649a;
            if (v != null) {
                ((C1644c) v).mo12239n("user is not logged in");
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uid", C1538f.m1861l().mo12847i().getUid());
        hashMap.put("payType", qGOrderInfo.getPayType());
        String str = "";
        hashMap.put("orderSubject", qGOrderInfo.getOrderSubject() == null ? str : qGOrderInfo.getOrderSubject());
        hashMap.put("productOrderNo", qGOrderInfo.getProductOrderId());
        hashMap.put("extrasParams", qGOrderInfo.getExtrasParams() == null ? str : qGOrderInfo.getExtrasParams());
        hashMap.put("serverName", qGRoleInfo.getServerName() == null ? str : qGRoleInfo.getServerName());
        hashMap.put("roleName", qGRoleInfo.getRoleName() == null ? str : qGRoleInfo.getRoleName());
        hashMap.put("roleLevel", qGRoleInfo.getRoleLevel() == null ? str : qGRoleInfo.getRoleLevel());
        hashMap.put("goodsId", qGOrderInfo.getGoodsId());
        if (qGOrderInfo.getCallbackURL() != null) {
            str = qGOrderInfo.getCallbackURL();
        }
        hashMap.put("callbackUrl", str);
        C1428d.m1703a("/v1/auth/createOrder", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1642a(qGOrderInfo));
    }

    /* renamed from: a */
    public void mo13134a(Purchase purchase, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("signature", str);
        hashMap.put("purchaseData", m2198a(purchase.getOriginalJson()));
        hashMap.put("orderNum", purchase.getAccountIdentifiers().getObfuscatedProfileId());
        C1428d.m1703a("/v1/user/postGooglePlayVerify", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1643b(purchase));
    }

    /* renamed from: a */
    private static String m2198a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put(SDKConstants.PARAM_DEVELOPER_PAYLOAD, jSONObject.getString("obfuscatedProfileId"));
            return jSONObject.toString();
        } catch (Exception e) {
            Log.e("QGGPPresenter", "addDeveloperPayload exception " + e.getMessage());
            return str;
        }
    }
}
