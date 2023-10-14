package com.quickgame.android.sdk.p034e;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.quickgame.android.sdk.C1124R;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.quickgame.android.sdk.e.g */
public class C1333g extends DialogFragment {

    /* renamed from: a */
    float f1052a;

    /* renamed from: b */
    String f1053b;

    /* renamed from: c */
    Timer f1054c;

    /* renamed from: d */
    int f1055d = 2;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f1056e = new C1334a(Looper.getMainLooper());

    /* renamed from: f */
    private C1337d f1057f = null;

    /* renamed from: com.quickgame.android.sdk.e.g$a */
    class C1334a extends Handler {
        C1334a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C1333g gVar = C1333g.this;
            int i = gVar.f1055d;
            if (i == -1) {
                try {
                    gVar.dismiss();
                } catch (IllegalStateException unused) {
                    C1333g.this.dismissAllowingStateLoss();
                }
            } else {
                gVar.f1055d = i - 1;
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.g$b */
    class C1335b implements DialogInterface.OnKeyListener {
        C1335b(C1333g gVar) {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.g$c */
    class C1336c extends TimerTask {
        C1336c() {
        }

        public void run() {
            C1333g.this.f1056e.sendEmptyMessage(1);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.g$d */
    public interface C1337d {
        /* renamed from: a */
        void mo12120a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, getTheme());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f1052a = displayMetrics.density;
        View inflate = getActivity().getLayoutInflater().inflate(C1124R.layout.qg_view_modify_success, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C1124R.C1126id.qg_txt_dialog_commit);
        if (this.f1053b.length() >= 15) {
            str = this.f1053b.substring(0, 15) + "...";
        } else {
            str = this.f1053b;
        }
        textView.setText(str);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        float f = this.f1052a;
        layoutParams.width = (int) (200.0f * f);
        layoutParams.height = (int) (f * 60.0f);
        layoutParams.type = 2008;
        layoutParams.flags = 8;
        getDialog().setContentView(inflate, layoutParams);
        getDialog().getWindow().setBackgroundDrawable(getResources().getDrawable(C1124R.C1125drawable.hw_dialog_bg));
        getDialog().setOnKeyListener(new C1335b(this));
        return null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Timer timer = this.f1054c;
        if (timer != null) {
            timer.cancel();
            this.f1054c = null;
        }
        C1337d dVar = this.f1057f;
        if (dVar != null) {
            dVar.mo12120a();
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.f1053b = str;
        super.show(fragmentManager, str);
        this.f1055d = 2;
        Timer timer = this.f1054c;
        if (timer != null) {
            timer.cancel();
            this.f1054c = null;
        }
        this.f1054c = new Timer(true);
        this.f1054c.scheduleAtFixedRate(new C1336c(), 1000, 200);
    }

    /* renamed from: a */
    public static C1333g m1503a() {
        return new C1333g();
    }

    /* renamed from: a */
    public void mo12544a(C1337d dVar) {
        this.f1057f = dVar;
    }
}
