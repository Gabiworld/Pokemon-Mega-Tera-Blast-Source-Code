package com.quickgame.android.sdk.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.model.QGUserHolder;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1660i;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p043l.C1604g;

public class AccountRecoverActivity extends MvpBaseActivity<C1660i> implements C1660i.C1662b {

    /* renamed from: c */
    public String f629c = "QGTrashAccountActivity";

    /* renamed from: com.quickgame.android.sdk.activity.AccountRecoverActivity$a */
    class C1147a implements View.OnClickListener {
        C1147a() {
        }

        public void onClick(View view) {
            Log.d(AccountRecoverActivity.this.f629c, "start request");
            AccountRecoverActivity.this.mo12282w("");
            ((C1660i) AccountRecoverActivity.this.f1648b).mo13160b();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.AccountRecoverActivity$b */
    class C1148b implements View.OnClickListener {
        C1148b() {
        }

        public void onClick(View view) {
            C1538f.m1861l().mo12849k();
            AccountRecoverActivity.this.finish();
            AccountRecoverActivity.this.m892s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m892s() {
        QGUserHolder qGUserHolder = new QGUserHolder();
        qGUserHolder.setStateCode(3);
        C1128a.m798r().mo11974c().onLoginFinished((QGUserData) null, qGUserHolder);
    }

    /* renamed from: t */
    private void m893t() {
        Log.d(this.f629c, "initView");
        findViewById(C1124R.C1126id.hw_btn_notice_trashed_ok).setOnClickListener(new C1147a());
        findViewById(C1124R.C1126id.hw_btn_notice_trashed_cancel).setOnClickListener(new C1148b());
    }

    /* renamed from: d */
    public void mo12022d() {
        mo12280p();
        finish();
        C1604g.f1604a.mo13052a(getString(C1124R.string.hw_account_recover_success_content));
        m892s();
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d(this.f629c, "onCreate");
        setContentView(C1124R.layout.qg_activity_cancel_trashed);
        m893t();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1538f.m1861l().mo12849k();
    }

    /* renamed from: q */
    public void mo12023q(String str) {
        mo12280p();
        String str2 = this.f629c;
        Log.d(str2, "recoverAccountFail " + str);
        finish();
        m892s();
    }

    /* renamed from: r */
    public C1660i m897r() {
        return new C1660i(this);
    }
}
