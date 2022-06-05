package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: cvn  reason: default package */
/* loaded from: classes2.dex */
public final class cvn extends cvo {
    public cvn(Paint paint, cva cvaVar) {
        super(paint, cvaVar);
    }

    @Override // defpackage.cvo
    public final void a(Canvas canvas, cud cudVar, int i, int i2) {
        if (!(cudVar instanceof cuk)) {
            return;
        }
        cuk cukVar = (cuk) cudVar;
        int i3 = cukVar.b;
        int i4 = cukVar.c;
        int i5 = cukVar.a / 2;
        int i6 = this.b.c;
        int i7 = this.b.k;
        int i8 = this.b.l;
        if (this.b.b() == cvb.HORIZONTAL) {
            this.c.left = i3;
            this.c.right = i4;
            this.c.top = i2 - i5;
            this.c.bottom = i5 + i2;
        } else {
            this.c.left = i - i5;
            this.c.right = i5 + i;
            this.c.top = i3;
            this.c.bottom = i4;
        }
        this.a.setColor(i7);
        float f = i;
        float f2 = i2;
        float f3 = i6;
        canvas.drawCircle(f, f2, f3, this.a);
        this.a.setColor(i8);
        canvas.drawRoundRect(this.c, f3, f3, this.a);
    }
}
