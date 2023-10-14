package com.quickgame.android.sdk.listener;

public interface RewardedAdShowListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(String str);

    void onAdImpression();

    void onAdShowed();

    void onUserEarnedReward(String str, int i);
}
