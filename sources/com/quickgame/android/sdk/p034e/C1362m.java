package com.quickgame.android.sdk.p034e;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p034e.p035r.C1386a;

/* renamed from: com.quickgame.android.sdk.e.m */
public class C1362m extends C1346j {

    /* renamed from: a */
    private View f1107a = null;

    /* renamed from: b */
    private FrameLayout f1108b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1386a f1109c = null;

    /* renamed from: d */
    private TextView f1110d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f1111e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1112f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1368f f1113g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public CountDownTimer f1114h = null;

    /* renamed from: com.quickgame.android.sdk.e.m$a */
    class C1363a implements View.OnKeyListener {
        C1363a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1362m.this.f1113g.mo12197a();
            if (C1362m.this.f1114h == null) {
                return true;
            }
            C1362m.this.f1114h.cancel();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.m$b */
    class C1364b implements View.OnClickListener {
        C1364b() {
        }

        public void onClick(View view) {
            C1362m.this.f1113g.mo12197a();
            if (C1362m.this.f1114h != null) {
                C1362m.this.f1114h.cancel();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.m$c */
    class C1365c implements View.OnClickListener {
        C1365c() {
        }

        public void onClick(View view) {
            String a = C1362m.this.f1109c.mo12597a();
            String b = C1362m.this.f1109c.mo12599b();
            if (("".equals(b) ^ true) && (!"".equals(a))) {
                C1362m.this.f1113g.mo12199a(C1362m.this.f1112f, a, b);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.m$d */
    class C1366d implements View.OnClickListener {
        C1366d() {
        }

        public void onClick(View view) {
            C1362m.this.f1113g.mo12198a(C1362m.this.f1112f);
            C1362m.this.m1554a(60);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.m$e */
    class C1367e extends CountDownTimer {
        C1367e(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C1362m.this.f1111e.setText(C1362m.this.getString(C1124R.string.hw_inputBox_resendCode));
            C1362m.this.f1111e.setClickable(true);
            C1362m.this.f1111e.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_selector);
        }

        public void onTick(long j) {
            C1362m.this.f1111e.setClickable(false);
            TextView e = C1362m.this.f1111e;
            e.setText((j / 1000) + "s");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.m$f */
    public interface C1368f {
        /* renamed from: a */
        void mo12197a();

        /* renamed from: a */
        void mo12198a(String str);

        /* renamed from: a */
        void mo12199a(String str, String str2, String str3);
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1557b();
        m1561d();
        this.f1109c = new C1386a(getActivity(), this.f1107a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_resetpassword_reset, viewGroup, false);
        this.f1107a = inflate;
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1114h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void onStop() {
        CountDownTimer countDownTimer = this.f1114h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f1111e.setText(getString(C1124R.string.hw_inputBox_resendCode));
            this.f1111e.setClickable(true);
            this.f1111e.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_selector);
        }
        super.onStop();
    }

    /* renamed from: b */
    private void m1557b() {
        this.f1108b = (FrameLayout) this.f1107a.findViewById(C1124R.C1126id.fl_exit);
        this.f1110d = (TextView) this.f1107a.findViewById(C1124R.C1126id.tv_submit);
        this.f1111e = (TextView) this.f1107a.findViewById(C1124R.C1126id.tv_code_resend);
    }

    /* renamed from: c */
    public static C1362m m1558c() {
        return new C1362m();
    }

    /* renamed from: d */
    private void m1561d() {
        this.f1107a.setFocusableInTouchMode(true);
        this.f1107a.requestFocus();
        this.f1107a.setOnKeyListener(new C1363a());
        this.f1108b.setOnClickListener(new C1364b());
        this.f1110d.setOnClickListener(new C1365c());
        m1554a(60);
        this.f1111e.setOnClickListener(new C1366d());
    }

    /* renamed from: a */
    public void mo12574a(C1368f fVar) {
        this.f1113g = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1554a(long j) {
        this.f1111e.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_unclickable);
        C1367e eVar = new C1367e(j * 1000, 1000);
        this.f1114h = eVar;
        eVar.start();
    }

    /* renamed from: a */
    public void mo12575a(String str) {
        this.f1112f = str;
    }
}
