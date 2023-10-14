package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.share.internal.ShareConstants;
import com.p010qg.eventbus.C0944c;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.model.C1607a;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1648h;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.C1291a;
import com.quickgame.android.sdk.p034e.C1304c;
import com.quickgame.android.sdk.p034e.C1308d;
import com.quickgame.android.sdk.p034e.C1321e;
import com.quickgame.android.sdk.p034e.C1328f;
import com.quickgame.android.sdk.p034e.C1333g;
import com.quickgame.android.sdk.p034e.C1338h;
import com.quickgame.android.sdk.p034e.C1344i;
import com.quickgame.android.sdk.p034e.C1346j;
import com.quickgame.android.sdk.p034e.C1347k;
import com.quickgame.android.sdk.p034e.C1357l;
import com.quickgame.android.sdk.p034e.C1362m;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p038g.C1444a;
import com.quickgame.android.sdk.p038g.C1495e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1602e;
import com.quickgame.android.sdk.p043l.C1604g;
import com.quickgame.android.sdk.thirdlogin.C1695g;
import java.util.Map;
import org.json.JSONObject;

public class HWLoginActivity extends MvpBaseActivity<C1648h> implements C1648h.C1649a, C1308d.C1320l {

    /* renamed from: c */
    public boolean f824c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1308d f825d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1346j f826e;

    /* renamed from: f */
    private C1444a f827f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1347k f828g;

    /* renamed from: h */
    private C1357l f829h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1362m f830i;

    /* renamed from: j */
    private C1338h f831j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1321e f832k;

    /* renamed from: l */
    private C1328f f833l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f834m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1444a.C1445a f835n;

    /* renamed from: o */
    private boolean f836o = true;

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$a */
    class C1216a implements DialogInterface.OnDismissListener {
        C1216a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            HWLoginActivity.this.mo12162s();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$b */
    class C1217b implements Runnable {
        C1217b() {
        }

