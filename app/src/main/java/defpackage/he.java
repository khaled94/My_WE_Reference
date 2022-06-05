package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: he  reason: default package */
/* loaded from: classes2.dex */
public final class he extends gu {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.ck
    public final int hashCode() {
        return 1572326941;
    }

    @Override // defpackage.gu
    protected final Bitmap a(en enVar, Bitmap bitmap, int i, int i2) {
        return hn.b(enVar, bitmap, i, i2);
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        return obj instanceof he;
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
