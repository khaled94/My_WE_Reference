package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* renamed from: cfl  reason: default package */
/* loaded from: classes2.dex */
final class cfl implements byd {
    bya<byd> a;

    public cfl(bya<byd> byaVar) throws GeneralSecurityException {
        if (byaVar.b == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        this.a = byaVar;
    }

    @Override // defpackage.byd
    public final InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new cfj(this.a, inputStream, bArr);
    }

    @Override // defpackage.byd
    public final OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.a.b.a.a(outputStream, bArr);
    }
}
