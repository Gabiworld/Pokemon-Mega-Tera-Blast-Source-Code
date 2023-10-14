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
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p043l.C1603f;
import com.quickgame.android.sdk.p043l.C1604g;

/* renamed from: com.quickgame.android.sdk.e.r.a */
public class C1386a {

    /* renamed from: a */
    private Activity f1148a;

    /* renamed from: b */
    private View f1149b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f1150c = null;

    /* renamed from: d */
    private LinearLayout f1151d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EditText f1152e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f1153f = null;

    /* renamed from: g */
    private LinearLayout f1154g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public EditText f1155h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f1156i = null;

    /* renamed from: j */
    private TextView f1157j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public TextView f1158k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public EditText f1159l = null;

    /* renamed from: com.quickgame.android.sdk.e.r.a$a */
    class C1387a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f1160a = new Rect();

        /* renamed from: b */
        private int f1161b;

        C1387a() {
        }

        public void onGlobalLayout() {
            C1386a.this.f1150c.getWindowVisibleDisplayFrame(this.f1160a);
            int height = this.f1160a.height();
            int i = this.f1161b;
            if (i != 0 && i <= height + 150 && i + 150 < height) {
                C1386a.this.m1592c();
            }
            this.f1161b = height;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.a$b */
    class C1388b implements View.OnFocusChangeListener {
        C1388b(C1386a aVar) {
        }

        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.a$c */
    class C1389c implements TextWatcher {
        C1389c() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1386a.this.f1152e.getText().toString())) {
                C1386a.this.f1153f.setVisibility(0);
            } else {
                C1386a.this.f1153f.setVisibility(8);
            }
            if (C1386a.this.f1158k == null) {
                return;
            }
            if (C1386a.this.f1155h.getText().length() < 4 || editable.length() < 4) {
                C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
                C1386a.this.f1158k.setClickable(false);
                return;
            }
            C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
            C1386a.this.f1158k.setClickable(true);
            if (C1386a.this.f1159l != null && C1386a.this.f1159l.getText().length() < 6) {
                C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
                C1386a.this.f1158k.setClickable(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.a$d */
    class C1390d implements View.OnClickListener {
        C1390d() {
        }

        public void onClick(View view) {
            C1386a.this.f1152e.setText("");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.a$e */
    class C1391e implements TextWatcher {
        C1391e() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1386a.this.f1155h.getText().toString())) {
                C1386a.this.f1156i.setVisibility(0);
            } else {
                C1386a.this.f1156i.setVisibility(8);
            }
            if (C1386a.this.f1158k == null) {
                return;
            }
            if (C1386a.this.f1152e.getText().length() < 6 || editable.length() < 6) {
                C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
                C1386a.this.f1158k.setClickable(false);
                return;
            }
            C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
            C1386a.this.f1158k.setClickable(true);
            if (C1386a.this.f1159l != null && C1386a.this.f1159l.getText().length() < 6) {
                C1386a.this.f1158k.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
                C1386a.this.f1158k.setClickable(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.a$f */
    class C1392f implements View.OnClickListener {
        C1392f() {
        }

        public void onClick(View view) {
            if (C1386a.this.f1155h.getTransformationMethod() != HideReturnsTransformationMethod.getInstance()) {
                C1386a.this.f1155h.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                C1386a.this.f1155h.setSelection(C1386a.this.f1155h.getText().length());
                C1386a.this.f1156i.setBackgroundResource(C1124R.C1125drawable.hw_eye_open);
                return;
            }
            C1386a.this.f1155h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            C1386a.this.f1155h.setSelection(C1386a.this.f1155h.getText().length());
            C1386a.this.f1156i.setBackgroundResource(C1124R.C1125drawable.hw_eye_close);
        }
    }

    public C1386a(Activity activity, View view) {
        this.f1148a = activity;
        this.f1149b = view;
        m1594d();
        m1600g();
        this.f1155h.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1592c() {
        this.f1157j.setFocusable(true);
        this.f1157j.setFocusableInTouchMode(true);
        this.f1157j.requestFocus();
        this.f1157j.requestFocusFromTouch();
    }

    /* renamed from: d */
    private void m1594d() {
        this.f1150c = this.f1148a.getWindow().getDecorView();
        this.f1151d = (LinearLayout) this.f1149b.findViewById(C1124R.C1126id.ll_code);
        this.f1152e = (EditText) this.f1149b.findViewById(C1124R.C1126id.et_code);
        this.f1153f = (ImageView) this.f1149b.findViewById(C1124R.C1126id.iv_code_clear);
        this.f1154g = (LinearLayout) this.f1149b.findViewById(C1124R.C1126id.ll_password);
        EditText editText = (EditText) this.f1149b.findViewById(C1124R.C1126id.et_password);
        this.f1155h = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f1156i = (ImageView) this.f1149b.findViewById(C1124R.C1126id.iv_password_eye);
        this.f1157j = (TextView) this.f1149b.findViewById(C1124R.C1126id.tv_focus);
        TextView textView = (TextView) this.f1149b.findViewById(C1124R.C1126id.tv_submit);
        this.f1158k = textView;
        if (textView != null) {
            textView.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            this.f1158k.setClickable(false);
        }
        this.f1159l = (EditText) this.f1149b.findViewById(C1124R.C1126id.et_email);
    }

    /* renamed from: e */
    private boolean m1596e() {
        String obj = this.f1152e.getText().toString();
        boolean a = C1603f.f1603a.mo13048a(obj);
        if (!a) {
            if (TextUtils.isEmpty(obj)) {
                mo12598a(m1588a(C1124R.string.hw_error_code_empty));
            } else {
                mo12598a(m1588a(C1124R.string.hw_error_code_invalid));
            }
            this.f1151d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            this.f1151d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return a;
    }

    /* renamed from: f */
    private boolean m1598f() {
        String obj = this.f1155h.getText().toString();
        boolean c = C1603f.f1603a.mo13050c(obj);
        if (!c) {
            if (TextUtils.isEmpty(obj)) {
                mo12598a(m1588a(C1124R.string.hw_error_password_empty));
            } else {
                mo12598a(m1588a(C1124R.string.hw_error_password_invalid));
            }
            this.f1154g.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            this.f1154g.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return c;
    }

    /* renamed from: g */
    private void m1600g() {
        this.f1150c.getViewTreeObserver().addOnGlobalLayoutListener(new C1387a());
        C1388b bVar = new C1388b(this);
        this.f1152e.setOnFocusChangeListener(bVar);
        this.f1155h.setOnFocusChangeListener(bVar);
        this.f1155h.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(20)});
        this.f1152e.addTextChangedListener(new C1389c());
        this.f1153f.setOnClickListener(new C1390d());
        this.f1155h.addTextChangedListener(new C1391e());
        this.f1156i.setOnClickListener(new C1392f());
    }

    /* renamed from: a */
    public String mo12597a() {
        return m1596e() ? this.f1152e.getText().toString() : "";
    }

    /* renamed from: b */
    public String mo12599b() {
        return m1598f() ? this.f1155h.getText().toString() : "";
    }

    /* renamed from: a */
    public void mo12598a(String str) {
        C1604g.f1604a.mo13052a(str);
    }

    /* renamed from: a */
    private void m1589a(Activity activity) {
        this.f1150c = activity.getWindow().getDecorView();
        this.f1151d = (LinearLayout) activity.findViewById(C1124R.C1126id.ll_code);
        this.f1152e = (EditText) activity.findViewById(C1124R.C1126id.et_code);
        this.f1153f = (ImageView) activity.findViewById(C1124R.C1126id.iv_code_clear);
        this.f1154g = (LinearLayout) activity.findViewById(C1124R.C1126id.ll_password);
        EditText editText = (EditText) activity.findViewById(C1124R.C1126id.et_password);
        this.f1155h = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f1156i = (ImageView) activity.findViewById(C1124R.C1126id.iv_password_eye);
        this.f1157j = (TextView) activity.findViewById(C1124R.C1126id.tv_focus);
        TextView textView = (TextView) activity.findViewById(C1124R.C1126id.tv_submit);
        this.f1158k = textView;
        if (textView != null) {
            textView.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            this.f1158k.setClickable(false);
        }
        this.f1159l = (EditText) activity.findViewById(C1124R.C1126id.et_email);
    }

    /* renamed from: a */
    private String m1588a(int i) {
        return this.f1148a.getResources().getString(i);
    }

    public C1386a(Activity activity) {
        this.f1148a = activity;
        m1589a(activity);
        m1600g();
        this.f1155h.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
}
