package com.quickgame.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.share.Sharer;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.games.event.EventBuffer;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.firebase.HWFirebaseCallback;
import com.quickgame.android.sdk.firebase.HWFirebaseManager;
import com.quickgame.android.sdk.listener.CheckThirdLoginListener;
import com.quickgame.android.sdk.listener.FacebookFriendsListener;
import com.quickgame.android.sdk.listener.GooglePreRegisterListener;
import com.quickgame.android.sdk.listener.IAdjustListener;
import com.quickgame.android.sdk.listener.QueryGoogleSkuListener;
import com.quickgame.android.sdk.listener.RewardedAdLoadListener;
import com.quickgame.android.sdk.listener.RewardedAdShowListener;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p039h.C1508c;
import com.quickgame.android.sdk.p042k.C1583a;
import com.quickgame.android.sdk.p042k.C1591b;
import com.quickgame.android.sdk.p042k.C1593c;
import com.quickgame.android.sdk.p042k.C1596d;
import com.quickgame.android.sdk.p042k.C1597e;
import com.quickgame.android.sdk.p043l.C1600c;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1695g;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;
import java.util.List;
import java.util.Map;

public class QuickGameManager {
    private static final String TAG = "QGGameManager";
    private C1128a sdkInstance;

    public interface CustomerServiceCallback {
        void onCustomerServiceClicked();
    }

    public interface GooglePlayStatusListener {
        void result(boolean z);
    }

    public interface QGPaymentCallback {
        void onPayCancel(String str, String str2, String str3);

        void onPayFailed(String str, String str2, String str3);

        void onPaySuccess(String str, String str2, String str3, String str4);
    }

    public static class QGUserBindCallback {
        public void onBindInfoChanged(String str, boolean z, QGUserBindInfo qGUserBindInfo) {
        }

        public void onexitUserCenter() {
        }
    }

    public interface RegisterCallback {
        void succeed(String str, String str2);
    }

    public interface SDKCallback {
        void onGooglePlaySub(String str, String str2, boolean z, boolean z2);

        void onInitFinished(boolean z);

        void onLoginFinished(QGUserData qGUserData, QGUserHolder qGUserHolder);

        void onLogout();
    }

