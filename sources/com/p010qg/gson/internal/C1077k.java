package com.p010qg.gson.internal;

import com.p010qg.gson.C0988i;
import com.p010qg.gson.internal.bind.TypeAdapters;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.qg.gson.internal.k */
public final class C1077k {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.p010qg.gson.C1094j((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.p010qg.gson.C1101q((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.p010qg.gson.C1095k.f526a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.p010qg.gson.C1101q((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.p010qg.gson.C1101q((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' com.qg.gson.x.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p010qg.gson.C0988i m660a(com.p010qg.gson.p025x.C1118a r2) throws com.p010qg.gson.C1097m {
        /*
            r2.mo11679q()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.qg.gson.TypeAdapter<com.qg.gson.i> r1 = com.p010qg.gson.internal.bind.TypeAdapters.f409U     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo11574a((com.p010qg.gson.p025x.C1118a) r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.qg.gson.i r2 = (com.p010qg.gson.C0988i) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.qg.gson.q r0 = new com.qg.gson.q
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.qg.gson.j r0 = new com.qg.gson.j
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.qg.gson.q r0 = new com.qg.gson.q
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.qg.gson.k r2 = com.p010qg.gson.C1095k.f526a
            return r2
        L_0x002b:
            com.qg.gson.q r0 = new com.qg.gson.q
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.C1077k.m660a(com.qg.gson.x.a):com.qg.gson.i");
    }

    /* renamed from: com.qg.gson.internal.k$a */
    private static final class C1078a extends Writer {

        /* renamed from: a */
        private final Appendable f504a;

        /* renamed from: b */
        private final C1079a f505b = new C1079a();

        /* renamed from: com.qg.gson.internal.k$a$a */
        static class C1079a implements CharSequence {

            /* renamed from: a */
            char[] f506a;

            C1079a() {
            }

            public char charAt(int i) {
                return this.f506a[i];
            }

            public int length() {
                return this.f506a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f506a, i, i2 - i);
            }
        }

        C1078a(Appendable appendable) {
            this.f504a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C1079a aVar = this.f505b;
            aVar.f506a = cArr;
            this.f504a.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f504a.append((char) i);
        }
    }

    /* renamed from: a */
    public static void m662a(C0988i iVar, C1121c cVar) throws IOException {
        TypeAdapters.f409U.mo11576a(cVar, iVar);
    }

    /* renamed from: a */
    public static Writer m661a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C1078a(appendable);
    }
}
