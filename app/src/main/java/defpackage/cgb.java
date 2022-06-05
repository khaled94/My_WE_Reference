package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: cgb  reason: default package */
/* loaded from: classes2.dex */
public final class cgb implements bxm {
    private final cgg a;
    private final bxz b;
    private final int c;

    public cgb(cgg cggVar, bxz bxzVar, int i) {
        this.a = cggVar;
        this.b = bxzVar;
        this.c = i;
    }

    @Override // defpackage.bxm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return cfw.a(a, this.b.a(cfw.a(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // defpackage.bxm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, cfw.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.a.b(copyOfRange);
    }
}
