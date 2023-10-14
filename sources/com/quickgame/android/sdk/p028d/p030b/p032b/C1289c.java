package com.quickgame.android.sdk.p028d.p030b.p032b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p034e.C1346j;

/* renamed from: com.quickgame.android.sdk.d.b.b.c */
public class C1289c extends C1346j {

    /* renamed from: a */
    private WebView f977a;

    /* renamed from: b */
    private View f978b;

    /* renamed from: c */
    private ImageView f979c;

    /* renamed from: d */
    private boolean f980d = true;

    /* renamed from: b */
    public static C1289c m1418b() {
        Bundle bundle = new Bundle();
        C1289c cVar = new C1289c();
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: c */
    private void m1420c(View view) {
        WebView webView = (WebView) view.findViewById(C1124R.C1126id.hw_webview);
        this.f977a = webView;
        webView.setVisibility(0);
        WebSettings settings = this.f977a.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12496a(View view) {
        if (this.f980d) {
            m1420c(view);
        } else {
            m1419b(view);
        }
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo12496a(this.f978b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_share_gift, viewGroup, false);
        this.f978b = inflate;
        return inflate;
    }

    /* renamed from: b */
    private void m1419b(View view) {
        ImageView imageView = (ImageView) view.findViewById(C1124R.C1126id.hw_share_image);
        this.f979c = imageView;
        imageView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo12497a(String str) {
        if (this.f980d) {
            this.f977a.loadUrl(str);
        }
    }
}
