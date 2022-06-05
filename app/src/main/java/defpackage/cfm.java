package defpackage;

import java.security.NoSuchAlgorithmException;

/* renamed from: cfm  reason: default package */
/* loaded from: classes2.dex */
final class cfm {
    cfm() {
    }

    /* renamed from: cfm$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cbf.values().length];
            a = iArr;
            try {
                iArr[cbf.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cbf.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cbf.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(cbf cbfVar) throws NoSuchAlgorithmException {
        int i = AnonymousClass1.a[cbfVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "HmacSha256";
            }
            if (i != 3) {
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(String.valueOf(cbfVar)));
            }
            return "HmacSha512";
        }
        return "HmacSha1";
    }
}
