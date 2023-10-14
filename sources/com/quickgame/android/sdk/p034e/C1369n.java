package com.quickgame.android.sdk.p034e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.activity.CheckActivity;
import com.quickgame.android.sdk.model.C1611c;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p043l.C1601d;

/* renamed from: com.quickgame.android.sdk.e.n */
public class C1369n extends C1346j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f1120a = "";

    /* renamed from: com.quickgame.android.sdk.e.n$a */
    class C1370a implements View.OnClickListener {
        C1370a() {
        }

        public void onClick(View view) {
            Log.d("QGUpdateFragment", "downloadBtn onClick");
            try {
                if (!TextUtils.isEmpty(C1369n.this.f1120a)) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + C1369n.this.f1120a));
                    intent.setPackage("com.android.vending");
                    intent.addFlags(268435456);
                    C1369n.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.n$b */
    class C1371b implements View.OnClickListener {
        C1371b() {
        }

        public void onClick(View view) {
            if (C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                Process.killProcess(Process.myPid());
            } else {
                C1369n.this.getActivity().finish();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.n$c */
    class C1372c extends OnBackPressedCallback {
        C1372c(boolean z) {
            super(z);
        }

        public void handleOnBackPressed() {
            if (!C1538f.m1861l().mo12843e().mo13101a().mo13090d()) {
                C1369n.this.getActivity().finish();
            }
        }
    }

    /* renamed from: b */
    public static C1369n m1570b() {
        return new C1369n();
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new C1372c(true));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.qg_dialog_update, viewGroup, false);
        mo12582a(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        ((CheckActivity) getActivity()).mo12049a((C1346j) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12582a(View view) {
        TextView textView = (TextView) view.findViewById(C1124R.C1126id.qg_txt_download_title);
        Button button = (Button) view.findViewById(C1124R.C1126id.qg_btn_update_later);
        Button button2 = (Button) view.findViewById(C1124R.C1126id.qg_btn_update_now);
        C1613e e = C1538f.m1861l().mo12843e();
        C1611c a = e.mo13101a();
        try {
            Log.d("QGUpdateFragment", "newVersion.getDownloadUrl()=" + a.mo13087a());
            this.f1120a = a.mo13087a().split("=")[1];
            Log.d("QGUpdateFragment", "appPkg=" + this.f1120a);
            Log.d("QGUpdateFragment", "appPkg=" + this.f1120a);
            String str = view.getResources().getString(C1124R.string.hw_update_new_version) + " " + e.mo13101a().mo13089c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getActivity().getResources().getColor(C1124R.color.qg_txt_orange)), str.indexOf(e.mo13101a().mo13089c() + ""), str.length(), 33);
            ((TextView) view.findViewById(C1124R.C1126id.qg_txt_new_version)).setText(spannableStringBuilder);
            String b = C1601d.m2067b(getActivity());
            String str2 = view.getResources().getString(C1124R.string.hw_update_current_version) + " " + b;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(getActivity().getResources().getColor(C1124R.color.qg_txt_orange)), str2.indexOf(b + ""), str2.length(), 33);
            ((TextView) view.findViewById(C1124R.C1126id.qg_txt_cur_version)).setText(spannableStringBuilder2);
            button2.setOnClickListener(new C1370a());
            button.setOnClickListener(new C1371b());
        } catch (Exception unused) {
            Log.d("QGUpdateFragment", "get appPkg error.please check your backstage settings.");
            Toast.makeText(getActivity(), getActivity().getString(C1124R.string.hw_renew_error_tips), 1).show();
            getActivity().finish();
        }
    }
}
