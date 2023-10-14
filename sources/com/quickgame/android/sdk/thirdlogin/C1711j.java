package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.quickgame.android.sdk.constans.QGConstant;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;

/* renamed from: com.quickgame.android.sdk.thirdlogin.j */
public class C1711j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f1757a = "QGVKLoginManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1690d f1758b;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.j$a */
    class C1712a implements VKAuthCallback {
        C1712a() {
        }

        public void onLogin(VKAccessToken vKAccessToken) {
            int userId = vKAccessToken.getUserId();
            String secret = vKAccessToken.getSecret();
            String accessToken = vKAccessToken.getAccessToken();
            String a = C1711j.this.f1757a;
            Log.e(a, "userid=" + userId + "&&secret=" + secret + "&&accessToken=" + accessToken);
            C1690d b = C1711j.this.f1758b;
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append("");
            b.mo12042a(sb.toString(), "", accessToken, "", QGConstant.LOGIN_OPEN_TYPE_VK);
        }

        public void onLoginFailed(int i) {
            String a = C1711j.this.f1757a;
            Log.e(a, "onLoginFailed&&" + i);
            C1711j.this.f1758b.mo12043b("");
        }
    }

    /* renamed from: a */
    public void mo13261a(Context context, C1690d dVar) {
        Log.d(this.f1757a, "init");
        try {
            this.f1758b = dVar;
            VK.initialize(context);
            this.f1758b.mo13206b();
        } catch (Exception e) {
            this.f1758b.mo13205a(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo13262a(C1690d dVar) {
        this.f1758b = dVar;
    }

    /* renamed from: a */
    public void mo13260a(Activity activity) {
        Log.d(this.f1757a, AppConstant.SDK_LOGIN);
        VK.login(activity);
    }

    /* renamed from: a */
    public void mo13258a() {
        Log.d(this.f1757a, AppConstant.SDK_LOGOUT);
        VK.logout();
        C1690d dVar = this.f1758b;
        if (dVar != null) {
            dVar.mo12021a();
        }
    }

    /* renamed from: a */
    public void mo13259a(int i, int i2, Intent intent) {
        Log.d(this.f1757a, "onActivityResult");
        if (intent != null) {
            try {
                VK.onActivityResult(i, i2, intent, new C1712a());
            } catch (Exception e) {
                this.f1758b.mo12043b(e.getMessage());
            }
        }
    }
}
