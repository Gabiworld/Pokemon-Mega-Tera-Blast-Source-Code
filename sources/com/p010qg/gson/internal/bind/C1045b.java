package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0985f;
import com.p010qg.gson.C0988i;
import com.p010qg.gson.C1095k;
import com.p010qg.gson.C1096l;
import com.p010qg.gson.C1098n;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.qg.gson.internal.bind.b */
public final class C1045b extends C1121c {

    /* renamed from: o */
    private static final Writer f461o = new C1046a();

    /* renamed from: p */
    private static final C1098n f462p = new C1098n("closed");

    /* renamed from: l */
    private final List<C0988i> f463l = new ArrayList();

    /* renamed from: m */
    private String f464m;

    /* renamed from: n */
    private C0988i f465n = C1095k.f526a;

    /* renamed from: com.qg.gson.internal.bind.b$a */
    static class C1046a extends Writer {
        C1046a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C1045b() {
        super(f461o);
    }

    /* renamed from: a */
    private void m597a(C0988i iVar) {
        if (this.f464m != null) {
            if (!iVar.mo11597e() || mo11805e()) {
                ((C1096l) m598j()).mo11767a(this.f464m, iVar);
            }
            this.f464m = null;
        } else if (this.f463l.isEmpty()) {
            this.f465n = iVar;
        } else {
            C0988i j = m598j();
            if (j instanceof C0985f) {
                ((C0985f) j).mo11588a(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private C0988i m598j() {
        List<C0988i> list = this.f463l;
        return list.get(list.size() - 1);
    }

    /* renamed from: b */
    public C1121c mo11691b() throws IOException {
        C1096l lVar = new C1096l();
        m597a((C0988i) lVar);
        this.f463l.add(lVar);
        return this;
    }

    /* renamed from: c */
    public C1121c mo11692c() throws IOException {
        if (this.f463l.isEmpty() || this.f464m != null) {
            throw new IllegalStateException();
        } else if (m598j() instanceof C0985f) {
            List<C0988i> list = this.f463l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() throws IOException {
        if (this.f463l.isEmpty()) {
            this.f463l.add(f462p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C1121c mo11695d() throws IOException {
        if (this.f463l.isEmpty() || this.f464m != null) {
            throw new IllegalStateException();
        } else if (m598j() instanceof C1096l) {
            List<C0988i> list = this.f463l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    /* renamed from: h */
    public C1121c mo11698h() throws IOException {
        m597a((C0988i) C1095k.f526a);
        return this;
    }

    /* renamed from: i */
    public C0988i mo11699i() {
        if (this.f463l.isEmpty()) {
            return this.f465n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f463l);
    }

    /* renamed from: c */
    public C1121c mo11693c(String str) throws IOException {
        if (str == null) {
            return mo11698h();
        }
        m597a((C0988i) new C1098n(str));
        return this;
    }

    /* renamed from: d */
    public C1121c mo11696d(boolean z) throws IOException {
        m597a((C0988i) new C1098n(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C1121c mo11686a() throws IOException {
        C0985f fVar = new C0985f();
        m597a((C0988i) fVar);
        this.f463l.add(fVar);
        return this;
    }

    /* renamed from: a */
    public C1121c mo11690a(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f463l.isEmpty() || this.f464m != null) {
            throw new IllegalStateException();
        } else if (m598j() instanceof C1096l) {
            this.f464m = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C1121c mo11688a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo11698h();
        }
        m597a((C0988i) new C1098n(bool));
        return this;
    }

    /* renamed from: a */
    public C1121c mo11687a(long j) throws IOException {
        m597a((C0988i) new C1098n((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C1121c mo11689a(Number number) throws IOException {
        if (number == null) {
            return mo11698h();
        }
        if (!mo11807g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m597a((C0988i) new C1098n(number));
        return this;
    }
}
