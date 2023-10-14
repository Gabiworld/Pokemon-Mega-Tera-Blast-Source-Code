package com.p010qg.gson;

import com.p010qg.gson.internal.bind.C1045b;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;

/* renamed from: com.qg.gson.TypeAdapter */
public abstract class TypeAdapter<T> {
    /* renamed from: a */
    public final TypeAdapter<T> mo11582a() {
        return new TypeAdapter<T>() {
            /* renamed from: a */
            public void mo11576a(C1121c cVar, T t) throws IOException {
                if (t == null) {
                    cVar.mo11698h();
                } else {
                    TypeAdapter.this.mo11576a(cVar, t);
                }
            }

            /* renamed from: a */
            public T mo11574a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return TypeAdapter.this.mo11574a(aVar);
                }
                aVar.mo11677o();
                return null;
            }
        };
    }

    /* renamed from: a */
    public abstract T mo11574a(C1118a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo11576a(C1121c cVar, T t) throws IOException;

    /* renamed from: a */
    public final C0988i mo11583a(T t) {
        try {
            C1045b bVar = new C1045b();
            mo11576a(bVar, t);
            return bVar.mo11699i();
        } catch (IOException e) {
            throw new C1094j((Throwable) e);
        }
    }
}
