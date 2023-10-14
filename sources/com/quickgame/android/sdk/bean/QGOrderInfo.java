package com.quickgame.android.sdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import org.json.JSONObject;

public class QGOrderInfo implements Parcelable {
    public static Parcelable.Creator<QGOrderInfo> CREATOR = new Parcelable.Creator<QGOrderInfo>() {
        public QGOrderInfo createFromParcel(Parcel parcel) {
            QGOrderInfo qGOrderInfo = new QGOrderInfo();
            String unused = qGOrderInfo.payType = parcel.readString();
            String unused2 = qGOrderInfo.orderSubject = parcel.readString();
            String unused3 = qGOrderInfo.productOrderId = parcel.readString();
            String unused4 = qGOrderInfo.qkOrderId = parcel.readString();
            String unused5 = qGOrderInfo.extrasParams = parcel.readString();
            String unused6 = qGOrderInfo.callbackURL = parcel.readString();
            String unused7 = qGOrderInfo.goodsId = parcel.readString();
            String unused8 = qGOrderInfo.suggestCurrency = parcel.readString();
            double unused9 = qGOrderInfo.amount = parcel.readDouble();
            String unused10 = qGOrderInfo.skuType = parcel.readString();
            return qGOrderInfo;
        }

        public QGOrderInfo[] newArray(int i) {
            return new QGOrderInfo[i];
        }
    };
    /* access modifiers changed from: private */
    public double amount = 0.0d;
    /* access modifiers changed from: private */
    public String callbackURL = "";
    /* access modifiers changed from: private */
    public String extrasParams = "";
    /* access modifiers changed from: private */
    public String goodsId = "";
    /* access modifiers changed from: private */
    public String orderSubject = "";
    /* access modifiers changed from: private */
    public String payType = "";
    /* access modifiers changed from: private */
    public String productOrderId = "";
    /* access modifiers changed from: private */
    public String qkOrderId = "";
    /* access modifiers changed from: private */
    public String skuType = BillingClient.SkuType.INAPP;
    /* access modifiers changed from: private */
    public String suggestCurrency = "";

    public void changeType(int i) {
        this.payType = i + "";
    }

    public int describeContents() {
        return 0;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCallbackURL() {
        return this.callbackURL;
    }

    public String getExtrasParams() {
        return this.extrasParams;
    }

    public String getGoodsId() {
        return this.goodsId;
    }

    public String getOrderSubject() {
        return this.orderSubject;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getProductOrderId() {
        return this.productOrderId;
    }

    public String getQkOrderNo() {
        return this.qkOrderId;
    }

    public String getSkuType() {
        return this.skuType;
    }

    public String getSuggestCurrency() {
        return this.suggestCurrency;
    }

    public void readFromParcel(Parcel parcel) {
        this.payType = parcel.readString();
        this.orderSubject = parcel.readString();
        this.productOrderId = parcel.readString();
        this.qkOrderId = parcel.readString();
        this.extrasParams = parcel.readString();
        this.callbackURL = parcel.readString();
        this.goodsId = parcel.readString();
        this.suggestCurrency = parcel.readString();
        this.amount = parcel.readDouble();
        this.skuType = parcel.readString();
    }

    public void setAmount(double d) {
        this.amount = d;
    }

    public void setCallbackURL(String str) {
        this.callbackURL = str;
    }

    public void setExtrasParams(String str) {
        this.extrasParams = str;
    }

    public void setGoodsId(String str) {
        this.goodsId = str;
    }

    public void setOrderSubject(String str) {
        this.orderSubject = str;
    }

    public void setProductOrderId(String str) {
        this.productOrderId = str;
    }

    public void setQkOrderNo(String str) {
        this.qkOrderId = str;
    }

    public void setSkuType(String str) {
        this.skuType = str;
    }

    public void setSuggestCurrency(String str) {
        this.suggestCurrency = str;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payType", this.payType);
            jSONObject.put("orderSubject", this.orderSubject);
            jSONObject.put("productOrderId", this.productOrderId);
            jSONObject.put("qkOrderId", this.qkOrderId);
            jSONObject.put("extrasParams", this.extrasParams);
            jSONObject.put("callbackURL", this.callbackURL);
            jSONObject.put("goodsId", this.goodsId);
            jSONObject.put("suggestCurrency", this.suggestCurrency);
            jSONObject.put("amount", this.amount);
            jSONObject.put("skuType", this.skuType);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.payType);
        parcel.writeString(this.orderSubject);
        parcel.writeString(this.productOrderId);
        parcel.writeString(this.qkOrderId);
        parcel.writeString(this.extrasParams);
        parcel.writeString(this.callbackURL);
        parcel.writeString(this.goodsId);
        parcel.writeString(this.suggestCurrency);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.skuType);
    }
}
