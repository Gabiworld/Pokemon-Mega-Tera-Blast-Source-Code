package com.quickgame.android.sdk.p034e;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.e.b */
public class C1296b extends C1346j {

    /* renamed from: h */
    public static String f992h = "1";

    /* renamed from: a */
    public TextView f993a;

    /* renamed from: b */
    private Button f994b;

    /* renamed from: c */
    private WebView f995c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f996d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f997e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f998f;

    /* renamed from: g */
    public Handler f999g = new C1297a(Looper.getMainLooper());

    /* renamed from: com.quickgame.android.sdk.e.b$a */
    class C1297a extends Handler {

        /* renamed from: com.quickgame.android.sdk.e.b$a$a */
        class C1298a implements Runnable {
            C1298a() {
            }

            public void run() {
                C1296b bVar = C1296b.this;
                bVar.mo12510a(bVar.f998f);
                Log.d("AnnouncementDetailed", "title===" + C1296b.this.f997e);
                C1296b bVar2 = C1296b.this;
                bVar2.f993a.setText(bVar2.f997e);
            }
        }

        C1297a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            try {
                Log.d("AnnouncementDetailed", "msg.obj.toString()===" + message.obj.toString());
                JSONObject jSONObject = new JSONObject(message.obj.toString());
                String unused = C1296b.this.f996d = jSONObject.getString("content");
                Log.d("AnnouncementDetailed", "content===" + C1296b.this.f996d);
                String unused2 = C1296b.this.f997e = jSONObject.getString("title");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C1296b.this.getActivity().runOnUiThread(new C1298a());
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.b$b */
    class C1299b extends WebViewClient {

        /* renamed from: com.quickgame.android.sdk.e.b$b$a */
        class C1300a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SslErrorHandler f1003a;

            C1300a(C1299b bVar, SslErrorHandler sslErrorHandler) {
                this.f1003a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f1003a.proceed();
            }
        }

        /* renamed from: com.quickgame.android.sdk.e.b$b$b */
        class C1301b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SslErrorHandler f1004a;

            C1301b(C1299b bVar, SslErrorHandler sslErrorHandler) {
                this.f1004a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f1004a.cancel();
            }
        }

        C1299b() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.d("AnnouncementDetailed", "onPageFinished");
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d("AnnouncementDetailed", "onPageStarted");
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Log.d("AnnouncementDetailed", "onReceivedSslError");
            AlertDialog.Builder builder = new AlertDialog.Builder(C1296b.this.getActivity());
            int primaryError = sslError.getPrimaryError();
            String str = (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? "SSL Certificate error." : "The certificate authority is not trusted." : "The certificate Hostname mismatch." : "The certificate has expired." : "The certificate is not yet valid.") + " Do you want to continue anyway?";
            builder.setTitle("SSL Certificate Error");
            builder.setMessage(str);
            builder.setPositiveButton("continue", new C1300a(this, sslErrorHandler));
            builder.setNegativeButton("cancel", new C1301b(this, sslErrorHandler));
            builder.create().show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d("AnnouncementDetailed", "shouldOverrideUrlLoading");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            C1296b.this.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.b$c */
    class C1302c implements View.OnClickListener {
        C1302c() {
        }

        public void onClick(View view) {
            Log.d("AnnouncementDetailed", "OK_detail onClick");
            C1296b.this.getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.b$d */
    class C1303d implements C1426b<JSONObject> {
        C1303d() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            String optString = jSONObject.optJSONObject("data").optString("agreement");
            Message message = new Message();
            message.what = 1;
            message.obj = optString;
            C1296b.this.f999g.handleMessage(message);
        }

        public void onFailed(C1427c cVar) {
            C1296b.this.getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("AnnouncementDetailed", "onCreateView");
        this.f998f = layoutInflater.inflate(C1124R.layout.hw_fragment_announce_detail, (ViewGroup) null);
        m1440b();
        return this.f998f;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: c */
    public static C1296b m1442c() {
        return new C1296b();
    }

    /* renamed from: b */
    private void m1440b() {
        HashMap hashMap = new HashMap();
        hashMap.put("agmId", f992h);
        C1428d.m1703a("/v1/user/getServerAgreement", (Map<String, Object>) hashMap, (C1426b<JSONObject>) new C1303d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12510a(View view) {
        Log.d("AnnouncementDetailed", "initView");
        this.f994b = (Button) view.findViewById(C1124R.C1126id.yes_detail);
        WebView webView = (WebView) view.findViewById(C1124R.C1126id.qg_service_detail_webview);
        this.f995c = webView;
        webView.setWebViewClient(new C1299b());
        this.f995c.getSettings().setJavaScriptEnabled(true);
        this.f995c.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f995c.getSettings().setAllowFileAccess(true);
        this.f995c.loadDataWithBaseURL("", this.f996d, "text/html", "utf-8", "");
        this.f993a = (TextView) view.findViewById(C1124R.C1126id.agreement_title);
        this.f994b.setOnClickListener(new C1302c());
    }
}
