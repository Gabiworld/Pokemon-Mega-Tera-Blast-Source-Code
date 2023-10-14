package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1664j;
import com.quickgame.android.sdk.p039h.C1538f;
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

public class BindThirdLoginActivity extends MvpBaseActivity<C1664j> implements C1664j.C1665a {

    /* renamed from: c */
    private C1684b f642c = null;

    /* renamed from: d */
    private C1687c f643d = null;

    /* renamed from: e */
    private C1693f f644e = null;

    /* renamed from: f */
    private TwitterManager f645f = null;

    /* renamed from: g */
    private C1691e f646g = null;

    /* renamed from: h */
    private C1711j f647h = null;

    /* renamed from: i */
    private C1695g f648i = null;

    /* renamed from: j */
    private C1708h f649j = null;

    /* renamed from: k */
    private C1710i f650k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f651l = "";

    /* renamed from: com.quickgame.android.sdk.activity.BindThirdLoginActivity$b */
    class C1155b implements DialogInterface.OnClickListener {
        C1155b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.d("QGBindThirdLoginAct", "unbind " + BindThirdLoginActivity.this.f651l);
            BindThirdLoginActivity.this.mo12282w("");
            ((C1664j) BindThirdLoginActivity.this.f1648b).mo13162a("", BindThirdLoginActivity.this.f651l);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindThirdLoginActivity$c */
    class C1156c implements DialogInterface.OnClickListener {
        C1156c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BindThirdLoginActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindThirdLoginActivity$d */
    class C1157d implements DialogInterface.OnDismissListener {
        C1157d() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            BindThirdLoginActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindThirdLoginActivity$e */
    class C1158e implements DialogInterface.OnDismissListener {
        C1158e() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            BindThirdLoginActivity.this.finish();
        }
    }

    /* renamed from: A */
    private void m915A() {
        Log.d("QGBindThirdLoginAct", "bindVk");
        C1711j jVar = new C1711j();
        this.f647h = jVar;
        jVar.mo13261a(this, this.f650k);
        this.f647h.mo13260a((Activity) this);
    }

    /* renamed from: s */
    private void m919s() {
        Log.d("QGBindThirdLoginAct", "bindApple");
        C1678a aVar = new C1678a();
        aVar.mo13186a((C1690d) this.f650k);
        aVar.mo13185a((Activity) this);
    }

    /* renamed from: t */
    private void m920t() {
        C1684b bVar = new C1684b();
        this.f642c = bVar;
        bVar.mo13196a((C1690d) this.f650k);
        this.f642c.mo13195a((Activity) this);
    }

    /* renamed from: u */
    private void m921u() {
        Log.d("QGBindThirdLoginAct", "bindGoogle");
        C1687c cVar = new C1687c();
        this.f643d = cVar;
        cVar.mo13201a(this, this.f650k);
        this.f643d.mo13200a((Activity) this);
    }

    /* renamed from: v */
    private void m922v() {
        Log.d("QGBindThirdLoginAct", "bindLine");
        C1691e eVar = new C1691e();
        this.f646g = eVar;
        eVar.mo13210a((Activity) this, (C1690d) this.f650k);
        this.f646g.mo13214b(this);
    }

    /* renamed from: w */
    private void m923w() {
        Log.d("QGBindThirdLoginAct", "bindNaver");
        C1693f fVar = new C1693f();
        this.f644e = fVar;
        fVar.mo13216a(this, this.f650k);
        this.f644e.mo13218b(this);
    }

    /* renamed from: x */
    private void m924x() {
        Log.d("QGBindThirdLoginAct", "bindPlayGame");
        C1695g gVar = new C1695g(this);
        this.f648i = gVar;
        gVar.mo13227a((C1690d) this.f650k);
        this.f648i.mo13230b();
    }

    /* renamed from: y */
    private void m925y() {
        Log.d("QGBindThirdLoginAct", "bindTapTap");
        C1708h hVar = C1708h.f1755b;
        this.f649j = hVar;
        hVar.mo13254a(this, this.f650k);
        this.f649j.mo13253a(this);
    }

    /* renamed from: z */
    private void m927z() {
        Log.d("QGBindThirdLoginAct", "bindTwitter");
        TwitterManager twitterManager = new TwitterManager();
        this.f645f = twitterManager;
        twitterManager.mo13177a(this, this.f650k);
        this.f645f.mo13181b(this);
    }

    /* renamed from: e */
    public void mo12039e(String str) {
        mo12280p();
        m926y(str);
    }

