package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.C0531br;
import java.io.IOException;

public class ParsingException extends IOException {
    private final C0531br<String> AFInAppEventParameterName;

    public ParsingException(String str, Throwable th, C0531br<String> brVar) {
        super(str, th);
        this.AFInAppEventParameterName = brVar;
    }

    public C0531br<String> getRawResponse() {
        return this.AFInAppEventParameterName;
    }
}
