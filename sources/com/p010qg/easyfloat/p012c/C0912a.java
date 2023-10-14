package com.p010qg.easyfloat.p012c;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.p010qg.easyfloat.p011b.C0909a;
import com.p010qg.easyfloat.p012c.C0912a;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p014e.C0924a;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p015f.C0931e;
import com.p010qg.easyfloat.p015f.C0932f;
import com.p010qg.easyfloat.p018h.C0936b;
import com.p010qg.easyfloat.p018h.C0937c;
import com.p010qg.easyfloat.p018h.C0938d;
import com.p010qg.easyfloat.p018h.C0940e;
import com.p010qg.easyfloat.widget.ParentFrameLayout;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0001FB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020*H\u0002J\u0006\u00102\u001a\u00020'J\n\u00103\u001a\u0004\u0018\u000104H\u0002J\n\u00105\u001a\u0004\u0018\u000106H\u0002J\b\u00107\u001a\u00020'H\u0002J\b\u00108\u001a\u00020'H\u0002J\u0010\u00109\u001a\u00020'2\b\b\u0002\u0010:\u001a\u00020/J\b\u0010;\u001a\u00020'H\u0002J\u0012\u0010<\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0003J\u0018\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020\u00162\b\b\u0002\u0010?\u001a\u00020/J\u0012\u0010@\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J.\u0010A\u001a\u00020'2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020\u00162\b\b\u0002\u0010D\u001a\u00020\u00162\b\b\u0002\u0010E\u001a\u00020\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006G"}, mo13302d2 = {"Lcom/qg/easyfloat/core/FloatingWindowHelper;", "", "context", "Landroid/content/Context;", "config", "Lcom/qg/easyfloat/data/FloatConfig;", "(Landroid/content/Context;Lcom/qg/easyfloat/data/FloatConfig;)V", "getConfig", "()Lcom/qg/easyfloat/data/FloatConfig;", "setConfig", "(Lcom/qg/easyfloat/data/FloatConfig;)V", "getContext", "()Landroid/content/Context;", "enterAnimator", "Landroid/animation/Animator;", "frameLayout", "Lcom/qg/easyfloat/widget/ParentFrameLayout;", "getFrameLayout", "()Lcom/qg/easyfloat/widget/ParentFrameLayout;", "setFrameLayout", "(Lcom/qg/easyfloat/widget/ParentFrameLayout;)V", "lastLayoutMeasureHeight", "", "lastLayoutMeasureWidth", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams", "()Landroid/view/WindowManager$LayoutParams;", "setParams", "(Landroid/view/WindowManager$LayoutParams;)V", "touchUtils", "Lcom/qg/easyfloat/core/TouchUtils;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "setWindowManager", "(Landroid/view/WindowManager;)V", "addView", "", "checkEditText", "view", "Landroid/view/View;", "createWindow", "callback", "Lcom/qg/easyfloat/core/FloatingWindowHelper$CreateCallback;", "createWindowInner", "", "enterAnim", "floatingView", "exitAnim", "getActivity", "Landroid/app/Activity;", "getToken", "Landroid/os/IBinder;", "initEditText", "initParams", "remove", "force", "setChangedListener", "setGravity", "setVisible", "visible", "needShow", "traverseViewGroup", "updateFloat", "x", "y", "width", "height", "CreateCallback", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.c.a */
public final class C0912a {

    /* renamed from: a */
    private final Context f93a;

    /* renamed from: b */
    private C0923a f94b;

    /* renamed from: c */
    public WindowManager f95c;

    /* renamed from: d */
    public WindowManager.LayoutParams f96d;

    /* renamed from: e */
    private ParentFrameLayout f97e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0920c f98f;

    /* renamed from: g */
    private Animator f99g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f100h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f101i = -1;

    /* renamed from: com.qg.easyfloat.c.a$a */
    public interface C0913a {
        /* renamed from: a */
        void mo11385a(boolean z);
    }

    /* renamed from: com.qg.easyfloat.c.a$b */
    public static final class C0914b implements C0931e {

        /* renamed from: a */
        final /* synthetic */ C0912a f102a;

        C0914b(C0912a aVar) {
            this.f102a = aVar;
        }

        /* renamed from: a */
        public void mo11386a(MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
            C0920c a = this.f102a.f98f;
            if (a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
                a = null;
            }
            ParentFrameLayout d = this.f102a.mo11382d();
            Intrinsics.checkNotNull(d);
            a.mo11403a(d, motionEvent, this.f102a.mo11384f(), this.f102a.mo11383e());
        }
    }

