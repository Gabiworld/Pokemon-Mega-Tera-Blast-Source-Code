package com.p010qg.gson;

import com.p010qg.gson.internal.C1048c;
import com.p010qg.gson.internal.C1076j;
import com.p010qg.gson.internal.C1077k;
import com.p010qg.gson.internal.Excluder;
import com.p010qg.gson.internal.bind.ArrayTypeAdapter;
import com.p010qg.gson.internal.bind.CollectionTypeAdapterFactory;
import com.p010qg.gson.internal.bind.DateTypeAdapter;
import com.p010qg.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.p010qg.gson.internal.bind.MapTypeAdapterFactory;
import com.p010qg.gson.internal.bind.NumberTypeAdapter;
import com.p010qg.gson.internal.bind.ObjectTypeAdapter;
import com.p010qg.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.p010qg.gson.internal.bind.TypeAdapters;
import com.p010qg.gson.internal.sql.C1091a;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import com.p010qg.gson.p025x.C1122d;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.qg.gson.Gson */
public final class Gson {

    /* renamed from: k */
    private static final C1117a<?> f289k = C1117a.m717a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C1117a<?>, FutureTypeAdapter<?>>> f290a;

    /* renamed from: b */
    private final Map<C1117a<?>, TypeAdapter<?>> f291b;

    /* renamed from: c */
    private final C1048c f292c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f293d;

    /* renamed from: e */
    final List<C1111u> f294e;

    /* renamed from: f */
    final boolean f295f;

    /* renamed from: g */
    final boolean f296g;

    /* renamed from: h */
    final boolean f297h;

    /* renamed from: i */
    final boolean f298i;

    /* renamed from: j */
    final boolean f299j;

    public Gson() {
        this(Excluder.f312g, C0976c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C1102r.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C1105s.DOUBLE, C1105s.LAZILY_PARSED_NUMBER);
    }

