package com.p010qg.gson.internal;

/* renamed from: com.qg.gson.internal.d */
public final class C1063d {

    /* renamed from: a */
    private static final int f478a = m633a();

    /* renamed from: a */
    private static int m633a() {
        return m636b(System.getProperty("java.version"));
    }

    /* renamed from: b */
    static int m636b(String str) {
        int c = m637c(str);
        if (c == -1) {
            c = m634a(str);
        }
        if (c == -1) {
            return 6;
        }
        return c;
    }

    /* renamed from: c */
    private static int m637c(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m634a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m635b() {
        return f478a;
    }

    /* renamed from: c */
    public static boolean m638c() {
        return f478a >= 9;
    }
}
