package com.p010qg.eventbus;

import com.p010qg.eventbus.p020r.C0967b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* renamed from: com.qg.eventbus.c */
public class C0944c {

    /* renamed from: s */
    static volatile C0944c f211s;

    /* renamed from: t */
    private static final C0948d f212t = new C0948d();

    /* renamed from: u */
    private static final Map<Class<?>, List<Class<?>>> f213u = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<C0964p>> f214a;

    /* renamed from: b */
    private final Map<Object, List<Class<?>>> f215b;

    /* renamed from: c */
    private final Map<Class<?>, Object> f216c;

    /* renamed from: d */
    private final ThreadLocal<C0947c> f217d;

    /* renamed from: e */
    private final C0954h f218e;

    /* renamed from: f */
    private final C0959l f219f;

    /* renamed from: g */
    private final C0943b f220g;

    /* renamed from: h */
    private final C0942a f221h;

    /* renamed from: i */
    private final C0962o f222i;

    /* renamed from: j */
    private final ExecutorService f223j;

    /* renamed from: k */
    private final boolean f224k;

    /* renamed from: l */
    private final boolean f225l;

    /* renamed from: m */
    private final boolean f226m;

    /* renamed from: n */
    private final boolean f227n;

    /* renamed from: o */
    private final boolean f228o;

    /* renamed from: p */
    private final boolean f229p;

    /* renamed from: q */
    private final int f230q;

    /* renamed from: r */
    private final C0951g f231r;

    /* renamed from: com.qg.eventbus.c$a */
    class C0945a extends ThreadLocal<C0947c> {
        C0945a(C0944c cVar) {
        }

        /* access modifiers changed from: protected */
        public C0947c initialValue() {
            return new C0947c();
        }
    }

