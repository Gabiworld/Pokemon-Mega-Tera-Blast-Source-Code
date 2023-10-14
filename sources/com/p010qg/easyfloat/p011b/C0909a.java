package com.p010qg.easyfloat.p011b;

import android.animation.Animator;
import android.view.View;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p015f.C0929c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.qg.easyfloat.b.a */
public final class C0909a {

    /* renamed from: a */
    private final View f88a;

    /* renamed from: b */
    private final WindowManager.LayoutParams f89b;

    /* renamed from: c */
    private final WindowManager f90c;

    /* renamed from: d */
    private final C0923a f91d;

    public C0909a(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, C0923a aVar) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(aVar, "config");
        this.f88a = view;
        this.f89b = layoutParams;
        this.f90c = windowManager;
        this.f91d = aVar;
    }

    /* renamed from: a */
    public final Animator mo11367a() {
        C0929c g = this.f91d.mo11431g();
        if (g == null) {
            return null;
        }
        return g.mo11369a(this.f88a, this.f89b, this.f90c, this.f91d.mo11450x());
    }

    /* renamed from: b */
    public final Animator mo11368b() {
        C0929c g = this.f91d.mo11431g();
        if (g == null) {
            return null;
        }
        return g.mo11370b(this.f88a, this.f89b, this.f90c, this.f91d.mo11450x());
    }
}
