package com.quickgame.android.sdk.bean;

import com.quickgame.android.sdk.thirdlogin.C1687c;

public class ThirdUserInfo {
    private static String FBGender = "";
    private static String FBPicUrl = "";
    private static String FBUid = "";
    private static String FBUserName = "";
    private static String GoogleUid = "";

    public String getFBGender() {
        return FBGender;
    }

    public String getFBPicUrl() {
        return FBPicUrl;
    }

    public String getFBUid() {
        return FBUid;
    }

    public String getFBUserName() {
        return FBUserName;
    }

    public String getGoogleUid() {
        return C1687c.m2319b();
    }

    public void setFBGender(String str) {
        FBGender = str;
    }

    public void setFBPicUrl(String str) {
        FBPicUrl = str;
    }

    public void setFBUid(String str) {
        FBUid = str;
    }

    public void setFBUserName(String str) {
        FBUserName = str;
    }

    public void setGoogleUid(String str) {
        GoogleUid = str;
    }

    public String toString() {
        return "ThirdUserInfo={GoogleUid:" + GoogleUid + "&FBUid:" + FBUid + "&FBUserName:" + FBUserName + "&FBGender" + FBGender + "&FBPic" + FBPicUrl + "}";
    }
}