    /* renamed from: a */
    private TypeAdapter<Number> m280a(boolean z) {
        if (z) {
            return TypeAdapters.f433v;
        }
        return new TypeAdapter<Number>(this) {
            /* renamed from: a */
            public Double m302a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return Double.valueOf(aVar.mo11673k());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.mo11698h();
                    return;
                }
                Gson.m281a(number.doubleValue());
                cVar.mo11689a(number);
            }
        };
    }

    /* renamed from: b */
    private TypeAdapter<Number> m284b(boolean z) {
        if (z) {
            return TypeAdapters.f432u;
        }
        return new TypeAdapter<Number>(this) {
            /* renamed from: a */
            public Float m306a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return Float.valueOf((float) aVar.mo11673k());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.mo11698h();
                    return;
                }
                Gson.m281a((double) number.floatValue());
                cVar.mo11689a(number);
            }
        };
    }

    public String toString() {
        return "{serializeNulls:" + this.f295f + ",factories:" + this.f294e + ",instanceCreators:" + this.f292c + "}";
    }

    /* renamed from: a */
    static void m281a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    private static TypeAdapter<AtomicLongArray> m283b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() {
            /* renamed from: a */
            public void mo11576a(C1121c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.mo11686a();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    typeAdapter.mo11576a(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.mo11692c();
            }

            /* renamed from: a */
            public AtomicLongArray m318a(C1118a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.mo11665a();
                while (aVar.mo11671g()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.mo11574a(aVar)).longValue()));
                }
                aVar.mo11668d();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.mo11582a();
    }

    /* renamed from: com.qg.gson.Gson$FutureTypeAdapter */
    static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter<T> f302a;

        FutureTypeAdapter() {
        }

        /* renamed from: a */
        public void mo11581a(TypeAdapter<T> typeAdapter) {
            if (this.f302a == null) {
                this.f302a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public T mo11574a(C1118a aVar) throws IOException {
            TypeAdapter<T> typeAdapter = this.f302a;
            if (typeAdapter != null) {
                return typeAdapter.mo11574a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.f302a;
            if (typeAdapter != null) {
                typeAdapter.mo11576a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private static TypeAdapter<Number> m279a(C1102r rVar) {
        if (rVar == C1102r.DEFAULT) {
            return TypeAdapters.f431t;
        }
        return new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number m310a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return Long.valueOf(aVar.mo11675m());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.mo11698h();
                } else {
                    cVar.mo11693c(number.toString());
                }
            }
        };
    }

    Gson(Excluder excluder, C0983d dVar, Map<Type, C0984e<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C1102r rVar, String str, int i, int i2, List<C1111u> list, List<C1111u> list2, List<C1111u> list3, C1110t tVar, C1110t tVar2) {
        Excluder excluder2 = excluder;
        boolean z8 = z7;
        this.f290a = new ThreadLocal<>();
        this.f291b = new ConcurrentHashMap();
        Map<Type, C0984e<?>> map2 = map;
        C1048c cVar = new C1048c(map);
        this.f292c = cVar;
        this.f295f = z;
        this.f296g = z3;
        this.f297h = z4;
        this.f298i = z5;
        this.f299j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f410V);
        arrayList.add(ObjectTypeAdapter.m425a(tVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f390B);
        arrayList.add(TypeAdapters.f424m);
        arrayList.add(TypeAdapters.f418g);
        arrayList.add(TypeAdapters.f420i);
        arrayList.add(TypeAdapters.f422k);
        TypeAdapter<Number> a = m279a(rVar);
        arrayList.add(TypeAdapters.m452a(Long.TYPE, Long.class, a));
        arrayList.add(TypeAdapters.m452a(Double.TYPE, Double.class, m280a(z8)));
        arrayList.add(TypeAdapters.m452a(Float.TYPE, Float.class, m284b(z8)));
        arrayList.add(NumberTypeAdapter.m418a(tVar2));
        arrayList.add(TypeAdapters.f426o);
        arrayList.add(TypeAdapters.f428q);
        arrayList.add(TypeAdapters.m451a(AtomicLong.class, m278a(a)));
        arrayList.add(TypeAdapters.m451a(AtomicLongArray.class, m283b(a)));
        arrayList.add(TypeAdapters.f430s);
        arrayList.add(TypeAdapters.f435x);
        arrayList.add(TypeAdapters.f392D);
        arrayList.add(TypeAdapters.f394F);
        arrayList.add(TypeAdapters.m451a(BigDecimal.class, TypeAdapters.f437z));
        arrayList.add(TypeAdapters.m451a(BigInteger.class, TypeAdapters.f389A));
        arrayList.add(TypeAdapters.f396H);
        arrayList.add(TypeAdapters.f398J);
        arrayList.add(TypeAdapters.f402N);
        arrayList.add(TypeAdapters.f404P);
        arrayList.add(TypeAdapters.f408T);
        arrayList.add(TypeAdapters.f400L);
        arrayList.add(TypeAdapters.f415d);
        arrayList.add(DateTypeAdapter.f338b);
        arrayList.add(TypeAdapters.f406R);
        if (C1091a.f522a) {
            arrayList.add(C1091a.f524c);
            arrayList.add(C1091a.f523b);
            arrayList.add(C1091a.f525d);
        }
        arrayList.add(ArrayTypeAdapter.f332c);
        arrayList.add(TypeAdapters.f413b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        boolean z9 = z2;
        arrayList.add(new MapTypeAdapterFactory(cVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f293d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f411W);
        C0983d dVar2 = dVar;
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f294e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static TypeAdapter<AtomicLong> m278a(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() {
            /* renamed from: a */
            public void mo11576a(C1121c cVar, AtomicLong atomicLong) throws IOException {
                typeAdapter.mo11576a(cVar, Long.valueOf(atomicLong.get()));
            }

            /* renamed from: a */
            public AtomicLong m314a(C1118a aVar) throws IOException {
                return new AtomicLong(((Number) typeAdapter.mo11574a(aVar)).longValue());
            }
        }.mo11582a();
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11558a(C1117a<T> aVar) {
        TypeAdapter<T> typeAdapter = this.f291b.get(aVar == null ? f289k : aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = this.f290a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f290a.set(map);
            z = true;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter2);
            for (C1111u a : this.f294e) {
                TypeAdapter<T> a2 = a.mo11601a(this, aVar);
                if (a2 != null) {
                    futureTypeAdapter2.mo11581a(a2);
                    this.f291b.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f290a.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11557a(C1111u uVar, C1117a<T> aVar) {
        if (!this.f294e.contains(uVar)) {
            uVar = this.f293d;
        }
        boolean z = false;
        for (C1111u next : this.f294e) {
            if (z) {
                TypeAdapter<T> a = next.mo11601a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11559a(Class<T> cls) {
        return mo11558a(C1117a.m717a(cls));
    }

    /* renamed from: a */
    public String mo11567a(Object obj) {
        if (obj == null) {
            return mo11566a((C0988i) C1095k.f526a);
        }
        return mo11568a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo11568a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo11572a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo11572a(Object obj, Type type, Appendable appendable) throws C1094j {
        try {
            mo11571a(obj, type, mo11561a(C1077k.m661a(appendable)));
        } catch (IOException e) {
            throw new C1094j((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo11571a(Object obj, Type type, C1121c cVar) throws C1094j {
        TypeAdapter<?> a = mo11558a(C1117a.m718a(type));
        boolean g = cVar.mo11807g();
        cVar.mo11803b(true);
        boolean f = cVar.mo11806f();
        cVar.mo11801a(this.f297h);
        boolean e = cVar.mo11805e();
        cVar.mo11804c(this.f295f);
        try {
            a.mo11576a(cVar, obj);
            cVar.mo11803b(g);
            cVar.mo11801a(f);
            cVar.mo11804c(e);
        } catch (IOException e2) {
            throw new C1094j((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo11803b(g);
            cVar.mo11801a(f);
            cVar.mo11804c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo11566a(C0988i iVar) {
        StringWriter stringWriter = new StringWriter();
        mo11570a(iVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo11570a(C0988i iVar, Appendable appendable) throws C1094j {
        try {
            mo11569a(iVar, mo11561a(C1077k.m661a(appendable)));
        } catch (IOException e) {
            throw new C1094j((Throwable) e);
        }
    }

    /* renamed from: a */
    public C1121c mo11561a(Writer writer) throws IOException {
        if (this.f296g) {
            writer.write(")]}'\n");
        }
        C1121c cVar = new C1121c(writer);
        if (this.f298i) {
            cVar.mo11802b("  ");
        }
        cVar.mo11804c(this.f295f);
        return cVar;
    }

    /* renamed from: a */
    public C1118a mo11560a(Reader reader) {
        C1118a aVar = new C1118a(reader);
        aVar.mo11797a(this.f299j);
        return aVar;
    }

    /* renamed from: a */
    public void mo11569a(C0988i iVar, C1121c cVar) throws C1094j {
        boolean g = cVar.mo11807g();
        cVar.mo11803b(true);
        boolean f = cVar.mo11806f();
        cVar.mo11801a(this.f297h);
        boolean e = cVar.mo11805e();
        cVar.mo11804c(this.f295f);
        try {
            C1077k.m662a(iVar, cVar);
            cVar.mo11803b(g);
            cVar.mo11801a(f);
            cVar.mo11804c(e);
        } catch (IOException e2) {
            throw new C1094j((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo11803b(g);
            cVar.mo11801a(f);
            cVar.mo11804c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo11564a(String str, Class<T> cls) throws C1101q {
        return C1076j.m658a(cls).cast(mo11565a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo11565a(String str, Type type) throws C1101q {
        if (str == null) {
            return null;
        }
        return mo11563a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo11563a(Reader reader, Type type) throws C1094j, C1101q {
        C1118a a = mo11560a(reader);
        T a2 = mo11562a(a, type);
        m282a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m282a(Object obj, C1118a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo11679q() != C1120b.END_DOCUMENT) {
                    throw new C1094j("JSON document was not fully consumed.");
                }
            } catch (C1122d e) {
                throw new C1101q((Throwable) e);
            } catch (IOException e2) {
                throw new C1094j((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo11562a(C1118a aVar, Type type) throws C1094j, C1101q {
        boolean h = aVar.mo11799h();
        aVar.mo11797a(true);
        try {
            aVar.mo11679q();
            T a = mo11558a(C1117a.m718a(type)).mo11574a(aVar);
            aVar.mo11797a(h);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo11797a(h);
                return null;
            }
            throw new C1101q((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C1101q((Throwable) e2);
        } catch (IOException e3) {
            throw new C1101q((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            aVar.mo11797a(h);
            throw th;
        }
    }
}
