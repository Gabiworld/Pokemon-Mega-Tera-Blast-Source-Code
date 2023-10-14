package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0983d;
import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C0991b;
import com.p010qg.gson.internal.C1048c;
import com.p010qg.gson.internal.C1074h;
import com.p010qg.gson.internal.C1076j;
import com.p010qg.gson.internal.Excluder;
import com.p010qg.gson.internal.p022m.C1086b;
import com.p010qg.gson.p023v.C1113b;
import com.p010qg.gson.p023v.C1114c;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.qg.gson.internal.bind.ReflectiveTypeAdapterFactory */
public final class ReflectiveTypeAdapterFactory implements C1111u {

    /* renamed from: a */
    private final C1048c f358a;

    /* renamed from: b */
    private final C0983d f359b;

    /* renamed from: c */
    private final Excluder f360c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f361d;

    /* renamed from: e */
    private final C1086b f362e = C1086b.m671a();

    /* renamed from: com.qg.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C1004b {

        /* renamed from: a */
        final String f371a;

        /* renamed from: b */
        final boolean f372b;

        /* renamed from: c */
        final boolean f373c;

        protected C1004b(String str, boolean z, boolean z2) {
            this.f371a = str;
            this.f372b = z;
            this.f373c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo11629a(C1118a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo11630a(C1121c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo11631a(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C1048c cVar, C0983d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f358a = cVar;
        this.f359b = dVar;
        this.f360c = excluder;
        this.f361d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    public boolean mo11628a(Field field, boolean z) {
        return m433a(field, z, this.f360c);
    }

    /* renamed from: a */
    static boolean m433a(Field field, boolean z, Excluder excluder) {
        return !excluder.mo11602a(field.getType(), z) && !excluder.mo11603a(field, z);
    }

    /* renamed from: a */
    private List<String> m431a(Field field) {
        C1114c cVar = (C1114c) field.getAnnotation(C1114c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f359b.mo11586a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: com.qg.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    class C1003a extends C1004b {

        /* renamed from: d */
        final /* synthetic */ Field f365d;

        /* renamed from: e */
        final /* synthetic */ boolean f366e;

        /* renamed from: f */
        final /* synthetic */ TypeAdapter f367f;

        /* renamed from: g */
        final /* synthetic */ Gson f368g;

        /* renamed from: h */
        final /* synthetic */ C1117a f369h;

        /* renamed from: i */
        final /* synthetic */ boolean f370i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1003a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter typeAdapter, Gson gson, C1117a aVar, boolean z4) {
            super(str, z, z2);
            this.f365d = field;
            this.f366e = z3;
            this.f367f = typeAdapter;
            this.f368g = gson;
            this.f369h = aVar;
            this.f370i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11630a(C1121c cVar, Object obj) throws IOException, IllegalAccessException {
            TypeAdapter typeAdapter;
            Object obj2 = this.f365d.get(obj);
            if (this.f366e) {
                typeAdapter = this.f367f;
            } else {
                typeAdapter = new TypeAdapterRuntimeTypeWrapper(this.f368g, this.f367f, this.f369h.mo11793b());
            }
            typeAdapter.mo11576a(cVar, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11629a(C1118a aVar, Object obj) throws IOException, IllegalAccessException {
            Object a = this.f367f.mo11574a(aVar);
            if (a != null || !this.f370i) {
                this.f365d.set(obj, a);
            }
        }

        /* renamed from: a */
        public boolean mo11631a(Object obj) throws IOException, IllegalAccessException {
            if (this.f372b && this.f365d.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
        Class<? super T> a = aVar.mo11792a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new Adapter(this.f358a.mo11703a(aVar), m432a(gson, (C1117a<?>) aVar, (Class<?>) a));
    }

    /* renamed from: a */
    private C1004b m430a(Gson gson, Field field, String str, C1117a<?> aVar, boolean z, boolean z2) {
        Gson gson2 = gson;
        C1117a<?> aVar2 = aVar;
        boolean a = C1076j.m659a((Type) aVar.mo11792a());
        Field field2 = field;
        C1113b bVar = (C1113b) field.getAnnotation(C1113b.class);
        TypeAdapter<?> a2 = bVar != null ? this.f361d.mo11625a(this.f358a, gson, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = gson.mo11558a(aVar2);
        }
        return new C1003a(this, str, z, z2, field, z3, a2, gson, aVar, a);
    }

    /* renamed from: com.qg.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter */
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private final C1074h<T> f363a;

        /* renamed from: b */
        private final Map<String, C1004b> f364b;

        Adapter(C1074h<T> hVar, Map<String, C1004b> map) {
            this.f363a = hVar;
            this.f364b = map;
        }

        /* renamed from: a */
        public T mo11574a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            T a = this.f363a.mo11705a();
            try {
                aVar.mo11666b();
                while (aVar.mo11671g()) {
                    C1004b bVar = this.f364b.get(aVar.mo11676n());
                    if (bVar != null) {
                        if (bVar.f373c) {
                            bVar.mo11629a(aVar, (Object) a);
                        }
                    }
                    aVar.mo11680r();
                }
                aVar.mo11669e();
                return a;
            } catch (IllegalStateException e) {
                throw new C1101q((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo11698h();
                return;
            }
            cVar.mo11691b();
            try {
                for (C1004b next : this.f364b.values()) {
                    if (next.mo11631a(t)) {
                        cVar.mo11690a(next.f371a);
                        next.mo11630a(cVar, (Object) t);
                    }
                }
                cVar.mo11695d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    private Map<String, C1004b> m432a(Gson gson, C1117a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo11793b();
        C1117a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo11628a(field, true);
                boolean a2 = mo11628a(field, z);
                if (a || a2) {
                    this.f362e.mo11760a(field);
                    Type a3 = C0991b.m374a(aVar2.mo11793b(), (Class<?>) cls2, field.getGenericType());
                    List<String> a4 = m431a(field);
                    int size = a4.size();
                    C1004b bVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        int i3 = i2;
                        C1004b bVar2 = bVar;
                        int i4 = size;
                        List<String> list = a4;
                        Field field2 = field;
                        bVar = bVar2 == null ? (C1004b) linkedHashMap.put(str2, m430a(gson, field, str2, C1117a.m718a(a3), z2, a2)) : bVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C1004b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(b + " declares multiple JSON fields named " + bVar3.f371a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C1117a.m718a(C0991b.m374a(aVar2.mo11793b(), (Class<?>) cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo11792a();
        }
        return linkedHashMap;
    }
}
