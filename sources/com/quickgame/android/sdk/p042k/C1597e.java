package com.quickgame.android.sdk.p042k;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.quickgame.android.sdk.p043l.C1601d;
import com.quickgame.android.sdk.utils.log.QGLog;
import com.tds.tapdb.sdk.TapDB;

/* renamed from: com.quickgame.android.sdk.k.e */
public class C1597e {

    /* renamed from: b */
    private static C1597e f1589b;

    /* renamed from: a */
    private boolean f1590a = false;

    private C1597e() {
    }

    /* renamed from: a */
    public static C1597e m2035a() {
        if (f1589b == null) {
            f1589b = new C1597e();
        }
        return f1589b;
    }

    /* renamed from: a */
    public void mo13032a(Activity activity) {
    }

    /* renamed from: b */
    public void mo13037b(Activity activity) {
    }

    /* renamed from: a */
    public void mo13033a(Context context) {
        String c = C1601d.m2069c(context, "tapdb_appid");
        String c2 = C1601d.m2069c(context, "tapdb_channel");
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(c2)) {
            try {
                TapDB.init(context, c, c2, (String) null);
                TapDB.enableLog(QGLog.getDebugMod());
                this.f1590a = true;
                Log.d("QGTapDBManager", "initTapDB success");
            } catch (Exception e) {
                Log.e("QGTapDBManager", "initTapDB init Exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo13036a(String str, String str2, String str3) {
        if (this.f1590a) {
            Log.d("QGTapDBManager", "tapDBLoginSuccess uid: " + str);
            TapDB.setUser(str);
            TapDB.setName(str2);
        }
    }

    /* renamed from: a */
    public void mo13034a(String str, String str2) {
        if (this.f1590a) {
            Log.d("QGTapDBManager", "tapDB roleLv " + str);
            try {
                TapDB.setLevel(Integer.parseInt(str));
            } catch (Exception unused) {
            }
            TapDB.setServer(str2);
        }
    }

    /* renamed from: a */
    public void mo13035a(String str, String str2, long j, String str3, String str4) {
        if (this.f1590a) {
            Log.d("QGTapDBManager", "report purchase " + str + ",amount: " + j);
            TapDB.onCharge(str, str2, j, str3, str4);
        }
    }
}
