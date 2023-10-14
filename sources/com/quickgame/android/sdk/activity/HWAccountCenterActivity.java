package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.p010qg.eventbus.Subscribe;
import com.p010qg.eventbus.ThreadMode;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.QuickGameManager;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1673l;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.p035r.C1418f;
import com.quickgame.android.sdk.p038g.C1495e;
import com.quickgame.android.sdk.p039h.C1534e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1606i;
import com.quickgame.android.sdk.view.CircleImageView;
import org.json.JSONObject;

public class HWAccountCenterActivity extends MvpBaseActivity<C1673l> implements C1673l.C1674a {

    /* renamed from: A */
    private TextView f734A = null;

    /* renamed from: B */
    private TextView f735B = null;

    /* renamed from: C */
    private TextView f736C = null;

    /* renamed from: D */
    private TextView f737D = null;

    /* renamed from: E */
    private TextView f738E = null;

    /* renamed from: F */
    private TextView f739F = null;

    /* renamed from: G */
    private TextView f740G = null;

    /* renamed from: H */
    private TextView f741H = null;

    /* renamed from: I */
    private TextView f742I = null;

    /* renamed from: J */
    private TextView f743J = null;

    /* renamed from: K */
    private TextView f744K = null;

    /* renamed from: L */
    private TextView f745L = null;

    /* renamed from: M */
    private LinearLayout f746M = null;

    /* renamed from: N */
    private LinearLayout f747N = null;

    /* renamed from: O */
    private LinearLayout f748O = null;

    /* renamed from: P */
    private LinearLayout f749P = null;

    /* renamed from: Q */
    private LinearLayout f750Q = null;

    /* renamed from: R */
    private LinearLayout f751R = null;

    /* renamed from: S */
    private LinearLayout f752S = null;

    /* renamed from: T */
    private LinearLayout f753T = null;

    /* renamed from: U */
    private LinearLayout f754U = null;

    /* renamed from: V */
    private LinearLayout f755V = null;

    /* renamed from: W */
    private LinearLayout f756W = null;

    /* renamed from: X */
    private LinearLayout f757X = null;

    /* renamed from: Y */
    private LinearLayout f758Y = null;

    /* renamed from: Z */
    private LinearLayout f759Z = null;

    /* renamed from: a0 */
    private LinearLayout f760a0 = null;

    /* renamed from: b0 */
    private LinearLayout f761b0 = null;

    /* renamed from: c */
    private CircleImageView f762c = null;

    /* renamed from: c0 */
    private LinearLayout f763c0 = null;

    /* renamed from: d */
    private TextView f764d = null;

    /* renamed from: d0 */
    private LinearLayout f765d0 = null;

    /* renamed from: e */
    private TextView f766e = null;

    /* renamed from: e0 */
    private LinearLayout f767e0 = null;

    /* renamed from: f */
    private TextView f768f = null;

    /* renamed from: f0 */
    private LinearLayout f769f0 = null;

    /* renamed from: g */
    private FrameLayout f770g = null;

    /* renamed from: g0 */
    private LinearLayout f771g0 = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public LinearLayout f772h = null;

    /* renamed from: h0 */
    private LinearLayout f773h0 = null;

    /* renamed from: i */
    private TextView f774i = null;

    /* renamed from: i0 */
    private LinearLayout f775i0 = null;

    /* renamed from: j */
    private TextView f776j = null;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public QGUserBindInfo f777j0 = null;

    /* renamed from: k */
    private TextView f778k = null;

    /* renamed from: k0 */
    private String f779k0 = "";

    /* renamed from: l */
    private TextView f780l = null;

    /* renamed from: l0 */
    private String f781l0 = "";

    /* renamed from: m */
    private TextView f782m = null;

    /* renamed from: m0 */
    private int f783m0 = 0;

    /* renamed from: n */
    private TextView f784n = null;

    /* renamed from: n0 */
    private int f785n0 = 0;

    /* renamed from: o */
    private TextView f786o = null;

    /* renamed from: o0 */
    private int f787o0 = 0;

    /* renamed from: p */
    private TextView f788p = null;

