package com.p010qg.easyfloat.p012c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p014e.C0924a;
import com.p010qg.easyfloat.p014e.C0925b;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p018h.C0936b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002J \u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0002J&\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020'J\u001e\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, mo13302d2 = {"Lcom/qg/easyfloat/core/TouchUtils;", "", "context", "Landroid/content/Context;", "config", "Lcom/qg/easyfloat/data/FloatConfig;", "(Landroid/content/Context;Lcom/qg/easyfloat/data/FloatConfig;)V", "bottomBorder", "", "bottomDistance", "getConfig", "()Lcom/qg/easyfloat/data/FloatConfig;", "getContext", "()Landroid/content/Context;", "emptyHeight", "lastX", "", "lastY", "leftBorder", "leftDistance", "location", "", "minX", "minY", "parentHeight", "parentRect", "Landroid/graphics/Rect;", "parentWidth", "rightBorder", "rightDistance", "statusBarHeight", "topBorder", "topDistance", "dragEnd", "", "view", "Landroid/view/View;", "initBoarderValue", "params", "Landroid/view/WindowManager$LayoutParams;", "initDistanceValue", "sideAnim", "windowManager", "Landroid/view/WindowManager;", "updateFloat", "event", "Landroid/view/MotionEvent;", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.c.c */
public final class C0920c {

    /* renamed from: a */
    private final Context f112a;

    /* renamed from: b */
    private final C0923a f113b;

    /* renamed from: c */
    private Rect f114c = new Rect();

    /* renamed from: d */
    private int f115d;

    /* renamed from: e */
    private int f116e;

    /* renamed from: f */
    private int f117f;

    /* renamed from: g */
    private int f118g;

    /* renamed from: h */
    private int f119h;

    /* renamed from: i */
    private int f120i;

    /* renamed from: j */
    private float f121j;

    /* renamed from: k */
    private float f122k;

    /* renamed from: l */
    private int f123l;

    /* renamed from: m */
    private int f124m;

    /* renamed from: n */
    private int f125n;

    /* renamed from: o */
    private int f126o;

    /* renamed from: p */
    private int f127p;

    /* renamed from: q */
    private int f128q;

    /* renamed from: r */
    private final int[] f129r = new int[2];

    /* renamed from: s */
    private int f130s;

    /* renamed from: t */
    private int f131t;

    /* renamed from: com.qg.easyfloat.c.c$a */
    public /* synthetic */ class C0921a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f132a;

