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

/* renamed from: com.quickgame.android.sdk.e.e */
public class C1321e extends C1346j {

    /* renamed from: a */
    private View f1031a = null;

    /* renamed from: b */
    private FrameLayout f1032b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1386a f1033c = null;

    /* renamed from: d */
    private TextView f1034d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f1035e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1036f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1327f f1037g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public CountDownTimer f1038h = null;

    /* renamed from: com.quickgame.android.sdk.e.e$a */
    class C1322a implements View.OnKeyListener {
        C1322a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1321e.this.f1037g.mo12117a();
            if (C1321e.this.f1038h == null) {
                return true;
            }
            C1321e.this.f1038h.cancel();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.e$b */
    class C1323b implements View.OnClickListener {
        C1323b() {
        }

        public void onClick(View view) {
            C1321e.this.f1037g.mo12117a();
            if (C1321e.this.f1038h != null) {
                C1321e.this.f1038h.cancel();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.e$c */
    class C1324c implements View.OnClickListener {
        C1324c() {
        }

        public void onClick(View view) {
            String a = C1321e.this.f1033c.mo12597a();
            String b = C1321e.this.f1033c.mo12599b();
            if (("".equals(b) ^ true) && (!"".equals(a))) {
                C1321e.this.f1037g.mo12119a(C1321e.this.f1036f, a, b);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.e$d */
    class C1325d implements View.OnClickListener {
        C1325d() {
        }

        public void onClick(View view) {
            C1321e.this.f1037g.mo12118a(C1321e.this.f1036f);
            C1321e.this.m1479a(60);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.e$e */
    class C1326e extends CountDownTimer {
        C1326e(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C1321e.this.f1035e.setText(C1321e.this.getActivity().getString(C1124R.string.hw_inputBox_resendCode));
            C1321e.this.f1035e.setEnabled(true);
            C1321e.this.f1035e.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_selector);
        }

        public void onTick(long j) {
            TextView e = C1321e.this.f1035e;
            e.setText((j / 1000) + "s");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.e$f */
    public interface C1327f {
        /* renamed from: a */
        void mo12117a();

        /* renamed from: a */
        void mo12118a(String str);

        /* renamed from: a */
        void mo12119a(String str, String str2, String str3);
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1482b();
        m1484c();
        this.f1033c = new C1386a(getActivity(), this.f1031a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_bindemail_bind, viewGroup, false);
        this.f1031a = inflate;
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1038h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: b */
    private void m1482b() {
        this.f1032b = (FrameLayout) this.f1031a.findViewById(C1124R.C1126id.fl_exit);
        this.f1034d = (TextView) this.f1031a.findViewById(C1124R.C1126id.tv_submit);
        this.f1035e = (TextView) this.f1031a.findViewById(C1124R.C1126id.tv_code_resend);
    }

    /* renamed from: c */
    private void m1484c() {
        this.f1031a.setFocusableInTouchMode(true);
        this.f1031a.requestFocus();
        this.f1031a.setOnKeyListener(new C1322a());
        this.f1032b.setOnClickListener(new C1323b());
        this.f1034d.setOnClickListener(new C1324c());
        m1479a(60);
        this.f1035e.setOnClickListener(new C1325d());
    }

    /* renamed from: a */
    public void mo12532a(C1327f fVar) {
        this.f1037g = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1479a(long j) {
        this.f1035e.setEnabled(false);
        this.f1035e.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_unclickable);
        C1326e eVar = new C1326e(j * 1000, 1000);
        this.f1038h = eVar;
        eVar.start();
    }

    /* renamed from: a */
    public void mo12533a(String str) {
        this.f1036f = str;
    }
}
