package com.quickgame.android.sdk.mvp.p044b;

import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p038g.C1496f;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.mvp.b.b */
public class C1623b extends C1618a<C1626c> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.b$a */
    class C1624a implements C1426b<JSONObject> {
        C1624a() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            if (C1623b.this.f1649a != null) {
                ((C1626c) C1623b.this.f1649a).mo12067a();
            }
        }

        public void onFailed(C1427c cVar) {
            if (C1623b.this.f1649a != null) {
                ((C1626c) C1623b.this.f1649a).mo12068a(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.b$b */
    class C1625b implements C1426b<JSONObject> {
        C1625b() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            if (C1623b.this.f1649a != null) {
                ((C1626c) C1623b.this.f1649a).mo12069b();
            }
        }

        public void onFailed(C1427c cVar) {
            if (C1623b.this.f1649a != null) {
                ((C1626c) C1623b.this.f1649a).mo12070b(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.b$c */
    public interface C1626c {
        /* renamed from: a */
        void mo12067a();

        /* renamed from: a */
        void mo12068a(String str);

        /* renamed from: b */
        void mo12069b();

        /* renamed from: b */
        void mo12070b(String str);
    }

    public C1623b(C1626c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo13114a(String str) {
        C1496f.f1411a.mo12769a(str, new C1624a());
    }

    /* renamed from: a */
    public void mo13115a(String str, String str2, String str3) {
        C1496f.f1411a.mo12772a(QGConstant.LOGIN_OPEN_TYPE_FACEBOOK, str, str2, str3, "", new C1625b());
    }
}
