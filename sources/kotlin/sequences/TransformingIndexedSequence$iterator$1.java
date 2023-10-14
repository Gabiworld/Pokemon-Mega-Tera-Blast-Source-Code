package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(mo13301d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo13302d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo13303k = 1, mo13304mv = {1, 5, 1})
/* compiled from: Sequences.kt */
public final class TransformingIndexedSequence$iterator$1 implements Iterator<R>, KMappedMarker {
    private int index;
    private final Iterator<T> iterator;
    final /* synthetic */ TransformingIndexedSequence this$0;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    TransformingIndexedSequence$iterator$1(TransformingIndexedSequence transformingIndexedSequence) {
        this.this$0 = transformingIndexedSequence;
        this.iterator = transformingIndexedSequence.sequence.iterator();
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public R next() {
        Function2 access$getTransformer$p = this.this$0.transformer;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            CollectionsKt.throwIndexOverflow();
        }
        return access$getTransformer$p.invoke(Integer.valueOf(i), this.iterator.next());
    }

    public boolean hasNext() {
        return this.iterator.hasNext();
    }
}
