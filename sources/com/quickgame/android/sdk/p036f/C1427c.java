package com.quickgame.android.sdk.p036f;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.quickgame.android.sdk.f.c */
public final class C1427c extends Exception {

    /* renamed from: a */
    private final int f1255a;

    /* renamed from: b */
    private final String f1256b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1427c(int i, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "msg");
        this.f1255a = i;
        this.f1256b = str;
    }

    /* renamed from: a */
    public final int mo12662a() {
        return this.f1255a;
    }

    /* renamed from: b */
    public final String mo12663b() {
        return this.f1256b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1427c)) {
            return false;
        }
        C1427c cVar = (C1427c) obj;
        return this.f1255a == cVar.f1255a && Intrinsics.areEqual((Object) this.f1256b, (Object) cVar.f1256b);
    }

    public int hashCode() {
        int i = this.f1255a * 31;
        String str = this.f1256b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "code:" + this.f1255a + ",msg;" + this.f1256b;
    }
}
