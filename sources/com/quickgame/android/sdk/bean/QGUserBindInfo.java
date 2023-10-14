package com.quickgame.android.sdk.bean;

import com.facebook.appevents.AppEventsConstants;
import java.io.Serializable;

public class QGUserBindInfo implements Serializable {
    private String appleAccountName = "";
    private String emailAccountName = "";
    private String fbAccountName = "";
    private String googleAccountName = "";
    private boolean isBind94Hi = false;
    private boolean isBindApple = false;
    private boolean isBindEmail = false;
    private boolean isBindFB = false;
    private boolean isBindGoogle = false;
    private boolean isBindLine = false;
    private boolean isBindMetaSens = false;
    private boolean isBindNaver = false;
    private boolean isBindPPID = false;
    private boolean isBindPlay = false;
    private boolean isBindTapTap = false;
    private boolean isBindTwitter = false;
    private boolean isBindVk = false;
    private String lineAccountName = "";
    private String metaSensAccountName = "";
    private String naverAccountName = "";
    private String playAccountName = "";
    private String ppidAccountName = "";
    private String taptapAccountName = "";
    private String twitterAccountName = "";
    private String uid = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private String vkAccountName = "";

    public String getAppleAccountName() {
        return this.appleAccountName;
    }

    public String getEmailAccountName() {
        return this.emailAccountName;
    }

    public String getFbAccountName() {
        return this.fbAccountName;
    }

    public String getGoogleAccountName() {
        return this.googleAccountName;
    }

    public String getLineAccountName() {
        return this.lineAccountName;
    }

    public String getMetaSensAccountName() {
        return this.metaSensAccountName;
    }

    public String getNaverAccountName() {
        return this.naverAccountName;
    }

    public String getPlayAccountName() {
        return this.playAccountName;
    }

    public String getPpidAccountName() {
        return this.ppidAccountName;
    }

    public String getTapTapAccountName() {
        return this.taptapAccountName;
    }

    public String getTwitterAccountName() {
        return this.twitterAccountName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getVkAccountName() {
        return this.vkAccountName;
    }

    public boolean isBind94Hi() {
        return this.isBind94Hi;
    }

    public boolean isBindApple() {
        return this.isBindApple;
    }

    public boolean isBindEmail() {
        return this.isBindEmail;
    }

    public boolean isBindFacebook() {
        return this.isBindFB;
    }

    public boolean isBindGoogle() {
        return this.isBindGoogle;
    }

    public boolean isBindLine() {
        return this.isBindLine;
    }

    public boolean isBindMetaSens() {
        return this.isBindMetaSens;
    }

    public boolean isBindNaver() {
        return this.isBindNaver;
    }

    public boolean isBindPPID() {
        return this.isBindPPID;
    }

    public boolean isBindPlay() {
        return this.isBindPlay;
    }

    public boolean isBindTapTap() {
        return this.isBindTapTap;
    }

    public boolean isBindTwitter() {
        return this.isBindTwitter;
    }

    public boolean isBindVk() {
        return this.isBindVk;
    }

    public void setAppleAccountName(String str) {
        this.appleAccountName = str;
    }

    public void setBind94Hi(boolean z) {
        this.isBind94Hi = z;
    }

    public void setBindApple(boolean z) {
        this.isBindApple = z;
    }

    public void setBindEmail(boolean z) {
        this.isBindEmail = z;
    }

    public void setBindFB(boolean z) {
        this.isBindFB = z;
    }

    public void setBindGoogle(boolean z) {
        this.isBindGoogle = z;
    }

    public void setBindLine(boolean z) {
        this.isBindLine = z;
    }

    public void setBindMetaSens(boolean z) {
        this.isBindMetaSens = z;
    }

    public void setBindNaver(boolean z) {
        this.isBindNaver = z;
    }

    public void setBindPPID(boolean z) {
        this.isBindPPID = z;
    }

    public void setBindPlay(boolean z) {
        this.isBindPlay = z;
    }

    public void setBindTapTap(boolean z) {
        this.isBindTapTap = z;
    }

    public void setBindTwitter(boolean z) {
        this.isBindTwitter = z;
    }

    public void setBindVk(boolean z) {
        this.isBindVk = z;
    }

    public void setEmailAccountName(String str) {
        this.emailAccountName = str;
    }

    public void setFbAccountName(String str) {
        this.fbAccountName = str;
    }

    public void setGoogleAccountName(String str) {
        this.googleAccountName = str;
    }

    public void setLineAccountName(String str) {
        this.lineAccountName = str;
    }

    public void setMetaSensAccountName(String str) {
        this.metaSensAccountName = str;
    }

    public void setNaverAccountName(String str) {
        this.naverAccountName = str;
    }

    public void setPlayAccountName(String str) {
        this.playAccountName = str;
    }

    public void setPpidAccountName(String str) {
        this.ppidAccountName = str;
    }

    public void setTaptapAccountName(String str) {
        this.taptapAccountName = str;
    }

    public void setTwitterAccountName(String str) {
        this.twitterAccountName = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setVkAccountName(String str) {
        this.vkAccountName = str;
    }
}
