package defpackage;

import defpackage.bya;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: bzd  reason: default package */
/* loaded from: classes2.dex */
class bzd implements byb<bxz, bxz> {
    private static final Logger a = Logger.getLogger(bzd.class.getName());

    /* renamed from: bzd$a */
    /* loaded from: classes2.dex */
    static class a implements bxz {
        private final bya<bxz> a;
        private final byte[] b;

        /* synthetic */ a(bya byaVar, byte b) {
            this(byaVar);
        }

        private a(bya<bxz> byaVar) {
            this.b = new byte[]{0};
            this.a = byaVar;
        }

        @Override // defpackage.bxz
        public final byte[] a(byte[] bArr) throws GeneralSecurityException {
            if (this.a.b.c.equals(ccf.LEGACY)) {
                return cfw.a(this.a.b.a(), this.a.b.a.a(cfw.a(bArr, this.b)));
            }
            return cfw.a(this.a.b.a(), this.a.b.a.a(bArr));
        }

        @Override // defpackage.bxz
        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (bya.a<bxz> aVar : this.a.a(copyOf)) {
                try {
                    if (aVar.c.equals(ccf.LEGACY)) {
                        aVar.a.a(copyOfRange, cfw.a(bArr2, this.b));
                        return;
                    } else {
                        aVar.a.a(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    bzd.a.info("tag prefix matches a key, but cannot verify: ".concat(String.valueOf(e)));
                }
            }
            for (bya.a<bxz> aVar2 : this.a.a(bxn.a)) {
                try {
                    aVar2.a.a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    bzd() {
    }

    @Override // defpackage.byb
    public final Class<bxz> a() {
        return bxz.class;
    }

    @Override // defpackage.byb
    public final Class<bxz> b() {
        return bxz.class;
    }

    public static void c() throws GeneralSecurityException {
        byc.a((byb) new bzd());
    }

    @Override // defpackage.byb
    public final /* synthetic */ bxz a(bya<bxz> byaVar) throws GeneralSecurityException {
        return new a(byaVar, (byte) 0);
    }
}
