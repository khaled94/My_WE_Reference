package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cfk  reason: default package */
/* loaded from: classes2.dex */
public final class cfk {
    public static final String a = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    public static final String b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    @Deprecated
    public static final ccg c = ccg.a();
    public static final ccg d = ccg.a();

    static {
        new cfh();
        new cfi();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        byc.a((bxs) new cfh());
        byc.a((bxs) new cfi());
        byc.a((byb) new cfn());
    }
}
