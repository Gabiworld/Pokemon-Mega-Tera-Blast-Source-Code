package com.facebook;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import org.json.JSONObject;

/* renamed from: com.facebook.-$$Lambda$FacebookSdk$rRvSJEo01B75lCVao9yemAlNbP0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FacebookSdk$rRvSJEo01B75lCVao9yemAlNbP0 implements FacebookSdk.GraphRequestCreator {
    public static final /* synthetic */ $$Lambda$FacebookSdk$rRvSJEo01B75lCVao9yemAlNbP0 INSTANCE = new $$Lambda$FacebookSdk$rRvSJEo01B75lCVao9yemAlNbP0();

    private /* synthetic */ $$Lambda$FacebookSdk$rRvSJEo01B75lCVao9yemAlNbP0() {
    }

    public final GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.m2427graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
    }
}
