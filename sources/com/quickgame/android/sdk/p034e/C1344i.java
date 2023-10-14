package com.quickgame.android.sdk.p034e;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.quickgame.android.sdk.C1124R;
import java.lang.ref.WeakReference;

/* renamed from: com.quickgame.android.sdk.e.i */
public class C1344i extends DialogFragment {

    /* renamed from: a */
    public final C1345a f1071a = new C1345a(this);

    /* renamed from: b */
    private String f1072b;

    /* renamed from: c */
    private TextView f1073c;

    /* renamed from: d */
    private DialogInterface.OnDismissListener f1074d;

    /* renamed from: com.quickgame.android.sdk.e.i$a */
    public static class C1345a extends Handler {

        /* renamed from: a */
        WeakReference<C1344i> f1075a;

        public C1345a(C1344i iVar) {
            this.f1075a = new WeakReference<>(iVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C1344i iVar = (C1344i) this.f1075a.get();
            if (iVar != null) {
                iVar.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: a */
    public static C1344i m1519a(Integer num, String str) {
        C1344i iVar = new C1344i();
        Bundle bundle = new Bundle();
        bundle.putInt("type", num.intValue());
        bundle.putString("info", str);
        iVar.setArguments(bundle);
        return iVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, C1124R.style.QGTransparent);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f1072b = arguments.getString("info");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(C1124R.layout.hw_dialog_prompt_login_success, viewGroup);
        this.f1073c = (TextView) inflate.findViewById(C1124R.C1126id.tv_userName);
        if (this.f1072b.length() >= 15) {
            str = this.f1072b.substring(0, 15) + "...";
        } else {
            str = this.f1072b;
        }
        this.f1073c.setText(str);
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f1074d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        this.f1071a.sendEmptyMessageDelayed(1, 1000);
        return super.show(fragmentTransaction, str);
    }

    public void show(FragmentManager fragmentManager, String str) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commitAllowingStateLoss();
        this.f1071a.sendEmptyMessageDelayed(1, 1000);
    }

    /* renamed from: a */
    public void mo12556a(DialogInterface.OnDismissListener onDismissListener) {
        this.f1074d = onDismissListener;
    }
}
