package com.quickgame.android.sdk.p034e;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.activity.HWLoginActivity;
import com.quickgame.android.sdk.model.C1613e;
import com.quickgame.android.sdk.view.C1713a;

/* renamed from: com.quickgame.android.sdk.e.c */
public class C1304c extends C1346j {

    /* renamed from: a */
    public String f1007a = "QGAnnouncementFragment";

    /* renamed from: b */
    Button f1008b;

    /* renamed from: c */
    Button f1009c;

    /* renamed from: d */
    private ListView f1010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1713a f1011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f1012f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1013g;

    /* renamed from: com.quickgame.android.sdk.e.c$a */
    class C1305a implements View.OnClickListener {
        C1305a() {
        }

        public void onClick(View view) {
            Log.d(C1304c.this.f1007a, "btnYes onClick");
            String str = C1304c.this.f1007a;
            Log.d(str, "当前isChecked==" + C1304c.this.f1013g);
            String str2 = C1304c.this.f1007a;
            Log.d(str2, "allAnnouncementNum==" + C1304c.this.f1012f);
            if (C1304c.this.f1013g == C1304c.this.f1012f) {
                C1304c.m1451b(C1304c.this.getContext(), "ShowAnnouncement", false);
                HWLoginActivity.m1115a((Activity) C1304c.this.getActivity(), false);
                C1304c.this.getActivity().finish();
                return;
            }
            Toast.makeText(C1304c.this.getContext(), "Please check all Agreement", 0).show();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.c$b */
    class C1306b implements View.OnClickListener {
        C1306b() {
        }

        public void onClick(View view) {
            Log.d(C1304c.this.f1007a, "btnNo onClick");
            C1304c.this.getActivity().finish();
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.c$c */
    class C1307c implements AdapterView.OnItemClickListener {
        C1307c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1713a.C1715b bVar = (C1713a.C1715b) view.getTag();
            bVar.f1774a.toggle();
            C1613e.f1626i.get(i).setBoolean(bVar.f1774a.isChecked());
            C1304c.this.f1011e.notifyDataSetChanged();
            if (bVar.f1774a.isChecked()) {
                C1304c cVar = C1304c.this;
                int unused = cVar.f1013g = cVar.f1013g + 1;
            } else {
                C1304c cVar2 = C1304c.this;
                int unused2 = cVar2.f1013g = cVar2.f1013g - 1;
            }
            String str = C1304c.this.f1007a;
            Log.d(str, "click isChecked=" + C1304c.this.f1013g);
        }
    }

    public C1304c() {
        new Handler(Looper.getMainLooper());
        this.f1012f = 0;
        this.f1013g = 0;
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d(this.f1007a, "onCreateView");
        View inflate = layoutInflater.inflate(C1124R.layout.hw_fragment_announce, (ViewGroup) null);
        mo12521a(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: b */
    public static C1304c m1450b() {
        return new C1304c();
    }

    /* renamed from: a */
    public static boolean m1448a(Context context, String str, boolean z) {
        return context.getSharedPreferences("quickgamehaiwai", 0).getBoolean(str, true);
    }

    /* renamed from: b */
    public static void m1451b(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("quickgamehaiwai", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12521a(View view) {
        Log.d(this.f1007a, "initView");
        this.f1008b = (Button) view.findViewById(C1124R.C1126id.bt_yes);
        this.f1009c = (Button) view.findViewById(C1124R.C1126id.bt_no);
        this.f1008b.setOnClickListener(new C1305a());
        this.f1009c.setOnClickListener(new C1306b());
        this.f1010d = (ListView) view.findViewById(C1124R.C1126id.f580lv);
        this.f1011e = new C1713a(getActivity(), C1613e.f1626i);
        for (int i = 0; i < C1613e.f1626i.size(); i++) {
            if (C1613e.f1626i.get(i).getBoolean()) {
                this.f1013g++;
            }
        }
        Log.d(this.f1007a, "当前isChecked==" + this.f1013g);
        this.f1010d.setAdapter(this.f1011e);
        this.f1012f = C1613e.f1626i.size();
        this.f1010d.setOnItemClickListener(new C1307c());
    }
}
