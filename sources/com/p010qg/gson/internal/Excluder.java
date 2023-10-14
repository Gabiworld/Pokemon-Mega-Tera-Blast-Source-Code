package com.p010qg.gson.internal;

import com.p010qg.gson.C0974a;
import com.p010qg.gson.C0975b;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.p023v.C1112a;
import com.p010qg.gson.p023v.C1115d;
import com.p010qg.gson.p023v.C1116e;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: com.qg.gson.internal.Excluder */
public final class Excluder implements C1111u, Cloneable {

    /* renamed from: g */
    public static final Excluder f312g = new Excluder();

    /* renamed from: a */
    private double f313a = -1.0d;

    /* renamed from: b */
    private int f314b = 136;

    /* renamed from: c */
    private boolean f315c = true;

    /* renamed from: d */
    private boolean f316d;

    /* renamed from: e */
    private List<C0974a> f317e = Collections.emptyList();

    /* renamed from: f */
    private List<C0974a> f318f = Collections.emptyList();

    /* renamed from: b */
    private boolean m356b(Class<?> cls, boolean z) {
        for (C0974a a : z ? this.f317e : this.f318f) {
            if (a.mo11585a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m357c(Class<?> cls) {
        return cls.isMemberClass() && !m358d(cls);
    }

    /* renamed from: d */
    private boolean m358d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
        Class<? super T> a = aVar.mo11792a();
        boolean a2 = m354a((Class<?>) a);
        final boolean z = a2 || m356b(a, true);
        final boolean z2 = a2 || m356b(a, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final C1117a<T> aVar2 = aVar;
        return new TypeAdapter<T>() {

            /* renamed from: a */
            private TypeAdapter<T> f319a;

            /* renamed from: b */
            private TypeAdapter<T> m362b() {
                TypeAdapter<T> typeAdapter = this.f319a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> a = gson2.mo11557a((C1111u) Excluder.this, aVar2);
                this.f319a = a;
                return a;
            }

            /* renamed from: a */
            public T mo11574a(C1118a aVar) throws IOException {
                if (!z2) {
                    return m362b().mo11574a(aVar);
                }
                aVar.mo11680r();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, T t) throws IOException {
                if (z) {
                    cVar.mo11698h();
                } else {
                    m362b().mo11576a(cVar, t);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private boolean m355b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !m358d(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    public boolean mo11603a(Field field, boolean z) {
        C1112a aVar;
        if ((this.f314b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f313a != -1.0d && !m352a((C1115d) field.getAnnotation(C1115d.class), (C1116e) field.getAnnotation(C1116e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f316d && ((aVar = (C1112a) field.getAnnotation(C1112a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f315c && m357c(field.getType())) || m355b(field.getType())) {
            return true;
        }
        List<C0974a> list = z ? this.f317e : this.f318f;
        if (list.isEmpty()) {
            return false;
        }
        C0975b bVar = new C0975b(field);
        for (C0974a a : list) {
            if (a.mo11584a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m354a(Class<?> cls) {
        if (this.f313a != -1.0d && !m352a((C1115d) cls.getAnnotation(C1115d.class), (C1116e) cls.getAnnotation(C1116e.class))) {
            return true;
        }
        if ((this.f315c || !m357c(cls)) && !m355b(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo11602a(Class<?> cls, boolean z) {
        return m354a(cls) || m356b(cls, z);
    }

    /* renamed from: a */
    private boolean m352a(C1115d dVar, C1116e eVar) {
        return m351a(dVar) && m353a(eVar);
    }

    /* renamed from: a */
    private boolean m351a(C1115d dVar) {
        return dVar == null || dVar.value() <= this.f313a;
    }

    /* renamed from: a */
    private boolean m353a(C1116e eVar) {
        return eVar == null || eVar.value() > this.f313a;
    }
}
