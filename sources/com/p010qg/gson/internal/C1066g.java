package com.p010qg.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.qg.gson.internal.g */
public final class C1066g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h */
    private static final Comparator<Comparable> f481h = new C1067a();

    /* renamed from: i */
    static final /* synthetic */ boolean f482i = true;

    /* renamed from: a */
    Comparator<? super K> f483a;

    /* renamed from: b */
    C1073e<K, V> f484b;

    /* renamed from: c */
    int f485c;

    /* renamed from: d */
    int f486d;

    /* renamed from: e */
    final C1073e<K, V> f487e;

    /* renamed from: f */
    private C1066g<K, V>.b f488f;

    /* renamed from: g */
    private C1066g<K, V>.c f489g;

    /* renamed from: com.qg.gson.internal.g$a */
    static class C1067a implements Comparator<Comparable> {
        C1067a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.qg.gson.internal.g$b */
    class C1068b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.qg.gson.internal.g$b$a */
        class C1069a extends C1066g<K, V>.d<Map.Entry<K, V>> {
            C1069a(C1068b bVar) {
                super();
            }

            public Map.Entry<K, V> next() {
                return mo11741a();
            }
        }

        C1068b() {
        }

        public void clear() {
            C1066g.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || C1066g.this.mo11716a((Map.Entry<?, ?>) (Map.Entry) obj) == null) {
                return false;
            }
            return C1066g.f482i;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1069a(this);
        }

        public boolean remove(Object obj) {
            C1073e a;
            if (!(obj instanceof Map.Entry) || (a = C1066g.this.mo11716a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C1066g.this.mo11717a(a, (boolean) C1066g.f482i);
            return C1066g.f482i;
        }

        public int size() {
            return C1066g.this.f485c;
        }
    }

    /* renamed from: com.qg.gson.internal.g$c */
    final class C1070c extends AbstractSet<K> {

        /* renamed from: com.qg.gson.internal.g$c$a */
        class C1071a extends C1066g<K, V>.d<K> {
            C1071a(C1070c cVar) {
                super();
            }

            public K next() {
                return mo11741a().f501f;
            }
        }

        C1070c() {
        }

        public void clear() {
            C1066g.this.clear();
        }

        public boolean contains(Object obj) {
            return C1066g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C1071a(this);
        }

        public boolean remove(Object obj) {
            if (C1066g.this.mo11718b(obj) != null) {
                return C1066g.f482i;
            }
            return false;
        }

        public int size() {
            return C1066g.this.f485c;
        }
    }

    /* renamed from: com.qg.gson.internal.g$d */
    private abstract class C1072d<T> implements Iterator<T> {

        /* renamed from: a */
        C1073e<K, V> f492a;

        /* renamed from: b */
        C1073e<K, V> f493b = null;

        /* renamed from: c */
        int f494c;

        C1072d() {
            this.f492a = C1066g.this.f487e.f499d;
            this.f494c = C1066g.this.f486d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C1073e<K, V> mo11741a() {
            C1073e<K, V> eVar = this.f492a;
            C1066g gVar = C1066g.this;
            if (eVar == gVar.f487e) {
                throw new NoSuchElementException();
            } else if (gVar.f486d == this.f494c) {
                this.f492a = eVar.f499d;
                this.f493b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            if (this.f492a != C1066g.this.f487e) {
                return C1066g.f482i;
            }
            return false;
        }

        public final void remove() {
            C1073e<K, V> eVar = this.f493b;
            if (eVar != null) {
                C1066g.this.mo11717a(eVar, (boolean) C1066g.f482i);
                this.f493b = null;
                this.f494c = C1066g.this.f486d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C1066g() {
        this(f481h);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1073e<K, V> mo11715a(K k, boolean z) {
        int i;
        C1073e<K, V> eVar;
        C1073e<K, V> eVar2;
        Comparator<? super K> comparator = this.f483a;
        C1073e<K, V> eVar3 = this.f484b;
        if (eVar3 != null) {
            Comparable comparable = comparator == f481h ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.f501f);
                } else {
                    i = comparator.compare(k, eVar3.f501f);
                }
                if (i == 0) {
                    return eVar3;
                }
                if (i < 0) {
                    eVar2 = eVar3.f497b;
                } else {
                    eVar2 = eVar3.f498c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C1073e<K, V> eVar4 = this.f487e;
        if (eVar3 != null) {
            eVar = new C1073e<>(eVar3, k, eVar4, eVar4.f500e);
            if (i < 0) {
                eVar3.f497b = eVar;
            } else {
                eVar3.f498c = eVar;
            }
            m644b(eVar3, f482i);
        } else if (comparator != f481h || (k instanceof Comparable)) {
            eVar = new C1073e<>(eVar3, k, eVar4, eVar4.f500e);
            this.f484b = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f485c++;
        this.f486d++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1073e<K, V> mo11718b(Object obj) {
        C1073e<K, V> a = mo11714a(obj);
        if (a != null) {
            mo11717a(a, (boolean) f482i);
        }
        return a;
    }

    public void clear() {
        this.f484b = null;
        this.f485c = 0;
        this.f486d++;
        C1073e<K, V> eVar = this.f487e;
        eVar.f500e = eVar;
        eVar.f499d = eVar;
    }

    public boolean containsKey(Object obj) {
        if (mo11714a(obj) != null) {
            return f482i;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C1066g<K, V>.b bVar = this.f488f;
        if (bVar != null) {
            return bVar;
        }
        C1066g<K, V>.b bVar2 = new C1068b();
        this.f488f = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C1073e a = mo11714a(obj);
        if (a != null) {
            return a.f502g;
        }
        return null;
    }

    public Set<K> keySet() {
        C1066g<K, V>.c cVar = this.f489g;
        if (cVar != null) {
            return cVar;
        }
        C1066g<K, V>.c cVar2 = new C1070c();
        this.f489g = cVar2;
        return cVar2;
    }

    public V remove(Object obj) {
        C1073e b = mo11718b(obj);
        if (b != null) {
            return b.f502g;
        }
        return null;
    }

    public int size() {
        return this.f485c;
    }

    public C1066g(Comparator<? super K> comparator) {
        this.f485c = 0;
        this.f486d = 0;
        this.f487e = new C1073e<>();
        this.f483a = comparator == null ? f481h : comparator;
    }

    /* renamed from: com.qg.gson.internal.g$e */
    static final class C1073e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C1073e<K, V> f496a;

        /* renamed from: b */
        C1073e<K, V> f497b;

        /* renamed from: c */
        C1073e<K, V> f498c;

        /* renamed from: d */
        C1073e<K, V> f499d;

        /* renamed from: e */
        C1073e<K, V> f500e;

        /* renamed from: f */
        final K f501f;

        /* renamed from: g */
        V f502g;

        /* renamed from: h */
        int f503h;

        C1073e() {
            this.f501f = null;
            this.f500e = this;
            this.f499d = this;
        }

        /* renamed from: a */
        public C1073e<K, V> mo11744a() {
            C1073e<K, V> eVar = this;
            for (C1073e<K, V> eVar2 = this.f497b; eVar2 != null; eVar2 = eVar2.f497b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C1073e<K, V> mo11745b() {
            C1073e<K, V> eVar = this;
            for (C1073e<K, V> eVar2 = this.f498c; eVar2 != null; eVar2 = eVar2.f498c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f501f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f502g
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.C1066g.C1073e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f501f;
        }

        public V getValue() {
            return this.f502g;
        }

        public int hashCode() {
            K k = this.f501f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f502g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f502g;
            this.f502g = v;
            return v2;
        }

        public String toString() {
            return this.f501f + "=" + this.f502g;
        }

        C1073e(C1073e<K, V> eVar, K k, C1073e<K, V> eVar2, C1073e<K, V> eVar3) {
            this.f496a = eVar;
            this.f501f = k;
            this.f503h = 1;
            this.f499d = eVar2;
            this.f500e = eVar3;
            eVar3.f499d = this;
            eVar2.f500e = this;
        }
    }

    /* renamed from: b */
    private void m644b(C1073e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C1073e<K, V> eVar2 = eVar.f497b;
            C1073e<K, V> eVar3 = eVar.f498c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f503h : 0;
            int i3 = eVar3 != null ? eVar3.f503h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C1073e<K, V> eVar4 = eVar3.f497b;
                C1073e<K, V> eVar5 = eVar3.f498c;
                int i5 = eVar5 != null ? eVar5.f503h : 0;
                if (eVar4 != null) {
                    i = eVar4.f503h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m640a(eVar);
                } else if (f482i || i6 == 1) {
                    m643b(eVar3);
                    m640a(eVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C1073e<K, V> eVar6 = eVar2.f497b;
                C1073e<K, V> eVar7 = eVar2.f498c;
                int i7 = eVar7 != null ? eVar7.f503h : 0;
                if (eVar6 != null) {
                    i = eVar6.f503h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m643b(eVar);
                } else if (f482i || i8 == -1) {
                    m640a(eVar2);
                    m643b(eVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f503h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f482i || i4 == -1 || i4 == 1) {
                eVar.f503h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            eVar = eVar.f496a;
        }
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C1073e a = mo11715a(k, (boolean) f482i);
        V v2 = a.f502g;
        a.f502g = v;
        return v2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1073e<K, V> mo11714a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo11715a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1073e<K, V> mo11716a(Map.Entry<?, ?> entry) {
        C1073e<K, V> a = mo11714a((Object) entry.getKey());
        if ((a == null || !m642a((Object) a.f502g, (Object) entry.getValue())) ? false : f482i) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m642a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return f482i;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11717a(C1073e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C1073e<K, V> eVar2 = eVar.f500e;
            eVar2.f499d = eVar.f499d;
            eVar.f499d.f500e = eVar2;
        }
        C1073e<K, V> eVar3 = eVar.f497b;
        C1073e<K, V> eVar4 = eVar.f498c;
        C1073e<K, V> eVar5 = eVar.f496a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m641a(eVar, eVar3);
                eVar.f497b = null;
            } else if (eVar4 != null) {
                m641a(eVar, eVar4);
                eVar.f498c = null;
            } else {
                m641a(eVar, (C1073e<K, V>) null);
            }
            m644b(eVar5, false);
            this.f485c--;
            this.f486d++;
            return;
        }
        C1073e<K, V> b = eVar3.f503h > eVar4.f503h ? eVar3.mo11745b() : eVar4.mo11744a();
        mo11717a(b, false);
        C1073e<K, V> eVar6 = eVar.f497b;
        if (eVar6 != null) {
            i = eVar6.f503h;
            b.f497b = eVar6;
            eVar6.f496a = b;
            eVar.f497b = null;
        } else {
            i = 0;
        }
        C1073e<K, V> eVar7 = eVar.f498c;
        if (eVar7 != null) {
            i2 = eVar7.f503h;
            b.f498c = eVar7;
            eVar7.f496a = b;
            eVar.f498c = null;
        }
        b.f503h = Math.max(i, i2) + 1;
        m641a(eVar, b);
    }

    /* renamed from: b */
    private void m643b(C1073e<K, V> eVar) {
        C1073e<K, V> eVar2 = eVar.f497b;
        C1073e<K, V> eVar3 = eVar.f498c;
        C1073e<K, V> eVar4 = eVar2.f497b;
        C1073e<K, V> eVar5 = eVar2.f498c;
        eVar.f497b = eVar5;
        if (eVar5 != null) {
            eVar5.f496a = eVar;
        }
        m641a(eVar, eVar2);
        eVar2.f498c = eVar;
        eVar.f496a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f503h : 0, eVar5 != null ? eVar5.f503h : 0) + 1;
        eVar.f503h = max;
        if (eVar4 != null) {
            i = eVar4.f503h;
        }
        eVar2.f503h = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    private void m641a(C1073e<K, V> eVar, C1073e<K, V> eVar2) {
        C1073e<K, V> eVar3 = eVar.f496a;
        eVar.f496a = null;
        if (eVar2 != null) {
            eVar2.f496a = eVar3;
        }
        if (eVar3 == null) {
            this.f484b = eVar2;
        } else if (eVar3.f497b == eVar) {
            eVar3.f497b = eVar2;
        } else if (f482i || eVar3.f498c == eVar) {
            eVar3.f498c = eVar2;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m640a(C1073e<K, V> eVar) {
        C1073e<K, V> eVar2 = eVar.f497b;
        C1073e<K, V> eVar3 = eVar.f498c;
        C1073e<K, V> eVar4 = eVar3.f497b;
        C1073e<K, V> eVar5 = eVar3.f498c;
        eVar.f498c = eVar4;
        if (eVar4 != null) {
            eVar4.f496a = eVar;
        }
        m641a(eVar, eVar3);
        eVar3.f497b = eVar;
        eVar.f496a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f503h : 0, eVar4 != null ? eVar4.f503h : 0) + 1;
        eVar.f503h = max;
        if (eVar5 != null) {
            i = eVar5.f503h;
        }
        eVar3.f503h = Math.max(max, i) + 1;
    }
}
