package com.quickgame.android.sdk.p034e;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.activity.HWWebViewActivity;
import com.quickgame.android.sdk.p034e.p035r.C1393b;
import com.quickgame.android.sdk.p034e.p035r.C1409d;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p036f.C1428d;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1604g;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.e.k */
public class C1347k extends C1346j {

    /* renamed from: a */
    private View f1076a = null;

    /* renamed from: b */
    private FrameLayout f1077b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1409d f1078c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CheckBox f1079d = null;

    /* renamed from: e */
    private TextView f1080e = null;

    /* renamed from: f */
    private TextView f1081f = null;

    /* renamed from: g */
    private LinearLayout f1082g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1356i f1083h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f1084i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1393b f1085j = null;

    /* renamed from: k */
    private Activity f1086k = null;

    /* renamed from: l */
    private CountDownTimer f1087l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public SharedPreferences f1088m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f1089n;

    /* renamed from: o */
    public boolean f1090o = true;

    /* renamed from: com.quickgame.android.sdk.e.k$a */
    class C1348a implements View.OnKeyListener {
        C1348a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C1347k.this.f1083h.mo12192a();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$b */
    class C1349b implements View.OnClickListener {
        C1349b() {
        }

        public void onClick(View view) {
            C1347k.this.f1083h.mo12192a();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$c */
    class C1350c implements CompoundButton.OnCheckedChangeListener {
        C1350c() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferences.Editor edit = C1347k.this.f1088m.edit();
            if (C1347k.this.f1089n != z) {
                boolean unused = C1347k.this.f1089n = z;
                edit.putBoolean("isChecked", z);
            }
            edit.apply();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$d */
    class C1351d implements View.OnClickListener {
        C1351d() {
        }

        public void onClick(View view) {
            if (C1347k.this.f1079d.isChecked()) {
                String d = C1347k.this.f1078c.mo12643d();
                String b = C1347k.this.f1078c.mo12641b();
                String str = null;
                if (C1541g.m1887a().f1489l || C1538f.m1861l().mo12843e().mo13107d().mo13099h()) {
                    str = C1347k.this.f1078c.mo12642c();
                }
                if (("".equals(b) ^ true) && (!"".equals(d))) {
                    C1347k.this.f1083h.mo12194a(b, d, str);
                    return;
                }
                return;
            }
            C1347k.this.f1078c.mo12640a(C1347k.this.getString(C1124R.string.hw_register_agree_error));
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$e */
    class C1352e implements View.OnClickListener {
        C1352e() {
        }

        public void onClick(View view) {
            if (TextUtils.isEmpty(C1538f.m1861l().f1475l)) {
                C1347k.this.m1527b();
            } else {
                HWWebViewActivity.m1221a(C1347k.this.getActivity(), C1347k.this.getString(C1124R.string.agree), C1538f.m1861l().f1475l);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$f */
    class C1353f implements View.OnClickListener {
        C1353f() {
        }

        public void onClick(View view) {
            String a = C1347k.this.f1085j.mo12610a();
            if ("".equals(a)) {
                Log.d("RegisterFragment", "email is empty");
                return;
            }
            C1347k.this.f1083h.mo12193a(a);
            C1347k.this.m1523a(60);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$g */
    class C1354g extends CountDownTimer {
        C1354g(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C1347k.this.f1084i.setText(C1347k.this.getString(C1124R.string.hw_inputBox_resendCode));
            C1347k.this.f1084i.setClickable(true);
            C1347k.this.f1084i.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_selector);
        }

        public void onTick(long j) {
            TextView h = C1347k.this.f1084i;
            h.setText((j / 1000) + "s");
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$h */
    class C1355h implements C1426b<JSONObject> {
        C1355h() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C1538f.m1861l().f1475l = optJSONObject == null ? "" : optJSONObject.optString("agreement");
            HWWebViewActivity.m1221a(C1347k.this.getActivity(), C1347k.this.getString(C1124R.string.agree), C1538f.m1861l().f1475l);
        }

        public void onFailed(C1427c cVar) {
            Log.d("RegisterFragment", "user agreement link error.");
            String b = cVar.mo12663b();
            if (TextUtils.isEmpty(b)) {
                b = C1347k.this.getString(C1124R.string.qg_err_connect_service);
            }
            C1604g.f1604a.mo13052a(b);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.k$i */
    public interface C1356i {
        /* renamed from: a */
        void mo12192a();

        /* renamed from: a */
        void mo12193a(String str);

        /* renamed from: a */
        void mo12194a(String str, String str2, String str3);
    }

    /* renamed from: a */
    public void mo12560a(String str) {
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f1086k = getActivity();
        m1528c();
        m1533e();
        this.f1085j = new C1393b(this.f1086k, this.f1076a);
        C1409d dVar = new C1409d(this.f1086k, this.f1076a);
        this.f1078c = dVar;
        dVar.mo12644e();
        SharedPreferences preferences = this.f1086k.getPreferences(0);
        this.f1088m = preferences;
        boolean z = preferences.getBoolean("isChecked", false);
        this.f1089n = z;
        if (z) {
            this.f1079d.setChecked(true);
        } else {
            this.f1079d.setChecked(false);
        }
        if (C1128a.m798r().mo11999l().showServicesAndPrivacyPolicy()) {
            this.f1079d.setChecked(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_register, viewGroup, false);
        this.f1076a = inflate;
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1087l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f1090o) {
            this.f1078c.mo12639a();
            this.f1090o = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1527b() {
        C1428d.m1703a("/v1/system/getAgreement", (Map<String, Object>) null, (C1426b<JSONObject>) new C1355h());
    }

    /* renamed from: c */
    private void m1528c() {
        this.f1077b = (FrameLayout) this.f1076a.findViewById(C1124R.C1126id.fl_exit);
        this.f1079d = (CheckBox) this.f1076a.findViewById(C1124R.C1126id.cb_agree);
        this.f1080e = (TextView) this.f1076a.findViewById(C1124R.C1126id.tv_signUp);
        this.f1081f = (TextView) this.f1076a.findViewById(C1124R.C1126id.tv_user_agreement);
        this.f1084i = (TextView) this.f1076a.findViewById(C1124R.C1126id.tv_code_resend);
        this.f1082g = (LinearLayout) this.f1076a.findViewById(C1124R.C1126id.ll_code);
        if (C1541g.m1887a().f1489l || C1538f.m1861l().mo12843e().mo13107d().mo13099h()) {
            this.f1082g.setVisibility(0);
        } else {
            this.f1082g.setVisibility(8);
        }
        if (C1128a.m798r().mo11999l().showServicesAndPrivacyPolicy()) {
            this.f1079d.setVisibility(4);
            this.f1081f.setVisibility(8);
        }
    }

    /* renamed from: d */
    public static C1347k m1531d() {
        return new C1347k();
    }

    /* renamed from: e */
    private void m1533e() {
        this.f1076a.setFocusableInTouchMode(true);
        this.f1076a.requestFocus();
        this.f1076a.setOnKeyListener(new C1348a());
        this.f1077b.setOnClickListener(new C1349b());
        this.f1079d.setOnCheckedChangeListener(new C1350c());
        this.f1080e.setOnClickListener(new C1351d());
        this.f1081f.setOnClickListener(new C1352e());
        this.f1084i.setOnClickListener(new C1353f());
    }

    /* renamed from: a */
    public void mo12559a(C1356i iVar) {
        this.f1083h = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1523a(long j) {
        this.f1084i.setClickable(false);
        this.f1084i.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_unclickable);
        C1354g gVar = new C1354g(j * 1000, 1000);
        this.f1087l = gVar;
        gVar.start();
    }
}
