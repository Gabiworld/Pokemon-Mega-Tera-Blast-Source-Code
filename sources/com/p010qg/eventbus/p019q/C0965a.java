package com.p010qg.eventbus.p019q;

import android.util.Log;
import com.p010qg.eventbus.C0951g;
import java.util.logging.Level;

/* renamed from: com.qg.eventbus.q.a */
public class C0965a implements C0951g {

    /* renamed from: b */
    private static final boolean f287b;

    /* renamed from: a */
    private final String f288a;

    static {
        boolean z = false;
        try {
            if (Class.forName("android.util.Log") != null) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        }
        f287b = z;
    }

    public C0965a(String str) {
        this.f288a = str;
    }

    /* renamed from: a */
    public static boolean m271a() {
        return f287b;
    }

    /* renamed from: a */
    public void mo11537a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m270a(level), this.f288a, str);
        }
    }

    /* renamed from: a */
    public void mo11538a(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int a = m270a(level);
            String str2 = this.f288a;
            Log.println(a, str2, str + "\n" + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    private int m270a(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }
}
