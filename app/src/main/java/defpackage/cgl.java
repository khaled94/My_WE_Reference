package defpackage;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* renamed from: cgl  reason: default package */
/* loaded from: classes2.dex */
public final class cgl implements bxz {
    private final bze a;
    private final int b;

    public cgl(bze bzeVar, int i) throws GeneralSecurityException {
        this.a = bzeVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        bzeVar.a(new byte[0], i);
    }

    @Override // defpackage.bxz
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.a.a(bArr, this.b);
    }

    @Override // defpackage.bxz
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (cfw.a(a(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
