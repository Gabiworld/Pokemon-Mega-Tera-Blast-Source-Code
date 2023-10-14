package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.facebook.internal.security.CertificateUtil;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.thirdlogin.f */
public class C1693f {

    /* renamed from: b */
    static final OAuthLogin f1724b = OAuthLogin.getInstance();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1690d f1725a;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.f$a */
    class C1694a extends OAuthLoginHandler {

        /* renamed from: a */
        final /* synthetic */ Activity f1726a;

        C1694a(Activity activity) {
            this.f1726a = activity;
        }

        public void run(boolean z) {
            if (z) {
                Log.d("NaverLoginManager", "login successfully");
                if (C1693f.this.f1725a != null) {
                    String accessToken = C1693f.f1724b.getAccessToken(this.f1726a);
                    C1693f.f1724b.getRefreshToken(this.f1726a);
                    C1693f.f1724b.getExpiresAt(this.f1726a);
                    C1693f.f1724b.getTokenType(this.f1726a);
                    C1693f.this.f1725a.mo12042a("aaaabbbbccccddddaaaabbbbccccdddd", "", accessToken, "", QGConstant.LOGIN_OPEN_TYPE_NAVER);
                    return;
                }
                return;
            }
            Log.d("NaverLoginManager", "login error");
            String code = C1693f.f1724b.getLastErrorCode(this.f1726a).getCode();
            String lastErrorDesc = C1693f.f1724b.getLastErrorDesc(this.f1726a);
            Log.d("NaverLoginManager", "naver failed: " + code + "  " + lastErrorDesc);
            if (C1693f.this.f1725a != null) {
                C1690d a = C1693f.this.f1725a;
                a.mo12043b(code + CertificateUtil.DELIMITER + lastErrorDesc);
            }
        }
    }

    /* renamed from: b */
    public void mo13218b(Activity activity) {
        Log.d("NaverLoginManager", AppConstant.SDK_LOGIN);
        f1724b.startOauthLoginActivity(activity, new C1694a(activity));
    }

    /* renamed from: c */
    public void mo13219c(Activity activity) {
        try {
            Log.d("NaverLoginManager", AppConstant.SDK_LOGOUT);
            f1724b.logout(activity);
            C1690d dVar = this.f1725a;
            if (dVar != null) {
                dVar.mo12021a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13215a(Activity activity) {
        try {
            Log.d("NaverLoginManager", "init");
            f1724b.init(activity, C1601d.m2069c(activity, "OAUTH_CLIENT_ID"), C1601d.m2069c(activity, "OAUTH_CLIENT_SECRET"), C1601d.m2069c(activity, "OAUTH_CLIENT_NAME"));
        } catch (Exception e) {
            e.printStackTrace();
            this.f1725a.mo13205a("init error Exception.");
        }
    }

    /* renamed from: a */
    public void mo13217a(C1690d dVar) {
        this.f1725a = dVar;
    }

    /* renamed from: a */
    public void mo13216a(Activity activity, C1690d dVar) {
        mo13217a(dVar);
        mo13215a(activity);
    }
}
