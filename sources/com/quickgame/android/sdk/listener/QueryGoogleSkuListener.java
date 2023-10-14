package com.quickgame.android.sdk.listener;

import com.android.billingclient.api.SkuDetails;
import java.util.List;

public interface QueryGoogleSkuListener {
    void onResult(List<SkuDetails> list);
}
