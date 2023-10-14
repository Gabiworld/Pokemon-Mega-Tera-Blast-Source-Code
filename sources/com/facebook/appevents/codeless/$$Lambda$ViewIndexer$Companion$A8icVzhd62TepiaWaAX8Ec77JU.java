package com.facebook.appevents.codeless;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.ViewIndexer;

/* renamed from: com.facebook.appevents.codeless.-$$Lambda$ViewIndexer$Companion$A8icVzhd62T-epiaWaAX8Ec77JU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ViewIndexer$Companion$A8icVzhd62TepiaWaAX8Ec77JU implements GraphRequest.Callback {
    public static final /* synthetic */ $$Lambda$ViewIndexer$Companion$A8icVzhd62TepiaWaAX8Ec77JU INSTANCE = new $$Lambda$ViewIndexer$Companion$A8icVzhd62TepiaWaAX8Ec77JU();

    private /* synthetic */ $$Lambda$ViewIndexer$Companion$A8icVzhd62TepiaWaAX8Ec77JU() {
    }

    public final void onCompleted(GraphResponse graphResponse) {
        ViewIndexer.Companion.m2486buildAppIndexingRequest$lambda0(graphResponse);
    }
}
