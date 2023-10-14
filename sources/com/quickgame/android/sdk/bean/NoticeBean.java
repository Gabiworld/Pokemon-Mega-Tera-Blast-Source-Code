package com.quickgame.android.sdk.bean;

import com.google.gson.annotations.SerializedName;

public class NoticeBean {
    @SerializedName("content")
    public String content;
    @SerializedName("btime")
    public long startTime;
    @SerializedName("title")
    public String title;
}
