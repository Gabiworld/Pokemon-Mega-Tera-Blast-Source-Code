package com.quickgame.android.sdk.model;

import android.text.TextUtils;
import com.p010qg.gson.Gson;
import com.p010qg.gson.p024w.C1117a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.quickgame.android.sdk.model.a */
public final class C1607a {

    /* renamed from: a */
    private int f1605a;

    /* renamed from: b */
    private String f1606b;

    /* renamed from: c */
    private ArrayList<String> f1607c = new ArrayList<>(10);

    /* renamed from: com.quickgame.android.sdk.model.a$a */
    class C1608a extends C1117a<List<String>> {
        C1608a(C1607a aVar) {
        }
    }

    /* renamed from: a */
    public void mo13075a(int i) {
        this.f1605a = i;
    }

    /* renamed from: b */
    public void mo13079b(String str) {
        this.f1606b = str;
    }

    /* renamed from: c */
    public String mo13080c() {
        return this.f1606b;
    }

    /* renamed from: d */
    public int mo13081d() {
        return this.f1605a;
    }

    /* renamed from: a */
    public ArrayList<String> mo13074a() {
        return this.f1607c;
    }

    /* renamed from: b */
    public String mo13078b() {
        ArrayList<String> arrayList = this.f1607c;
        return (arrayList == null || arrayList.size() == 0) ? "" : this.f1607c.get(0);
    }

    /* renamed from: a */
    public void mo13076a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f1607c = (ArrayList) new Gson().mo11565a(str, new C1608a(this).mo11793b());
            } catch (Exception unused) {
                this.f1607c = new ArrayList<>();
            }
        }
    }

    /* renamed from: a */
    public void mo13077a(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f1607c = arrayList;
        }
    }
}
