package defpackage;

import defpackage.eat;
import defpackage.ebc;
import defpackage.ebt;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: ecb  reason: default package */
/* loaded from: classes2.dex */
public final class ecb implements eat {
    private final boolean a;

    public ecb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.eat
    public final ebc a(eat.a aVar) throws IOException {
        ebc ebcVar;
        ecg ecgVar = (ecg) aVar;
        if (ecgVar.b == null) {
            throw new IllegalStateException();
        }
        ebt ebtVar = ecgVar.b;
        eba ebaVar = ecgVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ebtVar.e.a(ebaVar);
            ebc.a aVar2 = null;
            if (ecf.a(ebaVar.b) && ebaVar.d != null) {
                if ("100-continue".equalsIgnoreCase(ebaVar.a("Expect"))) {
                    try {
                        ebtVar.e.b();
                        aVar2 = ebtVar.a(true);
                    } catch (IOException e) {
                        ebtVar.a(e);
                        throw e;
                    }
                }
                if (aVar2 != null) {
                    ebtVar.d();
                    if (!ebtVar.a().e()) {
                        ebtVar.b();
                    }
                } else {
                    ebtVar.f = false;
                    long b = ebaVar.d.b();
                    edv a = eed.a(new ebt.a(ebtVar.e.a(ebaVar, b), b));
                    ebaVar.d.a(a);
                    a.close();
                }
            } else {
                ebtVar.d();
            }
            try {
                ebtVar.e.c();
                if (aVar2 == null) {
                    aVar2 = ebtVar.a(false);
                }
                aVar2.a = ebaVar;
                aVar2.e = ebtVar.a().e;
                aVar2.k = currentTimeMillis;
                aVar2.l = System.currentTimeMillis();
                ebc a2 = aVar2.a();
                int i = a2.c;
                if (i == 100) {
                    ebc.a a3 = ebtVar.a(false);
                    a3.a = ebaVar;
                    a3.e = ebtVar.a().e;
                    a3.k = currentTimeMillis;
                    a3.l = System.currentTimeMillis();
                    a2 = a3.a();
                    i = a2.c;
                }
                if (this.a && i == 101) {
                    ebc.a i2 = a2.i();
                    i2.g = ebk.d;
                    ebcVar = i2.a();
                } else {
                    ebc.a i3 = a2.i();
                    i3.g = ebtVar.a(a2);
                    ebcVar = i3.a();
                }
                if ("close".equalsIgnoreCase(ebcVar.a.a("Connection")) || "close".equalsIgnoreCase(ebcVar.a("Connection"))) {
                    ebtVar.b();
                }
                if ((i != 204 && i != 205) || ebcVar.g.b() <= 0) {
                    return ebcVar;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + ebcVar.g.b());
            } catch (IOException e2) {
                ebtVar.a(e2);
                throw e2;
            }
        } catch (IOException e3) {
            ebtVar.a(e3);
            throw e3;
        }
    }
}
