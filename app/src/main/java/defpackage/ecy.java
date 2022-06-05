package defpackage;

import java.io.IOException;

/* renamed from: ecy  reason: default package */
/* loaded from: classes2.dex */
final class ecy extends edc {
    final edu a;
    long b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ecy(long j) {
        edu eduVar = new edu();
        this.a = eduVar;
        a(eduVar, j);
    }

    @Override // defpackage.edc, defpackage.ebb
    public final long b() throws IOException {
        return this.b;
    }

    @Override // defpackage.edc
    public final eba a(eba ebaVar) throws IOException {
        if (ebaVar.a("Content-Length") != null) {
            return ebaVar;
        }
        this.d.close();
        this.b = this.a.b;
        return ebaVar.e().a("Transfer-Encoding").a("Content-Length", Long.toString(this.a.b)).a();
    }

    @Override // defpackage.ebb
    public final void a(edv edvVar) throws IOException {
        this.a.a(edvVar.b(), 0L, this.a.b);
    }
}
