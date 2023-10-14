package com.facebook.bolts;

import kotlin.Metadata;

@Metadata(mo13301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo13302d2 = {"Lcom/facebook/bolts/Continuation;", "TTaskResult", "TContinuationResult", "", "then", "task", "Lcom/facebook/bolts/Task;", "(Lcom/facebook/bolts/Task;)Ljava/lang/Object;", "facebook-core_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* compiled from: Continuation.kt */
public interface Continuation<TTaskResult, TContinuationResult> {
    TContinuationResult then(Task<TTaskResult> task) throws Exception;
}
