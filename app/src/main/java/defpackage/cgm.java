package defpackage;

import java.security.SecureRandom;

/* renamed from: cgm  reason: default package */
/* loaded from: classes2.dex */
public final class cgm {
    private static final ThreadLocal<SecureRandom> a = new ThreadLocal<SecureRandom>() { // from class: cgm.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ SecureRandom initialValue() {
            return cgm.a();
        }
    };

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        a.get().nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
