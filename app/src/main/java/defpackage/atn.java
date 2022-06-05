package defpackage;

import com.google.android.gms.internal.measurement.zzfi;

/* renamed from: atn  reason: default package */
/* loaded from: classes.dex */
public class atn {
    private static final asn d = asn.a();
    art a;
    volatile aui b;
    volatile art c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atn)) {
            return false;
        }
        atn atnVar = (atn) obj;
        aui auiVar = this.b;
        aui auiVar2 = atnVar.b;
        if (auiVar == null && auiVar2 == null) {
            return c().equals(atnVar.c());
        }
        if (auiVar != null && auiVar2 != null) {
            return auiVar.equals(auiVar2);
        }
        if (auiVar != null) {
            return auiVar.equals(atnVar.a(auiVar.g_()));
        }
        return a(auiVar2.g_()).equals(auiVar2);
    }

    private final aui a(aui auiVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = auiVar;
                        this.c = art.a;
                    } catch (zzfi unused) {
                        this.b = auiVar;
                        this.c = art.a;
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
        return this.b.o();
    }

    public final art c() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.b == null) {
                this.c = art.a;
            } else {
                this.c = this.b.h();
            }
            return this.c;
        }
    }
}
