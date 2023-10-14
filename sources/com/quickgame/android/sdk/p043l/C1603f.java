package com.quickgame.android.sdk.p043l;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.quickgame.android.sdk.l.f */
public final class C1603f {

    /* renamed from: a */
    public static final C1603f f1603a = new C1603f();

    private C1603f() {
    }

    /* renamed from: a */
    public final boolean mo13048a(String str) {
        return Pattern.compile("(?<![0-9])([0-9]{6})(?![0-9])").matcher(str).matches();
    }

    /* renamed from: b */
    public final boolean mo13049b(String str) {
        if (str == null || Intrinsics.areEqual((Object) "", (Object) str)) {
            return false;
        }
        return Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*").matcher(str).matches();
    }

    /* renamed from: c */
    public final boolean mo13050c(String str) {
        return Pattern.compile("^.{6,}$").matcher(str).matches();
    }
}
