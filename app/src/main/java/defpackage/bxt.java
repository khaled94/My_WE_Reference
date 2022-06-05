package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: bxt  reason: default package */
/* loaded from: classes2.dex */
public final class bxt {
    public final cbt a;

    public bxt(cbt cbtVar) {
        this.a = cbtVar;
    }

    public static final bxt a(cbt cbtVar) throws GeneralSecurityException {
        b(cbtVar);
        return new bxt(cbtVar);
    }

    public static cbd a(cbt cbtVar, bxm bxmVar) throws GeneralSecurityException {
        byte[] a = bxmVar.a(cbtVar.g(), new byte[0]);
        try {
            if (!cbt.a(bxmVar.b(a, new byte[0]), cdb.a()).equals(cbtVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            return cbd.a().a(ccu.a(a)).a(bye.a(cbtVar)).g();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static void b(cbt cbtVar) throws GeneralSecurityException {
        if (cbtVar == null || cbtVar.a() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private <B, P> P a(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        return (P) byc.a(byc.a(this, cls2), cls);
    }

    public final <P> P a(Class<P> cls) throws GeneralSecurityException {
        Class<?> a = byc.a((Class<?>) cls);
        if (a == null) {
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        return (P) a(cls, a);
    }

    public static cbt a(cbd cbdVar, bxm bxmVar) throws GeneralSecurityException {
        try {
            cbt a = cbt.a(bxmVar.b(cbdVar.encryptedKeyset_.c(), new byte[0]), cdb.a());
            b(a);
            return a;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final String toString() {
        return bye.a(this.a).toString();
    }
}
