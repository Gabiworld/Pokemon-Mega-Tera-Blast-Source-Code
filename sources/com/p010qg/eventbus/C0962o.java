package com.p010qg.eventbus;

import com.p010qg.eventbus.p020r.C0966a;
import com.p010qg.eventbus.p020r.C0967b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* renamed from: com.qg.eventbus.o */
class C0962o {

    /* renamed from: d */
    private static final Map<Class<?>, List<C0961n>> f272d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final C0963a[] f273e = new C0963a[4];

    /* renamed from: a */
    private List<C0967b> f274a;

    /* renamed from: b */
    private final boolean f275b;

    /* renamed from: c */
    private final boolean f276c;

    C0962o(List<C0967b> list, boolean z, boolean z2) {
        this.f274a = list;
        this.f275b = z;
        this.f276c = z2;
    }

    /* renamed from: b */
    private List<C0961n> m261b(Class<?> cls) {
        C0963a a = m258a();
        a.mo11548a(cls);
        while (a.f281e != null) {
            C0966a c = m262c(a);
            a.f283g = c;
            if (c != null) {
                for (C0961n nVar : c.mo11553a()) {
                    if (a.mo11549a(nVar.f266a, nVar.f268c)) {
                        a.f277a.add(nVar);
                    }
                }
            } else {
                m259a(a);
            }
            a.mo11547a();
        }
        return m260b(a);
    }

