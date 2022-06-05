package defpackage;

import java.security.MessageDigest;

/* renamed from: kt  reason: default package */
/* loaded from: classes2.dex */
public final class kt implements ck {
    private static final kt b = new kt();

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
    }

    public final String toString() {
        return "EmptySignature";
    }

    public static kt a() {
        return b;
    }

    private kt() {
    }
}
