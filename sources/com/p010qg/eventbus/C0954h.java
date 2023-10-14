package com.p010qg.eventbus;

import android.os.Looper;

/* renamed from: com.qg.eventbus.h */
public interface C0954h {

    /* renamed from: com.qg.eventbus.h$a */
    public static class C0955a implements C0954h {

        /* renamed from: a */
        private final Looper f256a;

        public C0955a(Looper looper) {
            this.f256a = looper;
        }

        /* renamed from: a */
        public boolean mo11540a() {
            return this.f256a == Looper.myLooper();
        }

        /* renamed from: a */
        public C0959l mo11539a(C0944c cVar) {
            return new C0950f(cVar, this.f256a, 10);
        }
    }

    /* renamed from: a */
    C0959l mo11539a(C0944c cVar);

    /* renamed from: a */
    boolean mo11540a();
}
