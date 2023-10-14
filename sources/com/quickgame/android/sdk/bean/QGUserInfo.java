package com.quickgame.android.sdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class QGUserInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<QGUserInfo> CREATOR = new Parcelable.Creator<QGUserInfo>() {
        public QGUserInfo createFromParcel(Parcel parcel) {
            QGUserInfo qGUserInfo = new QGUserInfo();
            qGUserInfo.setNikeName(parcel.readString());
            qGUserInfo.setMobileNumber(parcel.readString());
            qGUserInfo.setBindMobile(((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue());
            qGUserInfo.setGender(parcel.readInt());
            qGUserInfo.setAmount(parcel.readString());
            qGUserInfo.setWallet(((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue());
            qGUserInfo.setCurrency(parcel.readString());
            return qGUserInfo;
        }

        public QGUserInfo[] newArray(int i) {
            return new QGUserInfo[i];
        }
    };
    public static int GENDER_FEMALE = 2;
    public static int GENDER_MALE = 1;
    public static int GENDER_UNDEFINE = 0;
    private static final long serialVersionUID = 1;
    private String amount;
    private boolean bindMobile;
    private String currency;
    private int gender;
    private String mobileNumber;
    private String nikeName;
    private boolean useWallet;

    public static QGUserInfo generateFromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        QGUserInfo qGUserInfo = new QGUserInfo();
        qGUserInfo.nikeName = jSONObject.getString("nickName");
        String string = jSONObject.getString("sexType");
        boolean z = true;
        try {
            if (jSONObject.has("useWallet")) {
                jSONObject.getInt("useWallet");
                qGUserInfo.useWallet = jSONObject.getInt("useWallet") == 1;
            }
            if (jSONObject.has("amount")) {
                qGUserInfo.amount = jSONObject.getString("amount");
                qGUserInfo.currency = jSONObject.getString("currency");
                Log.d("QGUserInfo", "userInfo.amount=" + qGUserInfo.amount);
                Log.d("QGUserInfo", "userInfo.currency=" + qGUserInfo.currency);
            }
        } catch (Exception unused) {
            qGUserInfo.amount = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            qGUserInfo.useWallet = false;
        }
        try {
            qGUserInfo.gender = Integer.valueOf(string).intValue();
        } catch (Exception unused2) {
            qGUserInfo.gender = 0;
        }
        qGUserInfo.mobileNumber = jSONObject.getString("phone");
        if (jSONObject.getInt("isBindPhone") != 1) {
            z = false;
        }
        qGUserInfo.bindMobile = z;
        return qGUserInfo;
    }

    public int describeContents() {
        return 0;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public int getGender() {
        return this.gender;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getNikeName() {
        return this.nikeName;
    }

    public boolean getWallet() {
        return this.useWallet;
    }

    public boolean isBindMobile() {
        return this.bindMobile;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBindMobile(boolean z) {
        this.bindMobile = z;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void setNikeName(String str) {
        this.nikeName = str;
    }

    public void setWallet(boolean z) {
        this.useWallet = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nikeName);
        parcel.writeString(this.mobileNumber);
        parcel.writeValue(Boolean.valueOf(this.bindMobile));
        parcel.writeInt(this.gender);
        parcel.writeString(this.amount);
        parcel.writeValue(Boolean.valueOf(this.useWallet));
        parcel.writeString(this.currency);
    }
}
