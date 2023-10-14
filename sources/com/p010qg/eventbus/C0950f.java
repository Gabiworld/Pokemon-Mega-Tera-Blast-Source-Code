package com.p010qg.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.qg.eventbus.f */
public class C0950f extends Handler implements C0959l {

    /* renamed from: a */
    private final C0958k f252a = new C0958k();

    /* renamed from: b */
    private final int f253b;

    /* renamed from: c */
    private final C0944c f254c;

    /* renamed from: d */
    private boolean f255d;

    protected C0950f(C0944c cVar, Looper looper, int i) {
        super(looper);
        this.f254c = cVar;
        this.f253b = i;
    }

    /* renamed from: a */
    public void mo11521a(C0964p pVar, Object obj) {
        C0957j a = C0957j.m251a(pVar, obj);
        synchronized (this) {
            this.f252a.mo11543a(a);
            if (!this.f255d) {
                this.f255d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C0949e("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C0957j a = this.f252a.mo11541a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f252a.mo11541a();
                        if (a == null) {
                            this.f255d = false;
                            this.f255d = false;
                            return;
                        }
                    }
                }
                this.f254c.mo11525a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f253b));
            if (sendMessage(obtainMessage())) {
                this.f255d = true;
                return;
            }
            throw new C0949e("Could not send handler message");
        } catch (Throwable th) {
            this.f255d = false;
            throw th;
        }
    }
}
