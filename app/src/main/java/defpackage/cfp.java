package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cfp  reason: default package */
/* loaded from: classes2.dex */
public final class cfp implements cgg {
    private static final ThreadLocal<Cipher> a = new ThreadLocal<Cipher>() { // from class: cfp.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Cipher initialValue() {
            return a();
        }

        private static Cipher a() {
            try {
                return cgc.a.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final SecretKeySpec b;
    private final int c;
    private final int d;

    public cfp(byte[] bArr, int i) throws GeneralSecurityException {
        cgs.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        int blockSize = a.get().getBlockSize();
        this.d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.c = i;
    }

    @Override // defpackage.cgg
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.c));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] a2 = cgm.a(i);
        System.arraycopy(a2, 0, bArr2, 0, this.c);
        a(bArr, 0, bArr.length, bArr2, this.c, a2, true);
        return bArr2;
    }

    @Override // defpackage.cgg
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.c;
        byte[] bArr3 = new byte[length2 - i2];
        a(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    private void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = a.get();
        byte[] bArr4 = new byte[this.d];
        System.arraycopy(bArr3, 0, bArr4, 0, this.c);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.b, ivParameterSpec);
        } else {
            cipher.init(2, this.b, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
