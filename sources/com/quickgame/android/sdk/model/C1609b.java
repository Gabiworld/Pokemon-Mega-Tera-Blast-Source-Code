package com.quickgame.android.sdk.model;

import android.text.TextUtils;
import android.util.Log;
import com.p010qg.gson.Gson;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.p039h.C1538f;
import com.quickgame.android.sdk.p043l.C1602e;
import com.quickgame.android.sdk.utils.log.QGLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.model.b */
public class C1609b {

    /* renamed from: b */
    private static final String f1608b = "b";

    /* renamed from: a */
    private C1607a f1609a;

    /* renamed from: com.quickgame.android.sdk.model.b$a */
    private static class C1610a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C1609b f1610a = new C1609b();
    }

    /* renamed from: d */
    public static C1609b m2099d() {
        return C1610a.f1610a;
    }

    /* renamed from: a */
    public void mo13083a(int i) {
        QGUserData i2 = C1538f.m1861l().mo12847i();
        if (i2 != null && !TextUtils.isEmpty(i2.getUserName())) {
            C1607a b = mo13085b();
            if (i != 17) {
                switch (i) {
                    case 11:
                        int d = b.mo13081d();
                        if (d != 14) {
                            if (d != 12) {
                                if (d != 13) {
                                    b.mo13075a(11);
                                    break;
                                } else {
                                    b.mo13075a(16);
                                    break;
                                }
                            } else {
                                b.mo13075a(15);
                                break;
                            }
                        } else {
                            b.mo13075a(17);
                            break;
                        }
                    case 12:
                    case 13:
                    case 14:
                        break;
                }
            }
            b.mo13075a(i);
            String userName = i2.getUserName();
            ArrayList<String> a = b.mo13074a();
            if (a.size() == 0) {
                a.add(userName);
            } else {
                a.remove(userName);
                a.add(0, userName);
            }
            if (a.size() > 10) {
                a.subList(10, a.size()).clear();
            }
            b.mo13077a(a);
            this.f1609a.mo13079b(C1538f.m1861l().mo12844f());
            mo13086c();
        }
    }

    /* renamed from: b */
    public C1607a mo13085b() {
        if (this.f1609a == null) {
            this.f1609a = new C1607a();
            String b = C1602e.m2079b(C1128a.m798r().mo11981e());
            String str = f1608b;
            Log.d(str, "getToken " + b);
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    this.f1609a.mo13075a(jSONObject.getInt("LastLoginType"));
                    this.f1609a.mo13079b(jSONObject.getString("LastLoginToken"));
                    if (jSONObject.has("HistoryAccount")) {
                        this.f1609a.mo13076a(jSONObject.getString("HistoryAccount"));
                    }
                    if (jSONObject.has("FirstAccount")) {
                        String string = jSONObject.getString("FirstAccount");
                        String string2 = jSONObject.getString("SecondAccount");
                        String string3 = jSONObject.getString("ThirdAccount");
                        if (!TextUtils.isEmpty(string)) {
                            this.f1609a.mo13074a().add(string);
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            this.f1609a.mo13074a().add(string2);
                        }
                        if (!TextUtils.isEmpty(string3)) {
                            this.f1609a.mo13074a().add(string3);
                        }
                    }
                } catch (Exception e) {
                    QGLog.LogException(e);
                    String str2 = f1608b;
                    Log.e(str2, "" + e.getMessage());
                }
            }
        }
        return this.f1609a;
    }

    /* renamed from: c */
    public void mo13086c() {
        if (this.f1609a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("LastLoginType", this.f1609a.mo13081d());
                jSONObject.put("LastLoginToken", TextUtils.isEmpty(this.f1609a.mo13080c()) ? "" : this.f1609a.mo13080c());
                jSONObject.put("HistoryAccount", new Gson().mo11567a((Object) this.f1609a.mo13074a()));
                String str = f1608b;
                Log.d(str, "saveToken " + jSONObject.toString());
                C1602e.m2075a(C1128a.m798r().mo11981e(), jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo13084a(String str) {
        C1607a aVar = this.f1609a;
        if (aVar != null) {
            if (str.equals(aVar.mo13078b())) {
                this.f1609a.mo13079b((String) null);
                this.f1609a.mo13075a(0);
            }
            this.f1609a.mo13074a().remove(str);
            mo13086c();
        }
    }

    /* renamed from: a */
    public void mo13082a() {
        C1607a aVar = this.f1609a;
        if (aVar != null) {
            aVar.mo13079b((String) null);
            mo13086c();
        }
    }
}
