package com.quickgame.android.sdk.p028d.p030b.p032b;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.quickgame.android.sdk.C1124R;
import java.lang.ref.WeakReference;

/* renamed from: com.quickgame.android.sdk.d.b.b.a */
public class C1283a extends DialogFragment {

    /* renamed from: a */
    private TextView f966a;

    /* renamed from: b */
    private String f967b;

    /* renamed from: c */
    private DialogInterface.OnDismissListener f968c;

    /* renamed from: d */
    private View f969d;

    /* renamed from: com.quickgame.android.sdk.d.b.b.a$a */
    class C1284a implements View.OnTouchListener {
        C1284a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C1283a.this.dismiss();
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.d.b.b.a$b */
    public static class C1285b extends Handler {

        /* renamed from: a */
        WeakReference<C1283a> f971a;

        public C1285b(C1283a aVar) {
            this.f971a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C1283a aVar = (C1283a) this.f971a.get();
            if (aVar != null) {
                aVar.dismissAllowingStateLoss();
            }
        }
    }

    public C1283a() {
        new C1285b(this);
    }

    /* renamed from: a */
    public static C1283a m1406a(String str) {
        C1283a aVar = new C1283a();
        Bundle bundle = new Bundle();
        bundle.putString("content", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        TextView textView = (TextView) this.f969d.findViewById(C1124R.C1126id.hw_dialog_fragment_content);
        this.f966a = textView;
        textView.setText(this.f967b);
        mo12490a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, C1124R.style.QGTransparent);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f967b = arguments.getString("content");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1124R.layout.hw_dialog_fragment_info, viewGroup);
        this.f969d = inflate;
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f968c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* renamed from: a */
    public void mo12490a() {
        this.f969d.setOnTouchListener(new C1284a());
    }
}
