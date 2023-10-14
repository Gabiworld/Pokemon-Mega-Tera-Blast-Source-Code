package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentTransaction;
import com.p010qg.eventbus.C0944c;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1648h;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.C1321e;
import com.quickgame.android.sdk.p034e.C1328f;
import com.quickgame.android.sdk.p034e.C1333g;
import com.quickgame.android.sdk.p034e.C1338h;
import com.quickgame.android.sdk.p034e.C1346j;
import com.quickgame.android.sdk.p043l.C1604g;
import org.json.JSONObject;

public class GuestTipsAfterPayActivity extends MvpBaseActivity<C1648h> implements C1648h.C1649a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1346j f725c;

    /* renamed from: d */
    private C1338h f726d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1321e f727e;

    /* renamed from: f */
    private C1328f f728f;

    /* renamed from: com.quickgame.android.sdk.activity.GuestTipsAfterPayActivity$a */
    class C1184a implements C1338h.C1343e {
        C1184a() {
        }

        /* renamed from: a */
        public void mo12112a() {
            C1346j unused = GuestTipsAfterPayActivity.this.f725c = null;
            GuestTipsAfterPayActivity.this.finish();
        }

        /* renamed from: b */
        public void mo12113b() {
            QGUserHolder qGUserHolder = new QGUserHolder();
            qGUserHolder.setStateCode(1);
            C1128a.m798r().mo11957a(qGUserHolder);
            GuestTipsAfterPayActivity.this.startActivity(new Intent(GuestTipsAfterPayActivity.this, HWAccountCenterActivity.class));
            C1128a.m798r().mo12000l(GuestTipsAfterPayActivity.this);
            GuestTipsAfterPayActivity.this.finish();
        }

        /* renamed from: c */
        public void mo12114c() {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.m1056a((C1346j) guestTipsAfterPayActivity.mo12109t());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.GuestTipsAfterPayActivity$d */
    class C1187d implements C1333g.C1337d {

        /* renamed from: a */
        final /* synthetic */ String f732a;

        C1187d(String str) {
            this.f732a = str;
        }

        /* renamed from: a */
        public void mo12120a() {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            C1321e unused = guestTipsAfterPayActivity.f727e = guestTipsAfterPayActivity.mo12108s();
            GuestTipsAfterPayActivity.this.f727e.mo12533a(this.f732a);
            GuestTipsAfterPayActivity guestTipsAfterPayActivity2 = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity2.m1056a((C1346j) guestTipsAfterPayActivity2.f727e);
        }
    }

    /* renamed from: v */
    private void m1061v() {
        int identifier = getResources().getIdentifier("sdk_after_pay_bg", "drawable", getPackageName());
        if (identifier != 0) {
            findViewById(C1124R.C1126id.ll_bg).setBackgroundResource(identifier);
        }
    }

    /* renamed from: a */
    public void mo12102a() {
    }

    /* renamed from: a */
    public void mo12103a(String str) {
    }

    /* renamed from: b */
    public void mo12106b(JSONObject jSONObject) {
    }

    /* renamed from: k */
    public void mo12107k() {
        Log.d("QGGuestTipsAfterPayAct", "account login success");
        C1604g.f1604a.mo13051a(this, getString(C1124R.string.sdk_bind_success));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1346j jVar = this.f725c;
        if (jVar != null) {
            jVar.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.qg_activity_main);
        m1061v();
        m1056a(mo12110u());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C1346j jVar = this.f725c;
            if (jVar != null && jVar.mo12494a()) {
                return true;
            }
            if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
                this.f725c = null;
                Log.d(GuestTipsAfterPayActivity.class.getName(), "login page finished");
                finish();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        mo12280p();
        super.onStop();
    }

    /* renamed from: s */
    public C1321e mo12108s() {
        if (this.f727e == null) {
            C1321e eVar = new C1321e();
            this.f727e = eVar;
            eVar.mo12532a((C1321e.C1327f) new C1186c());
        }
        return this.f727e;
    }

    /* renamed from: t */
    public C1328f mo12109t() {
        if (this.f728f == null) {
            C1328f c = C1328f.m1496c();
            this.f728f = c;
            c.mo12540a((C1328f.C1332d) new C1185b());
        }
        return this.f728f;
    }

    /* renamed from: u */
    public C1346j mo12110u() {
        if (this.f726d == null) {
            C1338h d = C1338h.m1509d();
            this.f726d = d;
            d.mo12548a((C1338h.C1343e) new C1184a());
        }
        return this.f726d;
    }

    /* renamed from: com.quickgame.android.sdk.activity.GuestTipsAfterPayActivity$b */
    class C1185b implements C1328f.C1332d {
        C1185b() {
        }

        /* renamed from: a */
        public void mo12116a(String str) {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.mo12282w(guestTipsAfterPayActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) GuestTipsAfterPayActivity.this.f1648b).mo13141a(str, 2);
        }

        /* renamed from: a */
        public void mo12115a() {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.m1056a(guestTipsAfterPayActivity.mo12110u());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.GuestTipsAfterPayActivity$c */
    class C1186c implements C1321e.C1327f {
        C1186c() {
        }

        /* renamed from: a */
        public void mo12119a(String str, String str2, String str3) {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.mo12282w(guestTipsAfterPayActivity.getString(C1124R.string.qg_msg_committing));
            ((C1648h) GuestTipsAfterPayActivity.this.f1648b).mo13143a(str, str2, str3);
        }

        /* renamed from: a */
        public void mo12117a() {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.m1056a(guestTipsAfterPayActivity.mo12110u());
        }

        /* renamed from: a */
        public void mo12118a(String str) {
            GuestTipsAfterPayActivity guestTipsAfterPayActivity = GuestTipsAfterPayActivity.this;
            guestTipsAfterPayActivity.mo12282w(guestTipsAfterPayActivity.getString(C1124R.string.hw_msg_email_code));
            ((C1648h) GuestTipsAfterPayActivity.this.f1648b).mo13141a(str, 2);
        }
    }

    /* renamed from: r */
    public C1648h m1069r() {
        return new C1648h(this);
    }

    /* renamed from: a */
    public static void m1054a(Activity activity) {
        activity.startActivity(new Intent(activity, GuestTipsAfterPayActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1056a(C1346j jVar) {
        Log.d("QGGuestTipsAfterPayAct", "switchFragment " + jVar.getClass().getName());
        this.f725c = jVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C1124R.C1126id.qg_main_content, jVar).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.addToBackStack((String) null);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
            Log.e("switchfragment", "commit fragment but destoryed");
        }
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

    /* renamed from: u */
    public void mo12111u(String str) {
        mo12281q();
        Log.w("QGGuestTipsAfterPayAct", "account login fail " + str);
        C1604g.f1604a.mo13052a(str);
        C0944c.m227c().mo11529b(new C1277a("action.login_failed"));
    }

    /* renamed from: a */
    public void mo12104a(String str, int i) {
        mo12281q();
        try {
            if (this.f725c instanceof C1321e) {
                C1333g.m1503a().show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
                return;
            }
            mo12280p();
            C1333g a = C1333g.m1503a();
            a.mo12544a((C1333g.C1337d) new C1187d(str));
            a.show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
        } catch (Exception e) {
            e.printStackTrace();
            C1604g.f1604a.mo13052a(getString(C1124R.string.qg_err_connect_service));
        }
    }
}
