package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.C0523bk;
import java.io.IOException;

public class HttpException extends IOException {
    private final C0523bk valueOf;

    public HttpException(Throwable th, C0523bk bkVar) {
        super(th.getMessage(), th);
        this.valueOf = bkVar;
    }

    public C0523bk getMetrics() {
        return this.valueOf;
    }
}
