package com.appsflyer.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.br */
public class C0531br<Body> {
    public final Map<String, List<String>> AFInAppEventParameterName;
    public final C0523bk AFInAppEventType;
    final boolean AFKeystoreWrapper;
    public final Body valueOf;
    public final int values;

    public C0531br(Body body, int i, boolean z, Map<String, List<String>> map, C0523bk bkVar) {
        this.valueOf = body;
        this.values = i;
        this.AFKeystoreWrapper = z;
        this.AFInAppEventParameterName = new HashMap(map);
        this.AFInAppEventType = bkVar;
    }

    public final boolean values() {
        return this.AFKeystoreWrapper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0531br brVar = (C0531br) obj;
        if (this.values == brVar.values && this.AFKeystoreWrapper == brVar.AFKeystoreWrapper && this.valueOf.equals(brVar.valueOf) && this.AFInAppEventParameterName.equals(brVar.AFInAppEventParameterName)) {
            return this.AFInAppEventType.equals(brVar.AFInAppEventType);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.valueOf.hashCode() * 31) + this.values) * 31) + (this.AFKeystoreWrapper ? 1 : 0)) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }
}
