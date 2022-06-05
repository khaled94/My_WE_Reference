package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: byf  reason: default package */
/* loaded from: classes2.dex */
public final class byf {
    public static final String a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    public static final String c = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    public static final String d = "type.googleapis.com/google.crypto.tink.AesEaxKey";
    public static final String e = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    public static final String f = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    public static final String g = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    public static final String h = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    @Deprecated
    public static final ccg i;
    @Deprecated
    public static final ccg j;
    @Deprecated
    public static final ccg k;

    static {
        new byh();
        new byk();
        new byl();
        new byj();
        new byn();
        new byp();
        new bym();
        new byq();
        ccg a2 = ccg.a();
        i = a2;
        j = a2;
        k = a2;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        bzc.a();
        byc.a((bxs) new byh());
        byc.a((bxs) new byj());
        byc.a((bxs) new byk());
        if (byl.e()) {
            byc.a((bxs) new byl());
        }
        byc.a((bxs) new bym());
        byc.a((bxs) new byn());
        byc.a((bxs) new byp());
        byc.a((bxs) new byq());
        byg.c();
    }

    private byf() {
    }
}
