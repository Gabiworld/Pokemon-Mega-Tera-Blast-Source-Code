package com.p010qg.gson;

import com.p010qg.gson.internal.C1065f;
import com.p010qg.gson.p025x.C1118a;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: com.qg.gson.s */
public enum C1105s implements C1110t {
    DOUBLE {
        /* renamed from: a */
        public Double m710a(C1118a aVar) throws IOException {
            return Double.valueOf(aVar.mo11673k());
        }
    },
    LAZILY_PARSED_NUMBER {
        /* renamed from: a */
        public Number mo11783a(C1118a aVar) throws IOException {
            return new C1065f(aVar.mo11678p());
        }
    },
    LONG_OR_DOUBLE {
        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|(2:12|13)(1:11)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            throw new com.p010qg.gson.p025x.C1122d("JSON forbids NaN and infinities: " + r2 + "; at path " + r7.mo11670f());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
            throw new com.p010qg.gson.C1097m("Cannot parse " + r1 + "; at path " + r7.mo11670f(), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r2 = java.lang.Double.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2.isInfinite() != false) goto L_0x001f;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Number mo11783a(com.p010qg.gson.p025x.C1118a r7) throws java.io.IOException, com.p010qg.gson.C1097m {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = r7.mo11678p()
                long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000f }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x000f }
                return r7
            L_0x000f:
                java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0047 }
                boolean r3 = r2.isInfinite()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 != 0) goto L_0x001f
                boolean r3 = r2.isNaN()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0025
            L_0x001f:
                boolean r3 = r7.mo11799h()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0026
            L_0x0025:
                return r2
            L_0x0026:
                com.qg.gson.x.d r3 = new com.qg.gson.x.d     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0047 }
                r4.<init>()     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r5 = "JSON forbids NaN and infinities: "
                r4.append(r5)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r0)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r7.mo11670f()     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r4.toString()     // Catch:{ NumberFormatException -> 0x0047 }
                r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                throw r3     // Catch:{ NumberFormatException -> 0x0047 }
            L_0x0047:
                r2 = move-exception
                com.qg.gson.m r3 = new com.qg.gson.m
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot parse "
                r4.append(r5)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r7 = r7.mo11670f()
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                r3.<init>(r7, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.C1105s.C1108c.mo11783a(com.qg.gson.x.a):java.lang.Number");
        }
    },
    BIG_DECIMAL {
        /* renamed from: a */
        public BigDecimal m714a(C1118a aVar) throws IOException {
            String p = aVar.mo11678p();
            try {
                return new BigDecimal(p);
            } catch (NumberFormatException e) {
                throw new C1097m("Cannot parse " + p + "; at path " + aVar.mo11670f(), e);
            }
        }
    };
}
