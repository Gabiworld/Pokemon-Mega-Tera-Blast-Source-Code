package com.quickgame.android.sdk.p038g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p010qg.eventbus.C0944c;
import com.p010qg.eventbus.Subscribe;
import com.p010qg.eventbus.ThreadMode;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p026b.C1271b;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.C1383q;
import com.quickgame.android.sdk.p034e.p035r.C1397c;
import com.quickgame.android.sdk.p038g.C1444a;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1603f;
import com.quickgame.android.sdk.thirdlogin.C1678a;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1693f;
import com.quickgame.android.sdk.thirdlogin.C1695g;
import com.quickgame.android.sdk.thirdlogin.C1708h;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import com.quickgame.android.sdk.thirdlogin.C1711j;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;

/* renamed from: com.quickgame.android.sdk.g.b */
public class C1446b extends C1444a {

    /* renamed from: A */
    private FrameLayout f1284A = null;

    /* renamed from: B */
    private FrameLayout f1285B = null;

    /* renamed from: C */
    private FrameLayout f1286C = null;

    /* renamed from: D */
    private FrameLayout f1287D = null;

    /* renamed from: E */
    private ImageButton f1288E = null;

    /* renamed from: F */
    private ImageButton f1289F = null;

    /* renamed from: G */
    private ImageButton f1290G = null;

    /* renamed from: H */
    private ImageButton f1291H = null;

    /* renamed from: I */
    private ImageButton f1292I = null;

    /* renamed from: J */
    private ImageButton f1293J = null;

    /* renamed from: K */
    private ImageButton f1294K = null;

    /* renamed from: L */
    private ImageButton f1295L = null;

    /* renamed from: M */
    private ImageButton f1296M = null;

    /* renamed from: N */
    private EditText f1297N = null;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public EditText f1298O = null;

    /* renamed from: P */
    private C1684b f1299P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C1678a f1300Q = null;

    /* renamed from: R */
    private C1687c f1301R = null;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C1693f f1302S = null;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public TwitterManager f1303T = null;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C1691e f1304U = null;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C1711j f1305V = null;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C1695g f1306W = null;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C1708h f1307X = null;

    /* renamed from: b */
    C1383q f1308b;

    /* renamed from: c */
    private View f1309c = null;

    /* renamed from: d */
    private FrameLayout f1310d = null;

    /* renamed from: e */
    private FrameLayout f1311e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1397c f1312f = null;

    /* renamed from: g */
    private TextView f1313g = null;

    /* renamed from: h */
    private TextView f1314h = null;

    /* renamed from: i */
    private TextView f1315i = null;

    /* renamed from: j */
    private TextView f1316j = null;

    /* renamed from: k */
    private TextView f1317k = null;

    /* renamed from: l */
    private ImageView f1318l = null;

    /* renamed from: m */
    private LinearLayout f1319m = null;

    /* renamed from: n */
    private LinearLayout f1320n = null;

    /* renamed from: o */
    private LinearLayout f1321o = null;

    /* renamed from: p */
    private LinearLayout f1322p = null;

    /* renamed from: q */
    private LinearLayout f1323q = null;

    /* renamed from: r */
    private TextView f1324r = null;

    /* renamed from: s */
    private LinearLayout f1325s = null;

    /* renamed from: t */
    private LinearLayout f1326t = null;

    /* renamed from: u */
    private LinearLayout f1327u = null;

    /* renamed from: v */
    private FrameLayout f1328v = null;

    /* renamed from: w */
    private FrameLayout f1329w = null;

    /* renamed from: x */
    private FrameLayout f1330x = null;

    /* renamed from: y */
    private FrameLayout f1331y = null;

    /* renamed from: z */
    private FrameLayout f1332z = null;

    /* renamed from: com.quickgame.android.sdk.g.b$a */
    class C1447a implements View.OnClickListener {
        C1447a() {
        }

