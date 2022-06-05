package defpackage;

import defpackage.cbt;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* renamed from: bxu  reason: default package */
/* loaded from: classes2.dex */
public final class bxu {
    private final cbt.a a;

    public bxu(cbt.a aVar) {
        this.a = aVar;
    }

    public static bxu a(bxt bxtVar) {
        return new bxu(bxtVar.a.q());
    }

    public final synchronized bxt a() throws GeneralSecurityException {
        return bxt.a(this.a.g());
    }

    @Deprecated
    private synchronized int a(cbp cbpVar) throws GeneralSecurityException {
        cbt.b b;
        b = b(cbpVar);
        this.a.a(b);
        return b.keyId_;
    }

    public final synchronized bxu a(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            cbt.b b = this.a.b(i2);
            if (b.keyId_ == i) {
                if (!b.b().equals(cbo.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: ".concat(String.valueOf(i)));
                } else {
                    this.a.a(i);
                }
            }
        }
        throw new GeneralSecurityException("key not found: ".concat(String.valueOf(i)));
        return this;
    }

    private synchronized cbt.b b(cbp cbpVar) throws GeneralSecurityException {
        cbm a;
        int b;
        ccf forNumber;
        a = byc.a(cbpVar);
        b = b();
        forNumber = ccf.forNumber(cbpVar.outputPrefixType_);
        if (forNumber == null) {
            forNumber = ccf.UNRECOGNIZED;
        }
        if (forNumber == ccf.UNKNOWN_PREFIX) {
            forNumber = ccf.TINK;
        }
        return cbt.b.d().a(a).a(b).a(cbo.ENABLED).a(forNumber).g();
    }

    private synchronized boolean b(int i) {
        for (cbt.b bVar : this.a.a()) {
            if (bVar.keyId_ == i) {
                return true;
            }
        }
        return false;
    }

    private synchronized int b() {
        int c;
        c = c();
        while (b(c)) {
            c = c();
        }
        return c;
    }

    private static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public final synchronized bxu a(bxr bxrVar) throws GeneralSecurityException {
        a(bxrVar.a);
        return this;
    }
}
