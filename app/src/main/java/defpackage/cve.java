package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: cve  reason: default package */
/* loaded from: classes2.dex */
public final class cve {
    public cvh a;
    public cvk b;
    public cvo c;
    public cvl d;
    public cvj e;
    public cvn f;
    public cvi g;
    public cvm h;
    public int i;
    public int j;
    public int k;
    private cvg l;

    public cve(cva cvaVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.l = new cvg(paint, cvaVar);
        this.a = new cvh(paint, cvaVar);
        this.b = new cvk(paint, cvaVar);
        this.c = new cvo(paint, cvaVar);
        this.d = new cvl(paint, cvaVar);
        this.e = new cvj(paint, cvaVar);
        this.f = new cvn(paint, cvaVar);
        this.g = new cvi(paint, cvaVar);
        this.h = new cvm(paint, cvaVar);
    }

    public final void a(Canvas canvas, boolean z) {
        if (this.a != null) {
            this.l.a(canvas, this.i, z, this.j, this.k);
        }
    }
}
