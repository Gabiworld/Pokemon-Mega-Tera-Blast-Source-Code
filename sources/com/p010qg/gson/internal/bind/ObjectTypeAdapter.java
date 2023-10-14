package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1105s;
import com.p010qg.gson.C1110t;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C1066g;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.qg.gson.internal.bind.ObjectTypeAdapter */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c */
    private static final C1111u f353c = m426b(C1105s.DOUBLE);

    /* renamed from: a */
    private final Gson f354a;

    /* renamed from: b */
    private final C1110t f355b;

    /* renamed from: com.qg.gson.internal.bind.ObjectTypeAdapter$a */
    static /* synthetic */ class C1002a {

        /* renamed from: a */
        static final /* synthetic */ int[] f357a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.qg.gson.x.b[] r0 = com.p010qg.gson.p025x.C1120b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f357a = r0
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f357a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f357a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f357a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f357a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f357a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.ObjectTypeAdapter.C1002a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C1111u m425a(C1110t tVar) {
        if (tVar == C1105s.DOUBLE) {
            return f353c;
        }
        return m426b(tVar);
    }

    /* renamed from: b */
    private static C1111u m426b(final C1110t tVar) {
        return new C1111u() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
                if (aVar.mo11792a() == Object.class) {
                    return new ObjectTypeAdapter(gson, tVar);
                }
                return null;
            }
        };
    }

    private ObjectTypeAdapter(Gson gson, C1110t tVar) {
        this.f354a = gson;
        this.f355b = tVar;
    }

    /* renamed from: a */
    public Object mo11574a(C1118a aVar) throws IOException {
        switch (C1002a.f357a[aVar.mo11679q().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo11665a();
                while (aVar.mo11671g()) {
                    arrayList.add(mo11574a(aVar));
                }
                aVar.mo11668d();
                return arrayList;
            case 2:
                C1066g gVar = new C1066g();
                aVar.mo11666b();
                while (aVar.mo11671g()) {
                    gVar.put(aVar.mo11676n(), mo11574a(aVar));
                }
                aVar.mo11669e();
                return gVar;
            case 3:
                return aVar.mo11678p();
            case 4:
                return this.f355b.mo11783a(aVar);
            case 5:
                return Boolean.valueOf(aVar.mo11672j());
            case 6:
                aVar.mo11677o();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo11698h();
            return;
        }
        TypeAdapter<?> a = this.f354a.mo11559a(obj.getClass());
        if (a instanceof ObjectTypeAdapter) {
            cVar.mo11691b();
            cVar.mo11695d();
            return;
        }
        a.mo11576a(cVar, obj);
    }
}
