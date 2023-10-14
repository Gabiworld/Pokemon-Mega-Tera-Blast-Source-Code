package com.quickgame.android.sdk.p034e;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p034e.p035r.C1393b;

/* renamed from: com.quickgame.android.sdk.e.l */
public class C1357l extends C1346j {

    /* renamed from: a */
    private View f1099a = null;

    /* renamed from: b */
    private FrameLayout f1100b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1393b f1101c = null;

    /* renamed from: d */
    private TextView f1102d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1361d f1103e = null;

    /* renamed from: com.quickgame.android.sdk.e.l$a */
    class C1358a implements View.OnKeyListener {
        C1358a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1357l.this.f1103e.mo12195a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.l$b */
    class C1359b implements View.OnClickListener {
        C1359b() {
        }

        public void onClick(View view) {
            C1357l.this.f1103e.mo12195a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.l$c */
    class C1360c implements View.OnClickListener {
        C1360c() {
        }

        public void onClick(View view) {
            String a = C1357l.this.f1101c.mo12610a();
            if (!"".equals(a)) {
                C1357l.this.f1103e.mo12196a(a);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.l$d */
    public interface C1361d {
        /* renamed from: a */
        void mo12195a();

        /* renamed from: a */
        void mo12196a(String str);
    }

    /* renamed from: c */
    public static C1357l m1547c() {
        return new C1357l();
    }

    /* renamed from: d */
    private void m1548d() {
        this.f1099a.setFocusableInTouchMode(true);
        this.f1099a.requestFocus();
        this.f1099a.setOnKeyListener(new C1358a());
        this.f1100b.setOnClickListener(new C1359b());
        this.f1102d.setOnClickListener(new C1360c());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1546b();
        m1548d();
        this.f1101c = new C1393b(getActivity(), this.f1099a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_resetpassword_sendcode, viewGroup, false);
        this.f1099a = inflate;
        return inflate;
    }

    public void onStart() {
        super.onStart();
    }

    /* renamed from: b */
    private void m1546b() {
        this.f1100b = (FrameLayout) this.f1099a.findViewById(C1124R.C1126id.fl_exit);
        this.f1102d = (TextView) this.f1099a.findViewById(C1124R.C1126id.tv_submit);
    }

    /* renamed from: a */
    public void mo12570a(C1361d dVar) {
        this.f1103e = dVar;
    }
}
