package com.quickgame.android.sdk.p041j;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.gaa.sdk.iap.PurchaseData;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r¨\u0006\u0010"}, mo13302d2 = {"Lcom/quickgame/android/sdk/presenter/OneStorePayPresenter;", "Lcom/quickgame/android/sdk/mvp/BasePresenter;", "Lcom/quickgame/android/sdk/presenter/OneStorePayPresenter$View;", "view", "(Lcom/quickgame/android/sdk/presenter/OneStorePayPresenter$View;)V", "createOrder", "", "orderInfo", "Lcom/quickgame/android/sdk/bean/QGOrderInfo;", "roleInfo", "Lcom/quickgame/android/sdk/bean/QGRoleInfo;", "verifyHistoryPurchase", "purchaseData", "Lcom/gaa/sdk/iap/PurchaseData;", "verifyPurchase", "View", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.j.a */
public final class C1578a extends C1618a<C1579a> {

    /* renamed from: com.quickgame.android.sdk.j.a$a */
    public interface C1579a {
        /* renamed from: a */
        void mo12252a(PurchaseData purchaseData);

        /* renamed from: a */
        void mo12254a(PurchaseData purchaseData, C1427c cVar);

        /* renamed from: b */
        void mo12256b(PurchaseData purchaseData);

        /* renamed from: b */
        void mo12257b(PurchaseData purchaseData, C1427c cVar);

        /* renamed from: d */
        void mo12258d(String str);

        /* renamed from: r */
        void mo12264r(String str);
    }

    /* renamed from: com.quickgame.android.sdk.j.a$b */
    public static final class C1580b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1578a f1566a;

        C1580b(C1578a aVar) {
            this.f1566a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            try {
                C1579a a = C1578a.m1975a(this.f1566a);
                if (a != null) {
                    String optString = jSONObject.getJSONObject("data").optString("orderNo");
                    Intrinsics.checkNotNullExpressionValue(optString, "result.getJSONObject(\"data\").optString(\"orderNo\")");
                    a.mo12258d(optString);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C1579a a2 = C1578a.m1975a(this.f1566a);
                if (a2 != null) {
                    a2.mo12264r("" + e.getMessage());
                }
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1579a a = C1578a.m1975a(this.f1566a);
            if (a != null) {
                a.mo12264r(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.j.a$c */
    public static final class C1581c implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1578a f1567a;

        /* renamed from: b */
        final /* synthetic */ PurchaseData f1568b;

        C1581c(C1578a aVar, PurchaseData purchaseData) {
            this.f1567a = aVar;
            this.f1568b = purchaseData;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1579a a = C1578a.m1975a(this.f1567a);
            if (a != null) {
                a.mo12252a(this.f1568b);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1579a a = C1578a.m1975a(this.f1567a);
            if (a != null) {
                a.mo12257b(this.f1568b, cVar);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.j.a$d */
    public static final class C1582d implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C1578a f1569a;

        /* renamed from: b */
        final /* synthetic */ PurchaseData f1570b;

        C1582d(C1578a aVar, PurchaseData purchaseData) {
            this.f1569a = aVar;
            this.f1570b = purchaseData;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "result");
            C1579a a = C1578a.m1975a(this.f1569a);
            if (a != null) {
                a.mo12256b(this.f1570b);
            }
        }

        public void onFailed(C1427c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "error");
            C1579a a = C1578a.m1975a(this.f1569a);
            if (a != null) {
                a.mo12254a(this.f1570b, cVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1578a(C1579a aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, ViewHierarchyConstants.VIEW_KEY);
    }

    /* renamed from: a */
    public static final /* synthetic */ C1579a m1975a(C1578a aVar) {
        return (C1579a) aVar.f1649a;
    }

    /* renamed from: b */
    public final void mo12969b(PurchaseData purchaseData) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        HashMap hashMap = new HashMap();
        String developerPayload = purchaseData.getDeveloperPayload();
        Intrinsics.checkNotNullExpressionValue(developerPayload, "purchaseData.developerPayload");
        hashMap.put("orderNo", developerPayload);
        String purchaseToken = purchaseData.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchaseData.purchaseToken");
        hashMap.put(SDKConstants.PARAM_PURCHASE_TOKEN, purchaseToken);
        String packageName = purchaseData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "purchaseData.packageName");
        hashMap.put("packageName", packageName);
        C1428d.m1703a("/v1/user/postOnestoreVerify", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1582d(this, purchaseData));
    }

    /* renamed from: a */
    public final void mo12968a(QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo) {
        Intrinsics.checkNotNullParameter(qGOrderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(qGRoleInfo, "roleInfo");
        HashMap hashMap = new HashMap();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        QGUserData i = l.mo12847i();
        Intrinsics.checkNotNullExpressionValue(i, "SDKDataManager.getInstance().userData");
        String uid = i.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "SDKDataManager.getInstance().userData.uid");
        hashMap.put("uid", uid);
        hashMap.put("payType", "129");
        String orderSubject = qGOrderInfo.getOrderSubject();
        Intrinsics.checkNotNullExpressionValue(orderSubject, "orderInfo.orderSubject");
        hashMap.put("orderSubject", orderSubject);
        String productOrderId = qGOrderInfo.getProductOrderId();
        Intrinsics.checkNotNullExpressionValue(productOrderId, "orderInfo.productOrderId");
        hashMap.put("productOrderNo", productOrderId);
        String extrasParams = qGOrderInfo.getExtrasParams();
        String str = "";
        if (extrasParams == null) {
            extrasParams = str;
        }
        hashMap.put("extrasParams", extrasParams);
        String serverName = qGRoleInfo.getServerName();
        Intrinsics.checkNotNullExpressionValue(serverName, "roleInfo.serverName");
        hashMap.put("serverName", serverName);
        String roleName = qGRoleInfo.getRoleName();
        Intrinsics.checkNotNullExpressionValue(roleName, "roleInfo.roleName");
        hashMap.put("roleName", roleName);
        String roleLevel = qGRoleInfo.getRoleLevel();
        Intrinsics.checkNotNullExpressionValue(roleLevel, "roleInfo.roleLevel");
        hashMap.put("roleLevel", roleLevel);
        String goodsId = qGOrderInfo.getGoodsId();
        Intrinsics.checkNotNullExpressionValue(goodsId, "orderInfo.goodsId");
        hashMap.put("goodsId", goodsId);
        String callbackURL = qGOrderInfo.getCallbackURL();
        if (callbackURL != null) {
            str = callbackURL;
        }
        hashMap.put("callbackUrl", str);
        C1428d.m1703a("/v1/auth/createOrder", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1580b(this));
    }

    /* renamed from: a */
    public final void mo12967a(PurchaseData purchaseData) {
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        HashMap hashMap = new HashMap();
        String developerPayload = purchaseData.getDeveloperPayload();
        Intrinsics.checkNotNullExpressionValue(developerPayload, "purchaseData.developerPayload");
        hashMap.put("orderNo", developerPayload);
        String purchaseToken = purchaseData.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchaseData.purchaseToken");
        hashMap.put(SDKConstants.PARAM_PURCHASE_TOKEN, purchaseToken);
        String packageName = purchaseData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "purchaseData.packageName");
        hashMap.put("packageName", packageName);
        C1428d.m1703a("/v1/user/postOnestoreVerify", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1581c(this, purchaseData));
    }
}
