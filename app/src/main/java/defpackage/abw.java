package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import defpackage.vc;

/* renamed from: abw  reason: default package */
/* loaded from: classes.dex */
public final class abw {
    public final SparseIntArray a;
    private uy b;

    public abw() {
        this(ux.a());
    }

    public final int a(int i) {
        return this.a.get(i, -1);
    }

    public final int a(Context context, vc.f fVar) {
        char c;
        aat.a(context);
        aat.a(fVar);
        int i = 0;
        if (!fVar.l()) {
            return 0;
        }
        int a = fVar.a();
        int a2 = a(a);
        if (a2 != -1) {
            return a2;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                c = 65535;
                break;
            }
            int keyAt = this.a.keyAt(i2);
            if (keyAt > a && this.a.get(keyAt) == 0) {
                c = 0;
                break;
            }
            i2++;
        }
        if (c == 65535) {
            i = this.b.a(context, a);
        }
        this.a.put(a, i);
        return i;
    }

    public abw(uy uyVar) {
        this.a = new SparseIntArray();
        aat.a(uyVar);
        this.b = uyVar;
    }
}