        static {
            int[] iArr = new int[C0925b.values().length];
            iArr[C0925b.LEFT.ordinal()] = 1;
            iArr[C0925b.RIGHT.ordinal()] = 2;
            iArr[C0925b.TOP.ordinal()] = 3;
            iArr[C0925b.BOTTOM.ordinal()] = 4;
            iArr[C0925b.AUTO_HORIZONTAL.ordinal()] = 5;
            iArr[C0925b.AUTO_VERTICAL.ordinal()] = 6;
            iArr[C0925b.AUTO_SIDE.ordinal()] = 7;
            iArr[C0925b.RESULT_LEFT.ordinal()] = 8;
            iArr[C0925b.RESULT_RIGHT.ordinal()] = 9;
            iArr[C0925b.RESULT_TOP.ordinal()] = 10;
            iArr[C0925b.RESULT_BOTTOM.ordinal()] = 11;
            iArr[C0925b.RESULT_HORIZONTAL.ordinal()] = 12;
            iArr[C0925b.RESULT_VERTICAL.ordinal()] = 13;
            iArr[C0925b.RESULT_SIDE.ordinal()] = 14;
            f132a = iArr;
        }
    }

    /* renamed from: com.qg.easyfloat.c.c$b */
    public static final class C0922b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C0920c f133a;

        /* renamed from: b */
        final /* synthetic */ View f134b;

        C0922b(C0920c cVar, View view) {
            this.f133a = cVar;
            this.f134b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f133a.m94a(this.f134b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f133a.m94a(this.f134b);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f133a.mo11402a().mo11419a(true);
        }
    }

    public C0920c(Context context, C0923a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "config");
        this.f112a = context;
        this.f113b = aVar;
    }

    /* renamed from: b */
    private final int m100b(View view) {
        return C0936b.f194a.mo11482a(view);
    }

    /* renamed from: a */
    public final C0923a mo11402a() {
        return this.f113b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r0 < r4) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        if (r0 > r4) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01aa, code lost:
        r1 = r1 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ab, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ac, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ae, code lost:
        r1 = r0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        r11.x = r2;
        r11.y = r1;
        r10.updateViewLayout(r8, r11);
        r10 = r7.f113b.mo11420b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
        if (r10 != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        r10.mo11470a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c3, code lost:
        r10 = r7.f113b.mo11432h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (r10 != null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cc, code lost:
        r10 = r10.mo11453a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        if (r10 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d3, code lost:
        r10 = r10.mo11462c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        if (r10 != null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
        r10.invoke(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01dd, code lost:
        r7.f121j = r9.getRawX();
        r7.f122k = r9.getRawY();
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11403a(android.view.View r8, android.view.MotionEvent r9, android.view.WindowManager r10, android.view.WindowManager.LayoutParams r11) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "windowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.qg.easyfloat.d.a r0 = r7.f113b
            com.qg.easyfloat.f.d r0 = r0.mo11420b()
            if (r0 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r0.mo11473b(r8, r9)
        L_0x0020:
            com.qg.easyfloat.d.a r0 = r7.f113b
            com.qg.easyfloat.f.a r0 = r0.mo11432h()
            if (r0 != 0) goto L_0x0029
            goto L_0x003a
        L_0x0029:
            com.qg.easyfloat.f.a$a r0 = r0.mo11453a()
            if (r0 != 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            kotlin.jvm.functions.Function2 r0 = r0.mo11466g()
            if (r0 != 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r0.invoke(r8, r9)
        L_0x003a:
            com.qg.easyfloat.d.a r0 = r7.f113b
            boolean r0 = r0.mo11425d()
            r1 = 0
            if (r0 == 0) goto L_0x026c
            com.qg.easyfloat.d.a r0 = r7.f113b
            boolean r0 = r0.mo11408A()
            if (r0 == 0) goto L_0x004d
            goto L_0x026c
        L_0x004d:
            int r0 = r9.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0257
            r2 = 1
            if (r0 == r2) goto L_0x01ec
            r3 = 2
            if (r0 == r3) goto L_0x005f
            r1 = 3
            if (r0 == r1) goto L_0x01ec
            return
        L_0x005f:
            float r0 = r9.getRawX()
            int r4 = r7.f117f
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01eb
            float r0 = r9.getRawX()
            int r4 = r7.f119h
            int r5 = r8.getWidth()
            int r4 = r4 + r5
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01eb
            float r0 = r9.getRawY()
            int r4 = r7.f118g
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01eb
            float r0 = r9.getRawY()
            int r4 = r7.f120i
            int r5 = r8.getHeight()
            int r4 = r4 + r5
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            goto L_0x01eb
        L_0x0097:
            float r0 = r9.getRawX()
            float r4 = r7.f121j
            float r0 = r0 - r4
            float r4 = r9.getRawY()
            float r5 = r7.f122k
            float r4 = r4 - r5
            com.qg.easyfloat.d.a r5 = r7.f113b
            boolean r5 = r5.mo11409B()
            if (r5 != 0) goto L_0x00b9
            float r5 = r0 * r0
            float r6 = r4 * r4
            float r5 = r5 + r6
            r6 = 1117913088(0x42a20000, float:81.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b9
            return
        L_0x00b9:
            com.qg.easyfloat.d.a r5 = r7.f113b
            r5.mo11421b(r2)
            int r2 = r11.x
            int r0 = (int) r0
            int r2 = r2 + r0
            int r0 = r11.y
            int r4 = (int) r4
            int r0 = r0 + r4
            int r4 = r7.f117f
            if (r2 >= r4) goto L_0x00cc
        L_0x00ca:
            r2 = r4
            goto L_0x00d1
        L_0x00cc:
            int r4 = r7.f119h
            if (r2 <= r4) goto L_0x00d1
            goto L_0x00ca
        L_0x00d1:
            com.qg.easyfloat.d.a r4 = r7.f113b
            com.qg.easyfloat.e.a r4 = r4.mo11449w()
            com.qg.easyfloat.e.a r5 = com.p010qg.easyfloat.p014e.C0924a.CURRENT_ACTIVITY
            if (r4 != r5) goto L_0x00ed
            int r4 = r7.m100b(r8)
            if (r0 >= r4) goto L_0x00ed
            com.qg.easyfloat.d.a r4 = r7.f113b
            boolean r4 = r4.mo11438m()
            if (r4 != 0) goto L_0x00ed
            int r0 = r7.m100b(r8)
        L_0x00ed:
            int r4 = r7.f118g
            if (r0 >= r4) goto L_0x00f3
        L_0x00f1:
            r0 = r4
            goto L_0x010a
        L_0x00f3:
            if (r0 >= 0) goto L_0x0105
            com.qg.easyfloat.d.a r4 = r7.f113b
            boolean r4 = r4.mo11438m()
            if (r4 == 0) goto L_0x0103
            int r4 = r7.f130s
            int r4 = -r4
            if (r0 >= r4) goto L_0x010a
            goto L_0x00f1
        L_0x0103:
            r0 = 0
            goto L_0x010a
        L_0x0105:
            int r4 = r7.f120i
            if (r0 <= r4) goto L_0x010a
            goto L_0x00f1
        L_0x010a:
            com.qg.easyfloat.d.a r4 = r7.f113b
            com.qg.easyfloat.e.b r4 = r4.mo11450x()
            int[] r5 = com.p010qg.easyfloat.p012c.C0920c.C0921a.f132a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            switch(r4) {
                case 1: goto L_0x01ae;
                case 2: goto L_0x01a4;
                case 3: goto L_0x01b0;
                case 4: goto L_0x01a1;
                case 5: goto L_0x018c;
                case 6: goto L_0x0171;
                case 7: goto L_0x011d;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x01ac
        L_0x011d:
            float r3 = r9.getRawX()
            int r3 = (int) r3
            r7.f123l = r3
            int r3 = r7.f116e
            float r4 = r9.getRawX()
            int r4 = (int) r4
            int r3 = r3 - r4
            r7.f124m = r3
            float r3 = r9.getRawY()
            int r3 = (int) r3
            android.graphics.Rect r4 = r7.f114c
            int r4 = r4.top
            int r3 = r3 - r4
            r7.f125n = r3
            int r3 = r7.f115d
            int r3 = r3 + r4
            float r4 = r9.getRawY()
            int r4 = (int) r4
            int r3 = r3 - r4
            r7.f126o = r3
            int r3 = r7.f123l
            int r4 = r7.f124m
            int r3 = java.lang.Math.min(r3, r4)
            r7.f127p = r3
            int r3 = r7.f125n
            int r4 = r7.f126o
            int r3 = java.lang.Math.min(r3, r4)
            r7.f128q = r3
            int r4 = r7.f127p
            if (r4 >= r3) goto L_0x0169
            int r2 = r7.f123l
            if (r2 != r4) goto L_0x0162
            goto L_0x01ae
        L_0x0162:
            int r1 = r7.f116e
            int r2 = r8.getWidth()
            goto L_0x01aa
        L_0x0169:
            int r0 = r7.f125n
            if (r0 != r3) goto L_0x016e
            goto L_0x01b0
        L_0x016e:
            int r0 = r7.f131t
            goto L_0x01ac
        L_0x0171:
            float r0 = r9.getRawY()
            android.graphics.Rect r4 = r7.f114c
            int r4 = r4.top
            float r4 = (float) r4
            float r0 = r0 - r4
            float r3 = (float) r3
            float r0 = r0 * r3
            int r3 = r7.f115d
            float r4 = (float) r3
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b0
            int r0 = r8.getHeight()
            int r3 = r3 - r0
            r1 = r3
            goto L_0x01b0
        L_0x018c:
            float r2 = r9.getRawX()
            float r3 = (float) r3
            float r2 = r2 * r3
            int r3 = r7.f116e
            float r4 = (float) r3
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ae
            int r1 = r8.getWidth()
            int r1 = r3 - r1
            goto L_0x01ab
        L_0x01a1:
            int r1 = r7.f131t
            goto L_0x01b0
        L_0x01a4:
            int r1 = r7.f116e
            int r2 = r8.getWidth()
        L_0x01aa:
            int r1 = r1 - r2
        L_0x01ab:
            r2 = r1
        L_0x01ac:
            r1 = r0
            goto L_0x01b0
        L_0x01ae:
            r1 = r0
            r2 = 0
        L_0x01b0:
            r11.x = r2
            r11.y = r1
            r10.updateViewLayout(r8, r11)
            com.qg.easyfloat.d.a r10 = r7.f113b
            com.qg.easyfloat.f.d r10 = r10.mo11420b()
            if (r10 != 0) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            r10.mo11470a(r8, r9)
        L_0x01c3:
            com.qg.easyfloat.d.a r10 = r7.f113b
            com.qg.easyfloat.f.a r10 = r10.mo11432h()
            if (r10 != 0) goto L_0x01cc
            goto L_0x01dd
        L_0x01cc:
            com.qg.easyfloat.f.a$a r10 = r10.mo11453a()
            if (r10 != 0) goto L_0x01d3
            goto L_0x01dd
        L_0x01d3:
            kotlin.jvm.functions.Function2 r10 = r10.mo11462c()
            if (r10 != 0) goto L_0x01da
            goto L_0x01dd
        L_0x01da:
            r10.invoke(r8, r9)
        L_0x01dd:
            float r8 = r9.getRawX()
            r7.f121j = r8
            float r8 = r9.getRawY()
            r7.f122k = r8
            goto L_0x026b
        L_0x01eb:
            return
        L_0x01ec:
            com.qg.easyfloat.d.a r0 = r7.f113b
            boolean r0 = r0.mo11409B()
            if (r0 != 0) goto L_0x01f5
            return
        L_0x01f5:
            com.qg.easyfloat.d.a r0 = r7.f113b
            com.qg.easyfloat.f.d r0 = r0.mo11420b()
            if (r0 != 0) goto L_0x01fe
            goto L_0x0201
        L_0x01fe:
            r0.mo11470a(r8, r9)
        L_0x0201:
            com.qg.easyfloat.d.a r0 = r7.f113b
            com.qg.easyfloat.f.a r0 = r0.mo11432h()
            if (r0 != 0) goto L_0x020a
            goto L_0x021b
        L_0x020a:
            com.qg.easyfloat.f.a$a r0 = r0.mo11453a()
            if (r0 != 0) goto L_0x0211
            goto L_0x021b
        L_0x0211:
            kotlin.jvm.functions.Function2 r0 = r0.mo11462c()
            if (r0 != 0) goto L_0x0218
            goto L_0x021b
        L_0x0218:
            r0.invoke(r8, r9)
        L_0x021b:
            com.qg.easyfloat.d.a r9 = r7.f113b
            com.qg.easyfloat.e.b r9 = r9.mo11450x()
            int[] r0 = com.p010qg.easyfloat.p012c.C0920c.C0921a.f132a
            int r9 = r9.ordinal()
            r9 = r0[r9]
            switch(r9) {
                case 8: goto L_0x0235;
                case 9: goto L_0x0235;
                case 10: goto L_0x0235;
                case 11: goto L_0x0235;
                case 12: goto L_0x0235;
                case 13: goto L_0x0235;
                case 14: goto L_0x0235;
                default: goto L_0x022c;
            }
        L_0x022c:
            com.qg.easyfloat.d.a r9 = r7.f113b
            com.qg.easyfloat.f.d r9 = r9.mo11420b()
            if (r9 != 0) goto L_0x0239
            goto L_0x023c
        L_0x0235:
            r7.m96a(r8, r11, r10)
            goto L_0x026b
        L_0x0239:
            r9.mo11472b(r8)
        L_0x023c:
            com.qg.easyfloat.d.a r9 = r7.f113b
            com.qg.easyfloat.f.a r9 = r9.mo11432h()
            if (r9 != 0) goto L_0x0245
            goto L_0x026b
        L_0x0245:
            com.qg.easyfloat.f.a$a r9 = r9.mo11453a()
            if (r9 != 0) goto L_0x024c
            goto L_0x026b
        L_0x024c:
            kotlin.jvm.functions.Function1 r9 = r9.mo11463d()
            if (r9 != 0) goto L_0x0253
            goto L_0x026b
        L_0x0253:
            r9.invoke(r8)
            goto L_0x026b
        L_0x0257:
            com.qg.easyfloat.d.a r10 = r7.f113b
            r10.mo11421b(r1)
            float r10 = r9.getRawX()
            r7.f121j = r10
            float r9 = r9.getRawY()
            r7.f122k = r9
            r7.m95a((android.view.View) r8, (android.view.WindowManager.LayoutParams) r11)
        L_0x026b:
            return
        L_0x026c:
            com.qg.easyfloat.d.a r8 = r7.f113b
            r8.mo11421b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p012c.C0920c.mo11403a(android.view.View, android.view.MotionEvent, android.view.WindowManager, android.view.WindowManager$LayoutParams):void");
    }

    /* renamed from: a */
    private final void m95a(View view, WindowManager.LayoutParams layoutParams) {
        int i;
        int i2;
        this.f116e = C0936b.f194a.mo11486e(this.f112a);
        this.f115d = this.f113b.mo11422c().mo11467a(this.f112a);
        view.getLocationOnScreen(this.f129r);
        this.f130s = this.f129r[1] > layoutParams.y ? m100b(view) : 0;
        this.f131t = (this.f115d - view.getHeight()) - this.f130s;
        this.f117f = Math.max(0, this.f113b.mo11443r());
        this.f119h = Math.min(this.f116e, this.f113b.mo11448v()) - view.getWidth();
        if (this.f113b.mo11449w() == C0924a.CURRENT_ACTIVITY) {
            i = this.f113b.mo11438m() ? this.f113b.mo11451y() : this.f113b.mo11451y() + m100b(view);
        } else {
            i = this.f113b.mo11438m() ? this.f113b.mo11451y() - m100b(view) : this.f113b.mo11451y();
        }
        this.f118g = i;
        if (this.f113b.mo11449w() == C0924a.CURRENT_ACTIVITY) {
            if (this.f113b.mo11438m()) {
                i2 = Math.min(this.f131t, this.f113b.mo11410a() - view.getHeight());
            } else {
                i2 = Math.min(this.f131t, (this.f113b.mo11410a() + m100b(view)) - view.getHeight());
            }
        } else if (this.f113b.mo11438m()) {
            i2 = Math.min(this.f131t, (this.f113b.mo11410a() - m100b(view)) - view.getHeight());
        } else {
            i2 = Math.min(this.f131t, this.f113b.mo11410a() - view.getHeight());
        }
        this.f120i = i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r3 = new int[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r4 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r5 = r11.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r5 = r11.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        r3[0] = r5;
        r3[1] = r0;
        r0 = android.animation.ValueAnimator.ofInt(r3);
        r0.addUpdateListener(new com.p010qg.easyfloat.p012c.$$Lambda$c$iY5teV8xL0FdRL9HtJAViZvcbuo(r4, r11, r12, r10, r0));
        r0.addListener(new com.p010qg.easyfloat.p012c.C0920c.C0922b(r9, r10));
        r0.setDuration(200);
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96a(android.view.View r10, android.view.WindowManager.LayoutParams r11, android.view.WindowManager r12) {
        /*
            r9 = this;
            r9.m97a((android.view.WindowManager.LayoutParams) r11)
            com.qg.easyfloat.d.a r0 = r9.f113b
            com.qg.easyfloat.e.b r0 = r0.mo11450x()
            int[] r1 = com.p010qg.easyfloat.p012c.C0920c.C0921a.f132a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 8: goto L_0x005a;
                case 9: goto L_0x0054;
                case 10: goto L_0x0050;
                case 11: goto L_0x004d;
                case 12: goto L_0x0041;
                case 13: goto L_0x0035;
                case 14: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            return
        L_0x0017:
            int r0 = r9.f127p
            int r3 = r9.f128q
            if (r0 >= r3) goto L_0x0029
            int r0 = r9.f123l
            int r3 = r9.f124m
            if (r0 >= r3) goto L_0x0026
            int r0 = r9.f117f
            goto L_0x005c
        L_0x0026:
            int r0 = r11.x
            goto L_0x0058
        L_0x0029:
            int r0 = r9.f125n
            int r3 = r9.f126o
            if (r0 >= r3) goto L_0x0032
            int r0 = r9.f118g
            goto L_0x0052
        L_0x0032:
            int r0 = r9.f120i
            goto L_0x0052
        L_0x0035:
            int r0 = r9.f125n
            int r3 = r9.f126o
            if (r0 >= r3) goto L_0x003e
            int r0 = r9.f118g
            goto L_0x0052
        L_0x003e:
            int r0 = r9.f120i
            goto L_0x0052
        L_0x0041:
            int r0 = r9.f123l
            int r3 = r9.f124m
            if (r0 >= r3) goto L_0x004a
            int r0 = r9.f117f
            goto L_0x005c
        L_0x004a:
            int r0 = r11.x
            goto L_0x0058
        L_0x004d:
            int r0 = r9.f120i
            goto L_0x0052
        L_0x0050:
            int r0 = r9.f118g
        L_0x0052:
            r4 = 0
            goto L_0x005d
        L_0x0054:
            int r0 = r11.x
            int r3 = r9.f124m
        L_0x0058:
            int r0 = r0 + r3
            goto L_0x005c
        L_0x005a:
            int r0 = r9.f117f
        L_0x005c:
            r4 = 1
        L_0x005d:
            r3 = 2
            int[] r3 = new int[r3]
            if (r4 == 0) goto L_0x0065
            int r5 = r11.x
            goto L_0x0067
        L_0x0065:
            int r5 = r11.y
        L_0x0067:
            r3[r1] = r5
            r3[r2] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r3)
            com.qg.easyfloat.c.-$$Lambda$c$iY5teV8xL0FdRL9HtJAViZvcbuo r1 = new com.qg.easyfloat.c.-$$Lambda$c$iY5teV8xL0FdRL9HtJAViZvcbuo
            r3 = r1
            r5 = r11
            r6 = r12
            r7 = r10
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.addUpdateListener(r1)
            com.qg.easyfloat.c.c$b r11 = new com.qg.easyfloat.c.c$b
            r11.<init>(r9, r10)
            r0.addListener(r11)
            r10 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r10)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p012c.C0920c.m96a(android.view.View, android.view.WindowManager$LayoutParams, android.view.WindowManager):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m99a(boolean z, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(layoutParams, "$params");
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (z) {
            try {
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.x = ((Integer) animatedValue).intValue();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (Exception unused) {
                valueAnimator.cancel();
                return;
            }
        } else {
            Object animatedValue2 = valueAnimator2.getAnimatedValue();
            if (animatedValue2 != null) {
                layoutParams.y = ((Integer) animatedValue2).intValue();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m94a(View view) {
        C0926a.C0927a a;
        Function1<View, Unit> d;
        this.f113b.mo11419a(false);
        C0930d b = this.f113b.mo11420b();
        if (b != null) {
            b.mo11472b(view);
        }
        C0926a h = this.f113b.mo11432h();
        if (h != null && (a = h.mo11453a()) != null && (d = a.mo11463d()) != null) {
            d.invoke(view);
        }
    }

    /* renamed from: a */
    private final void m97a(WindowManager.LayoutParams layoutParams) {
        int i = layoutParams.x;
        int i2 = i - this.f117f;
        this.f123l = i2;
        int i3 = this.f119h - i;
        this.f124m = i3;
        int i4 = layoutParams.y;
        this.f125n = i4 - this.f118g;
        this.f126o = this.f120i - i4;
        this.f127p = Math.min(i2, i3);
        this.f128q = Math.min(this.f125n, this.f126o);
    }
}
