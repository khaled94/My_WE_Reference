package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byr  reason: default package */
/* loaded from: classes2.dex */
public final class byr implements bxm {
    private static final ThreadLocal<Cipher> a = new ThreadLocal<Cipher>() { // from class: byr.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Cipher initialValue() {
            return a();
        }

        private static Cipher a() {
            try {
                return cgc.a.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final SecretKey b;

    public byr(byte[] bArr) throws GeneralSecurityException {
        cgs.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    @Override // defpackage.bxm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] a2 = cgm.a(12);
        System.arraycopy(a2, 0, bArr3, 0, 12);
        a.get().init(1, this.b, a(a2, a2.length));
        if (bArr2 != null && bArr2.length != 0) {
            a.get().updateAAD(bArr2);
        }
        int doFinal = a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal != bArr.length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        return bArr3;
    }

    @Override // defpackage.bxm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        a.get().init(2, this.b, a(bArr, 12));
        if (bArr2 != null && bArr2.length != 0) {
            a.get().updateAAD(bArr2);
        }
        return a.get().doFinal(bArr, 12, bArr.length - 12);
    }

    private static AlgorithmParameterSpec a(byte[] bArr, int i) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (cgr.a()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
