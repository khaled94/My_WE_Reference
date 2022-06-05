package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cfq  reason: default package */
/* loaded from: classes2.dex */
public final class cfq implements bxm {
    static final /* synthetic */ boolean a = !cfq.class.desiredAssertionStatus();
    private static final ThreadLocal<Cipher> b = new ThreadLocal<Cipher>() { // from class: cfq.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Cipher initialValue() {
            return a();
        }

        private static Cipher a() {
            try {
                return cgc.a.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private static final ThreadLocal<Cipher> c = new ThreadLocal<Cipher>() { // from class: cfq.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Cipher initialValue() {
            return a();
        }

        private static Cipher a() {
            try {
                return cgc.a.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final byte[] d;
    private final byte[] e;
    private final SecretKeySpec f;
    private final int g;

    public cfq(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.g = i;
        cgs.a(bArr.length);
        this.f = new SecretKeySpec(bArr, "AES");
        Cipher cipher = b.get();
        cipher.init(1, this.f);
        byte[] a2 = a(cipher.doFinal(new byte[16]));
        this.d = a2;
        this.e = a(a2);
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        if (a || bArr.length == bArr2.length) {
            int length = bArr.length;
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        }
        throw new AssertionError();
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    private byte[] b(byte[] bArr) {
        if (bArr.length == 16) {
            return c(bArr, this.d);
        }
        byte[] copyOf = Arrays.copyOf(this.e, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private byte[] a(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        if (a || i3 >= 0) {
            if (!a && (i < 0 || i > 3)) {
                throw new AssertionError();
            }
            byte[] bArr2 = new byte[16];
            bArr2[15] = (byte) i;
            if (i3 == 0) {
                return cipher.doFinal(c(bArr2, this.d));
            }
            byte[] doFinal = cipher.doFinal(bArr2);
            int i4 = 0;
            while (i3 - i4 > 16) {
                for (int i5 = 0; i5 < 16; i5++) {
                    doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
                }
                doFinal = cipher.doFinal(doFinal);
                i4 += 16;
            }
            return cipher.doFinal(c(doFinal, b(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
        }
        throw new AssertionError();
    }

    @Override // defpackage.bxm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.g;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] a2 = cgm.a(i);
        System.arraycopy(a2, 0, bArr3, 0, this.g);
        Cipher cipher = b.get();
        cipher.init(1, this.f);
        byte[] a3 = a(cipher, 0, a2, 0, a2.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] a4 = a(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = c.get();
        cipher2.init(1, this.f, new IvParameterSpec(a3));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.g);
        byte[] a5 = a(cipher, 2, bArr3, this.g, bArr.length);
        int length2 = bArr.length + this.g;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((a4[i2] ^ a3[i2]) ^ a5[i2]);
        }
        return bArr3;
    }

    @Override // defpackage.bxm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.g) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = b.get();
        cipher.init(1, this.f);
        byte[] a2 = a(cipher, 0, bArr, 0, this.g);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] a3 = a(cipher, 1, bArr3, 0, bArr3.length);
        byte[] a4 = a(cipher, 2, bArr, this.g, length);
        int length2 = bArr.length - 16;
        byte b2 = 0;
        for (int i = 0; i < 16; i++) {
            b2 = (byte) (b2 | (((bArr[length2 + i] ^ a3[i]) ^ a2[i]) ^ a4[i]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = c.get();
        cipher2.init(1, this.f, new IvParameterSpec(a2));
        return cipher2.doFinal(bArr, this.g, length);
    }
}
