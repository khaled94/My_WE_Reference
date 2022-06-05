package defpackage;

import defpackage.ear;
import defpackage.eat;
import defpackage.ebc;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ecr  reason: default package */
/* loaded from: classes2.dex */
public final class ecr implements ecc {
    private static final List<String> a = ebk.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> b = ebk.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final eat.a c;
    private final ebv d;
    private final ecq e;
    private volatile ect f;
    private final eay g;
    private volatile boolean h;

    public ecr(eaw eawVar, ebv ebvVar, eat.a aVar, ecq ecqVar) {
        eay eayVar;
        this.d = ebvVar;
        this.c = aVar;
        this.e = ecqVar;
        if (eawVar.e.contains(eay.H2_PRIOR_KNOWLEDGE)) {
            eayVar = eay.H2_PRIOR_KNOWLEDGE;
        } else {
            eayVar = eay.HTTP_2;
        }
        this.g = eayVar;
    }

    @Override // defpackage.ecc
    public final ebv a() {
        return this.d;
    }

    @Override // defpackage.ecc
    public final eem a(eba ebaVar, long j) {
        return this.f.d();
    }

    @Override // defpackage.ecc
    public final void a(eba ebaVar) throws IOException {
        if (this.f != null) {
            return;
        }
        boolean z = ebaVar.d != null;
        ear earVar = ebaVar.c;
        ArrayList arrayList = new ArrayList((earVar.a.length / 2) + 4);
        arrayList.add(new ecn(ecn.c, ebaVar.b));
        arrayList.add(new ecn(ecn.d, eci.a(ebaVar.a)));
        String a2 = ebaVar.a("Host");
        if (a2 != null) {
            arrayList.add(new ecn(ecn.f, a2));
        }
        arrayList.add(new ecn(ecn.e, ebaVar.a.a));
        int length = earVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = earVar.a(i).toLowerCase(Locale.US);
            if (!a.contains(lowerCase) || (lowerCase.equals("te") && earVar.b(i).equals("trailers"))) {
                arrayList.add(new ecn(lowerCase, earVar.b(i)));
            }
        }
        this.f = this.e.a(arrayList, z);
        if (this.h) {
            this.f.a(ecm.CANCEL);
            throw new IOException("Canceled");
        }
        this.f.g.a(this.c.d(), TimeUnit.MILLISECONDS);
        this.f.h.a(this.c.e(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ecc
    public final void b() throws IOException {
        this.e.q.b();
    }

    @Override // defpackage.ecc
    public final void c() throws IOException {
        this.f.d().close();
    }

    @Override // defpackage.ecc
    public final ebc.a a(boolean z) throws IOException {
        ear c = this.f.c();
        eay eayVar = this.g;
        ear.a aVar = new ear.a();
        int length = c.a.length / 2;
        eck eckVar = null;
        for (int i = 0; i < length; i++) {
            String a2 = c.a(i);
            String b2 = c.b(i);
            if (a2.equals(":status")) {
                eckVar = eck.a("HTTP/1.1 ".concat(String.valueOf(b2)));
            } else if (!b.contains(a2)) {
                ebg.a.a(aVar, a2, b2);
            }
        }
        if (eckVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ebc.a aVar2 = new ebc.a();
        aVar2.b = eayVar;
        aVar2.c = eckVar.b;
        aVar2.d = eckVar.c;
        ebc.a a3 = aVar2.a(aVar.a());
        if (z && ebg.a.a(a3) == 100) {
            return null;
        }
        return a3;
    }

    @Override // defpackage.ecc
    public final long a(ebc ebcVar) {
        return ece.a(ebcVar);
    }

    @Override // defpackage.ecc
    public final een b(ebc ebcVar) {
        return this.f.e;
    }

    @Override // defpackage.ecc
    public final void d() {
        this.h = true;
        if (this.f != null) {
            this.f.a(ecm.CANCEL);
        }
    }
}
