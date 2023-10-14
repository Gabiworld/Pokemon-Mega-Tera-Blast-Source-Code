package com.quickgame.android.sdk.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1619a;
import com.quickgame.android.sdk.p034e.C1333g;
import com.quickgame.android.sdk.p034e.p035r.C1386a;
import com.quickgame.android.sdk.p034e.p035r.C1393b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p039h.C1544i;
import com.quickgame.android.sdk.p043l.C1603f;
import com.quickgame.android.sdk.p043l.C1604g;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class BindEmailActivity extends MvpBaseActivity<C1619a> implements C1619a.C1620a, TextView.OnEditorActionListener {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1393b f632c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1386a f633d = null;

    /* renamed from: e */
    private TextView f634e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f635f = null;

    /* renamed from: g */
    private CountDownTimer f636g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f637h = false;

    /* renamed from: com.quickgame.android.sdk.activity.BindEmailActivity$a */
    class C1149a implements View.OnClickListener {
        C1149a() {
        }

        public void onClick(View view) {
            BindEmailActivity.this.setResult(PointerIconCompat.TYPE_CONTEXT_MENU);
            BindEmailActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindEmailActivity$b */
    class C1150b implements View.OnClickListener {
        C1150b() {
        }

        public void onClick(View view) {
            String a = BindEmailActivity.this.f633d.mo12597a();
            String b = BindEmailActivity.this.f633d.mo12599b();
            String a2 = BindEmailActivity.this.f632c.mo12610a();
            if (!"".equals(a) && !"".equals(b) && !"".equals(a2)) {
                BindEmailActivity bindEmailActivity = BindEmailActivity.this;
                bindEmailActivity.mo12282w(bindEmailActivity.getString(C1124R.string.qg_msg_committing));
                ((C1619a) BindEmailActivity.this.f1648b).mo13111a(a2, a, b);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindEmailActivity$c */
    class C1151c implements View.OnClickListener {
        C1151c() {
        }

        public void onClick(View view) {
            BindEmailActivity.this.m907t();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindEmailActivity$d */
    class C1152d extends CountDownTimer {
        C1152d(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            BindEmailActivity.this.f635f.setText(BindEmailActivity.this.getString(C1124R.string.hw_inputBox_resendCode));
            BindEmailActivity.this.f635f.setClickable(true);
            BindEmailActivity.this.f635f.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_selector);
            boolean unused = BindEmailActivity.this.f637h = false;
        }

        public void onTick(long j) {
            TextView e = BindEmailActivity.this.f635f;
            e.setText((j / 1000) + "s");
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.BindEmailActivity$e */
    class C1153e implements DialogInterface.OnDismissListener {
        C1153e(BindEmailActivity bindEmailActivity) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: s */
    private void m906s() {
        this.f632c = new C1393b(this);
        this.f633d = new C1386a(this);
        this.f634e = (TextView) findViewById(C1124R.C1126id.tv_submit);
        this.f635f = (TextView) findViewById(C1124R.C1126id.tv_code_resend);
        findViewById(C1124R.C1126id.fl_back).setOnClickListener(new C1149a());
        this.f632c.mo12611a((TextView.OnEditorActionListener) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m907t() {
        Pattern.compile("(\\w*)[A-Z]");
        String a = this.f632c.mo12610a();
        if (C1603f.f1603a.mo13049b(a)) {
            if (!this.f637h) {
                m899a(60);
                mo12282w("");
                ((C1619a) this.f1648b).mo13110a(a, 2);
            }
        } else if (TextUtils.isEmpty(a)) {
            Log.e("QGBindEmailActivity", "邮箱为空");
            C1604g.f1604a.mo13051a(this, getString(C1124R.string.hw_error_email_empty));
        } else {
            Log.e("QGBindEmailActivity", "邮箱格式不对");
            C1604g.f1604a.mo13051a(this, getString(C1124R.string.hw_error_email_invalid));
        }
    }

    /* renamed from: u */
    private void m908u() {
        this.f634e.setOnClickListener(new C1150b());
        this.f635f.setOnClickListener(new C1151c());
    }

    /* renamed from: l */
    public void mo12028l(String str) {
        mo12280p();
        try {
            String optString = new JSONObject(str).optString("message", "");
            if (!TextUtils.isEmpty(optString)) {
                C1604g.f1604a.mo13051a(this, optString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public void mo12029o() {
        mo12280p();
        C1333g.m1503a().show(getSupportFragmentManager(), getString(C1124R.string.hw_msg_send_code_successful));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_bind_email);
        getWindow().addFlags(67108864);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
        getWindow().getDecorView().setSystemUiVisibility(6);
        m906s();
        m908u();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            CountDownTimer countDownTimer = this.f636g;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Log.d("QGBindEmailActivity", "event: " + keyEvent);
        Log.d("QGBindEmailActivity", "v.getImeActionId(): " + textView.getImeActionId());
        Log.d("QGBindEmailActivity", "v.getImeOptions(): " + textView.getImeOptions());
        Log.d("QGBindEmailActivity", "----------------------------------------------");
        m902b(textView, i);
        return true;
    }

    /* renamed from: p */
    public void mo12031p(String str) {
        mo12280p();
        C1604g.f1604a.mo13051a(this, getString(C1124R.string.sdk_bind_success));
        try {
            C1538f.m1861l().mo12828a(C1544i.m1890a(new JSONObject(str).optJSONObject("userData").optJSONObject("bindInfo")));
            C1538f.m1861l().mo12834a(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            finish();
        }
    }

    /* renamed from: b */
    private void m902b(View view, int i) {
        if (i == 5) {
            Log.d("QGBindEmailActivity", "IME_ACTION_NEXT");
            if (view.getId() == C1124R.C1126id.et_email) {
                m907t();
            }
        }
    }

    /* renamed from: r */
    public C1619a m914r() {
        return new C1619a(this);
    }

    /* renamed from: a */
    private void m899a(long j) {
        this.f635f.setClickable(false);
        this.f635f.setBackgroundResource(C1124R.C1125drawable.hw_button_send_bg_unclickable);
        C1152d dVar = new C1152d(j * 1000, 1000);
        this.f636g = dVar;
        dVar.start();
        this.f637h = true;
    }

    /* renamed from: a */
    public void mo12027a(C1427c cVar) {
        mo12280p();
        try {
            if (cVar.mo12662a() == 40045) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(C1124R.string.hw_accountCenter_warm);
                builder.setMessage(C1124R.string.hw_accountCenter_email_band);
                builder.setPositiveButton(C1124R.string.hw_network_dialog_ok, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                create.setOnDismissListener(new C1153e(this));
                create.show();
                return;
            }
            C1604g.f1604a.mo13051a(this, cVar.mo12663b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