        public void run() {
            if (!(HWLoginActivity.this.f825d == null || HWLoginActivity.this.f825d.getDialog() == null || !HWLoginActivity.this.f825d.getDialog().isShowing())) {
                HWLoginActivity.this.f825d.dismissAllowingStateLoss();
            }
            C1338h v = HWLoginActivity.this.mo12165v();
            if (v.mo12550a((Activity) HWLoginActivity.this)) {
                Log.d("QGHWLoginActivity", "checkGuestByisQuest go to binding fragment");
                HWLoginActivity.this.mo12158b((C1346j) v);
                return;
            }
            HWLoginActivity.this.mo12162s();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$c */
    class C1218c implements C1333g.C1337d {

        /* renamed from: a */
        final /* synthetic */ String f839a;

        C1218c(String str) {
            this.f839a = str;
        }

        /* renamed from: a */
        public void mo12120a() {
            if (HWLoginActivity.this.f834m) {
                HWLoginActivity hWLoginActivity = HWLoginActivity.this;
                C1347k unused = hWLoginActivity.f828g = (C1347k) hWLoginActivity.mo12167x();
                HWLoginActivity.this.f828g.mo12560a(this.f839a);
                HWLoginActivity hWLoginActivity2 = HWLoginActivity.this;
                hWLoginActivity2.mo12158b((C1346j) hWLoginActivity2.f828g);
                return;
            }
            HWLoginActivity hWLoginActivity3 = HWLoginActivity.this;
            C1362m unused2 = hWLoginActivity3.f830i = (C1362m) hWLoginActivity3.mo12169z();
            HWLoginActivity.this.f830i.mo12575a(this.f839a);
            HWLoginActivity hWLoginActivity4 = HWLoginActivity.this;
            hWLoginActivity4.mo12158b((C1346j) hWLoginActivity4.f830i);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$d */
    class C1219d implements C1333g.C1337d {

        /* renamed from: a */
        final /* synthetic */ String f841a;

        C1219d(String str) {
            this.f841a = str;
        }

        /* renamed from: a */
        public void mo12120a() {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            C1321e unused = hWLoginActivity.f832k = hWLoginActivity.mo12163t();
            HWLoginActivity.this.f832k.mo12533a(this.f841a);
            HWLoginActivity hWLoginActivity2 = HWLoginActivity.this;
            hWLoginActivity2.mo12158b((C1346j) hWLoginActivity2.f832k);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$e */
    class C1220e implements DialogInterface.OnClickListener {
        C1220e(HWLoginActivity hWLoginActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$f */
    class C1221f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f843a;

        C1221f(String str) {
            this.f843a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C1648h) HWLoginActivity.this.f1648b).mo13148c(this.f843a);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$g */
    class C1222g implements Runnable {
        C1222g() {
        }

        public void run() {
            HWLoginActivity.this.m1103B();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$h */
    class C1223h implements C1426b<JSONObject> {
        C1223h(HWLoginActivity hWLoginActivity) {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String str = "";
            C1538f.m1861l().f1475l = optJSONObject == null ? str : optJSONObject.optString("agreement");
            C1538f l = C1538f.m1861l();
            if (optJSONObject != null) {
                str = optJSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
            }
            l.f1476m = str;
        }

        public void onFailed(C1427c cVar) {
            Log.e("QGHWLoginActivity", "get agreement error " + cVar.mo12663b());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$i */
    class C1224i implements DialogInterface.OnDismissListener {
        C1224i() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C1346j unused = HWLoginActivity.this.f826e = null;
            HWLoginActivity.this.finish();
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(3);
            qGUserHolder.setMsg(HWLoginActivity.this.getString(C1124R.string.hw_network_dialog_message));
            C1128a.m798r().mo11957a(qGUserHolder);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$k */
    class C1226k implements C1291a.C1292a {
        C1226k() {
        }

        /* renamed from: a */
        public void mo12188a() {
            C1346j unused = HWLoginActivity.this.f826e = null;
            HWLoginActivity.this.m1108G();
        }

        /* renamed from: b */
        public void mo12189b() {
            if (TextUtils.isEmpty(C1538f.m1861l().f1476m)) {
                return;
            }
            if (C1538f.m1861l().f1476m.startsWith("http")) {
                HWLoginActivity hWLoginActivity = HWLoginActivity.this;
                HWWebViewActivity.m1222b(hWLoginActivity, hWLoginActivity.getString(C1124R.string.qg_agreement_policy), C1538f.m1861l().f1476m);
                return;
            }
            HWLoginActivity hWLoginActivity2 = HWLoginActivity.this;
            HWWebViewActivity.m1221a(hWLoginActivity2, hWLoginActivity2.getString(C1124R.string.qg_agreement_policy), C1538f.m1861l().f1476m);
        }

        /* renamed from: c */
        public void mo12190c() {
            if (TextUtils.isEmpty(C1538f.m1861l().f1475l)) {
                return;
            }
            if (C1538f.m1861l().f1475l.startsWith("http")) {
                HWLoginActivity hWLoginActivity = HWLoginActivity.this;
                HWWebViewActivity.m1222b(hWLoginActivity, hWLoginActivity.getString(C1124R.string.qg_agreement_service), C1538f.m1861l().f1475l);
                return;
            }
            HWLoginActivity hWLoginActivity2 = HWLoginActivity.this;
            HWWebViewActivity.m1221a(hWLoginActivity2, hWLoginActivity2.getString(C1124R.string.qg_agreement_service), C1538f.m1861l().f1475l);
        }

        public void onCancel() {
            HWLoginActivity.this.finish();
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$o */
    class C1230o implements C1338h.C1343e {
        C1230o() {
        }

        /* renamed from: a */
        public void mo12112a() {
            HWLoginActivity.this.mo12162s();
        }

        /* renamed from: b */
        public void mo12113b() {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(1);
            C1128a.m798r().mo11957a(qGUserHolder);
            HWLoginActivity.this.startActivity(new Intent(HWLoginActivity.this, HWAccountCenterActivity.class));
            C1128a.m798r().mo12000l(HWLoginActivity.this);
            HWLoginActivity.this.finish();
        }

        /* renamed from: c */
        public void mo12114c() {
            if (C1613e.f1627j || C1541g.m1887a().f1485h) {
                QGUserHolder qGUserHolder = new QGUserHolder();
                qGUserHolder.setStateCode(1);
                C1128a.m798r().mo11957a(qGUserHolder);
                HWLoginActivity.this.startActivity(new Intent(HWLoginActivity.this, HWAccountCenterActivity.class));
                C1128a.m798r().mo12000l(HWLoginActivity.this);
                HWLoginActivity.this.finish();
                return;
            }
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12158b((C1346j) hWLoginActivity.mo12164u());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m1103B() {
        Log.d("QGHWLoginActivity", "checkGuestByisQuest");
        QGUserData i = C1538f.m1861l().mo12847i();
        if (!i.isGuest() || !C1613e.f1639v) {
            C1613e e = C1538f.m1861l().mo12843e();
            Log.d("QGHWLoginActivity", "isGuest: " + i.isGuest() + ",showBind: " + e.mo13107d().mo13095d());
            if (!i.isGuest() || !e.mo13107d().mo13095d()) {
                mo12162s();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new C1217b(), 200);
            }
        } else {
            mo12162s();
        }
    }

    /* renamed from: C */
    private void m1104C() {
        C1428d.m1703a("/v1/system/getAgreement", (Map<String, Object>) null, (C1426b<JSONObject>) new C1223h(this));
    }

    /* renamed from: D */
    private void m1105D() {
        mo12156A();
    }

    /* renamed from: E */
    private void m1106E() {
        this.f835n = new C1225j();
    }

    /* renamed from: F */
    private void m1107F() {
        int identifier = getResources().getIdentifier("sdk_login_bg", "drawable", getPackageName());
        if (identifier != 0) {
            findViewById(C1124R.C1126id.ll_bg).setBackgroundResource(identifier);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m1108G() {
        C1607a b;
        boolean a = C1602e.m2077a(this);
        if (!C1128a.m798r().mo11999l().showServicesAndPrivacyPolicy() || a) {
            if (!C1128a.m798r().mo11999l().noAutoLogin() && this.f836o && (b = C1609b.m2099d().mo13085b()) != null) {
                String b2 = b.mo13078b();
                String c = b.mo13080c();
                if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(c)) {
                    m1116a(b2, c);
                    return;
                }
            }
            mo12158b(mo12166w());
            return;
        }
        m1104C();
        this.f836o = false;
        C1291a aVar = new C1291a();
        aVar.mo12504a((C1291a.C1292a) new C1226k());
        mo12158b((C1346j) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m1109H() {
        C1613e e = C1538f.m1861l().mo12843e();
        Log.d("QGHWLoginActivity", "isGuestShowBind()" + e.mo13107d().mo13095d());
        if (e != null && e.mo13107d().mo13095d()) {
            mo12158b((C1346j) mo12165v());
        }
    }

    /* renamed from: A */
    public void mo12156A() {
        Log.d("QGHWLoginActivity", "loginRole");
        int d = C1609b.m2099d().mo13085b().mo13081d();
        String userName = C1538f.m1861l().mo12847i().getUserName();
        if (C1538f.m1861l().mo12847i().isGuest()) {
            userName = getString(C1124R.string.hw_guest);
        }
        m1119b(userName, d);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1346j jVar = this.f826e;
        if (jVar != null) {
            jVar.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.qg_activity_main);
        m1107F();
        this.f824c = 2 == C1538f.m1861l().mo12843e().mo13107d().mo13093b();
        m1106E();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        boolean z = connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
        this.f836o = getIntent().getBooleanExtra("autologin", true);
        if (z) {
            m1108G();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(C1124R.string.hw_network_dialog_title));
            builder.setMessage(getString(C1124R.string.hw_network_dialog_message));
            builder.setPositiveButton(getString(C1124R.string.hw_network_dialog_ok), (DialogInterface.OnClickListener) null);
            builder.setOnDismissListener(new C1224i());
            builder.show();
        }
        if (C1613e.f1625h == 1) {
            Log.d("QGHWLoginActivity", "serverInfo has set.");
            if (C1304c.m1448a(this, "ShowAnnouncement", false)) {
                Log.d("QGHWLoginActivity", "local server boolean is true");
                mo12158b((C1346j) C1304c.m1450b());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C1346j jVar = this.f826e;
            if (jVar != null && jVar.mo12494a()) {
                return true;
            }
            if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
                this.f826e = null;
                Log.d(HWLoginActivity.class.getName(), "login page finished");
                finish();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C1308d dVar = this.f825d;
        if (!(dVar == null || dVar.getDialog() == null || !this.f825d.getDialog().isShowing())) {
            this.f825d.dismissAllowingStateLoss();
        }
        mo12280p();
        super.onStop();
    }

    /* renamed from: w */
    public C1346j mo12166w() {
        if (this.f827f == null) {
            C1444a a = C1495e.f1410a.mo12763a();
            this.f827f = a;
            a.mo12722a(this.f835n);
        }
        return this.f827f;
    }

    /* renamed from: x */
    public C1346j mo12167x() {
        if (this.f828g == null) {
            C1347k d = C1347k.m1531d();
            this.f828g = d;
            d.mo12559a((C1347k.C1356i) new C1227l());
        }
        C1347k kVar = this.f828g;
        kVar.f1090o = true;
        return kVar;
    }

    /* renamed from: y */
    public C1346j mo12168y() {
        if (this.f829h == null) {
            C1357l c = C1357l.m1547c();
            this.f829h = c;
            c.mo12570a((C1357l.C1361d) new C1228m());
        }
        return this.f829h;
    }

    /* renamed from: z */
    public C1346j mo12169z() {
        if (this.f830i == null) {
            C1362m c = C1362m.m1558c();
            this.f830i = c;
            c.mo12574a((C1362m.C1368f) new C1229n());
        }
        return this.f830i;
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$j */
    class C1225j implements C1444a.C1445a {
        C1225j() {
        }

        /* renamed from: a */
        public void mo12179a(String str, String str2) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_login));
            ((C1648h) HWLoginActivity.this.f1648b).mo13142a(str, str2);
        }

        /* renamed from: b */
        public void mo12182b(String str) {
            Log.d("QGHWLoginActivity", "onCDKeyClicked");
            ((C1648h) HWLoginActivity.this.f1648b).mo13146b(str);
        }

        /* renamed from: c */
        public void mo12183c() {
        }

        /* renamed from: d */
        public void mo12184d() {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12158b(hWLoginActivity.mo12167x());
        }

        /* renamed from: e */
        public String mo12185e() {
            C1607a b = C1609b.m2099d().mo13085b();
            return (b.mo13074a() == null || b.mo13074a().size() == 0) ? "" : b.mo13074a().get(0);
        }

        /* renamed from: f */
        public void mo12186f() {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_login));
            ((C1648h) HWLoginActivity.this.f1648b).mo13145b();
        }

        /* renamed from: g */
        public void mo12187g() {
            if (HWLoginActivity.this.getSupportFragmentManager().getBackStackEntryCount() > 1) {
                HWLoginActivity.this.getSupportFragmentManager().popBackStack();
            }
            HWLoginActivity.this.finish();
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(2);
            C1128a.m798r().mo11957a(qGUserHolder);
        }

        /* renamed from: a */
        public void mo12177a() {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12158b(hWLoginActivity.mo12168y());
        }

        /* renamed from: b */
        public void mo12181b() {
            C1444a b = C1495e.f1410a.mo12766b();
            b.mo12722a(HWLoginActivity.this.f835n);
            HWLoginActivity.this.mo12158b((C1346j) b);
        }

        /* renamed from: a */
        public void mo12178a(String str) {
            C1604g.f1604a.mo13051a(HWLoginActivity.this, str);
        }

        /* renamed from: a */
        public void mo12180a(String str, String str2, String str3, String str4, String str5) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_login));
            ((C1648h) HWLoginActivity.this.f1648b).mo13144a(str5, str, str2, str3, str4);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$l */
    class C1227l implements C1347k.C1356i {
        C1227l() {
        }

        /* renamed from: a */
        public void mo12194a(String str, String str2, String str3) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_auto_reg));
            ((C1648h) HWLoginActivity.this.f1648b).mo13147b(str, str2, str3);
        }

        /* renamed from: a */
        public void mo12193a(String str) {
            boolean unused = HWLoginActivity.this.f834m = true;
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) HWLoginActivity.this.f1648b).mo13141a(str, 1);
        }

        /* renamed from: a */
        public void mo12192a() {
            HWLoginActivity.this.getSupportFragmentManager().popBackStack();
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12157a(hWLoginActivity.mo12166w());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$m */
    class C1228m implements C1357l.C1361d {
        C1228m() {
        }

        /* renamed from: a */
        public void mo12196a(String str) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) HWLoginActivity.this.f1648b).mo13141a(str, 4);
        }

        /* renamed from: a */
        public void mo12195a() {
            HWLoginActivity.this.getSupportFragmentManager().popBackStack();
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12157a(hWLoginActivity.mo12166w());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$n */
    class C1229n implements C1362m.C1368f {
        C1229n() {
        }

        /* renamed from: a */
        public void mo12199a(String str, String str2, String str3) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_committing));
            ((C1648h) HWLoginActivity.this.f1648b).mo13149c(str, str2, str3);
        }

        /* renamed from: a */
        public void mo12198a(String str) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) HWLoginActivity.this.f1648b).mo13141a(str, 4);
        }

        /* renamed from: a */
        public void mo12197a() {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12158b(hWLoginActivity.mo12166w());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$p */
    class C1231p implements C1328f.C1332d {
        C1231p() {
        }

        /* renamed from: a */
        public void mo12116a(String str) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) HWLoginActivity.this.f1648b).mo13141a(str, 2);
        }

        /* renamed from: a */
        public void mo12115a() {
            HWLoginActivity.this.m1109H();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWLoginActivity$q */
    class C1232q implements C1321e.C1327f {
        C1232q() {
        }

        /* renamed from: a */
        public void mo12119a(String str, String str2, String str3) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.qg_msg_committing));
            ((C1648h) HWLoginActivity.this.f1648b).mo13143a(str, str2, str3);
        }

        /* renamed from: a */
        public void mo12117a() {
            HWLoginActivity.this.m1109H();
        }

        /* renamed from: a */
        public void mo12118a(String str) {
            HWLoginActivity hWLoginActivity = HWLoginActivity.this;
            hWLoginActivity.mo12282w(hWLoginActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) HWLoginActivity.this.f1648b).mo13141a(str, 2);
        }
    }

