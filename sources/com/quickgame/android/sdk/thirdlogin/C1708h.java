package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p043l.C1601d;
import com.taptap.sdk.AccessToken;
import com.taptap.sdk.AccountGlobalError;
import com.taptap.sdk.LoginSdkConfig;
import com.taptap.sdk.Profile;
import com.taptap.sdk.RegionType;
import com.taptap.sdk.TapLoginHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo13302d2 = {"Lcom/quickgame/android/sdk/thirdlogin/TapTapLoginManager;", "", "()V", "TAG", "", "TapTap_OpenType", "loginListener", "Lcom/quickgame/android/sdk/thirdlogin/ThirdLoginListener;", "init", "", "context", "Landroid/content/Context;", "login", "activity", "Landroid/app/Activity;", "logout", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.thirdlogin.h */
public final class C1708h {

    /* renamed from: a */
    private static C1710i f1754a;

    /* renamed from: b */
    public static final C1708h f1755b = new C1708h();

    /* renamed from: com.quickgame.android.sdk.thirdlogin.h$a */
    public static final class C1709a implements TapLoginHelper.TapLoginResultCallback {

        /* renamed from: a */
        final /* synthetic */ C1710i f1756a;

        C1709a(C1710i iVar) {
            this.f1756a = iVar;
        }

        public void onLoginCancel() {
            Log.d("QGTapTapLoginManager", "TapTap authorization cancelled");
            C1710i iVar = this.f1756a;
            if (iVar != null) {
                iVar.onLoginCancel();
            }
        }

        public void onLoginError(AccountGlobalError accountGlobalError) {
            Intrinsics.checkNotNullParameter(accountGlobalError, "globalError");
            Log.d("QGTapTapLoginManager", "TapTap authorization failed. cause: " + accountGlobalError.getMessage());
            C1710i iVar = this.f1756a;
            if (iVar != null) {
                iVar.mo12043b(accountGlobalError.getMessage());
            }
        }

        public void onLoginSuccess(AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "token");
            Log.d("QGTapTapLoginManager", "TapTap authorization succeed");
            Profile currentProfile = TapLoginHelper.getCurrentProfile();
            C1710i iVar = this.f1756a;
            if (iVar != null) {
                Intrinsics.checkNotNullExpressionValue(currentProfile, "profile");
                iVar.mo12042a("null", currentProfile.getName(), accessToken.access_token, accessToken.mac_key, QGConstant.LOGIN_OPEN_TYPE_TAPTAP);
            }
        }
    }

    private C1708h() {
    }

    /* renamed from: a */
    public final void mo13254a(Context context, C1710i iVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        f1754a = iVar;
        LoginSdkConfig loginSdkConfig = new LoginSdkConfig();
        loginSdkConfig.regionType = RegionType.IO;
        TapLoginHelper.init(context, C1601d.m2069c(context, "TapTap_Client_ID"), loginSdkConfig);
        TapLoginHelper.registerLoginCallback(new C1709a(iVar));
    }

    /* renamed from: a */
    public final void mo13253a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        TapLoginHelper.getCurrentAccessToken();
        if (TapLoginHelper.getCurrentAccessToken() != null) {
            Profile currentProfile = TapLoginHelper.getCurrentProfile();
            C1710i iVar = f1754a;
            if (iVar != null) {
                Intrinsics.checkNotNullExpressionValue(currentProfile, "profile");
                iVar.mo12042a("null", currentProfile.getName(), TapLoginHelper.getCurrentAccessToken().access_token, TapLoginHelper.getCurrentAccessToken().mac_key, QGConstant.LOGIN_OPEN_TYPE_TAPTAP);
                return;
            }
            return;
        }
        TapLoginHelper.startTapLogin(activity, new String[]{"public_profile"});
    }
}
