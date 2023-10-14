package com.p010qg.gson;

import com.p010qg.gson.internal.C1066g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.qg.gson.l */
public final class C1096l extends C0988i {

    /* renamed from: a */
    private final C1066g<String, C0988i> f527a = new C1066g<>();

    /* renamed from: a */
    public void mo11767a(String str, C0988i iVar) {
        C1066g<String, C0988i> gVar = this.f527a;
        if (iVar == null) {
            iVar = C1095k.f526a;
        }
        gVar.put(str, iVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1096l) && ((C1096l) obj).f527a.equals(this.f527a));
    }

    /* renamed from: h */
    public Set<Map.Entry<String, C0988i>> mo11769h() {
        return this.f527a.entrySet();
    }

    public int hashCode() {
        return this.f527a.hashCode();
    }
}
