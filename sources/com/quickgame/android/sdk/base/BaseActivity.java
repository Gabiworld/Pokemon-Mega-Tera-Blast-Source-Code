package com.quickgame.android.sdk.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.p010qg.eventbus.C0944c;
import com.p010qg.eventbus.Subscribe;
import com.p010qg.eventbus.ThreadMode;
import com.quickgame.android.sdk.p027c.C1277a;
import com.quickgame.android.sdk.p034e.C1383q;
import com.quickgame.android.sdk.p043l.C1605h;

public abstract class BaseActivity extends AppCompatActivity {

    /* renamed from: a */
    protected C1383q f931a;

    /* renamed from: com.quickgame.android.sdk.base.BaseActivity$a */
    class C1272a implements Runnable {
        C1272a() {
        }

        public void run() {
            if (BaseActivity.this.f931a.getDialog() != null && BaseActivity.this.f931a.getDialog().isShowing()) {
                BaseActivity.this.f931a.dismissAllowingStateLoss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        C1605h.m2087a(this);
        this.f931a = C1383q.m1585a();
        C0944c.m227c().mo11530c(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C0944c.m227c().mo11527a((Object) this)) {
            C0944c.m227c().mo11531d(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(C1277a aVar) {
        if (aVar.f933a.equals("action.logout")) {
            finish();
        }
    }

    /* renamed from: p */
    public void mo12280p() {
        if (this.f931a.getDialog() != null && this.f931a.getDialog().isShowing()) {
            this.f931a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: q */
    public void mo12281q() {
        new Handler(Looper.getMainLooper()).postDelayed(new C1272a(), 1000);
    }

    /* renamed from: w */
    public void mo12282w(String str) {
        if (this.f931a.getDialog() == null || !this.f931a.getDialog().isShowing()) {
            this.f931a.show(getSupportFragmentManager(), str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12283x(String str) {
        Toast.makeText(this, str, 1).show();
    }
}