    /* renamed from: b */
    private void m1119b(String str, int i) {
        mo12281q();
        if (i != 11) {
            switch (i) {
                case 14:
                    m1103B();
                    return;
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    if (C1538f.m1861l().mo12847i().getIsTrash() == 1) {
                        Log.d("QGHWLoginActivity", "account is trash");
                        mo12162s();
                        return;
                    }
                    mo12280p();
                    C1344i a = C1344i.m1519a(Integer.valueOf(i), str);
                    a.mo12556a(new C1216a());
                    a.show(getSupportFragmentManager(), str);
                    return;
            }
        }
        C1308d dVar = this.f825d;
        if (dVar != null) {
            dVar.mo12525a();
        } else {
            m1103B();
        }
    }

    /* renamed from: c */
    public void mo12159c() {
        mo12158b(mo12166w());
    }

    /* renamed from: e */
    public void mo12160e() {
        new Handler(Looper.getMainLooper()).post(new C1222g());
    }

    /* renamed from: k */
    public void mo12107k() {
        Log.d("QGHWLoginActivity", "account login success");
        mo12156A();
    }

    /* renamed from: o */
    public void mo12161o(String str) {
        ((C1648h) this.f1648b).mo13140a(str);
    }

    /* renamed from: s */
    public void mo12162s() {
        Log.d("QGHWLoginActivity", "enterGame");
        if (C1613e.f1635r && C1128a.m798r().mo12003n().isBindPlay()) {
            C1695g.m2347b((Activity) this).mo13236f();
        }
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(1);
        C1128a.m798r().mo11957a(qGUserHolder);
        this.f826e = null;
        if (this.f824c && C1538f.m1861l().mo12839c().size() > 0) {
            this.f824c = false;
            Intent intent = new Intent(this, NoticeActivity.class);
            intent.addFlags(268435456);
            startActivity(intent);
        }
        finish();
    }

