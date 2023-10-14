package com.quickgame.android.sdk.facebook.p037ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.quickgame.android.sdk.C1124R;

/* renamed from: com.quickgame.android.sdk.facebook.ui.view.ChoiceBarTab */
public class ChoiceBarTab extends FrameLayout {

    /* renamed from: a */
    private TextView f1280a;

    /* renamed from: b */
    private Context f1281b;

    /* renamed from: c */
    private int f1282c;

    public ChoiceBarTab(Context context, int i, String str) {
        this(context, (AttributeSet) null, i, str);
    }

    /* renamed from: a */
    private void m1720a(Context context, int i, String str) {
        this.f1281b = context;
        this.f1280a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f1280a.setBackgroundResource(i);
        this.f1280a.setTextColor(this.f1281b.getResources().getColor(C1124R.color.hw_dialog_content_textColor_b));
        this.f1280a.setText(str);
        this.f1280a.setGravity(17);
        this.f1280a.setPadding(0, 14, 0, 24);
        this.f1280a.setTextSize(2, 16.0f);
        this.f1280a.setLayoutParams(layoutParams);
        addView(this.f1280a);
    }

    public int getTabPosition() {
        return this.f1282c;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            this.f1280a.setTextColor(this.f1281b.getResources().getColor(C1124R.color.hw_dialog_content_textColor_a));
            this.f1280a.setSelected(true);
            return;
        }
        this.f1280a.setTextColor(this.f1281b.getResources().getColor(C1124R.color.hw_dialog_content_textColor_b));
        this.f1280a.setSelected(false);
    }

    public void setTabPosition(int i) {
        this.f1282c = i;
        if (i == 0) {
            setSelected(true);
        }
    }

    public ChoiceBarTab(Context context, AttributeSet attributeSet, int i, String str) {
        this(context, attributeSet, 0, i, str);
    }

    public ChoiceBarTab(Context context, AttributeSet attributeSet, int i, int i2, String str) {
        super(context, attributeSet, i);
        this.f1282c = -1;
        m1720a(context, i2, str);
    }
}
