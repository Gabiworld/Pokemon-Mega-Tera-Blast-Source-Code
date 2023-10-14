package com.facebook.share.internal;

import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.-$$Lambda$ShareInternalUtility$J7ybwyhA0f1j4jYpkjNtFmqiUlA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ShareInternalUtility$J7ybwyhA0f1j4jYpkjNtFmqiUlA implements OpenGraphJSONUtility.PhotoJSONProcessor {
    public static final /* synthetic */ $$Lambda$ShareInternalUtility$J7ybwyhA0f1j4jYpkjNtFmqiUlA INSTANCE = new $$Lambda$ShareInternalUtility$J7ybwyhA0f1j4jYpkjNtFmqiUlA();

    private /* synthetic */ $$Lambda$ShareInternalUtility$J7ybwyhA0f1j4jYpkjNtFmqiUlA() {
    }

    public final JSONObject toJSONObject(SharePhoto sharePhoto) {
        return ShareInternalUtility.m2607toJSONObjectForWeb$lambda6(sharePhoto);
    }
}
