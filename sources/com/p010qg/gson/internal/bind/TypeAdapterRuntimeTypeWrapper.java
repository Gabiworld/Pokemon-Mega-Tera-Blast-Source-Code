package com.p010qg.gson.internal.bind;

import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.p025x.C1118a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.qg.gson.internal.bind.TypeAdapterRuntimeTypeWrapper */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final Gson f386a;

    /* renamed from: b */
    private final TypeAdapter<T> f387b;

    /* renamed from: c */
    private final Type f388c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f386a = gson;
        this.f387b = typeAdapter;
        this.f388c = type;
    }

    /* renamed from: a */
    public T mo11574a(C1118a aVar) throws IOException {
        return this.f387b.mo11574a(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if ((r1 instanceof com.p010qg.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) == false) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11576a(com.p010qg.gson.p025x.C1121c r4, T r5) throws java.io.IOException {
        /*
            r3 = this;
            com.qg.gson.TypeAdapter<T> r0 = r3.f387b
            java.lang.reflect.Type r1 = r3.f388c
            java.lang.reflect.Type r1 = r3.m448a((java.lang.reflect.Type) r1, (java.lang.Object) r5)
            java.lang.reflect.Type r2 = r3.f388c
            if (r1 == r2) goto L_0x0022
            com.qg.gson.Gson r0 = r3.f386a
            com.qg.gson.w.a r1 = com.p010qg.gson.p024w.C1117a.m718a((java.lang.reflect.Type) r1)
            com.qg.gson.TypeAdapter r0 = r0.mo11558a(r1)
            boolean r1 = r0 instanceof com.p010qg.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L_0x001b
            goto L_0x0022
        L_0x001b:
            com.qg.gson.TypeAdapter<T> r1 = r3.f387b
            boolean r2 = r1 instanceof com.p010qg.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r2 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            r1.mo11576a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.mo11576a(com.qg.gson.x.c, java.lang.Object):void");
    }

    /* renamed from: a */
    private Type m448a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }
}
