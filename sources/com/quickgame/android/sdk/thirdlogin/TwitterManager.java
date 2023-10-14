package com.quickgame.android.sdk.thirdlogin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.easygametime.ezbkm.AppConstant;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.p043l.C1601d;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.twitter.sdk.android.tweetcomposer.TweetComposer;
import java.net.URL;

public class TwitterManager {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f1688c = "QGTwitterManager";

    /* renamed from: d */
    private static TwitterManager f1689d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1690d f1690a;

    /* renamed from: b */
    private TwitterAuthClient f1691b = null;

    /* renamed from: com.quickgame.android.sdk.thirdlogin.TwitterManager$a */
    class C1677a extends Callback<TwitterSession> {
        C1677a() {
        }

        public void failure(TwitterException twitterException) {
            String b = TwitterManager.f1688c;
            Log.e(b, "login failure:" + twitterException.getMessage());
            TwitterManager.this.f1690a.mo12043b(twitterException.getMessage());
        }

        public void success(Result<TwitterSession> result) {
            Log.d(TwitterManager.f1688c, "login success");
            String str = ((TwitterSession) result.data).getUserId() + "";
            String userName = ((TwitterSession) result.data).getUserName();
            TwitterAuthToken authToken = ((TwitterSession) result.data).getAuthToken();
            String str2 = authToken.token;
            String str3 = authToken.secret;
            Log.d(TwitterManager.f1688c, "user_id=" + str);
            Log.d(TwitterManager.f1688c, "user_name=" + userName);
            Log.d(TwitterManager.f1688c, "access_token=" + str2);
            Log.d(TwitterManager.f1688c, "tokenSecret=" + str3);
            TwitterManager.this.f1690a.mo12042a(str, userName, str2, str3, QGConstant.LOGIN_OPEN_TYPE_TWITTER);
        }
    }

    public static class twitterShareReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if ("com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS".equals(intent.getAction())) {
                Log.d(TwitterManager.f1688c, "share success");
            } else if ("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL".equals(intent.getAction())) {
                Log.d(TwitterManager.f1688c, "share canceled");
            } else {
                Log.d(TwitterManager.f1688c, "share failed");
            }
        }
    }

    /* renamed from: c */
    public static TwitterManager m2281c() {
        if (f1689d == null) {
            f1689d = new TwitterManager();
        }
        return f1689d;
    }

    /* renamed from: a */
    public void mo13176a(Activity activity) {
        Log.d(f1688c, "init");
        try {
            String c = C1601d.m2069c(activity, "TWITTER_KEY");
            String c2 = C1601d.m2069c(activity, "TWITTER_SECRET");
            String str = f1688c;
            Log.d(str, "TWITTER_KEY=" + c);
            String str2 = f1688c;
            Log.d(str2, "TWITTER_SECRET=" + c2);
            Twitter.initialize(new TwitterConfig.Builder(activity).twitterAuthConfig(new TwitterAuthConfig(c, c2)).build());
            Log.d(f1688c, "init successful");
            this.f1690a.mo13206b();
        } catch (Exception e) {
            String str3 = f1688c;
            Log.d(str3, "init failed:" + e.getMessage());
            this.f1690a.mo13205a(e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo13181b(Activity activity) {
        Log.d(f1688c, AppConstant.SDK_LOGIN);
        try {
            this.f1691b = new TwitterAuthClient();
            Log.d(f1688c, "mTwitterAuthClient");
            this.f1691b.authorize(activity, new C1677a());
        } catch (Exception e) {
            String str = f1688c;
            Log.e(str, "login error:" + e.getMessage());
            this.f1690a.mo12043b(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo13179a(Activity activity, String str, String str2, String str3) {
        Log.d(f1688c, "share to twitter");
        try {
            new TweetComposer.Builder(activity).text(str).url(new URL(str2)).image(Uri.parse("android.resource://" + activity.getPackageName() + str3)).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13178a(Activity activity, String str, String str2) {
        Log.d(f1688c, "share to twitter");
        try {
            new TweetComposer.Builder(activity).text(str).url(new URL(str2)).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13174a() {
        TwitterAuthClient twitterAuthClient = this.f1691b;
        if (twitterAuthClient != null) {
            twitterAuthClient.cancelAuthorize();
        }
        this.f1690a.mo12021a();
        Log.d(f1688c, AppConstant.SDK_LOGOUT);
    }

    /* renamed from: a */
    public void mo13180a(C1690d dVar) {
        this.f1690a = dVar;
    }

    /* renamed from: a */
    public void mo13177a(Activity activity, C1690d dVar) {
        mo13180a(dVar);
        mo13176a(activity);
    }

    /* renamed from: a */
    public void mo13175a(int i, int i2, Intent intent) {
        Log.d(f1688c, "onActivityResult");
        TwitterAuthClient twitterAuthClient = this.f1691b;
        if (twitterAuthClient != null && twitterAuthClient.getRequestCode() == i) {
            this.f1691b.onActivityResult(i, i2, intent);
        }
    }
}
