package com.quickgame.android.sdk.listener;

import com.google.android.gms.ads.rewarded.RewardedAd;

public interface RewardedAdLoadListener {
    void onFailed(String str);

    void onSuccess(RewardedAd rewardedAd);
}
