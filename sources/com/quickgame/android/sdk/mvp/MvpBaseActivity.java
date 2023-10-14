package com.quickgame.android.sdk.mvp;

import android.os.Bundle;
import com.quickgame.android.sdk.base.BaseActivity;
import com.quickgame.android.sdk.mvp.C1618a;

public abstract class MvpBaseActivity<P extends C1618a> extends BaseActivity {
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public P f1648b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1648b = mo12024r();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        P p = this.f1648b;
        if (p != null) {
            p.mo13109a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract P mo12024r();
}
