package defpackage;

import defpackage.eat;
import defpackage.eba;
import defpackage.ebc;
import java.io.IOException;
import java.util.List;

/* renamed from: eca  reason: default package */
/* loaded from: classes2.dex */
public final class eca implements eat {
    private final eal a;

    public eca(eal ealVar) {
        this.a = ealVar;
    }

    @Override // defpackage.eat
    public final ebc a(eat.a aVar) throws IOException {
        boolean z;
        eba a = aVar.a();
        eba.a e = a.e();
        ebb ebbVar = a.d;
        if (ebbVar != null) {
            eau a2 = ebbVar.a();
            if (a2 != null) {
                e.a("Content-Type", a2.toString());
            }
            long b = ebbVar.b();
            if (b != -1) {
                e.a("Content-Length", Long.toString(b));
                e.a("Transfer-Encoding");
            } else {
                e.a("Transfer-Encoding", "chunked");
                e.a("Content-Length");
            }
        }
        if (a.a("Host") == null) {
            e.a("Host", ebk.a(a.a, false));
        }
        if (a.a("Connection") == null) {
            e.a("Connection", "Keep-Alive");
        }
        if (a.a("Accept-Encoding") == null && a.a("Range") == null) {
            e.a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<eak> a3 = this.a.a();
        if (!a3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                eak eakVar = a3.get(i);
                sb.append(eakVar.a);
                sb.append('=');
                sb.append(eakVar.b);
            }
            e.a("Cookie", sb.toString());
        }
        if (a.a("User-Agent") == null) {
            e.a("User-Agent", "okhttp/3.14.9");
        }
        ebc a4 = aVar.a(e.a());
        ece.a(this.a, a.a, a4.f);
        ebc.a i2 = a4.i();
        i2.a = a;
        if (z && "gzip".equalsIgnoreCase(a4.a("Content-Encoding")) && ece.b(a4)) {
            eeb eebVar = new eeb(a4.g.d());
            i2.a(a4.f.b().a("Content-Encoding").a("Content-Length").a());
            i2.g = new ech(a4.a("Content-Type"), -1L, eed.a(eebVar));
        }
        return i2.a();
    }
}
