package com.p010qg.gson.p025x;

import com.facebook.internal.ServerProtocol;
import com.p010qg.gson.internal.C1064e;
import com.p010qg.gson.internal.bind.C1043a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.Typography;

/* renamed from: com.qg.gson.x.a */
public class C1118a implements Closeable {

    /* renamed from: a */
    private final Reader f540a;

    /* renamed from: b */
    private boolean f541b = false;

    /* renamed from: c */
    private final char[] f542c = new char[1024];

    /* renamed from: d */
    private int f543d = 0;

    /* renamed from: e */
    private int f544e = 0;

    /* renamed from: f */
    private int f545f = 0;

    /* renamed from: g */
    private int f546g = 0;

    /* renamed from: h */
    int f547h = 0;

    /* renamed from: i */
    private long f548i;

    /* renamed from: j */
    private int f549j;

    /* renamed from: k */
    private String f550k;

    /* renamed from: l */
    private int[] f551l;

    /* renamed from: m */
    private int f552m;

    /* renamed from: n */
    private String[] f553n;

    /* renamed from: o */
    private int[] f554o;

    /* renamed from: com.qg.gson.x.a$a */
    static class C1119a extends C1064e {
        C1119a() {
        }

        /* renamed from: a */
        public void mo11706a(C1118a aVar) throws IOException {
            if (aVar instanceof C1043a) {
                ((C1043a) aVar).mo11682t();
                return;
            }
            int i = aVar.f547h;
            if (i == 0) {
                i = aVar.mo11798c();
            }
            if (i == 13) {
                aVar.f547h = 9;
            } else if (i == 12) {
                aVar.f547h = 8;
            } else if (i == 14) {
                aVar.f547h = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo11679q() + aVar.mo11800i());
            }
        }
    }

    static {
        C1064e.f479a = new C1119a();
    }

    public C1118a(Reader reader) {
        int[] iArr = new int[32];
        this.f551l = iArr;
        this.f552m = 0;
        this.f552m = 1;
        iArr[0] = 6;
        this.f553n = new String[32];
        this.f554o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f540a = reader;
    }

    /* renamed from: s */
    private void mo11681s() throws IOException {
        if (!this.f541b) {
            m726b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: t */
    private void mo11682t() throws IOException {
        m725b(true);
        int i = this.f543d - 1;
        this.f543d = i;
        if (i + 5 <= this.f544e || m723a(5)) {
            char[] cArr = this.f542c;
            if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == 10) {
                this.f543d += 5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        mo11681s();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m732u() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r5.f543d
            int r3 = r3 + r2
            int r4 = r5.f544e
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f542c
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x0048;
                case 93: goto L_0x005a;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.mo11681s()
            goto L_0x005a
        L_0x004c:
            char[] r3 = r5.f542c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r5.m723a((int) r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r0 = r2
            goto L_0x007c
        L_0x005c:
            if (r1 != 0) goto L_0x0069
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x0069:
            char[] r3 = r5.f542c
            int r4 = r5.f543d
            r1.append(r3, r4, r2)
            int r3 = r5.f543d
            int r3 = r3 + r2
            r5.f543d = r3
            r2 = 1
            boolean r2 = r5.m723a((int) r2)
            if (r2 != 0) goto L_0x0002
        L_0x007c:
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f542c
            int r3 = r5.f543d
            r1.<init>(r2, r3, r0)
            goto L_0x0093
        L_0x0088:
            char[] r2 = r5.f542c
            int r3 = r5.f543d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0093:
            int r2 = r5.f543d
            int r2 = r2 + r0
            r5.f543d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.p025x.C1118a.m732u():java.lang.String");
    }

    /* renamed from: v */
    private int m733v() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f542c[this.f543d];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f543d + i2 >= this.f544e && !m723a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f542c[this.f543d + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f543d + length < this.f544e || m723a(length + 1)) && m722a(this.f542c[this.f543d + length])) {
            return 0;
        }
        this.f543d += length;
        this.f547h = i;
        return i;
    }

    /* renamed from: w */
    private int m734w() throws IOException {
        char c;
        char[] cArr = this.f542c;
        int i = this.f543d;
        int i2 = this.f544e;
        int i3 = 0;
        int i4 = 0;
        char c2 = 0;
        long j = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m723a(i4 + 1)) {
                    break;
                }
                i = this.f543d;
                i2 = this.f544e;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i3 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i3 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i3 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i3 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            z2 &= i5 > 0 || (i5 == 0 && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i3 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i3 = 0;
                            c2 = 7;
                        }
                        i3 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m722a(c)) {
            return 0;
        }
        if (c2 == 2 && z2 && ((j != Long.MIN_VALUE || z) && (j != 0 || !z))) {
            if (!z) {
                j = -j;
            }
            this.f548i = j;
            this.f543d += i4;
            this.f547h = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f549j = i4;
            this.f547h = 16;
            return 16;
        }
    }

    /* renamed from: x */
    private char m735x() throws IOException {
        int i;
        int i2;
        if (this.f543d != this.f544e || m723a(1)) {
            char[] cArr = this.f542c;
            int i3 = this.f543d;
            int i4 = i3 + 1;
            this.f543d = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f545f++;
                this.f546g = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m726b("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f544e || m723a(4)) {
                    char c2 = 0;
                    int i5 = this.f543d;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f542c[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f542c, this.f543d, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f543d += 4;
                    return c2;
                } else {
                    m726b("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        m726b("Unterminated escape sequence");
        throw null;
    }

    /* renamed from: y */
    private void m736y() throws IOException {
        char c;
        do {
            if (this.f543d < this.f544e || m723a(1)) {
                char[] cArr = this.f542c;
                int i = this.f543d;
                int i2 = i + 1;
                this.f543d = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f545f++;
                    this.f546g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: z */
    private void m737z() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f543d + i;
                if (i2 < this.f544e) {
                    char c = this.f542c[i2];
                    if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                        if (c != '#') {
                            if (c != ',') {
                                if (!(c == '/' || c == '=')) {
                                    if (!(c == '{' || c == '}' || c == ':')) {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f543d = i2;
                }
            }
            mo11681s();
            this.f543d += i;
            return;
        } while (m723a(1));
    }

    /* renamed from: a */
    public final void mo11797a(boolean z) {
        this.f541b = z;
    }

    /* renamed from: b */
    public void mo11666b() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 1) {
            m728b(3);
            this.f547h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo11679q() + mo11800i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo11798c() throws IOException {
        int b;
        int[] iArr = this.f551l;
        int i = this.f552m;
        int i2 = i - 1;
        int i3 = iArr[i2];
        if (i3 == 1) {
            iArr[i2] = 2;
        } else if (i3 == 2) {
            int b2 = m725b(true);
            if (b2 != 44) {
                if (b2 == 59) {
                    mo11681s();
                } else if (b2 == 93) {
                    this.f547h = 4;
                    return 4;
                } else {
                    m726b("Unterminated array");
                    throw null;
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i - 1] = 4;
            if (i3 == 5 && (b = m725b(true)) != 44) {
                if (b == 59) {
                    mo11681s();
                } else if (b == 125) {
                    this.f547h = 2;
                    return 2;
                } else {
                    m726b("Unterminated object");
                    throw null;
                }
            }
            int b3 = m725b(true);
            if (b3 == 34) {
                this.f547h = 13;
                return 13;
            } else if (b3 == 39) {
                mo11681s();
                this.f547h = 12;
                return 12;
            } else if (b3 != 125) {
                mo11681s();
                this.f543d--;
                if (m722a((char) b3)) {
                    this.f547h = 14;
                    return 14;
                }
                m726b("Expected name");
                throw null;
            } else if (i3 != 5) {
                this.f547h = 2;
                return 2;
            } else {
                m726b("Expected name");
                throw null;
            }
        } else if (i3 == 4) {
            iArr[i2] = 5;
            int b4 = m725b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    mo11681s();
                    if (this.f543d < this.f544e || m723a(1)) {
                        char[] cArr = this.f542c;
                        int i4 = this.f543d;
                        if (cArr[i4] == '>') {
                            this.f543d = i4 + 1;
                        }
                    }
                } else {
                    m726b("Expected ':'");
                    throw null;
                }
            }
        } else if (i3 == 6) {
            if (this.f541b) {
                mo11682t();
            }
            this.f551l[this.f552m - 1] = 7;
        } else if (i3 == 7) {
            if (m725b(false) == -1) {
                this.f547h = 17;
                return 17;
            }
            mo11681s();
            this.f543d--;
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m725b(true);
        if (b5 == 34) {
            this.f547h = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f547h = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f543d--;
                        int v = m733v();
                        if (v != 0) {
                            return v;
                        }
                        int w = m734w();
                        if (w != 0) {
                            return w;
                        }
                        if (m722a(this.f542c[this.f543d])) {
                            mo11681s();
                            this.f547h = 10;
                            return 10;
                        }
                        m726b("Expected value");
                        throw null;
                    }
                    this.f547h = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.f547h = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                mo11681s();
                this.f543d--;
                this.f547h = 7;
                return 7;
            }
            m726b("Unexpected value");
            throw null;
        } else {
            mo11681s();
            this.f547h = 8;
            return 8;
        }
    }

    public void close() throws IOException {
        this.f547h = 0;
        this.f551l[0] = 8;
        this.f552m = 1;
        this.f540a.close();
    }

    /* renamed from: d */
    public void mo11668d() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 4) {
            int i2 = this.f552m - 1;
            this.f552m = i2;
            int[] iArr = this.f554o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f547h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo11679q() + mo11800i());
    }

    /* renamed from: e */
    public void mo11669e() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 2) {
            int i2 = this.f552m - 1;
            this.f552m = i2;
            this.f553n[i2] = null;
            int[] iArr = this.f554o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f547h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo11679q() + mo11800i());
    }

    /* renamed from: f */
    public String mo11670f() {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i = this.f552m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f551l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f554o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f553n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo11671g() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: h */
    public final boolean mo11799h() {
        return this.f541b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo11800i() {
        return " at line " + (this.f545f + 1) + " column " + ((this.f543d - this.f546g) + 1) + " path " + mo11670f();
    }

    /* renamed from: j */
    public boolean mo11672j() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 5) {
            this.f547h = 0;
            int[] iArr = this.f554o;
            int i2 = this.f552m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f547h = 0;
            int[] iArr2 = this.f554o;
            int i3 = this.f552m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo11679q() + mo11800i());
        }
    }

    /* renamed from: k */
    public double mo11673k() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 15) {
            this.f547h = 0;
            int[] iArr = this.f554o;
            int i2 = this.f552m - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f548i;
        }
        if (i == 16) {
            this.f550k = new String(this.f542c, this.f543d, this.f549j);
            this.f543d += this.f549j;
        } else if (i == 8 || i == 9) {
            this.f550k = m727b(i == 8 ? '\'' : Typography.quote);
        } else if (i == 10) {
            this.f550k = m732u();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo11679q() + mo11800i());
        }
        this.f547h = 11;
        double parseDouble = Double.parseDouble(this.f550k);
        if (this.f541b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f550k = null;
            this.f547h = 0;
            int[] iArr2 = this.f554o;
            int i3 = this.f552m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C1122d("JSON forbids NaN and infinities: " + parseDouble + mo11800i());
    }

    /* renamed from: l */
    public int mo11674l() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 15) {
            long j = this.f548i;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f547h = 0;
                int[] iArr = this.f554o;
                int i3 = this.f552m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f548i + mo11800i());
        }
        if (i == 16) {
            this.f550k = new String(this.f542c, this.f543d, this.f549j);
            this.f543d += this.f549j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f550k = m732u();
            } else {
                this.f550k = m727b(i == 8 ? '\'' : Typography.quote);
            }
            try {
                int parseInt = Integer.parseInt(this.f550k);
                this.f547h = 0;
                int[] iArr2 = this.f554o;
                int i4 = this.f552m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo11679q() + mo11800i());
        }
        this.f547h = 11;
        double parseDouble = Double.parseDouble(this.f550k);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f550k = null;
            this.f547h = 0;
            int[] iArr3 = this.f554o;
            int i6 = this.f552m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f550k + mo11800i());
    }

    /* renamed from: m */
    public long mo11675m() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 15) {
            this.f547h = 0;
            int[] iArr = this.f554o;
            int i2 = this.f552m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f548i;
        }
        if (i == 16) {
            this.f550k = new String(this.f542c, this.f543d, this.f549j);
            this.f543d += this.f549j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f550k = m732u();
            } else {
                this.f550k = m727b(i == 8 ? '\'' : Typography.quote);
            }
            try {
                long parseLong = Long.parseLong(this.f550k);
                this.f547h = 0;
                int[] iArr2 = this.f554o;
                int i3 = this.f552m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo11679q() + mo11800i());
        }
        this.f547h = 11;
        double parseDouble = Double.parseDouble(this.f550k);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f550k = null;
            this.f547h = 0;
            int[] iArr3 = this.f554o;
            int i4 = this.f552m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f550k + mo11800i());
    }

    /* renamed from: n */
    public String mo11676n() throws IOException {
        String str;
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 14) {
            str = m732u();
        } else if (i == 12) {
            str = m727b('\'');
        } else if (i == 13) {
            str = m727b((char) Typography.quote);
        } else {
            throw new IllegalStateException("Expected a name but was " + mo11679q() + mo11800i());
        }
        this.f547h = 0;
        this.f553n[this.f552m - 1] = str;
        return str;
    }

    /* renamed from: o */
    public void mo11677o() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 7) {
            this.f547h = 0;
            int[] iArr = this.f554o;
            int i2 = this.f552m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo11679q() + mo11800i());
    }

    /* renamed from: p */
    public String mo11678p() throws IOException {
        String str;
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 10) {
            str = m732u();
        } else if (i == 8) {
            str = m727b('\'');
        } else if (i == 9) {
            str = m727b((char) Typography.quote);
        } else if (i == 11) {
            str = this.f550k;
            this.f550k = null;
        } else if (i == 15) {
            str = Long.toString(this.f548i);
        } else if (i == 16) {
            str = new String(this.f542c, this.f543d, this.f549j);
            this.f543d += this.f549j;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo11679q() + mo11800i());
        }
        this.f547h = 0;
        int[] iArr = this.f554o;
        int i2 = this.f552m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: q */
    public C1120b mo11679q() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        switch (i) {
            case 1:
                return C1120b.BEGIN_OBJECT;
            case 2:
                return C1120b.END_OBJECT;
            case 3:
                return C1120b.BEGIN_ARRAY;
            case 4:
                return C1120b.END_ARRAY;
            case 5:
            case 6:
                return C1120b.BOOLEAN;
            case 7:
                return C1120b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C1120b.STRING;
            case 12:
            case 13:
            case 14:
                return C1120b.NAME;
            case 15:
            case 16:
                return C1120b.NUMBER;
            case 17:
                return C1120b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: r */
    public void mo11680r() throws IOException {
        int i = 0;
        do {
            int i2 = this.f547h;
            if (i2 == 0) {
                i2 = mo11798c();
            }
            if (i2 == 3) {
                m728b(1);
            } else if (i2 == 1) {
                m728b(3);
            } else {
                if (i2 == 4) {
                    this.f552m--;
                } else if (i2 == 2) {
                    this.f552m--;
                } else if (i2 == 14 || i2 == 10) {
                    m737z();
                    this.f547h = 0;
                } else if (i2 == 8 || i2 == 12) {
                    m729c('\'');
                    this.f547h = 0;
                } else if (i2 == 9 || i2 == 13) {
                    m729c(Typography.quote);
                    this.f547h = 0;
                } else {
                    if (i2 == 16) {
                        this.f543d += this.f549j;
                    }
                    this.f547h = 0;
                }
                i--;
                this.f547h = 0;
            }
            i++;
            this.f547h = 0;
        } while (i != 0);
        int[] iArr = this.f554o;
        int i3 = this.f552m - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f553n[i3] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + mo11800i();
    }

    /* renamed from: a */
    public void mo11665a() throws IOException {
        int i = this.f547h;
        if (i == 0) {
            i = mo11798c();
        }
        if (i == 3) {
            m728b(1);
            this.f554o[this.f552m - 1] = 0;
            this.f547h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo11679q() + mo11800i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f543d = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m727b(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f542c
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f543d
            int r4 = r10.f544e
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f543d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f543d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.m735x()
            r2.append(r3)
            int r3 = r10.f543d
            int r4 = r10.f544e
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.f545f
            int r3 = r3 + r7
            r10.f545f = r3
            r10.f546g = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f543d = r3
            boolean r3 = r10.m723a((int) r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.m726b((java.lang.String) r11)
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.p025x.C1118a.m727b(char):java.lang.String");
    }

    /* renamed from: a */
    private boolean m722a(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo11681s();
        return false;
    }

    /* renamed from: a */
    private boolean m723a(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f542c;
        int i4 = this.f546g;
        int i5 = this.f543d;
        this.f546g = i4 - i5;
        int i6 = this.f544e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f544e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f544e = 0;
        }
        this.f543d = 0;
        do {
            Reader reader = this.f540a;
            int i8 = this.f544e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f544e + read;
            this.f544e = i2;
            if (this.f545f == 0 && (i3 = this.f546g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f543d++;
                this.f546g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: a */
    private boolean m724a(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f543d + length > this.f544e && !m723a(length)) {
                return false;
            }
            char[] cArr = this.f542c;
            int i2 = this.f543d;
            if (cArr[i2] == 10) {
                this.f545f++;
                this.f546g = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f542c[this.f543d + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f543d++;
        }
    }

    /* renamed from: b */
    private void m728b(int i) {
        int i2 = this.f552m;
        int[] iArr = this.f551l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f551l = Arrays.copyOf(iArr, i3);
            this.f554o = Arrays.copyOf(this.f554o, i3);
            this.f553n = (String[]) Arrays.copyOf(this.f553n, i3);
        }
        int[] iArr2 = this.f551l;
        int i4 = this.f552m;
        this.f552m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: b */
    private int m725b(boolean z) throws IOException {
        char[] cArr = this.f542c;
        int i = this.f543d;
        int i2 = this.f544e;
        while (true) {
            if (i == i2) {
                this.f543d = i;
                if (m723a(1)) {
                    i = this.f543d;
                    i2 = this.f544e;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo11800i());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f545f++;
                this.f546g = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f543d = i3;
                    if (i3 == i2) {
                        this.f543d = i3 - 1;
                        boolean a = m723a(2);
                        this.f543d++;
                        if (!a) {
                            return c;
                        }
                    }
                    mo11681s();
                    int i4 = this.f543d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f543d = i4 + 1;
                        if (m724a("*/")) {
                            i = this.f543d + 2;
                            i2 = this.f544e;
                        } else {
                            m726b("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f543d = i4 + 1;
                        m736y();
                        i = this.f543d;
                        i2 = this.f544e;
                    }
                } else if (c == '#') {
                    this.f543d = i3;
                    mo11681s();
                    m736y();
                    i = this.f543d;
                    i2 = this.f544e;
                } else {
                    this.f543d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private IOException m726b(String str) throws IOException {
        throw new C1122d(str + mo11800i());
    }

    /* renamed from: c */
    private void m729c(char c) throws IOException {
        char[] cArr = this.f542c;
        do {
            int i = this.f543d;
            int i2 = this.f544e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f543d = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f543d = i3;
                    m735x();
                    i = this.f543d;
                    i2 = this.f544e;
                } else {
                    if (c2 == 10) {
                        this.f545f++;
                        this.f546g = i3;
                    }
                    i = i3;
                }
            }
            this.f543d = i;
        } while (m723a(1));
        m726b("Unterminated string");
        throw null;
    }
}
