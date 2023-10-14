package com.p010qg.eventbus;

/* renamed from: com.qg.eventbus.p */
final class C0964p {

    /* renamed from: a */
    final Object f284a;

    /* renamed from: b */
    final C0961n f285b;

    /* renamed from: c */
    volatile boolean f286c = true;

    C0964p(Object obj, C0961n nVar) {
        this.f284a = obj;
        this.f285b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0964p)) {
            return false;
        }
        C0964p pVar = (C0964p) obj;
        if (this.f284a != pVar.f284a || !this.f285b.equals(pVar.f285b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f284a.hashCode() + this.f285b.f271f.hashCode();
    }
}
