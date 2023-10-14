package com.quickgame.android.sdk.facebook.p037ui.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;

/* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar */
public class ChoiceBar extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public LinearLayout f1271a;

    /* renamed from: b */
    private LinearLayout.LayoutParams f1272b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f1273c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1439c f1274d;

    /* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar$a */
    class C1437a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChoiceBarTab f1275a;

        C1437a(ChoiceBarTab choiceBarTab) {
            this.f1275a = choiceBarTab;
        }

        public void onClick(View view) {
            if (ChoiceBar.this.f1274d != null) {
                int tabPosition = this.f1275a.getTabPosition();
                if (ChoiceBar.this.f1273c == tabPosition) {
                    ChoiceBar.this.f1274d.mo12085b(tabPosition);
                    return;
                }
                ChoiceBar.this.f1274d.mo12084a(tabPosition, ChoiceBar.this.f1273c);
                this.f1275a.setSelected(true);
                ChoiceBar.this.f1274d.mo12083a(ChoiceBar.this.f1273c);
                ChoiceBar.this.f1271a.getChildAt(ChoiceBar.this.f1273c).setSelected(false);
                int unused = ChoiceBar.this.f1273c = tabPosition;
            }
        }
    }

    /* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar$b */
    class C1438b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f1277a;

        C1438b(int i) {
            this.f1277a = i;
        }

        public void run() {
            ChoiceBar.this.f1271a.getChildAt(this.f1277a).performClick();
        }
    }

    /* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar$c */
    public interface C1439c {
        /* renamed from: a */
        void mo12083a(int i);

        /* renamed from: a */
        void mo12084a(int i, int i2);

        /* renamed from: b */
        void mo12085b(int i);
    }

    public ChoiceBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getCurrentItemPosition() {
        return this.f1273c;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1440d dVar = (C1440d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        if (this.f1273c != dVar.f1279a) {
            this.f1271a.getChildAt(this.f1273c).setSelected(false);
            this.f1271a.getChildAt(dVar.f1279a).setSelected(true);
        }
        this.f1273c = dVar.f1279a;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new C1440d(super.onSaveInstanceState(), this.f1273c);
    }

    public void setCurrentItem(int i) {
        this.f1271a.post(new C1438b(i));
    }

    public void setOnTabSelectedListener(C1439c cVar) {
        this.f1274d = cVar;
    }

    /* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar$d */
    static class C1440d extends View.BaseSavedState {
        public static final Parcelable.Creator<C1440d> CREATOR = new C1441a();
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f1279a;

        /* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBar$d$a */
        class C1441a implements Parcelable.Creator<C1440d> {
            C1441a() {
            }

            public C1440d createFromParcel(Parcel parcel) {
                return new C1440d(parcel);
            }

            public C1440d[] newArray(int i) {
                return new C1440d[i];
            }
        }

        public C1440d(Parcel parcel) {
            super(parcel);
            this.f1279a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1279a);
        }

        public C1440d(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1279a = i;
        }
    }

    public ChoiceBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChoiceBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new AccelerateDecelerateInterpolator();
        this.f1273c = 0;
        m1712a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1712a(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1271a = linearLayout;
        linearLayout.setBackgroundColor(0);
        this.f1271a.setOrientation(0);
        addView(this.f1271a, new LinearLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        this.f1272b = layoutParams;
        layoutParams.weight = 1.0f;
    }

    /* renamed from: a */
    public ChoiceBar mo12676a(ChoiceBarTab choiceBarTab) {
        choiceBarTab.setOnClickListener(new C1437a(choiceBarTab));
        choiceBarTab.setTabPosition(this.f1271a.getChildCount());
        choiceBarTab.setLayoutParams(this.f1272b);
        this.f1271a.addView(choiceBarTab);
        return this;
    }
}
