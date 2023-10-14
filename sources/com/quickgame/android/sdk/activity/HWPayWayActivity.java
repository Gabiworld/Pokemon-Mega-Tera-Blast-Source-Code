package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGOrderInfo;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.innerbean.PayType;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p040i.C1576c;

public class HWPayWayActivity extends Activity {

    /* renamed from: a */
    private TextView f877a = null;

    /* renamed from: b */
    private TextView f878b = null;

    /* renamed from: c */
    private TextView f879c = null;

    /* renamed from: d */
    private LinearLayout f880d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public QGOrderInfo f881e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public QGRoleInfo f882f;

    /* renamed from: g */
    private FrameLayout f883g = null;

    /* renamed from: com.quickgame.android.sdk.activity.HWPayWayActivity$a */
    class C1244a implements View.OnClickListener {
        C1244a() {
        }

        public void onClick(View view) {
            C1576c.m1961b().mo12897a(C1128a.m798r().mo11968b(), HWPayWayActivity.this.f881e, HWPayWayActivity.this.f882f);
            HWPayWayActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWPayWayActivity$b */
    class C1245b implements View.OnClickListener {
        C1245b() {
        }

        public void onClick(View view) {
            C1576c.m1961b().mo12900b(C1128a.m798r().mo11968b(), HWPayWayActivity.this.f881e, HWPayWayActivity.this.f882f);
            HWPayWayActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWPayWayActivity$c */
    class C1246c implements View.OnClickListener {
        C1246c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(HWPayWayActivity.this, HWPayActivity.class);
            intent.putExtra("orderInfo", HWPayWayActivity.this.f881e);
            intent.putExtra("roleInfo", HWPayWayActivity.this.f882f);
            HWPayWayActivity.this.startActivity(intent);
            HWPayWayActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWPayWayActivity$d */
    class C1247d implements View.OnClickListener {
        C1247d() {
        }

        public void onClick(View view) {
            C1128a.m798r().mo11995j().onPayCancel(HWPayWayActivity.this.f881e.getOrderSubject(), HWPayWayActivity.this.f881e.getQkOrderNo(), "5");
            HWPayWayActivity.this.finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.HWPayWayActivity$e */
    class C1248e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f888a;

        C1248e(String str) {
            this.f888a = str;
        }

        public void onClick(View view) {
            Intent intent = new Intent(HWPayWayActivity.this, HWPayActivity.class);
            intent.putExtra("orderInfo", HWPayWayActivity.this.f881e);
            intent.putExtra("roleInfo", HWPayWayActivity.this.f882f);
            intent.putExtra("payType", this.f888a);
            HWPayWayActivity.this.startActivity(intent);
            HWPayWayActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_paymentmethod);
        this.f881e = (QGOrderInfo) getIntent().getParcelableExtra("orderInfo");
        this.f882f = (QGRoleInfo) getIntent().getParcelableExtra("roleInfo");
        m1217a();
        m1220b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Log.d("PayWayActivity", "onDestroy");
        super.onDestroy();
        C1128a.f605p = true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C1128a.m798r().mo11995j().onPayCancel(this.f881e.getOrderSubject(), this.f881e.getQkOrderNo(), QGConstant.LOGIN_OPEN_TYPE_FACEBOOK);
            Log.d("PayWayActivity", "amount:" + this.f881e.getAmount() + " goodsId:" + this.f881e.getGoodsId() + " orderId:" + this.f881e.getProductOrderId());
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    private void m1217a() {
        this.f877a = (TextView) findViewById(C1124R.C1126id.tv_googlePlay);
        this.f878b = (TextView) findViewById(C1124R.C1126id.tv_oneStore);
        this.f879c = (TextView) findViewById(C1124R.C1126id.tv_otherPayment);
        this.f883g = (FrameLayout) findViewById(C1124R.C1126id.fl_exit);
        LinearLayout linearLayout = (LinearLayout) findViewById(C1124R.C1126id.tv_discountPayment);
        this.f880d = linearLayout;
        linearLayout.setVisibility(0);
        this.f877a.setOnClickListener(new C1244a());
        this.f878b.setOnClickListener(new C1245b());
        String c = C1538f.m1861l().mo12843e().mo13106c();
        c.hashCode();
        char c2 = 65535;
        switch (c.hashCode()) {
            case 51:
                if (c.equals("3")) {
                    c2 = 0;
                    break;
                }
                break;
            case 52:
                if (c.equals("4")) {
                    c2 = 1;
                    break;
                }
                break;
            case 56:
                if (c.equals(QGConstant.LOGIN_OPEN_TYPE_GOOGLE)) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f877a.setVisibility(0);
                this.f878b.setVisibility(8);
                break;
            case 1:
                this.f877a.setVisibility(8);
                this.f878b.setVisibility(8);
                break;
            case 2:
                this.f878b.setVisibility(0);
                this.f877a.setVisibility(8);
                break;
        }
        this.f879c.setOnClickListener(new C1246c());
        this.f883g.setOnClickListener(new C1247d());
    }

    /* renamed from: b */
    private void m1220b() {
        if (C1538f.m1861l().mo12843e().mo13104b() != null && !C1538f.m1861l().mo12843e().mo13104b().isEmpty()) {
            for (PayType next : C1538f.m1861l().mo12843e().mo13104b()) {
                m1218a(next.getShowName(), next.getParams());
            }
        }
    }

    /* renamed from: a */
    private void m1218a(String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(C1124R.layout.hw_activity_paymentmethod_item_discount, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(C1124R.C1126id.tv_item_discount);
        textView.setText(str);
        textView.setOnClickListener(new C1248e(str2));
        this.f880d.addView(linearLayout);
    }
}
