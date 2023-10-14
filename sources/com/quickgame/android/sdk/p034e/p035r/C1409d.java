package com.quickgame.android.sdk.p034e.p035r;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p043l.C1603f;
import com.quickgame.android.sdk.p043l.C1604g;

/* renamed from: com.quickgame.android.sdk.e.r.d */
public class C1409d {

    /* renamed from: a */
    private Activity f1220a;

    /* renamed from: b */
    private View f1221b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f1222c = null;

    /* renamed from: d */
    private LinearLayout f1223d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EditText f1224e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f1225f = null;

    /* renamed from: g */
    private LinearLayout f1226g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public EditText f1227h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f1228i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ImageView f1229j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f1230k = false;

    /* renamed from: l */
    private EditText f1231l = null;

    /* renamed from: m */
    private TextView f1232m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TextView f1233n = null;

    /* renamed from: com.quickgame.android.sdk.e.r.d$a */
    class C1410a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f1234a = new Rect();

        /* renamed from: b */
        private int f1235b;

        C1410a() {
        }

        public void onGlobalLayout() {
            C1409d.this.f1222c.getWindowVisibleDisplayFrame(this.f1234a);
            int height = this.f1234a.height();
            int i = this.f1235b;
            if (i != 0 && i <= height + 150 && i + 150 < height) {
                C1409d.this.m1660f();
            }
            this.f1235b = height;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.d$b */
    class C1411b implements TextWatcher {
        C1411b() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1409d.this.f1224e.getText().toString())) {
                C1409d.this.f1225f.setVisibility(0);
            } else {
                C1409d.this.f1225f.setVisibility(8);
            }
            if (C1409d.this.f1233n == null) {
                return;
            }
            if (C1409d.this.f1227h.getText().length() < 6 || editable.length() < 6) {
                C1409d.this.f1233n.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            } else {
                C1409d.this.f1233n.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.d$c */
    class C1412c implements View.OnClickListener {
        C1412c() {
        }

        public void onClick(View view) {
            C1409d.this.f1224e.setText("");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.d$d */
    class C1413d implements TextWatcher {
        C1413d() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1409d.this.f1227h.getText().toString())) {
                if (!C1409d.this.f1230k) {
                    C1409d.this.f1228i.setVisibility(0);
                }
                C1409d.this.f1229j.setVisibility(0);
            } else {
                if (!C1409d.this.f1230k) {
                    C1409d.this.f1228i.setVisibility(8);
                }
                C1409d.this.f1229j.setVisibility(8);
            }
            if (C1409d.this.f1233n == null) {
                return;
            }
            if (C1409d.this.f1224e.getText().length() < 6 || editable.length() < 6) {
                C1409d.this.f1233n.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            } else {
                C1409d.this.f1233n.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.d$e */
    class C1414e implements View.OnClickListener {
        C1414e() {
        }

        public void onClick(View view) {
            if (C1409d.this.f1227h.getTransformationMethod() != HideReturnsTransformationMethod.getInstance()) {
                C1409d.this.f1227h.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                C1409d.this.f1227h.setSelection(C1409d.this.f1227h.getText().length());
                C1409d.this.f1228i.setImageResource(C1124R.C1125drawable.hw_eye_open);
                return;
            }
            C1409d.this.f1227h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            C1409d.this.f1227h.setSelection(C1409d.this.f1227h.getText().length());
            C1409d.this.f1228i.setImageResource(C1124R.C1125drawable.hw_eye_close);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.d$f */
    class C1415f implements View.OnClickListener {
        C1415f() {
        }

        public void onClick(View view) {
            C1409d.this.f1227h.setText("");
        }
    }

    public C1409d(Activity activity, View view) {
        this.f1220a = activity;
        this.f1221b = view;
        m1661g();
        m1667j();
    }

    /* renamed from: j */
    private void m1667j() {
        this.f1222c.getViewTreeObserver().addOnGlobalLayoutListener(new C1410a());
        this.f1227h.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(20)});
        this.f1224e.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(50)});
        this.f1224e.addTextChangedListener(new C1411b());
        this.f1225f.setOnClickListener(new C1412c());
        this.f1227h.addTextChangedListener(new C1413d());
        this.f1228i.setOnClickListener(new C1414e());
        this.f1229j.setOnClickListener(new C1415f());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m1660f() {
        this.f1232m.setFocusable(true);
        this.f1232m.setFocusableInTouchMode(true);
        this.f1232m.requestFocus();
        this.f1232m.requestFocusFromTouch();
    }

    /* renamed from: g */
    private void m1661g() {
        this.f1222c = this.f1220a.getWindow().getDecorView();
        this.f1223d = (LinearLayout) this.f1221b.findViewById(C1124R.C1126id.ll_email);
        this.f1224e = (EditText) this.f1221b.findViewById(C1124R.C1126id.et_email);
        this.f1225f = (ImageView) this.f1221b.findViewById(C1124R.C1126id.iv_email_clear);
        this.f1226g = (LinearLayout) this.f1221b.findViewById(C1124R.C1126id.ll_password);
        EditText editText = (EditText) this.f1221b.findViewById(C1124R.C1126id.et_password);
        this.f1227h = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f1228i = (ImageView) this.f1221b.findViewById(C1124R.C1126id.iv_password_eye);
        this.f1229j = (ImageView) this.f1221b.findViewById(C1124R.C1126id.iv_password_clear);
        this.f1231l = (EditText) this.f1221b.findViewById(C1124R.C1126id.et_code);
        this.f1232m = (TextView) this.f1221b.findViewById(C1124R.C1126id.tv_focus);
        TextView textView = (TextView) this.f1221b.findViewById(C1124R.C1126id.tv_signUp);
        this.f1233n = textView;
        if (textView != null) {
            textView.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
        }
    }

    /* renamed from: h */
    private boolean m1664h() {
        String obj = this.f1224e.getText().toString();
        boolean b = C1603f.f1603a.mo13049b(obj);
        if (!b) {
            if (TextUtils.isEmpty(obj)) {
                mo12640a(m1654a(C1124R.string.hw_error_email_empty));
            } else {
                mo12640a(m1654a(C1124R.string.hw_error_email_invalid));
            }
            this.f1223d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            Log.d("Email", "正确的邮箱");
            this.f1223d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return b;
    }

    /* renamed from: i */
    private boolean m1666i() {
        String obj = this.f1227h.getText().toString();
        boolean c = C1603f.f1603a.mo13050c(obj);
        if (!c) {
            if (TextUtils.isEmpty(obj)) {
                mo12640a(m1654a(C1124R.string.hw_error_password_empty));
            } else {
                mo12640a(m1654a(C1124R.string.hw_error_password_invalid));
            }
            this.f1226g.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            this.f1226g.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return c;
    }

    /* renamed from: a */
    public void mo12639a() {
        this.f1227h.setText("");
        this.f1224e.setText("");
    }

    /* renamed from: b */
    public String mo12641b() {
        return m1664h() ? this.f1224e.getText().toString() : "";
    }

    /* renamed from: c */
    public String mo12642c() {
        EditText editText = this.f1231l;
        return editText != null ? editText.getText().toString() : "";
    }

    /* renamed from: d */
    public String mo12643d() {
        return m1666i() ? this.f1227h.getText().toString() : "";
    }

    /* renamed from: e */
    public void mo12644e() {
        this.f1227h.setTransformationMethod(PasswordTransformationMethod.getInstance());
        EditText editText = this.f1227h;
        editText.setSelection(editText.getText().length());
        this.f1228i.setImageResource(C1124R.C1125drawable.hw_eye_close);
    }

    /* renamed from: a */
    public void mo12640a(String str) {
        C1604g.f1604a.mo13052a(str);
    }

    /* renamed from: a */
    private String m1654a(int i) {
        return this.f1220a.getResources().getString(i);
    }
}
