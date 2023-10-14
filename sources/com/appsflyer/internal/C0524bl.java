package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.bl */
public final class C0524bl<ResponseBody> {
    final C0530bq<ResponseBody> AFInAppEventParameterName;
    final C0630z AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;
    public final AtomicBoolean valueOf = new AtomicBoolean(false);
    final C0526bm values;

    public C0524bl(C0630z zVar, ExecutorService executorService, C0526bm bmVar, C0530bq<ResponseBody> bqVar) {
        this.AFInAppEventType = zVar;
        this.AFKeystoreWrapper = executorService;
        this.values = bmVar;
        this.AFInAppEventParameterName = bqVar;
    }

    public final C0531br<ResponseBody> AFKeystoreWrapper() throws IOException {
        if (!this.valueOf.getAndSet(true)) {
            C0531br<String> AFInAppEventType2 = this.values.AFInAppEventType(this.AFInAppEventType);
            try {
                return new C0531br(this.AFInAppEventParameterName.values((String) AFInAppEventType2.valueOf), AFInAppEventType2.values, AFInAppEventType2.AFKeystoreWrapper, AFInAppEventType2.AFInAppEventParameterName, AFInAppEventType2.AFInAppEventType);
            } catch (JSONException e) {
                throw new ParsingException(e.getMessage(), e, AFInAppEventType2);
            }
        } else {
            throw new IllegalStateException("Http call is already executed");
        }
    }
}
