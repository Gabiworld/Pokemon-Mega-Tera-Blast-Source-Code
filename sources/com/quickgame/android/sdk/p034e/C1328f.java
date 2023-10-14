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

/* renamed from: com.quickgame.android.sdk.e.f */
public class C1328f extends C1346j {

    /* renamed from: a */
    private View f1044a = null;

    /* renamed from: b */
    private FrameLayout f1045b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1393b f1046c = null;

    /* renamed from: d */
    private TextView f1047d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1332d f1048e = null;

    /* renamed from: com.quickgame.android.sdk.e.f$a */
    class C1329a implements View.OnKeyListener {
        C1329a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1328f.this.f1048e.mo12115a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.f$b */
    class C1330b implements View.OnClickListener {
        C1330b() {
        }

        public void onClick(View view) {
            C1328f.this.f1048e.mo12115a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.f$c */
    class C1331c implements View.OnClickListener {
        C1331c() {
        }

        public void onClick(View view) {
            String a = C1328f.this.f1046c.mo12610a();
            if (!"".equals(a)) {
                C1328f.this.f1048e.mo12116a(a);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.f$d */
    public interface C1332d {
        /* renamed from: a */
        void mo12115a();

        /* renamed from: a */
        void mo12116a(String str);
    }

    /* renamed from: c */
    public static C1328f m1496c() {
        return new C1328f();
    }

    /* renamed from: d */
    private void m1497d() {
        this.f1044a.setFocusableInTouchMode(true);
        this.f1044a.requestFocus();
        this.f1044a.setOnKeyListener(new C1329a());
        this.f1045b.setOnClickListener(new C1330b());
        this.f1047d.setOnClickListener(new C1331c());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1495b();
        m1497d();
        this.f1046c = new C1393b(getActivity(), this.f1044a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_bindemail_sendcode, viewGroup, false);
        this.f1044a = inflate;
        return inflate;
    }

    public void onStart() {
        super.onStart();
    }

    /* renamed from: b */
    private void m1495b() {
        this.f1045b = (FrameLayout) this.f1044a.findViewById(C1124R.C1126id.fl_exit);
        this.f1047d = (TextView) this.f1044a.findViewById(C1124R.C1126id.tv_submit);
    }

    /* renamed from: a */
    public void mo12540a(C1332d dVar) {
        this.f1048e = dVar;
    }
}
