package com.quickgame.android.sdk.p028d.p029a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p028d.p030b.p033c.C1290a;
import java.util.ArrayList;

/* renamed from: com.quickgame.android.sdk.d.a.a */
public class C1278a extends BaseAdapter {

    /* renamed from: a */
    private final LayoutInflater f934a;

    /* renamed from: b */
    private ArrayList<C1290a> f935b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1280b f936c;

    /* renamed from: com.quickgame.android.sdk.d.a.a$a */
    class C1279a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f937a;

        /* renamed from: b */
        final /* synthetic */ C1281c f938b;

        C1279a(int i, C1281c cVar) {
            this.f937a = i;
            this.f938b = cVar;
        }

        public void onClick(View view) {
            if (C1278a.this.f936c != null) {
                C1278a.this.f936c.mo12446a(this.f937a, view, this.f938b);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.d.a.a$b */
    public interface C1280b {
        /* renamed from: a */
        void mo12446a(int i, View view, C1281c cVar);
    }

    /* renamed from: com.quickgame.android.sdk.d.a.a$c */
    public static class C1281c {

        /* renamed from: a */
        TextView f940a;

        /* renamed from: b */
        TextView f941b;

        /* renamed from: c */
        ImageView f942c;

        /* renamed from: d */
        ImageView f943d;
    }

    public C1278a(Context context) {
        this.f934a = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.f935b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1281c cVar;
        if (view == null) {
            C1281c cVar2 = new C1281c();
            View inflate = this.f934a.inflate(C1124R.layout.hw_recycle_view_item_like, (ViewGroup) null);
            cVar2.f940a = (TextView) inflate.findViewById(C1124R.C1126id.hw_like_tv_main);
            cVar2.f941b = (TextView) inflate.findViewById(C1124R.C1126id.hw_like_tv_sub);
            cVar2.f942c = (ImageView) inflate.findViewById(C1124R.C1126id.hw_like_iv_praise);
            cVar2.f943d = (ImageView) inflate.findViewById(C1124R.C1126id.hw_like_iv_unfini);
            inflate.setTag(cVar2);
            View view2 = inflate;
            cVar = cVar2;
            view = view2;
        } else {
            cVar = (C1281c) view.getTag();
        }
        cVar.f940a.setText(this.f935b.get(i).mo12498a());
        cVar.f941b.setText(this.f935b.get(i).mo12500c());
        cVar.f942c.setImageResource(this.f935b.get(i).mo12499b());
        cVar.f943d.setImageResource(this.f935b.get(i).mo12501d());
        m1359a(i, cVar);
        return view;
    }

    /* renamed from: a */
    private void m1359a(int i, C1281c cVar) {
        cVar.f943d.setOnClickListener(new C1279a(i, cVar));
    }

    public C1290a getItem(int i) {
        return this.f935b.get(i);
    }

    /* renamed from: a */
    public void mo12439a(C1280b bVar) {
        this.f936c = bVar;
    }

    /* renamed from: a */
    public void mo12440a(C1290a aVar) {
        if (this.f935b == null) {
            this.f935b = new ArrayList<>();
        }
        this.f935b.add(aVar);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo12438a() {
        this.f935b = new ArrayList<>();
        notifyDataSetChanged();
    }
}
