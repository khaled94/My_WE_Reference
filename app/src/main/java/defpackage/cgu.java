package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: cgu  reason: default package */
/* loaded from: classes2.dex */
public final class cgu extends cga {
    @Override // defpackage.cga, defpackage.bxm
    public final /* bridge */ /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.a(bArr, bArr2);
    }

    @Override // defpackage.cga, defpackage.bxm
    public final /* bridge */ /* synthetic */ byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.b(bArr, bArr2);
    }

    public cgu(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // defpackage.cga
    final cfy a(byte[] bArr, int i) throws InvalidKeyException {
        return new cgt(bArr, i);
    }
}
