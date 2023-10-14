package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C0991b;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.qg.gson.internal.bind.ArrayTypeAdapter */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final C1111u f332c = new C1111u() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            Type b = aVar.mo11793b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type d = C0991b.m383d(b);
            return new ArrayTypeAdapter(gson, gson.mo11558a(C1117a.m718a(d)), C0991b.m384e(d));
        }
    };

    /* renamed from: a */
    private final Class<E> f333a;

    /* renamed from: b */
    private final TypeAdapter<E> f334b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f334b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f333a = cls;
    }

    /* renamed from: a */
    public Object mo11574a(C1118a aVar) throws IOException {
        if (aVar.mo11679q() == C1120b.NULL) {
            aVar.mo11677o();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo11665a();
        while (aVar.mo11671g()) {
            arrayList.add(this.f334b.mo11574a(aVar));
        }
        aVar.mo11668d();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f333a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo11698h();
            return;
        }
        cVar.mo11686a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f334b.mo11576a(cVar, Array.get(obj, i));
        }
        cVar.mo11692c();
    }
}
