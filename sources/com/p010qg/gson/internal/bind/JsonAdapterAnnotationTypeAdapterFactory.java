package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C1048c;
import com.p010qg.gson.p023v.C1113b;
import com.p010qg.gson.p024w.C1117a;

/* renamed from: com.qg.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory */
public final class JsonAdapterAnnotationTypeAdapterFactory implements C1111u {

    /* renamed from: a */
    private final C1048c f342a;

    public JsonAdapterAnnotationTypeAdapterFactory(C1048c cVar) {
        this.f342a = cVar;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
        C1113b bVar = (C1113b) aVar.mo11792a().getAnnotation(C1113b.class);
        if (bVar == null) {
            return null;
        }
        return mo11625a(this.f342a, gson, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.qg.gson.TypeAdapter<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.qg.gson.TypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.qg.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.qg.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.qg.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.qg.gson.TypeAdapter, com.qg.gson.TypeAdapter<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p010qg.gson.TypeAdapter<?> mo11625a(com.p010qg.gson.internal.C1048c r9, com.p010qg.gson.Gson r10, com.p010qg.gson.p024w.C1117a<?> r11, com.p010qg.gson.p023v.C1113b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.qg.gson.w.a r0 = com.p010qg.gson.p024w.C1117a.m717a(r0)
            com.qg.gson.internal.h r9 = r9.mo11703a(r0)
            java.lang.Object r9 = r9.mo11705a()
            boolean r0 = r9 instanceof com.p010qg.gson.TypeAdapter
            if (r0 == 0) goto L_0x0017
            com.qg.gson.TypeAdapter r9 = (com.p010qg.gson.TypeAdapter) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.p010qg.gson.C1111u
            if (r0 == 0) goto L_0x0022
            com.qg.gson.u r9 = (com.p010qg.gson.C1111u) r9
            com.qg.gson.TypeAdapter r9 = r9.mo11601a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.p010qg.gson.C1100p
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.p010qg.gson.C0987h
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.qg.gson.p r0 = (com.p010qg.gson.C1100p) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.p010qg.gson.C0987h
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.qg.gson.h r1 = (com.p010qg.gson.C0987h) r1
        L_0x006b:
            r4 = r1
            com.qg.gson.internal.bind.TreeTypeAdapter r9 = new com.qg.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.qg.gson.TypeAdapter r9 = r9.mo11582a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo11625a(com.qg.gson.internal.c, com.qg.gson.Gson, com.qg.gson.w.a, com.qg.gson.v.b):com.qg.gson.TypeAdapter");
    }
}
