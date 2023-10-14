package com.quickgame.android.sdk.innerbean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, mo13302d2 = {"Lcom/quickgame/android/sdk/innerbean/ThirdInfo;", "", "isBind", "", "otherAccountName", "", "bid", "buid", "(ILjava/lang/String;ILjava/lang/String;)V", "getBid", "()I", "getBuid", "()Ljava/lang/String;", "getOtherAccountName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class ThirdInfo {
    private final int bid;
    private final String buid;
    private final int isBind;
    private final String otherAccountName;

    public ThirdInfo() {
        this(0, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public ThirdInfo(int i, String str, int i2, String str2) {
        Intrinsics.checkNotNullParameter(str, "otherAccountName");
        Intrinsics.checkNotNullParameter(str2, "buid");
        this.isBind = i;
        this.otherAccountName = str;
        this.bid = i2;
        this.buid = str2;
    }

    public static /* synthetic */ ThirdInfo copy$default(ThirdInfo thirdInfo, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = thirdInfo.isBind;
        }
        if ((i3 & 2) != 0) {
            str = thirdInfo.otherAccountName;
        }
        if ((i3 & 4) != 0) {
            i2 = thirdInfo.bid;
        }
        if ((i3 & 8) != 0) {
            str2 = thirdInfo.buid;
        }
        return thirdInfo.copy(i, str, i2, str2);
    }

    public final int component1() {
        return this.isBind;
    }

    public final String component2() {
        return this.otherAccountName;
    }

    public final int component3() {
        return this.bid;
    }

    public final String component4() {
        return this.buid;
    }

    public final ThirdInfo copy(int i, String str, int i2, String str2) {
        Intrinsics.checkNotNullParameter(str, "otherAccountName");
        Intrinsics.checkNotNullParameter(str2, "buid");
        return new ThirdInfo(i, str, i2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdInfo)) {
            return false;
        }
        ThirdInfo thirdInfo = (ThirdInfo) obj;
        return this.isBind == thirdInfo.isBind && Intrinsics.areEqual((Object) this.otherAccountName, (Object) thirdInfo.otherAccountName) && this.bid == thirdInfo.bid && Intrinsics.areEqual((Object) this.buid, (Object) thirdInfo.buid);
    }

    public final int getBid() {
        return this.bid;
    }

    public final String getBuid() {
        return this.buid;
    }

    public final String getOtherAccountName() {
        return this.otherAccountName;
    }

    public int hashCode() {
        int i = this.isBind * 31;
        String str = this.otherAccountName;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.bid) * 31;
        String str2 = this.buid;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final int isBind() {
        return this.isBind;
    }

    public String toString() {
        return "isBind:" + this.isBind + ",otherAccountName:" + this.otherAccountName + ",bid:" + this.bid + ",buid:" + this.buid;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThirdInfo(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
    }
}
