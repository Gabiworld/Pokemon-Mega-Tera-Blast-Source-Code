package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo13301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo13302d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo13303k = 3, mo13304mv = {1, 5, 1})
/* compiled from: Comparisons.kt */
final class ComparisonsKt__ComparisonsKt$compareBy$1<T> implements Comparator<T> {
    final /* synthetic */ Function1[] $selectors;

    ComparisonsKt__ComparisonsKt$compareBy$1(Function1[] function1Arr) {
        this.$selectors = function1Arr;
    }

    public final int compare(T t, T t2) {
        return ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, this.$selectors);
    }
}
