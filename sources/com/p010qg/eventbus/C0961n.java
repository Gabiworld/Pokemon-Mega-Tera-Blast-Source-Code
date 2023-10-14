package com.p010qg.eventbus;

import java.lang.reflect.Method;

/* renamed from: com.qg.eventbus.n */
public class C0961n {

    /* renamed from: a */
    final Method f266a;

    /* renamed from: b */
    final ThreadMode f267b;

    /* renamed from: c */
    final Class<?> f268c;

    /* renamed from: d */
    final int f269d;

    /* renamed from: e */
    final boolean f270e;

    /* renamed from: f */
    String f271f;

    public C0961n(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f266a = method;
        this.f267b = threadMode;
        this.f268c = cls;
        this.f269d = i;
        this.f270e = z;
    }

    /* renamed from: a */
    private synchronized void m257a() {
        if (this.f271f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f266a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f266a.getName());
            sb.append('(');
            sb.append(this.f268c.getName());
            this.f271f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0961n)) {
            return false;
        }
        m257a();
        C0961n nVar = (C0961n) obj;
        nVar.m257a();
        return this.f271f.equals(nVar.f271f);
    }

    public int hashCode() {
        return this.f266a.hashCode();
    }
}
