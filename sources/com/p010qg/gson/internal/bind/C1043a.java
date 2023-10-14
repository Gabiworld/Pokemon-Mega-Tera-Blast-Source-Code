package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0985f;
import com.p010qg.gson.C0988i;
import com.p010qg.gson.C1095k;
import com.p010qg.gson.C1096l;
import com.p010qg.gson.C1098n;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.qg.gson.internal.bind.a */
public final class C1043a extends C1118a {

    /* renamed from: t */
    private static final Object f456t = new Object();

    /* renamed from: p */
    private Object[] f457p;

    /* renamed from: q */
    private int f458q;

    /* renamed from: r */
    private String[] f459r;

    /* renamed from: s */
    private int[] f460s;

    /* renamed from: com.qg.gson.internal.bind.a$a */
    static class C1044a extends Reader {
        C1044a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C1044a();
    }

    /* renamed from: i */
    private String m577i() {
        return " at path " + mo11670f();
    }

    /* renamed from: u */
    private Object m578u() {
        return this.f457p[this.f458q - 1];
    }

    /* renamed from: v */
    private Object m579v() {
        Object[] objArr = this.f457p;
        int i = this.f458q - 1;
        this.f458q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo11665a() throws IOException {
        m575a(C1120b.BEGIN_ARRAY);
        m576a((Object) ((C0985f) m578u()).iterator());
        this.f460s[this.f458q - 1] = 0;
    }

    /* renamed from: b */
    public void mo11666b() throws IOException {
        m575a(C1120b.BEGIN_OBJECT);
        m576a((Object) ((C1096l) m578u()).mo11769h().iterator());
    }

    public void close() throws IOException {
        this.f457p = new Object[]{f456t};
        this.f458q = 1;
    }

    /* renamed from: d */
    public void mo11668d() throws IOException {
        m575a(C1120b.END_ARRAY);
        m579v();
        m579v();
        int i = this.f458q;
        if (i > 0) {
            int[] iArr = this.f460s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo11669e() throws IOException {
        m575a(C1120b.END_OBJECT);
        m579v();
        m579v();
        int i = this.f458q;
        if (i > 0) {
            int[] iArr = this.f460s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public String mo11670f() {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i = 0;
        while (true) {
            int i2 = this.f458q;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f457p;
            if (objArr[i] instanceof C0985f) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f460s[i]);
                    sb.append(']');
                }
            } else if ((objArr[i] instanceof C1096l) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.f459r;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    /* renamed from: g */
    public boolean mo11671g() throws IOException {
        C1120b q = mo11679q();
        return (q == C1120b.END_OBJECT || q == C1120b.END_ARRAY) ? false : true;
    }

    /* renamed from: j */
    public boolean mo11672j() throws IOException {
        m575a(C1120b.BOOLEAN);
        boolean h = ((C1098n) m579v()).mo11772h();
        int i = this.f458q;
        if (i > 0) {
            int[] iArr = this.f460s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    /* renamed from: k */
    public double mo11673k() throws IOException {
        C1120b q = mo11679q();
        if (q == C1120b.NUMBER || q == C1120b.STRING) {
            double i = ((C1098n) m578u()).mo11774i();
            if (mo11799h() || (!Double.isNaN(i) && !Double.isInfinite(i))) {
                m579v();
                int i2 = this.f458q;
                if (i2 > 0) {
                    int[] iArr = this.f460s;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return i;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + i);
        }
        throw new IllegalStateException("Expected " + C1120b.NUMBER + " but was " + q + m577i());
    }

    /* renamed from: l */
    public int mo11674l() throws IOException {
        C1120b q = mo11679q();
        if (q == C1120b.NUMBER || q == C1120b.STRING) {
            int j = ((C1098n) m578u()).mo11775j();
            m579v();
            int i = this.f458q;
            if (i > 0) {
                int[] iArr = this.f460s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        throw new IllegalStateException("Expected " + C1120b.NUMBER + " but was " + q + m577i());
    }

    /* renamed from: m */
    public long mo11675m() throws IOException {
        C1120b q = mo11679q();
        if (q == C1120b.NUMBER || q == C1120b.STRING) {
            long k = ((C1098n) m578u()).mo11776k();
            m579v();
            int i = this.f458q;
            if (i > 0) {
                int[] iArr = this.f460s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + C1120b.NUMBER + " but was " + q + m577i());
    }

    /* renamed from: n */
    public String mo11676n() throws IOException {
        m575a(C1120b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m578u()).next();
        String str = (String) entry.getKey();
        this.f459r[this.f458q - 1] = str;
        m576a(entry.getValue());
        return str;
    }

    /* renamed from: o */
    public void mo11677o() throws IOException {
        m575a(C1120b.NULL);
        m579v();
        int i = this.f458q;
        if (i > 0) {
            int[] iArr = this.f460s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: p */
    public String mo11678p() throws IOException {
        C1120b q = mo11679q();
        if (q == C1120b.STRING || q == C1120b.NUMBER) {
            String m = ((C1098n) m579v()).mo11778m();
            int i = this.f458q;
            if (i > 0) {
                int[] iArr = this.f460s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return m;
        }
        throw new IllegalStateException("Expected " + C1120b.STRING + " but was " + q + m577i());
    }

    /* renamed from: q */
    public C1120b mo11679q() throws IOException {
        if (this.f458q == 0) {
            return C1120b.END_DOCUMENT;
        }
        Object u = m578u();
        if (u instanceof Iterator) {
            boolean z = this.f457p[this.f458q - 2] instanceof C1096l;
            Iterator it = (Iterator) u;
            if (!it.hasNext()) {
                return z ? C1120b.END_OBJECT : C1120b.END_ARRAY;
            }
            if (z) {
                return C1120b.NAME;
            }
            m576a(it.next());
            return mo11679q();
        } else if (u instanceof C1096l) {
            return C1120b.BEGIN_OBJECT;
        } else {
            if (u instanceof C0985f) {
                return C1120b.BEGIN_ARRAY;
            }
            if (u instanceof C1098n) {
                C1098n nVar = (C1098n) u;
                if (nVar.mo11781p()) {
                    return C1120b.STRING;
                }
                if (nVar.mo11779n()) {
                    return C1120b.BOOLEAN;
                }
                if (nVar.mo11780o()) {
                    return C1120b.NUMBER;
                }
                throw new AssertionError();
            } else if (u instanceof C1095k) {
                return C1120b.NULL;
            } else {
                if (u == f456t) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: r */
    public void mo11680r() throws IOException {
        if (mo11679q() == C1120b.NAME) {
            mo11676n();
            this.f459r[this.f458q - 2] = "null";
        } else {
            m579v();
            int i = this.f458q;
            if (i > 0) {
                this.f459r[i - 1] = "null";
            }
        }
        int i2 = this.f458q;
        if (i2 > 0) {
            int[] iArr = this.f460s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0988i mo11681s() throws IOException {
        C1120b q = mo11679q();
        if (q == C1120b.NAME || q == C1120b.END_ARRAY || q == C1120b.END_OBJECT || q == C1120b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + q + " when reading a JsonElement.");
        }
        C0988i iVar = (C0988i) m578u();
        mo11680r();
        return iVar;
    }

    /* renamed from: t */
    public void mo11682t() throws IOException {
        m575a(C1120b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m578u()).next();
        m576a(entry.getValue());
        m576a((Object) new C1098n((String) entry.getKey()));
    }

    public String toString() {
        return C1043a.class.getSimpleName() + m577i();
    }

    /* renamed from: a */
    private void m575a(C1120b bVar) throws IOException {
        if (mo11679q() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo11679q() + m577i());
        }
    }

    /* renamed from: a */
    private void m576a(Object obj) {
        int i = this.f458q;
        Object[] objArr = this.f457p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f457p = Arrays.copyOf(objArr, i2);
            this.f460s = Arrays.copyOf(this.f460s, i2);
            this.f459r = (String[]) Arrays.copyOf(this.f459r, i2);
        }
        Object[] objArr2 = this.f457p;
        int i3 = this.f458q;
        this.f458q = i3 + 1;
        objArr2[i3] = obj;
    }
}
