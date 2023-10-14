package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1645g;
import com.quickgame.android.sdk.p034e.C1333g;
import com.quickgame.android.sdk.p034e.p035r.C1416e;
import com.quickgame.android.sdk.p043l.C1603f;

public class HWModifyPwActivity extends MvpBaseActivity<C1645g> implements C1645g.C1646a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f855c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public EditText f856d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f857e = null;

    /* renamed from: f */
    private FrameLayout f858f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f859g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f860h = null;

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$a */
    class C1233a implements View.OnClickListener {
        C1233a() {
        }

        public void onClick(View view) {
            if (HWModifyPwActivity.this.f855c.getTransformationMethod() != HideReturnsTransformationMethod.getInstance()) {
                HWModifyPwActivity.this.f855c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                HWModifyPwActivity.this.f855c.setSelection(HWModifyPwActivity.this.f855c.getText().length());
                HWModifyPwActivity.this.f859g.setImageResource(C1124R.C1125drawable.hw_eye_open);
                return;
            }
            HWModifyPwActivity.this.f855c.setTransformationMethod(PasswordTransformationMethod.getInstance());
            HWModifyPwActivity.this.f855c.setSelection(HWModifyPwActivity.this.f855c.getText().length());
            HWModifyPwActivity.this.f859g.setImageResource(C1124R.C1125drawable.hw_eye_close);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$b */
    class C1234b implements View.OnClickListener {
        C1234b() {
        }

        public void onClick(View view) {
            if (HWModifyPwActivity.this.f856d.getTransformationMethod() != HideReturnsTransformationMethod.getInstance()) {
                HWModifyPwActivity.this.f856d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                HWModifyPwActivity.this.f856d.setSelection(HWModifyPwActivity.this.f856d.getText().length());
                HWModifyPwActivity.this.f860h.setImageResource(C1124R.C1125drawable.hw_eye_open);
                return;
            }
            HWModifyPwActivity.this.f856d.setTransformationMethod(PasswordTransformationMethod.getInstance());
            HWModifyPwActivity.this.f856d.setSelection(HWModifyPwActivity.this.f856d.getText().length());
            HWModifyPwActivity.this.f860h.setImageResource(C1124R.C1125drawable.hw_eye_close);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$c */
    class C1235c implements View.OnClickListener {
        C1235c() {
        }

        public void onClick(View view) {
            String obj = HWModifyPwActivity.this.f855c.getText().toString();
            String obj2 = HWModifyPwActivity.this.f856d.getText().toString();
            if (obj.equals(obj2)) {
                Toast.makeText(HWModifyPwActivity.this, C1124R.string.hw_changePassword_can_not_equal, 1).show();
                return;
            }
            HWModifyPwActivity.this.mo12282w("");
            ((C1645g) HWModifyPwActivity.this.f1648b).mo13138a(obj2, obj);
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$d */
    class C1236d implements TextWatcher {
        C1236d() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            String obj2 = HWModifyPwActivity.this.f856d.getText().toString();
            if (!C1603f.f1603a.mo13050c(obj) || !C1603f.f1603a.mo13050c(obj2)) {
                HWModifyPwActivity.this.f857e.setEnabled(false);
            } else {
                HWModifyPwActivity.this.f857e.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$e */
    class C1237e implements TextWatcher {
        C1237e() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (!C1603f.f1603a.mo13050c(HWModifyPwActivity.this.f855c.getText().toString()) || !C1603f.f1603a.mo13050c(obj)) {
                HWModifyPwActivity.this.f857e.setEnabled(false);
            } else {
                HWModifyPwActivity.this.f857e.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$f */
    class C1238f implements View.OnClickListener {
        C1238f() {
        }

        public void onClick(View view) {
            HWModifyPwActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWModifyPwActivity$g */
    class C1239g implements C1333g.C1337d {
        C1239g() {
        }

        /* renamed from: a */
        public void mo12120a() {
            HWModifyPwActivity.this.finish();
            C1128a.m798r().mo11982e((Activity) HWModifyPwActivity.this);
        }
    }

    /* renamed from: s */
    private void m1203s() {
        this.f855c = (EditText) findViewById(C1124R.C1126id.et_new_pw);
        this.f856d = (EditText) findViewById(C1124R.C1126id.et_old_pw);
        this.f857e = (TextView) findViewById(C1124R.C1126id.bt_submit);
        this.f858f = (FrameLayout) findViewById(C1124R.C1126id.fl_back);
        ImageView imageView = (ImageView) findViewById(C1124R.C1126id.iv_password_eye_new);
        this.f859g = imageView;
        imageView.setOnClickListener(new C1233a());
        ImageView imageView2 = (ImageView) findViewById(C1124R.C1126id.iv_password_eye_old);
        this.f860h = imageView2;
        imageView2.setOnClickListener(new C1234b());
        this.f857e.setClickable(false);
        this.f857e.setOnClickListener(new C1235c());
        this.f855c.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(20)});
        this.f855c.addTextChangedListener(new C1236d());
        this.f856d.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(20)});
        this.f856d.addTextChangedListener(new C1237e());
        this.f858f.setOnClickListener(new C1238f());
    }

    /* renamed from: m */
    public void mo12201m() {
        mo12280p();
        C1333g a = C1333g.m1503a();
        a.mo12544a((C1333g.C1337d) new C1239g());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        a.show(supportFragmentManager, getString(C1124R.string.qg_str_modify_password) + " " + getString(C1124R.string.qg_str_success));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_changepassword);
        m1203s();
    }

    /* renamed from: f */
    public void mo12200f(String str) {
        mo12280p();
        Toast.makeText(this, "old password error or new password is invaild.", 1).show();
    }

    /* renamed from: r */
    public C1645g m1207r() {
        return new C1645g(this);
    }
}
