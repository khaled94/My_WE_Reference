package defpackage;

import java.security.InvalidKeyException;

/* renamed from: cfx  reason: default package */
/* loaded from: classes2.dex */
final class cfx extends cfy {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cfy
    public final int a() {
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cfx(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // defpackage.cfy
    final int[] a(int[] iArr, int i) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        cfy.a(iArr2, this.a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
