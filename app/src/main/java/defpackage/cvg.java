package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: cvg  reason: default package */
/* loaded from: classes2.dex */
public final class cvg extends cvf {
    private Paint c;

    public cvg(Paint paint, cva cvaVar) {
        super(paint, cvaVar);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth(cvaVar.i);
    }

    public final void a(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float f = this.b.c;
        int i4 = this.b.i;
        float f2 = this.b.j;
        int i5 = this.b.l;
        int i6 = this.b.k;
        int i7 = this.b.r;
        cum c = this.b.c();
        if (c == cum.SCALE && !z) {
            f *= f2;
        }
        if (i != i7) {
            i5 = i6;
        }
        if (c == cum.FILL && i != i7) {
            paint = this.c;
            paint.setStrokeWidth(i4);
        } else {
            paint = this.a;
        }
        paint.setColor(i5);
        canvas.drawCircle(i2, i3, f, paint);
    }
}
