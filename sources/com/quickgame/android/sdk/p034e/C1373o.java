package com.quickgame.android.sdk.p034e;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.activity.CheckActivity;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.e.o */
public class C1373o extends C1346j implements View.OnClickListener {

    /* renamed from: a */
    public String f1124a = "QGUpdateNormalFragment";

    /* renamed from: b */
    private C1376c f1125b;

    /* renamed from: c */
    private Button f1126c;

    /* renamed from: com.quickgame.android.sdk.e.o$a */
    class C1374a extends OnBackPressedCallback {
        C1374a(boolean z) {
            super(z);
        }

        public void handleOnBackPressed() {
            if (!C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                C1373o.this.getActivity().finish();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.o$b */
    class C1375b implements View.OnClickListener {
        C1375b() {
        }

        public void onClick(View view) {
            if (C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                Process.killProcess(Process.myPid());
            } else {
                C1373o.this.getActivity().finish();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.o$c */
    public interface C1376c {
        /* renamed from: a */
        void mo12063a(String str);
    }

    /* renamed from: b */
    public static C1373o m1573b() {
        return new C1373o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12585a(View view) {
        Log.d(this.f1124a, "initView");
        this.f1126c = (Button) view.findViewById(C1124R.C1126id.qg_btn_update_now);
        C1613e e = C1538f.m1861l().mo12843e();
        String str = view.getResources().getString(C1124R.string.hw_update_new_version) + " " + e.mo13101a().mo13089c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getActivity().getResources().getColor(C1124R.color.qg_txt_orange)), str.indexOf(e.mo13101a().mo13089c() + ""), str.length(), 33);
        ((TextView) view.findViewById(C1124R.C1126id.qg_txt_new_version)).setText(spannableStringBuilder);
        String b = C1601d.m2067b(getActivity());
        String str2 = view.getResources().getString(C1124R.string.hw_update_current_version) + " " + b;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(getActivity().getResources().getColor(C1124R.color.qg_txt_orange)), str2.indexOf(b + ""), str2.length(), 33);
        ((TextView) view.findViewById(C1124R.C1126id.qg_txt_cur_version)).setText(spannableStringBuilder2);
        view.findViewById(C1124R.C1126id.qg_btn_update_later).setOnClickListener(new C1375b());
        this.f1126c.setOnClickListener(this);
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f1125b = ((CheckActivity) context).mo12052s();
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new C1374a(true));
    }

    public void onClick(View view) {
        if (view.getId() == this.f1126c.getId()) {
            this.f1125b.mo12063a(C1538f.m1861l().mo12843e().mo13101a().mo13087a());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.qg_dialog_update, viewGroup, false);
        mo12585a(inflate);
        return inflate;
    }

    public void onDetach() {
        this.f1125b = null;
        super.onDetach();
    }

    public void onResume() {
        ((CheckActivity) getActivity()).mo12049a((C1346j) this);
        super.onResume();
    }
}
