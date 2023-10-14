package com.quickgame.android.sdk.p034e;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.activity.CheckActivity;
import com.quickgame.android.sdk.p043l.C1604g;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.quickgame.android.sdk.e.p */
public class C1377p extends C1346j {

    /* renamed from: a */
    public String f1129a = "QGUpdateProgressFragment";

    /* renamed from: b */
    int f1130b;

    /* renamed from: c */
    int f1131c;

    /* renamed from: d */
    int f1132d;

    /* renamed from: e */
    C1382c f1133e;

    /* renamed from: f */
    Timer f1134f;

    /* renamed from: g */
    TextView f1135g;

    /* renamed from: h */
    TextView f1136h;

    /* renamed from: i */
    TextView f1137i;

    /* renamed from: j */
    ProgressBar f1138j;

    /* renamed from: k */
    Button f1139k;

    /* renamed from: l */
    AlertDialog f1140l;

    /* renamed from: com.quickgame.android.sdk.e.p$a */
    class C1378a implements View.OnClickListener {

        /* renamed from: com.quickgame.android.sdk.e.p$a$a */
        class C1379a implements DialogInterface.OnClickListener {
            C1379a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C1377p.this.f1133e.mo12062b();
            }
        }

        C1378a() {
        }

        public void onClick(View view) {
            if (C1377p.this.f1140l == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(C1377p.this.getActivity());
                builder.setTitle(C1124R.string.qg_update_cancel_dia_title);
                builder.setPositiveButton(C1124R.string.hw_gp_dialog_ok, new C1379a());
                builder.setNegativeButton(C1124R.string.hw_gp_dialog_cancel, (DialogInterface.OnClickListener) null);
                C1377p.this.f1140l = builder.create();
            }
            C1377p.this.f1140l.show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.p$b */
    class C1380b extends TimerTask {

        /* renamed from: com.quickgame.android.sdk.e.p$b$a */
        class C1381a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f1144a;

            C1381a(String str) {
                this.f1144a = str;
            }

            public void run() {
                TextView textView = C1377p.this.f1136h;
                textView.setText(C1377p.this.getActivity().getString(C1124R.string.hw_update_speed) + this.f1144a);
            }
        }

        C1380b() {
        }

        public void run() {
            String str;
            C1377p pVar = C1377p.this;
            int i = pVar.f1131c;
            int i2 = i - pVar.f1132d;
            pVar.f1132d = i;
            if (i2 >= 0) {
                QGLog.m2388e("speedlength", i2 + "");
                int i3 = i2 / 1024;
                if (i3 > 1024) {
                    str = String.format("%dMB/S", new Object[]{Integer.valueOf(i3 / 1024)});
                } else {
                    str = String.format("%dKB/S", new Object[]{Integer.valueOf(i3)});
                }
                C1377p.this.getActivity().runOnUiThread(new C1381a(str));
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.p$c */
    public interface C1382c {
        /* renamed from: a */
        void mo12061a();

        /* renamed from: b */
        void mo12062b();
    }

    public C1377p() {
        new Handler();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12588a(View view) {
        Log.d(this.f1129a, "initView");
        this.f1135g = (TextView) view.findViewById(C1124R.C1126id.qg_txt_download_title);
        this.f1136h = (TextView) view.findViewById(C1124R.C1126id.qg_txt_download_speed);
        this.f1137i = (TextView) view.findViewById(C1124R.C1126id.qg_txt_download_total);
        this.f1138j = (ProgressBar) view.findViewById(C1124R.C1126id.qg_prog_download);
        Button button = (Button) view.findViewById(C1124R.C1126id.qg_btn_update_cancel);
        this.f1139k = button;
        button.setOnClickListener(new C1378a());
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    /* renamed from: b */
    public void mo12590b(int i) {
        this.f1130b = i;
    }

    /* renamed from: c */
    public void mo12591c(int i) {
        this.f1135g.setText(i);
    }

    public void onAttach(Context context) {
        this.f1133e = ((CheckActivity) context).mo12053t();
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d(this.f1129a, "onCreateView");
        View inflate = layoutInflater.inflate(C1124R.layout.qg_fg_load_update, viewGroup, false);
        mo12588a(inflate);
        return inflate;
    }

    public void onDetach() {
        this.f1133e = null;
        super.onDetach();
    }

    public void onPause() {
        this.f1134f.cancel();
        this.f1134f = null;
        super.onPause();
    }

    public void onResume() {
        int b;
        super.onResume();
        ((CheckActivity) getActivity()).mo12049a((C1346j) this);
        this.f1133e.mo12061a();
        CheckActivity.C1160b r = ((CheckActivity) getActivity()).mo12051r();
        if (!(r == null || (b = r.mo12056b()) == 0)) {
            mo12590b(b);
            int c = r.mo12057c();
            this.f1131c = c;
            this.f1132d = c;
        }
        this.f1134f = new Timer();
        this.f1134f.scheduleAtFixedRate(new C1380b(), 10, 1000);
    }

    /* renamed from: a */
    public void mo12587a(int i) {
        this.f1131c = i;
        double d = (double) i;
        Double.isNaN(d);
        double d2 = (double) this.f1130b;
        Double.isNaN(d2);
        String format = String.format("%.1fM/ 共%.1fM", new Object[]{Double.valueOf(d / 1048576.0d), Double.valueOf(d2 / 1048576.0d)});
        TextView textView = this.f1137i;
        textView.setText(getActivity().getString(C1124R.string.hw_update_progress) + format);
        Double.isNaN(d);
        double d3 = (double) this.f1130b;
        Double.isNaN(d3);
        this.f1138j.setProgress((int) (((d * 1.0d) / d3) * 100.0d));
    }

    /* renamed from: a */
    public void mo12589a(String str) {
        C1604g.f1604a.mo13052a(str);
    }
}
