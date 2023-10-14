package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public class PriceChangeFlowParams {
    /* access modifiers changed from: private */
    public SkuDetails zza;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static class Builder {
        private SkuDetails zza;

        public PriceChangeFlowParams build() {
            SkuDetails skuDetails = this.zza;
            if (skuDetails != null) {
                PriceChangeFlowParams priceChangeFlowParams = new PriceChangeFlowParams();
                priceChangeFlowParams.zza = skuDetails;
                return priceChangeFlowParams;
            }
            throw new IllegalArgumentException("SkuDetails must be set");
        }

        public Builder setSkuDetails(SkuDetails skuDetails) {
            this.zza = skuDetails;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SkuDetails getSkuDetails() {
        return this.zza;
    }
}
