package com.quickgame.android.sdk.p034e.p035r;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p043l.C1603f;
import com.quickgame.android.sdk.p043l.C1604g;

/* renamed from: com.quickgame.android.sdk.e.r.b */
public class C1393b {

    /* renamed from: a */
    private Activity f1167a;

    /* renamed from: b */
    private View f1168b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f1169c = null;

    /* renamed from: d */
    private LinearLayout f1170d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EditText f1171e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f1172f = null;

    /* renamed from: g */
    private TextView f1173g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f1174h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public EditText f1175i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public EditText f1176j = null;

    /* renamed from: com.quickgame.android.sdk.e.r.b$a */
    class C1394a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f1177a = new Rect();

        /* renamed from: b */
        private int f1178b;

        C1394a() {
        }

        public void onGlobalLayout() {
            C1393b.this.f1169c.getWindowVisibleDisplayFrame(this.f1177a);
            int height = this.f1177a.height();
            int i = this.f1178b;
            if (i != 0 && i <= height + 150 && i + 150 < height) {
                C1393b.this.m1608b();
            }
            this.f1178b = height;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.b$b */
    class C1395b implements TextWatcher {
        C1395b() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1393b.this.f1171e.getText().toString())) {
                C1393b.this.f1172f.setVisibility(0);
            } else {
                C1393b.this.f1172f.setVisibility(8);
            }
            if (C1393b.this.f1174h == null) {
                return;
            }
            if (editable.length() >= 6) {
                C1393b.this.f1174h.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
                C1393b.this.f1174h.setClickable(true);
                if (C1393b.this.f1176j != null && C1393b.this.f1175i != null) {
                    if (C1393b.this.f1176j.getText().length() < 6 || C1393b.this.f1175i.getText().length() < 6) {
                        C1393b.this.f1174h.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
                        C1393b.this.f1174h.setClickable(false);
                        return;
                    }
                    return;
                }
                return;
            }
            C1393b.this.f1174h.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            C1393b.this.f1174h.setClickable(false);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.b$c */
    class C1396c implements View.OnClickListener {
        C1396c() {
        }

        public void onClick(View view) {
            C1393b.this.f1171e.setText("");
        }
    }

    public C1393b(Activity activity, View view) {
        this.f1167a = activity;
        this.f1168b = view;
        m1611c();
        m1615e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1608b() {
        this.f1173g.setFocusable(true);
        this.f1173g.setFocusableInTouchMode(true);
        this.f1173g.requestFocus();
        this.f1173g.requestFocusFromTouch();
    }

    /* renamed from: c */
    private void m1611c() {
        this.f1169c = this.f1167a.getWindow().getDecorView();
        this.f1170d = (LinearLayout) this.f1168b.findViewById(C1124R.C1126id.ll_email);
        this.f1171e = (EditText) this.f1168b.findViewById(C1124R.C1126id.et_email);
        this.f1172f = (ImageView) this.f1168b.findViewById(C1124R.C1126id.iv_email_clear);
        this.f1173g = (TextView) this.f1168b.findViewById(C1124R.C1126id.tv_focus);
        TextView textView = (TextView) this.f1168b.findViewById(C1124R.C1126id.tv_submit);
        this.f1174h = textView;
        if (textView != null) {
            textView.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            this.f1174h.setClickable(false);
        }
        this.f1176j = (EditText) this.f1168b.findViewById(C1124R.C1126id.et_code);
        EditText editText = (EditText) this.f1168b.findViewById(C1124R.C1126id.et_password);
        this.f1175i = editText;
        if (editText != null) {
            editText.setTypeface(Typeface.DEFAULT);
        }
    }

    /* renamed from: d */
    private boolean m1613d() {
        String obj = this.f1171e.getText().toString();
        boolean b = C1603f.f1603a.mo13049b(obj);
        if (!b) {
            if (TextUtils.isEmpty(obj)) {
                mo12612a(m1606a(C1124R.string.hw_error_email_empty));
            } else {
                mo12612a(m1606a(C1124R.string.hw_error_email_invalid));
            }
            this.f1170d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            this.f1170d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return b;
    }

    /* renamed from: e */
    private void m1615e() {
        this.f1169c.getViewTreeObserver().addOnGlobalLayoutListener(new C1394a());
        this.f1171e.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(50)});
        this.f1171e.addTextChangedListener(new C1395b());
        this.f1172f.setOnClickListener(new C1396c());
    }

    /* renamed from: a */
    public String mo12610a() {
        return m1613d() ? this.f1171e.getText().toString() : "";
    }

    /* renamed from: a */
    public void mo12611a(TextView.OnEditorActionListener onEditorActionListener) {
        EditText editText = this.f1171e;
        if (editText != null) {
            editText.setOnEditorActionListener(onEditorActionListener);
        }
    }

    /* renamed from: a */
    public void mo12612a(String str) {
        C1604g.f1604a.mo13052a(str);
    }

    /* renamed from: a */
    private void m1607a(Activity activity) {
        this.f1169c = activity.getWindow().getDecorView();
        this.f1170d = (LinearLayout) activity.findViewById(C1124R.C1126id.ll_email);
        this.f1171e = (EditText) activity.findViewById(C1124R.C1126id.et_email);
        this.f1172f = (ImageView) activity.findViewById(C1124R.C1126id.iv_email_clear);
        this.f1173g = (TextView) activity.findViewById(C1124R.C1126id.tv_focus);
        TextView textView = (TextView) activity.findViewById(C1124R.C1126id.tv_submit);
        this.f1174h = textView;
        if (textView != null) {
            textView.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_unable);
            this.f1174h.setClickable(false);
        }
        this.f1176j = (EditText) activity.findViewById(C1124R.C1126id.et_code);
        EditText editText = (EditText) activity.findViewById(C1124R.C1126id.et_password);
        this.f1175i = editText;
        if (editText != null) {
            editText.setTypeface(Typeface.DEFAULT);
        }
    }

    public C1393b(Activity activity) {
        this.f1167a = activity;
        m1607a(activity);
        m1615e();
    }

    /* renamed from: a */
    private String m1606a(int i) {
        return this.f1167a.getResources().getString(i);
    }
}
