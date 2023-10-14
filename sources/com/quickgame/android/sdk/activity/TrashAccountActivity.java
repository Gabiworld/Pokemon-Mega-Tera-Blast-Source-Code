package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1668k;
import com.quickgame.android.sdk.p043l.C1604g;

public class TrashAccountActivity extends MvpBaseActivity<C1668k> implements C1668k.C1670b {

    /* renamed from: c */
    public String f927c = "QGTrashAccountActivity";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f928d = false;

    /* renamed from: com.quickgame.android.sdk.activity.TrashAccountActivity$a */
    class C1266a implements View.OnClickListener {
        C1266a() {
        }

        public void onClick(View view) {
            TrashAccountActivity.this.mo12282w("");
            Log.d(TrashAccountActivity.this.f927c, "请求cUserTrash接口");
            if (TrashAccountActivity.this.f928d) {
                ((C1668k) TrashAccountActivity.this.f1648b).mo13167c();
            } else {
                ((C1668k) TrashAccountActivity.this.f1648b).mo13166b();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.TrashAccountActivity$b */
    class C1267b implements View.OnClickListener {
        C1267b() {
        }

        public void onClick(View view) {
            TrashAccountActivity.this.finish();
        }
    }

    /* renamed from: h */
    public void mo12272h() {
        mo12280p();
        if (this.f928d) {
            C1604g.f1604a.mo13051a(this, getString(C1124R.string.hw_account_trash_success_content_2));
        } else {
            C1604g.f1604a.mo13051a(this, getString(C1124R.string.hw_account_trash_success_content_1));
        }
        C1128a.m798r().mo11982e((Activity) this);
        finish();
    }

    /* renamed from: i */
    public void mo12273i(String str) {
        String str2 = this.f927c;
        Log.d(str2, "trashAccountFail " + str);
        mo12280p();
        finish();
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.qg_activity_trash_account);
        this.f928d = getIntent().getBooleanExtra("type", false);
        mo12274s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo12274s() {
        Log.d(this.f927c, "initView");
        ((Button) findViewById(C1124R.C1126id.hw_btn_destroy_account_yes)).setOnClickListener(new C1266a());
        ((Button) findViewById(C1124R.C1126id.hw_btn_destroy_account_mo)).setOnClickListener(new C1267b());
    }

    /* renamed from: a */
    public static void m1299a(Activity activity, boolean z) {
        Intent intent = new Intent(activity, TrashAccountActivity.class);
        intent.putExtra("type", z);
        activity.startActivity(intent);
    }

    /* renamed from: r */
    public C1668k m1306r() {
        return new C1668k(this);
    }
}
