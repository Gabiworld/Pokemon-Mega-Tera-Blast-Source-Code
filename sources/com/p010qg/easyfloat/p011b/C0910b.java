package com.p010qg.easyfloat.p011b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.p010qg.easyfloat.p014e.C0925b;
import com.p010qg.easyfloat.p015f.C0929c;
import com.p010qg.easyfloat.p018h.C0936b;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J:\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0015"}, mo13302d2 = {"Lcom/qg/easyfloat/anim/DefaultAnimator;", "Lcom/qg/easyfloat/interfaces/OnFloatAnimator;", "()V", "enterAnim", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "params", "Landroid/view/WindowManager$LayoutParams;", "windowManager", "Landroid/view/WindowManager;", "sidePattern", "Lcom/qg/easyfloat/enums/SidePattern;", "exitAnim", "getAnimator", "isExit", "", "getCompensationHeight", "", "initValue", "Lkotlin/Triple;", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.b.b */
public class C0910b implements C0929c {

    /* renamed from: com.qg.easyfloat.b.b$a */
    public /* synthetic */ class C0911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f92a;

        static {
            int[] iArr = new int[C0925b.values().length];
            iArr[C0925b.LEFT.ordinal()] = 1;
            iArr[C0925b.RESULT_LEFT.ordinal()] = 2;
            iArr[C0925b.RIGHT.ordinal()] = 3;
            iArr[C0925b.RESULT_RIGHT.ordinal()] = 4;
            iArr[C0925b.TOP.ordinal()] = 5;
            iArr[C0925b.RESULT_TOP.ordinal()] = 6;
            iArr[C0925b.BOTTOM.ordinal()] = 7;
            iArr[C0925b.RESULT_BOTTOM.ordinal()] = 8;
            iArr[C0925b.DEFAULT.ordinal()] = 9;
            iArr[C0925b.AUTO_HORIZONTAL.ordinal()] = 10;
            iArr[C0925b.RESULT_HORIZONTAL.ordinal()] = 11;
            iArr[C0925b.AUTO_VERTICAL.ordinal()] = 12;
            iArr[C0925b.RESULT_VERTICAL.ordinal()] = 13;
            f92a = iArr;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r9 = -r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r9 = r9 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r9 = -r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        return new kotlin.Triple<>(java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r11), java.lang.Boolean.valueOf(r6));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Boolean> m46c(android.view.View r9, android.view.WindowManager.LayoutParams r10, android.view.WindowManager r11, com.p010qg.easyfloat.p014e.C0925b r12) {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.Display r11 = r11.getDefaultDisplay()
            r11.getRectSize(r0)
            int r11 = r10.x
            int r1 = r0.right
            int r2 = r9.getRight()
            int r2 = r2 + r11
            int r1 = r1 - r2
            int r2 = r10.y
            int r3 = r0.bottom
            int r4 = r9.getBottom()
            int r4 = r4 + r2
            int r3 = r3 - r4
            int r4 = java.lang.Math.min(r11, r1)
            int r5 = java.lang.Math.min(r2, r3)
            int[] r6 = com.p010qg.easyfloat.p011b.C0910b.C0911a.f92a
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r6 = 0
            r7 = 1
            switch(r12) {
                case 1: goto L_0x0075;
                case 2: goto L_0x0075;
                case 3: goto L_0x0070;
                case 4: goto L_0x0070;
                case 5: goto L_0x0068;
                case 6: goto L_0x0068;
                case 7: goto L_0x005e;
                case 8: goto L_0x005e;
                case 9: goto L_0x0050;
                case 10: goto L_0x0050;
                case 11: goto L_0x0050;
                case 12: goto L_0x0040;
                case 13: goto L_0x0040;
                default: goto L_0x0035;
            }
        L_0x0035:
            if (r4 > r5) goto L_0x0081
            int r10 = r10.x
            if (r11 >= r1) goto L_0x007e
            int r9 = r9.getRight()
            goto L_0x0058
        L_0x0040:
            int r11 = r10.y
            if (r2 >= r3) goto L_0x0049
            int r9 = r9.getBottom()
            goto L_0x006e
        L_0x0049:
            int r12 = r0.bottom
            int r9 = r8.m43a(r9, r10)
            goto L_0x0066
        L_0x0050:
            int r10 = r10.x
            if (r11 >= r1) goto L_0x005a
            int r9 = r9.getRight()
        L_0x0058:
            int r9 = -r9
            goto L_0x005c
        L_0x005a:
            int r9 = r0.right
        L_0x005c:
            r11 = r10
            goto L_0x007c
        L_0x005e:
            int r11 = r10.y
            int r12 = r0.bottom
            int r9 = r8.m43a(r9, r10)
        L_0x0066:
            int r9 = r9 + r12
            goto L_0x0091
        L_0x0068:
            int r11 = r10.y
            int r9 = r9.getBottom()
        L_0x006e:
            int r9 = -r9
            goto L_0x0091
        L_0x0070:
            int r11 = r10.x
            int r9 = r0.right
            goto L_0x007c
        L_0x0075:
            int r11 = r10.x
            int r9 = r9.getRight()
            int r9 = -r9
        L_0x007c:
            r6 = 1
            goto L_0x0091
        L_0x007e:
            int r9 = r0.right
            goto L_0x005c
        L_0x0081:
            int r11 = r10.y
            if (r2 >= r3) goto L_0x008a
            int r9 = r9.getBottom()
            goto L_0x006e
        L_0x008a:
            int r12 = r0.bottom
            int r9 = r8.m43a(r9, r10)
            goto L_0x0066
        L_0x0091:
            kotlin.Triple r10 = new kotlin.Triple
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            r10.<init>(r9, r11, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p011b.C0910b.m46c(android.view.View, android.view.WindowManager$LayoutParams, android.view.WindowManager, com.qg.easyfloat.e.b):kotlin.Triple");
    }

    /* renamed from: a */
    public Animator mo11369a(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, C0925b bVar) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(bVar, "sidePattern");
        return m44a(view, layoutParams, windowManager, bVar, false);
    }

    /* renamed from: b */
    public Animator mo11370b(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, C0925b bVar) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(bVar, "sidePattern");
        return m44a(view, layoutParams, windowManager, bVar, true);
    }

    /* renamed from: a */
    private final Animator m44a(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, C0925b bVar, boolean z) {
        Triple c = m46c(view, layoutParams, windowManager, bVar);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((Number) (z ? c.getSecond() : c.getFirst())).intValue(), ((Number) (z ? c.getFirst() : c.getSecond())).intValue()});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams, windowManager, view, ofInt) {
            public final /* synthetic */ WindowManager.LayoutParams f$1;
            public final /* synthetic */ WindowManager f$2;
            public final /* synthetic */ View f$3;
            public final /* synthetic */ ValueAnimator f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0910b.m45a(Triple.this, this.f$1, this.f$2, this.f$3, this.f$4, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofInt, "ofInt(start, end).apply …}\n            }\n        }");
        return ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45a(Triple triple, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(triple, "$triple");
        Intrinsics.checkNotNullParameter(layoutParams, "$params");
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        Intrinsics.checkNotNullParameter(view, "$view");
        try {
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                if (((Boolean) triple.getThird()).booleanValue()) {
                    layoutParams.x = intValue;
                } else {
                    layoutParams.y = intValue;
                }
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    private final int m43a(View view, WindowManager.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == layoutParams.y) {
            return C0936b.f194a.mo11482a(view);
        }
        return 0;
    }
}
