package com.quickgame.android.sdk.p039h;

import com.quickgame.android.sdk.bean.NoticeBean;
import com.quickgame.android.sdk.bean.QGRoleInfo;
import com.quickgame.android.sdk.bean.QGUserBindInfo;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.bean.QGUserInfo;
import com.quickgame.android.sdk.innerbean.BindInfo;
import com.quickgame.android.sdk.model.C1613e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.h.f */
public class C1538f {

    /* renamed from: a */
    private QGUserData f1464a;

    /* renamed from: b */
    private QGUserInfo f1465b;

    /* renamed from: c */
    private String f1466c;

    /* renamed from: d */
    private String f1467d;

    /* renamed from: e */
    private C1613e f1468e;

    /* renamed from: f */
    private QGUserBindInfo f1469f;

    /* renamed from: g */
    public BindInfo f1470g;

    /* renamed from: h */
    private boolean f1471h = false;

    /* renamed from: i */
    private List<NoticeBean> f1472i = null;

    /* renamed from: j */
    private String f1473j = "";

    /* renamed from: k */
    private String f1474k = "";

    /* renamed from: l */
    public String f1475l = "";

    /* renamed from: m */
    public String f1476m = "";

    /* renamed from: com.quickgame.android.sdk.h.f$a */
    class C1539a implements Comparator<NoticeBean> {
        C1539a(C1538f fVar) {
        }

        /* renamed from: a */
        public int compare(NoticeBean noticeBean, NoticeBean noticeBean2) {
            long j = noticeBean.startTime;
            long j2 = noticeBean2.startTime;
            if (j < j2) {
                return 1;
            }
            return j == j2 ? 0 : -1;
        }
    }

    /* renamed from: com.quickgame.android.sdk.h.f$b */
    private static class C1540b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C1538f f1477a = new C1538f();
    }

    /* renamed from: l */
    public static C1538f m1861l() {
        return C1540b.f1477a;
    }

    /* renamed from: a */
    public void mo12827a(QGRoleInfo qGRoleInfo) {
    }

    /* renamed from: a */
    public void mo12831a(C1613e eVar) {
        this.f1468e = eVar;
    }

    /* renamed from: b */
    public void mo12838b(String str) {
        this.f1473j = str;
    }

    /* renamed from: c */
    public void mo12840c(String str) {
        this.f1466c = str;
    }

    /* renamed from: d */
    public void mo12842d(String str) {
        this.f1467d = str;
    }

    /* renamed from: e */
    public C1613e mo12843e() {
        C1613e eVar = this.f1468e;
        return eVar == null ? new C1613e() : eVar;
    }

    /* renamed from: f */
    public String mo12844f() {
        return this.f1466c;
    }

    /* renamed from: g */
    public String mo12845g() {
        return this.f1467d;
    }

    /* renamed from: h */
    public QGUserBindInfo mo12846h() {
        return this.f1469f;
    }

    /* renamed from: i */
    public QGUserData mo12847i() {
        return this.f1464a;
    }

    /* renamed from: j */
    public QGUserInfo mo12848j() {
        return this.f1465b;
    }

    /* renamed from: k */
    public void mo12849k() {
        this.f1464a = null;
        this.f1469f = null;
        this.f1465b = null;
    }

    /* renamed from: a */
    public void mo12829a(QGUserData qGUserData) {
        this.f1464a = qGUserData;
    }

    /* renamed from: b */
    public String mo12837b() {
        return this.f1474k;
    }

    /* renamed from: c */
    public List<NoticeBean> mo12839c() {
        if (this.f1472i == null) {
            this.f1472i = new ArrayList();
        }
        return this.f1472i;
    }

    /* renamed from: d */
    public String mo12841d() {
        return this.f1473j;
    }

    /* renamed from: a */
    public void mo12830a(QGUserInfo qGUserInfo) {
        this.f1465b = qGUserInfo;
    }

    /* renamed from: a */
    public boolean mo12836a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            QGUserInfo generateFromJson = QGUserInfo.generateFromJson(jSONObject);
            if (generateFromJson == null) {
                return false;
            }
            mo12830a(generateFromJson);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo12828a(QGUserBindInfo qGUserBindInfo) {
        this.f1469f = qGUserBindInfo;
    }

    /* renamed from: a */
    public boolean mo12835a() {
        return this.f1471h;
    }

    /* renamed from: a */
    public void mo12834a(boolean z) {
        this.f1471h = z;
    }

    /* renamed from: a */
    public void mo12833a(List<NoticeBean> list) {
        this.f1472i = list;
        Collections.sort(list, new C1539a(this));
    }

    /* renamed from: a */
    public void mo12832a(String str) {
        this.f1474k = str;
    }
}
