package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: byt  reason: default package */
/* loaded from: classes2.dex */
public final class byt {
    public static final String a = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final ccg b = ccg.a();
    @Deprecated
    public static final ccg c = ccg.a();

    static {
        new bys();
        try {
            bys.e();
            byu.c();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        bys.e();
        byu.c();
    }

    private byt() {
    }
}
