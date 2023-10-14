package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.base.BaseActivity;

public class HWWebViewActivity extends BaseActivity {

    /* renamed from: b */
    private WebView f890b = null;

    /* renamed from: c */
    private TextView f891c;

    /* renamed from: com.quickgame.android.sdk.activity.HWWebViewActivity$a */
    class C1249a implements View.OnClickListener {
        C1249a() {
        }

        public void onClick(View view) {
            HWWebViewActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWWebViewActivity$b */
    class C1250b extends WebViewClient {
        C1250b() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http") || str.startsWith(TournamentShareDialogURIBuilder.scheme)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                HWWebViewActivity.this.startActivity(intent);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public static void m1221a(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, HWWebViewActivity.class);
        intent.putExtra("data", str2);
        intent.putExtra("title", str);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public static void m1222b(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, HWWebViewActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        activity.startActivity(intent);
    }

    /* renamed from: r */
    private void m1223r() {
        this.f890b = (WebView) findViewById(C1124R.C1126id.web_view);
        this.f891c = (TextView) findViewById(C1124R.C1126id.tv_title);
        findViewById(C1124R.C1126id.fl_back).setOnClickListener(new C1249a());
    }

    /* renamed from: s */
    private void m1224s() {
        WebSettings settings = this.f890b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(false);
        settings.setUseWideViewPort(false);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setBlockNetworkImage(false);
        settings.setUserAgentString(settings.getUserAgentString() + ",QuickGameAndroid");
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        this.f890b.setWebViewClient(new C1250b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_web);
        m1223r();
        m1224s();
        String stringExtra = getIntent().getStringExtra("url");
        String stringExtra2 = getIntent().getStringExtra("data");
        String stringExtra3 = getIntent().getStringExtra("title");
        if (!TextUtils.isEmpty(stringExtra3)) {
            this.f891c.setText(stringExtra3);
            this.f891c.setVisibility(0);
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            Log.d("QGHWWebViewActivity", "load url: " + stringExtra);
            this.f890b.loadUrl(stringExtra);
            return;
        }
        Log.d("QGHWWebViewActivity", "load data: " + stringExtra2);
        this.f890b.loadDataWithBaseURL("", stringExtra2, "text/html", "utf-8", "");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f890b.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f890b.goBack();
        return true;
    }
}
