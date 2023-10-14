package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.facebook.GraphResponse;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.p036f.C1423a;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p040i.C1576c;
import com.quickgame.android.sdk.p042k.C1593c;
import com.quickgame.android.sdk.p043l.C1600c;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

public class HWPayActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f868a = null;

    /* renamed from: b */
    private FrameLayout f869b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public QGOrderInfo f870c;

    /* renamed from: d */
    private QGRoleInfo f871d;

    /* renamed from: com.quickgame.android.sdk.activity.HWPayActivity$a */
    class C1240a implements View.OnClickListener {
        C1240a() {
        }

        public void onClick(View view) {
            HWPayActivity.this.finish();
        }
    }

    public void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_payment);
        m1211a();
        this.f870c = (QGOrderInfo) getIntent().getParcelableExtra("orderInfo");
        this.f871d = (QGRoleInfo) getIntent().getParcelableExtra("roleInfo");
        String stringExtra = getIntent().getStringExtra("payType");
        QGLog.m2386d("QGPayActivity", "payTpye = " + stringExtra);
        if (TextUtils.isEmpty(stringExtra) || !stringExtra.contains("=")) {
            str = "";
        } else {
            str = stringExtra.split("=")[1];
            QGLog.m2386d("QGPayActivity", "payTypeNum =" + str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("goodsName", this.f870c.getOrderSubject());
        hashMap.put("goodsId", this.f870c.getGoodsId());
        hashMap.put("productCode", C1538f.m1861l().mo12841d());
        if (C1538f.m1861l().mo12837b().equals("default")) {
            hashMap.put("channelCode", C1601d.m2070d(this));
        } else {
            hashMap.put("channelCode", C1538f.m1861l().mo12837b());
        }
        hashMap.put("uid", C1538f.m1861l().mo12847i().getUid());
        hashMap.put("cpOrderNo", this.f870c.getProductOrderId());
        hashMap.put("orderSubject", this.f870c.getOrderSubject());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("payType", str);
        }
        hashMap.put("roleName", this.f871d.getRoleName());
        hashMap.put("roleLevel", this.f871d.getRoleLevel());
        hashMap.put("serverName", this.f871d.getServerName());
        hashMap.put("extrasParams", this.f870c.getExtrasParams());
        hashMap.put("callbackUrl", this.f870c.getCallbackURL());
        hashMap.put("suggestCurrency", this.f870c.getSuggestCurrency());
        hashMap.put("deviceId", C1600c.m2049a((Context) this).mo13040b());
        if (C1541g.m1887a().f1484g) {
            hashMap.put("amount", this.f870c.getAmount() + "");
            hashMap.put("currency", this.f870c.getSuggestCurrency());
        }
        if (C1128a.m798r().mo11999l().serverToAppsFlyer()) {
            hashMap.put("gaid", C1600c.m2049a((Context) this).mo13041c());
            hashMap.put("imei", "");
            hashMap.put("afid", C1593c.m2008a().mo13007a((Context) this));
            hashMap.put("packname", getPackageName());
            hashMap.put("osVersion", C1600c.m2049a((Context) this).mo13043e());
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        String a = m1210a(hashMap, "8e45320d7dfb2a11");
        QGLog.m2386d("QGPayActivity", "obj:" + jSONObject.toString());
        QGLog.m2386d("QGPayActivity", "params:" + a);
        String a2 = C1601d.m2061a(a);
        String str4 = new String(Base64.encode(jSONObject.toString().getBytes(), 2));
        if (C1576c.m1961b().f1556b.contains("http")) {
            str2 = C1576c.m1961b().f1556b;
        } else {
            str2 = C1423a.f1253a;
        }
        if (C1541g.m1887a().f1484g) {
            str3 = str2 + "/secent/pyv2";
        } else {
            str3 = str2 + "/payH5/payCenter";
        }
        String str5 = str3 + "?clientLang=" + Locale.getDefault().getLanguage() + "&data=" + str4 + "&sign=" + a2;
        QGLog.m2386d("QGPayActivity", "sign=" + a2);
        QGLog.m2386d("QGPayActivity", "data=" + str4);
        QGLog.m2386d("QGPayActivity", "url=" + str5);
        this.f868a.clearCache(true);
        if (Build.VERSION.SDK_INT >= 22) {
            CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(this);
            createInstance.startSync();
            CookieManager instance = CookieManager.getInstance();
            instance.removeAllCookie();
            instance.removeSessionCookie();
            createInstance.stopSync();
            createInstance.sync();
        }
        CookieManager.getInstance().setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f868a, true);
        }
        WebSettings settings = this.f868a.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(2);
        settings.setUserAgentString(settings.getUserAgentString() + "QuickGameAndroid");
        this.f868a.setWebViewClient(new C1241b());
        this.f868a.loadUrl(str5);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1128a.f605p = true;
        WebView webView = this.f868a;
        if (webView != null) {
            webView.removeAllViews();
            this.f868a.destroy();
        }
        Log.d("QGPayActivity", "onDestroy");
        if (C1576c.m1961b().f1560f != null) {
            C1576c.m1961b().f1560f.onPayClose();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f868a.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f868a.goBack();
        return true;
    }

    /* renamed from: a */
    private void m1211a() {
        this.f869b = (FrameLayout) findViewById(C1124R.C1126id.fl_back);
        this.f868a = (WebView) findViewById(C1124R.C1126id.wv_pay);
        this.f869b.setOnClickListener(new C1240a());
    }

    /* renamed from: a */
    private static String m1210a(HashMap<String, String> hashMap, String str) {
        TreeMap treeMap = new TreeMap(hashMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWPayActivity$b */
    class C1241b extends WebViewClient {

        /* renamed from: a */
        String f873a;

        /* renamed from: com.quickgame.android.sdk.activity.HWPayActivity$b$a */
        class C1242a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SslErrorHandler f875a;

            C1242a(C1241b bVar, SslErrorHandler sslErrorHandler) {
                this.f875a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f875a.proceed();
            }
        }

        /* renamed from: com.quickgame.android.sdk.activity.HWPayActivity$b$b */
        class C1243b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SslErrorHandler f876a;

            C1243b(C1241b bVar, SslErrorHandler sslErrorHandler) {
                this.f876a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f876a.cancel();
            }
        }

        C1241b() {
        }

        /* renamed from: a */
        private void m1214a(String str) {
            Intent intent;
            try {
                if (str.startsWith("intent://")) {
                    intent = Intent.parseUri(str, 1);
                    this.f873a = intent.getPackage();
                } else {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                }
                HWPayActivity.this.startActivity(intent);
            } catch (Exception e) {
                m1213a(e);
            }
        }

        /* renamed from: b */
        private void m1215b(String str) {
            try {
                HWPayActivity hWPayActivity = HWPayActivity.this;
                hWPayActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } catch (ActivityNotFoundException unused) {
                HWPayActivity hWPayActivity2 = HWPayActivity.this;
                hWPayActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (str.startsWith("sms:") && HWPayActivity.this.f868a.canGoBack()) {
                HWPayActivity.this.f868a.goBack();
            }
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            AlertDialog.Builder builder = new AlertDialog.Builder(HWPayActivity.this);
            int primaryError = sslError.getPrimaryError();
            String str = (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? "SSL Certificate error." : "The certificate authority is not trusted." : "The certificate Hostname mismatch." : "The certificate has expired." : "The certificate is not yet valid.") + " Do you want to continue anyway?";
            builder.setTitle("SSL Certificate Error");
            builder.setMessage(str);
            builder.setPositiveButton("continue", new C1242a(this, sslErrorHandler));
            builder.setNegativeButton("cancel", new C1243b(this, sslErrorHandler));
            builder.create().show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d("QGPayActivity", "shouldOverrideUrlLoading::::" + str);
            if (str.startsWith("sms:")) {
                HWPayActivity.this.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            }
            if (str.contains("https://web-pay.line.me")) {
                HWPayActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.contains(GraphResponse.SUCCESS_KEY)) {
                    C1128a.m798r().mo11995j().onPaySuccess(HWPayActivity.this.f870c.getProductOrderId(), HWPayActivity.this.f870c.getQkOrderNo(), HWPayActivity.this.f870c.getGoodsId(), "");
                    HWPayActivity.this.finish();
                }
                if (str.contains("stop")) {
                    C1128a.m798r().mo11995j().onPayCancel(HWPayActivity.this.f870c.getOrderSubject(), HWPayActivity.this.f870c.getQkOrderNo(), "4");
                    HWPayActivity.this.finish();
                }
            }
            if (str.startsWith("http:") || str.startsWith("https:")) {
                return false;
            }
            m1214a(str);
            return true;
        }

        /* renamed from: a */
        private void m1213a(Exception exc) {
            String str = this.f873a;
            if (str != null) {
                m1215b(str);
            } else {
                Toast.makeText(HWPayActivity.this, exc.getMessage(), 1).show();
            }
        }
    }
}
