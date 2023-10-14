package com.p010qg.gson;

import com.p010qg.gson.internal.C1077k;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.qg.gson.i */
public abstract class C0988i {
    /* renamed from: a */
    public C0985f mo11593a() {
        if (mo11596d()) {
            return (C0985f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: b */
    public C1096l mo11594b() {
        if (mo11598f()) {
            return (C1096l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public C1098n mo11595c() {
        if (mo11599g()) {
            return (C1098n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: d */
    public boolean mo11596d() {
        return this instanceof C0985f;
    }

    /* renamed from: e */
    public boolean mo11597e() {
        return this instanceof C1095k;
    }

    /* renamed from: f */
    public boolean mo11598f() {
        return this instanceof C1096l;
    }

    /* renamed from: g */
    public boolean mo11599g() {
        return this instanceof C1098n;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C1121c cVar = new C1121c(stringWriter);
            cVar.mo11803b(true);
            C1077k.m662a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
