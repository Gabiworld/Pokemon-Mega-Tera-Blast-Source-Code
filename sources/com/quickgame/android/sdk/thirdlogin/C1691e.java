package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.api.LineApiClientBuilder;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.thirdlogin.e */
public class C1691e {

    /* renamed from: c */
    private static String f1715c = "QGLineManager";

    /* renamed from: d */
    private static C1691e f1716d = null;

    /* renamed from: e */
    private static String f1717e = "jp.naver.line.android";

    /* renamed from: f */
    private static String f1718f = "jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity";

    /* renamed from: g */
    private static Intent f1719g;

    /* renamed from: h */
    private static C1690d f1720h;

    /* renamed from: a */
    private LineApiClient f1721a;

    /* renamed from: b */
    private String f1722b = "";

    /* renamed from: com.quickgame.android.sdk.thirdlogin.e$a */
    static /* synthetic */ class C1692a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1723a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.linecorp.linesdk.LineApiResponseCode[] r0 = com.linecorp.linesdk.LineApiResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1723a = r0
                com.linecorp.linesdk.LineApiResponseCode r1 = com.linecorp.linesdk.LineApiResponseCode.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1723a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.linecorp.linesdk.LineApiResponseCode r1 = com.linecorp.linesdk.LineApiResponseCode.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.thirdlogin.C1691e.C1692a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static C1691e m2330b() {
        if (f1716d == null) {
            f1716d = new C1691e();
        }
        return f1716d;
    }

    /* renamed from: a */
    public void mo13209a(Activity activity) {
        Log.d(f1715c, "init");
        try {
            this.f1721a = new LineApiClientBuilder(activity, this.f1722b).build();
        } catch (Exception e) {
            String str = f1715c;
            Log.e(str, "initError:" + e.getMessage());
            f1720h.mo13205a(e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo13214b(Activity activity) {
        Log.d(f1715c, AppConstant.SDK_LOGIN);
        try {
            String str = f1715c;
            Log.d(str, "LineChannelid=" + this.f1722b);
            if (mo13213a((Context) activity, f1717e)) {
                Log.d(f1715c, "Login-App-to-App");
                f1719g = LineLoginApi.getLoginIntent(activity, this.f1722b);
            } else {
                Log.d(f1715c, "Login-web");
                f1719g = LineLoginApi.getLoginIntentWithoutLineAppAuth(activity, this.f1722b);
            }
            activity.startActivityForResult(f1719g, 1);
        } catch (Exception e) {
            String str2 = f1715c;
            Log.e(str2, "login error:" + e.getMessage());
            f1720h.mo12043b(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo13211a(Activity activity, String str, String str2, String str3) {
        Log.d(f1715c, "share to Line");
        ComponentName componentName = new ComponentName(f1717e, f1718f);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.setComponent(componentName);
        activity.startActivity(Intent.createChooser(intent, ""));
    }

    /* renamed from: a */
    public void mo13207a() {
        Log.d(f1715c, AppConstant.SDK_LOGOUT);
        try {
            LineApiClient lineApiClient = this.f1721a;
            if (lineApiClient != null) {
                lineApiClient.logout();
                f1720h.mo12021a();
            }
        } catch (Exception e) {
            f1720h.mo12021a();
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13212a(C1690d dVar) {
        f1720h = dVar;
    }

    /* renamed from: a */
    public void mo13210a(Activity activity, C1690d dVar) {
        mo13212a(dVar);
        this.f1722b = C1601d.m2066b(activity, "LINE_CHANNEL_ID") + "";
        mo13209a(activity);
    }

    /* renamed from: a */
    public void mo13208a(int i, int i2, Intent intent) {
        if (i != 1) {
            Log.e("ERROR", "Unsupported Request");
            return;
        }
        try {
            LineLoginResult loginResultFromIntent = LineLoginApi.getLoginResultFromIntent(intent);
            String str = f1715c;
            Log.e(str, "msg=" + loginResultFromIntent.getErrorData().getMessage());
            int i3 = C1692a.f1723a[loginResultFromIntent.getResponseCode().ordinal()];
            if (i3 == 1) {
                Log.d(f1715c, "loginSuccess");
                String userId = loginResultFromIntent.getLineProfile().getUserId();
                String displayName = loginResultFromIntent.getLineProfile().getDisplayName();
                String accessToken = loginResultFromIntent.getLineCredential().getAccessToken().getAccessToken();
                String str2 = f1715c;
                Log.d(str2, "uid:" + userId);
                String str3 = f1715c;
                Log.d(str3, "uname:" + displayName);
                String str4 = f1715c;
                Log.d(str4, "accToken:" + accessToken);
                f1720h.mo12042a(userId, displayName, accessToken, "", QGConstant.LOGIN_OPEN_TYPE_LINE);
            } else if (i3 != 2) {
                String str5 = f1715c;
                Log.e(str5, "Login FAILED!" + loginResultFromIntent.getErrorData().toString());
                f1720h.mo12043b(loginResultFromIntent.getErrorData().toString());
            } else {
                Log.e(f1715c, "LINE Login Canceled by user!!");
                String str6 = f1715c;
                Log.e(str6, "msg=" + loginResultFromIntent.getErrorData().getMessage());
                f1720h.onLoginCancel();
            }
        } catch (Exception e) {
            f1720h.mo12043b(e.getMessage());
        }
    }

    /* renamed from: a */
    public boolean mo13213a(Context context, String str) {
        if (str == null) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