    /* renamed from: g */
    public void mo12040g(String str) {
        Log.d("QGBindThirdLoginAct", "bindThirdLoginFailed");
        mo12280p();
        m926y(str);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1684b bVar = this.f642c;
        if (bVar != null) {
            bVar.mo13194a(i, i2, intent);
        }
        C1687c cVar = this.f643d;
        if (cVar != null) {
            cVar.mo13199a(i, i2, intent);
        }
        TwitterManager twitterManager = this.f645f;
        if (twitterManager != null) {
            twitterManager.mo13175a(i, i2, intent);
        }
        C1711j jVar = this.f647h;
        if (jVar != null) {
            jVar.mo13259a(i, i2, intent);
        }
        C1691e eVar = this.f646g;
        if (eVar != null) {
            eVar.mo13208a(i, i2, intent);
        }
        C1695g gVar = this.f648i;
        if (gVar != null) {
            gVar.mo13223a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_bind_facebook);
        this.f650k = new C1154a();
        Intent intent = getIntent();
        QGUserBindInfo h = C1538f.m1861l().mo12846h();
        String stringExtra = intent.getStringExtra("type");
        this.f651l = intent.getStringExtra("openType");
        if ("bind".equals(stringExtra)) {
            if (QGConstant.LOGIN_OPEN_TYPE_FACEBOOK.equals(this.f651l)) {
                m920t();
            } else if (QGConstant.LOGIN_OPEN_TYPE_APPLE.equals(this.f651l)) {
                m919s();
            } else if (QGConstant.LOGIN_OPEN_TYPE_GOOGLE.equals(this.f651l)) {
                m921u();
            } else if (QGConstant.LOGIN_OPEN_TYPE_NAVER.equals(this.f651l)) {
                m923w();
            } else if (QGConstant.LOGIN_OPEN_TYPE_TWITTER.equals(this.f651l)) {
                m927z();
            } else if (QGConstant.LOGIN_OPEN_TYPE_LINE.equals(this.f651l)) {
                m922v();
            } else if (QGConstant.LOGIN_OPEN_TYPE_VK.equals(this.f651l)) {
                m915A();
            } else if (QGConstant.LOGIN_OPEN_TYPE_PLAYGAME.equals(this.f651l)) {
                m924x();
            } else if (QGConstant.LOGIN_OPEN_TYPE_TAPTAP.equals(this.f651l)) {
                m925y();
            }
        } else if ("unbind".equals(stringExtra)) {
            Log.d("QGBindThirdLoginAct", "unbind");
            if (h == null) {
                finish();
                Log.d("QGBindThirdLoginAct", "bindInfo is null");
            } else if (!C1538f.m1861l().mo12847i().isGuest()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(C1124R.string.hw_accountCenter_warm);
                builder.setMessage(C1124R.string.hw_accountCenter_msg_isUnbind);
                builder.setPositiveButton(C1124R.string.hw_accountCenter_warm_sure, new C1155b());
                builder.setNegativeButton(C1124R.string.hw_accountCenter_warm_cancel, new C1156c());
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } else {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setTitle(C1124R.string.hw_accountCenter_warm);
                builder2.setMessage(C1124R.string.hw_accountCenter_msg_bindOther);
                builder2.setPositiveButton(C1124R.string.hw_network_dialog_ok, (DialogInterface.OnClickListener) null);
                AlertDialog create2 = builder2.create();
                create2.setOnDismissListener(new C1157d());
                create2.setCanceledOnTouchOutside(false);
                create2.show();
            }
        } else {
            finish();
            Log.d("QGBindThirdLoginAct", "no this function");
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindThirdLoginActivity$a */
    class C1154a extends C1710i {
        C1154a() {
        }

        /* renamed from: a */
        public void mo12042a(String str, String str2, String str3, String str4, String str5) {
            BindThirdLoginActivity bindThirdLoginActivity = BindThirdLoginActivity.this;
            bindThirdLoginActivity.mo12282w(bindThirdLoginActivity.getString(C1124R.string.qg_msg_committing));
            ((C1664j) BindThirdLoginActivity.this.f1648b).mo13163a(str, str2, str5, str3, str4);
        }

        /* renamed from: b */
        public void mo12043b(String str) {
            BindThirdLoginActivity.this.finish();
        }

        public void onLoginCancel() {
            BindThirdLoginActivity.this.finish();
        }

        /* renamed from: a */
        public void mo12021a() {
            BindThirdLoginActivity.this.finish();
        }
    }

    /* renamed from: c */
    public void mo12038c(String str) {
        mo12280p();
        try {
            C1538f.m1861l().mo12834a(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.d("QGBindThirdLoginAct", "bind completed");
            finish();
        }
    }

    /* renamed from: r */
    public C1664j m932r() {
        return new C1664j(this);
    }

    /* renamed from: t */
    public void mo12041t(String str) {
        mo12280p();
        try {
            C1538f.m1861l().mo12834a(true);
            C1687c cVar = this.f643d;
            if (cVar != null) {
                cVar.mo13198a();
            }
            C1684b bVar = this.f642c;
            if (bVar != null) {
                bVar.mo13193a();
            }
            TwitterManager twitterManager = this.f645f;
            if (twitterManager != null) {
                twitterManager.mo13174a();
            }
            C1691e eVar = this.f646g;
            if (eVar != null) {
                eVar.mo13207a();
            }
            C1693f fVar = this.f644e;
            if (fVar != null) {
                fVar.mo13219c(this);
            }
            C1711j jVar = this.f647h;
            if (jVar != null) {
                jVar.mo13258a();
            }
            C1695g gVar = this.f648i;
            if (gVar != null) {
                gVar.mo13233c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            Log.d("QGBindThirdLoginAct", "unbind completed");
            finish();
            throw th;
        }
        Log.d("QGBindThirdLoginAct", "unbind completed");
        finish();
    }

    /* renamed from: y */
    private void m926y(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(C1124R.string.hw_gameTips_title);
        builder.setMessage(str);
        builder.setPositiveButton(C1124R.string.hw_network_dialog_ok, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new C1158e());
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
