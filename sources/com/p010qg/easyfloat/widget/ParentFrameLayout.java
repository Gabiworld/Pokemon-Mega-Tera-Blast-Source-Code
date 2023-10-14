package com.p010qg.easyfloat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p015f.C0931e;
import com.p010qg.easyfloat.p018h.C0937c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001'B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fH\u0016J0\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0014J\u0012\u0010&\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006("}, mo13302d2 = {"Lcom/qg/easyfloat/widget/ParentFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "config", "Lcom/qg/easyfloat/data/FloatConfig;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Lcom/qg/easyfloat/data/FloatConfig;Landroid/util/AttributeSet;I)V", "isCreated", "", "layoutListener", "Lcom/qg/easyfloat/widget/ParentFrameLayout$OnLayoutListener;", "getLayoutListener", "()Lcom/qg/easyfloat/widget/ParentFrameLayout$OnLayoutListener;", "setLayoutListener", "(Lcom/qg/easyfloat/widget/ParentFrameLayout$OnLayoutListener;)V", "touchListener", "Lcom/qg/easyfloat/interfaces/OnFloatTouchListener;", "getTouchListener", "()Lcom/qg/easyfloat/interfaces/OnFloatTouchListener;", "setTouchListener", "(Lcom/qg/easyfloat/interfaces/OnFloatTouchListener;)V", "dispatchKeyEventPreIme", "event", "Landroid/view/KeyEvent;", "onDetachedFromWindow", "", "onInterceptTouchEvent", "Landroid/view/MotionEvent;", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "OnLayoutListener", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.widget.ParentFrameLayout */
public final class ParentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final C0923a f202a;

    /* renamed from: b */
    private C0931e f203b;

    /* renamed from: c */
    private C0941a f204c;

    /* renamed from: d */
    private boolean f205d;

    /* renamed from: com.qg.easyfloat.widget.ParentFrameLayout$a */
    public interface C0941a {
        /* renamed from: a */
        void mo11387a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentFrameLayout(Context context, C0923a aVar, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f202a.mo11436k()) {
            if ((keyEvent != null && keyEvent.getAction() == 0) && keyEvent.getKeyCode() == 4) {
                C0937c.m191a(this.f202a.mo11434i());
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final C0941a getLayoutListener() {
        return this.f204c;
    }

    public final C0931e getTouchListener() {
        return this.f203b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0926a.C0927a a;
        Function0<Unit> b;
        super.onDetachedFromWindow();
        C0930d b2 = this.f202a.mo11420b();
        if (b2 != null) {
            b2.mo11468a();
        }
        C0926a h = this.f202a.mo11432h();
        if (h != null && (a = h.mo11453a()) != null && (b = a.mo11460b()) != null) {
            b.invoke();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0931e eVar;
        if (!(motionEvent == null || (eVar = this.f203b) == null)) {
            eVar.mo11386a(motionEvent);
        }
        return this.f202a.mo11409B() || super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f205d) {
            this.f205d = true;
            C0941a aVar = this.f204c;
            if (aVar != null) {
                aVar.mo11387a();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0931e eVar;
        if (!(motionEvent == null || (eVar = this.f203b) == null)) {
            eVar.mo11386a(motionEvent);
        }
        return this.f202a.mo11409B() || super.onTouchEvent(motionEvent);
    }

    public final void setLayoutListener(C0941a aVar) {
        this.f204c = aVar;
    }

    public final void setTouchListener(C0931e eVar) {
        this.f203b = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParentFrameLayout(Context context, C0923a aVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "config");
        this.f202a = aVar;
    }
}