    /* renamed from: t */
    public C1321e mo12163t() {
        if (this.f832k == null) {
            C1321e eVar = new C1321e();
            this.f832k = eVar;
            eVar.mo12532a((C1321e.C1327f) new C1232q());
        }
        return this.f832k;
    }

    /* renamed from: u */
    public C1328f mo12164u() {
        if (this.f833l == null) {
            C1328f c = C1328f.m1496c();
            this.f833l = c;
            c.mo12540a((C1328f.C1332d) new C1231p());
        }
        return this.f833l;
    }

    /* renamed from: v */
    public C1338h mo12165v() {
        if (this.f831j == null) {
            C1338h d = C1338h.m1509d();
            this.f831j = d;
            d.mo12548a((C1338h.C1343e) new C1230o());
        }
        if (C1541g.m1887a().f1485h) {
            this.f831j.mo12551b();
        }
        return this.f831j;
    }

    /* renamed from: r */
    public C1648h m1154r() {
        return new C1648h(this);
    }

    /* renamed from: a */
    public static void m1115a(Activity activity, boolean z) {
        Intent intent = new Intent(activity, HWLoginActivity.class);
        intent.putExtra("autologin", z);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    private void m1116a(String str, String str2) {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !isDestroyed()) {
            this.f825d = C1308d.m1457a(str, str2, (C1308d.C1320l) this);
            this.f825d.show(getSupportFragmentManager().beginTransaction(), "");
        }
    }

