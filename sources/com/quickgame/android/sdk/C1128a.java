package com.quickgame.android.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.billingclient.api.SkuDetails;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.widget.ShareDialog;
import com.p010qg.eventbus.C0944c;
import com.p010qg.gson.Gson;
import com.p010qg.gson.p024w.C1117a;
import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.SDKConfig;
import com.quickgame.android.sdk.activity.AccountRecoverActivity;
import com.quickgame.android.sdk.activity.CheckActivity;
import com.quickgame.android.sdk.activity.CheckThirdLoginBindActivity;
import com.quickgame.android.sdk.activity.CompatOldVersionActivity;
import com.quickgame.android.sdk.activity.FacebookLoginActivity;
import com.quickgame.android.sdk.activity.FacebookShareActivity;
import com.quickgame.android.sdk.activity.FreeLoginActivity;
import com.quickgame.android.sdk.activity.GoogleLoginActivity;
import com.quickgame.android.sdk.activity.HWAccountCenterActivity;
import com.quickgame.android.sdk.activity.HWLoginActivity;
import com.quickgame.android.sdk.activity.HWWebViewActivity;
import com.quickgame.android.sdk.activity.NoticeActivity;
import com.quickgame.android.sdk.activity.TrashAccountActivity;
import com.quickgame.android.sdk.bean.NoticeBean;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.firebase.HWFirebaseManager;
import com.quickgame.android.sdk.listener.CheckThirdLoginListener;
import com.quickgame.android.sdk.listener.FacebookFriendsListener;
import com.quickgame.android.sdk.listener.GooglePreRegisterListener;
import com.quickgame.android.sdk.listener.QueryGoogleSkuListener;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.model.C1611c;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.p035r.C1418f;
import com.quickgame.android.sdk.p036f.C1423a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1506a;
import com.quickgame.android.sdk.p039h.C1508c;
import com.quickgame.android.sdk.p039h.C1533d;
import com.quickgame.android.sdk.p039h.C1534e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p040i.C1545a;
import com.quickgame.android.sdk.p040i.C1576c;
import com.quickgame.android.sdk.p042k.C1583a;
import com.quickgame.android.sdk.p042k.C1591b;
import com.quickgame.android.sdk.p042k.C1593c;
import com.quickgame.android.sdk.p042k.C1596d;
import com.quickgame.android.sdk.p042k.C1597e;
import com.quickgame.android.sdk.p043l.C1598a;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.p043l.C1606i;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1693f;
import com.quickgame.android.sdk.thirdlogin.C1695g;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import com.quickgame.android.sdk.thirdlogin.C1711j;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;
import com.quickgame.android.sdk.utils.log.QGLog;
import com.tendcloud.tenddata.TDGAItem;
import com.tendcloud.tenddata.TDGAMission;
import com.tendcloud.tenddata.TDGAProfile;
import com.tendcloud.tenddata.TDGAVirtualCurrency;
import com.tendcloud.tenddata.TalkingDataGA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.a */
public class C1128a {

    /* renamed from: j */
    public static String f599j = "";

    /* renamed from: k */
    public static String f600k = "";

    /* renamed from: l */
    public static String f601l = "";

    /* renamed from: m */
    public static JSONObject f602m = null;

    /* renamed from: n */
    private static boolean f603n = false;

    /* renamed from: o */
    private static CallbackManager f604o = null;

    /* renamed from: p */
    public static boolean f605p = true;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static String f606q = "";

    /* renamed from: a */
    private SDKConfig f607a;

    /* renamed from: b */
    boolean f608b = true;

    /* renamed from: c */
    private C1506a f609c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Activity f610d;

    /* renamed from: e */
    private Context f611e;

    /* renamed from: f */
    private QuickGameManager.QGUserBindCallback f612f;

    /* renamed from: g */
    private QuickGameManager.RegisterCallback f613g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f614h = 0;

    /* renamed from: i */
    String f615i;

    /* renamed from: com.quickgame.android.sdk.a$a */
    class C1129a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f616a;

        /* renamed from: b */
        final /* synthetic */ String f617b;

        /* renamed from: c */
        final /* synthetic */ QGRoleInfo f618c;

        /* renamed from: d */
        final /* synthetic */ String f619d;

        C1129a(C1128a aVar, String str, String str2, QGRoleInfo qGRoleInfo, String str3) {
            this.f616a = str;
            this.f617b = str2;
            this.f618c = qGRoleInfo;
            this.f619d = str3;
        }

