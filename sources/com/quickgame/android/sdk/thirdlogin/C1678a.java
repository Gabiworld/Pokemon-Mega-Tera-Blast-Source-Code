package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthProvider;
import com.quickgame.android.sdk.constans.QGConstant;
import java.util.ArrayList;

/* renamed from: com.quickgame.android.sdk.thirdlogin.a */
public class C1678a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1690d f1693a;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.a$a */
    class C1679a extends ArrayList<String> {
        C1679a(C1678a aVar) {
            add("email");
            add("name");
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.a$b */
    class C1680b implements OnFailureListener {
        C1680b() {
        }

        public void onFailure(Exception exc) {
            Log.w("QGAppleLoginManager", "checkPending:onFailure", exc);
            C1690d a = C1678a.this.f1693a;
            a.mo12043b("" + exc.getMessage());
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.a$c */
    class C1681c implements OnSuccessListener<AuthResult> {
        C1681c() {
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d("QGAppleLoginManager", "checkPending:onSuccess:" + authResult);
            C1678a.this.m2291a(authResult);
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.a$d */
    class C1682d implements OnFailureListener {
        C1682d() {
        }

        public void onFailure(Exception exc) {
            Log.w("QGAppleLoginManager", "activitySignIn:onFailure", exc);
            if (C1678a.this.f1693a != null) {
                C1690d a = C1678a.this.f1693a;
                a.mo12043b("" + exc.getMessage());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.thirdlogin.a$e */
    class C1683e implements OnSuccessListener<AuthResult> {
        C1683e() {
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d("QGAppleLoginManager", "activitySignIn:onSuccess");
            C1678a.this.m2291a(authResult);
        }
    }

    /* renamed from: a */
    public void mo13186a(C1690d dVar) {
        this.f1693a = dVar;
    }

    /* renamed from: a */
    public void mo13185a(Activity activity) {
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder("apple.com");
        newBuilder.setScopes(new C1679a(this));
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Task pendingAuthResult = instance.getPendingAuthResult();
        if (pendingAuthResult != null) {
            pendingAuthResult.addOnSuccessListener(new C1681c()).addOnFailureListener(new C1680b());
            return;
        }
        Log.d("QGAppleLoginManager", "pending: null");
        instance.startActivityForSignInWithProvider(activity, newBuilder.build()).addOnSuccessListener(new C1683e()).addOnFailureListener(new C1682d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2291a(AuthResult authResult) {
        String str;
        AdditionalUserInfo additionalUserInfo = authResult.getAdditionalUserInfo();
        if (additionalUserInfo == null || additionalUserInfo.getProfile() == null || additionalUserInfo.getProfile().get(AuthenticationTokenClaims.JSON_KEY_SUB) == null) {
            C1690d dVar = this.f1693a;
            if (dVar != null) {
                dVar.mo12043b("getIdToken fail");
                return;
            }
            return;
        }
        if (authResult.getUser() != null) {
            str = authResult.getUser().getDisplayName();
        } else {
            str = "";
        }
        C1690d dVar2 = this.f1693a;
        if (dVar2 != null) {
            dVar2.mo12042a("" + additionalUserInfo.getProfile().get(AuthenticationTokenClaims.JSON_KEY_SUB), "" + str, "null", "", QGConstant.LOGIN_OPEN_TYPE_APPLE);
        }
    }
}
