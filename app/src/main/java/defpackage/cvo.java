package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: cvo  reason: default package */
/* loaded from: classes2.dex */
public class cvo extends cvf {
    public RectF c = new RectF();

    public cvo(Paint paint, cva cvaVar) {
        super(paint, cvaVar);
    }

    public void a(Canvas canvas, cud cudVar, int i, int i2) {
        if (!(cudVar instanceof cul)) {
            return;
        }
        cul culVar = (cul) cudVar;
        int i3 = culVar.b;
        int i4 = culVar.c;
        int i5 = this.b.c;
        int i6 = this.b.k;
        int i7 = this.b.l;
        if (this.b.b() == cvb.HORIZONTAL) {
            this.c.left = i3;
            this.c.right = i4;
            this.c.top = i2 - i5;
            this.c.bottom = i2 + i5;
        } else {
            this.c.left = i - i5;
            this.c.right = i + i5;
            this.c.top = i3;
            this.c.bottom = i4;
        }
        this.a.setColor(i6);
        float f = i;
        float f2 = i2;
        float f3 = i5;
        canvas.drawCircle(f, f2, f3, this.a);
        this.a.setColor(i7);
        canvas.drawRoundRect(this.c, f3, f3, this.a);
    }
}
