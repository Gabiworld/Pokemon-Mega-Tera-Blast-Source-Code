package com.p010qg.gson.internal.bind;

import com.p010qg.gson.C0985f;
import com.p010qg.gson.C0988i;
import com.p010qg.gson.C1094j;
import com.p010qg.gson.C1095k;
import com.p010qg.gson.C1096l;
import com.p010qg.gson.C1098n;
import com.p010qg.gson.C1101q;
import com.p010qg.gson.C1111u;
import com.p010qg.gson.Gson;
import com.p010qg.gson.TypeAdapter;
import com.p010qg.gson.internal.C1065f;
import com.p010qg.gson.p023v.C1114c;
import com.p010qg.gson.p024w.C1117a;
import com.p010qg.gson.p025x.C1118a;
import com.p010qg.gson.p025x.C1120b;
import com.p010qg.gson.p025x.C1121c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.qg.gson.internal.bind.TypeAdapters */
public final class TypeAdapters {

    /* renamed from: A */
    public static final TypeAdapter<BigInteger> f389A = new TypeAdapter<BigInteger>() {
        /* renamed from: a */
        public BigInteger m488a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            try {
                return new BigInteger(aVar.mo11678p());
            } catch (NumberFormatException e) {
                throw new C1101q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, BigInteger bigInteger) throws IOException {
            cVar.mo11689a((Number) bigInteger);
        }
    };

    /* renamed from: B */
    public static final C1111u f390B;

    /* renamed from: C */
    public static final TypeAdapter<StringBuilder> f391C;

    /* renamed from: D */
    public static final C1111u f392D;

    /* renamed from: E */
    public static final TypeAdapter<StringBuffer> f393E;

    /* renamed from: F */
    public static final C1111u f394F;

    /* renamed from: G */
    public static final TypeAdapter<URL> f395G;

    /* renamed from: H */
    public static final C1111u f396H;

    /* renamed from: I */
    public static final TypeAdapter<URI> f397I;

    /* renamed from: J */
    public static final C1111u f398J;

    /* renamed from: K */
    public static final TypeAdapter<InetAddress> f399K;

    /* renamed from: L */
    public static final C1111u f400L;

    /* renamed from: M */
    public static final TypeAdapter<UUID> f401M;

    /* renamed from: N */
    public static final C1111u f402N;

    /* renamed from: O */
    public static final TypeAdapter<Currency> f403O;

    /* renamed from: P */
    public static final C1111u f404P;

    /* renamed from: Q */
    public static final TypeAdapter<Calendar> f405Q;

    /* renamed from: R */
    public static final C1111u f406R;

    /* renamed from: S */
    public static final TypeAdapter<Locale> f407S;

    /* renamed from: T */
    public static final C1111u f408T;

    /* renamed from: U */
    public static final TypeAdapter<C0988i> f409U;

    /* renamed from: V */
    public static final C1111u f410V;

