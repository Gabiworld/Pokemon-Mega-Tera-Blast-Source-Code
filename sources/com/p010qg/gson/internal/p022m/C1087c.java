package com.p010qg.gson.internal.p022m;

import com.p010qg.gson.C1094j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.qg.gson.internal.m.c */
final class C1087c extends C1086b {

    /* renamed from: d */
    private static Class f513d;

    /* renamed from: b */
    private final Object f514b = m674c();

    /* renamed from: c */
    private final Field f515c = m673b();

    C1087c() {
    }

    /* renamed from: c */
    private static Object m674c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f513d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo11760a(AccessibleObject accessibleObject) {
        if (!mo11761b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C1094j("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11761b(AccessibleObject accessibleObject) {
        if (!(this.f514b == null || this.f515c == null)) {
            try {
                long longValue = ((Long) f513d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f514b, new Object[]{this.f515c})).longValue();
                Class cls = f513d;
                cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f514b, new Object[]{accessibleObject, Long.valueOf(longValue), true});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static Field m673b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }
}
