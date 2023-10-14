package com.p010qg.eventbus;

import android.os.Looper;
import com.p010qg.eventbus.p019q.C0965a;
import java.io.PrintStream;
import java.util.logging.Level;

/* renamed from: com.qg.eventbus.g */
public interface C0951g {

    /* renamed from: com.qg.eventbus.g$a */
    public static class C0952a {
        /* renamed from: a */
        public static C0951g m243a() {
            return (!C0965a.m271a() || m244b() == null) ? new C0953b() : new C0965a("EventBus");
        }

        /* renamed from: b */
        static Object m244b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.qg.eventbus.g$b */
    public static class C0953b implements C0951g {
        /* renamed from: a */
        public void mo11537a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        /* renamed from: a */
        public void mo11538a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo11537a(Level level, String str);

    /* renamed from: a */
    void mo11538a(Level level, String str, Throwable th);
}
