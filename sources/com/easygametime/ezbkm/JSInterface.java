package com.easygametime.ezbkm;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.easygametime.ezbkm.activity.GameShellActivity;
import org.json.JSONException;
import org.json.JSONObject;

public class JSInterface {
    private Context mContext;
    private WebView mWebView;

    @JavascriptInterface
    public void callJS(String str) {
    }

    @JavascriptInterface
    public void setGameState(String str) {
    }

    public JSInterface(WebView webView, Context context) {
        this.mWebView = webView;
        this.mContext = context;
    }

    @JavascriptInterface
    public String JSinvoke(String str) {
        try {
            String string = new JSONObject(str).getString(AppConstant.SDK_FUNC_TYPE);
            GameShellActivity gameShellActivity = (GameShellActivity) this.mContext;
            char c = 65535;
            switch (string.hashCode()) {
                case -1310478512:
                    if (string.equals(AppConstant.SDK_OPEN_FACEBOOK)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1263203643:
                    if (string.equals(AppConstant.SDK_OPEN_URL)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1097329270:
                    if (string.equals(AppConstant.SDK_LOGOUT)) {
                        c = 2;
                        break;
                    }
                    break;
                case -270512698:
                    if (string.equals(AppConstant.SDK_REPORT_EVENT)) {
                        c = 4;
                        break;
                    }
                    break;
                case 110760:
                    if (string.equals(AppConstant.SDK_PAY)) {
                        c = 0;
                        break;
                    }
                    break;
                case 103149417:
                    if (string.equals(AppConstant.SDK_LOGIN)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2115558064:
                    if (string.equals(AppConstant.SDK_ADD_PLAYER)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    gameShellActivity.pay(str);
                    return "msg from java";
                case 1:
                    gameShellActivity.login();
                    return "msg from java";
                case 2:
                    gameShellActivity.logout();
                    return "msg from java";
                case 3:
                    gameShellActivity.addPlayerInfo(str);
                    return "msg from java";
                case 4:
                    gameShellActivity.reportEvent(str);
                    return "msg from java";
                case 5:
                    gameShellActivity.openUrl(str);
                    return "msg from java";
                case 6:
                    gameShellActivity.openFacebook(str);
                    return "msg from java";
                default:
                    return "msg from java";
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return "msg from java";
        }
    }
}
