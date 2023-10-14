package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    public static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    public static final String EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN = "oldSkuPurchaseToken";
    public static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    public static final String EXTRA_PARAM_KEY_VR = "vr";
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public String zzd;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public zzu zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private int zzd = 0;
        private ArrayList zze;
        private boolean zzf;

        private Builder() {
        }

        /* synthetic */ Builder(zzao zzao) {
        }

        public BillingFlowParams build() {
            ArrayList arrayList = this.zze;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!this.zze.contains((Object) null)) {
                if (this.zze.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.zze.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.zze;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                        if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {
                            i++;
                        } else {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String zzd2 = skuDetails.zzd();
                    ArrayList arrayList3 = this.zze;
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                        if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zzd2.equals(skuDetails3.zzd())) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams((zzar) null);
                billingFlowParams.zza = !((SkuDetails) this.zze.get(0)).zzd().isEmpty();
                billingFlowParams.zzb = this.zza;
                billingFlowParams.zzd = this.zzc;
                billingFlowParams.zzc = this.zzb;
                billingFlowParams.zze = this.zzd;
                ArrayList arrayList4 = this.zze;
                billingFlowParams.zzg = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                billingFlowParams.zzh = this.zzf;
                billingFlowParams.zzf = zzu.zzh();
                return billingFlowParams;
            } else {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zze = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzb = subscriptionUpdateParams.zzb();
            this.zzd = subscriptionUpdateParams.zza();
            return this;
        }

        public Builder setVrPurchaseFlow(boolean z) {
            this.zzf = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static class SubscriptionUpdateParams {
        /* access modifiers changed from: private */
        public String zza;
        /* access modifiers changed from: private */
        public int zzb = 0;

        /* compiled from: com.android.billingclient:billing@@4.1.0 */
        public static class Builder {
            private String zza;
            private int zzb = 0;

            private Builder() {
            }

            /* synthetic */ Builder(zzap zzap) {
            }

            public SubscriptionUpdateParams build() {
                if (!TextUtils.isEmpty(this.zza) || !TextUtils.isEmpty((CharSequence) null)) {
                    SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams((zzaq) null);
                    subscriptionUpdateParams.zza = this.zza;
                    subscriptionUpdateParams.zzb = this.zzb;
                    return subscriptionUpdateParams;
                }
                throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
            }

            public Builder setOldSkuPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            public Builder setReplaceSkusProrationMode(int i) {
                this.zzb = i;
                return this;
            }
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(zzaq zzaq) {
        }

        public static Builder newBuilder() {
            return new Builder((zzap) null);
        }

        /* access modifiers changed from: package-private */
        public final int zza() {
            return this.zzb;
        }

        /* access modifiers changed from: package-private */
        public final String zzb() {
            return this.zza;
        }
    }

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public final class zza {
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzar zzar) {
    }

    public static Builder newBuilder() {
        return new Builder((zzao) null);
    }

    public boolean getVrPurchaseFlow() {
        return this.zzh;
    }

    public final int zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final ArrayList zze() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzg);
        return arrayList;
    }

    public final List zzf() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzo() {
        return (!this.zzh && this.zzb == null && this.zzd == null && this.zze == 0 && !this.zza) ? false : true;
    }
}
