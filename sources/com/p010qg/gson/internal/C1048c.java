package com.p010qg.gson.internal;

import com.p010qg.gson.C0984e;
import com.p010qg.gson.C1094j;
import com.p010qg.gson.internal.p022m.C1086b;
import com.p010qg.gson.p024w.C1117a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.qg.gson.internal.c */
public final class C1048c {

    /* renamed from: a */
    private final Map<Type, C0984e<?>> f467a;

    /* renamed from: b */
    private final C1086b f468b = C1086b.m671a();

    /* renamed from: com.qg.gson.internal.c$a */
    class C1049a implements C1074h<T> {
        C1049a(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.qg.gson.internal.c$b */
    class C1050b implements C1074h<T> {
        C1050b(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.qg.gson.internal.c$c */
    class C1051c implements C1074h<T> {
        C1051c(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.qg.gson.internal.c$d */
    class C1052d implements C1074h<T> {
        C1052d(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new C1066g();
        }
    }

    /* renamed from: com.qg.gson.internal.c$e */
    class C1053e implements C1074h<T> {

        /* renamed from: a */
        private final C1080l f469a = C1080l.m663a();

        /* renamed from: b */
        final /* synthetic */ Class f470b;

        /* renamed from: c */
        final /* synthetic */ Type f471c;

        C1053e(C1048c cVar, Class cls, Type type) {
            this.f470b = cls;
            this.f471c = type;
        }

        /* renamed from: a */
        public T mo11705a() {
            try {
                return this.f469a.mo11759a(this.f470b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f471c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.qg.gson.internal.c$f */
    class C1054f implements C1074h<T> {

        /* renamed from: a */
        final /* synthetic */ C0984e f472a;

        /* renamed from: b */
        final /* synthetic */ Type f473b;

        C1054f(C1048c cVar, C0984e eVar, Type type) {
            this.f472a = eVar;
            this.f473b = type;
        }

        /* renamed from: a */
        public T mo11705a() {
            return this.f472a.mo11587a(this.f473b);
        }
    }

    /* renamed from: com.qg.gson.internal.c$g */
    class C1055g implements C1074h<T> {

        /* renamed from: a */
        final /* synthetic */ C0984e f474a;

        /* renamed from: b */
        final /* synthetic */ Type f475b;

        C1055g(C1048c cVar, C0984e eVar, Type type) {
            this.f474a = eVar;
            this.f475b = type;
        }

        /* renamed from: a */
        public T mo11705a() {
            return this.f474a.mo11587a(this.f475b);
        }
    }

    /* renamed from: com.qg.gson.internal.c$h */
    class C1056h implements C1074h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f476a;

        C1056h(C1048c cVar, Constructor constructor) {
            this.f476a = constructor;
        }

        /* renamed from: a */
        public T mo11705a() {
            try {
                return this.f476a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f476a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f476a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.qg.gson.internal.c$i */
    class C1057i implements C1074h<T> {
        C1057i(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.qg.gson.internal.c$j */
    class C1058j implements C1074h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f477a;

        C1058j(C1048c cVar, Type type) {
            this.f477a = type;
        }

        /* renamed from: a */
        public T mo11705a() {
            Type type = this.f477a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C1094j("Invalid EnumSet type: " + this.f477a.toString());
            }
            throw new C1094j("Invalid EnumSet type: " + this.f477a.toString());
        }
    }

    /* renamed from: com.qg.gson.internal.c$k */
    class C1059k implements C1074h<T> {
        C1059k(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.qg.gson.internal.c$l */
    class C1060l implements C1074h<T> {
        C1060l(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.qg.gson.internal.c$m */
    class C1061m implements C1074h<T> {
        C1061m(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.qg.gson.internal.c$n */
    class C1062n implements C1074h<T> {
        C1062n(C1048c cVar) {
        }

        /* renamed from: a */
        public T mo11705a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C1048c(Map<Type, C0984e<?>> map) {
        this.f467a = map;
    }

    /* renamed from: b */
    private <T> C1074h<T> m617b(Type type, Class<? super T> cls) {
        return new C1053e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C1074h<T> mo11703a(C1117a<T> aVar) {
        Type b = aVar.mo11793b();
        Class<? super T> a = aVar.mo11792a();
        C0984e eVar = this.f467a.get(b);
        if (eVar != null) {
            return new C1054f(this, eVar, b);
        }
        C0984e eVar2 = this.f467a.get(a);
        if (eVar2 != null) {
            return new C1055g(this, eVar2, b);
        }
        C1074h<T> a2 = m615a(a);
        if (a2 != null) {
            return a2;
        }
        C1074h<T> a3 = m616a(b, a);
        if (a3 != null) {
            return a3;
        }
        return m617b(b, a);
    }

    public String toString() {
        return this.f467a.toString();
    }

    /* renamed from: a */
    private <T> C1074h<T> m615a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f468b.mo11760a(declaredConstructor);
            }
            return new C1056h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C1074h<T> m616a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C1057i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C1058j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C1059k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C1060l(this);
            }
            return new C1061m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C1062n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C1049a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C1050b(this);
            }
            if (type instanceof ParameterizedType) {
                if (!String.class.isAssignableFrom(C1117a.m718a(((ParameterizedType) type).getActualTypeArguments()[0]).mo11792a())) {
                    return new C1051c(this);
                }
            }
            return new C1052d(this);
        }
    }
}
