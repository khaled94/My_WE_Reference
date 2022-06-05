package defpackage;

import defpackage.bya;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: byg  reason: default package */
/* loaded from: classes2.dex */
public class byg implements byb<bxm, bxm> {
    private static final Logger a = Logger.getLogger(byg.class.getName());

    /* renamed from: byg$a */
    /* loaded from: classes2.dex */
    static class a implements bxm {
        private final bya<bxm> a;

        /* synthetic */ a(bya byaVar, byte b) {
            this(byaVar);
        }

        private a(bya<bxm> byaVar) {
            this.a = byaVar;
        }

        @Override // defpackage.bxm
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return cfw.a(this.a.b.a(), this.a.b.a.a(bArr, bArr2));
        }

        @Override // defpackage.bxm
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (bya.a<bxm> aVar : this.a.a(copyOfRange)) {
                    try {
                        return aVar.a.b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = byg.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (bya.a<bxm> aVar2 : this.a.a(bxn.a)) {
                try {
                    return aVar2.a.b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    byg() {
    }

    @Override // defpackage.byb
    public final Class<bxm> a() {
        return bxm.class;
    }

    @Override // defpackage.byb
    public final Class<bxm> b() {
        return bxm.class;
    }

    public static void c() throws GeneralSecurityException {
        byc.a((byb) new byg());
    }

    @Override // defpackage.byb
    public final /* synthetic */ bxm a(bya<bxm> byaVar) throws GeneralSecurityException {
        return new a(byaVar, (byte) 0);
    }
}
