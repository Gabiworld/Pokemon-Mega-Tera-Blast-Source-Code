package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C0991b;
import com.p010qg.gson.internal.C1048c;
import com.p010qg.gson.internal.C1074h;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.qg.gson.internal.bind.CollectionTypeAdapterFactory */
public final class CollectionTypeAdapterFactory implements C1111u {

    /* renamed from: a */
    private final C1048c f335a;

    public CollectionTypeAdapterFactory(C1048c cVar) {
        this.f335a = cVar;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
        Type b = aVar.mo11793b();
        Class<? super T> a = aVar.mo11792a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C0991b.m372a(b, (Class<?>) a);
        return new Adapter(gson, a2, gson.mo11558a(C1117a.m718a(a2)), this.f335a.mo11703a(aVar));
    }

    /* renamed from: com.qg.gson.internal.bind.CollectionTypeAdapterFactory$Adapter */
    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        private final TypeAdapter<E> f336a;

        /* renamed from: b */
        private final C1074h<? extends Collection<E>> f337b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, C1074h<? extends Collection<E>> hVar) {
            this.f336a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f337b = hVar;
        }

        /* renamed from: a */
        public Collection<E> m393a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            Collection<E> collection = (Collection) this.f337b.mo11705a();
            aVar.mo11665a();
            while (aVar.mo11671g()) {
                collection.add(this.f336a.mo11574a(aVar));
            }
            aVar.mo11668d();
            return collection;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.mo11698h();
                return;
            }
            cVar.mo11686a();
            for (E a : collection) {
                this.f336a.mo11576a(cVar, a);
            }
            cVar.mo11692c();
        }
    }
}
