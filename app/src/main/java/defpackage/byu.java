package defpackage;

import defpackage.bya;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: byu  reason: default package */
/* loaded from: classes2.dex */
public class byu implements byb<bxo, bxo> {
    private static final Logger a = Logger.getLogger(byu.class.getName());

    /* renamed from: byu$a */
    /* loaded from: classes2.dex */
    static class a implements bxo {
        private bya<bxo> a;

        public a(bya<bxo> byaVar) {
            this.a = byaVar;
        }

        @Override // defpackage.bxo
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return cfw.a(this.a.b.a(), this.a.b.a.a(bArr, bArr2));
        }

        @Override // defpackage.bxo
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (bya.a<bxo> aVar : this.a.a(copyOfRange)) {
                    try {
                        return aVar.a.b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = byu.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (bya.a<bxo> aVar2 : this.a.a(bxn.a)) {
                try {
                    return aVar2.a.b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    byu() {
    }

    @Override // defpackage.byb
    public final Class<bxo> a() {
        return bxo.class;
    }

    @Override // defpackage.byb
    public final Class<bxo> b() {
        return bxo.class;
    }

    public static void c() throws GeneralSecurityException {
        byc.a((byb) new byu());
    }

    @Override // defpackage.byb
    public final /* synthetic */ bxo a(bya<bxo> byaVar) throws GeneralSecurityException {
        return new a(byaVar);
    }
}
