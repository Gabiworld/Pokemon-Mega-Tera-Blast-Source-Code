package com.quickgame.android.sdk.innerbean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00064"}, mo13302d2 = {"Lcom/quickgame/android/sdk/innerbean/BindInfo;", "", "bindFB", "Lcom/quickgame/android/sdk/innerbean/ThirdInfo;", "bindGoogle", "bindEmail", "bindVK", "bindPlay", "bindLine", "bindTwitter", "bindNaver", "bd94hi", "bdhw", "bdTapTap", "bdPPID", "signApple", "(Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;Lcom/quickgame/android/sdk/innerbean/ThirdInfo;)V", "getBd94hi", "()Lcom/quickgame/android/sdk/innerbean/ThirdInfo;", "getBdPPID", "getBdTapTap", "getBdhw", "getBindEmail", "getBindFB", "getBindGoogle", "getBindLine", "getBindNaver", "getBindPlay", "getBindTwitter", "getBindVK", "getSignApple", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class BindInfo {
    private final ThirdInfo bd94hi;
    private final ThirdInfo bdPPID;
    private final ThirdInfo bdTapTap;
    private final ThirdInfo bdhw;
    private final ThirdInfo bindEmail;
    private final ThirdInfo bindFB;
    private final ThirdInfo bindGoogle;
    private final ThirdInfo bindLine;
    private final ThirdInfo bindNaver;
    private final ThirdInfo bindPlay;
    private final ThirdInfo bindTwitter;
    private final ThirdInfo bindVK;
    private final ThirdInfo signApple;

    public BindInfo(ThirdInfo thirdInfo, ThirdInfo thirdInfo2, ThirdInfo thirdInfo3, ThirdInfo thirdInfo4, ThirdInfo thirdInfo5, ThirdInfo thirdInfo6, ThirdInfo thirdInfo7, ThirdInfo thirdInfo8, ThirdInfo thirdInfo9, ThirdInfo thirdInfo10, ThirdInfo thirdInfo11, ThirdInfo thirdInfo12, ThirdInfo thirdInfo13) {
        this.bindFB = thirdInfo;
        this.bindGoogle = thirdInfo2;
        this.bindEmail = thirdInfo3;
        this.bindVK = thirdInfo4;
        this.bindPlay = thirdInfo5;
        this.bindLine = thirdInfo6;
        this.bindTwitter = thirdInfo7;
        this.bindNaver = thirdInfo8;
        this.bd94hi = thirdInfo9;
        this.bdhw = thirdInfo10;
        this.bdTapTap = thirdInfo11;
        this.bdPPID = thirdInfo12;
        this.signApple = thirdInfo13;
    }

    public static /* synthetic */ BindInfo copy$default(BindInfo bindInfo, ThirdInfo thirdInfo, ThirdInfo thirdInfo2, ThirdInfo thirdInfo3, ThirdInfo thirdInfo4, ThirdInfo thirdInfo5, ThirdInfo thirdInfo6, ThirdInfo thirdInfo7, ThirdInfo thirdInfo8, ThirdInfo thirdInfo9, ThirdInfo thirdInfo10, ThirdInfo thirdInfo11, ThirdInfo thirdInfo12, ThirdInfo thirdInfo13, int i, Object obj) {
        BindInfo bindInfo2 = bindInfo;
        int i2 = i;
        return bindInfo.copy((i2 & 1) != 0 ? bindInfo2.bindFB : thirdInfo, (i2 & 2) != 0 ? bindInfo2.bindGoogle : thirdInfo2, (i2 & 4) != 0 ? bindInfo2.bindEmail : thirdInfo3, (i2 & 8) != 0 ? bindInfo2.bindVK : thirdInfo4, (i2 & 16) != 0 ? bindInfo2.bindPlay : thirdInfo5, (i2 & 32) != 0 ? bindInfo2.bindLine : thirdInfo6, (i2 & 64) != 0 ? bindInfo2.bindTwitter : thirdInfo7, (i2 & 128) != 0 ? bindInfo2.bindNaver : thirdInfo8, (i2 & 256) != 0 ? bindInfo2.bd94hi : thirdInfo9, (i2 & 512) != 0 ? bindInfo2.bdhw : thirdInfo10, (i2 & 1024) != 0 ? bindInfo2.bdTapTap : thirdInfo11, (i2 & 2048) != 0 ? bindInfo2.bdPPID : thirdInfo12, (i2 & 4096) != 0 ? bindInfo2.signApple : thirdInfo13);
    }

    public final ThirdInfo component1() {
        return this.bindFB;
    }

    public final ThirdInfo component10() {
        return this.bdhw;
    }

    public final ThirdInfo component11() {
        return this.bdTapTap;
    }

    public final ThirdInfo component12() {
        return this.bdPPID;
    }

    public final ThirdInfo component13() {
        return this.signApple;
    }

    public final ThirdInfo component2() {
        return this.bindGoogle;
    }

    public final ThirdInfo component3() {
        return this.bindEmail;
    }

    public final ThirdInfo component4() {
        return this.bindVK;
    }

    public final ThirdInfo component5() {
        return this.bindPlay;
    }

    public final ThirdInfo component6() {
        return this.bindLine;
    }

    public final ThirdInfo component7() {
        return this.bindTwitter;
    }

    public final ThirdInfo component8() {
        return this.bindNaver;
    }

    public final ThirdInfo component9() {
        return this.bd94hi;
    }

    public final BindInfo copy(ThirdInfo thirdInfo, ThirdInfo thirdInfo2, ThirdInfo thirdInfo3, ThirdInfo thirdInfo4, ThirdInfo thirdInfo5, ThirdInfo thirdInfo6, ThirdInfo thirdInfo7, ThirdInfo thirdInfo8, ThirdInfo thirdInfo9, ThirdInfo thirdInfo10, ThirdInfo thirdInfo11, ThirdInfo thirdInfo12, ThirdInfo thirdInfo13) {
        return new BindInfo(thirdInfo, thirdInfo2, thirdInfo3, thirdInfo4, thirdInfo5, thirdInfo6, thirdInfo7, thirdInfo8, thirdInfo9, thirdInfo10, thirdInfo11, thirdInfo12, thirdInfo13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfo)) {
            return false;
        }
        BindInfo bindInfo = (BindInfo) obj;
        return Intrinsics.areEqual((Object) this.bindFB, (Object) bindInfo.bindFB) && Intrinsics.areEqual((Object) this.bindGoogle, (Object) bindInfo.bindGoogle) && Intrinsics.areEqual((Object) this.bindEmail, (Object) bindInfo.bindEmail) && Intrinsics.areEqual((Object) this.bindVK, (Object) bindInfo.bindVK) && Intrinsics.areEqual((Object) this.bindPlay, (Object) bindInfo.bindPlay) && Intrinsics.areEqual((Object) this.bindLine, (Object) bindInfo.bindLine) && Intrinsics.areEqual((Object) this.bindTwitter, (Object) bindInfo.bindTwitter) && Intrinsics.areEqual((Object) this.bindNaver, (Object) bindInfo.bindNaver) && Intrinsics.areEqual((Object) this.bd94hi, (Object) bindInfo.bd94hi) && Intrinsics.areEqual((Object) this.bdhw, (Object) bindInfo.bdhw) && Intrinsics.areEqual((Object) this.bdTapTap, (Object) bindInfo.bdTapTap) && Intrinsics.areEqual((Object) this.bdPPID, (Object) bindInfo.bdPPID) && Intrinsics.areEqual((Object) this.signApple, (Object) bindInfo.signApple);
    }

    public final ThirdInfo getBd94hi() {
        return this.bd94hi;
    }

    public final ThirdInfo getBdPPID() {
        return this.bdPPID;
    }

    public final ThirdInfo getBdTapTap() {
        return this.bdTapTap;
    }

    public final ThirdInfo getBdhw() {
        return this.bdhw;
    }

    public final ThirdInfo getBindEmail() {
        return this.bindEmail;
    }

    public final ThirdInfo getBindFB() {
        return this.bindFB;
    }

    public final ThirdInfo getBindGoogle() {
        return this.bindGoogle;
    }

    public final ThirdInfo getBindLine() {
        return this.bindLine;
    }

    public final ThirdInfo getBindNaver() {
        return this.bindNaver;
    }

    public final ThirdInfo getBindPlay() {
        return this.bindPlay;
    }

    public final ThirdInfo getBindTwitter() {
        return this.bindTwitter;
    }

    public final ThirdInfo getBindVK() {
        return this.bindVK;
    }

    public final ThirdInfo getSignApple() {
        return this.signApple;
    }

    public int hashCode() {
        ThirdInfo thirdInfo = this.bindFB;
        int i = 0;
        int hashCode = (thirdInfo != null ? thirdInfo.hashCode() : 0) * 31;
        ThirdInfo thirdInfo2 = this.bindGoogle;
        int hashCode2 = (hashCode + (thirdInfo2 != null ? thirdInfo2.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo3 = this.bindEmail;
        int hashCode3 = (hashCode2 + (thirdInfo3 != null ? thirdInfo3.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo4 = this.bindVK;
        int hashCode4 = (hashCode3 + (thirdInfo4 != null ? thirdInfo4.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo5 = this.bindPlay;
        int hashCode5 = (hashCode4 + (thirdInfo5 != null ? thirdInfo5.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo6 = this.bindLine;
        int hashCode6 = (hashCode5 + (thirdInfo6 != null ? thirdInfo6.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo7 = this.bindTwitter;
        int hashCode7 = (hashCode6 + (thirdInfo7 != null ? thirdInfo7.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo8 = this.bindNaver;
        int hashCode8 = (hashCode7 + (thirdInfo8 != null ? thirdInfo8.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo9 = this.bd94hi;
        int hashCode9 = (hashCode8 + (thirdInfo9 != null ? thirdInfo9.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo10 = this.bdhw;
        int hashCode10 = (hashCode9 + (thirdInfo10 != null ? thirdInfo10.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo11 = this.bdTapTap;
        int hashCode11 = (hashCode10 + (thirdInfo11 != null ? thirdInfo11.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo12 = this.bdPPID;
        int hashCode12 = (hashCode11 + (thirdInfo12 != null ? thirdInfo12.hashCode() : 0)) * 31;
        ThirdInfo thirdInfo13 = this.signApple;
        if (thirdInfo13 != null) {
            i = thirdInfo13.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        return "BindInfo(bindFB=" + this.bindFB + ", bindGoogle=" + this.bindGoogle + ", bindEmail=" + this.bindEmail + ", bindVK=" + this.bindVK + ", bindPlay=" + this.bindPlay + ", bindLine=" + this.bindLine + ", bindTwitter=" + this.bindTwitter + ", bindNaver=" + this.bindNaver + ", bd94hi=" + this.bd94hi + ", bdhw=" + this.bdhw + ", bdTapTap=" + this.bdTapTap + ", bdPPID=" + this.bdPPID + ", signApple=" + this.signApple + ")";
    }
}
