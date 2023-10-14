package com.p010qg.gson.p025x;

import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.qg.gson.x.c */
public class C1121c implements Closeable, Flushable {

    /* renamed from: j */
    private static final String[] f566j = new String[128];

    /* renamed from: k */
    private static final String[] f567k;

    /* renamed from: a */
    private final Writer f568a;

    /* renamed from: b */
    private int[] f569b = new int[32];

    /* renamed from: c */
    private int f570c = 0;

    /* renamed from: d */
    private String f571d;

    /* renamed from: e */
    private String f572e;

    /* renamed from: f */
    private boolean f573f;

    /* renamed from: g */
    private boolean f574g;

    /* renamed from: h */
    private String f575h;

    /* renamed from: i */
    private boolean f576i;

    static {
        for (int i = 0; i <= 31; i++) {
            f566j[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f566j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f567k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1121c(Writer writer) {
        m760a(6);
        this.f572e = CertificateUtil.DELIMITER;
        this.f576i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f568a = writer;
    }

    /* renamed from: i */
    private void mo11699i() throws IOException {
        int l = m766l();
        if (l == 5) {
            this.f568a.write(44);
        } else if (l != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m765k();
        m761b(4);
    }

    /* renamed from: j */
    private void m764j() throws IOException {
        int l = m766l();
        if (l == 1) {
            m761b(2);
            m765k();
        } else if (l == 2) {
            this.f568a.append(',');
            m765k();
        } else if (l != 4) {
            if (l != 6) {
                if (l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f573f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m761b(7);
        } else {
            this.f568a.append(this.f572e);
            m761b(5);
        }
    }

    /* renamed from: k */
    private void m765k() throws IOException {
        if (this.f571d != null) {
            this.f568a.write(10);
            int i = this.f570c;
            for (int i2 = 1; i2 < i; i2++) {
                this.f568a.write(this.f571d);
            }
        }
    }

    /* renamed from: l */
    private int m766l() {
        int i = this.f570c;
        if (i != 0) {
            return this.f569b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    private void m767m() throws IOException {
        if (this.f575h != null) {
            mo11699i();
            m762d(this.f575h);
            this.f575h = null;
        }
    }

    /* renamed from: a */
    public final void mo11801a(boolean z) {
        this.f574g = z;
    }

    /* renamed from: b */
    public final void mo11802b(String str) {
        if (str.length() == 0) {
            this.f571d = null;
            this.f572e = CertificateUtil.DELIMITER;
            return;
        }
        this.f571d = str;
        this.f572e = ": ";
    }

    /* renamed from: c */
    public final void mo11804c(boolean z) {
        this.f576i = z;
    }

    public void close() throws IOException {
        this.f568a.close();
        int i = this.f570c;
        if (i > 1 || (i == 1 && this.f569b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f570c = 0;
    }

    /* renamed from: d */
    public C1121c mo11695d() throws IOException {
        return m759a(3, 5, '}');
    }

    /* renamed from: e */
    public final boolean mo11805e() {
        return this.f576i;
    }

    /* renamed from: f */
    public final boolean mo11806f() {
        return this.f574g;
    }

    public void flush() throws IOException {
        if (this.f570c != 0) {
            this.f568a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo11807g() {
        return this.f573f;
    }

    /* renamed from: h */
    public C1121c mo11698h() throws IOException {
        if (this.f575h != null) {
            if (this.f576i) {
                m767m();
            } else {
                this.f575h = null;
                return this;
            }
        }
        m764j();
        this.f568a.write("null");
        return this;
    }

    /* renamed from: a */
    public C1121c mo11686a() throws IOException {
        m767m();
        return m758a(1, '[');
    }

    /* renamed from: c */
    public C1121c mo11692c() throws IOException {
        return m759a(1, 2, ']');
    }

    /* renamed from: d */
    public C1121c mo11696d(boolean z) throws IOException {
        m767m();
        m764j();
        this.f568a.write(z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: c */
    public C1121c mo11693c(String str) throws IOException {
        if (str == null) {
            return mo11698h();
        }
        m767m();
        m764j();
        m762d(str);
        return this;
    }

    /* renamed from: a */
    private C1121c m758a(int i, char c) throws IOException {
        m764j();
        m760a(i);
        this.f568a.write(c);
        return this;
    }

    /* renamed from: d */
    private void m762d(String str) throws IOException {
        String str2;
        String[] strArr = this.f574g ? f567k : f566j;
        this.f568a.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f568a.write(str, i, i2 - i);
            }
            this.f568a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f568a.write(str, i, length - i);
        }
        this.f568a.write(34);
    }

    /* renamed from: a */
    private C1121c m759a(int i, int i2, char c) throws IOException {
        int l = m766l();
        if (l != i2 && l != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f575h == null) {
            this.f570c--;
            if (l == i2) {
                m765k();
            }
            this.f568a.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f575h);
        }
    }

    /* renamed from: b */
    public final void mo11803b(boolean z) {
        this.f573f = z;
    }

    /* renamed from: b */
    public C1121c mo11691b() throws IOException {
        m767m();
        return m758a(3, '{');
    }

    /* renamed from: b */
    private void m761b(int i) {
        this.f569b[this.f570c - 1] = i;
    }

    /* renamed from: a */
    private void m760a(int i) {
        int i2 = this.f570c;
        int[] iArr = this.f569b;
        if (i2 == iArr.length) {
            this.f569b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f569b;
        int i3 = this.f570c;
        this.f570c = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: a */
    public C1121c mo11690a(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f575h != null) {
            throw new IllegalStateException();
        } else if (this.f570c != 0) {
            this.f575h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C1121c mo11688a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo11698h();
        }
        m767m();
        m764j();
        this.f568a.write(bool.booleanValue() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: a */
    public C1121c mo11687a(long j) throws IOException {
        m767m();
        m764j();
        this.f568a.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C1121c mo11689a(Number number) throws IOException {
        if (number == null) {
            return mo11698h();
        }
        m767m();
        String obj = number.toString();
        if (this.f573f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m764j();
            this.f568a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
