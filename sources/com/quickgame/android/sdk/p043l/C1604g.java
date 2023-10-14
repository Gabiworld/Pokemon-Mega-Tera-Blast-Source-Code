package com.quickgame.android.sdk.p043l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.quickgame.android.sdk.l.g */
public final class C1604g {

    /* renamed from: a */
    public static final C1604g f1604a = new C1604g();

    private C1604g() {
    }

    /* renamed from: a */
    public final void mo13052a(String str) {
        if (str != null) {
            boolean isEmpty = TextUtils.isEmpty(str);
            C1128a r = C1128a.m798r();
            Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
            if (!isEmpty || !(r.mo11981e() != null)) {
                C1128a r2 = C1128a.m798r();
                Intrinsics.checkNotNullExpressionValue(r2, "SDKImpl.getInstance()");
                Toast.makeText(r2.mo11981e(), str, 0).show();
            }
        }
    }

    /* renamed from: a */
    public final void mo13051a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View inflate = View.inflate(activity, C1124R.layout.qg_toast, (ViewGroup) activity.findViewById(C1124R.C1126id.toast_layout));
        View findViewById = inflate.findViewById(C1124R.C1126id.tv_content);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        Toast toast = new Toast(activity);
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
    }
}
