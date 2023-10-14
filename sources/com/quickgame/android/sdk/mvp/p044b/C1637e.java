package com.quickgame.android.sdk.mvp.p044b;

import com.quickgame.android.sdk.constans.QGConstant;
import com.quickgame.android.sdk.mvp.C1618a;
import com.quickgame.android.sdk.p036f.C1426b;
import com.quickgame.android.sdk.p036f.C1427c;
import com.quickgame.android.sdk.p038g.C1496f;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.mvp.b.e */
public class C1637e extends C1618a<C1640c> {

    /* renamed from: com.quickgame.android.sdk.mvp.b.e$a */
    class C1638a implements C1426b<JSONObject> {
        C1638a() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            if (C1637e.this.f1649a != null) {
                ((C1640c) C1637e.this.f1649a).mo12097a();
            }
        }

        public void onFailed(C1427c cVar) {
            if (C1637e.this.f1649a != null) {
                ((C1640c) C1637e.this.f1649a).mo12098a(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.e$b */
    class C1639b implements C1426b<JSONObject> {
        C1639b() {
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            if (C1637e.this.f1649a != null) {
                ((C1640c) C1637e.this.f1649a).mo12099b();
            }
        }

        public void onFailed(C1427c cVar) {
            if (C1637e.this.f1649a != null) {
                ((C1640c) C1637e.this.f1649a).mo12100b(cVar.mo12663b());
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.mvp.b.e$c */
    public interface C1640c {
        /* renamed from: a */
        void mo12097a();

        /* renamed from: a */
        void mo12098a(String str);

        /* renamed from: b */
        void mo12099b();

        /* renamed from: b */
        void mo12100b(String str);
    }

    public C1637e(C1640c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo13130a(String str) {
        C1496f.f1411a.mo12769a(str, new C1638a());
    }

    /* renamed from: a */
    public void mo13131a(String str, String str2, String str3) {
        C1496f.f1411a.mo12772a(QGConstant.LOGIN_OPEN_TYPE_GOOGLE, str, str2, str3, "", new C1639b());
    }
}