    /* renamed from: q */
    private TextView f789q = null;

    /* renamed from: r */
    private TextView f790r = null;

    /* renamed from: s */
    private TextView f791s = null;

    /* renamed from: t */
    private TextView f792t = null;

    /* renamed from: u */
    private TextView f793u = null;

    /* renamed from: v */
    private TextView f794v = null;

    /* renamed from: w */
    private TextView f795w = null;

    /* renamed from: x */
    private TextView f796x = null;

    /* renamed from: y */
    private TextView f797y = null;

    /* renamed from: z */
    private TextView f798z = null;

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$a */
    class C1188a implements View.OnClickListener {
        C1188a() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindPlay(), QGConstant.LOGIN_OPEN_TYPE_PLAYGAME);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$a0 */
    class C1189a0 implements View.OnClickListener {
        C1189a0() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindGoogle(), QGConstant.LOGIN_OPEN_TYPE_GOOGLE);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$b */
    class C1190b implements View.OnClickListener {
        C1190b() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindNaver(), QGConstant.LOGIN_OPEN_TYPE_NAVER);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$c */
    class C1191c implements View.OnClickListener {
        C1191c() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindTwitter(), QGConstant.LOGIN_OPEN_TYPE_TWITTER);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$d */
    class C1192d implements View.OnClickListener {
        C1192d() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindLine(), QGConstant.LOGIN_OPEN_TYPE_LINE);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$e */
    class C1193e implements View.OnClickListener {
        C1193e() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindVk(), QGConstant.LOGIN_OPEN_TYPE_VK);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$f */
    class C1194f implements View.OnClickListener {
        C1194f() {
        }

