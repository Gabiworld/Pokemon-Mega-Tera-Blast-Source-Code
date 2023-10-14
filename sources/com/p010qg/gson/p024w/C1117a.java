package com.p010qg.gson.p024w;

import com.p010qg.gson.internal.C0990a;
import com.p010qg.gson.internal.C0991b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.qg.gson.w.a */
public class C1117a<T> {

    /* renamed from: a */
    final Class<? super T> f537a;

    /* renamed from: b */
    final Type f538b;

    /* renamed from: c */
    final int f539c;

    protected C1117a() {
        Type b = m719b(getClass());
        this.f538b = b;
        this.f537a = C0991b.m384e(b);
        this.f539c = b.hashCode();
    }

    /* renamed from: b */
    static Type m719b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C0991b.m379b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo11792a() {
        return this.f537a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1117a) && C0991b.m378a(this.f538b, ((C1117a) obj).f538b);
    }

    public final int hashCode() {
        return this.f539c;
    }

    public final String toString() {
        return C0991b.m387h(this.f538b);
    }

    /* renamed from: a */
    public static C1117a<?> m718a(Type type) {
        return new C1117a<>(type);
    }

    /* renamed from: a */
    public static <T> C1117a<T> m717a(Class<T> cls) {
        return new C1117a<>(cls);
    }

    C1117a(Type type) {
        Type b = C0991b.m379b((Type) C0990a.m365a(type));
        this.f538b = b;
        this.f537a = C0991b.m384e(b);
        this.f539c = b.hashCode();
    }

    /* renamed from: b */
    public final Type mo11793b() {
        return this.f538b;
    }
}