    /* renamed from: com.qg.eventbus.c$b */
    static /* synthetic */ class C0946b {

        /* renamed from: a */
        static final /* synthetic */ int[] f232a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.qg.eventbus.ThreadMode[] r0 = com.p010qg.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f232a = r0
                com.qg.eventbus.ThreadMode r1 = com.p010qg.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f232a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qg.eventbus.ThreadMode r1 = com.p010qg.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qg.eventbus.ThreadMode r1 = com.p010qg.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f232a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.qg.eventbus.ThreadMode r1 = com.p010qg.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f232a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.qg.eventbus.ThreadMode r1 = com.p010qg.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.eventbus.C0944c.C0946b.<clinit>():void");
        }
    }

    /* renamed from: com.qg.eventbus.c$c */
    static final class C0947c {

        /* renamed from: a */
        final List<Object> f233a = new ArrayList();

        /* renamed from: b */
        boolean f234b;

        /* renamed from: c */
        boolean f235c;

        /* renamed from: d */
        C0964p f236d;

        /* renamed from: e */
        Object f237e;

        /* renamed from: f */
        boolean f238f;

        C0947c() {
        }
    }

    public C0944c() {
        this(f212t);
    }

    /* renamed from: a */
    private void m222a(Object obj, C0961n nVar) {
        Class<?> cls = nVar.f268c;
        C0964p pVar = new C0964p(obj, nVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f214a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f214a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new C0949e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || nVar.f269d > ((C0964p) copyOnWriteArrayList.get(i)).f285b.f269d) {
                copyOnWriteArrayList.add(i, pVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, pVar);
        List list = this.f215b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f215b.put(obj, list);
        }
        list.add(cls);
        if (!nVar.f270e) {
            return;
        }
        if (this.f229p) {
            for (Map.Entry next : this.f216c.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey())) {
                    m226b(pVar, next.getValue());
                }
            }
            return;
        }
        m226b(pVar, this.f216c.get(cls));
    }

    /* renamed from: b */
    private void m226b(C0964p pVar, Object obj) {
        if (obj != null) {
            m220a(pVar, obj, m228d());
        }
    }

    /* renamed from: c */
    public static C0944c m227c() {
        C0944c cVar = f211s;
        if (cVar == null) {
            synchronized (C0944c.class) {
                cVar = f211s;
                if (cVar == null) {
                    cVar = new C0944c();
                    f211s = cVar;
                }
            }
        }
        return cVar;
    }

    /* renamed from: d */
    private boolean m228d() {
        C0954h hVar = this.f218e;
        return hVar == null || hVar.mo11540a();
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f230q + ", eventInheritance=" + this.f229p + "]";
    }

    C0944c(C0948d dVar) {
        this.f217d = new C0945a(this);
        this.f231r = dVar.mo11534a();
        this.f214a = new HashMap();
        this.f215b = new HashMap();
        this.f216c = new ConcurrentHashMap();
        C0954h b = dVar.mo11535b();
        this.f218e = b;
        this.f219f = b != null ? b.mo11539a(this) : null;
        this.f220g = new C0943b(this);
        this.f221h = new C0942a(this);
        List<C0967b> list = dVar.f249j;
        this.f230q = list != null ? list.size() : 0;
        this.f222i = new C0962o(dVar.f249j, dVar.f247h, dVar.f246g);
        this.f225l = dVar.f240a;
        this.f226m = dVar.f241b;
        this.f227n = dVar.f242c;
        this.f228o = dVar.f243d;
        this.f224k = dVar.f244e;
        this.f229p = dVar.f245f;
        this.f223j = dVar.f248i;
    }

    /* renamed from: b */
    public void mo11529b(Object obj) {
        C0947c cVar = this.f217d.get();
        List<Object> list = cVar.f233a;
        list.add(obj);
        if (!cVar.f234b) {
            cVar.f235c = m228d();
            cVar.f234b = true;
            if (!cVar.f238f) {
                while (!list.isEmpty()) {
                    try {
                        m221a(list.remove(0), cVar);
                    } finally {
                        cVar.f234b = false;
                        cVar.f235c = false;
                    }
                }
                return;
            }
            throw new C0949e("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: d */
    public synchronized void mo11531d(Object obj) {
        List<Class> list = this.f215b.get(obj);
        if (list != null) {
            for (Class a : list) {
                m223a(obj, (Class<?>) a);
            }
            this.f215b.remove(obj);
        } else {
            C0951g gVar = this.f231r;
            Level level = Level.WARNING;
            gVar.mo11537a(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* renamed from: c */
    public void mo11530c(Object obj) {
        List<C0961n> a = this.f222i.mo11546a(obj.getClass());
        synchronized (this) {
            for (C0961n a2 : a) {
                m222a(obj, a2);
            }
        }
    }

    /* renamed from: b */
    public C0951g mo11528b() {
        return this.f231r;
    }

    /* renamed from: a */
    public synchronized boolean mo11527a(Object obj) {
        return this.f215b.containsKey(obj);
    }

    /* renamed from: a */
    private void m223a(Object obj, Class<?> cls) {
        List list = this.f214a.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C0964p pVar = (C0964p) list.get(i);
                if (pVar.f284a == obj) {
                    pVar.f286c = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m221a(Object obj, C0947c cVar) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.f229p) {
            List<Class<?>> a = m218a(cls);
            int size = a.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m225a(obj, cVar, a.get(i));
            }
        } else {
            z = m225a(obj, cVar, cls);
        }
        if (!z) {
            if (this.f226m) {
                C0951g gVar = this.f231r;
                Level level = Level.FINE;
                gVar.mo11537a(level, "No subscribers registered for event " + cls);
            }
            if (this.f228o && cls != C0956i.class && cls != C0960m.class) {
                mo11529b(new C0956i(this, obj));
            }
        }
    }

    /* renamed from: a */
    private boolean m225a(Object obj, C0947c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f214a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0964p pVar = (C0964p) it.next();
            cVar.f237e = obj;
            cVar.f236d = pVar;
            try {
                m220a(pVar, obj, cVar.f235c);
                if (cVar.f238f) {
                    return true;
                }
            } finally {
                cVar.f237e = null;
                cVar.f236d = null;
                cVar.f238f = false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m220a(C0964p pVar, Object obj, boolean z) {
        int i = C0946b.f232a[pVar.f285b.f267b.ordinal()];
        if (i == 1) {
            mo11526a(pVar, obj);
        } else if (i != 2) {
            if (i == 3) {
                C0959l lVar = this.f219f;
                if (lVar != null) {
                    lVar.mo11521a(pVar, obj);
                } else {
                    mo11526a(pVar, obj);
                }
            } else if (i != 4) {
                if (i == 5) {
                    this.f221h.mo11521a(pVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + pVar.f285b.f267b);
            } else if (z) {
                this.f220g.mo11521a(pVar, obj);
            } else {
                mo11526a(pVar, obj);
            }
        } else if (z) {
            mo11526a(pVar, obj);
        } else {
            this.f219f.mo11521a(pVar, obj);
        }
    }

    /* renamed from: a */
    private static List<Class<?>> m218a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f213u;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m224a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f213u.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: a */
    static void m224a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m224a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11525a(C0957j jVar) {
        Object obj = jVar.f258a;
        C0964p pVar = jVar.f259b;
        C0957j.m252a(jVar);
        if (pVar.f286c) {
            mo11526a(pVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11526a(C0964p pVar, Object obj) {
        try {
            pVar.f285b.f266a.invoke(pVar.f284a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m219a(pVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: a */
    private void m219a(C0964p pVar, Object obj, Throwable th) {
        if (obj instanceof C0960m) {
            if (this.f225l) {
                C0951g gVar = this.f231r;
                Level level = Level.SEVERE;
                gVar.mo11538a(level, "SubscriberExceptionEvent subscriber " + pVar.f284a.getClass() + " threw an exception", th);
                C0960m mVar = (C0960m) obj;
                C0951g gVar2 = this.f231r;
                Level level2 = Level.SEVERE;
                gVar2.mo11538a(level2, "Initial event " + mVar.f264b + " caused exception in " + mVar.f265c, mVar.f263a);
            }
        } else if (!this.f224k) {
            if (this.f225l) {
                C0951g gVar3 = this.f231r;
                Level level3 = Level.SEVERE;
                gVar3.mo11538a(level3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f284a.getClass(), th);
            }
            if (this.f227n) {
                mo11529b(new C0960m(this, th, obj, pVar.f284a));
            }
        } else {
            throw new C0949e("Invoking subscriber failed", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ExecutorService mo11524a() {
        return this.f223j;
    }
}