    /* renamed from: c */
    private C0966a m262c(C0963a aVar) {
        C0966a aVar2 = aVar.f283g;
        if (!(aVar2 == null || aVar2.mo11555c() == null)) {
            C0966a c = aVar.f283g.mo11555c();
            if (aVar.f281e == c.mo11554b()) {
                return c;
            }
        }
        List<C0967b> list = this.f274a;
        if (list == null) {
            return null;
        }
        for (C0967b a : list) {
            C0966a a2 = a.mo11556a(aVar.f281e);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0961n> mo11546a(Class<?> cls) {
        List<C0961n> list;
        Map<Class<?>, List<C0961n>> map = f272d;
        List<C0961n> list2 = map.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f276c) {
            list = m263c(cls);
        } else {
            list = m261b(cls);
        }
        if (!list.isEmpty()) {
            map.put(cls, list);
            return list;
        }
        throw new C0949e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    /* renamed from: com.qg.eventbus.o$a */
    static class C0963a {

        /* renamed from: a */
        final List<C0961n> f277a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f278b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f279c = new HashMap();

        /* renamed from: d */
        final StringBuilder f280d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f281e;

        /* renamed from: f */
        boolean f282f;

        /* renamed from: g */
        C0966a f283g;

        C0963a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11548a(Class<?> cls) {
            this.f281e = cls;
            this.f282f = false;
            this.f283g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11550b() {
            this.f277a.clear();
            this.f278b.clear();
            this.f279c.clear();
            this.f280d.setLength(0);
            this.f281e = null;
            this.f282f = false;
            this.f283g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11549a(Method method, Class<?> cls) {
            Object put = this.f278b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m265b((Method) put, cls)) {
                    this.f278b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m265b(method, cls);
        }

        /* renamed from: b */
        private boolean m265b(Method method, Class<?> cls) {
            this.f280d.setLength(0);
            this.f280d.append(method.getName());
            StringBuilder sb = this.f280d;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String sb2 = this.f280d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f279c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f279c.put(sb2, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11547a() {
            if (this.f282f) {
                this.f281e = null;
                return;
            }
            Class<? super Object> superclass = this.f281e.getSuperclass();
            this.f281e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f281e = null;
            }
        }
    }

    /* renamed from: c */
    private List<C0961n> m263c(Class<?> cls) {
        C0963a a = m258a();
        a.mo11548a(cls);
        while (a.f281e != null) {
            m259a(a);
            a.mo11547a();
        }
        return m260b(a);
    }

    /* renamed from: a */
    private C0963a m258a() {
        synchronized (f273e) {
            for (int i = 0; i < 4; i++) {
                C0963a[] aVarArr = f273e;
                C0963a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new C0963a();
        }
    }

    /* renamed from: b */
    private List<C0961n> m260b(C0963a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f277a);
        aVar.mo11550b();
        synchronized (f273e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                C0963a[] aVarArr = f273e;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        r15 = "Could not inspect methods of " + r15.f281e.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r14.f276c != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        r15 = r15 + ". Please consider using EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        r15 = r15 + ". Please make this class visible to EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0133, code lost:
        throw new com.p010qg.eventbus.C0949e(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = r15.f281e.getMethods();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r15.f282f = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m259a(com.p010qg.eventbus.C0962o.C0963a r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.Class<?> r1 = r15.f281e     // Catch:{ all -> 0x0008 }
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch:{ all -> 0x0008 }
            goto L_0x0010
        L_0x0008:
            java.lang.Class<?> r1 = r15.f281e     // Catch:{ LinkageError -> 0x00ee }
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch:{ LinkageError -> 0x00ee }
            r15.f282f = r0
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x00ed
            r6 = r1[r4]
            int r5 = r6.getModifiers()
            r7 = r5 & 1
            java.lang.String r8 = "."
            if (r7 == 0) goto L_0x00a7
            r5 = r5 & 5192(0x1448, float:7.276E-42)
            if (r5 != 0) goto L_0x00a7
            java.lang.Class[] r5 = r6.getParameterTypes()
            int r7 = r5.length
            if (r7 != r0) goto L_0x005b
            java.lang.Class<com.qg.eventbus.Subscribe> r7 = com.p010qg.eventbus.Subscribe.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            com.qg.eventbus.Subscribe r7 = (com.p010qg.eventbus.Subscribe) r7
            if (r7 == 0) goto L_0x00e9
            r8 = r5[r3]
            boolean r5 = r15.mo11549a(r6, r8)
            if (r5 == 0) goto L_0x00e9
            com.qg.eventbus.ThreadMode r9 = r7.threadMode()
            java.util.List<com.qg.eventbus.n> r11 = r15.f277a
            com.qg.eventbus.n r12 = new com.qg.eventbus.n
            int r10 = r7.priority()
            boolean r13 = r7.sticky()
            r5 = r12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11.add(r12)
            goto L_0x00e9
        L_0x005b:
            boolean r7 = r14.f275b
            if (r7 == 0) goto L_0x00e9
            java.lang.Class<com.qg.eventbus.Subscribe> r7 = com.p010qg.eventbus.Subscribe.class
            boolean r7 = r6.isAnnotationPresent(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x00e9
        L_0x0069:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.qg.eventbus.e r0 = new com.qg.eventbus.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@Subscribe method "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = "must have exactly 1 parameter but has "
            r1.append(r15)
            int r15 = r5.length
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00a7:
            boolean r5 = r14.f275b
            if (r5 == 0) goto L_0x00e9
            java.lang.Class<com.qg.eventbus.Subscribe> r5 = com.p010qg.eventbus.Subscribe.class
            boolean r5 = r6.isAnnotationPresent(r5)
            if (r5 != 0) goto L_0x00b4
            goto L_0x00e9
        L_0x00b4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.qg.eventbus.e r0 = new com.qg.eventbus.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = " is a illegal @Subscribe method: must be public, non-static, and non-abstract"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00e9:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x00ed:
            return
        L_0x00ee:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not inspect methods of "
            r1.append(r2)
            java.lang.Class<?> r15 = r15.f281e
            java.lang.String r15 = r15.getName()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            boolean r1 = r14.f276c
            if (r1 == 0) goto L_0x011c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please consider using EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            goto L_0x012d
        L_0x011c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please make this class visible to EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
        L_0x012d:
            com.qg.eventbus.e r1 = new com.qg.eventbus.e
            r1.<init>(r15, r0)
            goto L_0x0134
        L_0x0133:
            throw r1
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.eventbus.C0962o.m259a(com.qg.eventbus.o$a):void");
    }
}