    /* renamed from: a */
    public void mo12157a(C1346j jVar) {
        this.f826e = jVar;
    }

    /* renamed from: a */
    public void mo12102a() {
        m1105D();
    }

    /* renamed from: a */
    public void mo12103a(String str) {
        m1140y(str);
    }

    /* renamed from: u */
    public void mo12111u(String str) {
        mo12281q();
        Log.w("QGHWLoginActivity", "account login fail " + str);
        C1604g.f1604a.mo13052a(str);
        C0944c.m227c().mo11529b(new C1277a("action.login_failed"));
    }

    /* renamed from: y */
    private void m1140y(String str) {
        C1308d dVar = this.f825d;
        if (!(dVar == null || dVar.getDialog() == null || !this.f825d.getDialog().isShowing())) {
            this.f825d.dismissAllowingStateLoss();
        }
        mo12158b(mo12166w());
        C1604g.f1604a.mo13052a(str);
    }

    /* renamed from: a */
    public void mo12105a(String str, int i, String str2) {
        mo12281q();
        if (i == 2 || i == 4) {
            try {
                C1604g.f1604a.mo13052a(str2);
            } catch (Exception e) {
                e.printStackTrace();
                C1604g.f1604a.mo13052a(getString(C1124R.string.qg_err_connect_service));
            }
        }
    }

