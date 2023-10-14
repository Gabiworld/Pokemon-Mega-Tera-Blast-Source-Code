package com.quickgame.android.sdk.p034e.p035r;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.Character;
import java.util.regex.Pattern;

/* renamed from: com.quickgame.android.sdk.e.r.e */
public class C1416e {

    /* renamed from: com.quickgame.android.sdk.e.r.e$a */
    class C1417a implements InputFilter {
        C1417a() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            while (i < i2) {
                if (C1416e.m1677b(charSequence.charAt(i)) || !C1416e.m1678b(charSequence)) {
                    return "";
                }
                i++;
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m1678b(CharSequence charSequence) {
        return !Pattern.compile("[🀀-🏿]|[🐀-🟿]|[☀-⟿]", 66).matcher(charSequence).find();
    }

    /* renamed from: a */
    public static InputFilter m1674a() {
        return new C1417a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m1677b(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }
}
