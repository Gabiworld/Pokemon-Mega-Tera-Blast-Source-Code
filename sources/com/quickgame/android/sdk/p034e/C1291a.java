package com.quickgame.android.sdk.p034e;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.quickgame.android.sdk.C1124R;
import com.quickgame.android.sdk.p039h.C1541g;
import com.quickgame.android.sdk.p043l.C1602e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo13300bv = {1, 0, 3}, mo13301d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo13302d2 = {"Lcom/quickgame/android/sdk/fragment/AgreementFragment;", "Lcom/quickgame/android/sdk/fragment/OldBaseFragment;", "()V", "listener", "Lcom/quickgame/android/sdk/fragment/AgreementFragment$Listener;", "initView", "", "view", "Landroid/view/View;", "keyBackDown", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "Listener", "TextAgreementClick", "quickgamesdk_a_normalPayThirdPayRelease"}, mo13303k = 1, mo13304mv = {1, 4, 0})
/* renamed from: com.quickgame.android.sdk.e.a */
public final class C1291a extends C1346j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1292a f985a;

    /* renamed from: b */
    private HashMap f986b;

    /* renamed from: com.quickgame.android.sdk.e.a$a */
    public interface C1292a {
        /* renamed from: a */
        void mo12188a();

        /* renamed from: b */
        void mo12189b();

        /* renamed from: c */
        void mo12190c();

        void onCancel();
    }

    /* renamed from: com.quickgame.android.sdk.e.a$b */
    private static final class C1293b extends ClickableSpan {

        /* renamed from: a */
        private final Context f987a;

        /* renamed from: b */
        private final int f988b;

        /* renamed from: c */
        private final C1292a f989c;

        public C1293b(Context context, int i, C1292a aVar) {
            this.f987a = context;
            this.f988b = i;
            this.f989c = aVar;
        }

        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "widget");
            if (1 == this.f988b) {
                C1292a aVar = this.f989c;
                if (aVar != null) {
                    aVar.mo12190c();
                    return;
                }
                return;
            }
            C1292a aVar2 = this.f989c;
            if (aVar2 != null) {
                aVar2.mo12189b();
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "ds");
            super.updateDrawState(textPaint);
            Context context = this.f987a;
            if (context != null) {
                textPaint.setColor(ContextCompat.getColor(context, C1124R.color.qg_agreement_service_and_policy_color));
            }
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.a$c */
    static final class C1294c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1291a f990a;

        C1294c(C1291a aVar) {
            this.f990a = aVar;
        }

        public final void onClick(View view) {
            C1292a a = this.f990a.f985a;
            if (a != null) {
                a.onCancel();
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.e.a$d */
    static final class C1295d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1291a f991a;

        C1295d(C1291a aVar) {
            this.f991a = aVar;
        }

        public final void onClick(View view) {
            C1602e.m2080c(this.f991a.getContext());
            C1292a a = this.f991a.f985a;
            if (a != null) {
                a.mo12188a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo12494a() {
        return true;
    }

    /* renamed from: b */
    public void mo12505b() {
        HashMap hashMap = this.f986b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C1124R.layout.qg_agreement_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…dialog, container, false)");
        mo12503a(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo12505b();
    }

    /* renamed from: a */
    public final void mo12504a(C1292a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "listener");
        this.f985a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12503a(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        view.findViewById(C1124R.C1126id.btn_cancel).setOnClickListener(new C1294c(this));
        view.findViewById(C1124R.C1126id.btn_confirm).setOnClickListener(new C1295d(this));
        String string = getString(C1124R.string.qg_agree_service_and_policy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qg_agree_service_and_policy)");
        TextView textView = (TextView) view.findViewById(C1124R.C1126id.tv_agreement_content);
        if (StringsKt.contains$default((CharSequence) string, (CharSequence) "《", false, 2, (Object) null)) {
            String str = string;
            i3 = StringsKt.indexOf$default((CharSequence) str, "《", 0, false, 6, (Object) null);
            i2 = StringsKt.indexOf$default((CharSequence) str, "》", 0, false, 6, (Object) null);
            i = StringsKt.indexOf$default((CharSequence) str, "《", i3 + 1, false, 4, (Object) null);
            i4 = StringsKt.indexOf$default((CharSequence) str, "》", i2 + 1, false, 4, (Object) null);
        } else {
            String str2 = string;
            i3 = StringsKt.indexOf$default((CharSequence) str2, "\"", 0, false, 6, (Object) null);
            i2 = StringsKt.indexOf$default((CharSequence) str2, "\"", i3 + 1, false, 4, (Object) null);
            i = StringsKt.indexOf$default((CharSequence) str2, "\"", i2 + 1, false, 4, (Object) null);
            i4 = StringsKt.indexOf$default((CharSequence) str2, "\"", i + 1, false, 4, (Object) null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new C1293b(getContext(), 1, this.f985a), i3, i2 + 1, 17);
            spannableStringBuilder.setSpan(new C1293b(getContext(), 2, this.f985a), i, i4 + 1, 17);
        }
        Intrinsics.checkNotNullExpressionValue(textView, "tv1");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Context context = getContext();
        if (context != null) {
            textView.setHighlightColor(ContextCompat.getColor(context, 17170445));
        }
        textView.setText(spannableStringBuilder);
        ImageView imageView = (ImageView) view.findViewById(C1124R.C1126id.img_logo);
        if (C1541g.m1887a().f1490m) {
            Intrinsics.checkNotNullExpressionValue(imageView, "logoImg");
            imageView.setVisibility(0);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(imageView, "logoImg");
        imageView.setVisibility(8);
    }
}
