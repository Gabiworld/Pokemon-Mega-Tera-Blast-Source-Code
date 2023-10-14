package com.p010qg.easyfloat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p010qg.easyfloat.p012c.C0918b;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p014e.C0924a;
import com.p010qg.easyfloat.p014e.C0925b;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0928b;
import com.p010qg.easyfloat.p015f.C0929c;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p015f.C0932f;
import com.p010qg.easyfloat.p018h.C0938d;
import com.p010qg.easyfloat.p018h.C0940e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo13302d2 = {"Lcom/qg/easyfloat/EasyFloat;", "", "()V", "Builder", "Companion", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.a */
public final class C0906a {

    /* renamed from: a */
    public static final C0908b f85a = new C0908b((DefaultConstructorMarker) null);

    /* renamed from: com.qg.easyfloat.a$a */
    public static final class C0907a {

        /* renamed from: a */
        private final Context f86a;

        /* renamed from: b */
        private final C0923a f87b = new C0923a((Integer) null, (View) null, (String) null, false, false, false, false, false, false, (C0925b) null, (C0924a) null, false, false, 0, (Pair) null, (Pair) null, 0, 0, 0, 0, (C0932f) null, (C0930d) null, (C0926a) null, (C0929c) null, (C0928b) null, (Set) null, false, false, 0, 536870911, (DefaultConstructorMarker) null);

        public C0907a(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "activity");
            this.f86a = context2;
        }

        /* renamed from: a */
        public final C0907a mo11357a(C0925b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "sidePattern");
            this.f87b.mo11413a(bVar);
            return this;
        }

        /* renamed from: b */
        public final C0907a mo11362b(boolean z) {
            this.f87b.mo11424d(z);
            return this;
        }

        /* renamed from: b */
        private final void m28b() {
            C0918b.f108a.mo11400a(this.f86a, this.f87b);
        }

        /* renamed from: a */
        public final C0907a mo11356a(int i, C0932f fVar) {
            this.f87b.mo11416a(Integer.valueOf(i));
            this.f87b.mo11415a(fVar);
            return this;
        }

        /* renamed from: b */
        private final void m29b(String str) {
            C0926a.C0927a a;
            Function3<Boolean, String, View, Unit> a2;
            C0930d b = this.f87b.mo11420b();
            if (b != null) {
                b.mo11471a(false, str, (View) null);
            }
            C0926a h = this.f87b.mo11432h();
            if (!(h == null || (a = h.mo11453a()) == null || (a2 = a.mo11456a()) == null)) {
                a2.invoke(false, str, null);
            }
            C0940e.f199a.mo11506c(str);
            int hashCode = str.hashCode();
            if (hashCode != 324317221) {
                if (hashCode != 832581388) {
                    if (hashCode != 952571600 || !str.equals("Uninitialized exception. You need to initialize in the application.")) {
                        return;
                    }
                } else if (!str.equals("No layout exception. You need to set up the layout file.")) {
                    return;
                }
            } else if (!str.equals("Context exception. Activity float need to pass in a activity context.")) {
                return;
            }
            throw new Exception(str);
        }

        /* renamed from: a */
        public final C0907a mo11355a(int i, int i2, int i3) {
            this.f87b.mo11411a(i);
            this.f87b.mo11418a((Pair<Integer, Integer>) new Pair(Integer.valueOf(i2), Integer.valueOf(i3)));
            return this;
        }

        /* renamed from: a */
        public final C0907a mo11358a(String str) {
            this.f87b.mo11417a(str);
            return this;
        }

        /* renamed from: a */
        public final C0907a mo11360a(boolean z) {
            this.f87b.mo11423c(z);
            return this;
        }

        /* renamed from: a */
        public final C0907a mo11359a(Function1<? super C0926a.C0927a, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "builder");
            C0923a aVar = this.f87b;
            C0926a aVar2 = new C0926a();
            aVar2.mo11455a(function1);
            Unit unit = Unit.INSTANCE;
            aVar.mo11414a(aVar2);
            return this;
        }

        /* renamed from: a */
        public final void mo11361a() {
            if (this.f87b.mo11441p() == null && this.f87b.mo11442q() == null) {
                m29b("No layout exception. You need to set up the layout file.");
            } else if (this.f87b.mo11449w() == C0924a.CURRENT_ACTIVITY) {
                m28b();
            } else {
                m28b();
            }
        }
    }

    /* renamed from: com.qg.easyfloat.a$b */
    public static final class C0908b {
        private C0908b() {
        }

        public /* synthetic */ C0908b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0907a mo11363a(Context context) {
            Intrinsics.checkNotNullParameter(context, "activity");
            if (context instanceof Activity) {
                return new C0907a(context);
            }
            Activity a = C0938d.f196a.mo11491a();
            if (a != null) {
                context = a;
            }
            return new C0907a(context);
        }

        @JvmStatic
        /* renamed from: a */
        public final Unit mo11365a(String str, boolean z) {
            return C0918b.f108a.mo11398a(str, z);
        }

        @JvmStatic
        /* renamed from: a */
        public final Unit mo11364a(String str) {
            return C0918b.f108a.mo11399a(false, str, false);
        }
    }
}
