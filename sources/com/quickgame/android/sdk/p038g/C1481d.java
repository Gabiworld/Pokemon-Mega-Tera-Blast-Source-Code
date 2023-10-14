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
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.thirdlogin.C1678a;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1693f;
import com.quickgame.android.sdk.thirdlogin.C1710i;

/* renamed from: com.quickgame.android.sdk.g.d */
public class C1481d extends C1444a {

    /* renamed from: b */
    private View f1379b = null;

    /* renamed from: c */
    private FrameLayout f1380c = null;

    /* renamed from: d */
    private FrameLayout f1381d = null;

    /* renamed from: e */
    private FrameLayout f1382e = null;

    /* renamed from: f */
    private FrameLayout f1383f = null;

    /* renamed from: g */
    private FrameLayout f1384g = null;

    /* renamed from: h */
    private FrameLayout f1385h = null;

    /* renamed from: i */
    private TextView f1386i = null;

    /* renamed from: j */
    private TextView f1387j = null;

    /* renamed from: k */
    private TextView f1388k = null;

    /* renamed from: l */
    private TextView f1389l = null;

    /* renamed from: m */
    private TextView f1390m = null;

    /* renamed from: n */
    private TextView f1391n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1684b f1392o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C1678a f1393p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1687c f1394q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1693f f1395r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C1691e f1396s = null;

    /* renamed from: com.quickgame.android.sdk.g.d$a */
    class C1482a implements View.OnClickListener {
        C1482a() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "facebookTV");
            C1481d.this.f1392o.mo13195a((Activity) C1481d.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$b */
    class C1483b implements View.OnClickListener {
        C1483b() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "naverTV");
            C1481d.this.f1395r.mo13218b(C1481d.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$c */
    class C1484c implements View.OnClickListener {
        C1484c() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "lineTV");
            C1481d.this.f1396s.mo13214b(C1481d.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$d */
    class C1485d implements View.OnClickListener {
        C1485d() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "appleTV ");
            C1481d.this.f1393p.mo13185a((Activity) C1481d.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$e */
    class C1486e extends C1710i {
        C1486e() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1481d.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1481d.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1481d.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$f */
    class C1487f extends C1710i {
        C1487f() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1481d.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1481d.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1481d.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$g */
    class C1488g extends C1710i {
        C1488g() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1481d.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1481d.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1481d.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$h */
    class C1489h extends C1710i {
        C1489h() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1481d.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1481d.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1481d.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$i */
    class C1490i extends C1710i {
        C1490i() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            C1481d.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            C1481d.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            C1481d.this.f1283a.mo12178a("cancel");
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$j */
    class C1491j implements View.OnKeyListener {
        C1491j() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1481d.this.mo12494a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$k */
    class C1492k implements View.OnClickListener {
        C1492k() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "freePlayTV");
            C1481d.this.f1283a.mo12186f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$l */
    class C1493l implements View.OnClickListener {
        C1493l() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "closeFL onclick");
            C1481d.this.mo12494a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.d$m */
    class C1494m implements View.OnClickListener {
        C1494m() {
        }

        public void onClick(View view) {
            Log.d("LoginFragmentKorea", "googleTV");
            C1481d.this.f1394q.mo13202b((Activity) C1481d.this.getActivity());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.d("LoginFragmentKorea", "onActivityCreated");
        super.onActivityCreated(bundle);
        m1773b();
        m1777d();
        if (C1613e.f1631n) {
            C1684b bVar = new C1684b();
            this.f1392o = bVar;
            bVar.mo13196a((C1690d) new C1486e());
        }
        if (C1613e.f1633p) {
            C1687c cVar = new C1687c();
            this.f1394q = cVar;
            cVar.mo13201a(getActivity(), new C1487f());
        }
        if (C1613e.f1634q) {
            C1693f fVar = new C1693f();
            this.f1395r = fVar;
            fVar.mo13216a(getActivity(), new C1488g());
        }
        if (C1613e.f1637t) {
            C1691e eVar = new C1691e();
            this.f1396s = eVar;
            eVar.mo13210a((Activity) getActivity(), (C1690d) new C1489h());
        }
        if (C1613e.f1632o) {
            C1678a aVar = new C1678a();
            this.f1393p = aVar;
            aVar.mo13186a((C1690d) new C1490i());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C1691e eVar;
        C1684b bVar;
        C1687c cVar;
        super.onActivityResult(i, i2, intent);
        if (C1613e.f1633p && (cVar = this.f1394q) != null) {
            cVar.mo13199a(i, i2, intent);
        }
        if (C1613e.f1631n && (bVar = this.f1392o) != null) {
            bVar.mo13194a(i, i2, intent);
        }
        if (C1613e.f1637t && (eVar = this.f1396s) != null) {
            eVar.mo13208a(i, i2, intent);
        }
    }

    public void onAttach(Context context) {
        Log.d("LoginFragmentKorea", "onAttach");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        Log.d("LoginFragmentKorea", "onCreate");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("LoginFragmentKorea", "onCreateView");
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_korea_login, viewGroup, false);
        this.f1379b = inflate;
        return inflate;
    }

    public void onDestroy() {
        Log.d("LoginFragmentKorea", "onDestroy");
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        Log.d("LoginFragmentKorea", "onStart");
        super.onStart();
    }

    public void onStop() {
        Log.d("LoginFragmentKorea", "onStop");
        super.onStop();
    }

    /* renamed from: b */
    private void m1773b() {
        this.f1380c = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_exit);
        this.f1381d = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_google);
        this.f1382e = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_fb);
        this.f1383f = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_apple);
        this.f1384g = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_nv);
        this.f1385h = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_line);
        FrameLayout frameLayout = (FrameLayout) this.f1379b.findViewById(C1124R.C1126id.fl_guest);
        this.f1387j = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_google_login);
        this.f1388k = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_fb_login);
        this.f1389l = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_apple_login);
        this.f1390m = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_nv_login);
        this.f1391n = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_line_login);
        this.f1386i = (TextView) this.f1379b.findViewById(C1124R.C1126id.tv_freePlay_login);
        if (!C1613e.f1634q) {
            Log.d("LoginFragmentKorea", "hide naver login");
            this.f1384g.setVisibility(8);
        }
        if (!C1613e.f1631n) {
            Log.d("LoginFragmentKorea", "hide fb login");
            this.f1382e.setVisibility(8);
        }
        if (!C1613e.f1633p) {
            Log.d("LoginFragmentKorea", "hide google login");
            this.f1381d.setVisibility(8);
        }
        if (!C1613e.f1637t) {
            Log.d("LoginFragmentKorea", "hide google login");
            this.f1385h.setVisibility(8);
        }
        if (!C1613e.f1632o) {
            Log.d("LoginFragmentKorea", "hide apple login");
            this.f1383f.setVisibility(8);
        }
    }

    /* renamed from: c */
    public static C1481d m1774c() {
        return new C1481d();
    }

    /* renamed from: d */
    private void m1777d() {
        this.f1379b.setFocusableInTouchMode(true);
        this.f1379b.requestFocus();
        this.f1379b.setOnKeyListener(new C1491j());
        this.f1386i.setOnClickListener(new C1492k());
        this.f1380c.setOnClickListener(new C1493l());
        this.f1387j.setOnClickListener(new C1494m());
        this.f1388k.setOnClickListener(new C1482a());
        this.f1390m.setOnClickListener(new C1483b());
        this.f1391n.setOnClickListener(new C1484c());
        this.f1389l.setOnClickListener(new C1485d());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        C1538f.m1861l().mo12849k();
        this.f1283a.mo12187g();
        return false;
    }
}
