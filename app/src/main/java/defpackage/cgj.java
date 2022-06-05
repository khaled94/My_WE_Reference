package defpackage;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* renamed from: cgj  reason: default package */
/* loaded from: classes2.dex */
public final class cgj implements bze {
    private final SecretKey a;
    private byte[] b;
    private byte[] c;

    private static Cipher a() throws GeneralSecurityException {
        return cgc.a.a("AES/ECB/NoPadding");
    }

    public cgj(byte[] bArr) throws GeneralSecurityException {
        cgs.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        Cipher a = a();
        a.init(1, this.a);
        byte[] a2 = cfu.a(a.doFinal(new byte[16]));
        this.b = a2;
        this.c = cfu.a(a2);
    }

    @Override // defpackage.bze
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher a = a();
        a.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            bArr2 = cfw.a(bArr, (max - 1) * 16, this.b, 0, 16);
        } else {
            bArr2 = cfw.b(cfu.b(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.c);
        }
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr3 = a.doFinal(cfw.a(bArr3, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(a.doFinal(cfw.b(bArr2, bArr3)), i);
    }
}
