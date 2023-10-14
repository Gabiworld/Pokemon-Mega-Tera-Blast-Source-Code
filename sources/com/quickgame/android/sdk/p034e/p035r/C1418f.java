package com.quickgame.android.sdk.p034e.p035r;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;

/* renamed from: com.quickgame.android.sdk.e.r.f */
public class C1418f {

    /* renamed from: a */
    private Activity f1242a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Dialog f1243b = null;

    /* renamed from: c */
    private FrameLayout f1244c = null;

    /* renamed from: d */
    private TextView f1245d = null;

    /* renamed from: e */
    private TextView f1246e = null;

    /* renamed from: f */
    private TextView f1247f = null;

    /* renamed from: g */
    private TextView f1248g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1422d f1249h;

    /* renamed from: com.quickgame.android.sdk.e.r.f$a */
    class C1419a implements View.OnClickListener {
        C1419a() {
        }

        public void onClick(View view) {
            C1418f.this.f1249h.mo12020c();
            C1418f.this.f1243b.dismiss();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.f$b */
    class C1420b implements View.OnClickListener {
        C1420b() {
        }

        public void onClick(View view) {
            C1418f.this.f1249h.mo12018a();
            C1418f.this.f1243b.dismiss();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.f$c */
    class C1421c implements View.OnClickListener {
        C1421c() {
        }

        public void onClick(View view) {
            C1418f.this.f1249h.mo12019b();
            C1418f.this.f1243b.dismiss();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.r.f$d */
    public interface C1422d {
        /* renamed from: a */
        void mo12018a();

        /* renamed from: b */
        void mo12019b();

        /* renamed from: c */
        void mo12020c();
    }

    public C1418f(Context context, boolean z, C1422d dVar) {
        Dialog dialog = new Dialog(context, C1124R.style.hw_activityDialog);
        this.f1243b = dialog;
        dialog.setCancelable(false);
        this.f1249h = dVar;
        this.f1242a = (Activity) context;
        View inflate = LayoutInflater.from(context).inflate(C1124R.layout.hw_base_dialog, (ViewGroup) null, false);
        m1681a(inflate, z);
        this.f1243b.setContentView(inflate);
        mo12656a();
    }

    /* renamed from: a */
    public static int m1679a(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: b */
    public static int m1682b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    private void m1681a(View view, boolean z) {
        this.f1244c = (FrameLayout) view.findViewById(C1124R.C1126id.fl_exit);
        this.f1245d = (TextView) view.findViewById(C1124R.C1126id.dialog_txt_title);
        this.f1246e = (TextView) view.findViewById(C1124R.C1126id.dialog_txt_message);
        this.f1247f = (TextView) view.findViewById(C1124R.C1126id.dialog_left_btn);
        this.f1248g = (TextView) view.findViewById(C1124R.C1126id.dialog_right_btn);
        this.f1245d.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_title_textColor));
        this.f1246e.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_content_textColor));
        if (z) {
            this.f1245d.setText(C1124R.string.hw_accountCenter_warm);
            this.f1246e.setText(C1124R.string.hw_accountCenter_msg_logout);
            this.f1247f.setText(C1124R.string.hw_accountCenter_warm_sure);
            this.f1247f.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_content_textColor_b));
            this.f1248g.setText(C1124R.string.hw_accountCenter_warm_cancel);
            this.f1248g.setBackgroundResource(C1124R.C1125drawable.hw_button_coloured_bg_selector);
            this.f1248g.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_content_textColor_a));
            return;
        }
        this.f1245d.setText(C1124R.string.hw_logout_title);
        this.f1246e.setText(C1124R.string.hw_logout_content);
        this.f1248g.setText(C1124R.string.hw_logout_ok);
        this.f1248g.setTextSize(10.0f);
        this.f1248g.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_content_textColor_b));
        this.f1247f.setText(C1124R.string.hw_logout_cancel);
        this.f1247f.setTextSize(10.0f);
        this.f1247f.setTextColor(view.getResources().getColor(C1124R.color.hw_dialog_content_textColor_a));
    }

    /* renamed from: b */
    public void mo12657b() {
        this.f1243b.show();
        if (C1128a.m798r().mo11967a((Context) this.f1242a)) {
            this.f1243b.getWindow().setLayout((m1682b((Context) this.f1242a) / 18) * 8, (m1679a((Context) this.f1242a) / 18) * 12);
            this.f1243b.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return;
        }
        this.f1243b.getWindow().setLayout((m1682b((Context) this.f1242a) / 22) * 18, (m1679a((Context) this.f1242a) / 22) * 8);
        this.f1243b.getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* renamed from: a */
    public void mo12656a() {
        this.f1247f.setOnClickListener(new C1419a());
        this.f1248g.setOnClickListener(new C1420b());
        this.f1244c.setOnClickListener(new C1421c());
    }
}
