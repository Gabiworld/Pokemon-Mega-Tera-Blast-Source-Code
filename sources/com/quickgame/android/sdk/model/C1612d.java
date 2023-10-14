package com.quickgame.android.sdk.model;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.quickgame.android.sdk.utils.log.QGLog;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.model.d */
public class C1612d {

    /* renamed from: a */
    private boolean f1617a;

    /* renamed from: b */
    private boolean f1618b;

    /* renamed from: c */
    private boolean f1619c = true;

    /* renamed from: d */
    private boolean f1620d;

    /* renamed from: e */
    private boolean f1621e;

    /* renamed from: f */
    private boolean f1622f;

    /* renamed from: g */
    private int f1623g = 0;

    /* renamed from: h */
    private boolean f1624h = false;

    /* renamed from: a */
    public static C1612d m2111a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C1612d dVar = new C1612d();
        try {
            if (jSONObject.has("useServiceCenter") && "2".equals(jSONObject.get("useServiceCenter"))) {
                dVar.f1617a = true;
            }
            if (jSONObject.has("serviceInfo")) {
                try {
                    jSONObject.getString("serviceInfo");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            boolean z = false;
            if (jSONObject.has("isShowFloat")) {
                try {
                    String string = jSONObject.getString("isShowFloat");
                    dVar.f1618b = !TextUtils.isEmpty(string) && string.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (jSONObject.has("guestShowBind")) {
                try {
                    String string2 = jSONObject.getString("guestShowBind");
                    dVar.f1619c = !TextUtils.isEmpty(string2) && string2.equals("1");
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (jSONObject.has("single_play")) {
                try {
                    String string3 = jSONObject.getString("single_play");
                    dVar.f1620d = !TextUtils.isEmpty(string3) && string3.equals("1");
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            if (jSONObject.has("initCZurl")) {
                try {
                    String string4 = jSONObject.getString("initCZurl");
                    dVar.f1621e = !TextUtils.isEmpty(string4) && string4.equals("1");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (jSONObject.has("adZhifuSwt")) {
                try {
                    String string5 = jSONObject.getString("adZhifuSwt");
                    if (!TextUtils.isEmpty(string5) && string5.equals("1")) {
                        z = true;
                    }
                    dVar.f1622f = z;
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            if (jSONObject.has("noticeNode")) {
                try {
                    dVar.f1623g = jSONObject.optInt("noticeNode");
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
            if (jSONObject.has("regMailVerify") && jSONObject.optString("regMailVerify").equals("1")) {
                dVar.f1624h = true;
            }
            return dVar;
        } catch (Exception e8) {
            QGLog.LogException(e8);
            e8.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public int mo13093b() {
        return this.f1623g;
    }

    /* renamed from: c */
    public boolean mo13094c() {
        return this.f1622f;
    }

    /* renamed from: d */
    public boolean mo13095d() {
        return this.f1619c;
    }

    /* renamed from: e */
    public boolean mo13096e() {
        return this.f1618b;
    }

    /* renamed from: f */
    public boolean mo13097f() {
        return this.f1620d;
    }

    /* renamed from: g */
    public boolean mo13098g() {
        return this.f1617a;
    }

    /* renamed from: h */
    public boolean mo13099h() {
        return this.f1624h;
    }

    public String toString() {
        return "{isUseServiceCenter=" + this.f1617a + ", isShowFloat=" + this.f1618b + ", guestShowBind=" + this.f1619c + ", isSinglePlay=" + this.f1620d + ", adZhifuSwt=" + this.f1622f + ", showNode=" + this.f1623g + '}';
    }

    /* renamed from: a */
    public boolean mo13092a() {
        return this.f1621e;
    }
}
