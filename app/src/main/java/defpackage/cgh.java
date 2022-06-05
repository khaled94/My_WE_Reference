package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* renamed from: cgh  reason: default package */
/* loaded from: classes2.dex */
abstract class cgh implements byd {
    public abstract int a();

    public abstract cgo a(byte[] bArr) throws GeneralSecurityException;

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract cgn e() throws GeneralSecurityException;

    @Override // defpackage.byd
    public OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new cgq(this, outputStream, bArr);
    }

    @Override // defpackage.byd
    public InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new cgp(this, inputStream, bArr);
    }
}
