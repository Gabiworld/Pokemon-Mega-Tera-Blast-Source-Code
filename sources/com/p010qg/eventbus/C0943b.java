package com.p010qg.eventbus;

import java.util.logging.Level;

/* renamed from: com.qg.eventbus.b */
final class C0943b implements Runnable, C0959l {

    /* renamed from: a */
    private final C0958k f208a = new C0958k();

    /* renamed from: b */
    private final C0944c f209b;

    /* renamed from: c */
    private volatile boolean f210c;

    C0943b(C0944c cVar) {
        this.f209b = cVar;
    }

    /* renamed from: a */
    public void mo11521a(C0964p pVar, Object obj) {
        C0957j a = C0957j.m251a(pVar, obj);
        synchronized (this) {
            this.f208a.mo11543a(a);
            if (!this.f210c) {
                this.f210c = true;
                this.f209b.mo11524a().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C0957j a = this.f208a.mo11542a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.f208a.mo11541a();
                        if (a == null) {
                            this.f210c = false;
                            this.f210c = false;
                            return;
                        }
                    }
                }
                this.f209b.mo11525a(a);
            } catch (InterruptedException e) {
                try {
                    C0951g b = this.f209b.mo11528b();
                    Level level = Level.WARNING;
                    b.mo11538a(level, Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.f210c = false;
                }
            }
        }
    }
}
