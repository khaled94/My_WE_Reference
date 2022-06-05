package defpackage;

import defpackage.cbm;
import defpackage.cbt;
import defpackage.cbu;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: bye  reason: default package */
/* loaded from: classes2.dex */
public final class bye {
    public static final Charset a = Charset.forName("UTF-8");

    bye() {
    }

    public static cbu a(cbt cbtVar) {
        cbu.a a2 = cbu.a().a(cbtVar.primaryKeyId_);
        for (cbt.b bVar : cbtVar.key_) {
            a2.a(cbu.b.a().a(bVar.a().typeUrl_).a(bVar.b()).a(bVar.c()).a(bVar.keyId_).g());
        }
        return a2.g();
    }

    public static void b(cbt cbtVar) throws GeneralSecurityException {
        int i = cbtVar.primaryKeyId_;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (cbt.b bVar : cbtVar.key_) {
            if (bVar.b() == cbo.ENABLED) {
                if (!(bVar.keyData_ != null)) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bVar.keyId_)));
                }
                if (bVar.c() == ccf.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bVar.keyId_)));
                }
                if (bVar.b() == cbo.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bVar.keyId_)));
                }
                if (bVar.keyId_ == i) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                cbm.b forNumber = cbm.b.forNumber(bVar.a().keyMaterialType_);
                if (forNumber == null) {
                    forNumber = cbm.b.UNRECOGNIZED;
                }
                if (forNumber != cbm.b.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 != 0) {
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
