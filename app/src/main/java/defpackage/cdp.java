package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: cdp  reason: default package */
/* loaded from: classes2.dex */
public class cdp {
    private static final cdb b = cdb.a();
    protected volatile cec a;
    private ccu c;
    private cdb d;
    private volatile ccu e;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdp)) {
            return false;
        }
        cdp cdpVar = (cdp) obj;
        cec cecVar = this.a;
        cec cecVar2 = cdpVar.a;
        if (cecVar == null && cecVar2 == null) {
            return c().equals(cdpVar.c());
        }
        if (cecVar != null && cecVar2 != null) {
            return cecVar.equals(cecVar2);
        }
        if (cecVar != null) {
            return cecVar.equals(cdpVar.a(cecVar.s()));
        }
        return a(cecVar2.s()).equals(cecVar2);
    }

    public final cec a(cec cecVar) {
        c(cecVar);
        return this.a;
    }

    public final cec b(cec cecVar) {
        cec cecVar2 = this.a;
        this.c = null;
        this.e = null;
        this.a = cecVar;
        return cecVar2;
    }

    public final int b() {
        if (this.e != null) {
            return this.e.b();
        }
        ccu ccuVar = this.c;
        if (ccuVar != null) {
            return ccuVar.b();
        }
        if (this.a == null) {
            return 0;
        }
        return this.a.o();
    }

    public final ccu c() {
        if (this.e != null) {
            return this.e;
        }
        ccu ccuVar = this.c;
        if (ccuVar != null) {
            return ccuVar;
        }
        synchronized (this) {
            if (this.e != null) {
                return this.e;
            }
            if (this.a == null) {
                this.e = ccu.a;
            } else {
                this.e = this.a.f();
            }
            return this.e;
        }
    }

    private void c(cec cecVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                if (this.c != null) {
                    this.a = cecVar.i().a(this.c, this.d);
                    this.e = this.c;
                } else {
                    this.a = cecVar;
                    this.e = ccu.a;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.a = cecVar;
                this.e = ccu.a;
            }
        }
    }
}
