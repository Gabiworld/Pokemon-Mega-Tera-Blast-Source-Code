package com.easygametime.ezbkm.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.easygametime.ezbkm.AndroidBug5497Workaround;
import com.easygametime.ezbkm.ISDKlogic;
import com.easygametime.ezbkm.JSInterface;
import com.mithrilgame.terablast.ard.R;
import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.model.QGUserHolder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class GameShellActivity extends Activity implements ISDKlogic {
    private static final String TAG = "GameShellActivity";
    /* access modifiers changed from: private */
    public boolean isLogined = false;
    /* access modifiers changed from: private */
    public String loginOpenType;
    /* access modifiers changed from: private */
    public boolean mIsExit;
    /* access modifiers changed from: private */
    public ProgressBar mProgressBar;
    /* access modifiers changed from: private */
    public WebView mWebView;
    /* access modifiers changed from: private */

    /* renamed from: me */
    public GameShellActivity f32me;
    /* access modifiers changed from: private */
    public QuickGameManager sdkInstance;
    /* access modifiers changed from: private */
    public String thisUid;

    /* access modifiers changed from: private */
    public void log(String str) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_game_shell);
        AndroidBug5497Workaround.assistActivity(this);
        this.f32me = this;
        SampleSDKCallback sampleSDKCallback = new SampleSDKCallback();
        QuickGameManager instance = QuickGameManager.getInstance();
        this.sdkInstance = instance;
        instance.init(this, "78417979911761642797695394515972", sampleSDKCallback);
        this.sdkInstance.onCreate(this);
    }

    public void pay(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            SamplePaymentCallback samplePaymentCallback = new SamplePaymentCallback();
            QGOrderInfo qGOrderInfo = new QGOrderInfo();
            qGOrderInfo.setOrderSubject(jSONObject.getString("subject"));
            qGOrderInfo.setProductOrderId(jSONObject.getString("orderId"));
            qGOrderInfo.setAmount(jSONObject.getDouble("amount"));
            qGOrderInfo.setSuggestCurrency("USD");
            qGOrderInfo.setGoodsId(jSONObject.getString("goodsId"));
            qGOrderInfo.setExtrasParams(jSONObject.getString("extInfo"));
            log("pay orderInfo:" + qGOrderInfo.toString());
            QGRoleInfo qGRoleInfo = new QGRoleInfo();
            qGRoleInfo.setRoleId(jSONObject.getString("roleid"));
            qGRoleInfo.setRoleLevel(jSONObject.getString("roleLevel"));
            qGRoleInfo.setRoleName(jSONObject.getString("roleName"));
            qGRoleInfo.setServerName(jSONObject.getString("serverName"));
            qGRoleInfo.setVipLevel(jSONObject.getString("vipLevel"));
            log("pay roleInfo:" + qGRoleInfo.toString());
            this.sdkInstance.pay(this, qGOrderInfo, qGRoleInfo, samplePaymentCallback);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        this.sdkInstance.login(this);
        reportEvent("{\"eventName\": \"complete_sdkLoading\"}");
    }

    public void addPlayerInfo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            QGRoleInfo qGRoleInfo = new QGRoleInfo();
            qGRoleInfo.setRoleId(jSONObject.getString("roleId"));
            qGRoleInfo.setRoleLevel(jSONObject.getString("roleLevel"));
            qGRoleInfo.setRoleName(jSONObject.getString("roleName"));
            qGRoleInfo.setServerId(jSONObject.getString("serverId"));
            qGRoleInfo.setServerName(jSONObject.getString("serverName"));
            qGRoleInfo.setVipLevel(jSONObject.getString("vipLevel"));
            this.sdkInstance.submitRoleInfo(this.thisUid, qGRoleInfo);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.evaluateJavascript("javascript:setGameState(1)", new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    GameShellActivity gameShellActivity = GameShellActivity.this;
                    gameShellActivity.log("onResume onReceiveValue: " + str);
                }
            });
        }
        this.sdkInstance.onResume(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.evaluateJavascript("javascript:setGameState(0)", new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    GameShellActivity gameShellActivity = GameShellActivity.this;
                    gameShellActivity.log("onPause onReceiveValue: " + str);
                }
            });
        }
        this.sdkInstance.onPause(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.sdkInstance.onStop(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.sdkInstance.onStart(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.sdkInstance.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.sdkInstance.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.loadDataWithBaseURL((String) null, "", "text/html", "utf-8", (String) null);
            ((RelativeLayout) this.mWebView.getParent()).removeView(this.mWebView);
            this.mWebView.destroy();
            this.mWebView = null;
        }
        super.onDestroy();
        this.sdkInstance.onDestroy(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.mIsExit) {
            finish();
        } else {
            makeText("再按一次退出");
            this.mIsExit = true;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    boolean unused = GameShellActivity.this.mIsExit = false;
                }
            }, 2000);
        }
        return true;
    }

    private void makeText(String str) {
        if (str != null && !"".equals(str)) {
            Toast.makeText(this, str, 0).show();
        }
    }

    /* access modifiers changed from: private */
    public void loadWebViewUrl(String str) {
        this.mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        WebView webView = new WebView(getApplicationContext());
        this.mWebView = webView;
        webView.setLayoutParams(layoutParams);
        ((RelativeLayout) this.mProgressBar.getParent()).addView(this.mWebView, 1);
        WebSettings settings = this.mWebView.getSettings();
        settings.setSupportZoom(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setTextZoom(100);
        this.mWebView.setBackgroundColor(0);
        this.mWebView.loadUrl(str);
        this.mWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                GameShellActivity.this.mProgressBar.setVisibility(8);
            }

            public void onPageFinished(WebView webView, String str) {
                String cookie = CookieManager.getInstance().getCookie(str);
                if (cookie != null) {
                    GameShellActivity.this.log(cookie);
                }
            }
        });
        this.mWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i) {
                if (i == 100) {
                    GameShellActivity.this.mProgressBar.setVisibility(8);
                    return;
                }
                GameShellActivity.this.mProgressBar.setVisibility(0);
                GameShellActivity.this.mProgressBar.setProgress(i);
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        WebView webView2 = this.mWebView;
        webView2.addJavascriptInterface(new JSInterface(webView2, this), "JSInterface");
        delayHideSplash();
    }

    public void openUrl(String str) {
        try {
            String string = new JSONObject(str).getString("url");
            Log.e(TAG, "open url：" + string);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0078, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r1)));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openFacebook(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007d }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r6 = "url1"
            java.lang.String r6 = r1.getString(r6)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r2 = "url2"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r2 = "GameShellActivity"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x007d }
            r3.<init>()     // Catch:{ JSONException -> 0x007d }
            java.lang.String r4 = "open url1："
            r3.append(r4)     // Catch:{ JSONException -> 0x007d }
            r3.append(r6)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r4 = ",url2："
            r3.append(r4)     // Catch:{ JSONException -> 0x007d }
            r3.append(r1)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x007d }
            android.util.Log.e(r2, r3)     // Catch:{ JSONException -> 0x007d }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = "com.facebook.katana"
            r4 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ Exception -> 0x006b }
            boolean r2 = r2.enabled     // Catch:{ Exception -> 0x006b }
            if (r2 == 0) goto L_0x005e
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x006b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r3.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "fb://facewebmodal/f?href="
            r3.append(r4)     // Catch:{ Exception -> 0x006b }
            r3.append(r6)     // Catch:{ Exception -> 0x006b }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x006b }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x006b }
            r2.<init>(r0, r6)     // Catch:{ Exception -> 0x006b }
            r5.startActivity(r2)     // Catch:{ Exception -> 0x006b }
            goto L_0x0081
        L_0x005e:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x006b }
            android.net.Uri r2 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x006b }
            r6.<init>(r0, r2)     // Catch:{ Exception -> 0x006b }
            r5.startActivity(r6)     // Catch:{ Exception -> 0x006b }
            goto L_0x0081
        L_0x006b:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x0078 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0078 }
            r6.<init>(r0, r1)     // Catch:{ Exception -> 0x0078 }
            r5.startActivity(r6)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0081
        L_0x0078:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ JSONException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.easygametime.ezbkm.activity.GameShellActivity.openFacebook(java.lang.String):void");
    }

    private void delayHideSplash() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                GameShellActivity.this.f32me.hideSplash();
            }
        }, 1500);
    }

    /* access modifiers changed from: private */
    public void hideSplash() {
        ((ImageView) findViewById(R.id.imageView)).setVisibility(8);
    }

    public void logout() {
        this.sdkInstance.logout(this);
    }

    public void bindUser() {
        QuickGameManager.getInstance().setUserBindCallback(new QuickGameManager.QGUserBindCallback() {
            public void onBindInfoChanged(String str, boolean z, QGUserBindInfo qGUserBindInfo) {
                if (qGUserBindInfo.isBindFacebook()) {
                    GameShellActivity.this.log("绑定facebook");
                } else {
                    GameShellActivity.this.log("解绑facebook");
                }
            }

            public void onexitUserCenter() {
                GameShellActivity.this.log("退出用户中心");
            }
        });
        this.sdkInstance.bindUser(QGConstant.LOGIN_OPEN_TYPE_FACEBOOK);
    }

    public void reportEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("eventName");
            log("reportEvent eventName:" + string);
            HashMap hashMap = new HashMap();
            if (string == AFInAppEventType.LEVEL_ACHIEVED || string == "vip_level") {
                hashMap.put(AFInAppEventParameterName.LEVEL, Integer.valueOf(jSONObject.getInt("level")));
            }
            this.sdkInstance.appsFlyerEvent(string, hashMap);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private class SampleSDKCallback implements QuickGameManager.SDKCallback {
        private SampleSDKCallback() {
        }

        public void onLoginFinished(QGUserData qGUserData, QGUserHolder qGUserHolder) {
            if (qGUserHolder.getStateCode() == 1) {
                GameShellActivity.this.sdkInstance.showFloatView(GameShellActivity.this);
                String unused = GameShellActivity.this.loginOpenType = qGUserData.getOpenType();
                String uid = qGUserData.getUid();
                String unused2 = GameShellActivity.this.thisUid = uid;
                String token = qGUserData.getToken();
                if (GameShellActivity.this.isLogined) {
                    GameShellActivity.this.log("login again:" + qGUserData.toString() + "uid=" + qGUserData.getUid());
                    if (GameShellActivity.this.mWebView != null) {
                        String str = "{userId:\"" + uid + "\",token:\"" + token + "\"}";
                        GameShellActivity.this.mWebView.evaluateJavascript("javascript:callJS(" + "\"loginBack\"" + "," + str + ")", new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                GameShellActivity gameShellActivity = GameShellActivity.this;
                                gameShellActivity.log("callJS back: " + str);
                            }
                        });
                        return;
                    }
                    return;
                }
                GameShellActivity.this.log(qGUserData.toString() + ":sid=" + token + "uid=" + uid);
                GameShellActivity.this.loadWebViewUrl("https://gamesource-pokemon.terablast.com/pikachu/index.html?sdkType=miyin&channel=miyin&userId=" + uid + "&token=" + token + "&ext=" + uid + "&loginOpenType=" + GameShellActivity.this.loginOpenType + "&name=" + qGUserData.getUserName());
                boolean unused3 = GameShellActivity.this.isLogined = true;
                return;
            }
            GameShellActivity.this.login();
        }

        public void onInitFinished(boolean z) {
            if (z) {
                GameShellActivity.this.login();
            }
        }

        public void onLogout() {
            GameShellActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    if (GameShellActivity.this.mWebView != null) {
                        WebView access$1100 = GameShellActivity.this.mWebView;
                        access$1100.evaluateJavascript("javascript:callJS(" + "\"logoutBack\"" + ")", new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                GameShellActivity gameShellActivity = GameShellActivity.this;
                                gameShellActivity.log("callJS back: " + str);
                            }
                        });
                        GameShellActivity.this.log("onLogout ");
                        GameShellActivity.this.login();
                    }
                }
            });
        }

        public void onGooglePlaySub(String str, String str2, boolean z, boolean z2) {
            GameShellActivity gameShellActivity = GameShellActivity.this;
            gameShellActivity.log("goodsId=" + str + "&&sdkOrder=" + str2);
        }
    }

    private class SamplePaymentCallback implements QuickGameManager.QGPaymentCallback {
        private SamplePaymentCallback() {
        }

        public void onPaySuccess(String str, String str2, String str3, String str4) {
            if (GameShellActivity.this.mWebView != null) {
                WebView access$1100 = GameShellActivity.this.mWebView;
                access$1100.evaluateJavascript("javascript:callJS(" + "\"payBack\"" + "," + "{}" + ")", new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        GameShellActivity gameShellActivity = GameShellActivity.this;
                        gameShellActivity.log("callJS back: " + str);
                    }
                });
            }
        }

        public void onPayFailed(String str, String str2, String str3) {
            GameShellActivity gameShellActivity = GameShellActivity.this;
            gameShellActivity.log("pay fail:" + str3);
            GameShellActivity gameShellActivity2 = GameShellActivity.this;
            Toast.makeText(gameShellActivity2, "pay fail:" + str3, 1).show();
        }

        public void onPayCancel(String str, String str2, String str3) {
            GameShellActivity gameShellActivity = GameShellActivity.this;
            gameShellActivity.log("pay cancel:" + str3);
            Toast.makeText(GameShellActivity.this, "pay cancel", 1).show();
        }
    }
}
