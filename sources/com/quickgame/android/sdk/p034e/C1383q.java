package com.quickgame.android.sdk.p034e;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.quickgame.android.sdk.C1124R;

/* renamed from: com.quickgame.android.sdk.e.q */
public class C1383q extends DialogFragment {

    /* renamed from: a */
    private String f1146a = "";

    /* renamed from: com.quickgame.android.sdk.e.q$a */
    class C1384a implements DialogInterface.OnKeyListener {
        C1384a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || !(C1383q.this.getActivity() instanceof C1385b)) {
                return false;
            }
            Log.d("QGWaitingDialog", "onBack");
            ((C1385b) C1383q.this.getActivity()).mo12077f();
            return false;
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.q$b */
    public interface C1385b {
        /* renamed from: f */
        void mo12077f();
    }

    /* renamed from: a */
    public static C1383q m1585a() {
        return new C1383q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, C1124R.style.DialogTransparentStyle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_dialog_prompt_waiting, viewGroup);
        int identifier = getResources().getIdentifier("sdk_waiting_bg", "drawable", getActivity().getPackageName());
        if (identifier != 0) {
            inflate.findViewById(C1124R.C1126id.ll_waiting).setBackgroundResource(identifier);
        }
        TextView textView = (TextView) inflate.findViewById(C1124R.C1126id.tv_title);
        if (TextUtils.isEmpty(this.f1146a)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f1146a);
        }
        setCancelable(false);
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new C1384a());
        }
        return inflate;
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.f1146a = str;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, "waiting");
        beginTransaction.commitAllowingStateLoss();
    }
}
