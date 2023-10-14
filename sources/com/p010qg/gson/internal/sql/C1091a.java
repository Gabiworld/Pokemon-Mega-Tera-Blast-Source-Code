package com.p010qg.gson.internal.sql;

import com.p010qg.gson.C1111u;
import com.p010qg.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* renamed from: com.qg.gson.internal.sql.a */
public final class C1091a {

    /* renamed from: a */
    public static final boolean f522a;

    /* renamed from: b */
    public static final C1111u f523b;

    /* renamed from: c */
    public static final C1111u f524c;

    /* renamed from: d */
    public static final C1111u f525d;

    /* renamed from: com.qg.gson.internal.sql.a$a */
    static class C1092a extends DefaultDateTypeAdapter.C0997a<Date> {
        C1092a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Date m693a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* renamed from: com.qg.gson.internal.sql.a$b */
    static class C1093b extends DefaultDateTypeAdapter.C0997a<Timestamp> {
        C1093b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Timestamp m695a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f522a = z;
        if (z) {
            new C1092a(Date.class);
            new C1093b(Timestamp.class);
            f523b = SqlDateTypeAdapter.f516b;
            f524c = SqlTimeTypeAdapter.f518b;
            f525d = SqlTimestampTypeAdapter.f520b;
            return;
        }
        f523b = null;
        f524c = null;
        f525d = null;
    }
}
