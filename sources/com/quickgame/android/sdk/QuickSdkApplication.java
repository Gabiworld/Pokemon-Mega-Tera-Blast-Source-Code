package com.quickgame.android.sdk;

import android.app.Application;
import com.quickgame.android.sdk.p043l.C1601d;
import com.tendcloud.tenddata.TalkingDataGA;

public class QuickSdkApplication extends Application {
    public void onCreate() {
        super.onCreate();
        TalkingDataGA.init(this, C1601d.m2069c(this, "TD_AppID"), "TalkingData");
    }
}
