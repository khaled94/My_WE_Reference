package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: bzc  reason: default package */
/* loaded from: classes2.dex */
public final class bzc {
    public static final String a = "type.googleapis.com/google.crypto.tink.HmacKey";
    @Deprecated
    public static final ccg b;
    @Deprecated
    public static final ccg c;
    @Deprecated
    public static final ccg d;

    static {
        new bzb();
        ccg a2 = ccg.a();
        b = a2;
        c = a2;
        d = a2;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private bzc() {
    }

    public static void a() throws GeneralSecurityException {
        byc.a((bxs) new bzb());
        byc.a((bxs) new bza());
        bzd.c();
    }
}
