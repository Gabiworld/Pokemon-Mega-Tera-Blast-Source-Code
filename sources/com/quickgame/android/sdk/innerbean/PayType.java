package com.quickgame.android.sdk.innerbean;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo13302d2 = {"Lcom/quickgame/android/sdk/innerbean/PayType;", "", "showName", "", "params", "(Ljava/lang/String;Ljava/lang/String;)V", "getParams", "()Ljava/lang/String;", "getShowName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class PayType {
    private final String params;
    private final String showName;

    public PayType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "showName");
        Intrinsics.checkNotNullParameter(str2, NativeProtocol.WEB_DIALOG_PARAMS);
        this.showName = str;
        this.params = str2;
    }

    public static /* synthetic */ PayType copy$default(PayType payType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payType.showName;
        }
        if ((i & 2) != 0) {
            str2 = payType.params;
        }
        return payType.copy(str, str2);
    }

    public final String component1() {
        return this.showName;
    }

    public final String component2() {
        return this.params;
    }

    public final PayType copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "showName");
        Intrinsics.checkNotNullParameter(str2, NativeProtocol.WEB_DIALOG_PARAMS);
        return new PayType(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayType)) {
            return false;
        }
        PayType payType = (PayType) obj;
        return Intrinsics.areEqual((Object) this.showName, (Object) payType.showName) && Intrinsics.areEqual((Object) this.params, (Object) payType.params);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getShowName() {
        return this.showName;
    }

    public int hashCode() {
        String str = this.showName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.params;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PayType(showName=" + this.showName + ", params=" + this.params + ")";
    }
}
