package com.quickgame.android.sdk.p034e;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.thirdlogin.C1684b;
import com.quickgame.android.sdk.thirdlogin.C1687c;
import com.quickgame.android.sdk.thirdlogin.C1690d;
import com.quickgame.android.sdk.thirdlogin.C1691e;
import com.quickgame.android.sdk.thirdlogin.C1693f;
import com.quickgame.android.sdk.thirdlogin.C1695g;
import com.quickgame.android.sdk.thirdlogin.C1710i;
import com.quickgame.android.sdk.thirdlogin.C1711j;
import com.quickgame.android.sdk.thirdlogin.TwitterManager;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.quickgame.android.sdk.e.d */
public class C1308d extends DialogFragment implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public short f1017a = 3000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f1018b;

    /* renamed from: c */
    private TextView f1019c;

    /* renamed from: d */
    private TextView f1020d;

    /* renamed from: e */
    private ImageView f1021e;

    /* renamed from: f */
    private ProgressBar f1022f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Timer f1023g;

    /* renamed from: h */
    private String f1024h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f1025i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1320l f1026j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f1027k = new C1310b(Looper.getMainLooper());

    /* renamed from: com.quickgame.android.sdk.e.d$a */
    class C1309a implements Runnable {
        C1309a() {
        }

        public void run() {
            try {
                C1308d.this.dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
            if (C1308d.this.f1026j != null) {
                C1308d.this.f1026j.mo12160e();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$b */
    class C1310b extends Handler {
        C1310b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C1308d.m1461a(C1308d.this, 500);
            QGLog.m2386d("QGAutoLoginFragment", "handleMessage restTime " + C1308d.this.f1017a);
            if (C1308d.this.f1017a < 1000) {
                C1308d.this.f1018b.setClickable(false);
            }
            if (C1308d.this.f1017a < 500) {
                if (C1308d.this.f1023g != null) {
                    C1308d.this.f1023g.cancel();
                }
                Timer unused = C1308d.this.f1023g = null;
                C1308d.this.f1018b.setVisibility(8);
                if (C1308d.this.getDialog() != null) {
                    C1308d.this.getDialog().setCancelable(false);
                }
                C1308d.this.f1026j.mo12161o(C1308d.this.f1025i);
            } else if (C1308d.this.isAdded() && C1308d.this.getDialog() != null && C1308d.this.getDialog().isShowing() && C1308d.this.f1017a / 1000 != 0) {
                TextView b = C1308d.this.f1018b;
                C1308d dVar = C1308d.this;
                b.setText(dVar.m1456a(C1308d.this.getString(C1124R.string.hw_switch_account) + " " + (C1308d.this.f1017a / 1000) + "s", (C1308d.this.f1017a / 1000) + "s"));
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$c */
    class C1311c extends C1710i {
        C1311c(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGAutoLoginFragment", "google logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$d */
    class C1312d extends C1710i {
        C1312d(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.e("QGAutoLoginFragment", "google logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$e */
    class C1313e extends C1710i {
        C1313e(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.d("QGAutoLoginFragment", "Facebook logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$f */
    class C1314f extends C1710i {
        C1314f(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.e("QGAutoLoginFragment", "naver logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$g */
    class C1315g extends C1710i {
        C1315g(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.e("QGAutoLoginFragment", "twitter logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$h */
    class C1316h extends C1710i {
        C1316h(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.e("QGAutoLoginFragment", "line logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$i */
    class C1317i extends C1710i {
        C1317i(C1308d dVar) {
        }

        /* renamed from: a */
        public void mo12021a() {
            Log.e("QGAutoLoginFragment", "line logout");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$j */
    class C1318j extends TimerTask {
        C1318j() {
        }

        public void run() {
            C1308d.this.f1027k.sendEmptyMessage(1);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$k */
    private static class C1319k extends ClickableSpan {
        private C1319k() {
        }

        public void onClick(View view) {
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ContextCompat.getColor(C1128a.m798r().mo11981e(), C1124R.color.sdk_auto_login_countdown_tv));
        }

        /* synthetic */ C1319k(C1310b bVar) {
            this();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.d$l */
    public interface C1320l {
        /* renamed from: c */
        void mo12159c();

        /* renamed from: e */
        void mo12160e();

        /* renamed from: o */
        void mo12161o(String str);
    }

    public void onClick(View view) {
        QGLog.m2386d("QGAutoLoginFragment", "onClick restTime " + this.f1017a);
        Timer timer = this.f1023g;
        if (timer != null) {
            timer.cancel();
            this.f1023g = null;
        }
        this.f1027k.removeMessages(1);
        dismissAllowingStateLoss();
        if (C1613e.f1633p && C1541g.m1887a().f1488k) {
            C1687c cVar = new C1687c();
            cVar.mo13201a(getActivity(), new C1311c(this));
            cVar.mo13198a();
        }
        if (C1613e.f1635r) {
            C1695g b = C1695g.m2347b((Activity) getActivity());
            b.mo13231b((C1690d) new C1312d(this));
            b.mo13233c();
        }
        if (C1613e.f1631n && C1541g.m1887a().f1487j) {
            C1684b bVar = new C1684b();
            bVar.mo13196a((C1690d) new C1313e(this));
            bVar.mo13193a();
        }
        if (C1613e.f1634q) {
            C1693f fVar = new C1693f();
            fVar.mo13217a((C1690d) new C1314f(this));
            fVar.mo13219c(C1128a.m798r().mo11968b());
        }
        if (C1613e.f1636s) {
            TwitterManager twitterManager = new TwitterManager();
            twitterManager.mo13180a((C1690d) new C1315g(this));
            twitterManager.mo13174a();
        }
        if (C1613e.f1637t) {
            C1691e eVar = new C1691e();
            eVar.mo13212a((C1690d) new C1316h(this));
            eVar.mo13207a();
        }
        if (C1613e.f1638u) {
            C1711j jVar = new C1711j();
            jVar.mo13262a((C1690d) new C1317i(this));
            jVar.mo13258a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, getTheme());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_name")) {
            this.f1024h = arguments.getString("user_name");
            this.f1025i = arguments.getString("last_token");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = View.inflate(getActivity(), C1124R.layout.qg_view_waitting_auto, (ViewGroup) null);
        this.f1019c = (TextView) inflate.findViewById(C1124R.C1126id.qg_txt_auto_account);
        if (!TextUtils.isEmpty(this.f1024h)) {
            if (this.f1024h.length() >= 15) {
                str = this.f1024h.substring(0, 15) + "...";
            } else {
                str = this.f1024h;
            }
            this.f1019c.setText(str);
        } else {
            this.f1019c.setVisibility(8);
        }
        this.f1020d = (TextView) inflate.findViewById(C1124R.C1126id.qg_txt_auto_login_state);
        TextView textView = (TextView) inflate.findViewById(C1124R.C1126id.qg_btn_login_calcel_auto);
        this.f1018b = textView;
        textView.setOnClickListener(this);
        this.f1022f = (ProgressBar) inflate.findViewById(C1124R.C1126id.qg_prog_login);
        this.f1021e = (ImageView) inflate.findViewById(C1124R.C1126id.qg_img_login_success_state);
        if (!(getDialog() == null || getDialog().getWindow() == null)) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setCancelable(false);
        TextView textView2 = this.f1018b;
        textView2.setText(m1456a(getString(C1124R.string.hw_switch_account) + " " + (this.f1017a / 1000) + "s", (this.f1017a / 1000) + "s"));
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Timer timer = this.f1023g;
        if (timer != null) {
            timer.cancel();
            this.f1023g = null;
        }
        QGLog.m2386d("QGAutoLoginFragment", "onDismiss restTime " + this.f1017a);
        if (this.f1017a > 500 && this.f1026j != null) {
            QGLog.m2386d("QGAutoLoginFragment", "onAutoLoginCancel");
            this.f1026j.mo12159c();
        }
        super.onDismiss(dialogInterface);
    }

    public void onPause() {
        super.onPause();
        dismissAllowingStateLoss();
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        fragmentTransaction.add((Fragment) this, str);
        int commitAllowingStateLoss = fragmentTransaction.commitAllowingStateLoss();
        this.f1023g = new Timer(true);
        this.f1023g.scheduleAtFixedRate(new C1318j(), 1000, 500);
        return commitAllowingStateLoss;
    }

    /* renamed from: a */
    static /* synthetic */ short m1461a(C1308d dVar, int i) {
        short s = (short) (dVar.f1017a - i);
        dVar.f1017a = s;
        return s;
    }

    /* renamed from: a */
    public static C1308d m1457a(String str, String str2, C1320l lVar) {
        return m1458a(str, str2, lVar, false);
    }

    /* renamed from: a */
    public static C1308d m1458a(String str, String str2, C1320l lVar, boolean z) {
        C1308d dVar = new C1308d();
        Bundle bundle = new Bundle();
        bundle.putString("user_name", str);
        bundle.putString("last_token", str2);
        dVar.setArguments(bundle);
        dVar.f1026j = lVar;
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SpannableStringBuilder m1456a(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            return new SpannableStringBuilder(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.clearSpans();
        SpannableStringBuilder replace = spannableStringBuilder.replace(indexOf, str2.length() + indexOf, str2);
        C1319k kVar = new C1319k((C1310b) null);
        replace.length();
        replace.setSpan(kVar, indexOf, str2.length() + indexOf, 33);
        return replace;
    }

    /* renamed from: a */
    public void mo12525a() {
        if (!TextUtils.isEmpty(this.f1024h)) {
            String str = null;
            String userName = C1538f.m1861l().mo12847i().getUserName();
            if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(this.f1024h) && ((userName.equals(this.f1024h) || userName.contains(this.f1024h) || this.f1024h.contains(userName)) && this.f1026j != null)) {
                str = this.f1024h;
            }
            if (C1538f.m1861l().mo12847i().isGuest() && isAdded()) {
                str = getString(C1124R.string.hw_guest);
                this.f1024h = getString(C1124R.string.hw_guest);
            }
            if (str != null && !TextUtils.isEmpty(str)) {
                if (str.length() >= 15) {
                    str = str.substring(0, 15) + "...";
                }
                this.f1019c.setText(str);
            }
        }
        this.f1020d.setText(C1124R.string.hw_login_success);
        this.f1022f.setVisibility(8);
        this.f1021e.setVisibility(0);
        if (getActivity() != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new C1309a(), 500);
        }
    }
}
