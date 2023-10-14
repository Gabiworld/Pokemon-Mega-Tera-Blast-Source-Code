package kotlin.text;

import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(mo13301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\b¨\u0006\u0003"}, mo13302d2 = {"toRegex", "Lkotlin/text/Regex;", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, mo13303k = 5, mo13304mv = {1, 5, 1}, mo13306xi = 1, mo13307xs = "kotlin/text/StringsKt")
/* compiled from: RegexExtensionsJVM.kt */
class StringsKt__RegexExtensionsJVMKt extends StringsKt__IndentKt {
    private static final Regex toRegex(Pattern pattern) {
        return new Regex(pattern);
    }
}
