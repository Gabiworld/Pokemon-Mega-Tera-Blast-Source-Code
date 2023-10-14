package com.quickgame.android.sdk.view;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.innerbean.ServerInfo;
import com.quickgame.android.sdk.p034e.C1296b;
import com.quickgame.android.sdk.p034e.C1346j;
import java.util.List;

/* renamed from: com.quickgame.android.sdk.view.a */
public class C1713a extends BaseAdapter {

    /* renamed from: a */
    private Activity f1766a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<ServerInfo> f1767b;

    /* renamed from: c */
    private LayoutInflater f1768c;

    /* renamed from: d */
    private CheckBox f1769d;

    /* renamed from: e */
    private TextView f1770e;

    /* renamed from: f */
    private TextView f1771f;

    /* renamed from: com.quickgame.android.sdk.view.a$a */
    class C1714a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f1772a;

        C1714a(int i) {
            this.f1772a = i;
        }

        public void onClick(View view) {
            Log.d("CheckBoxAdapter", "跳转到详细条款");
            C1296b.f992h = ((ServerInfo) C1713a.this.f1767b.get(this.f1772a)).getId();
            C1713a.this.mo13267a((C1346j) C1296b.m1442c());
        }
    }

    /* renamed from: com.quickgame.android.sdk.view.a$b */
    public class C1715b {

        /* renamed from: a */
        public CheckBox f1774a;

        /* renamed from: b */
        public TextView f1775b;

        /* renamed from: c */
        public TextView f1776c;

        public C1715b(C1713a aVar) {
        }
    }

    public C1713a(Activity activity, List<ServerInfo> list) {
        this.f1766a = activity;
        this.f1767b = list;
        this.f1768c = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.f1767b.size();
    }

    public Object getItem(int i) {
        return this.f1767b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1768c.inflate(C1124R.layout.qg_listview_item, (ViewGroup) null, false);
            C1715b bVar = new C1715b(this);
            this.f1769d = (CheckBox) view.findViewById(C1124R.C1126id.f579cb);
            this.f1770e = (TextView) view.findViewById(C1124R.C1126id.item_tv);
            TextView textView = (TextView) view.findViewById(C1124R.C1126id.item_go);
            this.f1771f = textView;
            bVar.f1774a = this.f1769d;
            bVar.f1775b = this.f1770e;
            bVar.f1776c = textView;
            view.setTag(bVar);
        } else {
            C1715b bVar2 = (C1715b) view.getTag();
            this.f1769d = bVar2.f1774a;
            this.f1770e = bVar2.f1775b;
            this.f1771f = bVar2.f1776c;
        }
        this.f1769d.setChecked(Boolean.valueOf(this.f1767b.get(i).getBoolean()).booleanValue());
        this.f1770e.setText(this.f1767b.get(i).getTitle());
        this.f1771f.setOnClickListener(new C1714a(i));
        return view;
    }

    /* renamed from: a */
    public void mo13267a(C1346j jVar) {
        Log.d("CheckBoxAdapter", jVar.getClass().getName());
        FragmentTransaction beginTransaction = ((FragmentActivity) this.f1766a).getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C1124R.C1126id.qg_annouce_main_content, jVar).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.addToBackStack((String) null);
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
            Log.d("CheckBoxAdapter", "commit fragment but destoryed");
        }
    }
}
