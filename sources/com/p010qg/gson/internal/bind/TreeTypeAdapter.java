package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0986g;
import com.p010qg.gson.C0987h;
import com.p010qg.gson.C0988i;
import com.p010qg.gson.C1099o;
import com.p010qg.gson.C1100p;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C1077k;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;

/* renamed from: com.qg.gson.internal.bind.TreeTypeAdapter */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final C1100p<T> f374a;

    /* renamed from: b */
    private final C0987h<T> f375b;

    /* renamed from: c */
    final Gson f376c;

    /* renamed from: d */
    private final C1117a<T> f377d;

    /* renamed from: e */
    private final C1111u f378e;

    /* renamed from: f */
    private final TreeTypeAdapter<T>.b f379f = new C1006b();

    /* renamed from: g */
    private TypeAdapter<T> f380g;

    /* renamed from: com.qg.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory */
    private static final class SingleTypeFactory implements C1111u {

        /* renamed from: a */
        private final C1117a<?> f381a;

        /* renamed from: b */
        private final boolean f382b;

        /* renamed from: c */
        private final Class<?> f383c;

        /* renamed from: d */
        private final C1100p<?> f384d;

        /* renamed from: e */
        private final C0987h<?> f385e;

        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            boolean z;
            C1117a<?> aVar2 = this.f381a;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f382b && this.f381a.mo11793b() == aVar.mo11792a());
            } else {
                z = this.f383c.isAssignableFrom(aVar.mo11792a());
            }
            if (z) {
                return new TreeTypeAdapter(this.f384d, this.f385e, gson, aVar, this);
            }
            return null;
        }
    }

    /* renamed from: com.qg.gson.internal.bind.TreeTypeAdapter$b */
    private final class C1006b implements C1099o, C0986g {
        private C1006b(TreeTypeAdapter treeTypeAdapter) {
        }
    }

    public TreeTypeAdapter(C1100p<T> pVar, C0987h<T> hVar, Gson gson, C1117a<T> aVar, C1111u uVar) {
        this.f374a = pVar;
        this.f375b = hVar;
        this.f376c = gson;
        this.f377d = aVar;
        this.f378e = uVar;
    }

    /* renamed from: b */
    private TypeAdapter<T> m444b() {
        TypeAdapter<T> typeAdapter = this.f380g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> a = this.f376c.mo11557a(this.f378e, this.f377d);
        this.f380g = a;
        return a;
    }

    /* renamed from: a */
    public T mo11574a(C1118a aVar) throws IOException {
        if (this.f375b == null) {
            return m444b().mo11574a(aVar);
        }
        C0988i a = C1077k.m660a(aVar);
        if (a.mo11597e()) {
            return null;
        }
        return this.f375b.mo11592a(a, this.f377d.mo11793b(), this.f379f);
    }

    /* renamed from: a */
    public void mo11576a(C1121c cVar, T t) throws IOException {
        C1100p<T> pVar = this.f374a;
        if (pVar == null) {
            m444b().mo11576a(cVar, t);
        } else if (t == null) {
            cVar.mo11698h();
        } else {
            C1077k.m662a(pVar.mo11782a(t, this.f377d.mo11793b(), this.f379f), cVar);
        }
    }
}