    /* renamed from: com.qg.easyfloat.c.a$c */
    public static final class C0915c implements ParentFrameLayout.C0941a {

        /* renamed from: a */
        final /* synthetic */ C0912a f103a;

        /* renamed from: b */
        final /* synthetic */ View f104b;

        C0915c(C0912a aVar, View view) {
            this.f103a = aVar;
            this.f104b = view;
        }

        /* renamed from: a */
        public void mo11387a() {
            C0926a.C0927a a;
            Function3<Boolean, String, View, Unit> a2;
            C0912a aVar = this.f103a;
            aVar.m61c(aVar.mo11382d());
            C0912a aVar2 = this.f103a;
            ParentFrameLayout d = aVar2.mo11382d();
            int i = -1;
            aVar2.f100h = d == null ? -1 : d.getMeasuredWidth();
            C0912a aVar3 = this.f103a;
            ParentFrameLayout d2 = aVar3.mo11382d();
            if (d2 != null) {
                i = d2.getMeasuredHeight();
            }
            aVar3.f101i = i;
            C0923a b = this.f103a.mo11380b();
            C0912a aVar4 = this.f103a;
            View view = this.f104b;
            if (b.mo11427e() || ((b.mo11449w() == C0924a.BACKGROUND && C0938d.f196a.mo11494b()) || (b.mo11449w() == C0924a.FOREGROUND && !C0938d.f196a.mo11494b()))) {
                C0912a.m53a(aVar4, 8, false, 2, (Object) null);
                aVar4.m67k();
            } else {
                Intrinsics.checkNotNullExpressionValue(view, "floatingView");
                aVar4.m57b(view);
            }
            b.mo11412a(view);
            C0932f n = b.mo11439n();
            if (n != null) {
                n.mo11475a(view);
            }
            C0930d b2 = b.mo11420b();
            if (b2 != null) {
                b2.mo11471a(true, (String) null, view);
            }
            C0926a h = b.mo11432h();
            if (h != null && (a = h.mo11453a()) != null && (a2 = a.mo11456a()) != null) {
                a2.invoke(true, null, view);
            }
        }
    }

    /* renamed from: com.qg.easyfloat.c.a$d */
    public static final class C0916d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C0912a f105a;

        /* renamed from: b */
        final /* synthetic */ View f106b;

