package com.p010qg.eventbus;

/* renamed from: com.qg.eventbus.k */
final class C0958k {

    /* renamed from: a */
    private C0957j f261a;

    /* renamed from: b */
    private C0957j f262b;

    C0958k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo11543a(C0957j jVar) {
        if (jVar != null) {
            C0957j jVar2 = this.f262b;
            if (jVar2 != null) {
                jVar2.f260c = jVar;
                this.f262b = jVar;
            } else if (this.f261a == null) {
                this.f262b = jVar;
                this.f261a = jVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C0957j mo11541a() {
        C0957j jVar;
        jVar = this.f261a;
        if (jVar != null) {
            C0957j jVar2 = jVar.f260c;
            this.f261a = jVar2;
            if (jVar2 == null) {
                this.f262b = null;
            }
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C0957j mo11542a(int i) throws InterruptedException {
        if (this.f261a == null) {
            wait((long) i);
        }
        return mo11541a();
    }
}
