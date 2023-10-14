package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1105s;
import com.p010qg.gson.C1110t;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;

/* renamed from: com.qg.gson.internal.bind.NumberTypeAdapter */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b */
    private static final C1111u f349b = m419b(C1105s.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    private final C1110t f350a;

    /* renamed from: com.qg.gson.internal.bind.NumberTypeAdapter$a */
    static /* synthetic */ class C1000a {

        /* renamed from: a */
        static final /* synthetic */ int[] f352a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.qg.gson.x.b[] r0 = com.p010qg.gson.p025x.C1120b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f352a = r0
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f352a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f352a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.NumberTypeAdapter.C1000a.<clinit>():void");
        }
    }

    private NumberTypeAdapter(C1110t tVar) {
        this.f350a = tVar;
    }

    /* renamed from: b */
    private static C1111u m419b(C1110t tVar) {
        return new C1111u(new NumberTypeAdapter(tVar)) {

            /* renamed from: a */
            final /* synthetic */ NumberTypeAdapter f351a;

            {
                this.f351a = r1;
            }

            /* renamed from: a */
            public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
                if (aVar.mo11792a() == Number.class) {
                    return this.f351a;
                }
                return null;
            }
        };
    }

    /* renamed from: a */
    public static C1111u m418a(C1110t tVar) {
        if (tVar == C1105s.LAZILY_PARSED_NUMBER) {
            return f349b;
        }
        return m419b(tVar);
    }

    /* renamed from: a */
    public Number m421a(C1118a aVar) throws IOException {
        C1120b q = aVar.mo11679q();
        int i = C1000a.f352a[q.ordinal()];
        if (i == 1) {
            aVar.mo11677o();
            return null;
        } else if (i == 2 || i == 3) {
            return this.f350a.mo11783a(aVar);
        } else {
            throw new C1101q("Expecting number, got: " + q);
        }
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, Number number) throws IOException {
        cVar.mo11689a(number);
    }
}
