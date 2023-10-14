package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.thirdlogin.c */
public class C1687c {

    /* renamed from: d */
    private static String f1708d = "";

    /* renamed from: a */
    private GoogleSignInOptions f1709a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GoogleSignInClient f1710b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1690d f1711c = null;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.c$a */
    class C1688a implements OnCompleteListener<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f1712a;

        C1688a(Activity activity) {
            this.f1712a = activity;
        }

        public void onComplete(Task<Void> task) {
            Log.d("QGGoogleLoginManager", "signOut onComplete");
            this.f1712a.startActivityForResult(C1687c.this.f1710b.getSignInIntent(), 9001);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.c$b */
    class C1689b implements OnCompleteListener<Void> {
        C1689b() {
        }

        public void onComplete(Task<Void> task) {
            Log.d("QGGoogleLoginManager", "signOut onComplete");
            C1687c.this.f1711c.mo12021a();
        }
    }

    /* renamed from: b */
    public static String m2319b() {
        return f1708d;
    }

    /* renamed from: a */
    public void mo13201a(Activity activity, C1690d dVar) {
        Log.d("QGGoogleLoginManager", "init");
        this.f1711c = dVar;
        try {
            GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestIdToken(C1601d.m2069c(activity, "google-signin-client_id")).requestId().build();
            this.f1709a = build;
            this.f1710b = GoogleSignIn.getClient(activity, build);
            dVar.mo13206b();
        } catch (Exception e) {
            e.printStackTrace();
            dVar.mo13205a("google service exception error.");
        }
    }

    /* renamed from: b */
    public void mo13202b(Activity activity) {
        Log.d("QGGoogleLoginManager", AppConstant.SDK_LOGIN);
        try {
            activity.startActivityForResult(this.f1710b.getSignInIntent(), 9001);
        } catch (Exception e) {
            e.printStackTrace();
            C1690d dVar = this.f1711c;
            if (dVar != null) {
                dVar.mo12043b("start signIn Intent exception:" + e.getMessage());
                C1271b.m1339l();
            }
        }
    }

    /* renamed from: a */
    public void mo13199a(int i, int i2, Intent intent) {
        Log.d("QGGoogleLoginManager", "onActivityResult");
        if (i == 9001) {
            try {
                m2317a(Auth.GoogleSignInApi.getSignInResultFromIntent(intent));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m2317a(GoogleSignInResult googleSignInResult) {
        Log.d("QGGoogleLoginManager", "handleSignInResult: " + googleSignInResult.isSuccess() + "/" + googleSignInResult.getStatus().getStatusCode());
        if (googleSignInResult.isSuccess()) {
            C1271b.m1340m();
            GoogleSignInAccount signInAccount = googleSignInResult.getSignInAccount();
            if (this.f1711c != null) {
                f1708d = signInAccount.getId();
                this.f1711c.mo12042a(signInAccount.getId(), signInAccount.getDisplayName(), signInAccount.getIdToken(), "", QGConstant.LOGIN_OPEN_TYPE_GOOGLE);
            }
        } else if (this.f1711c != null) {
            if (googleSignInResult.getStatus().getStatusCode() == 12501) {
                this.f1711c.onLoginCancel();
                C1271b.m1338k();
            } else {
                C1690d dVar = this.f1711c;
                dVar.mo12043b("" + googleSignInResult.getStatus().toString());
                C1271b.m1339l();
            }
            mo13198a();
        }
    }

    /* renamed from: a */
    public void mo13200a(Activity activity) {
        Log.d("QGGoogleLoginManager", "login binding");
        try {
            if (GoogleSignIn.getLastSignedInAccount(activity) != null) {
                if (this.f1710b == null) {
                    Log.d("QGGoogleLoginManager", "mGoogleSignInClient == null");
                    this.f1710b = GoogleSignIn.getClient(activity, this.f1709a);
                }
                this.f1710b.signOut().addOnCompleteListener(new C1688a(activity));
                return;
            }
            activity.startActivityForResult(this.f1710b.getSignInIntent(), 9001);
        } catch (Exception e) {
            e.printStackTrace();
            C1690d dVar = this.f1711c;
            if (dVar != null) {
                dVar.mo12043b("start signIn Intent exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo13198a() {
        try {
            Log.d("QGGoogleLoginManager", AppConstant.SDK_LOGOUT);
            if (this.f1710b == null) {
                Log.d("QGGoogleLoginManager", "mGoogleSignInClient == null");
                this.f1710b = GoogleSignIn.getClient(C1128a.m798r().mo11981e(), this.f1709a);
            }
            this.f1710b.signOut().addOnCompleteListener(new C1689b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
