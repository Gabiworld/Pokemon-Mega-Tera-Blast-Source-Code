package com.quickgame.android.sdk.bean;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.quickgame.android.sdk.C1128a;

public class QGRoleInfo implements Parcelable {
    public static Parcelable.Creator<QGRoleInfo> CREATOR = new Parcelable.Creator<QGRoleInfo>() {
        public QGRoleInfo createFromParcel(Parcel parcel) {
            QGRoleInfo qGRoleInfo = new QGRoleInfo();
            String unused = qGRoleInfo.roleName = parcel.readString();
            String unused2 = qGRoleInfo.roleId = parcel.readString();
            String unused3 = qGRoleInfo.serverName = parcel.readString();
            String unused4 = qGRoleInfo.vipLevel = parcel.readString();
            String unused5 = qGRoleInfo.roleLevel = parcel.readString();
            String unused6 = qGRoleInfo.serverId = parcel.readString();
            String unused7 = qGRoleInfo.roleBalance = parcel.readString();
            String unused8 = qGRoleInfo.rolePartyName = parcel.readString();
            return qGRoleInfo;
        }

        public QGRoleInfo[] newArray(int i) {
            return new QGRoleInfo[i];
        }
    };
    /* access modifiers changed from: private */
    public String roleBalance = "";
    /* access modifiers changed from: private */
    public String roleId = "";
    /* access modifiers changed from: private */
    public String roleLevel = "";
    /* access modifiers changed from: private */
    public String roleName = "";
    /* access modifiers changed from: private */
    public String rolePartyName = "";
    /* access modifiers changed from: private */
    public String serverId = "";
    /* access modifiers changed from: private */
    public String serverName = "";
    /* access modifiers changed from: private */
    public String vipLevel = "";

    public int describeContents() {
        return 0;
    }

    public String getRoleBalance() {
        return this.roleBalance;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public String getRoleLevel() {
        return this.roleLevel;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getRolePartyName() {
        return this.rolePartyName;
    }

    public String getServerId() {
        return this.serverId;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getVipLevel() {
        return this.vipLevel;
    }

    public void readFromParcel(Parcel parcel) {
        this.roleName = parcel.readString();
        this.roleId = parcel.readString();
        this.serverName = parcel.readString();
        this.vipLevel = parcel.readString();
        this.roleLevel = parcel.readString();
        this.serverId = parcel.readString();
        this.roleBalance = parcel.readString();
        this.rolePartyName = parcel.readString();
    }

    public void setRoleBalance(String str) {
        this.roleBalance = str;
    }

    public void setRoleId(String str) {
        this.roleId = str;
        SharedPreferences.Editor edit = C1128a.m798r().mo11981e().getSharedPreferences("FB_info", 0).edit();
        edit.putString("roleId", str);
        edit.commit();
    }

    public void setRoleLevel(String str) {
        this.roleLevel = str;
    }

    public void setRoleName(String str) {
        this.roleName = str;
    }

    public void setRolePartyName(String str) {
        this.rolePartyName = str;
    }

    public void setServerId(String str) {
        this.serverId = str;
        SharedPreferences.Editor edit = C1128a.m798r().mo11981e().getSharedPreferences("FB_info", 0).edit();
        edit.putString("serverId", str);
        edit.commit();
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setVipLevel(String str) {
        this.vipLevel = str;
    }

    public String toString() {
        return "QGRoleInfo{roleName='" + this.roleName + '\'' + ", roleId='" + this.roleId + '\'' + ", serverName='" + this.serverName + '\'' + ", vipLevel='" + this.vipLevel + '\'' + ", roleLevel='" + this.roleLevel + '\'' + ", serverId='" + this.serverId + '\'' + ", roleBalance='" + this.roleBalance + '\'' + ", rolePartyName='" + this.rolePartyName + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.roleName);
        parcel.writeString(this.roleId);
        parcel.writeString(this.serverName);
        parcel.writeString(this.vipLevel);
        parcel.writeString(this.roleLevel);
        parcel.writeString(this.serverId);
        parcel.writeString(this.roleBalance);
        parcel.writeString(this.rolePartyName);
    }
}
