package defpackage;

import com.android.volley.VolleyError;

/* renamed from: am  reason: default package */
/* loaded from: classes.dex */
public final class am implements aw {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public am() {
        this(2500, 1, 1.0f);
    }

    public am(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    @Override // defpackage.aw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aw
    public final void a(VolleyError volleyError) throws VolleyError {
        boolean z = true;
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        this.a = (int) (i2 + (i2 * this.d));
        if (i > this.c) {
            z = false;
        }
        if (z) {
            return;
        }
        throw volleyError;
    }
}
