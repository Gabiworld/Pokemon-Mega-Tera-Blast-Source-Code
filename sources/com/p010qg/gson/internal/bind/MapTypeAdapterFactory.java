package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0988i;
import com.p010qg.gson.C1098n;
import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C0991b;
import com.p010qg.gson.internal.C1048c;
import com.p010qg.gson.internal.C1064e;
import com.p010qg.gson.internal.C1074h;
import com.p010qg.gson.internal.C1077k;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.qg.gson.internal.bind.MapTypeAdapterFactory */
public final class MapTypeAdapterFactory implements C1111u {

    /* renamed from: a */
    private final C1048c f343a;

    /* renamed from: b */
    final boolean f344b;

    public MapTypeAdapterFactory(C1048c cVar, boolean z) {
        this.f343a = cVar;
        this.f344b = z;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
        Type b = aVar.mo11793b();
        if (!Map.class.isAssignableFrom(aVar.mo11792a())) {
            return null;
        }
        Type[] b2 = C0991b.m381b(b, C0991b.m384e(b));
        return new Adapter(gson, b2[0], m411a(gson, b2[0]), b2[1], gson.mo11558a(C1117a.m718a(b2[1])), this.f343a.mo11703a(aVar));
    }

    /* renamed from: com.qg.gson.internal.bind.MapTypeAdapterFactory$Adapter */
    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a */
        private final TypeAdapter<K> f345a;

        /* renamed from: b */
        private final TypeAdapter<V> f346b;

        /* renamed from: c */
        private final C1074h<? extends Map<K, V>> f347c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, C1074h<? extends Map<K, V>> hVar) {
            this.f345a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f346b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f347c = hVar;
        }

        /* renamed from: a */
        public Map<K, V> m415a(C1118a aVar) throws IOException {
            C1120b q = aVar.mo11679q();
            if (q == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            Map<K, V> map = (Map) this.f347c.mo11705a();
            if (q == C1120b.BEGIN_ARRAY) {
                aVar.mo11665a();
                while (aVar.mo11671g()) {
                    aVar.mo11665a();
                    K a = this.f345a.mo11574a(aVar);
                    if (map.put(a, this.f346b.mo11574a(aVar)) == null) {
                        aVar.mo11668d();
                    } else {
                        throw new C1101q("duplicate key: " + a);
                    }
                }
                aVar.mo11668d();
            } else {
                aVar.mo11666b();
                while (aVar.mo11671g()) {
                    C1064e.f479a.mo11706a(aVar);
                    K a2 = this.f345a.mo11574a(aVar);
                    if (map.put(a2, this.f346b.mo11574a(aVar)) != null) {
                        throw new C1101q("duplicate key: " + a2);
                    }
                }
                aVar.mo11669e();
            }
            return map;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.mo11698h();
            } else if (!MapTypeAdapterFactory.this.f344b) {
                cVar.mo11691b();
                for (Map.Entry next : map.entrySet()) {
                    cVar.mo11690a(String.valueOf(next.getKey()));
                    this.f346b.mo11576a(cVar, next.getValue());
                }
                cVar.mo11695d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C0988i a = this.f345a.mo11583a(next2.getKey());
                    arrayList.add(a);
                    arrayList2.add(next2.getValue());
                    z |= a.mo11596d() || a.mo11598f();
                }
                if (z) {
                    cVar.mo11686a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo11686a();
                        C1077k.m662a((C0988i) arrayList.get(i), cVar);
                        this.f346b.mo11576a(cVar, arrayList2.get(i));
                        cVar.mo11692c();
                        i++;
                    }
                    cVar.mo11692c();
                    return;
                }
                cVar.mo11691b();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo11690a(m413a((C0988i) arrayList.get(i)));
                    this.f346b.mo11576a(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo11695d();
            }
        }

        /* renamed from: a */
        private String m413a(C0988i iVar) {
            if (iVar.mo11599g()) {
                C1098n c = iVar.mo11595c();
                if (c.mo11780o()) {
                    return String.valueOf(c.mo11777l());
                }
                if (c.mo11779n()) {
                    return Boolean.toString(c.mo11772h());
                }
                if (c.mo11781p()) {
                    return c.mo11778m();
                }
                throw new AssertionError();
            } else if (iVar.mo11597e()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private TypeAdapter<?> m411a(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f417f;
        }
        return gson.mo11558a(C1117a.m718a(type));
    }
}