    /* renamed from: a */
    public void mo12104a(String str, int i) {
        mo12281q();
        if (i != 2) {
            if (i == 4) {
                try {
                    if (this.f826e instanceof C1362m) {
                        C1333g.m1503a().show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
                        return;
                    }
                    mo12280p();
                    C1333g a = C1333g.m1503a();
                    a.mo12544a((C1333g.C1337d) new C1218c(str));
                    a.show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
                } catch (Exception e) {
                    e.printStackTrace();
                    C1604g.f1604a.mo13052a(getString(C1124R.string.qg_err_connect_service));
                }
            }
        } else if (this.f826e instanceof C1321e) {
            C1333g.m1503a().show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
        } else {
            mo12280p();
            C1333g a2 = C1333g.m1503a();
            a2.mo12544a((C1333g.C1337d) new C1219d(str));
            a2.show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
        }
    }

    /* renamed from: b */
    public void mo12158b(C1346j jVar) {
        Log.d("QGHWLoginActivity", jVar.getClass().getName());
        this.f826e = jVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C1124R.C1126id.qg_main_content, jVar).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.addToBackStack((String) null);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            Log.e("QGHWLoginActivity", "commit fragment ex " + e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo12106b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            Log.d("QGHWLoginActivity", "check register data: " + optJSONObject.toString());
            if (optJSONObject.has("isReged")) {
                int i = optJSONObject.getInt("isReged");
                String string = optJSONObject.getString("cdkey");
                Log.d("QGHWLoginActivity", "check register cdkey:" + string);
                if (i == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this, C1124R.style.AlertDialog);
                    builder.setMessage("使用迁移码会覆盖游客账号信息,确定继续吗？");
                    builder.setPositiveButton(C1124R.string.hw_login_CdKeyCancel, new C1220e(this));
                    builder.setNeutralButton(C1124R.string.hw_login_CdKeyOk, new C1221f(string));
                    AlertDialog create = builder.create();
                    create.setCanceledOnTouchOutside(false);
                    create.show();
                    return;
                }
                ((C1648h) this.f1648b).mo13148c(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
