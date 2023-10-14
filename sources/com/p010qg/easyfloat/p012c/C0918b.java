package com.p010qg.easyfloat.p012c;

import android.content.Context;
import android.view.View;
import com.p010qg.easyfloat.p012c.C0912a;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p015f.C0926a;
import com.p010qg.easyfloat.p015f.C0930d;
import com.p010qg.easyfloat.p018h.C0940e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rJ#\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J+\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001e"}, mo13302d2 = {"Lcom/qg/easyfloat/core/FloatingWindowManager;", "", "()V", "DEFAULT_TAG", "", "windowMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qg/easyfloat/core/FloatingWindowHelper;", "getWindowMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "checkTag", "", "config", "Lcom/qg/easyfloat/data/FloatConfig;", "create", "", "context", "Landroid/content/Context;", "dismiss", "tag", "force", "(Ljava/lang/String;Z)Lkotlin/Unit;", "getHelper", "getTag", "remove", "floatTag", "visible", "isShow", "needShow", "(ZLjava/lang/String;Z)Lkotlin/Unit;", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.c.b */
public final class C0918b {

    /* renamed from: a */
    public static final C0918b f108a = new C0918b();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, C0912a> f109b = new ConcurrentHashMap<>();

    /* renamed from: com.qg.easyfloat.c.b$a */
    public static final class C0919a implements C0912a.C0913a {

        /* renamed from: a */
        final /* synthetic */ C0923a f110a;

        /* renamed from: b */
        final /* synthetic */ C0912a f111b;

        C0919a(C0923a aVar, C0912a aVar2) {
            this.f110a = aVar;
            this.f111b = aVar2;
        }

        /* renamed from: a */
        public void mo11385a(boolean z) {
            if (z) {
                ConcurrentHashMap<String, C0912a> a = C0918b.f108a.mo11397a();
                String i = this.f110a.mo11434i();
                Intrinsics.checkNotNull(i);
                a.put(i, this.f111b);
            }
        }
    }

    private C0918b() {
    }

    /* renamed from: c */
    private final String m86c(String str) {
        return str == null ? "default" : str;
    }

    /* renamed from: a */
    public final ConcurrentHashMap<String, C0912a> mo11397a() {
        return f109b;
    }

    /* renamed from: b */
    public final C0912a mo11401b(String str) {
        return f109b.remove(m86c(str));
    }

    /* renamed from: a */
    public final void mo11400a(Context context, C0923a aVar) {
        C0926a.C0927a a;
        Function3<Boolean, String, View, Unit> a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "config");
        if (!m85a(aVar)) {
            C0912a aVar2 = new C0912a(context, aVar);
            aVar2.mo11378a((C0912a.C0913a) new C0919a(aVar, aVar2));
            return;
        }
        C0930d b = aVar.mo11420b();
        if (b != null) {
            b.mo11471a(false, "Tag exception. You need to set different EasyFloat tag.", (View) null);
        }
        C0926a h = aVar.mo11432h();
        if (!(h == null || (a = h.mo11453a()) == null || (a2 = a.mo11456a()) == null)) {
            a2.invoke(false, "Tag exception. You need to set different EasyFloat tag.", null);
        }
        C0940e.f199a.mo11506c("Tag exception. You need to set different EasyFloat tag.");
    }

    /* renamed from: a */
    public final Unit mo11398a(String str, boolean z) {
        C0912a a = mo11396a(str);
        if (a == null) {
            return null;
        }
        if (z) {
            a.mo11379a(z);
        } else {
            a.mo11374a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r3 = r3.mo11380b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ kotlin.Unit m84a(com.p010qg.easyfloat.p012c.C0918b r0, boolean r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0020
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.qg.easyfloat.c.a> r3 = f109b
            java.lang.Object r3 = r3.get(r2)
            com.qg.easyfloat.c.a r3 = (com.p010qg.easyfloat.p012c.C0912a) r3
            if (r3 != 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            com.qg.easyfloat.d.a r3 = r3.mo11380b()
            if (r3 != 0) goto L_0x001c
        L_0x001a:
            r3 = 1
            goto L_0x0020
        L_0x001c:
            boolean r3 = r3.mo11445t()
        L_0x0020:
            kotlin.Unit r0 = r0.mo11399a(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p012c.C0918b.m84a(com.qg.easyfloat.c.b, boolean, java.lang.String, boolean, int, java.lang.Object):kotlin.Unit");
    }

    /* renamed from: a */
    public final Unit mo11399a(boolean z, String str, boolean z2) {
        C0912a a = mo11396a(str);
        if (a == null) {
            return null;
        }
        a.mo11375a(z ? 0 : 8, z2);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    private final boolean m85a(C0923a aVar) {
        aVar.mo11417a(m86c(aVar.mo11434i()));
        ConcurrentHashMap<String, C0912a> concurrentHashMap = f109b;
        String i = aVar.mo11434i();
        Intrinsics.checkNotNull(i);
        return concurrentHashMap.containsKey(i);
    }

    /* renamed from: a */
    public final C0912a mo11396a(String str) {
        return f109b.get(m86c(str));
    }
}
