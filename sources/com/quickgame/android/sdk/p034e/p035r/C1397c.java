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
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.model.C1607a;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.p043l.C1603f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.quickgame.android.sdk.e.r.c */
public class C1397c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f1182a;

    /* renamed from: b */
    private View f1183b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f1184c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearLayout f1185d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f1186e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f1187f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public EditText f1188g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f1189h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f1190i = null;

    /* renamed from: j */
    private LinearLayout f1191j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ImageView f1192k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f1193l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public EditText f1194m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f1195n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageView f1196o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f1197p = false;

    /* renamed from: q */
    private TextView f1198q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public PopupWindow f1199r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<String> f1200s = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ImageView f1201t;

    /* renamed from: u */
    private FrameLayout f1202u;

    /* renamed from: com.quickgame.android.sdk.e.r.c$a */
    class C1398a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f1203a;

        C1398a(TextView textView) {
            this.f1203a = textView;
        }

        public void onClick(View view) {
            C1397c.this.f1199r.dismiss();
            if (!(C1397c.this.f1186e == null || C1397c.this.f1187f == null)) {
                C1397c.this.f1186e.setVisibility(8);
                C1397c.this.f1187f.setTextColor(C1397c.this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                C1397c.this.f1187f.setText(C1397c.this.f1182a.getResources().getString(C1124R.string.hw_inputBox_email_hint));
            }
            C1397c.this.f1188g.setText(this.f1203a.getText().toString());
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$b */
    class C1399b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f1205a;

        /* renamed from: b */
        final /* synthetic */ View f1206b;

        /* renamed from: c */
        final /* synthetic */ LinearLayout f1207c;

        C1399b(TextView textView, View view, LinearLayout linearLayout) {
            this.f1205a = textView;
            this.f1206b = view;
            this.f1207c = linearLayout;
        }

        public void onClick(View view) {
            C1609b d = C1609b.m2099d();
            String charSequence = this.f1205a.getText().toString();
            if (C1397c.this.f1188g.getText().toString().equals(charSequence)) {
                C1397c.this.f1188g.setText("");
            }
            this.f1206b.setVisibility(8);
            this.f1207c.removeView(this.f1206b);
            d.mo13084a(charSequence);
            C1397c.this.f1200s.remove(charSequence);
            if (this.f1207c.getChildCount() == 0) {
                C1397c.this.f1201t.setVisibility(8);
                C1397c.this.f1199r.dismiss();
                C1397c.this.f1200s.clear();
                return;
            }
            this.f1207c.invalidate();
            C1397c.this.f1199r.update(C1397c.this.f1185d.getWidth(), C1397c.this.f1185d.getHeight() * C1397c.this.f1200s.size());
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$c */
    class C1400c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f1209a = new Rect();

        /* renamed from: b */
        private int f1210b;

        C1400c() {
        }

        public void onGlobalLayout() {
            C1397c.this.f1184c.getWindowVisibleDisplayFrame(this.f1209a);
            int height = this.f1209a.height();
            int i = this.f1210b;
            if (i != 0 && i <= height + 150 && i + 150 < height) {
                C1397c.this.m1628f();
            }
            this.f1210b = height;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$d */
    class C1401d implements View.OnFocusChangeListener {
        C1401d() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                if (C1397c.this.f1199r != null && C1397c.this.f1199r.isShowing()) {
                    C1397c.this.f1199r.dismiss();
                }
                view.getId();
                C1397c.this.f1188g.getId();
                view.getId();
                C1397c.this.f1194m.getId();
                return;
            }
            view.getId();
            C1397c.this.f1188g.getId();
            view.getId();
            C1397c.this.f1194m.getId();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$e */
    class C1402e implements TextWatcher {
        C1402e() {
        }

        public void afterTextChanged(Editable editable) {
            if (!"".equals(C1397c.this.f1188g.getText().toString())) {
                C1397c.this.f1189h.setVisibility(0);
                if (!(C1397c.this.f1187f == null || C1397c.this.f1186e == null)) {
                    C1397c.this.f1187f.setVisibility(0);
                    C1397c.this.f1186e.setVisibility(8);
                    C1397c.this.f1187f.setTextColor(C1397c.this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                    C1397c.this.f1187f.setText(C1397c.this.f1182a.getResources().getString(C1124R.string.hw_inputBox_email_hint));
                }
            } else {
                C1397c.this.f1189h.setVisibility(8);
                if (!(C1397c.this.f1187f == null || C1397c.this.f1186e == null)) {
                    C1397c.this.f1186e.setVisibility(8);
                    C1397c.this.f1187f.setVisibility(8);
                    C1397c.this.f1187f.setTextColor(C1397c.this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                    C1397c.this.f1187f.setText(C1397c.this.f1182a.getResources().getString(C1124R.string.hw_inputBox_email_hint));
                }
            }
            if (C1397c.this.f1190i != null && C1397c.this.f1194m.getText().length() >= 6 && editable.length() >= 6) {
                C1397c.this.f1190i.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
                C1397c.this.f1190i.setClickable(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$f */
    class C1403f implements View.OnClickListener {
        C1403f() {
        }

        public void onClick(View view) {
            if (C1397c.this.f1199r != null && C1397c.this.f1199r.isShowing()) {
                C1397c.this.f1199r.dismiss();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$g */
    class C1404g implements View.OnClickListener {
        C1404g() {
        }

        public void onClick(View view) {
            C1397c.this.f1188g.setText("");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$h */
    class C1405h implements TextWatcher {
        C1405h() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() > 0) {
                for (int i = 0; i < editable.length(); i++) {
                    char charAt = editable.charAt(i);
                    if (charAt >= 19968 && charAt <= 40959) {
                        editable.delete(i, i + 1);
                    }
                }
            }
            if (C1397c.this.f1190i != null && C1397c.this.f1188g.getText().length() >= 6 && editable.length() >= 6) {
                C1397c.this.f1190i.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
                C1397c.this.f1190i.setClickable(true);
            }
            if (!"".equals(C1397c.this.f1194m.getText().toString())) {
                if (!C1397c.this.f1197p) {
                    C1397c.this.f1195n.setVisibility(0);
                }
                C1397c.this.f1196o.setVisibility(0);
                if (C1397c.this.f1192k != null && C1397c.this.f1193l != null) {
                    C1397c.this.f1193l.setVisibility(0);
                    C1397c.this.f1192k.setVisibility(8);
                    C1397c.this.f1193l.setTextColor(C1397c.this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                    C1397c.this.f1193l.setText(C1397c.this.f1182a.getResources().getString(C1124R.string.hw_inputBox_password_hint));
                    return;
                }
                return;
            }
            if (!C1397c.this.f1197p) {
                C1397c.this.f1195n.setVisibility(8);
            }
            C1397c.this.f1196o.setVisibility(8);
            if (C1397c.this.f1192k != null && C1397c.this.f1193l != null) {
                C1397c.this.f1193l.setVisibility(8);
                C1397c.this.f1192k.setVisibility(8);
                C1397c.this.f1193l.setTextColor(C1397c.this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                C1397c.this.f1193l.setText(C1397c.this.f1182a.getResources().getString(C1124R.string.hw_inputBox_password_hint));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$i */
    class C1406i implements View.OnClickListener {
        C1406i() {
        }

        public void onClick(View view) {
            if (C1397c.this.f1194m.getTransformationMethod() != HideReturnsTransformationMethod.getInstance()) {
                C1397c.this.f1194m.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                C1397c.this.f1194m.setSelection(C1397c.this.f1194m.getText().length());
                C1397c.this.f1195n.setBackgroundResource(C1124R.C1125drawable.hw_eye_open);
                return;
            }
            C1397c.this.f1194m.setTransformationMethod(PasswordTransformationMethod.getInstance());
            C1397c.this.f1194m.setSelection(C1397c.this.f1194m.getText().length());
            C1397c.this.f1195n.setBackgroundResource(C1124R.C1125drawable.hw_eye_close);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$j */
    class C1407j implements View.OnClickListener {
        C1407j() {
        }

        public void onClick(View view) {
            C1397c.this.f1194m.setText("");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.c$k */
    class C1408k implements View.OnClickListener {
        C1408k() {
        }

        public void onClick(View view) {
            if (C1397c.this.f1199r == null) {
                Log.e("test", "onCreate pop");
                PopupWindow unused = C1397c.this.m1629g();
            }
            if (C1397c.this.f1199r.isShowing()) {
                Log.e("test", "dismiss pop");
                C1397c.this.f1199r.dismiss();
                return;
            }
            Log.e("test", "show pop");
            C1397c.this.f1199r.showAsDropDown(C1397c.this.f1185d, 0, 0);
        }
    }

    public C1397c(Activity activity, View view) {
        this.f1182a = activity;
        this.f1183b = view;
        m1632h();
        m1638k();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m1628f() {
        this.f1198q.setFocusable(true);
        this.f1198q.setFocusableInTouchMode(true);
        this.f1198q.requestFocus();
        this.f1198q.requestFocusFromTouch();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public PopupWindow m1629g() {
        LinearLayout linearLayout = new LinearLayout(this.f1182a);
        linearLayout.setBackgroundColor(0);
        Log.e("test", this.f1185d.getWidth() + " width");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f1185d.getWidth(), this.f1185d.getHeight());
        for (String text : this.f1200s) {
            View inflate = this.f1182a.getLayoutInflater().inflate(C1124R.layout.qg_view_login_item, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1124R.C1126id.qg_txt_login_item);
            textView.setText(text);
            textView.setOnClickListener(new C1398a(textView));
            ((ImageView) inflate.findViewById(C1124R.C1126id.qg_img_login_info_delete)).setOnClickListener(new C1399b(textView, inflate, linearLayout));
            linearLayout.addView(inflate, layoutParams);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setPadding(1, 1, 1, 1);
        linearLayout.setBackgroundResource(C1124R.C1125drawable.qg_account_pop_bg);
        mo12619a(linearLayout);
        m1622b(linearLayout);
        linearLayout.invalidate();
        PopupWindow popupWindow = new PopupWindow(linearLayout, this.f1185d.getWidth(), this.f1185d.getHeight() * this.f1200s.size());
        this.f1199r = popupWindow;
        popupWindow.setInputMethodMode(1);
        this.f1199r.setSoftInputMode(16);
        return this.f1199r;
    }

    /* renamed from: h */
    private void m1632h() {
        this.f1184c = this.f1182a.getWindow().getDecorView();
        this.f1185d = (LinearLayout) this.f1183b.findViewById(C1124R.C1126id.ll_email);
        this.f1186e = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_email_alert);
        this.f1187f = (TextView) this.f1183b.findViewById(C1124R.C1126id.tv_tips_email);
        this.f1188g = (EditText) this.f1183b.findViewById(C1124R.C1126id.et_email);
        this.f1189h = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_email_clear);
        this.f1190i = (TextView) this.f1183b.findViewById(C1124R.C1126id.tv_login);
        this.f1191j = (LinearLayout) this.f1183b.findViewById(C1124R.C1126id.ll_password);
        this.f1192k = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_password_alert);
        this.f1193l = (TextView) this.f1183b.findViewById(C1124R.C1126id.tv_tips_password);
        EditText editText = (EditText) this.f1183b.findViewById(C1124R.C1126id.et_password);
        this.f1194m = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f1195n = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_password_eye);
        this.f1196o = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_password_clear);
        this.f1198q = (TextView) this.f1183b.findViewById(C1124R.C1126id.tv_focus);
        this.f1202u = (FrameLayout) this.f1183b.findViewById(C1124R.C1126id.fl_email_more);
        this.f1201t = (ImageView) this.f1183b.findViewById(C1124R.C1126id.iv_email_more);
    }

    /* renamed from: i */
    private boolean m1634i() {
        String obj = this.f1188g.getText().toString();
        boolean b = C1603f.f1603a.mo13049b(obj);
        if (!b) {
            ImageView imageView = this.f1186e;
            if (!(imageView == null || this.f1187f == null)) {
                imageView.setVisibility(0);
                this.f1187f.setVisibility(0);
                this.f1187f.setTextColor(this.f1182a.getResources().getColor(C1124R.color.hw_alert_content_textColor));
                if (TextUtils.isEmpty(obj)) {
                    this.f1187f.setText(C1124R.string.hw_error_email_empty);
                } else {
                    this.f1187f.setText(C1124R.string.hw_error_email_invalid);
                }
            }
            this.f1185d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            ImageView imageView2 = this.f1186e;
            if (!(imageView2 == null || this.f1187f == null)) {
                imageView2.setVisibility(8);
                this.f1187f.setTextColor(this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                this.f1187f.setText(this.f1182a.getResources().getString(C1124R.string.hw_inputBox_email_hint));
            }
            this.f1185d.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return b;
    }

    /* renamed from: j */
    private boolean m1636j() {
        String obj = this.f1194m.getText().toString();
        boolean c = C1603f.f1603a.mo13050c(obj);
        if (!c) {
            ImageView imageView = this.f1192k;
            if (!(imageView == null || this.f1193l == null)) {
                imageView.setVisibility(0);
                this.f1193l.setVisibility(0);
                this.f1193l.setTextColor(this.f1182a.getResources().getColor(C1124R.color.hw_alert_content_textColor));
                if (TextUtils.isEmpty(obj)) {
                    this.f1193l.setText(C1124R.string.hw_error_password_empty);
                } else {
                    this.f1193l.setText(C1124R.string.hw_error_password_invalid);
                }
            }
            this.f1191j.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_error);
        } else {
            ImageView imageView2 = this.f1192k;
            if (!(imageView2 == null || this.f1193l == null)) {
                imageView2.setVisibility(8);
                this.f1193l.setTextColor(this.f1182a.getResources().getColor(C1124R.color.hw_inputBox_hint_textColor));
                this.f1187f.setText(this.f1182a.getResources().getString(C1124R.string.hw_inputBox_password_hint));
            }
            this.f1191j.setBackgroundResource(C1124R.C1125drawable.hw_inputbox_bg_normal);
        }
        return c;
    }

    /* renamed from: k */
    private void m1638k() {
        this.f1184c.getViewTreeObserver().addOnGlobalLayoutListener(new C1400c());
        C1401d dVar = new C1401d();
        this.f1188g.setOnFocusChangeListener(dVar);
        this.f1194m.setOnFocusChangeListener(dVar);
        this.f1194m.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(20)});
        this.f1188g.setFilters(new InputFilter[]{C1416e.m1674a(), new InputFilter.LengthFilter(50)});
        this.f1188g.addTextChangedListener(new C1402e());
        this.f1188g.setOnClickListener(new C1403f());
        this.f1189h.setOnClickListener(new C1404g());
        this.f1194m.addTextChangedListener(new C1405h());
        this.f1195n.setOnClickListener(new C1406i());
        this.f1196o.setOnClickListener(new C1407j());
        this.f1202u.setOnClickListener(new C1408k());
        C1607a b = C1609b.m2099d().mo13085b();
        if (b == null || b.mo13074a() == null || b.mo13074a().isEmpty()) {
            this.f1202u.setVisibility(8);
            return;
        }
        Iterator<String> it = b.mo13074a().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C1603f.f1603a.mo13049b(next)) {
                this.f1200s.add(next);
            }
        }
        if (this.f1200s.size() == 0) {
            this.f1202u.setVisibility(8);
        } else if (this.f1200s.size() == 1) {
            this.f1188g.setText(this.f1200s.get(0));
            this.f1202u.setVisibility(8);
        } else {
            this.f1202u.setVisibility(0);
            this.f1202u.setClickable(true);
            this.f1202u.setFocusable(true);
            this.f1189h.setVisibility(8);
            this.f1188g.setText(this.f1200s.get(0));
        }
    }

    /* renamed from: a */
    public String mo12618a() {
        return m1634i() ? this.f1188g.getText().toString() : "";
    }

    /* renamed from: b */
    public String mo12620b() {
        return m1636j() ? this.f1194m.getText().toString() : "";
    }

    /* renamed from: c */
    public void mo12621c() {
        this.f1197p = true;
    }

    /* renamed from: d */
    public void mo12622d() {
        Log.e("emailAndPassword", "onStop");
        PopupWindow popupWindow = this.f1199r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public void mo12623e() {
        this.f1194m.setTransformationMethod(PasswordTransformationMethod.getInstance());
        EditText editText = this.f1194m;
        editText.setSelection(editText.getText().length());
        this.f1195n.setBackgroundResource(C1124R.C1125drawable.hw_eye_close);
    }

    /* renamed from: b */
    private void m1622b(LinearLayout linearLayout) {
        linearLayout.setDividerDrawable(this.f1182a.getResources().getDrawable(C1124R.C1125drawable.qg_input_divider_s));
    }

    /* renamed from: a */
    public void mo12619a(LinearLayout linearLayout) {
        linearLayout.setShowDividers(2);
    }
}
