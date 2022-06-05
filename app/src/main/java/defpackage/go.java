package defpackage;

import android.content.Context;
import java.security.MessageDigest;

/* renamed from: go  reason: default package */
/* loaded from: classes2.dex */
public final class go<T> implements cq<T> {
    private static final cq<?> b = new go();

    @Override // defpackage.cq
    public final ee<T> a(Context context, ee<T> eeVar, int i, int i2) {
        return eeVar;
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
    }

    public static <T> go<T> a() {
        return (go) b;
    }

    private go() {
    }
}
