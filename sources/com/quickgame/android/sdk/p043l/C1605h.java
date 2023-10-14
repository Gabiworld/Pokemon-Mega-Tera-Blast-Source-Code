package com.quickgame.android.sdk.p043l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.quickgame.android.sdk.l.h */
public final class C1605h {
    /* renamed from: a */
    public static int m2086a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static void m2088b(Activity activity) {
        if (activity != null && !activity.isDestroyed()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* renamed from: a */
    public static void m2087a(Activity activity) {
        if (activity != null && !activity.isDestroyed()) {
            Window window = activity.getWindow();
            window.addFlags(67108864);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            m2088b(activity);
        }
    }
}
