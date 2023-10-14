package com.quickgame.android.sdk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f1761a;

    /* renamed from: b */
    private float f1762b;

    /* renamed from: c */
    private float f1763c;

    /* renamed from: d */
    private Paint f1764d;

    /* renamed from: e */
    private Matrix f1765e;

    public CircleImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private BitmapShader m2396a(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float max = Math.max(this.f1761a / ((float) bitmap.getWidth()), this.f1762b / ((float) bitmap.getHeight()));
        this.f1765e.setScale(max, max);
        bitmapShader.setLocalMatrix(this.f1765e);
        return bitmapShader;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
        } else if (drawable instanceof BitmapDrawable) {
            this.f1764d.setShader(m2396a((BitmapDrawable) drawable));
            canvas.drawCircle(this.f1761a / 2.0f, this.f1762b / 2.0f, this.f1763c, this.f1764d);
        } else {
            super.onDraw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1761a = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        this.f1762b = measuredHeight;
        this.f1763c = Math.min(this.f1761a, measuredHeight) / 2.0f;
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f1764d = paint;
        paint.setAntiAlias(true);
        this.f1765e = new Matrix();
    }
}
