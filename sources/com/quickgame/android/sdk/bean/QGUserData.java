package com.quickgame.android.sdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class QGUserData implements Parcelable, Serializable {
    public static final Parcelable.Creator<QGUserData> CREATOR = new Parcelable.Creator<QGUserData>() {
        public QGUserData createFromParcel(Parcel parcel) {
            QGUserData qGUserData = new QGUserData();
            qGUserData.setUserName(parcel.readString());
            qGUserData.setUid(parcel.readString());
            qGUserData.setdisplayUid(parcel.readString());
            qGUserData.setToken(parcel.readString());
            boolean z = false;
            qGUserData.setGuest(parcel.readInt() == 1);
            qGUserData.setOpenType(parcel.readString());
            qGUserData.setNewUser(parcel.readInt() == 1);
            if (parcel.readInt() == 1) {
                z = true;
            }
            qGUserData.setPreReg(z);
            qGUserData.setIsTrash(parcel.readInt());
            return qGUserData;
        }

        public QGUserData[] newArray(int i) {
            return new QGUserData[i];
        }
    };
    private String displayUid = "";
    private boolean isGuest = false;
    private boolean isNewUser = false;
    private boolean isPreReg = false;
    private int isTrash;
    private String openType = "";
    private String token = "";
    private String uid = "";
    private String userName = "";

    public static QGUserData generateFromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        QGUserData qGUserData = new QGUserData();
        qGUserData.userName = jSONObject.getString("username");
        qGUserData.uid = jSONObject.getString("uid");
        if (jSONObject.has("displayUid")) {
            qGUserData.displayUid = jSONObject.getString("displayUid");
        } else {
            qGUserData.displayUid = "";
        }
        qGUserData.token = jSONObject.getString("token");
        qGUserData.isGuest = "1".equals(jSONObject.getString("isGuest"));
        if (!TextUtils.isEmpty(jSONObject.optString("openType"))) {
            qGUserData.openType = jSONObject.optString("openType");
        } else if (qGUserData.isGuest) {
            qGUserData.openType = "1";
        } else {
            qGUserData.openType = QGConstant.LOGIN_OPEN_TYPE_EMAIL;
        }
        boolean z = false;
        qGUserData.isNewUser = jSONObject.optInt("isNewUser", 0) == 1;
        qGUserData.isTrash = jSONObject.optInt("isTrash");
        if (jSONObject.optInt("prereg", 0) == 1) {
            z = true;
        }
        qGUserData.isPreReg = z;
        return qGUserData;
    }

    public int describeContents() {
        return 0;
    }

    public String getFBUid() {
        return C1684b.m2308e();
    }

    public String getGoogleUid() {
        return C1687c.m2319b();
    }

    public int getIsTrash() {
        return this.isTrash;
    }

    public String getOpenType() {
        return this.openType;
    }

    public String getToken() {
        return this.token;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getdisplayUid() {
        String str = this.displayUid;
        return str == "" ? this.uid : str;
    }

    public boolean isGuest() {
        return this.isGuest;
    }

    public boolean isNewUser() {
        return this.isNewUser;
    }

    public boolean isPreReg() {
        return this.isPreReg;
    }

    public void setGuest(boolean z) {
        this.isGuest = z;
    }

    public void setIsTrash(int i) {
        this.isTrash = i;
    }

    public void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public void setOpenType(String str) {
        this.openType = str;
    }

    public void setPreReg(boolean z) {
        this.isPreReg = z;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setdisplayUid(String str) {
        this.displayUid = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userName);
        parcel.writeString(this.uid);
        parcel.writeString(this.displayUid);
        parcel.writeString(this.token);
        parcel.writeInt(this.isGuest ? 1 : 0);
        parcel.writeString(this.openType);
        parcel.writeInt(this.isNewUser ? 1 : 0);
        parcel.writeInt(this.isPreReg ? 1 : 0);
        parcel.writeInt(this.isTrash);
    }
}
