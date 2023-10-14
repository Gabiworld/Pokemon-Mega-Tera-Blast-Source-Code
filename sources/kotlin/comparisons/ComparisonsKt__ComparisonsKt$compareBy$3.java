package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo13301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo13302d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo13303k = 3, mo13304mv = {1, 5, 1})
/* compiled from: Comparisons.kt */
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator<T> {
    final /* synthetic */ Comparator $comparator;
    final /* synthetic */ Function1 $selector;

    public ComparisonsKt__ComparisonsKt$compareBy$3(Comparator comparator, Function1 function1) {
        this.$comparator = comparator;
        this.$selector = function1;
    }

    public final int compare(T t, T t2) {
        return this.$comparator.compare(this.$selector.invoke(t), this.$selector.invoke(t2));
    }
}