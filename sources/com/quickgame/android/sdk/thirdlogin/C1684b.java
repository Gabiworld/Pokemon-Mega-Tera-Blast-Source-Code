package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.facebook.AccessToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.CallbackManager;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.ThirdUserInfo;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p039h.C1541g;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.thirdlogin.b */
public class C1684b {

    /* renamed from: c */
    public static boolean f1698c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f1699d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AccessToken f1700e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f1701f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static String f1702g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static JSONObject f1703h;

    /* renamed from: a */
    private CallbackManager f1704a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1690d f1705b;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.b$a */
    class C1685a implements GraphRequest.GraphJSONObjectCallback {

        /* renamed from: a */
        final /* synthetic */ ThirdUserInfo f1706a;

        C1685a(ThirdUserInfo thirdUserInfo) {
            this.f1706a = thirdUserInfo;
        }

        public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
            Log.d("QGFacebookManager", "onCompleted");
            if (jSONObject != null) {
                JSONObject unused = C1684b.f1703h = jSONObject;
                Log.e("QGFacebookManager", "json=" + C1684b.f1703h);
                try {
                    this.f1706a.setFBUid(C1684b.f1703h.getString("id"));
                    String unused2 = C1684b.f1701f = C1684b.f1703h.getString("name");
                    this.f1706a.setFBUserName(C1684b.f1701f);
                    if (C1684b.f1703h.toString().contains("gender")) {
                        String unused3 = C1684b.f1702g = C1684b.f1703h.getString("gender");
                    }
                    this.f1706a.setFBGender(C1684b.f1702g);
                    this.f1706a.setFBPicUrl(C1684b.f1703h.optJSONObject("picture").optJSONObject("data").optString("url"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.b$b */
    class C1686b implements FacebookCallback<LoginResult> {
        C1686b() {
        }

        /* renamed from: a */
        public void onSuccess(LoginResult loginResult) {
            C1684b.f1698c = true;
            Log.d("QGFacebookManager", "login successfully");
            C1271b.m1336i();
            if (C1684b.this.f1705b != null) {
                String unused = C1684b.f1699d = loginResult.getAccessToken().getUserId();
                loginResult.getAccessToken().getToken();
                AccessToken unused2 = C1684b.f1700e = loginResult.getAccessToken();
                C1684b.m2310g();
                C1684b.this.f1705b.mo12042a(loginResult.getAccessToken().getUserId(), "", loginResult.getAccessToken().getToken(), "", QGConstant.LOGIN_OPEN_TYPE_FACEBOOK);
            }
        }

        public void onCancel() {
            Log.d("QGFacebookManager", "login cancel");
            C1271b.m1334g();
            if (C1684b.this.f1705b != null) {
                C1684b.this.f1705b.onLoginCancel();
            }
        }

        public void onError(FacebookException facebookException) {
            Log.d("QGFacebookManager", "login error:" + facebookException.getMessage());
            C1271b.m1335h();
            if (C1684b.this.f1705b != null) {
                C1684b.this.f1705b.mo12043b(facebookException.getMessage());
                if ((facebookException instanceof FacebookAuthorizationException) && AccessToken.getCurrentAccessToken() != null) {
                    LoginManager.getInstance().logOut();
                }
            }
        }
    }

    /* renamed from: e */
    public static String m2308e() {
        return f1699d;
    }

    /* renamed from: f */
    private void m2309f() {
        Log.d("QGFacebookManager", "init");
        try {
            this.f1704a = CallbackManager.Factory.create();
            LoginManager.getInstance().registerCallback(this.f1704a, new C1686b());
            this.f1705b.mo13206b();
        } catch (Exception e) {
            e.printStackTrace();
            this.f1705b.mo13205a("init error Exception.");
        }
    }

    /* renamed from: g */
    public static void m2310g() {
        ThirdUserInfo thirdUserInfo = new ThirdUserInfo();
        if (!C1541g.m1887a().f1487j) {
            Log.d("QGFacebookManager", "no facebook config");
            return;
        }
        if (f1700e == null) {
            Log.d("QGFacebookManager", "accessToken is null");
            f1700e = AccessToken.getCurrentAccessToken();
        }
        GraphRequest newMeRequest = GraphRequest.newMeRequest(f1700e, new C1685a(thirdUserInfo));
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,name,gender,picture");
        newMeRequest.setParameters(bundle);
        newMeRequest.executeAsync();
    }

    /* renamed from: b */
    private void m2304b(C1690d dVar) {
        this.f1705b = dVar;
    }

    /* renamed from: b */
    private String m2301b(Activity activity) {
        String str = "";
        try {
            for (Signature byteArray : activity.getPackageManager().getPackageInfo(activity.getPackageName(), 64).signatures) {
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(byteArray.toByteArray());
                str = Base64.encodeToString(instance.digest(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public void mo13195a(Activity activity) {
        Log.d("QGFacebookManager", AppConstant.SDK_LOGIN);
        try {
            Log.d("QGFacebookManager", "keyHash:" + m2301b(activity));
            LoginManager instance = LoginManager.getInstance();
            instance.setDefaultAudience(instance.getDefaultAudience());
            instance.setLoginBehavior(instance.getLoginBehavior());
            ArrayList arrayList = new ArrayList();
            arrayList.add("public_profile");
            arrayList.add("email");
            if (C1128a.m798r().mo11999l().addFacebookFriendPermissions()) {
                arrayList.add(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            }
            instance.logInWithReadPermissions(activity, (Collection<String>) arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            this.f1705b.mo12043b("call login error.");
            C1271b.m1335h();
        }
    }

    /* renamed from: a */
    public void mo13193a() {
        Log.d("QGFacebookManager", AppConstant.SDK_LOGOUT);
        try {
            LoginManager.getInstance().logOut();
            AccessToken.setCurrentAccessToken((AccessToken) null);
            C1690d dVar = this.f1705b;
            if (dVar != null) {
                dVar.mo12021a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13196a(C1690d dVar) {
        m2304b(dVar);
        m2309f();
    }

    /* renamed from: a */
    public void mo13194a(int i, int i2, Intent intent) {
        Log.d("QGFacebookManager", "onActivityResult");
        try {
            this.f1704a.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
