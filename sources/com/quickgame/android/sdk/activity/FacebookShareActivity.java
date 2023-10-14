package com.quickgame.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.ShareApi;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.facebook.p037ui.view.ChoiceBar;
import com.quickgame.android.sdk.facebook.p037ui.view.ChoiceBarTab;
import com.quickgame.android.sdk.mvp.MvpBaseActivity;
import com.quickgame.android.sdk.mvp.p044b.C1627c;
import com.quickgame.android.sdk.p028d.p030b.p031a.C1282a;
import com.quickgame.android.sdk.p028d.p030b.p032b.C1283a;
import com.quickgame.android.sdk.p028d.p030b.p032b.C1286b;
import com.quickgame.android.sdk.p028d.p030b.p032b.C1289c;
import com.quickgame.android.sdk.p034e.C1346j;
import com.quickgame.android.sdk.p034e.C1383q;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

public class FacebookShareActivity extends MvpBaseActivity<C1627c> implements C1627c.C1628a, C1286b.C1288b, C1383q.C1385b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1346j f687c = null;

    /* renamed from: d */
    private C1286b f688d = null;

    /* renamed from: e */
    private C1289c f689e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1346j[] f690f = new C1346j[2];

    /* renamed from: g */
    private ChoiceBar f691g;

    /* renamed from: h */
    private RelativeLayout f692h;

    /* renamed from: i */
    private ImageView f693i;

    /* renamed from: j */
    private ImageView f694j;

    /* renamed from: k */
    private CallbackManager f695k;

    /* renamed from: l */
    private FragmentManager f696l;

    /* renamed from: m */
    private TextView f697m;

    /* renamed from: n */
    private ShareDialog f698n;

    /* renamed from: o */
    private boolean f699o;

    /* renamed from: p */
    private FacebookCallback<Sharer.Result> f700p;

    /* renamed from: q */
    private ArrayList<C1282a> f701q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f702r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f703s;

    /* renamed from: t */
    private int f704t = 1;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C1282a f705u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C1282a f706v;

    /* renamed from: w */
    private C1283a f707w;

    /* renamed from: x */
    private C1180j f708x = C1180j.NONE;

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$a */
    class C1171a implements View.OnClickListener {
        C1171a() {
        }

        public void onClick(View view) {
            FacebookShareActivity.this.m1010y();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$b */
    class C1172b implements ChoiceBar.C1439c {
        C1172b() {
        }

        /* renamed from: a */
        public void mo12083a(int i) {
        }

        /* renamed from: a */
        public void mo12084a(int i, int i2) {
            FacebookShareActivity facebookShareActivity = FacebookShareActivity.this;
            C1346j unused = facebookShareActivity.f687c = facebookShareActivity.f690f[i];
            FacebookShareActivity facebookShareActivity2 = FacebookShareActivity.this;
            facebookShareActivity2.m991a(facebookShareActivity2.f690f[i], FacebookShareActivity.this.f690f[i2]);
            FacebookShareActivity.this.m995b(i);
        }

        /* renamed from: b */
        public void mo12085b(int i) {
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$c */
    class C1173c implements View.OnClickListener {
        C1173c() {
        }

        public void onClick(View view) {
            FacebookShareActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$d */
    class C1174d implements View.OnClickListener {
        C1174d() {
        }

        public void onClick(View view) {
            if (FacebookShareActivity.this.f705u != null) {
                FacebookShareActivity facebookShareActivity = FacebookShareActivity.this;
                facebookShareActivity.m990a(facebookShareActivity.f705u);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$e */
    class C1175e implements View.OnClickListener {
        C1175e() {
        }

        public void onClick(View view) {
            FacebookShareActivity.this.m1009x();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$f */
    class C1176f implements FacebookCallback<LoginResult> {
        C1176f() {
        }

        /* renamed from: a */
        public void onSuccess(LoginResult loginResult) {
            Log.v("QGFacebookShareAct", "Login Success");
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_login_success, 0).show();
        }

        public void onCancel() {
            Log.d("QGFacebookShareAct", "Login Cancel");
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_login_cancel, 0).show();
        }

        public void onError(FacebookException facebookException) {
            Log.w("QGFacebookShareAct", "Login Error");
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_login_error, 0).show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$g */
    class C1177g implements FacebookCallback<Sharer.Result> {
        C1177g() {
        }

        /* renamed from: a */
        public void onSuccess(Sharer.Result result) {
            Log.v("QGFacebookShareAct", "Share Success");
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_share_success, 0).show();
            ((C1627c) FacebookShareActivity.this.f1648b).mo13120b(FacebookShareActivity.this.f703s, FacebookShareActivity.this.f702r, FacebookShareActivity.this.f706v.mo12456e());
        }

        public void onCancel() {
            Log.d("QGFacebookShareAct", "Share Cancel");
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_share_cancel, 0).show();
        }

        public void onError(FacebookException facebookException) {
            Log.w("QGFacebookShareAct", "Share Error :" + facebookException.toString());
            Toast.makeText(FacebookShareActivity.this, C1124R.string.hw_facebook_share_error, 0).show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$h */
    class C1178h implements View.OnClickListener {
        C1178h() {
        }

        public void onClick(View view) {
            ((C1627c) FacebookShareActivity.this.f1648b).mo13121c(FacebookShareActivity.this.f703s, FacebookShareActivity.this.f702r, FacebookShareActivity.this.f706v.mo12464i());
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$i */
    static /* synthetic */ class C1179i {

        /* renamed from: a */
        static final /* synthetic */ int[] f717a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.quickgame.android.sdk.activity.FacebookShareActivity$j[] r0 = com.quickgame.android.sdk.activity.FacebookShareActivity.C1180j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f717a = r0
                com.quickgame.android.sdk.activity.FacebookShareActivity$j r1 = com.quickgame.android.sdk.activity.FacebookShareActivity.C1180j.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f717a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.quickgame.android.sdk.activity.FacebookShareActivity$j r1 = com.quickgame.android.sdk.activity.FacebookShareActivity.C1180j.POST_STATUS_UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.activity.FacebookShareActivity.C1179i.<clinit>():void");
        }
    }

    /* renamed from: com.quickgame.android.sdk.activity.FacebookShareActivity$j */
    private enum C1180j {
        NONE,
        POST_STATUS_UPDATE
    }

    /* renamed from: A */
    private void m982A() {
        if (this.f706v != null) {
            Log.d("QGFacebookShareAct", "updateShareClaimButton " + this.f706v.mo12484s());
            if (this.f706v.mo12462h() == "1") {
                Log.d("QGFacebookShareAct", "下次再领");
                this.f694j.setImageResource(C1124R.C1125drawable.hw_gift_claimed);
            } else if (this.f706v.mo12475n()) {
                Log.d("QGFacebookShareAct", "正在领取");
                this.f694j.setImageResource(C1124R.C1125drawable.hw_btn_claim_selector);
                this.f694j.setOnClickListener(new C1178h());
            } else {
                Log.d("QGFacebookShareAct", "请先点击分享！");
            }
        }
    }

    /* renamed from: s */
    private void m1004s() {
        C1180j jVar = this.f708x;
        this.f708x = C1180j.NONE;
        if (C1179i.f717a[jVar.ordinal()] == 2) {
            m1008w();
        }
    }

    /* renamed from: t */
    private boolean m1005t() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        return currentAccessToken != null && currentAccessToken.getPermissions().contains("publish_actions");
    }

    /* renamed from: u */
    private void m1006u() {
        this.f695k = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(this.f695k, new C1176f());
        this.f698n = new ShareDialog((Activity) this);
        C1177g gVar = new C1177g();
        this.f700p = gVar;
        this.f698n.registerCallback(this.f695k, gVar);
        this.f699o = ShareDialog.canShow(ShareLinkContent.class);
    }

    /* renamed from: v */
    private void m1007v() {
        this.f691g = (ChoiceBar) findViewById(C1124R.C1126id.hw_top_bar);
        this.f692h = (RelativeLayout) findViewById(C1124R.C1126id.rl_main);
        this.f697m = (TextView) findViewById(C1124R.C1126id.hw_tv_activity_info);
        this.f693i = (ImageView) findViewById(C1124R.C1126id.hw_iv_facebook_like);
        this.f694j = (ImageView) findViewById(C1124R.C1126id.hw_iv_facebook_share);
        this.f697m.setOnClickListener(new C1171a());
        int i = this.f704t;
        if (1 == i) {
            this.f691g.mo12676a(new ChoiceBarTab(this, C1124R.C1125drawable.hw_share_frame_bg_selector, "Like Gift")).mo12676a(new ChoiceBarTab(this, C1124R.C1125drawable.hw_share_frame_bg_selector, "Share Gift"));
            this.f691g.setOnTabSelectedListener(new C1172b());
            this.f693i.setVisibility(0);
        } else if (2 == i) {
            this.f691g.setVisibility(8);
            this.f693i.setVisibility(8);
            this.f694j.setVisibility(0);
        } else {
            this.f692h.setVisibility(8);
            mo12282w("");
        }
        ((ImageView) findViewById(C1124R.C1126id.hw_facebook_share_close)).setOnClickListener(new C1173c());
        this.f693i.setOnClickListener(new C1174d());
        this.f694j.setOnClickListener(new C1175e());
    }

    /* renamed from: w */
    private void m1008w() {
        if (this.f706v != null) {
            Profile currentProfile = Profile.getCurrentProfile();
            ShareLinkContent build = ((ShareLinkContent.Builder) new ShareLinkContent.Builder().setContentUrl(Uri.parse(this.f706v.mo12456e()))).build();
            if (this.f699o) {
                this.f698n.show(build);
            } else if (currentProfile == null || !m1005t()) {
                this.f708x = C1180j.POST_STATUS_UPDATE;
            } else {
                ShareApi.share(build, this.f700p);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m1009x() {
        m985a(C1180j.POST_STATUS_UPDATE, this.f699o);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f705u;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1010y() {
        /*
            r2 = this;
            com.quickgame.android.sdk.e.j r0 = r2.f687c
            boolean r0 = r0 instanceof com.quickgame.android.sdk.p028d.p030b.p032b.C1286b
            if (r0 == 0) goto L_0x000f
            com.quickgame.android.sdk.d.b.a.a r0 = r2.f705u
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.mo12450b()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            com.quickgame.android.sdk.e.j r1 = r2.f687c
            boolean r1 = r1 instanceof com.quickgame.android.sdk.p028d.p030b.p032b.C1289c
            if (r1 == 0) goto L_0x001e
            com.quickgame.android.sdk.d.b.a.a r1 = r2.f706v
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = r1.mo12450b()
        L_0x001e:
            r2.m1011y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.activity.FacebookShareActivity.m1010y():void");
    }

    /* renamed from: z */
    private void m1012z() {
        int i = this.f704t;
        if (1 == i) {
            m1013z(QGConstant.LOGIN_OPEN_TYPE_CDKEY);
        } else if (2 == i) {
            m1013z("2");
        } else if (3 == i) {
            Iterator<C1282a> it = this.f701q.iterator();
            while (it.hasNext()) {
                C1282a next = it.next();
                if ("1".equals(next.mo12454d())) {
                    m990a(next);
                }
            }
            mo12280p();
            finish();
        }
    }

    /* renamed from: j */
    public void mo12079j(String str) {
        Log.w("QGFacebookShareAct", "get share data failed " + str);
        if (this.f704t == 3) {
            mo12280p();
            finish();
        }
    }

    /* renamed from: k */
    public void mo12080k(String str) {
        Log.w("QGFacebookShareAct", "confirmLikeEventFailed:" + str);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f695k.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1124R.layout.hw_activity_gift);
        Intent intent = getIntent();
        this.f703s = intent.getStringExtra("serverInfo");
        this.f702r = intent.getStringExtra("roleInfo");
        this.f704t = intent.getIntExtra("showType", 1);
        if (this.f702r == null || this.f703s == null) {
            Log.e("QGFacebookShareAct", "call facebook share param is null");
            finish();
        }
        this.f696l = getSupportFragmentManager();
        if (bundle == null) {
            int i = this.f704t;
            if (1 == i) {
                C1346j[] jVarArr = this.f690f;
                C1286b c = C1286b.m1411c();
                this.f688d = c;
                jVarArr[0] = c;
                C1346j[] jVarArr2 = this.f690f;
                C1289c b = C1289c.m1418b();
                this.f689e = b;
                jVarArr2[1] = b;
                this.f696l.beginTransaction().add(C1124R.C1126id.hw_fl_container, (Fragment) this.f690f[0]).show(this.f690f[0]).add(C1124R.C1126id.hw_fl_container, (Fragment) this.f690f[1]).hide(this.f690f[1]).commitAllowingStateLoss();
                this.f687c = this.f690f[0];
            } else if (2 == i) {
                this.f689e = C1289c.m1418b();
                this.f696l.beginTransaction().add(C1124R.C1126id.hw_fl_container, (Fragment) this.f689e).show(this.f689e).commitAllowingStateLoss();
                this.f687c = this.f689e;
            }
        }
        m1007v();
        ((C1627c) this.f1648b).mo13118a(this.f703s, this.f702r);
        m1006u();
    }

    /* renamed from: s */
    public void mo12081s(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m995b(int i) {
        if (i == 0) {
            this.f693i.setVisibility(0);
            this.f694j.setVisibility(8);
        } else if (i == 1) {
            this.f693i.setVisibility(8);
            this.f694j.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m998e(JSONArray jSONArray) {
        m992a(jSONArray, QGConstant.LOGIN_OPEN_TYPE_CDKEY);
    }

    /* renamed from: c */
    public void mo12075c(JSONArray jSONArray) {
        Log.v("QGFacebookShareAct", "handleMessage MSG_FB_LIKE_EVENT SUCCESSFUL");
        if (this.f704t != 3) {
            m992a(jSONArray, "1");
            m1013z("1");
            m982A();
        }
    }

    /* renamed from: d */
    public void mo12076d(JSONArray jSONArray) {
        Log.d("QGFacebookShareAct", "get share data success");
        m998e(jSONArray);
        m1012z();
        m982A();
    }

    /* renamed from: f */
    public void mo12077f() {
        finish();
    }

    /* renamed from: h */
    public void mo12078h(String str) {
        Log.w("QGFacebookShareAct", "getFbLikeOrShareGiftFailed:" + str);
        Toast.makeText(this, str, 0).show();
    }

    /* renamed from: r */
    public C1627c m1024r() {
        return new C1627c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m990a(C1282a aVar) {
        String e = aVar.mo12456e();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(e);
        try {
            if (getPackageManager().getApplicationInfo("com.facebook.katana", 0).enabled) {
                parse = Uri.parse("fb://facewebmodal/f?href=" + e);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        intent.setData(parse);
        intent.setFlags(268435456);
        startActivity(intent);
        ((C1627c) this.f1648b).mo13119a(this.f703s, this.f702r, e);
    }

    /* renamed from: b */
    private C1282a m994b(String str, int i) {
        Iterator<C1282a> it = this.f701q.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C1282a next = it.next();
            if (next.mo12454d().equals(str)) {
                if (i2 == i) {
                    return next;
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m1011y(String str) {
        C1283a a = C1283a.m1406a(str);
        this.f707w = a;
        a.show(this.f696l, "tag");
    }

    /* renamed from: b */
    public void mo12074b(JSONArray jSONArray) {
        Log.v("QGFacebookShareAct", "getFbLikeOrShareGiftSuccess");
        Toast.makeText(this, C1124R.string.hw_share_had_reward, 0).show();
        Log.d("QGFacebookShareAct", getString(C1124R.string.hw_share_had_reward));
        m992a(jSONArray, "1");
        C1282a aVar = this.f706v;
        if (aVar != null) {
            aVar.mo12471l("1");
        }
        m1012z();
        m982A();
    }

    /* renamed from: z */
    private void m1013z(String str) {
        if (str.contains("1")) {
            this.f688d.mo12495b();
        }
        Iterator<C1282a> it = this.f701q.iterator();
        while (it.hasNext()) {
            C1282a next = it.next();
            if (str.contains(next.mo12454d())) {
                String d = next.mo12454d();
                d.hashCode();
                if (d.equals("2")) {
                    this.f689e.mo12497a(this.f706v.mo12472m());
                } else if (d.equals("1")) {
                    this.f688d.mo12493a(next);
                }
            }
        }
    }

    /* renamed from: a */
    private void m985a(C1180j jVar, boolean z) {
        if (AccessToken.getCurrentAccessToken() != null || z) {
            this.f708x = jVar;
            m1004s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m991a(C1346j jVar, C1346j jVar2) {
        FragmentTransaction beginTransaction = this.f696l.beginTransaction();
        beginTransaction.show(jVar);
        beginTransaction.hide(jVar2);
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void m992a(JSONArray jSONArray, String str) {
        this.f701q = new ArrayList<>();
        if (str.contains("1")) {
            this.f705u = null;
        }
        if (str.contains("2")) {
            this.f706v = null;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                C1282a aVar = new C1282a(jSONArray.optJSONObject(i));
                Log.d("QGFacebookShareAct", aVar.toString());
                if (aVar.mo12481q()) {
                    this.f701q.add(aVar);
                    if (str.contains(aVar.mo12454d())) {
                        String d = aVar.mo12454d();
                        char c = 65535;
                        int hashCode = d.hashCode();
                        if (hashCode != 49) {
                            if (hashCode == 50) {
                                if (d.equals("2")) {
                                    c = 1;
                                }
                            }
                        } else if (d.equals("1")) {
                            c = 0;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                if (this.f706v == null) {
                                    this.f706v = aVar;
                                }
                            }
                        } else if (this.f705u == null) {
                            this.f705u = aVar;
                        }
                    }
                }
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo12072a(View view, int i) {
        if (view.getId() == C1124R.C1126id.hw_like_iv_unfini) {
            C1282a a = m983a(i);
            Log.d("QGFacebookShareAct", "like share " + a.mo12482r());
            if (this.f705u.mo12466j().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                Toast.makeText(this, C1124R.string.hw_facebook_nogift, 0).show();
            } else if (!a.mo12479p()) {
                Toast.makeText(this, C1124R.string.hw_collecting_like, 0).show();
                Log.d("QGFacebookShareAct", getString(C1124R.string.hw_collecting_like));
            } else if (!this.f705u.mo12475n()) {
                Toast.makeText(this, C1124R.string.hw_please_like_first, 0).show();
                Log.d("QGFacebookShareAct", getString(C1124R.string.hw_please_like_first));
            } else if (a.mo12477o()) {
                Toast.makeText(this, C1124R.string.hw_share_had_reward_again, 0).show();
                Log.d("QGFacebookShareAct", getString(C1124R.string.hw_share_had_reward_again));
            } else {
                ((C1627c) this.f1648b).mo13121c(this.f703s, this.f702r, a.mo12464i());
            }
        }
    }

    /* renamed from: a */
    private C1282a m983a(int i) {
        return m994b("1", i);
    }

    /* renamed from: a */
    public void mo12073a(JSONArray jSONArray) {
        m992a(jSONArray, "2");
        m982A();
    }
}
