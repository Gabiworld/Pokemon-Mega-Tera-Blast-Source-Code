package com.quickgame.android.sdk.innerbean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, mo13302d2 = {"Lcom/quickgame/android/sdk/innerbean/ServerInfo;", "", "id", "", "title", "boolean", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBoolean", "()Z", "setBoolean", "(Z)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class ServerInfo {

    /* renamed from: boolean  reason: not valid java name */
    private boolean f1788boolean;

    /* renamed from: id */
    private final String f1565id;
    private final String title;

    public ServerInfo(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        this.f1565id = str;
        this.title = str2;
        this.f1788boolean = z;
    }

    public static /* synthetic */ ServerInfo copy$default(ServerInfo serverInfo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverInfo.f1565id;
        }
        if ((i & 2) != 0) {
            str2 = serverInfo.title;
        }
        if ((i & 4) != 0) {
            z = serverInfo.f1788boolean;
        }
        return serverInfo.copy(str, str2, z);
    }

    public final String component1() {
        return this.f1565id;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.f1788boolean;
    }

    public final ServerInfo copy(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        return new ServerInfo(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerInfo)) {
            return false;
        }
        ServerInfo serverInfo = (ServerInfo) obj;
        return Intrinsics.areEqual((Object) this.f1565id, (Object) serverInfo.f1565id) && Intrinsics.areEqual((Object) this.title, (Object) serverInfo.title) && this.f1788boolean == serverInfo.f1788boolean;
    }

    public final boolean getBoolean() {
        return this.f1788boolean;
    }

    public final String getId() {
        return this.f1565id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.f1565id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f1788boolean;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final void setBoolean(boolean z) {
        this.f1788boolean = z;
    }

    public String toString() {
        return "ServerInfo(id=" + this.f1565id + ", title=" + this.title + ", boolean=" + this.f1788boolean + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServerInfo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }
}