        C0916d(C0912a aVar, View view) {
            this.f105a = aVar;
            this.f106b = view;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f105a.mo11380b().mo11419a(false);
            if (!this.f105a.mo11380b().mo11438m()) {
                this.f105a.mo11383e().flags = 40;
            }
            this.f105a.m67k();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f106b.setVisibility(0);
            this.f105a.mo11380b().mo11419a(true);
        }
    }

    /* renamed from: com.qg.easyfloat.c.a$e */
    public static final class C0917e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C0912a f107a;

        C0917e(C0912a aVar) {
            this.f107a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C0912a.m56a(this.f107a, false, 1, (Object) null);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C0912a(Context context, C0923a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "config");
        this.f93a = context;
        this.f94b = aVar;
    }

    /* renamed from: g */
    private final void m63g() {
        ParentFrameLayout parentFrameLayout = new ParentFrameLayout(this.f93a, this.f94b, (AttributeSet) null, 0, 12, (DefaultConstructorMarker) null);
        this.f97e = parentFrameLayout;
        parentFrameLayout.setTag(this.f94b.mo11434i());
        View q = this.f94b.mo11442q();
        if (q == null) {
            q = null;
        } else {
            ParentFrameLayout d = mo11382d();
            if (d != null) {
                d.addView(q);
            }
        }
        if (q == null) {
            LayoutInflater from = LayoutInflater.from(this.f93a);
            Integer p = this.f94b.mo11441p();
            Intrinsics.checkNotNull(p);
            q = from.inflate(p.intValue(), this.f97e, true);
        }
        q.setVisibility(4);
        mo11384f().addView(this.f97e, mo11383e());
        ParentFrameLayout parentFrameLayout2 = this.f97e;
        if (parentFrameLayout2 != null) {
            parentFrameLayout2.setTouchListener(new C0914b(this));
        }
        ParentFrameLayout parentFrameLayout3 = this.f97e;
        if (parentFrameLayout3 != null) {
            parentFrameLayout3.setLayoutListener(new C0915c(this, q));
        }
        m69m();
    }

    /* renamed from: h */
    private final boolean m64h() {
        C0926a.C0927a a;
        Function3<Boolean, String, View, Unit> a2;
        try {
            this.f98f = new C0920c(this.f93a, this.f94b);
            m68l();
            m63g();
            this.f94b.mo11430f(true);
            return true;
        } catch (Exception e) {
            C0930d b = this.f94b.mo11420b();
            if (b != null) {
                b.mo11471a(false, String.valueOf(e), (View) null);
            }
            C0926a h = this.f94b.mo11432h();
            if (!(h == null || (a = h.mo11453a()) == null || (a2 = a.mo11456a()) == null)) {
                a2.invoke(false, String.valueOf(e), null);
            }
            return false;
        }
    }

    /* renamed from: i */
    private final Activity m65i() {
        Context context = this.f93a;
        return context instanceof Activity ? (Activity) context : C0938d.f196a.mo11491a();
    }

    /* renamed from: j */
    private final IBinder m66j() {
        Window window;
        View decorView;
        Activity i = m65i();
        if (i == null || (window = i.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getWindowToken();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m67k() {
        ParentFrameLayout parentFrameLayout;
        if (this.f94b.mo11436k() && (parentFrameLayout = this.f97e) != null) {
            m62d(parentFrameLayout);
        }
    }

    /* renamed from: l */
    private final void m68l() {
        Object systemService = this.f93a.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        mo11377a((WindowManager) systemService);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (mo11380b().mo11449w() == C0924a.CURRENT_ACTIVITY) {
            layoutParams.type = 1000;
            layoutParams.token = m66j();
        } else {
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = mo11380b().mo11438m() ? 552 : 40;
        int i = -1;
        layoutParams.width = mo11380b().mo11452z() ? -1 : -2;
        if (!mo11380b().mo11437l()) {
            i = -2;
        }
        layoutParams.height = i;
        if (mo11380b().mo11438m() && mo11380b().mo11437l()) {
            layoutParams.height = C0936b.f194a.mo11484c(mo11381c());
        }
        if (!Intrinsics.areEqual((Object) mo11380b().mo11444s(), (Object) new Pair(0, 0))) {
            layoutParams.x = mo11380b().mo11444s().getFirst().intValue();
            layoutParams.y = mo11380b().mo11444s().getSecond().intValue();
        }
        Unit unit = Unit.INSTANCE;
        mo11376a(layoutParams);
    }

    /* renamed from: m */
    private final void m69m() {
        ViewTreeObserver viewTreeObserver;
        ParentFrameLayout parentFrameLayout = this.f97e;
        if (parentFrameLayout != null && (viewTreeObserver = parentFrameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(parentFrameLayout) {
                public final /* synthetic */ ParentFrameLayout f$1;

                {
                    this.f$1 = r2;
                }

                public final void onGlobalLayout() {
                    C0912a.m55a(C0912a.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: c */
    public final Context mo11381c() {
        return this.f93a;
    }

    /* renamed from: d */
    public final ParentFrameLayout mo11382d() {
        return this.f97e;
    }

    /* renamed from: e */
    public final WindowManager.LayoutParams mo11383e() {
        WindowManager.LayoutParams layoutParams = this.f96d;
        if (layoutParams != null) {
            return layoutParams;
        }
        Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
        return null;
    }

    /* renamed from: f */
    public final WindowManager mo11384f() {
        WindowManager windowManager = this.f95c;
        if (windowManager != null) {
            return windowManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m61c(View view) {
        int i = 0;
        if (Intrinsics.areEqual((Object) this.f94b.mo11444s(), (Object) new Pair(0, 0)) && view != null) {
            Rect rect = new Rect();
            mo11384f().getDefaultDisplay().getRectSize(rect);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] > mo11383e().y) {
                i = C0936b.f194a.mo11482a(view);
            }
            int a = this.f94b.mo11422c().mo11467a(this.f93a) - i;
            switch (this.f94b.mo11435j()) {
                case 1:
                case 49:
                    mo11383e().x = (rect.right - view.getWidth()) >> 1;
                    break;
                case 5:
                case 53:
                case GravityCompat.END:
                case 8388661:
                    mo11383e().x = rect.right - view.getWidth();
                    break;
                case 16:
                case 19:
                case 8388627:
                    mo11383e().y = (a - view.getHeight()) >> 1;
                    break;
                case 17:
                    mo11383e().x = (rect.right - view.getWidth()) >> 1;
                    mo11383e().y = (a - view.getHeight()) >> 1;
                    break;
                case 21:
                case 8388629:
                    mo11383e().x = rect.right - view.getWidth();
                    mo11383e().y = (a - view.getHeight()) >> 1;
                    break;
                case 80:
                case 83:
                case 8388691:
                    mo11383e().y = a - view.getHeight();
                    break;
                case 81:
                    mo11383e().x = (rect.right - view.getWidth()) >> 1;
                    mo11383e().y = a - view.getHeight();
                    break;
                case 85:
                case 8388693:
                    mo11383e().x = rect.right - view.getWidth();
                    mo11383e().y = a - view.getHeight();
                    break;
            }
            mo11383e().x += this.f94b.mo11447u().getFirst().intValue();
            mo11383e().y += this.f94b.mo11447u().getSecond().intValue();
            if (this.f94b.mo11438m()) {
                if (this.f94b.mo11449w() != C0924a.CURRENT_ACTIVITY) {
                    mo11383e().y -= i;
                }
            } else if (this.f94b.mo11449w() == C0924a.CURRENT_ACTIVITY) {
                mo11383e().y += i;
            }
            mo11384f().updateViewLayout(view, mo11383e());
        }
    }

    /* renamed from: d */
    private final void m62d(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                int i = 0;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    while (true) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof ViewGroup) {
                            m62d(childAt);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(childAt, "child");
                            m50a(childAt);
                        }
                        if (i2 < childCount) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                m50a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo11377a(WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(windowManager, "<set-?>");
        this.f95c = windowManager;
    }

    /* renamed from: b */
    public final C0923a mo11380b() {
        return this.f94b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m57b(View view) {
        if (this.f97e != null && !this.f94b.mo11408A()) {
            ParentFrameLayout parentFrameLayout = this.f97e;
            Intrinsics.checkNotNull(parentFrameLayout);
            Animator a = new C0909a(parentFrameLayout, mo11383e(), mo11384f(), this.f94b).mo11367a();
            if (a == null) {
                a = null;
            } else {
                mo11383e().flags = 552;
                a.addListener(new C0916d(this, view));
                a.start();
                Unit unit = Unit.INSTANCE;
            }
            this.f99g = a;
            if (a == null) {
                view.setVisibility(0);
                mo11384f().updateViewLayout(this.f97e, mo11383e());
            }
        }
    }

    /* renamed from: a */
    public final void mo11376a(WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.f96d = layoutParams;
    }

    /* renamed from: a */
    public final void mo11378a(C0913a aVar) {
        C0926a.C0927a a;
        Function3<Boolean, String, View, Unit> a2;
        View findViewById;
        Intrinsics.checkNotNullParameter(aVar, "callback");
        if (this.f94b.mo11449w() == C0924a.CURRENT_ACTIVITY && m66j() == null) {
            Activity i = m65i();
            if (i == null || (findViewById = i.findViewById(16908290)) == null) {
                aVar.mo11385a(false);
                C0930d b = this.f94b.mo11420b();
                if (b != null) {
                    b.mo11471a(false, "Activity is null.", (View) null);
                }
                C0926a h = this.f94b.mo11432h();
                if (h != null && (a = h.mo11453a()) != null && (a2 = a.mo11456a()) != null) {
                    a2.invoke(false, "Activity is null.", null);
                    return;
                }
                return;
            }
            findViewById.post(new Runnable(this) {
                public final /* synthetic */ C0912a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C0912a.m51a(C0912a.C0913a.this, this.f$1);
                }
            });
            return;
        }
        aVar.mo11385a(m64h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m51a(C0913a aVar, C0912a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        Intrinsics.checkNotNullParameter(aVar2, "this$0");
        aVar.mo11385a(aVar2.m64h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m55a(C0912a aVar, ParentFrameLayout parentFrameLayout) {
        Intrinsics.checkNotNullParameter(aVar, "this$0");
        Intrinsics.checkNotNullParameter(parentFrameLayout, "$this_apply");
        int i = aVar.f100h;
        boolean z = false;
        boolean z2 = i == -1 || aVar.f101i == -1;
        if (i == parentFrameLayout.getMeasuredWidth() && aVar.f101i == parentFrameLayout.getMeasuredHeight()) {
            z = true;
        }
        if (!z2 && !z) {
            if ((aVar.mo11380b().mo11440o() & GravityCompat.START) != 8388611) {
                if ((aVar.mo11380b().mo11440o() & GravityCompat.END) == 8388613) {
                    aVar.mo11383e().x -= parentFrameLayout.getMeasuredWidth() - aVar.f100h;
                } else if ((aVar.mo11380b().mo11440o() & 1) == 1 || (aVar.mo11380b().mo11440o() & 17) == 17) {
                    aVar.mo11383e().x += (aVar.f100h / 2) - (parentFrameLayout.getMeasuredWidth() / 2);
                }
            }
            if ((aVar.mo11380b().mo11440o() & 48) != 48) {
                if ((aVar.mo11380b().mo11440o() & 80) == 80) {
                    aVar.mo11383e().y -= parentFrameLayout.getMeasuredHeight() - aVar.f101i;
                } else if ((aVar.mo11380b().mo11440o() & 16) == 16 || (aVar.mo11380b().mo11440o() & 17) == 17) {
                    aVar.mo11383e().y += (aVar.f101i / 2) - (parentFrameLayout.getMeasuredHeight() / 2);
                }
            }
            aVar.f100h = parentFrameLayout.getMeasuredWidth();
            aVar.f101i = parentFrameLayout.getMeasuredHeight();
            aVar.mo11384f().updateViewLayout(aVar.mo11382d(), aVar.mo11383e());
        }
    }

    /* renamed from: a */
    private final void m50a(View view) {
        if (view instanceof EditText) {
            C0937c.f195a.mo11490a((EditText) view, this.f94b.mo11434i());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m53a(C0912a aVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        aVar.mo11375a(i, z);
    }

    /* renamed from: a */
    public final void mo11375a(int i, boolean z) {
        C0926a.C0927a a;
        Function1<View, Unit> e;
        C0926a.C0927a a2;
        Function1<View, Unit> f;
        ParentFrameLayout parentFrameLayout = this.f97e;
        if (parentFrameLayout != null) {
            Intrinsics.checkNotNull(parentFrameLayout);
            if (parentFrameLayout.getChildCount() >= 1) {
                this.f94b.mo11426e(z);
                ParentFrameLayout parentFrameLayout2 = this.f97e;
                Intrinsics.checkNotNull(parentFrameLayout2);
                parentFrameLayout2.setVisibility(i);
                ParentFrameLayout parentFrameLayout3 = this.f97e;
                Intrinsics.checkNotNull(parentFrameLayout3);
                View childAt = parentFrameLayout3.getChildAt(0);
                if (i == 0) {
                    this.f94b.mo11430f(true);
                    C0930d b = this.f94b.mo11420b();
                    if (b != null) {
                        Intrinsics.checkNotNullExpressionValue(childAt, ViewHierarchyConstants.VIEW_KEY);
                        b.mo11474c(childAt);
                    }
                    C0926a h = this.f94b.mo11432h();
                    if (h != null && (a2 = h.mo11453a()) != null && (f = a2.mo11465f()) != null) {
                        Intrinsics.checkNotNullExpressionValue(childAt, ViewHierarchyConstants.VIEW_KEY);
                        f.invoke(childAt);
                        return;
                    }
                    return;
                }
                this.f94b.mo11430f(false);
                C0930d b2 = this.f94b.mo11420b();
                if (b2 != null) {
                    Intrinsics.checkNotNullExpressionValue(childAt, ViewHierarchyConstants.VIEW_KEY);
                    b2.mo11469a(childAt);
                }
                C0926a h2 = this.f94b.mo11432h();
                if (h2 != null && (a = h2.mo11453a()) != null && (e = a.mo11464e()) != null) {
                    Intrinsics.checkNotNullExpressionValue(childAt, ViewHierarchyConstants.VIEW_KEY);
                    e.invoke(childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11374a() {
        if (this.f97e == null) {
            return;
        }
        if (!this.f94b.mo11408A() || this.f99g != null) {
            Animator animator = this.f99g;
            if (animator != null) {
                animator.cancel();
            }
            ParentFrameLayout parentFrameLayout = this.f97e;
            Intrinsics.checkNotNull(parentFrameLayout);
            Animator b = new C0909a(parentFrameLayout, mo11383e(), mo11384f(), this.f94b).mo11368b();
            if (b == null) {
                m56a(this, false, 1, (Object) null);
            } else if (!this.f94b.mo11408A()) {
                this.f94b.mo11419a(true);
                mo11383e().flags = 552;
                b.addListener(new C0917e(this));
                b.start();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m56a(C0912a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.mo11379a(z);
    }

    /* renamed from: a */
    public final void mo11379a(boolean z) {
        try {
            this.f94b.mo11419a(false);
            C0918b.f108a.mo11401b(this.f94b.mo11434i());
            WindowManager f = mo11384f();
            if (z) {
                f.removeViewImmediate(mo11382d());
            } else {
                f.removeView(mo11382d());
            }
        } catch (Exception e) {
            C0940e.f199a.mo11504b(Intrinsics.stringPlus("浮窗关闭出现异常：", e));
        }
    }
}
