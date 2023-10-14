package com.quickgame.android.sdk.p028d.p030b.p032b;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p028d.p029a.C1278a;
import com.quickgame.android.sdk.p028d.p030b.p031a.C1282a;
import com.quickgame.android.sdk.p028d.p030b.p033c.C1290a;
import com.quickgame.android.sdk.p034e.C1346j;

/* renamed from: com.quickgame.android.sdk.d.b.b.b */
public class C1286b extends C1346j {

    /* renamed from: a */
    private View f972a;

    /* renamed from: b */
    private ListView f973b;

    /* renamed from: c */
    private C1278a f974c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1288b f975d;

    /* renamed from: com.quickgame.android.sdk.d.b.b.b$a */
    class C1287a implements C1278a.C1280b {
        C1287a() {
        }

        /* renamed from: a */
        public void mo12446a(int i, View view, C1278a.C1281c cVar) {
            if (C1286b.this.f975d != null) {
                C1286b.this.f975d.mo12072a(view, i);
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.d.b.b.b$b */
    public interface C1288b {
        /* renamed from: a */
        void mo12072a(View view, int i);
    }

    /* renamed from: b */
    private C1290a m1410b(C1282a aVar) {
        Log.d("LikeGiftFragment", aVar.mo12482r());
        return new C1290a(aVar.mo12452c(), aVar.mo12447a(), C1124R.C1125drawable.hw_like_gift, m1412c(aVar).intValue());
    }

    /* renamed from: c */
    public static C1286b m1411c() {
        Bundle bundle = new Bundle();
        C1286b bVar = new C1286b();
        bVar.setArguments(bundle);
        return bVar;
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1409a(this.f972a);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f975d = (C1288b) context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_like_gift, viewGroup, false);
        this.f972a = inflate;
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f975d = null;
    }

    /* renamed from: a */
    private void m1409a(View view) {
        ListView listView = (ListView) view.findViewById(C1124R.C1126id.hw_list_view_like_gift);
        this.f973b = listView;
        listView.setVisibility(0);
        C1278a aVar = new C1278a(getContext());
        this.f974c = aVar;
        aVar.mo12439a((C1278a.C1280b) new C1287a());
        this.f973b.setAdapter(this.f974c);
    }

    /* renamed from: c */
    private Integer m1412c(C1282a aVar) {
        if (aVar.mo12477o()) {
            return Integer.valueOf(C1124R.C1125drawable.hw_gift_claimed);
        }
        if (aVar.mo12479p()) {
            return Integer.valueOf(C1124R.C1125drawable.hw_btn_claim_selector);
        }
        return Integer.valueOf(C1124R.C1125drawable.hw_unfini);
    }

    /* renamed from: b */
    public void mo12495b() {
        this.f974c.mo12438a();
    }

    /* renamed from: a */
    public void mo12493a(C1282a aVar) {
        this.f974c.mo12440a(m1410b(aVar));
    }
}