        public void onClick(View view) {
            C1495e.f1410a.mo12765a(HWAccountCenterActivity.this, 506);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$g */
    class C1195g implements View.OnClickListener {
        C1195g() {
        }

        public void onClick(View view) {
            C1495e.f1410a.mo12765a(HWAccountCenterActivity.this, 506);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$h */
    class C1196h implements View.OnClickListener {
        C1196h() {
        }

        public void onClick(View view) {
            C1495e.f1410a.mo12765a(HWAccountCenterActivity.this, 506);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$i */
    class C1197i implements View.OnClickListener {
        C1197i() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindTapTap(), QGConstant.LOGIN_OPEN_TYPE_TAPTAP);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$j */
    class C1198j implements View.OnClickListener {
        C1198j(HWAccountCenterActivity hWAccountCenterActivity) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$k */
    class C1199k implements View.OnClickListener {
        C1199k() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity.this.startActivity(new Intent(HWAccountCenterActivity.this, HWModifyPwActivity.class));
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$l */
    class C1200l implements View.OnClickListener {
        C1200l(HWAccountCenterActivity hWAccountCenterActivity) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$m */
    class C1201m implements View.OnClickListener {
        C1201m() {
        }

        public void onClick(View view) {
            HWWebViewActivity.m1222b(HWAccountCenterActivity.this, "", C1128a.f600k);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$n */
    class C1202n implements View.OnClickListener {
        C1202n() {
        }

        public void onClick(View view) {
            SharedPreferences sharedPreferences = HWAccountCenterActivity.this.getSharedPreferences("FB_info", 0);
            String string = sharedPreferences.getString("roleId", (String) null);
            C1128a.m798r().mo11976c(HWAccountCenterActivity.this, sharedPreferences.getString("serverId", (String) null), string);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$o */
    class C1203o implements View.OnClickListener {
        C1203o(HWAccountCenterActivity hWAccountCenterActivity) {
        }

        public void onClick(View view) {
            C1534e.f1462f.mo12823b().onCustomerServiceClicked();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$p */
    class C1204p implements View.OnClickListener {
        C1204p() {
        }

        public void onClick(View view) {
            C1128a.m798r().mo11947a((Activity) HWAccountCenterActivity.this, false);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$q */
    class C1205q implements View.OnClickListener {
        C1205q() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity.this.startActivity(new Intent(HWAccountCenterActivity.this, HWModifyPwActivity.class));
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$r */
    class C1206r implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f814a;

        C1206r(String str) {
            this.f814a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((ClipboardManager) HWAccountCenterActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("cdkey", this.f814a));
            Log.d("QGUserCenterActivity", "copy btn");
            Toast.makeText(HWAccountCenterActivity.this.getApplicationContext(), "Text Copied", 0).show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$s */
    class C1207s implements DialogInterface.OnClickListener {
        C1207s(HWAccountCenterActivity hWAccountCenterActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.d("QGUserCenterActivity", "ok btn");
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$t */
    class C1208t implements View.OnClickListener {
        C1208t() {
        }

        public void onClick(View view) {
            ((C1673l) HWAccountCenterActivity.this.f1648b).mo13170b();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$u */
    class C1209u implements View.OnClickListener {

        /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$u$a */
        class C1210a implements C1418f.C1422d {
            C1210a() {
            }

            /* renamed from: a */
            public void mo12018a() {
                HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
                hWAccountCenterActivity.m1087b(hWAccountCenterActivity.f772h, 0);
            }

            /* renamed from: b */
            public void mo12019b() {
                HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
                hWAccountCenterActivity.m1087b(hWAccountCenterActivity.f772h, 0);
            }

            /* renamed from: c */
            public void mo12020c() {
                HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
                hWAccountCenterActivity.m1087b(hWAccountCenterActivity.f772h, 0);
                HWAccountCenterActivity.this.m1092v();
            }
        }

        C1209u() {
        }

        public void onClick(View view) {
            boolean isGuest = C1538f.m1861l().mo12847i().isGuest();
            C1613e e = C1538f.m1861l().mo12843e();
            Log.d("QGUserCenterActivity", "isGuest:" + isGuest + " isGuestShowBind:" + e.mo13107d().mo13095d());
            if (!isGuest || !e.mo13107d().mo13095d()) {
                HWAccountCenterActivity.this.m1092v();
                return;
            }
            C1418f fVar = new C1418f(HWAccountCenterActivity.this, true, new C1210a());
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            hWAccountCenterActivity.m1087b(hWAccountCenterActivity.f772h, 8);
            fVar.mo12657b();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$v */
    class C1211v implements View.OnClickListener {
        C1211v() {
        }

        public void onClick(View view) {
            if (C1538f.m1861l().mo12846h() != null) {
                QGUserBindInfo unused = HWAccountCenterActivity.this.f777j0 = C1538f.m1861l().mo12846h();
            }
            if (HWAccountCenterActivity.this.f777j0 == null) {
                QGUserBindInfo unused2 = HWAccountCenterActivity.this.f777j0 = new QGUserBindInfo();
            }
            if (C1128a.m798r().mo12001m() != null) {
                C1128a.m798r().mo12001m().onexitUserCenter();
            }
            HWAccountCenterActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$w */
    class C1212w implements View.OnClickListener {
        C1212w() {
        }

        public void onClick(View view) {
            Log.d("QGUserCenterActivity", "copy btn");
            ClipboardManager clipboardManager = (ClipboardManager) HWAccountCenterActivity.this.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText("Label", C1128a.f601l);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
                Toast.makeText(HWAccountCenterActivity.this.getApplicationContext(), HWAccountCenterActivity.this.getString(C1124R.string.hw_accountCenter_copy_success), 0).show();
                return;
            }
            Toast.makeText(HWAccountCenterActivity.this.getApplicationContext(), HWAccountCenterActivity.this.getString(C1124R.string.hw_accountCenter_copy_failed), 0).show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$x */
    class C1213x implements View.OnClickListener {
        C1213x() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2089a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindEmail());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$y */
    class C1214y implements View.OnClickListener {
        C1214y() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindFacebook(), QGConstant.LOGIN_OPEN_TYPE_FACEBOOK);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWAccountCenterActivity$z */
    class C1215z implements View.OnClickListener {
        C1215z() {
        }

        public void onClick(View view) {
            HWAccountCenterActivity hWAccountCenterActivity = HWAccountCenterActivity.this;
            C1606i.m2090a(hWAccountCenterActivity, hWAccountCenterActivity.f777j0.isBindApple(), QGConstant.LOGIN_OPEN_TYPE_APPLE);
        }
    }

    /* renamed from: t */
    private void m1090t() {
        QGUserBindInfo h = C1538f.m1861l().mo12846h();
        this.f777j0 = h;
        if (h == null) {
            this.f777j0 = new QGUserBindInfo();
        }
        boolean isBindEmail = this.f777j0.isBindEmail();
        boolean isBindFacebook = this.f777j0.isBindFacebook();
        boolean isBindApple = this.f777j0.isBindApple();
        boolean isBindGoogle = this.f777j0.isBindGoogle();
        boolean isBindNaver = this.f777j0.isBindNaver();
        boolean isBindTwitter = this.f777j0.isBindTwitter();
        boolean isBindLine = this.f777j0.isBindLine();
        boolean isBindVk = this.f777j0.isBindVk();
        boolean isBindPlay = this.f777j0.isBindPlay();
        boolean isBind94Hi = this.f777j0.isBind94Hi();
        boolean isBindTapTap = this.f777j0.isBindTapTap();
        if (!C1538f.m1861l().mo12847i().isGuest()) {
            this.f774i.setText(getString(C1124R.string.hw_accountCenter_status_isBinding));
        }
        if (isBindEmail) {
            if (!TextUtils.isEmpty(this.f777j0.getEmailAccountName())) {
                TextView textView = this.f776j;
                textView.setText(getString(C1124R.string.hw_accountCenter_email) + " ( " + this.f777j0.getEmailAccountName() + " )");
            }
            this.f798z.setText(C1124R.string.hw_accountCenter_changePassword);
            this.f798z.setOnClickListener(new C1205q());
        }
        if (isBindGoogle) {
            if (!TextUtils.isEmpty(this.f777j0.getGoogleAccountName())) {
                TextView textView2 = this.f782m;
                textView2.setText("Google ( " + this.f777j0.getGoogleAccountName() + " )");
            }
            this.f734A.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f734A.setText(this.f787o0);
                this.f734A.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f782m.setText("Google");
            this.f734A.setText(getString(this.f783m0));
        }
        if (isBindTapTap) {
            if (!TextUtils.isEmpty(this.f777j0.getTapTapAccountName())) {
                TextView textView3 = this.f784n;
                textView3.setText("TapTap ( " + this.f777j0.getTapTapAccountName() + " )");
            }
            this.f735B.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f735B.setText(this.f787o0);
                this.f735B.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f784n.setText("TapTap");
            this.f735B.setText(getString(this.f783m0));
        }
        if (this.f777j0.isBindPPID()) {
            this.f754U.setVisibility(8);
        } else {
            this.f742I.setText(getString(this.f783m0));
        }
        if (this.f777j0.isBindMetaSens() || !C1538f.m1861l().mo12843e().f1646f.contains(QGConstant.LOGIN_OPEN_TYPE_METASENS)) {
            this.f755V.setVisibility(8);
        }
        if (isBindFacebook) {
            if (!TextUtils.isEmpty(this.f777j0.getFbAccountName())) {
                TextView textView4 = this.f778k;
                textView4.setText("Facebook ( " + this.f777j0.getFbAccountName() + " )");
            }
            this.f796x.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f796x.setText(this.f787o0);
                this.f796x.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f778k.setText("Facebook");
            this.f796x.setText(getString(this.f783m0));
        }
        if (isBindApple) {
            if (!TextUtils.isEmpty(this.f777j0.getAppleAccountName())) {
                TextView textView5 = this.f780l;
                textView5.setText("Apple ( " + this.f777j0.getAppleAccountName() + " )");
            }
            this.f797y.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f797y.setText(this.f787o0);
                this.f797y.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f780l.setText("Apple");
            this.f797y.setText(getString(this.f783m0));
        }
        if (isBindNaver) {
            if (!TextUtils.isEmpty(this.f777j0.getNaverAccountName())) {
                TextView textView6 = this.f786o;
                textView6.setText("Naver ( " + this.f777j0.getNaverAccountName() + " )");
            }
            this.f736C.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f736C.setText(this.f787o0);
                this.f736C.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f786o.setText("Naver");
            this.f736C.setText(getString(this.f783m0));
        }
        if (isBindTwitter) {
            if (!TextUtils.isEmpty(this.f777j0.getTwitterAccountName())) {
                TextView textView7 = this.f792t;
                textView7.setText("Twitter ( " + this.f777j0.getTwitterAccountName() + " )");
            }
            this.f737D.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f737D.setText(this.f787o0);
                this.f737D.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f792t.setText("Twitter");
            this.f737D.setText(getString(this.f783m0));
        }
        if (isBindLine) {
            if (!TextUtils.isEmpty(this.f777j0.getLineAccountName())) {
                TextView textView8 = this.f793u;
                textView8.setText("Line ( " + this.f777j0.getLineAccountName() + " )");
            }
            this.f738E.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f738E.setText(this.f787o0);
                this.f738E.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f793u.setText("Line");
            this.f738E.setText(getString(this.f783m0));
        }
        if (isBindVk) {
            if (!TextUtils.isEmpty(this.f777j0.getVkAccountName())) {
                TextView textView9 = this.f794v;
                textView9.setText("VK ( " + this.f777j0.getVkAccountName() + " )");
            }
            this.f739F.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f739F.setText(this.f787o0);
                this.f739F.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f794v.setText("VK");
            this.f739F.setText(getString(this.f783m0));
        }
        if (isBindPlay) {
            if (!TextUtils.isEmpty(this.f777j0.getPlayAccountName())) {
                TextView textView10 = this.f795w;
                textView10.setText("Play ( " + this.f777j0.getPlayAccountName() + " )");
            }
            this.f740G.setText(getString(this.f785n0));
            if (C1541g.m1887a().f1493p) {
                this.f740G.setText(this.f787o0);
                this.f740G.setOnClickListener((View.OnClickListener) null);
            }
        } else {
            this.f795w.setText(getString(C1124R.string.hw_accountCenter_play));
            this.f740G.setText(getString(this.f783m0));
        }
        if (isBind94Hi) {
            this.f753T.setVisibility(8);
        } else {
            this.f753T.setVisibility(0);
        }
        if (C1541g.m1887a().f1486i) {
            this.f791s.setVisibility(0);
            TextView textView11 = this.f791s;
            textView11.setText("uid: " + C1538f.m1861l().mo12847i().getUid());
        }
    }

    /* renamed from: u */
    private void m1091u() {
        LinearLayout linearLayout;
        this.f762c = (CircleImageView) findViewById(C1124R.C1126id.account_center_user_head);
        this.f772h = (LinearLayout) findViewById(C1124R.C1126id.account_center);
        this.f764d = (TextView) findViewById(C1124R.C1126id.tv_changePassword);
        this.f766e = (TextView) findViewById(C1124R.C1126id.tv_logoutAccount);
        this.f768f = (TextView) findViewById(C1124R.C1126id.tv_getCdKey);
        this.f770g = (FrameLayout) findViewById(C1124R.C1126id.fl_finish);
        this.f775i0 = (LinearLayout) findViewById(C1124R.C1126id.ll_trash);
        this.f796x = (TextView) findViewById(C1124R.C1126id.tv_facebook_bind);
        this.f797y = (TextView) findViewById(C1124R.C1126id.tv_apple_bind);
        this.f798z = (TextView) findViewById(C1124R.C1126id.tv_email_bind);
        this.f734A = (TextView) findViewById(C1124R.C1126id.tv_googleplus_bind);
        this.f735B = (TextView) findViewById(C1124R.C1126id.tv_taptap_bind);
        this.f736C = (TextView) findViewById(C1124R.C1126id.tv_naver_bind);
        this.f737D = (TextView) findViewById(C1124R.C1126id.tv_twitter_bind);
        this.f738E = (TextView) findViewById(C1124R.C1126id.tv_line_bind);
        this.f739F = (TextView) findViewById(C1124R.C1126id.tv_vk_bind);
        this.f740G = (TextView) findViewById(C1124R.C1126id.tv_play_bind);
        this.f741H = (TextView) findViewById(C1124R.C1126id.tv_94hi_bind);
        this.f742I = (TextView) findViewById(C1124R.C1126id.tv_ppid_bind);
        this.f743J = (TextView) findViewById(C1124R.C1126id.tv_metasens_bind);
        this.f744K = (TextView) findViewById(C1124R.C1126id.tv_accountCenter_role_id);
        this.f745L = (TextView) findViewById(C1124R.C1126id.tv_accountCenter_copy);
        this.f746M = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_role_id);
        this.f747N = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_google);
        this.f748O = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_taptap);
        this.f749P = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_naver);
        this.f750Q = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_facebook);
        this.f751R = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_apple);
        this.f752S = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_email);
        this.f753T = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_94hi);
        this.f754U = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_ppid);
        this.f755V = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_meta);
        this.f756W = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_account);
        this.f757X = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_cdkey);
        this.f758Y = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_twitter);
        this.f759Z = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_line);
        this.f760a0 = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_vk);
        this.f761b0 = (LinearLayout) findViewById(C1124R.C1126id.accountCenter_play);
        this.f763c0 = (LinearLayout) findViewById(C1124R.C1126id.ll_account_side);
        this.f765d0 = (LinearLayout) findViewById(C1124R.C1126id.ll_account_side_user);
        this.f767e0 = (LinearLayout) findViewById(C1124R.C1126id.ll_account_side_game);
        this.f769f0 = (LinearLayout) findViewById(C1124R.C1126id.ll_account_side_gift);
        this.f771g0 = (LinearLayout) findViewById(C1124R.C1126id.ll_account_side_fbshare);
        this.f773h0 = (LinearLayout) findViewById(C1124R.C1126id.ll_custom_service);
        this.f774i = (TextView) findViewById(C1124R.C1126id.tv_bindStatus);
        this.f776j = (TextView) findViewById(C1124R.C1126id.tv_email);
        this.f778k = (TextView) findViewById(C1124R.C1126id.tv_facebook);
        this.f780l = (TextView) findViewById(C1124R.C1126id.tv_apple);
        this.f782m = (TextView) findViewById(C1124R.C1126id.tv_googleplus);
        this.f784n = (TextView) findViewById(C1124R.C1126id.tv_taptap);
        this.f786o = (TextView) findViewById(C1124R.C1126id.tv_naver);
        this.f788p = (TextView) findViewById(C1124R.C1126id.tv_userNameCenter);
        this.f789q = (TextView) findViewById(C1124R.C1126id.tv_tomato_userNameCenter);
        this.f790r = (TextView) findViewById(C1124R.C1126id.tv_amountCenter);
        this.f792t = (TextView) findViewById(C1124R.C1126id.tv_twitter);
        this.f793u = (TextView) findViewById(C1124R.C1126id.tv_line);
        this.f794v = (TextView) findViewById(C1124R.C1126id.tv_vk);
        this.f795w = (TextView) findViewById(C1124R.C1126id.tv_play);
        this.f783m0 = C1124R.string.hw_accountCenter_bind;
        this.f785n0 = C1124R.string.hw_accountCenter_unbind;
        this.f787o0 = C1124R.string.hw_accountCenter_bind_ed;
        this.f764d.setOnClickListener(new C1199k());
        this.f768f.setOnClickListener(new C1208t());
        if (C1541g.m1887a().f1491n) {
            this.f766e.setVisibility(8);
        }
        this.f766e.setOnClickListener(new C1209u());
        this.f770g.setOnClickListener(new C1211v());
        if (!C1613e.f1639v) {
            m1087b(this.f757X, 8);
        } else {
            if (!C1538f.m1861l().mo12847i().isGuest()) {
                m1087b(this.f757X, 8);
            }
            this.f774i.setText(getString(C1124R.string.hw_login_status));
        }
        if (!TextUtils.isEmpty(C1128a.f601l)) {
            m1087b(this.f746M, 0);
            this.f744K.setText(C1128a.f601l);
            this.f745L.setOnClickListener(new C1212w());
        }
        if (C1541g.m1887a().f1482e) {
            m1087b(this.f752S, 8);
        }
        if (C1613e.f1627j) {
            m1087b(this.f752S, 8);
        }
        if (!C1613e.f1633p) {
            m1087b(this.f747N, 8);
        }
        if (!C1613e.f1634q) {
            m1087b(this.f749P, 8);
        }
        if (!C1613e.f1631n) {
            m1087b(this.f750Q, 8);
        }
        if (C1613e.f1632o) {
            m1087b(this.f751R, 0);
        } else {
            m1087b(this.f751R, 8);
        }
        if (TextUtils.isEmpty(C1128a.f600k) || !C1538f.m1861l().mo12843e().mo13107d().mo13092a()) {
            m1087b(this.f769f0, 8);
        }
        if (!C1613e.f1636s) {
            m1087b(this.f758Y, 8);
        }
        if (!C1613e.f1637t) {
            m1087b(this.f759Z, 8);
        }
        if (!C1613e.f1638u) {
            m1087b(this.f760a0, 8);
        }
        if (!C1613e.f1635r) {
            m1087b(this.f761b0, 8);
        }
        if (C1613e.f1640w) {
            this.f748O.setVisibility(0);
        }
        this.f798z.setOnClickListener(new C1213x());
        this.f796x.setOnClickListener(new C1214y());
        this.f797y.setOnClickListener(new C1215z());
        this.f734A.setOnClickListener(new C1189a0());
        this.f740G.setOnClickListener(new C1188a());
        this.f736C.setOnClickListener(new C1190b());
        this.f737D.setOnClickListener(new C1191c());
        this.f738E.setOnClickListener(new C1192d());
        this.f739F.setOnClickListener(new C1193e());
        this.f741H.setOnClickListener(new C1194f());
        this.f742I.setOnClickListener(new C1195g());
        this.f743J.setOnClickListener(new C1196h());
        this.f735B.setOnClickListener(new C1197i());
        if (!(this.f763c0 == null || (linearLayout = this.f765d0) == null || this.f767e0 == null || this.f769f0 == null || this.f771g0 == null || this.f773h0 == null)) {
            m1087b(linearLayout, 0);
            this.f765d0.setOnClickListener(new C1198j(this));
            m1087b(this.f767e0, 8);
            this.f767e0.setOnClickListener(new C1200l(this));
            this.f769f0.setOnClickListener(new C1201m());
            if (C1613e.f1628k != 1) {
                m1087b(this.f771g0, 8);
            }
            this.f771g0.setOnClickListener(new C1202n());
            if (!C1538f.m1861l().mo12843e().mo13107d().mo13098g()) {
                m1087b(this.f773h0, 8);
            }
            this.f773h0.setOnClickListener(new C1203o(this));
        }
        if (QGConstant.LOGIN_OPEN_TYPE_GOOGLE.equals(this.f779k0)) {
            this.f762c.setImageResource(C1124R.C1125drawable.hw_googleplus);
        } else if (QGConstant.LOGIN_OPEN_TYPE_FACEBOOK.equals(this.f779k0)) {
            this.f762c.setImageResource(C1124R.C1125drawable.hw_facebook);
        } else if (QGConstant.LOGIN_OPEN_TYPE_LINE.equals(this.f779k0)) {
            this.f762c.setImageResource(C1124R.C1125drawable.hw_line);
        } else {
            this.f762c.setImageResource(C1124R.C1125drawable.account_center_head_default);
        }
        if (C1541g.m1887a().f1486i) {
            this.f791s = (TextView) findViewById(C1124R.C1126id.tv_userId);
        }
        this.f775i0.setOnClickListener(new C1204p());
        if (C1538f.m1861l().mo12847i().isGuest() || C1128a.m798r().mo11999l().disableTrashAccount()) {
            this.f775i0.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m1092v() {
        QGUserBindInfo h = C1538f.m1861l().mo12846h();
        this.f777j0 = h;
        if (h == null) {
            this.f777j0 = new QGUserBindInfo();
        }
        QuickGameManager.getInstance().logout(C1128a.m798r().mo11968b());
        finish();
    }

    public void finish() {
        super.finish();
        C1128a.m798r().mo12000l(this);
    }

    /* renamed from: j */
    public void mo12123j() {
        mo12127s();
    }

    /* renamed from: m */
    public void mo12124m(String str) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Log.d("QGUserCenterActivity", "onActivityResult");
        super.onActivityResult(i, i2, intent);
        if (i != 506) {
            m1090t();
            if (C1128a.m798r().mo12001m() != null) {
                C1128a.m798r().mo12001m().onBindInfoChanged(this.f781l0, C1538f.m1861l().mo12835a(), this.f777j0);
            }
        } else if (i2 != -1) {
        } else {
            if (intent != null) {
                C1495e.f1410a.mo12764a(intent);
            } else {
                Log.e("QGUserCenterActivity", "onActivityResult data is null");
            }
        }
    }

    public void onBackPressed() {
        Log.e("QGUserCenterActivity", "onBackPressed");
        super.onBackPressed();
        if (C1128a.m798r().mo12001m() != null) {
            C1128a.m798r().mo12001m().onexitUserCenter();
        }
    }

    public void onCreate(Bundle bundle) {
        Log.d("QGUserCenterActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_accountcenter);
        if (C1538f.m1861l().mo12847i() == null) {
            Log.d("QGUserCenterActivity", "authToken is null");
            Toast.makeText(this, C1124R.string.hw_init_error, 0).show();
            finish();
            return;
        }
        Log.d("QGUserCenterActivity", "authToken is not null");
        this.f779k0 = C1538f.m1861l().mo12847i().getOpenType();
        this.f781l0 = C1538f.m1861l().mo12847i().getUid();
        m1091u();
        m1090t();
        ((C1673l) this.f1648b).mo13171c();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m1087b(this.f772h, 8);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m1087b(this.f772h, 0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUserInfoUpdateEvent(C1277a aVar) {
        if (aVar.f933a.equals("action.userinfo_update")) {
            m1090t();
        }
    }

    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    /* renamed from: s */
    public void mo12127s() {
        if (this.f790r == null) {
            return;
        }
        if (C1538f.m1861l().mo12848j() == null || C1538f.m1861l().mo12847i() == null) {
            m1087b(this.f756W, 8);
            return;
        }
        m1087b(this.f756W, 0);
        TextView textView = this.f788p;
        if (textView != null) {
            textView.setText(C1538f.m1861l().mo12847i().getUserName());
        }
        TextView textView2 = this.f789q;
        if (textView2 != null) {
            textView2.setText(this.f789q.getText() + C1538f.m1861l().mo12847i().getUserName());
        }
        Log.d("QGUserCenterActivity", "getwallet==" + C1538f.m1861l().mo12848j().getWallet());
        if (C1538f.m1861l().mo12848j().getWallet()) {
            TextView textView3 = this.f790r;
            textView3.setText(getString(C1124R.string.hw_accountCenter_account_balance) + C1538f.m1861l().mo12848j().getCurrency() + C1538f.m1861l().mo12848j().getAmount());
            m1087b(this.f790r, 0);
        }
    }

    /* renamed from: v */
    public void mo12128v(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1087b(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: r */
    public C1673l m1097r() {
        return new C1673l(this);
    }

    /* renamed from: a */
    public void mo12121a(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("cdkey");
            String optString2 = jSONObject.optString("uid");
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C1124R.style.AlertDialog);
            builder.setTitle(C1124R.string.hw_accountCenter_getCdKey);
            builder.setMessage(getString(C1124R.string.hw_accountCenter_cdkey_username_content) + optString2 + getString(C1124R.string.hw_accountCenter_cdkey_content) + optString);
            builder.setPositiveButton(C1124R.string.hw_accountCenter_cdkey_btn_copy, new C1206r(optString));
            builder.setNeutralButton(C1124R.string.hw_accountCenter_cdkey_btn_ok, new C1207s(this));
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