        public void run() {
            TDGAProfile profile = TDGAProfile.setProfile(this.f616a);
            String str = this.f617b;
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
                case 57:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_NAVER)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1567:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_TWITTER)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1568:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_LINE)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1569:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_CDKEY)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1570:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_EMAIL)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1571:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_VK)) {
                        c = 8;
                        break;
                    }
                    break;
                case 1574:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_PLAYGAME)) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    profile.setProfileType(TDGAProfile.ProfileType.ANONYMOUS);
                    break;
                case 1:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE1);
                    break;
                case 2:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE2);
                    break;
                case 3:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE3);
                    break;
                case 4:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE4);
                    break;
                case 5:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE5);
                    break;
                case 6:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE6);
                    break;
                case 7:
                    profile.setProfileType(TDGAProfile.ProfileType.REGISTERED);
                    break;
                case 8:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE7);
                    break;
                case 9:
                    profile.setProfileType(TDGAProfile.ProfileType.TYPE8);
                    break;
            }
            profile.setLevel(Integer.parseInt(this.f618c.getRoleLevel()));
            profile.setGameServer(this.f618c.getServerName());
            profile.setProfileName(this.f619d);
            profile.setGender(TDGAProfile.Gender.UNKNOW);
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$b */
    class C1130b implements C1426b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ Activity f620a;

        C1130b(Activity activity) {
            this.f620a = activity;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            try {
                C1613e c = C1613e.m2120c(jSONObject.getString("data"));
                if (c != null) {
                    Log.d("QGSDKImpl", "productInfo " + c.toString());
                    C1538f.m1861l().mo12831a(c);
                    if (C1538f.m1861l().mo12843e().mo13107d().mo13093b() != 0) {
                        C1128a.m799s();
                    }
                    String unused = C1128a.f606q = C1601d.m2070d(this.f620a);
                    C1611c a = C1538f.m1861l().mo12843e().mo13101a();
                    if (a != null) {
                        if (C1601d.m2059a((Context) this.f620a) < a.mo13088b()) {
                            Log.d("QGSDKImpl", "version update");
                            this.f620a.startActivity(new Intent(this.f620a, CheckActivity.class));
                        }
                    }
                    C1128a.this.mo11974c().onInitFinished(true);
                    C1268a.m1314b();
                    return;
                }
                C1128a.this.mo11974c().onInitFinished(false);
                C1268a.m1315b("get product is null");
            } catch (Exception e) {
                C1128a.this.mo11974c().onInitFinished(false);
                C1268a.m1315b("get product exception " + e.getMessage());
            }
        }

        public void onFailed(C1427c cVar) {
            if (30001 != cVar.mo12662a() && C1128a.this.f614h < 2) {
                C1128a.this.m795p(this.f620a);
                return;
            }
            String b = cVar.mo12663b();
            if (QGLog.getDebugMod()) {
                Toast.makeText(this.f620a, b, 0).show();
            }
            C1128a.this.mo11974c().onInitFinished(false);
            C1268a.m1315b(b);
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$c */
    class C1131c implements C1426b<JSONObject> {

        /* renamed from: com.quickgame.android.sdk.a$c$a */
        class C1132a extends C1117a<List<NoticeBean>> {
            C1132a(C1131c cVar) {
            }
        }

        C1131c() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            try {
                if (jSONObject.getString("data").length() > 2) {
                    List list = (List) new Gson().mo11565a(jSONObject.getString("data"), new C1132a(this).mo11793b());
                    C1538f.m1861l().mo12833a((List<NoticeBean>) list);
                    if (C1538f.m1861l().mo12843e().mo13107d().mo13093b() == 1 && list.size() > 0) {
                        Intent intent = new Intent(C1128a.m798r().f610d, NoticeActivity.class);
                        intent.addFlags(268435456);
                        C1128a.m798r().f610d.startActivity(intent);
                    }
                }
            } catch (Exception e) {
                Log.e("QGSDKImpl", "getNotice Exception:" + e.getMessage());
            }
        }

        public void onFailed(C1427c cVar) {
            Log.e("QGSDKImpl", "getNotice onFailed:" + cVar.mo12663b());
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$d */
    class C1133d implements GraphRequest.GraphJSONObjectCallback {
        C1133d(C1128a aVar) {
        }

        public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
            Log.d("QGSDKImpl", "onCompleted");
            if (jSONObject != null) {
                C1128a.f602m = jSONObject;
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$e */
    class C1134e implements C1545a.C1546a<List<SkuDetails>> {

        /* renamed from: a */
        final /* synthetic */ QueryGoogleSkuListener f622a;

        C1134e(C1128a aVar, QueryGoogleSkuListener queryGoogleSkuListener) {
            this.f622a = queryGoogleSkuListener;
        }

        /* renamed from: a */
        public void onSuccess(List<SkuDetails> list) {
            this.f622a.onResult(list);
        }

        /* renamed from: a */
        public void mo12013a(String str) {
            this.f622a.onResult(new ArrayList());
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$f */
    class C1135f implements GraphRequest.GraphJSONArrayCallback {

        /* renamed from: a */
        final /* synthetic */ FacebookFriendsListener f623a;

        C1135f(C1128a aVar, FacebookFriendsListener facebookFriendsListener) {
            this.f623a = facebookFriendsListener;
        }

        public void onCompleted(JSONArray jSONArray, GraphResponse graphResponse) {
            Log.d("QGSDKImpl", "getFacebookFriendsList " + graphResponse.toString());
            FacebookFriendsListener facebookFriendsListener = this.f623a;
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            facebookFriendsListener.onResult(jSONArray);
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$g */
    class C1136g implements View.OnClickListener {
        C1136g() {
        }

        public void onClick(View view) {
            C1128a aVar = C1128a.this;
            aVar.mo12006o(aVar.mo11968b());
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$h */
    class C1137h implements C1533d {

        /* renamed from: a */
        final /* synthetic */ Activity f625a;

        /* renamed from: com.quickgame.android.sdk.a$h$a */
        class C1138a implements C1418f.C1422d {
            C1138a() {
            }

            /* renamed from: a */
            public void mo12018a() {
            }

            /* renamed from: b */
            public void mo12019b() {
            }

            /* renamed from: c */
            public void mo12020c() {
                C1137h hVar = C1137h.this;
                C1128a.this.mo11982e(hVar.f625a);
            }
        }

        C1137h(Activity activity) {
            this.f625a = activity;
        }

        /* renamed from: a */
        public void mo12017a(View view, short s) {
            if (s == 1) {
                Intent intent = new Intent(C1128a.this.mo11968b(), HWAccountCenterActivity.class);
                intent.addFlags(268435456);
                C1128a.this.mo11968b().startActivity(intent);
                C1128a.m798r().mo12000l(C1128a.m798r().mo11968b());
            } else if (s == 2) {
                HWWebViewActivity.m1222b(this.f625a, "", C1128a.f599j);
            } else if (s == 3) {
                C1534e.f1462f.mo12823b().onCustomerServiceClicked();
            } else if (s == 4) {
                C1613e e = C1538f.m1861l().mo12843e();
                if (!C1538f.m1861l().mo12847i().isGuest() || e == null || !e.mo13107d().mo13095d()) {
                    C1128a.this.mo11982e(this.f625a);
                } else {
                    new C1418f(C1128a.this.mo11968b(), true, new C1138a()).mo12657b();
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$i */
    class C1139i extends C1710i {
        C1139i(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "Facebook logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$j */
    class C1140j extends C1710i {
        C1140j(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "google logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$k */
    class C1141k extends C1710i {
        C1141k(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "google logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$l */
    class C1142l extends C1710i {
        C1142l(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "naver logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$m */
    class C1143m extends C1710i {
        C1143m(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "twitter logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$n */
    class C1144n extends C1710i {
        C1144n(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "line logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$o */
    class C1145o extends C1710i {
        C1145o(C1128a aVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGSDKImpl", "vk logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.a$p */
    private static class C1146p {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C1128a f628a = new C1128a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m795p(Activity activity) {
        this.f614h++;
        Log.d("QGSDKImpl", "request productInfo " + this.f614h);
        C1428d.m1702a(activity, "/v1/system/init", (C1426b<JSONObject>) new C1130b(activity));
    }

    /* renamed from: r */
    public static C1128a m798r() {
        return C1146p.f628a;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static void m799s() {
        HashMap hashMap = new HashMap();
        hashMap.put("isMulti", "1");
        C1428d.m1703a("/v1/system/getNotice", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1131c());
    }

    /* renamed from: t */
    public static boolean m800t() {
        return f603n;
    }

    /* renamed from: u */
    private void m801u() {
        Log.d("QGSDKImpl", "setUserInfo");
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        Log.d("QGSDKImpl", "FBAccessToken" + currentAccessToken);
        if (currentAccessToken == null) {
            Log.d("QGSDKImpl", "accessToken is null");
            return;
        }
        GraphRequest newMeRequest = GraphRequest.newMeRequest(currentAccessToken, new C1133d(this));
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,name,gender,picture");
        newMeRequest.setParameters(bundle);
        newMeRequest.executeAsync();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11939a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11977c(String str) {
        f599j = str;
    }

    /* renamed from: d */
    public String mo11978d() {
        return C1538f.m1861l().mo12837b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11980d(String str) {
    }

    /* renamed from: e */
    public void mo11982e(Activity activity) {
        if (activity != null && C1538f.m1861l().mo12843e() != null) {
            try {
                String openType = C1538f.m1861l().mo12847i().getOpenType();
                Log.d("QGSDKImpl", "openType:" + openType);
                if (QGConstant.LOGIN_OPEN_TYPE_FACEBOOK.equals(openType)) {
                    C1684b bVar = new C1684b();
                    bVar.mo13196a((C1690d) new C1139i(this));
                    bVar.mo13193a();
                } else if (QGConstant.LOGIN_OPEN_TYPE_GOOGLE.equals(openType)) {
                    C1687c cVar = new C1687c();
                    cVar.mo13201a(activity, new C1140j(this));
                    cVar.mo13198a();
                } else if (QGConstant.LOGIN_OPEN_TYPE_PLAYGAME.equals(openType)) {
                    C1695g b = C1695g.m2347b(m798r().mo11968b());
                    b.mo13231b((C1690d) new C1141k(this));
                    b.mo13233c();
                } else if (QGConstant.LOGIN_OPEN_TYPE_NAVER.equals(openType)) {
                    C1693f fVar = new C1693f();
                    fVar.mo13217a((C1690d) new C1142l(this));
                    fVar.mo13219c(m798r().mo11968b());
                } else if (QGConstant.LOGIN_OPEN_TYPE_TWITTER.equals(openType)) {
                    TwitterManager twitterManager = new TwitterManager();
                    twitterManager.mo13180a((C1690d) new C1143m(this));
                    twitterManager.mo13174a();
                } else if (QGConstant.LOGIN_OPEN_TYPE_LINE.equals(openType)) {
                    C1691e eVar = new C1691e();
                    eVar.mo13212a((C1690d) new C1144n(this));
                    eVar.mo13207a();
                } else if (QGConstant.LOGIN_OPEN_TYPE_VK.equals(openType)) {
                    C1711j jVar = new C1711j();
                    jVar.mo13262a((C1690d) new C1145o(this));
                    jVar.mo13258a();
                }
            } catch (Exception e) {
                Log.w("QGSDKImpl", "logout exception " + e.getMessage());
            }
            C1538f.m1861l().mo12849k();
            C1609b.m2099d().mo13082a();
            m798r().mo11974c().onLogout();
            C1508c.f1429g.mo12793d();
            C0944c.m227c().mo11529b(new C1277a("action.logout"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11983e(String str) {
    }

    /* renamed from: f */
    public void mo11985f(Activity activity) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11986f(String str) {
        f601l = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11989g(String str) {
        TDGAVirtualCurrency.onChargeSuccess(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11992h(String str) {
        Intent intent = new Intent(this.f610d, CompatOldVersionActivity.class);
        intent.setAction("action_1");
        intent.putExtra("loginType", str);
        this.f610d.startActivity(intent);
    }

    /* renamed from: j */
    public C1506a mo11995j() {
        return mo11974c();
    }

    /* renamed from: k */
    public void mo11998k(Activity activity) {
        C1597e.m2035a().mo13037b(activity);
    }

    /* renamed from: l */
    public void mo12000l(Activity activity) {
        if (mo11967a((Context) activity)) {
            m788a(activity, C1124R.anim.push_left_in, C1124R.anim.push_left_out);
        } else {
            m788a(activity, C1124R.anim.push_bottom_in, C1124R.anim.push_bottom_out);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12002m(Activity activity) {
        if (activity == null || C1538f.m1861l().mo12843e() == null) {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            qGUserHolder.setMsg("activity or callback is null");
            return;
        }
        C1611c a = C1538f.m1861l().mo12843e().mo13101a();
        if (a == null || a.mo13088b() <= C1601d.m2059a((Context) activity) || !a.mo13090d()) {
            HWLoginActivity.m1115a(activity, false);
        } else {
            activity.startActivity(new Intent(activity, CheckActivity.class));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo12004n(Activity activity) {
        C1268a.m1321e();
        if (activity == null || C1538f.m1861l().mo12843e() == null) {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            qGUserHolder.setMsg("activity or callback is null");
        } else if (C1538f.m1861l().mo12847i() != null) {
            QGUserHolder qGUserHolder2 = new QGUserHolder();
            qGUserHolder2.setStateCode(1);
            qGUserHolder2.setMsg("");
            mo11974c().onLoginFinished(C1538f.m1861l().mo12847i(), qGUserHolder2);
        } else {
            C1611c a = C1538f.m1861l().mo12843e().mo13101a();
            if (a == null || a.mo13088b() <= C1601d.m2059a((Context) activity) || !a.mo13090d()) {
                HWLoginActivity.m1115a(activity, true);
            } else {
                activity.startActivity(new Intent(activity, CheckActivity.class));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo12006o(Activity activity) {
        if (activity == null || C1538f.m1861l().mo12843e() == null) {
            Log.e("QGSDKImpl", "call userCenter fail: init failed or params is null");
            return;
        }
        activity.startActivity(new Intent(activity, HWAccountCenterActivity.class));
        m798r().mo12000l(activity);
    }

    /* renamed from: q */
    private void m797q(Activity activity) {
        C1593c.m2008a().mo13008a(activity);
        C1596d.m2019b().mo13019a(activity);
        C1597e.m2035a().mo13033a((Context) activity);
        HWFirebaseManager.getInstance().init(activity);
        C1583a.f1571a.mo12974a(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11973b(String str) {
        f600k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11975c(Activity activity) {
        if (activity == null || C1538f.m1861l().mo12843e() == null) {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            qGUserHolder.setMsg("activity or callback is null");
        } else if (C1538f.m1861l().mo12847i() != null) {
            Log.d("QGSDKImpl", "already login");
            QGUserHolder qGUserHolder2 = new QGUserHolder();
            qGUserHolder2.setStateCode(1);
            mo11974c().onLoginFinished(C1538f.m1861l().mo12847i(), qGUserHolder2);
        } else {
            Log.d("QGSDKImpl", "auto register and login");
            FreeLoginActivity.f721c.mo12096a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11979d(Activity activity) {
        GoogleLoginActivity.f722d.mo12101a(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo11984f() {
        return f606q + "|" + C1613e.f1629l;
    }

    /* renamed from: g */
    public void mo11988g(Activity activity) {
        C1508c.f1429g.mo12793d();
        C1538f.m1861l().mo12849k();
    }

    /* renamed from: i */
    public void mo11994i(Activity activity) {
        mo11940a(activity);
        C1508c.f1429g.mo12794d(activity);
    }

    /* renamed from: j */
    public void mo11996j(Activity activity) {
        this.f610d = activity;
        this.f611e = activity.getApplicationContext();
        C1576c.m1961b().mo12899b(activity);
    }

    /* renamed from: k */
    public QuickGameManager.RegisterCallback mo11997k() {
        return this.f613g;
    }

    /* renamed from: a */
    static void m790a(boolean z) {
        f603n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11972b(Activity activity, boolean z) {
        mo11999l().f583a = z;
        mo11975c(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11945a(Activity activity, String str, QuickGameManager.SDKCallback sDKCallback) {
        this.f610d = activity;
        this.f611e = activity.getApplicationContext();
        C1538f.m1861l().mo12838b(str);
        String a = C1598a.m2042a(activity, "QHinfo");
        if (!TextUtils.isEmpty(a)) {
            C1423a.f1253a = a;
        } else {
            C1601d.m2062a("init failed", "please check QHinfo file in assets or the baseurl in QHinfo");
        }
        C1541g.m1887a().mo12852a(this.f611e);
        m797q(activity);
        C1534e.f1462f.mo12820a(sDKCallback);
        C1268a.m1309a();
        m793c((Context) activity);
        C1538f.m1861l().mo12849k();
        C1684b.m2310g();
        m795p(this.f610d);
        C1596d.m2019b().mo13017a();
        C1508c.f1429g.mo12790b(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo11987g() {
        JSONObject jSONObject = f602m;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("gender");
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo11993i() {
        JSONObject jSONObject = f602m;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optJSONObject("picture").optJSONObject("data").optString("url");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo12007p() {
        C1541g.m1887a().f1493p = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11971b(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(C1538f.m1861l().mo12844f()) || C1538f.m1861l().mo12847i() == null) {
            Log.e("QGSDKImpl", "callFacebookShare fail: userInfo is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("QGSDKImpl", "callFacebookShare fail: serverId or roleId is null");
        } else {
            Log.d("QGSDKImpl", "begin FacebookShare");
            Intent intent = new Intent(activity, FacebookShareActivity.class);
            intent.putExtra("serverInfo", str);
            intent.putExtra("roleInfo", str2);
            intent.putExtra("showType", 1);
            activity.startActivity(intent);
        }
    }

    /* renamed from: h */
    public void mo11991h(Activity activity) {
        C1508c.f1429g.mo12792c(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo11990h() {
        JSONObject jSONObject = f602m;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: l */
    public SDKConfig mo11999l() {
        if (this.f607a == null) {
            this.f607a = new SDKConfig.Builder().build();
        }
        return this.f607a;
    }

    /* renamed from: o */
    public QGUserData mo12005o() {
        if (C1538f.m1861l().mo12847i() == null) {
            return null;
        }
        return C1538f.m1861l().mo12847i();
    }

    /* renamed from: b */
    public Activity mo11968b() {
        return this.f610d;
    }

    /* renamed from: b */
    private void m792b(Activity activity, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(C1124R.string.hw_network_dialog_title);
        builder.setMessage(str);
        builder.setPositiveButton(C1124R.string.hw_network_dialog_ok, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* renamed from: c */
    public void mo11976c(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(C1538f.m1861l().mo12844f()) || C1538f.m1861l().mo12847i() == null) {
            Log.e("QGSDKImpl", "callFacebookSharePost fail: userInfo is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("QGSDKImpl", "callFacebookSharePost fail: serverId or roleId is null");
        } else {
            Log.d("QGSDKImpl", "begin FacebookSharePost");
            Intent intent = new Intent(activity, FacebookShareActivity.class);
            intent.putExtra("serverInfo", str);
            intent.putExtra("roleInfo", str2);
            intent.putExtra("showType", 2);
            activity.startActivity(intent);
        }
    }

    /* renamed from: m */
    public QuickGameManager.QGUserBindCallback mo12001m() {
        return this.f612f;
    }

    /* renamed from: a */
    public void mo11947a(Activity activity, boolean z) {
        if (C1538f.m1861l().mo12847i() != null && !C1538f.m1861l().mo12847i().isGuest()) {
            TrashAccountActivity.m1299a(activity, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public HWFirebaseManager mo11969b(Context context) {
        return HWFirebaseManager.getInstance(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11970b(Activity activity) {
        FacebookLoginActivity.f684d.mo12071a(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11950a(QuickGameManager.QGUserBindCallback qGUserBindCallback) {
        this.f612f = qGUserBindCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11958a(String str) {
        QGUserBindInfo n = mo12003n();
        if (n != null) {
            str.hashCode();
            char c = 65535;
            boolean z = false;
            switch (str.hashCode()) {
                case 54:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_FACEBOOK)) {
                        c = 0;
                        break;
                    }
                    break;
                case 56:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_GOOGLE)) {
                        c = 1;
                        break;
                    }
                    break;
                case 57:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_NAVER)) {
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
                case 1574:
                    if (str.equals(QGConstant.LOGIN_OPEN_TYPE_PLAYGAME)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z = n.isBindFacebook();
                    break;
                case 1:
                    z = n.isBindGoogle();
                    break;
                case 2:
                    z = n.isBindNaver();
                    break;
                case 3:
                    z = n.isBindTwitter();
                    break;
                case 4:
                    z = n.isBindLine();
                    break;
                case 5:
                    z = n.isBindEmail();
                    break;
                case 6:
                    z = n.isBindVk();
                    break;
                case 7:
                    z = n.isBindPlay();
                    break;
            }
            if (str.equals(QGConstant.LOGIN_OPEN_TYPE_EMAIL)) {
                C1606i.m2089a(this.f610d, z);
            } else {
                C1606i.m2090a(this.f610d, z, str);
            }
        }
    }

    /* renamed from: n */
    public QGUserBindInfo mo12003n() {
        if (mo12005o() == null) {
            Log.w("QGSDKImpl", "getBindInfo error, account not login");
            return null;
        }
        QGUserBindInfo h = C1538f.m1861l().mo12846h();
        if (h == null) {
            h = new QGUserBindInfo();
        }
        h.setUid(mo12005o().getUid());
        return h;
    }

    /* renamed from: c */
    public C1506a mo11974c() {
        if (this.f609c == null) {
            this.f609c = new C1506a();
        }
        return this.f609c;
    }

    /* renamed from: c */
    private void m793c(Context context) {
        String a = C1598a.m2042a(this.f610d, "quickgame_sdk/channel_id.txt");
        if (TextUtils.isEmpty(a)) {
            Log.d("QGSDKImpl", "assets not set channelId");
            a = C1601d.m2069c(context, "channelId");
            if (TextUtils.isEmpty(a)) {
                Log.d("QGSDKImpl", "metaData not set channelId");
                a = "default";
            }
        }
        C1538f.m1861l().mo12832a(a);
        Log.d("QGSDKImpl", "this package channelId " + a);
    }

    /* renamed from: e */
    public Context mo11981e() {
        Activity activity;
        if (this.f611e == null && (activity = this.f610d) != null) {
            this.f611e = activity.getApplicationContext();
        }
        return this.f611e;
    }

    /* renamed from: a */
    public void mo11957a(QGUserHolder qGUserHolder) {
        Log.d("QGSDKImpl", "onLoginFinished " + qGUserHolder.getStateCode());
        if (TextUtils.isEmpty(C1538f.m1861l().mo12844f()) || C1538f.m1861l().mo12847i() == null) {
            Log.d("QGSDKImpl", "onLoginFinished null.");
            C1538f.m1861l().mo12849k();
            mo11974c().onLoginFinished((QGUserData) null, qGUserHolder);
        } else {
            if (C1538f.m1861l().mo12845g() != null) {
                Log.d("QGSDKImpl", "get tips = " + C1538f.m1861l().mo12845g());
                m792b(this.f610d, C1538f.m1861l().mo12845g());
            }
            if (C1538f.m1861l().mo12847i() != null) {
                QGUserData i = C1538f.m1861l().mo12847i();
                Log.d("QGSDKImpl", "IsTrash = " + i.getIsTrash());
                if (i.getIsTrash() != 1 || i.isGuest()) {
                    mo11974c().onLoginFinished(i, qGUserHolder);
                } else {
                    Log.d("QGSDKImpl", "Logout recovery");
                    this.f610d.startActivity(new Intent(this.f610d, AccountRecoverActivity.class));
                    return;
                }
            }
        }
        if (mo12003n() != null && mo12003n().isBindFacebook() && C1541g.m1887a().f1487j) {
            m801u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11946a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(C1538f.m1861l().mo12844f()) || C1538f.m1861l().mo12847i() == null) {
            Log.e("QGSDKImpl", "callFacebookLike fail: userInfo null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("QGSDKImpl", "callFacebookLike fail: serverId or roleId is null");
        } else {
            Log.d("QGSDKImpl", "begin FacebookLike.");
            Intent intent = new Intent(activity, FacebookShareActivity.class);
            intent.putExtra("serverInfo", str);
            intent.putExtra("roleInfo", str2);
            intent.putExtra("showType", 3);
            activity.startActivity(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11941a(Activity activity, Bitmap bitmap, FacebookCallback<Sharer.Result> facebookCallback) {
        SharePhoto build = new SharePhoto.Builder().setBitmap(bitmap).build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(build);
        SharePhotoContent build2 = new SharePhotoContent.Builder().setPhotos(arrayList).build();
        if (ShareDialog.canShow(SharePhotoContent.class)) {
            ShareDialog shareDialog = new ShareDialog(activity);
            CallbackManager create = CallbackManager.Factory.create();
            f604o = create;
            shareDialog.registerCallback(create, facebookCallback);
            shareDialog.show(build2);
            return;
        }
        facebookCallback.onError(new FacebookException());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11944a(Activity activity, String str, FacebookCallback<Sharer.Result> facebookCallback) {
        ShareLinkContent build = ((ShareLinkContent.Builder) new ShareLinkContent.Builder().setContentUrl(Uri.parse(str))).build();
        if (ShareDialog.canShow(ShareLinkContent.class)) {
            ShareDialog shareDialog = new ShareDialog(activity);
            CallbackManager create = CallbackManager.Factory.create();
            f604o = create;
            shareDialog.registerCallback(create, facebookCallback);
            shareDialog.show(build);
            return;
        }
        Log.d("QGSDKImpl", "can not show share dialog");
        facebookCallback.onError(new FacebookException("can not show share dialog"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11943a(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        try {
            if (activity.getPackageManager().getApplicationInfo("com.facebook.katana", 0).enabled) {
                parse = Uri.parse("fb://facewebmodal/f?href=" + str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        intent.setData(parse);
        intent.setFlags(268435456);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11936a() {
        Intent intent = new Intent(this.f610d, HWAccountCenterActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        this.f610d.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11942a(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo, QuickGameManager.QGPaymentCallback qGPaymentCallback) {
        C1534e.f1462f.mo12819a(qGPaymentCallback);
        if (C1538f.m1861l().mo12847i() == null) {
            Log.e("QGSDKImpl", "userInfo is null");
            C1534e.f1462f.mo12824c().onPayFailed("", "", "please login first");
        } else if (qGOrderInfo == null || qGRoleInfo == null) {
            Log.e("QGSDKImpl", "orderInfo is null or roleInfo is null");
            C1534e.f1462f.mo12824c().onPayFailed("", "", "order or role is null");
        } else if (activity == null || C1538f.m1861l().mo12843e() == null) {
            Log.e("QGSDKImpl", "activity is null or productInfo is null");
            C1534e.f1462f.mo12824c().onPayFailed(qGOrderInfo.getProductOrderId(), qGOrderInfo.getQkOrderNo(), qGOrderInfo.getExtrasParams());
        } else {
            f605p = false;
            C1268a.m1322f();
            C1576c.m1961b().mo12902c(activity, qGOrderInfo, qGRoleInfo);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11940a(Activity activity) {
        if (C1538f.m1861l().mo12847i() != null && this.f608b && C1538f.m1861l().mo12843e().mo13107d().mo13096e()) {
            C1508c.f1429g.mo12787a((View.OnClickListener) new C1136g());
            if (C1541g.m1887a().f1481d) {
                C1508c.f1429g.mo12788a((C1533d) new C1137h(activity));
            }
            if (activity != null) {
                C1508c.f1429g.mo12786a(activity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11953a(QGRoleInfo qGRoleInfo) {
        Log.d("QGSDKImpl", "submitRoleInfo");
        if (qGRoleInfo == null || TextUtils.isEmpty(qGRoleInfo.getRoleId())) {
            Log.w("QGSDKImpl", "submitRoleInfo roleInfo or roleId is null");
            return;
        }
        C1538f.m1861l().mo12827a(qGRoleInfo);
        C1268a.m1313a(qGRoleInfo.getRoleId(), qGRoleInfo.getRoleName(), qGRoleInfo.getRoleLevel(), qGRoleInfo.getServerId(), qGRoleInfo.getServerName(), qGRoleInfo.getRoleBalance(), qGRoleInfo.getVipLevel(), qGRoleInfo.getRolePartyName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11962a(String str, String str2, double d, String str3) {
        C1591b.m1999c().mo13001a(str, str2, d, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11954a(QGRoleInfo qGRoleInfo, String str, String str2, String str3) {
        new Thread(new C1129a(this, str, str3, qGRoleInfo, str2)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11963a(String str, String str2, double d, String str3, double d2, String str4) {
        TDGAVirtualCurrency.onChargeRequest(str, str2, d, str3, d2, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11937a(double d, String str) {
        TDGAVirtualCurrency.onReward(d, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11960a(String str, int i, double d) {
        TDGAItem.onPurchase(str, i, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11959a(String str, int i) {
        TDGAItem.onUse(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11965a(String str, boolean z, boolean z2, boolean z3, String str2) {
        if (z) {
            TDGAMission.onBegin(str);
        } else if (z2) {
            TDGAMission.onCompleted(str);
        } else if (z3) {
            TDGAMission.onFailed(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11964a(String str, Map<String, Object> map) {
        TalkingDataGA.onEvent(str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11949a(QuickGameManager.QGPaymentCallback qGPaymentCallback) {
        C1534e.f1462f.mo12819a(qGPaymentCallback);
    }

    /* renamed from: a */
    public void mo11938a(int i, int i2, Intent intent) {
        Log.d("QGSDKImpl", "onActivityResult requestCode=" + i + " resultCode=" + i2);
        CallbackManager callbackManager = f604o;
        if (callbackManager != null) {
            callbackManager.onActivityResult(i, i2, intent);
        }
        if (i == 507) {
            String uid = mo12005o().getUid();
            QGUserBindInfo n = mo12003n();
            if (m798r().mo12001m() != null) {
                m798r().mo12001m().onBindInfoChanged(uid, C1538f.m1861l().mo12835a(), n);
            }
        }
        C1576c.m1961b().mo12895a(i, i2, intent);
    }

    /* renamed from: a */
    public boolean mo11967a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    private void m788a(Activity activity, int i, int i2) {
        activity.overridePendingTransition(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11951a(QuickGameManager.RegisterCallback registerCallback) {
        this.f613g = registerCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11948a(QuickGameManager.CustomerServiceCallback customerServiceCallback) {
        C1534e.f1462f.mo12818a(customerServiceCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11966a(List<String> list, QueryGoogleSkuListener queryGoogleSkuListener) {
        C1545a.f1504d.mo12859a(mo11981e(), list, (C1545a.C1546a<List<SkuDetails>>) new C1134e(this, queryGoogleSkuListener));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11956a(GooglePreRegisterListener googlePreRegisterListener) {
        C1534e.f1462f.mo12822a(googlePreRegisterListener);
    }

    /* renamed from: a */
    public void mo11952a(SDKConfig sDKConfig) {
        this.f607a = sDKConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11961a(String str, CheckThirdLoginListener checkThirdLoginListener) {
        C1534e.f1462f.mo12821a(checkThirdLoginListener);
        CheckThirdLoginBindActivity.f671e.mo12064a(mo11968b(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11955a(FacebookFriendsListener facebookFriendsListener) {
        if (!C1541g.m1887a().f1487j || AccessToken.getCurrentAccessToken() == null) {
            Log.d("QGSDKImpl", "getFacebookFriendsList accessToken is null");
            facebookFriendsListener.onResult(new JSONArray());
            return;
        }
        GraphRequest.newMyFriendsRequest(AccessToken.getCurrentAccessToken(), new C1135f(this, facebookFriendsListener)).executeAsync();
    }
}
