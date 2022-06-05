package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: cgt  reason: default package */
/* loaded from: classes2.dex */
final class cgt extends cfy {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cfy
    public final int a() {
        return 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cgt(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // defpackage.cfy
    final int[] a(int[] iArr, int i) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        cfy.a(r0, this.a);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
        cfy.a(iArr3);
        cfy.a(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
