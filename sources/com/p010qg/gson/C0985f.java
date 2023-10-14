package com.p010qg.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qg.gson.f */
public final class C0985f extends C0988i implements Iterable<C0988i> {

    /* renamed from: a */
    private final List<C0988i> f311a = new ArrayList();

    /* renamed from: a */
    public void mo11588a(C0988i iVar) {
        if (iVar == null) {
            iVar = C1095k.f526a;
        }
        this.f311a.add(iVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0985f) && ((C0985f) obj).f311a.equals(this.f311a));
    }

    public int hashCode() {
        return this.f311a.hashCode();
    }

    public Iterator<C0988i> iterator() {
        return this.f311a.iterator();
    }
}
