package com.p010qg.easyfloat.p018h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p010qg.easyfloat.p016g.p017a.C0934a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.qg.easyfloat.h.b */
public final class C0936b {

    /* renamed from: a */
    public static final C0936b f194a = new C0936b();

    private C0936b() {
    }

    /* renamed from: i */
    private final boolean m178i(Context context) {
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        int i4 = displayMetrics2.widthPixels;
        if (mo11483b(context) + i3 > i) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* renamed from: j */
    private final boolean m179j(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 21) {
            i = Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        } else {
            i = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m180k(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    /* renamed from: l */
    private final boolean m181l(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
    }

    /* renamed from: a */
    public final int mo11482a(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "view.context.applicationContext");
        return mo11487f(applicationContext);
    }

    /* renamed from: b */
    public final int mo11483b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", Constants.PLATFORM);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo11484c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return mo11485d(context).y;
    }

    /* renamed from: d */
    public final Point mo11485d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: e */
    public final int mo11486e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (context.getResources().getConfiguration().orientation == 1) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.widthPixels - mo11481a(context);
    }

    /* renamed from: f */
    public final int mo11487f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", Constants.PLATFORM);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo11488g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (mo11483b(context) != 0 && ((!C0934a.f193a.mo11476a() || !m179j(context)) && ((!C0934a.f193a.mo11477b() || !m180k(context)) && (!C0934a.f193a.mo11478c() || !m181l(context))))) {
            return m178i(context);
        }
        return false;
    }

    /* renamed from: h */
    public final int mo11489h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Point d = mo11485d(context);
        int i = d.x;
        int i2 = d.y;
        if (i > i2) {
            return i2;
        }
        return i2 - mo11481a(context);
    }

    /* renamed from: a */
    public final int mo11481a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (mo11488g(context)) {
            return mo11483b(context);
        }
        return 0;
    }
}
