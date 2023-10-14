package com.quickgame.android.sdk;

import com.quickgame.android.sdk.listener.PayCloseCallback;
import com.quickgame.android.sdk.p040i.C1576c;

public class QuickGameConfig {

    /* renamed from: a */
    private static QuickGameConfig f577a;

    public static QuickGameConfig getInstance() {
        if (f577a == null) {
            synchronized (QuickGameConfig.class) {
                if (f577a == null) {
                    f577a = new QuickGameConfig();
                }
            }
        }
        return f577a;
    }

    public void setPayCloseCallback(PayCloseCallback payCloseCallback) {
        C1576c.m1961b().mo12898a(payCloseCallback);
    }
}
