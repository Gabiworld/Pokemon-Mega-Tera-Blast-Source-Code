package com.quickgame.android.sdk.p043l;

import android.app.Activity;
import android.content.Intent;
import com.quickgame.android.sdk.activity.BindEmailActivity;
import com.quickgame.android.sdk.activity.BindThirdLoginActivity;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p039h.C1538f;

/* renamed from: com.quickgame.android.sdk.l.i */
public class C1606i {
    /* renamed from: a */
    public static void m2090a(Activity activity, boolean z, String str) {
        C1538f.m1861l().mo12834a(false);
        Intent intent = new Intent(activity, BindThirdLoginActivity.class);
        if (!z) {
            intent.putExtra("type", "bind");
            intent.putExtra("openType", str);
        } else {
            intent.putExtra("type", "unbind");
            intent.putExtra("openType", str);
        }
        activity.startActivityForResult(intent, 507);
    }

    /* renamed from: a */
    public static void m2089a(Activity activity, boolean z) {
        C1538f.m1861l().mo12834a(false);
        Intent intent = new Intent(activity, BindEmailActivity.class);
        if (!z) {
            intent.putExtra("type", "bind");
            intent.putExtra("openType", QGConstant.LOGIN_OPEN_TYPE_EMAIL);
        } else {
            intent.putExtra("type", "unbind");
            intent.putExtra("openType", QGConstant.LOGIN_OPEN_TYPE_EMAIL);
        }
        activity.startActivityForResult(intent, 507);
    }
}
