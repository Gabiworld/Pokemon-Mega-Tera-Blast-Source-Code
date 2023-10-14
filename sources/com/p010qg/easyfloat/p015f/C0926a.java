package com.p010qg.easyfloat.p015f;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J#\u0010\t\u001a\u00020\n2\u001b\u0010\u0003\u001a\u0017\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020\n0\u000b¢\u0006\u0002\b\fR\u001e\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo13302d2 = {"Lcom/qg/easyfloat/interfaces/FloatCallbacks;", "", "()V", "builder", "Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;", "getBuilder", "()Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;", "setBuilder", "(Lcom/qg/easyfloat/interfaces/FloatCallbacks$Builder;)V", "registerListener", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Builder", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.f.a */
public final class C0926a {

    /* renamed from: a */
    public C0927a f185a;

    /* renamed from: com.qg.easyfloat.f.a$a */
    public final class C0927a {

        /* renamed from: a */
        private Function3<? super Boolean, ? super String, ? super View, Unit> f186a;

        /* renamed from: b */
        private Function1<? super View, Unit> f187b;

        /* renamed from: c */
        private Function1<? super View, Unit> f188c;

        /* renamed from: d */
        private Function0<Unit> f189d;

        /* renamed from: e */
        private Function2<? super View, ? super MotionEvent, Unit> f190e;

        /* renamed from: f */
        private Function2<? super View, ? super MotionEvent, Unit> f191f;

        /* renamed from: g */
        private Function1<? super View, Unit> f192g;

        public C0927a(C0926a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "this$0");
        }

        /* renamed from: a */
        public final Function3<Boolean, String, View, Unit> mo11456a() {
            return this.f186a;
        }

        /* renamed from: b */
        public final Function0<Unit> mo11460b() {
            return this.f189d;
        }

        /* renamed from: c */
        public final Function2<View, MotionEvent, Unit> mo11462c() {
            return this.f191f;
        }

        /* renamed from: d */
        public final Function1<View, Unit> mo11463d() {
            return this.f192g;
        }

        /* renamed from: e */
        public final Function1<View, Unit> mo11464e() {
            return this.f188c;
        }

        /* renamed from: f */
        public final Function1<View, Unit> mo11465f() {
            return this.f187b;
        }

        /* renamed from: g */
        public final Function2<View, MotionEvent, Unit> mo11466g() {
            return this.f190e;
        }

        /* renamed from: a */
        public final void mo11459a(Function3<? super Boolean, ? super String, ? super View, Unit> function3) {
            Intrinsics.checkNotNullParameter(function3, "action");
            this.f186a = function3;
        }

        /* renamed from: b */
        public final void mo11461b(Function1<? super View, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "action");
            this.f187b = function1;
        }

        /* renamed from: a */
        public final void mo11458a(Function2<? super View, ? super MotionEvent, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "action");
            this.f190e = function2;
        }

        /* renamed from: a */
        public final void mo11457a(Function1<? super View, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "action");
            this.f192g = function1;
        }
    }

    /* renamed from: a */
    public final C0927a mo11453a() {
        C0927a aVar = this.f185a;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("builder");
        return null;
    }

    /* renamed from: a */
    public final void mo11454a(C0927a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f185a = aVar;
    }

    /* renamed from: a */
    public final void mo11455a(Function1<? super C0927a, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "builder");
        C0927a aVar = new C0927a(this);
        function1.invoke(aVar);
        mo11454a(aVar);
    }
}
