package com.quickgame.android.sdk.p034e;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.quickgame.android.sdk.C1124R;

/* renamed from: com.quickgame.android.sdk.e.h */
public class C1338h extends C1346j {

    /* renamed from: a */
    private View f1060a = null;

    /* renamed from: b */
    private TextView f1061b = null;

    /* renamed from: c */
    private TextView f1062c = null;

    /* renamed from: d */
    private TextView f1063d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f1064e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1343e f1065f = null;

    /* renamed from: g */
    private CheckBox f1066g = null;

    /* renamed from: h */
    private boolean f1067h = false;

    /* renamed from: com.quickgame.android.sdk.e.h$a */
    class C1339a implements View.OnKeyListener {
        C1339a(C1338h hVar) {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return keyEvent.getAction() == 0 && i == 4;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.h$b */
    class C1340b implements View.OnClickListener {
        C1340b() {
        }

        public void onClick(View view) {
            if (C1338h.this.f1064e) {
                C1338h.this.getActivity().finish();
            } else {
                C1338h.this.f1065f.mo12112a();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.h$c */
    class C1341c implements View.OnClickListener {
        C1341c() {
        }

        public void onClick(View view) {
            C1338h.this.f1065f.mo12114c();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.h$d */
    class C1342d implements View.OnClickListener {
        C1342d() {
        }

        public void onClick(View view) {
            if (C1338h.this.f1065f != null) {
                C1338h.this.f1065f.mo12113b();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.h$e */
    public interface C1343e {
        /* renamed from: a */
        void mo12112a();

        /* renamed from: b */
        void mo12113b();

        /* renamed from: c */
        void mo12114c();
    }

    /* renamed from: c */
    private void m1508c() {
        this.f1061b = (TextView) this.f1060a.findViewById(C1124R.C1126id.tv_continue);
        this.f1062c = (TextView) this.f1060a.findViewById(C1124R.C1126id.tv_register);
        this.f1063d = (TextView) this.f1060a.findViewById(C1124R.C1126id.tv_register_tomato);
        CheckBox checkBox = (CheckBox) this.f1060a.findViewById(C1124R.C1126id.cb_ignore);
        this.f1066g = checkBox;
        if (this.f1067h) {
            checkBox.setVisibility(8);
        }
    }

    /* renamed from: d */
    public static C1338h m1509d() {
        return new C1338h();
    }

    /* renamed from: e */
    private void m1510e() {
        this.f1060a.setFocusableInTouchMode(true);
        this.f1060a.requestFocus();
        this.f1060a.setOnKeyListener(new C1339a(this));
        this.f1061b.setOnClickListener(new C1340b());
        this.f1062c.setOnClickListener(new C1341c());
        this.f1063d.setOnClickListener(new C1342d());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1508c();
        m1510e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_gametips, viewGroup, false);
        this.f1060a = inflate;
        return inflate;
    }

    public void onStop() {
        if (this.f1066g.isChecked()) {
            mo12549a(false);
        } else {
            mo12549a(true);
        }
        super.onStop();
    }

    /* renamed from: a */
    public void mo12548a(C1343e eVar) {
        this.f1065f = eVar;
    }

    /* renamed from: b */
    public void mo12551b() {
        this.f1067h = true;
    }

    /* renamed from: a */
    public void mo12549a(boolean z) {
        FragmentActivity activity = getActivity();
        getActivity();
        SharedPreferences.Editor edit = activity.getSharedPreferences("information", 0).edit();
        edit.putBoolean("guestTipsShow", z);
        edit.commit();
    }

    /* renamed from: a */
    public boolean mo12550a(Activity activity) {
        return activity.getSharedPreferences("information", 0).getBoolean("guestTipsShow", true);
    }
}
