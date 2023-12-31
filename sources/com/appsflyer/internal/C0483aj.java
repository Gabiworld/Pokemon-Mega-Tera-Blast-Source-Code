package com.appsflyer.internal;

import com.android.billingclient.api.Purchase;
import com.appsflyer.compat.function.Consumer;
import com.appsflyer.compat.function.Function;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.aj */
public final class C0483aj {
    public final Consumer<String> AFInAppEventParameterName;
    public final boolean AFInAppEventType;
    public final Consumer<String> AFKeystoreWrapper;
    public final Function<List<Purchase>, Map<String, String>> values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0483aj ajVar = (C0483aj) obj;
            if (this.AFInAppEventType != ajVar.AFInAppEventType) {
                return false;
            }
            Function<List<Purchase>, Map<String, String>> function = this.values;
            if (function == null ? ajVar.values != null : !function.equals(ajVar.values)) {
                return false;
            }
            Consumer<String> consumer = this.AFKeystoreWrapper;
            if (consumer == null ? ajVar.AFKeystoreWrapper != null : !consumer.equals(ajVar.AFKeystoreWrapper)) {
                return false;
            }
            Consumer<String> consumer2 = this.AFInAppEventParameterName;
            Consumer<String> consumer3 = ajVar.AFInAppEventParameterName;
            if (consumer2 != null) {
                return consumer2.equals(consumer3);
            }
            if (consumer3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Function<List<Purchase>, Map<String, String>> function = this.values;
        int i = 0;
        int hashCode = (function != null ? function.hashCode() : 0) * 31;
        Consumer<String> consumer = this.AFKeystoreWrapper;
        int hashCode2 = (hashCode + (consumer != null ? consumer.hashCode() : 0)) * 31;
        Consumer<String> consumer2 = this.AFInAppEventParameterName;
        if (consumer2 != null) {
            i = consumer2.hashCode();
        }
        return ((hashCode2 + i) * 31) + (this.AFInAppEventType ? 1 : 0);
    }
}
