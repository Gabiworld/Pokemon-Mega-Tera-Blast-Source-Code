package com.quickgame.android.sdk.listener;

public interface CheckThirdLoginListener {
    void onAnotherAccount();

    void onCancel();

    void onError(String str);

    void onSameAccount();
}
