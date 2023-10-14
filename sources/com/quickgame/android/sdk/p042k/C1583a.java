package com.quickgame.android.sdk.p042k;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.ApplovinAdapter;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookExtras;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.jirbo.adcolony.AdColonyAdapter;
import com.jirbo.adcolony.AdColonyBundleBuilder;
import com.quickgame.android.sdk.listener.RewardedAdLoadListener;
import com.quickgame.android.sdk.listener.RewardedAdShowListener;
import com.quickgame.android.sdk.p043l.C1601d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ0\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo13302d2 = {"Lcom/quickgame/android/sdk/thirdsdk/AdMobManager;", "", "()V", "TAG", "", "inited", "", "init", "", "context", "Landroid/content/Context;", "loadAdColonyRewardedAd", "adUnitId", "showPrePopupValue", "showPostPopupValue", "listener", "Lcom/quickgame/android/sdk/listener/RewardedAdLoadListener;", "loadApplovinRewardedAd", "muteAudio", "loadFBRewardedAd", "nativeBanner", "loadRewardedAd", "show", "activity", "Landroid/app/Activity;", "rewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "Lcom/quickgame/android/sdk/listener/RewardedAdShowListener;", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.k.a */
public final class C1583a {

    /* renamed from: a */
    public static final C1583a f1571a = new C1583a();

    /* renamed from: com.quickgame.android.sdk.k.a$a */
    static final class C1584a implements OnInitializationCompleteListener {

        /* renamed from: a */
        public static final C1584a f1572a = new C1584a();

        C1584a() {
        }

        public final void onInitializationComplete(InitializationStatus initializationStatus) {
            StringBuilder sb = new StringBuilder();
            sb.append(" init status ");
            Intrinsics.checkNotNullExpressionValue(initializationStatus, "it");
            sb.append(initializationStatus.getAdapterStatusMap().keySet());
            Log.d("QGAdMobManager", sb.toString());
            C1583a.m1988a(C1583a.f1571a, true);
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$b */
    public static final class C1585b extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RewardedAdLoadListener f1573a;

        C1585b(RewardedAdLoadListener rewardedAdLoadListener) {
            this.f1573a = rewardedAdLoadListener;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Log.d("QGAdMobManager", "Ad was loaded.");
            RewardedAdLoadListener rewardedAdLoadListener = this.f1573a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onSuccess(rewardedAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
            Log.d("QGAdMobManager", "onAdFailedToLoad " + loadAdError.getMessage());
            RewardedAdLoadListener rewardedAdLoadListener = this.f1573a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onFailed(loadAdError.getMessage());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$c */
    public static final class C1586c extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RewardedAdLoadListener f1574a;

        C1586c(RewardedAdLoadListener rewardedAdLoadListener) {
            this.f1574a = rewardedAdLoadListener;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Log.d("QGAdMobManager", "Ad was loaded.");
            RewardedAdLoadListener rewardedAdLoadListener = this.f1574a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onSuccess(rewardedAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
            Log.d("QGAdMobManager", "onAdFailedToLoad " + loadAdError.getMessage());
            RewardedAdLoadListener rewardedAdLoadListener = this.f1574a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onFailed(loadAdError.getMessage());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$d */
    public static final class C1587d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RewardedAdLoadListener f1575a;

        C1587d(RewardedAdLoadListener rewardedAdLoadListener) {
            this.f1575a = rewardedAdLoadListener;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Log.d("QGAdMobManager", "Ad was loaded.");
            RewardedAdLoadListener rewardedAdLoadListener = this.f1575a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onSuccess(rewardedAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
            Log.d("QGAdMobManager", "onAdFailedToLoad " + loadAdError.getMessage());
            RewardedAdLoadListener rewardedAdLoadListener = this.f1575a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onFailed(loadAdError.getMessage());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$e */
    public static final class C1588e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RewardedAdLoadListener f1576a;

        C1588e(RewardedAdLoadListener rewardedAdLoadListener) {
            this.f1576a = rewardedAdLoadListener;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Log.d("QGAdMobManager", "Ad was loaded.");
            RewardedAdLoadListener rewardedAdLoadListener = this.f1576a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onSuccess(rewardedAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
            Log.d("QGAdMobManager", "onAdFailedToLoad " + loadAdError.getMessage());
            RewardedAdLoadListener rewardedAdLoadListener = this.f1576a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onFailed(loadAdError.getMessage());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$f */
    public static final class C1589f extends FullScreenContentCallback {

        /* renamed from: a */
        final /* synthetic */ RewardedAdShowListener f1577a;

        C1589f(RewardedAdShowListener rewardedAdShowListener) {
            this.f1577a = rewardedAdShowListener;
        }

        public void onAdClicked() {
            C1583a.super.onAdClicked();
            Log.d("QGAdMobManager", "onAdClicked");
            RewardedAdShowListener rewardedAdShowListener = this.f1577a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onAdClicked();
            }
        }

        public void onAdDismissedFullScreenContent() {
            C1583a.super.onAdDismissedFullScreenContent();
            Log.d("QGAdMobManager", "onAdDismissedFullScreenContent");
            RewardedAdShowListener rewardedAdShowListener = this.f1577a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onAdDismissed();
            }
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "p0");
            C1583a.super.onAdFailedToShowFullScreenContent(adError);
            Log.d("QGAdMobManager", "onAdFailedToShowFullScreenContent " + adError.getMessage());
            RewardedAdShowListener rewardedAdShowListener = this.f1577a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onAdFailedToShow(adError.getMessage());
            }
        }

        public void onAdImpression() {
            C1583a.super.onAdImpression();
            Log.d("QGAdMobManager", "onAdImpression");
            RewardedAdShowListener rewardedAdShowListener = this.f1577a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onAdImpression();
            }
        }

        public void onAdShowedFullScreenContent() {
            C1583a.super.onAdShowedFullScreenContent();
            Log.d("QGAdMobManager", "onAdShowedFullScreenContent");
            RewardedAdShowListener rewardedAdShowListener = this.f1577a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onAdShowed();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.k.a$g */
    static final class C1590g implements OnUserEarnedRewardListener {

        /* renamed from: a */
        final /* synthetic */ RewardedAdShowListener f1578a;

        C1590g(RewardedAdShowListener rewardedAdShowListener) {
            this.f1578a = rewardedAdShowListener;
        }

        public final void onUserEarnedReward(RewardItem rewardItem) {
            Log.d("QGAdMobManager", "onUserEarnedReward");
            Intrinsics.checkNotNullExpressionValue(rewardItem, "it");
            rewardItem.getAmount();
            RewardedAdShowListener rewardedAdShowListener = this.f1578a;
            if (rewardedAdShowListener != null) {
                rewardedAdShowListener.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    private C1583a() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m1988a(C1583a aVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo12974a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!TextUtils.isEmpty(C1601d.m2069c(context, "com.google.android.gms.ads.APPLICATION_ID"))) {
            try {
                Class<?> cls = Class.forName("com.google.android.gms.ads.MobileAds");
                StringBuilder sb = new StringBuilder();
                sb.append("className ");
                Intrinsics.checkNotNullExpressionValue(cls, "reflectClass");
                sb.append(cls.getSimpleName());
                Log.d("QGAdMobManager", sb.toString());
                MobileAds.initialize(context, C1584a.f1572a);
            } catch (ClassNotFoundException unused) {
                Log.d("QGAdMobManager", "not found MobileAds class");
            }
        }
    }

    /* renamed from: b */
    public final void mo12978b(Context context, String str, boolean z, RewardedAdLoadListener rewardedAdLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        RewardedAd.load(context, str, new AdRequest.Builder().addNetworkExtrasBundle(FacebookAdapter.class, new FacebookExtras().setNativeBanner(z).build()).build(), new C1587d(rewardedAdLoadListener));
    }

    /* renamed from: a */
    public final void mo12975a(Context context, String str, RewardedAdLoadListener rewardedAdLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        RewardedAd.load(context, str, new AdRequest.Builder().build(), new C1588e(rewardedAdLoadListener));
    }

    /* renamed from: a */
    public final void mo12977a(Context context, String str, boolean z, boolean z2, RewardedAdLoadListener rewardedAdLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        AdColonyBundleBuilder.setShowPrePopup(z);
        AdColonyBundleBuilder.setShowPostPopup(z2);
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdColonyAdapter.class, AdColonyBundleBuilder.build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "AdRequest.Builder()\n    …\n                .build()");
        RewardedAd.load(context, str, build, new C1585b(rewardedAdLoadListener));
    }

    /* renamed from: a */
    public final void mo12976a(Context context, String str, boolean z, RewardedAdLoadListener rewardedAdLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(ApplovinAdapter.class, new AppLovinExtras.Builder().setMuteAudio(z).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "AdRequest.Builder()\n    …\n                .build()");
        RewardedAd.load(context, str, build, new C1586c(rewardedAdLoadListener));
    }

    /* renamed from: a */
    public final void mo12973a(Activity activity, RewardedAd rewardedAd, RewardedAdShowListener rewardedAdShowListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new C1589f(rewardedAdShowListener));
            rewardedAd.show(activity, new C1590g(rewardedAdShowListener));
        }
    }
}
