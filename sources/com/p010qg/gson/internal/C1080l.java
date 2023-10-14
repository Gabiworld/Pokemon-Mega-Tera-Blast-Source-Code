package com.p010qg.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.qg.gson.internal.l */
public abstract class C1080l {

    /* renamed from: com.qg.gson.internal.l$a */
    static class C1081a extends C1080l {

        /* renamed from: a */
        final /* synthetic */ Method f507a;

        /* renamed from: b */
        final /* synthetic */ Object f508b;

        C1081a(Method method, Object obj) {
            this.f507a = method;
            this.f508b = obj;
        }

        /* renamed from: a */
        public <T> T mo11759a(Class<T> cls) throws Exception {
            C1080l.m664b(cls);
            return this.f507a.invoke(this.f508b, new Object[]{cls});
        }
    }

    /* renamed from: com.qg.gson.internal.l$b */
    static class C1082b extends C1080l {

        /* renamed from: a */
        final /* synthetic */ Method f509a;

        /* renamed from: b */
        final /* synthetic */ int f510b;

        C1082b(Method method, int i) {
            this.f509a = method;
            this.f510b = i;
        }

        /* renamed from: a */
        public <T> T mo11759a(Class<T> cls) throws Exception {
            C1080l.m664b(cls);
            return this.f509a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f510b)});
        }
    }

    /* renamed from: com.qg.gson.internal.l$c */
    static class C1083c extends C1080l {

        /* renamed from: a */
        final /* synthetic */ Method f511a;

        C1083c(Method method) {
            this.f511a = method;
        }

        /* renamed from: a */
        public <T> T mo11759a(Class<T> cls) throws Exception {
            C1080l.m664b(cls);
            return this.f511a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.qg.gson.internal.l$d */
    static class C1084d extends C1080l {
        C1084d() {
        }

        /* renamed from: a */
        public <T> T mo11759a(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    public static C1080l m663a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C1081a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C1082b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C1083c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C1084d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m664b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo11759a(Class<T> cls) throws Exception;
}
