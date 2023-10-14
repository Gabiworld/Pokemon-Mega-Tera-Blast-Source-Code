package com.p010qg.eventbus;

/* renamed from: com.qg.eventbus.a */
class C0942a implements Runnable, C0959l {

    /* renamed from: a */
    private final C0958k f206a = new C0958k();

    /* renamed from: b */
    private final C0944c f207b;

    C0942a(C0944c cVar) {
        this.f207b = cVar;
    }

    /* renamed from: a */
    public void mo11521a(C0964p pVar, Object obj) {
        this.f206a.mo11543a(C0957j.m251a(pVar, obj));
        this.f207b.mo11524a().execute(this);
    }

    public void run() {
        C0957j a = this.f206a.mo11541a();
        if (a != null) {
            this.f207b.mo11525a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