    /* renamed from: W */
    public static final C1111u f411W = new C1111u() {
        /* JADX WARNING: type inference failed for: r2v0, types: [com.qg.gson.w.a<T>, com.qg.gson.w.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.p010qg.gson.TypeAdapter<T> mo11601a(com.p010qg.gson.Gson r1, com.p010qg.gson.p024w.C1117a<T> r2) {
            /*
                r0 = this;
                java.lang.Class r1 = r2.mo11792a()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x0021
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                if (r1 != r2) goto L_0x0011
                goto L_0x0021
            L_0x0011:
                boolean r2 = r1.isEnum()
                if (r2 != 0) goto L_0x001b
                java.lang.Class r1 = r1.getSuperclass()
            L_0x001b:
                com.qg.gson.internal.bind.TypeAdapters$EnumTypeAdapter r2 = new com.qg.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                r2.<init>(r1)
                return r2
            L_0x0021:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.TypeAdapters.C102728.mo11601a(com.qg.gson.Gson, com.qg.gson.w.a):com.qg.gson.TypeAdapter");
        }
    };

    /* renamed from: a */
    public static final TypeAdapter<Class> f412a;

    /* renamed from: b */
    public static final C1111u f413b;

    /* renamed from: c */
    public static final TypeAdapter<BitSet> f414c;

    /* renamed from: d */
    public static final C1111u f415d;

    /* renamed from: e */
    public static final TypeAdapter<Boolean> f416e;

    /* renamed from: f */
    public static final TypeAdapter<Boolean> f417f = new TypeAdapter<Boolean>() {
        /* renamed from: a */
        public Boolean m548a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() != C1120b.NULL) {
                return Boolean.valueOf(aVar.mo11678p());
            }
            aVar.mo11677o();
            return null;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Boolean bool) throws IOException {
            cVar.mo11693c(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g */
    public static final C1111u f418g;

    /* renamed from: h */
    public static final TypeAdapter<Number> f419h;

    /* renamed from: i */
    public static final C1111u f420i;

    /* renamed from: j */
    public static final TypeAdapter<Number> f421j;

    /* renamed from: k */
    public static final C1111u f422k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f423l;

    /* renamed from: m */
    public static final C1111u f424m;

    /* renamed from: n */
    public static final TypeAdapter<AtomicInteger> f425n;

    /* renamed from: o */
    public static final C1111u f426o;

    /* renamed from: p */
    public static final TypeAdapter<AtomicBoolean> f427p;

    /* renamed from: q */
    public static final C1111u f428q;

    /* renamed from: r */
    public static final TypeAdapter<AtomicIntegerArray> f429r;

    /* renamed from: s */
    public static final C1111u f430s;

    /* renamed from: t */
    public static final TypeAdapter<Number> f431t = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number m464a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo11675m());
            } catch (NumberFormatException e) {
                throw new C1101q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Number number) throws IOException {
            cVar.mo11689a(number);
        }
    };

    /* renamed from: u */
    public static final TypeAdapter<Number> f432u = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number m468a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() != C1120b.NULL) {
                return Float.valueOf((float) aVar.mo11673k());
            }
            aVar.mo11677o();
            return null;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Number number) throws IOException {
            cVar.mo11689a(number);
        }
    };

    /* renamed from: v */
    public static final TypeAdapter<Number> f433v = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number m472a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() != C1120b.NULL) {
                return Double.valueOf(aVar.mo11673k());
            }
            aVar.mo11677o();
            return null;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, Number number) throws IOException {
            cVar.mo11689a(number);
        }
    };

    /* renamed from: w */
    public static final TypeAdapter<Character> f434w;

    /* renamed from: x */
    public static final C1111u f435x;

    /* renamed from: y */
    public static final TypeAdapter<String> f436y;

    /* renamed from: z */
    public static final TypeAdapter<BigDecimal> f437z = new TypeAdapter<BigDecimal>() {
        /* renamed from: a */
        public BigDecimal m484a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() == C1120b.NULL) {
                aVar.mo11677o();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo11678p());
            } catch (NumberFormatException e) {
                throw new C1101q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.mo11689a((Number) bigDecimal);
        }
    };

    /* renamed from: com.qg.gson.internal.bind.TypeAdapters$29 */
    final class C102829 implements C1111u {

        /* renamed from: a */
        final /* synthetic */ C1117a f438a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f439b;

        /* renamed from: a */
        public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
            if (aVar.equals(this.f438a)) {
                return this.f439b;
            }
            return null;
        }
    }

    /* renamed from: com.qg.gson.internal.bind.TypeAdapters$a */
    static /* synthetic */ class C1042a {

        /* renamed from: a */
        static final /* synthetic */ int[] f455a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.qg.gson.x.b[] r0 = com.p010qg.gson.p025x.C1120b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f455a = r0
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f455a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.qg.gson.x.b r1 = com.p010qg.gson.p025x.C1120b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.TypeAdapters.C1042a.<clinit>():void");
        }
    }

    static {
        TypeAdapter<Class> a = new TypeAdapter<Class>() {
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo11576a(C1121c cVar, Object obj) throws IOException {
                mo11632a(cVar, (Class) obj);
                throw null;
            }

            /* renamed from: a */
            public void mo11632a(C1121c cVar, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            /* renamed from: a */
            public Class mo11574a(C1118a aVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.mo11582a();
        f412a = a;
        f413b = m451a(Class.class, a);
        TypeAdapter<BitSet> a2 = new TypeAdapter<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
                if (r8.mo11674l() != 0) goto L_0x0069;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.BitSet m500a(com.p010qg.gson.p025x.C1118a r8) throws java.io.IOException {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.mo11665a()
                    com.qg.gson.x.b r1 = r8.mo11679q()
                    r2 = 0
                    r3 = 0
                L_0x000e:
                    com.qg.gson.x.b r4 = com.p010qg.gson.p025x.C1120b.END_ARRAY
                    if (r1 == r4) goto L_0x0075
                    int[] r4 = com.p010qg.gson.internal.bind.TypeAdapters.C1042a.f455a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x0061
                    r6 = 2
                    if (r4 == r6) goto L_0x005c
                    r6 = 3
                    if (r4 != r6) goto L_0x0045
                    java.lang.String r1 = r8.mo11678p()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002e }
                    if (r1 == 0) goto L_0x0068
                    goto L_0x0069
                L_0x002e:
                    com.qg.gson.q r8 = new com.qg.gson.q
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x0045:
                    com.qg.gson.q r8 = new com.qg.gson.q
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x005c:
                    boolean r5 = r8.mo11672j()
                    goto L_0x0069
                L_0x0061:
                    int r1 = r8.mo11674l()
                    if (r1 == 0) goto L_0x0068
                    goto L_0x0069
                L_0x0068:
                    r5 = 0
                L_0x0069:
                    if (r5 == 0) goto L_0x006e
                    r0.set(r3)
                L_0x006e:
                    int r3 = r3 + 1
                    com.qg.gson.x.b r1 = r8.mo11679q()
                    goto L_0x000e
                L_0x0075:
                    r8.mo11668d()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p010qg.gson.internal.bind.TypeAdapters.C10182.m500a(com.qg.gson.x.a):java.util.BitSet");
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, BitSet bitSet) throws IOException {
                cVar.mo11686a();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo11687a(bitSet.get(i) ? 1 : 0);
                }
                cVar.mo11692c();
            }
        }.mo11582a();
        f414c = a2;
        f415d = m451a(BitSet.class, a2);
        C10293 r0 = new TypeAdapter<Boolean>() {
            /* renamed from: a */
            public Boolean m538a(C1118a aVar) throws IOException {
                C1120b q = aVar.mo11679q();
                if (q == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                } else if (q == C1120b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.mo11678p()));
                } else {
                    return Boolean.valueOf(aVar.mo11672j());
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Boolean bool) throws IOException {
                cVar.mo11688a(bool);
            }
        };
        f416e = r0;
        f418g = m452a(Boolean.TYPE, Boolean.class, r0);
        C10365 r02 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number m552a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.mo11674l());
                } catch (NumberFormatException e) {
                    throw new C1101q((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                cVar.mo11689a(number);
            }
        };
        f419h = r02;
        f420i = m452a(Byte.TYPE, Byte.class, r02);
        C10376 r03 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number m556a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.mo11674l());
                } catch (NumberFormatException e) {
                    throw new C1101q((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                cVar.mo11689a(number);
            }
        };
        f421j = r03;
        f422k = m452a(Short.TYPE, Short.class, r03);
        C10387 r04 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number m560a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.mo11674l());
                } catch (NumberFormatException e) {
                    throw new C1101q((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Number number) throws IOException {
                cVar.mo11689a(number);
            }
        };
        f423l = r04;
        f424m = m452a(Integer.TYPE, Integer.class, r04);
        TypeAdapter<AtomicInteger> a3 = new TypeAdapter<AtomicInteger>() {
            /* renamed from: a */
            public AtomicInteger m564a(C1118a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.mo11674l());
                } catch (NumberFormatException e) {
                    throw new C1101q((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.mo11687a((long) atomicInteger.get());
            }
        }.mo11582a();
        f425n = a3;
        f426o = m451a(AtomicInteger.class, a3);
        TypeAdapter<AtomicBoolean> a4 = new TypeAdapter<AtomicBoolean>() {
            /* renamed from: a */
            public AtomicBoolean m568a(C1118a aVar) throws IOException {
                return new AtomicBoolean(aVar.mo11672j());
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.mo11696d(atomicBoolean.get());
            }
        }.mo11582a();
        f427p = a4;
        f428q = m451a(AtomicBoolean.class, a4);
        TypeAdapter<AtomicIntegerArray> a5 = new TypeAdapter<AtomicIntegerArray>() {
            /* renamed from: a */
            public AtomicIntegerArray m460a(C1118a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.mo11665a();
                while (aVar.mo11671g()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.mo11674l()));
                    } catch (NumberFormatException e) {
                        throw new C1101q((Throwable) e);
                    }
                }
                aVar.mo11668d();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.mo11686a();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo11687a((long) atomicIntegerArray.get(i));
                }
                cVar.mo11692c();
            }
        }.mo11582a();
        f429r = a5;
        f430s = m451a(AtomicIntegerArray.class, a5);
        C101214 r05 = new TypeAdapter<Character>() {
            /* renamed from: a */
            public Character m476a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                String p = aVar.mo11678p();
                if (p.length() == 1) {
                    return Character.valueOf(p.charAt(0));
                }
                throw new C1101q("Expecting character, got: " + p);
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Character ch) throws IOException {
                cVar.mo11693c(ch == null ? null : String.valueOf(ch));
            }
        };
        f434w = r05;
        f435x = m452a(Character.TYPE, Character.class, r05);
        C101315 r06 = new TypeAdapter<String>() {
            /* renamed from: a */
            public String m480a(C1118a aVar) throws IOException {
                C1120b q = aVar.mo11679q();
                if (q == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                } else if (q == C1120b.BOOLEAN) {
                    return Boolean.toString(aVar.mo11672j());
                } else {
                    return aVar.mo11678p();
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, String str) throws IOException {
                cVar.mo11693c(str);
            }
        };
        f436y = r06;
        f390B = m451a(String.class, r06);
        C101618 r07 = new TypeAdapter<StringBuilder>() {
            /* renamed from: a */
            public StringBuilder m492a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return new StringBuilder(aVar.mo11678p());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, StringBuilder sb) throws IOException {
                cVar.mo11693c(sb == null ? null : sb.toString());
            }
        };
        f391C = r07;
        f392D = m451a(StringBuilder.class, r07);
        C101719 r08 = new TypeAdapter<StringBuffer>() {
            /* renamed from: a */
            public StringBuffer m496a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return new StringBuffer(aVar.mo11678p());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.mo11693c(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f393E = r08;
        f394F = m451a(StringBuffer.class, r08);
        C101920 r09 = new TypeAdapter<URL>() {
            /* renamed from: a */
            public URL m504a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                String p = aVar.mo11678p();
                if ("null".equals(p)) {
                    return null;
                }
                return new URL(p);
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, URL url) throws IOException {
                cVar.mo11693c(url == null ? null : url.toExternalForm());
            }
        };
        f395G = r09;
        f396H = m451a(URL.class, r09);
        C102021 r010 = new TypeAdapter<URI>() {
            /* renamed from: a */
            public URI m508a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                try {
                    String p = aVar.mo11678p();
                    if ("null".equals(p)) {
                        return null;
                    }
                    return new URI(p);
                } catch (URISyntaxException e) {
                    throw new C1094j((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, URI uri) throws IOException {
                cVar.mo11693c(uri == null ? null : uri.toASCIIString());
            }
        };
        f397I = r010;
        f398J = m451a(URI.class, r010);
        C102122 r011 = new TypeAdapter<InetAddress>() {
            /* renamed from: a */
            public InetAddress m512a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return InetAddress.getByName(aVar.mo11678p());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, InetAddress inetAddress) throws IOException {
                cVar.mo11693c(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f399K = r011;
        f400L = m453b(InetAddress.class, r011);
        C102223 r012 = new TypeAdapter<UUID>() {
            /* renamed from: a */
            public UUID m516a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() != C1120b.NULL) {
                    return UUID.fromString(aVar.mo11678p());
                }
                aVar.mo11677o();
                return null;
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, UUID uuid) throws IOException {
                cVar.mo11693c(uuid == null ? null : uuid.toString());
            }
        };
        f401M = r012;
        f402N = m451a(UUID.class, r012);
        TypeAdapter<Currency> a6 = new TypeAdapter<Currency>() {
            /* renamed from: a */
            public Currency m520a(C1118a aVar) throws IOException {
                return Currency.getInstance(aVar.mo11678p());
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Currency currency) throws IOException {
                cVar.mo11693c(currency.getCurrencyCode());
            }
        }.mo11582a();
        f403O = a6;
        f404P = m451a(Currency.class, a6);
        C102425 r013 = new TypeAdapter<Calendar>() {
            /* renamed from: a */
            public Calendar m524a(C1118a aVar) throws IOException {
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                aVar.mo11666b();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (aVar.mo11679q() != C1120b.END_OBJECT) {
                    String n = aVar.mo11676n();
                    int l = aVar.mo11674l();
                    if ("year".equals(n)) {
                        i = l;
                    } else if ("month".equals(n)) {
                        i2 = l;
                    } else if ("dayOfMonth".equals(n)) {
                        i3 = l;
                    } else if ("hourOfDay".equals(n)) {
                        i4 = l;
                    } else if ("minute".equals(n)) {
                        i5 = l;
                    } else if ("second".equals(n)) {
                        i6 = l;
                    }
                }
                aVar.mo11669e();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.mo11698h();
                    return;
                }
                cVar.mo11691b();
                cVar.mo11690a("year");
                cVar.mo11687a((long) calendar.get(1));
                cVar.mo11690a("month");
                cVar.mo11687a((long) calendar.get(2));
                cVar.mo11690a("dayOfMonth");
                cVar.mo11687a((long) calendar.get(5));
                cVar.mo11690a("hourOfDay");
                cVar.mo11687a((long) calendar.get(11));
                cVar.mo11690a("minute");
                cVar.mo11687a((long) calendar.get(12));
                cVar.mo11690a("second");
                cVar.mo11687a((long) calendar.get(13));
                cVar.mo11695d();
            }
        };
        f405Q = r013;
        f406R = m454b(Calendar.class, GregorianCalendar.class, r013);
        C102526 r014 = new TypeAdapter<Locale>() {
            /* renamed from: a */
            public Locale m528a(C1118a aVar) throws IOException {
                String str = null;
                if (aVar.mo11679q() == C1120b.NULL) {
                    aVar.mo11677o();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo11678p(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, Locale locale) throws IOException {
                cVar.mo11693c(locale == null ? null : locale.toString());
            }
        };
        f407S = r014;
        f408T = m451a(Locale.class, r014);
        C102627 r015 = new TypeAdapter<C0988i>() {
            /* renamed from: a */
            public C0988i m532a(C1118a aVar) throws IOException {
                if (aVar instanceof C1043a) {
                    return ((C1043a) aVar).mo11681s();
                }
                switch (C1042a.f455a[aVar.mo11679q().ordinal()]) {
                    case 1:
                        return new C1098n((Number) new C1065f(aVar.mo11678p()));
                    case 2:
                        return new C1098n(Boolean.valueOf(aVar.mo11672j()));
                    case 3:
                        return new C1098n(aVar.mo11678p());
                    case 4:
                        aVar.mo11677o();
                        return C1095k.f526a;
                    case 5:
                        C0985f fVar = new C0985f();
                        aVar.mo11665a();
                        while (aVar.mo11671g()) {
                            fVar.mo11588a(m532a(aVar));
                        }
                        aVar.mo11668d();
                        return fVar;
                    case 6:
                        C1096l lVar = new C1096l();
                        aVar.mo11666b();
                        while (aVar.mo11671g()) {
                            lVar.mo11767a(aVar.mo11676n(), m532a(aVar));
                        }
                        aVar.mo11669e();
                        return lVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* renamed from: a */
            public void mo11576a(C1121c cVar, C0988i iVar) throws IOException {
                if (iVar == null || iVar.mo11597e()) {
                    cVar.mo11698h();
                } else if (iVar.mo11599g()) {
                    C1098n c = iVar.mo11595c();
                    if (c.mo11780o()) {
                        cVar.mo11689a(c.mo11777l());
                    } else if (c.mo11779n()) {
                        cVar.mo11696d(c.mo11772h());
                    } else {
                        cVar.mo11693c(c.mo11778m());
                    }
                } else if (iVar.mo11596d()) {
                    cVar.mo11686a();
                    Iterator<C0988i> it = iVar.mo11593a().iterator();
                    while (it.hasNext()) {
                        mo11576a(cVar, it.next());
                    }
                    cVar.mo11692c();
                } else if (iVar.mo11598f()) {
                    cVar.mo11691b();
                    for (Map.Entry next : iVar.mo11594b().mo11769h()) {
                        cVar.mo11690a((String) next.getKey());
                        mo11576a(cVar, (C0988i) next.getValue());
                    }
                    cVar.mo11695d();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
                }
            }
        };
        f409U = r015;
        f410V = m453b(C0988i.class, r015);
    }

    /* renamed from: a */
    public static <TT> C1111u m451a(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new C1111u() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
                if (aVar.mo11792a() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: b */
    public static <TT> C1111u m454b(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new C1111u() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
                Class<? super T> a = aVar.mo11792a();
                if (a == cls || a == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: com.qg.gson.internal.bind.TypeAdapters$EnumTypeAdapter */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        private final Map<String, T> f452a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f453b = new HashMap();

        /* renamed from: com.qg.gson.internal.bind.TypeAdapters$EnumTypeAdapter$a */
        class C1041a implements PrivilegedAction<Void> {

            /* renamed from: a */
            final /* synthetic */ Field f454a;

            C1041a(EnumTypeAdapter enumTypeAdapter, Field field) {
                this.f454a = field;
            }

            public Void run() {
                this.f454a.setAccessible(true);
                return null;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new C1041a(this, field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        C1114c cVar = (C1114c) field.getAnnotation(C1114c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.f452a.put(put, enumR);
                            }
                        }
                        this.f452a.put(name, enumR);
                        this.f453b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m572a(C1118a aVar) throws IOException {
            if (aVar.mo11679q() != C1120b.NULL) {
                return (Enum) this.f452a.get(aVar.mo11678p());
            }
            aVar.mo11677o();
            return null;
        }

        /* renamed from: a */
        public void mo11576a(C1121c cVar, T t) throws IOException {
            cVar.mo11693c(t == null ? null : this.f453b.get(t));
        }
    }

    /* renamed from: a */
    public static <TT> C1111u m452a(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new C1111u() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo11601a(Gson gson, C1117a<T> aVar) {
                Class<? super T> a = aVar.mo11792a();
                if (a == cls || a == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: b */
    public static <T1> C1111u m453b(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new C1111u() {
            /* renamed from: a */
            public <T2> TypeAdapter<T2> mo11601a(Gson gson, C1117a<T2> aVar) {
                final Class<? super T2> a = aVar.mo11792a();
                if (!cls.isAssignableFrom(a)) {
                    return null;
                }
                return new TypeAdapter<T1>() {
                    /* renamed from: a */
                    public void mo11576a(C1121c cVar, T1 t1) throws IOException {
                        typeAdapter.mo11576a(cVar, t1);
                    }

                    /* renamed from: a */
                    public T1 mo11574a(C1118a aVar) throws IOException {
                        T1 a = typeAdapter.mo11574a(aVar);
                        if (a == null || a.isInstance(a)) {
                            return a;
                        }
                        throw new C1101q("Expected a " + a.getName() + " but was " + a.getClass().getName());
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
