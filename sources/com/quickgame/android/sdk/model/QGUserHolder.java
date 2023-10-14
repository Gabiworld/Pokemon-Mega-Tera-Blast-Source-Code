package com.quickgame.android.sdk.model;

public class QGUserHolder {
    public static final int LOGIN_CANCEL = 2;
    public static final int LOGIN_FAILED = 3;
    public static final int LOGIN_SUCCESS = 1;
    private String msg;
    private int stateCode;

    public String getMsg() {
        return this.msg;
    }

    public int getStateCode() {
        return this.stateCode;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setStateCode(int i) {
        this.stateCode = i;
    }
}
