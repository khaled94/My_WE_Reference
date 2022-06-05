package defpackage;

import com.google.android.gms.internal.places.zzbk;

/* renamed from: bcm  reason: default package */
/* loaded from: classes2.dex */
public class bcm {
    private static final bbo d = bbo.a();
    bgb a;
    volatile bdh b;
    volatile bgb c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcm)) {
            return false;
        }
        bcm bcmVar = (bcm) obj;
        bdh bdhVar = this.b;
        bdh bdhVar2 = bcmVar.b;
        if (bdhVar == null && bdhVar2 == null) {
            return c().equals(bcmVar.c());
        }
        if (bdhVar != null && bdhVar2 != null) {
            return bdhVar.equals(bdhVar2);
        }
        if (bdhVar != null) {
            return bdhVar.equals(bcmVar.a(bdhVar.g()));
        }
        return a(bdhVar2.g()).equals(bdhVar2);
    }

    private final bdh a(bdh bdhVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = bdhVar;
                        this.c = bgb.b;
                    } catch (zzbk unused) {
                        this.b = bdhVar;
                        this.c = bgb.b;
                    }
                }
            }
        }
        return this.b;
    }

    public final int b() {
        if (this.c != null) {
            return this.c.a();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.d();
    }

    public final bgb c() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.b == null) {
                this.c = bgb.b;
            } else {
                this.c = this.b.i();
            }
            return this.c;
        }
    }
}
