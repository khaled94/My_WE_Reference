package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cft  reason: default package */
/* loaded from: classes2.dex */
public final class cft implements bxo {
    private static final Collection<Integer> a = Arrays.asList(64);
    private static final byte[] b = new byte[16];
    private static final byte[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final cgj d;
    private final byte[] e;

    public cft(byte[] bArr) throws GeneralSecurityException {
        if (!a.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.e = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.d = new cgj(copyOfRange);
    }

    private byte[] a(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArr2;
        byte[] a2 = this.d.a(b, 16);
        for (int i = 0; i <= 0; i++) {
            a2 = cfw.b(cfu.a(a2), this.d.a(bArr[0] == null ? new byte[0] : bArr[0], 16));
        }
        byte[] bArr3 = bArr[1];
        if (bArr3.length < 16) {
            bArr2 = cfw.b(cfu.b(bArr3), cfu.a(a2));
        } else if (bArr3.length < a2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        } else {
            int length = bArr3.length - a2.length;
            bArr2 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < a2.length; i2++) {
                int i3 = length + i2;
                bArr2[i3] = (byte) (bArr2[i3] ^ a2[i2]);
            }
        }
        return this.d.a(bArr2, 16);
    }

    @Override // defpackage.bxo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher a2 = cgc.a.a("AES/CTR/NoPadding");
        byte[] a3 = a(bArr2, bArr);
        byte[] bArr3 = (byte[]) a3.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a2.init(1, new SecretKeySpec(this.e, "AES"), new IvParameterSpec(bArr3));
        return cfw.a(a3, a2.doFinal(bArr));
    }

    @Override // defpackage.bxo
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher a2 = cgc.a.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        a2.init(2, new SecretKeySpec(this.e, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = a2.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && cgr.a()) {
            doFinal = new byte[0];
        }
        if (!cfw.a(copyOfRange, a(bArr2, doFinal))) {
            throw new AEADBadTagException("Integrity check failed.");
        }
        return doFinal;
    }
}
