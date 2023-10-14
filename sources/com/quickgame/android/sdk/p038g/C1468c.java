package com.quickgame.android.sdk.p038g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;

/* renamed from: com.quickgame.android.sdk.g.c */
public class C1468c extends C1444a {

    /* renamed from: b */
    private View f1353b = null;

    /* renamed from: c */
    private FrameLayout f1354c = null;

    /* renamed from: d */
    private LinearLayout f1355d = null;

    /* renamed from: e */
    private LinearLayout f1356e = null;

    /* renamed from: f */
    private LinearLayout f1357f = null;

    /* renamed from: g */
    private LinearLayout f1358g = null;

    /* renamed from: h */
    private LinearLayout f1359h = null;

    /* renamed from: i */
    private TextView f1360i = null;

    /* renamed from: j */
    private ImageView f1361j = null;

    /* renamed from: k */
    private TextView f1362k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1684b f1363l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1687c f1364m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1691e f1365n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public TwitterManager f1366o = null;

    /* renamed from: com.quickgame.android.sdk.g.c$a */
    class C1469a implements View.OnClickListener {
        C1469a() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "email");
            C1468c.this.f1283a.mo12181b();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$b */
    class C1470b implements View.OnClickListener {
        C1470b() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "twitter");
            C1468c.this.f1366o.mo13181b(C1468c.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$c */
    class C1471c implements View.OnClickListener {
        C1471c() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "guest");
            C1468c.this.f1283a.mo12186f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$d */
    class C1472d extends C1710i {
        C1472d() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1468c.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1468c.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1468c.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$e */
    class C1473e extends C1710i {
        C1473e() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1468c.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1468c.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1468c.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$f */
    class C1474f extends C1710i {
        C1474f() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1468c.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1468c.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1468c.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$g */
    class C1475g extends C1710i {
        C1475g() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1468c.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1468c.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1468c.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$h */
    class C1476h implements View.OnKeyListener {
        C1476h() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1468c.this.mo12494a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$i */
    class C1477i implements View.OnClickListener {
        C1477i() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "lineTV");
            C1468c.this.f1365n.mo13214b(C1468c.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$j */
    class C1478j implements View.OnClickListener {
        C1478j() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "closeFL onclick");
            C1468c.this.mo12494a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$k */
    class C1479k implements View.OnClickListener {
        C1479k() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "googleTV");
            C1468c.this.f1364m.mo13202b((Activity) C1468c.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.c$l */
    class C1480l implements View.OnClickListener {
        C1480l() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentJapan", "facebookTV");
            C1468c.this.f1363l.mo13195a((Activity) C1468c.this.getActivity());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.d("LoginFragmentJapan", "onActivityCreated");
        super.onActivityCreated(bundle);
        m1757b();
        m1761d();
        if (C1613e.f1631n) {
            C1684b bVar = new C1684b();
            this.f1363l = bVar;
            bVar.mo13196a((C1690d) new C1472d());
        }
        if (C1613e.f1633p) {
            C1687c cVar = new C1687c();
            this.f1364m = cVar;
            cVar.mo13201a(getActivity(), new C1473e());
        }
        if (C1613e.f1637t) {
            C1691e eVar = new C1691e();
            this.f1365n = eVar;
            eVar.mo13210a((Activity) getActivity(), (C1690d) new C1474f());
        }
        if (C1613e.f1636s) {
            TwitterManager twitterManager = new TwitterManager();
            this.f1366o = twitterManager;
            twitterManager.mo13177a(getActivity(), new C1475g());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        TwitterManager twitterManager;
        C1691e eVar;
        C1684b bVar;
        C1687c cVar;
        super.onActivityResult(i, i2, intent);
        if (C1613e.f1633p && (cVar = this.f1364m) != null) {
            cVar.mo13199a(i, i2, intent);
        }
        if (C1613e.f1631n && (bVar = this.f1363l) != null) {
            bVar.mo13194a(i, i2, intent);
        }
        if (C1613e.f1637t && (eVar = this.f1365n) != null) {
            eVar.mo13208a(i, i2, intent);
        }
        if (C1613e.f1636s && (twitterManager = this.f1366o) != null) {
            twitterManager.mo13175a(i, i2, intent);
        }
    }

    public void onAttach(Context context) {
        Log.d("LoginFragmentJapan", "onAttach");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        Log.d("LoginFragmentJapan", "onCreate");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("LoginFragmentJapan", "onCreateView");
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_login_janpan, viewGroup, false);
        this.f1353b = inflate;
        return inflate;
    }

    public void onDestroy() {
        Log.d("LoginFragmentJapan", "onDestroy");
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        Log.d("LoginFragmentJapan", "onStart");
        super.onStart();
    }

    public void onStop() {
        Log.d("LoginFragmentJapan", "onStop");
        super.onStop();
    }

    /* renamed from: b */
    private void m1757b() {
        this.f1355d = (LinearLayout) this.f1353b.findViewById(C1124R.C1126id.ll_line);
        this.f1356e = (LinearLayout) this.f1353b.findViewById(C1124R.C1126id.ll_facebook);
        this.f1357f = (LinearLayout) this.f1353b.findViewById(C1124R.C1126id.ll_google);
        this.f1358g = (LinearLayout) this.f1353b.findViewById(C1124R.C1126id.ll_email);
        this.f1359h = (LinearLayout) this.f1353b.findViewById(C1124R.C1126id.ll_twitter);
        this.f1354c = (FrameLayout) this.f1353b.findViewById(C1124R.C1126id.fl_exit);
        this.f1361j = (ImageView) this.f1353b.findViewById(C1124R.C1126id.iv_login_logo);
        this.f1360i = (TextView) this.f1353b.findViewById(C1124R.C1126id.tv_title);
        this.f1362k = (TextView) this.f1353b.findViewById(C1124R.C1126id.tv_guest_text);
        if (!C1613e.f1631n) {
            Log.d("LoginFragmentJapan", "hide fb login");
            this.f1356e.setVisibility(8);
        }
        if (!C1613e.f1633p) {
            Log.d("LoginFragmentJapan", "hide google login");
            this.f1357f.setVisibility(8);
        }
        if (!C1613e.f1637t) {
            Log.d("LoginFragmentJapan", "hide line login");
            this.f1355d.setVisibility(8);
        }
        if (C1613e.f1627j) {
            Log.d("LoginFragmentJapan", "hide email login");
            this.f1358g.setVisibility(8);
        }
        if (!C1613e.f1636s) {
            Log.d("LoginFragmentJapan", "hide twitter login");
            this.f1359h.setVisibility(8);
        }
        if (!C1541g.m1887a().f1490m) {
            this.f1361j.setVisibility(8);
            this.f1360i.setVisibility(0);
            return;
        }
        this.f1361j.setVisibility(0);
        this.f1361j.setImageResource(C1124R.C1125drawable.login_logo);
        this.f1360i.setVisibility(8);
    }

    /* renamed from: c */
    public static C1468c m1758c() {
        return new C1468c();
    }

    /* renamed from: d */
    private void m1761d() {
        this.f1353b.setFocusableInTouchMode(true);
        this.f1353b.requestFocus();
        this.f1353b.setOnKeyListener(new C1476h());
        this.f1355d.setOnClickListener(new C1477i());
        this.f1354c.setOnClickListener(new C1478j());
        this.f1357f.setOnClickListener(new C1479k());
        this.f1356e.setOnClickListener(new C1480l());
        this.f1358g.setOnClickListener(new C1469a());
        this.f1359h.setOnClickListener(new C1470b());
        this.f1362k.setOnClickListener(new C1471c());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        C1538f.m1861l().mo12849k();
        this.f1283a.mo12187g();
        return false;
    }
}
