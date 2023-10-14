package com.p010qg.eventbus;

import android.os.Looper;
import com.p010qg.eventbus.C0951g;
import com.p010qg.eventbus.C0954h;
import com.p010qg.eventbus.p019q.C0965a;
import com.p010qg.eventbus.p020r.C0967b;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.qg.eventbus.d */
public class C0948d {

    /* renamed from: m */
    private static final ExecutorService f239m = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f240a = true;

    /* renamed from: b */
    boolean f241b = true;

    /* renamed from: c */
    boolean f242c = true;

    /* renamed from: d */
    boolean f243d = true;

    /* renamed from: e */
    boolean f244e;

    /* renamed from: f */
    boolean f245f = true;

    /* renamed from: g */
    boolean f246g;

    /* renamed from: h */
    boolean f247h;

    /* renamed from: i */
    ExecutorService f248i = f239m;

    /* renamed from: j */
    List<C0967b> f249j;

    /* renamed from: k */
    C0951g f250k;

    /* renamed from: l */
    C0954h f251l;

    C0948d() {
    }

    /* renamed from: c */
    static Object m237c() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0951g mo11534a() {
        C0951g gVar = this.f250k;
        if (gVar != null) {
            return gVar;
        }
        return C0951g.C0952a.m243a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0954h mo11535b() {
        Object c;
        C0954h hVar = this.f251l;
        if (hVar != null) {
            return hVar;
        }
        if (!C0965a.m271a() || (c = m237c()) == null) {
            return null;
        }
        return new C0954h.C0955a((Looper) c);
    }
}