        public void onClick(View view) {
            C1446b.this.f1303T.mo13181b(C1446b.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$b */
    class C1448b implements View.OnClickListener {
        C1448b() {
        }

        public void onClick(View view) {
            C1446b.this.f1304U.mo13214b(C1446b.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$c */
    class C1449c implements View.OnClickListener {
        C1449c() {
        }

        public void onClick(View view) {
            C1446b.this.f1305V.mo13260a((Activity) C1446b.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$d */
    class C1450d implements View.OnClickListener {
        C1450d() {
        }

        public void onClick(View view) {
            Log.d("QGLoginFragment", "appleLogin");
            C1446b.this.f1300Q.mo13185a((Activity) C1446b.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$e */
    class C1451e implements View.OnClickListener {
        C1451e() {
        }

        public void onClick(View view) {
            Log.d("QGLoginFragment", "facebookLogin onClick");
            C1446b.this.m1742f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$f */
    class C1452f implements View.OnClickListener {
        C1452f() {
        }

        public void onClick(View view) {
            C1446b.this.m1742f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$g */
    class C1453g implements View.OnClickListener {
        C1453g() {
        }

        public void onClick(View view) {
            Log.d("QGLoginFragment", "facebookLogin onClick");
            C1446b.this.m1742f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$h */
    class C1454h implements View.OnClickListener {
        C1454h() {
        }

        public void onClick(View view) {
            C1446b.this.m1744g();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$i */
    class C1455i implements View.OnClickListener {
        C1455i() {
        }

        public void onClick(View view) {
            C1446b.this.f1283a.mo12186f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$j */
    class C1456j implements View.OnClickListener {
        C1456j() {
        }

        public void onClick(View view) {
            C1446b.this.f1283a.mo12186f();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$k */
    class C1457k extends C1710i {
        C1457k() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            Log.d("QGLoginFragment", "loginSuccessful " + str5);
            C1446b.this.f1283a.mo12180a(str, str2, str3, str4, str5);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            Log.d("QGLoginFragment", "loginError " + str);
            C1446b.this.f1283a.mo12178a(str);
        }

        public void onLoginCancel() {
            Log.d("QGLoginFragment", "loginCancel");
            C1446b.this.f1283a.mo12183c();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$l */
    class C1458l implements View.OnClickListener {
        C1458l() {
        }

        public void onClick(View view) {
            C1446b.this.f1307X.mo13253a(C1446b.this.getActivity());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$m */
    class C1459m implements View.OnTouchListener {
        C1459m(C1446b bVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                view.setAlpha(0.6f);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                view.setAlpha(1.0f);
                return false;
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$n */
    class C1460n implements View.OnKeyListener {
        C1460n() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1446b.this.mo12494a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$o */
    class C1461o implements View.OnClickListener {
        C1461o() {
        }

        public void onClick(View view) {
            C1446b.this.f1283a.mo12177a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$p */
    class C1462p implements View.OnClickListener {
        C1462p() {
        }

        public void onClick(View view) {
            C1446b.this.f1283a.mo12184d();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$q */
    class C1463q implements View.OnClickListener {
        C1463q() {
        }

        public void onClick(View view) {
            String b = C1446b.this.f1312f.mo12620b();
            String a = C1446b.this.f1312f.mo12618a();
            if (!"".equals(b) && !"".equals(a)) {
                C1446b.this.f1283a.mo12179a(a, b);
                C1446b.this.mo12724a(false);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$r */
    class C1464r implements View.OnClickListener {
        C1464r() {
        }

        public void onClick(View view) {
            C1446b.this.f1283a.mo12182b(C1446b.this.f1298O.getText().toString());
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$s */
    class C1465s implements View.OnClickListener {
        C1465s() {
        }

        public void onClick(View view) {
            C1446b.this.mo12494a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$t */
    class C1466t implements View.OnClickListener {
        C1466t() {
        }

        public void onClick(View view) {
            C1446b.this.f1306W.mo13222a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.g.b$u */
    class C1467u implements View.OnClickListener {
        C1467u() {
        }

        public void onClick(View view) {
            C1446b.this.f1302S.mo13218b(C1446b.this.getActivity());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.d("QGLoginFragment", "onActivityCreated");
        super.onActivityCreated(bundle);
        m1736c();
        m1740e();
        C1397c cVar = new C1397c(getActivity(), this.f1309c);
        this.f1312f = cVar;
        cVar.mo12621c();
        this.f1312f.mo12623e();
        C1457k kVar = new C1457k();
        if (C1613e.f1631n && C1541g.m1887a().f1487j) {
            C1684b bVar = new C1684b();
            this.f1299P = bVar;
            bVar.mo13196a((C1690d) kVar);
        }
        if (C1613e.f1633p && C1541g.m1887a().f1488k) {
            C1687c cVar2 = new C1687c();
            this.f1301R = cVar2;
            cVar2.mo13201a(getActivity(), kVar);
        }
        if (C1613e.f1635r) {
            C1695g gVar = new C1695g(getActivity());
            this.f1306W = gVar;
            gVar.mo13227a((C1690d) kVar);
        }
        if (C1613e.f1634q) {
            C1693f fVar = new C1693f();
            this.f1302S = fVar;
            fVar.mo13216a(getActivity(), kVar);
        }
        if (C1613e.f1636s) {
            TwitterManager twitterManager = new TwitterManager();
            this.f1303T = twitterManager;
            twitterManager.mo13177a(getActivity(), kVar);
        }
        if (C1613e.f1637t) {
            C1691e eVar = new C1691e();
            this.f1304U = eVar;
            eVar.mo13210a((Activity) getActivity(), (C1690d) kVar);
        }
        if (C1613e.f1638u) {
            C1711j jVar = new C1711j();
            this.f1305V = jVar;
            jVar.mo13261a(getActivity(), kVar);
        }
        if (C1613e.f1640w) {
            C1708h hVar = C1708h.f1755b;
            this.f1307X = hVar;
            hVar.mo13254a(getContext(), kVar);
        }
        if (C1613e.f1632o) {
            C1678a aVar = new C1678a();
            this.f1300Q = aVar;
            aVar.mo13186a((C1690d) kVar);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C1695g gVar;
        C1711j jVar;
        C1691e eVar;
        TwitterManager twitterManager;
        C1684b bVar;
        C1687c cVar;
        super.onActivityResult(i, i2, intent);
        if (C1613e.f1633p && (cVar = this.f1301R) != null) {
            cVar.mo13199a(i, i2, intent);
            mo12725b();
        }
        if (C1613e.f1631n && (bVar = this.f1299P) != null) {
            bVar.mo13194a(i, i2, intent);
        }
        if (C1613e.f1636s && (twitterManager = this.f1303T) != null) {
            twitterManager.mo13175a(i, i2, intent);
        }
        if (C1613e.f1637t && (eVar = this.f1304U) != null) {
            eVar.mo13208a(i, i2, intent);
        }
        if (C1613e.f1638u && (jVar = this.f1305V) != null) {
            jVar.mo13259a(i, i2, intent);
        }
        if (C1613e.f1635r && (gVar = this.f1306W) != null) {
            gVar.mo13223a(i, i2, intent);
        }
    }

    public void onAttach(Context context) {
        Log.d("QGLoginFragment", "onAttach");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        Log.d("QGLoginFragment", "onCreate");
        C1271b.m1348u();
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("QGLoginFragment", "onCreateView");
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_login, viewGroup, false);
        this.f1309c = inflate;
        return inflate;
    }

    public void onDestroy() {
        Log.d("QGLoginFragment", "onDestroy");
        super.onDestroy();
        C0944c.m227c().mo11531d(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(C1277a aVar) {
        if ("action.login_failed".equals(aVar.f933a)) {
            mo12724a(true);
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        Log.d("QGLoginFragment", "onStart");
        super.onStart();
        C1444a.C1445a aVar = this.f1283a;
        if (aVar != null && C1603f.f1603a.mo13049b(aVar.mo12185e())) {
            this.f1297N.setText(this.f1283a.mo12185e());
        }
        if (!C0944c.m227c().mo11527a((Object) this)) {
            C0944c.m227c().mo11530c(this);
        }
    }

    public void onStop() {
        Log.d("QGLoginFragment", "onStop");
        this.f1312f.mo12622d();
        super.onStop();
    }

    /* renamed from: c */
    private void m1736c() {
        this.f1311e = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.frame_login);
        this.f1318l = (ImageView) this.f1309c.findViewById(C1124R.C1126id.iv_login_logo);
        this.f1317k = (TextView) this.f1309c.findViewById(C1124R.C1126id.tv_title);
        this.f1310d = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_exit);
        this.f1313g = (TextView) this.f1309c.findViewById(C1124R.C1126id.tv_forgot);
        this.f1314h = (TextView) this.f1309c.findViewById(C1124R.C1126id.tv_register);
        this.f1315i = (TextView) this.f1309c.findViewById(C1124R.C1126id.tv_login);
        this.f1287D = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_taptap);
        this.f1297N = (EditText) this.f1309c.findViewById(C1124R.C1126id.et_email);
        this.f1298O = (EditText) this.f1309c.findViewById(C1124R.C1126id.et_cdkey);
        this.f1316j = (TextView) this.f1309c.findViewById(C1124R.C1126id.tv_useCdKey);
        this.f1329w = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_facebook);
        this.f1330x = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_naver);
        this.f1328v = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_twitter);
        this.f1331y = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_line);
        this.f1332z = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_vk);
        this.f1284A = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_apple);
        this.f1285B = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_playgame);
        this.f1286C = (FrameLayout) this.f1309c.findViewById(C1124R.C1126id.fl_guest);
        this.f1289F = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_facebook);
        this.f1290G = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_naver);
        this.f1288E = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_twitter);
        this.f1291H = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_line);
        this.f1292I = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_vk);
        this.f1293J = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_apple);
        this.f1294K = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_playgame);
        this.f1295L = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_taptap);
        this.f1296M = (ImageButton) this.f1309c.findViewById(C1124R.C1126id.ib_guest);
        this.f1319m = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_google_login);
        this.f1320n = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_fb_login);
        this.f1321o = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_guest_login_new);
        this.f1322p = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_guest_and_fb);
        this.f1323q = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_fb_login_new);
        this.f1324r = (TextView) this.f1309c.findViewById(C1124R.C1126id.interval_tv);
        this.f1325s = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.email_password_layout);
        this.f1326t = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.ll_forgot_regist);
        this.f1327u = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.cdkey_edit_layout);
        LinearLayout linearLayout = (LinearLayout) this.f1309c.findViewById(C1124R.C1126id.layout_login_ib);
        int identifier = getResources().getIdentifier("bg_login_hw", "drawable", getActivity().getPackageName());
        if (identifier != 0) {
            this.f1311e.setBackgroundResource(identifier);
        }
        if (!C1541g.m1887a().f1490m) {
            this.f1318l.setVisibility(8);
            this.f1317k.setVisibility(0);
        } else {
            this.f1318l.setVisibility(0);
            this.f1318l.setImageResource(C1124R.C1125drawable.login_logo);
            this.f1317k.setVisibility(8);
        }
        if (C1613e.f1627j) {
            this.f1325s.setVisibility(8);
            this.f1315i.setVisibility(8);
            this.f1326t.setVisibility(8);
            int identifier2 = getResources().getIdentifier("bg_automatic_hw", "drawable", getActivity().getPackageName());
            if (identifier2 != 0) {
                this.f1311e.setBackgroundResource(identifier2);
            }
        }
        if (C1613e.f1639v) {
            this.f1327u.setVisibility(0);
        } else {
            this.f1316j.setVisibility(8);
        }
        if (!C1613e.f1634q) {
            Log.d("QGLoginFragment", "hide naverFL login");
            this.f1330x.setVisibility(8);
        }
        if (!C1613e.f1631n || !C1541g.m1887a().f1487j) {
            Log.d("QGLoginFragment", "hide fbFL login");
            this.f1329w.setVisibility(8);
            this.f1320n.setVisibility(8);
        } else if (C1128a.m798r().mo11999l().showFacebookLargeBtn()) {
            this.f1320n.setVisibility(0);
            this.f1329w.setVisibility(8);
        } else {
            this.f1329w.setVisibility(0);
            this.f1320n.setVisibility(8);
        }
        if (!C1613e.f1630m) {
            Log.d("QGLoginFragment", "hide guestFL login");
            this.f1286C.setVisibility(8);
        }
        if (!C1613e.f1633p) {
            Log.d("QGLoginFragment", "hide googleFL login");
            this.f1319m.setVisibility(8);
        }
        if (!C1613e.f1636s) {
            Log.d("QGLoginFragment", "hide twitterFL login");
            this.f1328v.setVisibility(8);
        }
        if (!C1613e.f1637t) {
            Log.d("QGLoginFragment", "hide lineFL login");
            this.f1331y.setVisibility(8);
        }
        if (!C1613e.f1638u) {
            Log.d("QGLoginFragment", "hide VKFL Login");
            this.f1332z.setVisibility(8);
        }
        if (C1613e.f1632o) {
            this.f1284A.setVisibility(0);
        } else {
            this.f1284A.setVisibility(8);
        }
        if (!C1613e.f1635r) {
            Log.d("QGLoginFragment", "hide PlayGameFL Login");
            this.f1285B.setVisibility(8);
        }
        if (!C1128a.m798r().mo11999l().showFacebookLargeBtn()) {
            C1613e e = C1538f.m1861l().mo12843e();
            if ((e.f1646f.size() > 3 || (!C1613e.f1631n && !C1613e.f1630m)) && (e.f1646f.size() != 4 || !C1613e.f1631n || !C1613e.f1630m)) {
                this.f1322p.setVisibility(8);
                return;
            }
            this.f1322p.setVisibility(0);
            if (!C1613e.f1630m) {
                this.f1321o.setVisibility(8);
            } else {
                this.f1286C.setVisibility(8);
            }
            if (!C1613e.f1631n) {
                this.f1323q.setVisibility(8);
            } else {
                this.f1329w.setVisibility(8);
                this.f1320n.setVisibility(8);
            }
            if (this.f1321o.getVisibility() == 0 && this.f1323q.getVisibility() == 0) {
                this.f1324r.setVisibility(0);
            } else {
                this.f1324r.setVisibility(8);
            }
        } else {
            this.f1322p.setVisibility(8);
        }
    }

    /* renamed from: d */
    public static C1446b m1737d() {
        return new C1446b();
    }

    /* renamed from: e */
    private void m1740e() {
        this.f1309c.setFocusableInTouchMode(true);
        this.f1309c.requestFocus();
        this.f1309c.setOnKeyListener(new C1460n());
        this.f1313g.setOnClickListener(new C1461o());
        this.f1314h.setOnClickListener(new C1462p());
        this.f1315i.setOnClickListener(new C1463q());
        this.f1316j.setOnClickListener(new C1464r());
        this.f1310d.setOnClickListener(new C1465s());
        if (C1613e.f1635r) {
            this.f1294K.setOnClickListener(new C1466t());
        }
        this.f1290G.setOnClickListener(new C1467u());
        this.f1288E.setOnClickListener(new C1447a());
        this.f1291H.setOnClickListener(new C1448b());
        this.f1292I.setOnClickListener(new C1449c());
        this.f1293J.setOnClickListener(new C1450d());
        if (C1613e.f1631n) {
            this.f1320n.setOnClickListener(new C1451e());
            this.f1289F.setOnClickListener(new C1452f());
            this.f1323q.setOnClickListener(new C1453g());
        }
        if (C1613e.f1633p && C1541g.m1887a().f1488k) {
            this.f1319m.setOnClickListener(new C1454h());
        }
        if (C1613e.f1640w) {
            this.f1287D.setVisibility(0);
        } else {
            this.f1287D.setVisibility(8);
        }
        this.f1296M.setOnClickListener(new C1455i());
        this.f1321o.setOnClickListener(new C1456j());
        this.f1295L.setOnClickListener(new C1458l());
        C1459m mVar = new C1459m(this);
        this.f1296M.setOnTouchListener(mVar);
        this.f1289F.setOnTouchListener(mVar);
        this.f1290G.setOnTouchListener(mVar);
        this.f1291H.setOnTouchListener(mVar);
        this.f1288E.setOnTouchListener(mVar);
        this.f1292I.setOnTouchListener(mVar);
        this.f1293J.setOnTouchListener(mVar);
        this.f1294K.setOnTouchListener(mVar);
        this.f1295L.setOnTouchListener(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m1742f() {
        C1271b.m1337j();
        this.f1299P.mo13195a((Activity) getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m1744g() {
        C1271b.m1341n();
        mo12723a("");
        this.f1301R.mo13202b((Activity) getActivity());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        C1271b.m1350w();
        C1538f.m1861l().mo12849k();
        C1444a.C1445a aVar = this.f1283a;
        if (aVar == null) {
            return false;
        }
        aVar.mo12187g();
        return false;
    }

    /* renamed from: b */
    public void mo12725b() {
        C1383q qVar = this.f1308b;
        if (qVar != null) {
            qVar.dismissAllowingStateLoss();
            this.f1308b = null;
        }
    }

    /* renamed from: a */
    public void mo12723a(String str) {
        Log.d("QGLoginFragment", "showWaitingDialog");
        C1383q a = C1383q.m1585a();
        this.f1308b = a;
        a.show(getFragmentManager(), str);
    }

    /* renamed from: a */
    public void mo12724a(boolean z) {
        TextView textView = this.f1315i;
        if (textView != null) {
            textView.setClickable(z);
        }
    }
}
