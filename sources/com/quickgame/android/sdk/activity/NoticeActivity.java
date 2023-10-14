package com.quickgame.android.sdk.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.p039h.C1538f;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo13302d2 = {"Lcom/quickgame/android/sdk/activity/NoticeActivity;", "Lcom/quickgame/android/sdk/base/BaseActivity;", "()V", "TAG", "", "initSelectCondition", "", "linearLayout", "Landroid/widget/LinearLayout;", "i", "", "name", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setContent", "index", "setWebView", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
public final class NoticeActivity extends BaseActivity {

    /* renamed from: b */
    private HashMap f912b;

    /* renamed from: com.quickgame.android.sdk.activity.NoticeActivity$a */
    static final class C1257a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ NoticeActivity f913a;

        C1257a(NoticeActivity noticeActivity) {
            this.f913a = noticeActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                NoticeActivity noticeActivity = this.f913a;
                Intrinsics.checkNotNullExpressionValue(compoundButton, "buttonView");
                Object tag = compoundButton.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
                noticeActivity.m1265b(((Integer) tag).intValue());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.NoticeActivity$b */
    static final class C1258b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NoticeActivity f914a;

        C1258b(NoticeActivity noticeActivity) {
            this.f914a = noticeActivity;
        }

        public final void onClick(View view) {
            this.f914a.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m1265b(int i) {
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        if (i < l.mo12839c().size()) {
            C1538f l2 = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
            ((WebView) mo12248a(C1124R.C1126id.noticeWebview)).loadDataWithBaseURL("", l2.mo12839c().get(i).content, "text/html", "utf-8", (String) null);
        }
    }

    /* renamed from: r */
    private final void m1266r() {
        WebView webView = (WebView) mo12248a(C1124R.C1126id.noticeWebview);
        Intrinsics.checkNotNullExpressionValue(webView, "noticeWebview");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "noticeWebview.settings");
        settings.setCacheMode(2);
        WebView webView2 = (WebView) mo12248a(C1124R.C1126id.noticeWebview);
        Intrinsics.checkNotNullExpressionValue(webView2, "noticeWebview");
        WebSettings settings2 = webView2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "noticeWebview.settings");
        settings2.setJavaScriptEnabled(true);
    }

    /* renamed from: a */
    public View mo12248a(int i) {
        if (this.f912b == null) {
            this.f912b = new HashMap();
        }
        View view = (View) this.f912b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f912b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.qg_activity_notice);
        ((FrameLayout) mo12248a(C1124R.C1126id.flBlack)).setOnClickListener(new C1258b(this));
        m1266r();
        C1538f l = C1538f.m1861l();
        Intrinsics.checkNotNullExpressionValue(l, "SDKDataManager.getInstance()");
        int size = l.mo12839c().size();
        for (int i = 0; i < size; i++) {
            RadioGroup radioGroup = (RadioGroup) mo12248a(C1124R.C1126id.ll_type);
            Intrinsics.checkNotNullExpressionValue(radioGroup, "ll_type");
            C1538f l2 = C1538f.m1861l();
            Intrinsics.checkNotNullExpressionValue(l2, "SDKDataManager.getInstance()");
            String str = l2.mo12839c().get(i).title;
            Intrinsics.checkNotNullExpressionValue(str, "SDKDataManager.getInstance().notices[i].title");
            m1263a(radioGroup, i, str);
        }
        m1265b(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        ((WebView) mo12248a(C1124R.C1126id.noticeWebview)).loadDataWithBaseURL((String) null, "", "text/html", "utf-8", (String) null);
        ((WebView) mo12248a(C1124R.C1126id.noticeWebview)).clearHistory();
        ((WebView) mo12248a(C1124R.C1126id.noticeWebview)).destroy();
    }

    /* renamed from: a */
    private final void m1263a(LinearLayout linearLayout, int i, String str) {
        View inflate = View.inflate(this, C1124R.layout.qg_view_notice_title, (ViewGroup) null);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton = (RadioButton) inflate;
        if (i == 0) {
            radioButton.setChecked(true);
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        radioButton.setText(StringsKt.trim((CharSequence) str).toString());
        radioButton.setId(i);
        radioButton.setTag(Integer.valueOf(i));
        radioButton.setOnCheckedChangeListener(new C1257a(this));
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        linearLayout.addView(inflate, layoutParams);
    }
}