    /* renamed from: com.quickgame.android.sdk.QuickGameManager$a */
    private static class C1123a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static QuickGameManager f578a = new QuickGameManager();
    }

    public static QuickGameManager getInstance() {
        if (C1123a.f578a.sdkInstance == null) {
            C1123a.f578a.sdkInstance = C1128a.m798r();
        }
        return C1123a.f578a;
    }

    public void UserTrash(Activity activity, boolean z) {
        this.sdkInstance.mo11947a(activity, z);
    }

    public void appsFlyerEvent(String str, Map<String, Object> map) {
        C1593c.m2008a().mo13014a(str, map);
    }

    public void bindUser(String str) {
        this.sdkInstance.mo11958a(str);
    }

    public void callFacebookLike(Activity activity, String str, String str2) {
        this.sdkInstance.mo11946a(activity, str, str2);
    }

    public void callFacebookShare(Activity activity, String str, String str2) {
        this.sdkInstance.mo11971b(activity, str, str2);
    }

    public void callFacebookSharePost(Activity activity, String str, String str2) {
        this.sdkInstance.mo11976c(activity, str, str2);
    }

    public void cdkeyLogin(Activity activity) {
        this.sdkInstance.mo12002m(activity);
    }

    public void checkThirdLogin(String str, CheckThirdLoginListener checkThirdLoginListener) {
        this.sdkInstance.mo11961a(str, checkThirdLoginListener);
    }

    public void closeFloatView(Activity activity) {
        this.sdkInstance.f608b = false;
        C1508c.f1429g.mo12785a();
    }

    public void closeUserCenter() {
        this.sdkInstance.mo11936a();
    }

    public void completeTutorial(boolean z) {
        C1593c.m2008a().mo13015a(z);
    }

    public void enterUserCenter(Activity activity) {
        this.sdkInstance.mo12006o(activity);
    }

    public void facebookLogin(Activity activity) {
        this.sdkInstance.mo11970b(activity);
    }

    public void facebookShareBitmap(Activity activity, Bitmap bitmap, FacebookCallback<Sharer.Result> facebookCallback) {
        this.sdkInstance.mo11941a(activity, bitmap, facebookCallback);
    }

    public void facebookSharePost(Activity activity, String str, FacebookCallback<Sharer.Result> facebookCallback) {
        this.sdkInstance.mo11944a(activity, str, facebookCallback);
    }

    public void freeLogin(Activity activity) {
        this.sdkInstance.mo11975c(activity);
    }

    public String getChannelId() {
        return this.sdkInstance.mo11978d();
    }

    public String getCountryInfo() {
        return this.sdkInstance.mo11984f();
    }

    public String getDeviceId(Activity activity) {
        return C1600c.m2049a((Context) activity).mo13040b();
    }

    public void getFacebookFriendsList(FacebookFriendsListener facebookFriendsListener) {
        this.sdkInstance.mo11955a(facebookFriendsListener);
    }

    public String getFbUserGender() {
        return this.sdkInstance.mo11987g();
    }

    public String getFbUserName() {
        return this.sdkInstance.mo11990h();
    }

    public String getFbUserPic() {
        return this.sdkInstance.mo11993i();
    }

    public HWFirebaseManager getFirebaseManager(Context context) {
        return this.sdkInstance.mo11969b(context);
    }

    public void getFirebaseToken(Context context) {
        HWFirebaseManager.getInstance(context).getFirebaseToken();
    }

    public String getSdkVersion() {
        return "2.2.9";
    }

    public QGUserData getUser() {
        return this.sdkInstance.mo12005o();
    }

    public QGUserBindInfo getUserBindInfo() {
        return this.sdkInstance.mo12003n();
    }

    public void googleLogin(Activity activity) {
        this.sdkInstance.mo11979d(activity);
    }

    public void hideUserCenterUnbind() {
        this.sdkInstance.mo12007p();
    }

    public void init(Activity activity, String str, SDKCallback sDKCallback) {
        Log.d(TAG, "init sdk ver:2.2.9/22102409, os ver:" + Build.VERSION.SDK_INT);
        this.sdkInstance.mo11945a(activity, str, sDKCallback);
    }

    public void loadAdColonyRewardedAd(Activity activity, String str, boolean z, boolean z2, RewardedAdLoadListener rewardedAdLoadListener) {
        C1583a.f1571a.mo12977a(activity, str, z, z2, rewardedAdLoadListener);
    }

    public void loadAdMobRewardedAd(Activity activity, String str, RewardedAdLoadListener rewardedAdLoadListener) {
        C1583a.f1571a.mo12975a((Context) activity, str, rewardedAdLoadListener);
    }

    public void loadApplovinRewardedAd(Activity activity, String str, boolean z, RewardedAdLoadListener rewardedAdLoadListener) {
        C1583a.f1571a.mo12976a(activity, str, z, rewardedAdLoadListener);
    }

    public void loadFBRewardedAd(Activity activity, String str, boolean z, RewardedAdLoadListener rewardedAdLoadListener) {
        C1583a.f1571a.mo12978b(activity, str, z, rewardedAdLoadListener);
    }

    public void logAchieveLevelEvent(String str) {
        C1596d.m2019b().mo13020a(str);
    }

    public void logCompleteTutorialEvent(boolean z) {
        C1596d.m2019b().mo13028a(z);
    }

    public void logCreateRoleEvent(String str, String str2) {
        C1596d.m2019b().mo13024a(str, str2);
    }

    public void logEvent(String str) {
        C1596d.m2019b().mo13029b(str);
    }

    public void logFbPurchase(double d, String str, Bundle bundle) {
        C1596d.m2019b().mo13018a(d, str, bundle);
    }

    public void logInitiateCheckoutEvent(String str, String str2, String str3, int i, boolean z, String str4, double d) {
        C1596d.m2019b().mo13027a(str, str2, str3, i, z, str4, d);
    }

    public void logPurchaseEvent(String str, String str2, double d) {
        C1596d.m2019b().mo13025a(str, str2, d);
    }

    public void logUnlockedAchievementEvent(String str, String str2) {
        C1596d.m2019b().mo13030b(str, str2);
    }

    public void login(Activity activity) {
        C1271b.m1349v();
        this.sdkInstance.mo12004n(activity);
    }

    public void logout(Activity activity) {
        this.sdkInstance.mo11982e(activity);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.sdkInstance.mo11938a(i, i2, intent);
    }

    public void onCreate(Activity activity) {
        this.sdkInstance.mo11985f(activity);
        C1591b.m1999c().mo12999a(activity);
    }

    public void onDestroy(Activity activity) {
        this.sdkInstance.mo11988g(activity);
    }

    public void onPause(Activity activity) {
        this.sdkInstance.mo11991h(activity);
        C1591b.m1999c().mo12998a();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.sdkInstance.mo11939a(i, strArr, iArr);
    }

    public void onResume(Activity activity) {
        this.sdkInstance.mo11994i(activity);
        C1591b.m1999c().mo13003b();
        C1597e.m2035a().mo13032a(activity);
    }

    public void onStart(Activity activity) {
        this.sdkInstance.mo11996j(activity);
    }

    public void onStop(Activity activity) {
        this.sdkInstance.mo11998k(activity);
    }

    public void openFacebookPage(Activity activity, String str) {
        this.sdkInstance.mo11943a(activity, str);
    }

    public void pay(Activity activity, QGOrderInfo qGOrderInfo, QGRoleInfo qGRoleInfo, QGPaymentCallback qGPaymentCallback) {
        if (C1128a.f605p) {
            this.sdkInstance.mo11942a(activity, qGOrderInfo, qGRoleInfo, qGPaymentCallback);
        }
    }

    public void queryGoogleSku(List<String> list, QueryGoogleSkuListener queryGoogleSkuListener) {
        this.sdkInstance.mo11966a(list, queryGoogleSkuListener);
    }

    public void removeUserCenterIcon() {
    }

    public EventBuffer retrievingEvents(Activity activity, String str) {
        return C1695g.m2347b(activity).mo13221a(str);
    }

    public void setAppsFlyerDevKey(String str) {
        C1593c.m2008a().mo13009a(str);
    }

    public void setCustomLink(String str) {
        this.sdkInstance.mo11973b(str);
    }

    public void setCustomerServiceCallback(CustomerServiceCallback customerServiceCallback) {
        this.sdkInstance.mo11948a(customerServiceCallback);
    }

    public void setFacebookCommunityLink(String str) {
        this.sdkInstance.mo11977c(str);
    }

    public void setFirbMsgCallback(Context context, HWFirebaseCallback hWFirebaseCallback) {
        HWFirebaseManager.getInstance(context).setCallback(hWFirebaseCallback);
    }

    public void setGooglePlayStatusListener(Activity activity, GooglePlayStatusListener googlePlayStatusListener) {
        C1695g.m2347b(activity).mo13226a(googlePlayStatusListener);
    }

    public void setGooglePreRegisterListener(GooglePreRegisterListener googlePreRegisterListener) {
        this.sdkInstance.mo11956a(googlePreRegisterListener);
    }

    public void setPaymentCallback(QGPaymentCallback qGPaymentCallback) {
        this.sdkInstance.mo11949a(qGPaymentCallback);
    }

    public void setRegisterCallback(RegisterCallback registerCallback) {
        C1128a.m798r().mo11951a(registerCallback);
    }

    public void setSdkConfig(SDKConfig sDKConfig) {
        this.sdkInstance.mo11952a(sDKConfig);
    }

    public void setTomatoBaseUrl(String str) {
        this.sdkInstance.mo11980d(str);
    }

    public void setTomatoClientId(String str) {
        this.sdkInstance.mo11983e(str);
    }

    public void setUseDataDeliver(boolean z) {
        C1128a.m790a(z);
    }

    public void setUserBindCallback(QGUserBindCallback qGUserBindCallback) {
        this.sdkInstance.mo11950a(qGUserBindCallback);
    }

    public void setUserCenterRoleInfo(String str) {
        this.sdkInstance.mo11986f(str);
    }

    public void shareToLine(Activity activity, String str, String str2, String str3) {
        C1691e.m2330b().mo13211a(activity, str, str2, str3);
    }

    public void shareToTwitter(Activity activity, String str, String str2, String str3) {
        TwitterManager.m2281c().mo13179a(activity, str, str2, str3);
    }

    public void showAchievements(Activity activity) {
        C1695g.m2347b(activity).mo13224a(activity);
    }

    public void showFloatView(Activity activity) {
        C1128a aVar = this.sdkInstance;
        aVar.f608b = true;
        aVar.mo11940a(activity);
    }

    public void showLeaderBoards(Activity activity, String str) {
        C1695g.m2347b(activity).mo13225a(activity, str);
    }

    public void showRewardAd(Activity activity, RewardedAd rewardedAd, RewardedAdShowListener rewardedAdShowListener) {
        C1583a.f1571a.mo12973a(activity, rewardedAd, rewardedAdShowListener);
    }

    public void submitEvent(Activity activity, String str, int i) {
        C1695g.m2347b(activity).mo13228a(str, i);
    }

    public void submitRoleInfo(QGRoleInfo qGRoleInfo) {
        this.sdkInstance.mo11953a(qGRoleInfo);
    }

    public void tapDBPaySuccess(String str, String str2, long j, String str3, String str4) {
        C1597e.m2035a().mo13035a(str, str2, j, str3, str4);
    }

    public void tdTrackBasicInfo(QGRoleInfo qGRoleInfo, String str, String str2, String str3) {
        this.sdkInstance.mo11954a(qGRoleInfo, str, str2, str3);
    }

    public void tdTrackCustomEvent(String str, Map<String, Object> map) {
        this.sdkInstance.mo11964a(str, map);
    }

    public void tdTrackItemOnUse(String str, int i) {
        this.sdkInstance.mo11959a(str, i);
    }

    public void tdTrackMission(String str, boolean z, boolean z2, boolean z3, String str2) {
        this.sdkInstance.mo11965a(str, z, z2, z3, str2);
    }

    public void tdTrackPayRequest(String str, String str2, double d, String str3, double d2, String str4) {
        this.sdkInstance.mo11963a(str, str2, d, str3, d2, str4);
    }

    public void tdTrackPaySuccess(String str) {
        this.sdkInstance.mo11989g(str);
    }

    public void tdTrackReward(double d, String str) {
        this.sdkInstance.mo11937a(d, str);
    }

    public void tdTrackVirtualPurchase(String str, int i, double d) {
        this.sdkInstance.mo11960a(str, i, d);
    }

    public void thirdLogin(String str) {
        this.sdkInstance.mo11992h(str);
    }

    public void trackAdjustEvent(String str, double d, String str2) {
        this.sdkInstance.mo11962a(str, "", d, str2);
    }

    public void unLockAchievements(Activity activity, boolean z, String str, int i) {
        C1695g.m2347b(activity).mo13229a(z, str, i);
    }

    public void updateRoleInfo(Boolean bool, QGRoleInfo qGRoleInfo) {
    }

    public void updateScore(Activity activity, String str, int i) {
        C1695g.m2347b(activity).mo13232b(str, i);
    }

    public void UserTrash(Activity activity) {
        UserTrash(activity, false);
    }

    public void freeLogin(Activity activity, boolean z) {
        this.sdkInstance.mo11972b(activity, z);
    }

    public void logEvent(String str, Bundle bundle) {
        C1596d.m2019b().mo13023a(str, bundle);
    }

    public void shareToTwitter(Activity activity, String str, String str2) {
        TwitterManager.m2281c().mo13178a(activity, str, str2);
    }

    public void submitRoleInfo(String str, QGRoleInfo qGRoleInfo) {
        this.sdkInstance.mo11953a(qGRoleInfo);
    }

    public void trackAdjustEvent(String str) {
        this.sdkInstance.mo11962a(str, "", 0.0d, "");
    }

    public void init(Activity activity, String str, String str2, SDKCallback sDKCallback) {
        Log.d(TAG, "init sdk ver:2.2.9/22102409, os ver:" + Build.VERSION.SDK_INT);
        C1128a aVar = this.sdkInstance;
        aVar.f615i = str2;
        aVar.mo11945a(activity, str, sDKCallback);
    }

    public void logEvent(String str, double d) {
        C1596d.m2019b().mo13021a(str, d);
    }

    public void onCreate(Activity activity, IAdjustListener iAdjustListener) {
        this.sdkInstance.mo11985f(activity);
        C1591b.m1999c().mo13000a(activity, iAdjustListener);
    }

    public void trackAdjustEvent(String str, String str2, double d, String str3) {
        this.sdkInstance.mo11962a(str, str2, d, str3);
    }

    public void logEvent(String str, double d, Bundle bundle) {
        C1596d.m2019b().mo13022a(str, d, bundle);
    }
}
