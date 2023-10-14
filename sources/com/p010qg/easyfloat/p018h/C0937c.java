package com.p010qg.easyfloat.p018h;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.p010qg.easyfloat.p012c.C0912a;
import com.p010qg.easyfloat.p012c.C0918b;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.qg.easyfloat.h.c */
public final class C0937c {

    /* renamed from: a */
    public static final C0937c f195a = new C0937c();

    private C0937c() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m194b(EditText editText, String str) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        C0912a a = C0918b.f108a.mo11396a(str);
        if (a != null) {
            a.mo11383e().flags = 32;
            a.mo11384f().updateViewLayout(a.mo11382d(), a.mo11383e());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(editText) {
            public final /* synthetic */ EditText f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C0937c.m192a(this.f$0);
            }
        }, 100);
    }

    /* renamed from: a */
    public final void mo11490a(EditText editText, String str) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setOnTouchListener(new View.OnTouchListener(editText, str) {
            public final /* synthetic */ EditText f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C0937c.m193a(this.f$0, this.f$1, view, motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m193a(EditText editText, String str, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        m194b(editText, str);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m192a(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final Unit m191a(String str) {
        C0912a a = C0918b.f108a.mo11396a(str);
        if (a == null) {
            return null;
        }
        a.mo11383e().flags = 40;
        a.mo11384f().updateViewLayout(a.mo11382d(), a.mo11383e());
        return Unit.INSTANCE;
    }
}
