package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.bk */
public class C0523bk {
    public final long AFKeystoreWrapper;

    public C0523bk(long j) {
        this.AFKeystoreWrapper = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((C0523bk) obj).AFKeystoreWrapper;
    }

    public int hashCode() {
        long j = this.AFKeystoreWrapper;
        return (int) (j ^ (j >>> 32));
    }
}
