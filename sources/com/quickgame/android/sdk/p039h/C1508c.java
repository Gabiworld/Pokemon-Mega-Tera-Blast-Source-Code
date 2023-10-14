package com.quickgame.android.sdk.p039h;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import com.easygametime.ezbkm.AppConstant;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p010qg.easyfloat.C0906a;
import com.p010qg.easyfloat.p014e.C0925b;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0932f;
import com.p010qg.easyfloat.p018h.C0936b;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.p043l.C1605h;
import com.quickgame.android.sdk.utils.log.QGLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u000e\u0010&\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\bH\u0002J\u000e\u0010)\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u000e\u0010*\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0006\u0010+\u001a\u00020 J\u001a\u0010,\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, mo13302d2 = {"Lcom/quickgame/android/sdk/manager/FloatManger;", "", "()V", "MAX_LEFT_PX_WIDTH", "", "MENU_DP_WIDTH", "", "TAG_HALF", "", "TAG_MENU", "TAG_WHOLE", "WHOLE_DP_WIDTH", "handler", "com/quickgame/android/sdk/manager/FloatManger$handler$1", "Lcom/quickgame/android/sdk/manager/FloatManger$handler$1;", "lastOffsetX", "lastOffsetY", "listener", "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", "menuListener", "Lcom/quickgame/android/sdk/manager/MenuClickListener;", "getMenuListener", "()Lcom/quickgame/android/sdk/manager/MenuClickListener;", "setMenuListener", "(Lcom/quickgame/android/sdk/manager/MenuClickListener;)V", "showStatus", "Lcom/quickgame/android/sdk/manager/STATUS;", "close", "", "createHalfView", "activity", "Landroid/app/Activity;", "createMenuView", "createWholeView", "init", "log", "string", "onPause", "onResume", "reset", "showWholeView", "hideTag", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.h.c */
public final class C1508c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C1543h f1423a = C1543h.NO_SHOWING;

    /* renamed from: b */
    private static View.OnClickListener f1424b;

    /* renamed from: c */
    private static C1533d f1425c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f1426d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f1427e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C1532g f1428f = new C1532g(Looper.getMainLooper());

    /* renamed from: g */
    public static final C1508c f1429g = new C1508c();

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo13302d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$a */
    static final class C1509a implements C0932f {

        /* renamed from: a */
        final /* synthetic */ Ref.BooleanRef f1430a;

        /* renamed from: com.quickgame.android.sdk.h.c$a$a */
        static final class C1510a implements View.OnClickListener {

            /* renamed from: a */
            public static final C1510a f1431a = new C1510a();

            C1510a() {
            }

            public final void onClick(View view) {
            }
        }

        C1509a(Ref.BooleanRef booleanRef) {
            this.f1430a = booleanRef;
        }

        /* renamed from: a */
        public final void mo11475a(View view) {
            ImageView imageView = (ImageView) view.findViewById(C1124R.C1126id.iv_icon);
            imageView.setOnClickListener(C1510a.f1431a);
            imageView.setImageResource(this.f1430a.element ? C1124R.C1125drawable.qg_float_main_icon_half_rs : C1124R.C1125drawable.qg_float_main_icon_half_ls);
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo13302d2 = {"<anonymous>", "", "Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;", "Lcom/qg/easyfloat/interfaces/FloatCallbacks;", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$b */
    static final class C1511b extends Lambda implements Function1<C0926a.C0927a, Unit> {

        /* renamed from: a */
        final /* synthetic */ Activity f1432a;

        /* renamed from: com.quickgame.android.sdk.h.c$b$a */
        static final class C1512a extends Lambda implements Function3<Boolean, String, View, Unit> {

            /* renamed from: a */
            public static final C1512a f1433a = new C1512a();

            C1512a() {
                super(3);
            }

            /* renamed from: a */
            public final void mo12797a(boolean z, String str, View view) {
                C1508c cVar = C1508c.f1429g;
                cVar.m1819a("half create result: " + z);
                if (z) {
                    C1508c.f1423a = C1543h.HALF_SHOWING;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo12797a(((Boolean) obj).booleanValue(), (String) obj2, (View) obj3);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$b$b */
        static final class C1513b extends Lambda implements Function1<View, Unit> {

            /* renamed from: a */
            public static final C1513b f1434a = new C1513b();

            C1513b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo12799a(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                C1508c.f1429g.m1819a("half show");
                C1508c.f1423a = C1543h.HALF_SHOWING;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12799a((View) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$b$c */
        static final class C1514c extends Lambda implements Function2<View, MotionEvent, Unit> {

            /* renamed from: a */
            final /* synthetic */ C1511b f1435a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1514c(C1511b bVar) {
                super(2);
                this.f1435a = bVar;
            }

            /* renamed from: a */
            public final void mo12800a(View view, MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
                if (motionEvent.getAction() == 0) {
                    C1508c.f1429g.m1813a(this.f1435a.f1432a, "2");
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo12800a((View) obj, (MotionEvent) obj2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1511b(Activity activity) {
            super(1);
            this.f1432a = activity;
        }

        /* renamed from: a */
        public final void mo12796a(C0926a.C0927a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$receiver");
            aVar.mo11459a((Function3<? super Boolean, ? super String, ? super View, Unit>) C1512a.f1433a);
            aVar.mo11461b(C1513b.f1434a);
            aVar.mo11458a((Function2<? super View, ? super MotionEvent, Unit>) new C1514c(this));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12796a((C0926a.C0927a) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo13302d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$c */
    static final class C1515c implements C0932f {

        /* renamed from: a */
        final /* synthetic */ Activity f1436a;

        /* renamed from: com.quickgame.android.sdk.h.c$c$a */
        static final class C1516a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C1515c f1437a;

            C1516a(C1515c cVar) {
                this.f1437a = cVar;
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1813a(this.f1437a.f1436a, "3");
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$c$b */
        static final class C1517b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f1438a;

            /* renamed from: b */
            final /* synthetic */ C1515c f1439b;

            C1517b(LinearLayout linearLayout, C1515c cVar) {
                this.f1438a = linearLayout;
                this.f1439b = cVar;
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1813a(this.f1439b.f1436a, "3");
                C1533d c = C1508c.f1429g.mo12791c();
                if (c != null) {
                    LinearLayout linearLayout = this.f1438a;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "this");
                    c.mo12017a(linearLayout, 1);
                }
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$c$c */
        static final class C1518c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f1440a;

            /* renamed from: b */
            final /* synthetic */ C1515c f1441b;

            C1518c(LinearLayout linearLayout, C1515c cVar) {
                this.f1440a = linearLayout;
                this.f1441b = cVar;
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1813a(this.f1441b.f1436a, "3");
                C1533d c = C1508c.f1429g.mo12791c();
                if (c != null) {
                    LinearLayout linearLayout = this.f1440a;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "this");
                    c.mo12017a(linearLayout, 2);
                }
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$c$d */
        static final class C1519d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f1442a;

            /* renamed from: b */
            final /* synthetic */ C1515c f1443b;

            C1519d(LinearLayout linearLayout, C1515c cVar) {
                this.f1442a = linearLayout;
                this.f1443b = cVar;
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1813a(this.f1443b.f1436a, "3");
                C1533d c = C1508c.f1429g.mo12791c();
                if (c != null) {
                    LinearLayout linearLayout = this.f1442a;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "this");
                    c.mo12017a(linearLayout, 3);
                }
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$c$e */
        static final class C1520e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f1444a;

            /* renamed from: b */
            final /* synthetic */ C1515c f1445b;

            C1520e(LinearLayout linearLayout, C1515c cVar) {
                this.f1444a = linearLayout;
                this.f1445b = cVar;
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1813a(this.f1445b.f1436a, "3");
                C1533d c = C1508c.f1429g.mo12791c();
                if (c != null) {
                    LinearLayout linearLayout = this.f1444a;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "this");
                    c.mo12017a(linearLayout, 4);
                }
            }
        }

        C1515c(Activity activity) {
            this.f1436a = activity;
        }

        /* renamed from: a */
        public final void mo11475a(View view) {
            ((ImageView) view.findViewById(C1124R.C1126id.icon)).setOnClickListener(new C1516a(this));
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C1124R.C1126id.ll_menu1);
            linearLayout.setOnClickListener(new C1517b(linearLayout, this));
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C1124R.C1126id.ll_menu2);
            linearLayout2.setOnClickListener(new C1518c(linearLayout2, this));
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C1124R.C1126id.ll_menu3);
            linearLayout3.setOnClickListener(new C1519d(linearLayout3, this));
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(C1124R.C1126id.ll_menu4);
            linearLayout4.setOnClickListener(new C1520e(linearLayout4, this));
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo13302d2 = {"<anonymous>", "", "Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;", "Lcom/qg/easyfloat/interfaces/FloatCallbacks;", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$d */
    static final class C1521d extends Lambda implements Function1<C0926a.C0927a, Unit> {

        /* renamed from: a */
        public static final C1521d f1446a = new C1521d();

        /* renamed from: com.quickgame.android.sdk.h.c$d$a */
        static final class C1522a extends Lambda implements Function3<Boolean, String, View, Unit> {

            /* renamed from: a */
            public static final C1522a f1447a = new C1522a();

            C1522a() {
                super(3);
            }

            /* renamed from: a */
            public final void mo12807a(boolean z, String str, View view) {
                C1508c cVar = C1508c.f1429g;
                cVar.m1819a("menu create result: " + z);
                if (z) {
                    C1508c.f1423a = C1543h.MENU_SHOWING;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo12807a(((Boolean) obj).booleanValue(), (String) obj2, (View) obj3);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$d$b */
        static final class C1523b extends Lambda implements Function1<View, Unit> {

            /* renamed from: a */
            public static final C1523b f1448a = new C1523b();

            C1523b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo12808a(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                C1508c.f1429g.m1819a("menu show");
                C1508c.f1423a = C1543h.MENU_SHOWING;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12808a((View) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$d$c */
        static final class C1524c extends Lambda implements Function2<View, MotionEvent, Unit> {

            /* renamed from: a */
            public static final C1524c f1449a = new C1524c();

            C1524c() {
                super(2);
            }

            /* renamed from: a */
            public final void mo12809a(View view, MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo12809a((View) obj, (MotionEvent) obj2);
                return Unit.INSTANCE;
            }
        }

        C1521d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12806a(C0926a.C0927a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$receiver");
            aVar.mo11459a((Function3<? super Boolean, ? super String, ? super View, Unit>) C1522a.f1447a);
            aVar.mo11461b(C1523b.f1448a);
            aVar.mo11458a((Function2<? super View, ? super MotionEvent, Unit>) C1524c.f1449a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12806a((C0926a.C0927a) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo13302d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$e */
    static final class C1525e implements C0932f {

        /* renamed from: a */
        public static final C1525e f1450a = new C1525e();

        /* renamed from: com.quickgame.android.sdk.h.c$e$a */
        static final class C1526a implements View.OnClickListener {

            /* renamed from: a */
            public static final C1526a f1451a = new C1526a();

            C1526a() {
            }

            public final void onClick(View view) {
                C1508c.f1429g.m1819a("onClick");
                if (!C1541g.m1887a().f1481d) {
                    View.OnClickListener b = C1508c.f1429g.mo12789b();
                    if (b != null) {
                        b.onClick(view);
                        return;
                    }
                    return;
                }
                C1128a r = C1128a.m798r();
                Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                Activity b2 = r.mo11968b();
                if (b2 != null) {
                    C1508c.f1429g.m1823f(b2);
                }
                C0906a.f85a.mo11365a("1", true);
            }
        }

        C1525e() {
        }

        /* renamed from: a */
        public final void mo11475a(View view) {
            ((ImageView) view.findViewById(C1124R.C1126id.iv_icon)).setOnClickListener(C1526a.f1451a);
        }
    }

    @Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo13302d2 = {"<anonymous>", "", "Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;", "Lcom/qg/easyfloat/interfaces/FloatCallbacks;", "invoke"}, mo13303k = 3, mo13304mv = {1, 4, 0})
    /* renamed from: com.quickgame.android.sdk.h.c$f */
    static final class C1527f extends Lambda implements Function1<C0926a.C0927a, Unit> {

        /* renamed from: a */
        public static final C1527f f1452a = new C1527f();

        /* renamed from: com.quickgame.android.sdk.h.c$f$a */
        static final class C1528a extends Lambda implements Function3<Boolean, String, View, Unit> {

            /* renamed from: a */
            public static final C1528a f1453a = new C1528a();

            C1528a() {
                super(3);
            }

            /* renamed from: a */
            public final void mo12812a(boolean z, String str, View view) {
                C1508c cVar = C1508c.f1429g;
                cVar.m1819a("whole create result: " + z);
                if (z) {
                    C1508c.f1423a = C1543h.WHOLE_SHOWING;
                    C1508c.f1428f.sendEmptyMessageDelayed(1, 3000);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo12812a(((Boolean) obj).booleanValue(), (String) obj2, (View) obj3);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$f$b */
        static final class C1529b extends Lambda implements Function1<View, Unit> {

            /* renamed from: a */
            public static final C1529b f1454a = new C1529b();

            C1529b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo12813a(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                C1508c.f1429g.m1819a("whole show");
                C1508c.f1423a = C1543h.WHOLE_SHOWING;
                C1508c.f1428f.removeMessages(1);
                C1508c.f1428f.sendEmptyMessageDelayed(1, 3000);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12813a((View) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$f$c */
        static final class C1530c extends Lambda implements Function2<View, MotionEvent, Unit> {

            /* renamed from: a */
            public static final C1530c f1455a = new C1530c();

            C1530c() {
                super(2);
            }

            /* renamed from: a */
            public final void mo12814a(View view, MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
                Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
                if (motionEvent.getAction() == 0) {
                    C1508c.f1429g.m1819a("touch ACTION_DOWN");
                    C1508c.f1428f.removeMessages(1);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo12814a((View) obj, (MotionEvent) obj2);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.quickgame.android.sdk.h.c$f$d */
        static final class C1531d extends Lambda implements Function1<View, Unit> {

            /* renamed from: a */
            public static final C1531d f1456a = new C1531d();

            C1531d() {
                super(1);
            }

            /* renamed from: a */
            public final void mo12815a(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                C1508c.f1429g.m1819a("dragEnd");
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                C1508c.f1426d = iArr[0];
                C1508c.f1427e = iArr[1];
                C1508c.f1428f.removeMessages(1);
                C1508c.f1428f.sendEmptyMessageDelayed(1, 3000);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12815a((View) obj);
                return Unit.INSTANCE;
            }
        }

        C1527f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12811a(C0926a.C0927a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$receiver");
            aVar.mo11459a((Function3<? super Boolean, ? super String, ? super View, Unit>) C1528a.f1453a);
            aVar.mo11461b(C1529b.f1454a);
            aVar.mo11458a((Function2<? super View, ? super MotionEvent, Unit>) C1530c.f1455a);
            aVar.mo11457a((Function1<? super View, Unit>) C1531d.f1456a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12811a((C0926a.C0927a) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.quickgame.android.sdk.h.c$g */
    public static final class C1532g extends Handler {
        C1532g(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Intrinsics.checkNotNullParameter(message, "msg");
            super.handleMessage(message);
            if (message.what == 1) {
                removeMessages(1);
                C1128a r = C1128a.m798r();
                Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
                Activity b = r.mo11968b();
                if (b != null) {
                    C1508c.f1429g.m1822e(b);
                }
                C0906a.f85a.mo11365a("1", true);
            }
        }
    }

    private C1508c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m1822e(Activity activity) {
        m1819a("createHalfView " + f1426d + ' ' + f1427e);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        if (f1426d > 500) {
            booleanRef.element = true;
        }
        C0906a.f85a.mo11363a((Context) activity).mo11357a(C0925b.RESULT_HORIZONTAL).mo11362b(true).mo11355a(GravityCompat.START, booleanRef.element ? C0936b.f194a.mo11486e(activity) - (C1605h.m2086a(activity, 55.0f) / 2) : f1426d, f1427e).mo11356a(C1124R.layout.qg_layout_hide_float, new C1509a(booleanRef)).mo11360a(false).mo11358a("2").mo11359a((Function1<? super C0926a.C0927a, Unit>) new C1511b(activity)).mo11361a();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m1823f(Activity activity) {
        int i;
        m1819a("createMenuView " + f1426d + ' ' + f1427e);
        boolean z = f1426d > 500;
        C0906a.C0907a a = C0906a.f85a.mo11363a((Context) activity).mo11357a(C0925b.RESULT_HORIZONTAL).mo11362b(true).mo11355a(GravityCompat.START, z ? C0936b.f194a.mo11486e(activity) - C1605h.m2086a(activity, 315.0f) : f1426d, f1427e);
        if (z) {
            i = C1124R.layout.qg_layout_menu_float_right;
        } else {
            i = C1124R.layout.qg_layout_menu_float_left;
        }
        a.mo11356a(i, new C1515c(activity)).mo11360a(false).mo11358a("3").mo11359a((Function1<? super C0926a.C0927a, Unit>) C1521d.f1446a).mo11361a();
    }

    /* renamed from: c */
    public final C1533d mo12791c() {
        return f1425c;
    }

    /* renamed from: d */
    public final void mo12793d() {
        m1819a("reset");
        mo12785a();
        f1426d = 0;
        C0936b bVar = C0936b.f194a;
        C1128a r = C1128a.m798r();
        Intrinsics.checkNotNullExpressionValue(r, "SDKImpl.getInstance()");
        Activity b = r.mo11968b();
        Intrinsics.checkNotNullExpressionValue(b, "SDKImpl.getInstance().activity");
        f1427e = bVar.mo11484c(b) / 3;
    }

    /* renamed from: c */
    public final void mo12792c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        m1819a("onPause " + f1423a);
        f1428f.removeMessages(1);
        if (C1507b.f1421a[f1423a.ordinal()] == 1) {
            m1813a(activity, "3");
        }
    }

    /* renamed from: b */
    public final View.OnClickListener mo12789b() {
        return f1424b;
    }

    /* renamed from: b */
    public final void mo12790b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f1427e = C0936b.f194a.mo11484c(activity) / 3;
    }

    /* renamed from: d */
    public final void mo12794d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        m1819a("onResume " + f1423a);
        if (C1507b.f1422b[f1423a.ordinal()] == 1) {
            C1532g gVar = f1428f;
            gVar.removeMessages(1);
            gVar.sendEmptyMessageDelayed(1, 3000);
        }
    }

    /* renamed from: a */
    public final void mo12787a(View.OnClickListener onClickListener) {
        f1424b = onClickListener;
    }

    /* renamed from: a */
    public final void mo12788a(C1533d dVar) {
        f1425c = dVar;
    }

    /* renamed from: a */
    public final void mo12786a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        m1819a("createWholeView " + f1426d + ' ' + f1427e);
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (l.mo12847i() == null || f1423a != C1543h.NO_SHOWING) {
            m1819a("createWholeView return");
        } else {
            C0906a.f85a.mo11363a((Context) activity).mo11357a(C0925b.RESULT_HORIZONTAL).mo11362b(true).mo11355a(GravityCompat.START, f1426d, f1427e).mo11356a(C1124R.layout.qg_layout_floating_view, C1525e.f1450a).mo11358a("1").mo11359a((Function1<? super C0926a.C0927a, Unit>) C1527f.f1452a).mo11361a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1813a(Activity activity, String str) {
        C0906a.f85a.mo11364a(str);
        C0906a.f85a.mo11365a(str, true);
        f1423a = C1543h.NO_SHOWING;
        mo12786a(activity);
    }

    /* renamed from: a */
    public final void mo12785a() {
        m1819a(AppConstant.SDK_LOGOUT);
        f1428f.removeMessages(1);
        C0906a.f85a.mo11364a("1");
        C0906a.f85a.mo11365a("1", true);
        C0906a.f85a.mo11365a("2", true);
        C0906a.f85a.mo11365a("3", true);
        f1423a = C1543h.NO_SHOWING;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1819a(String str) {
        if (QGLog.getDebugMod()) {
            Log.d("QGFloatManager", str);
        }
    }
}
