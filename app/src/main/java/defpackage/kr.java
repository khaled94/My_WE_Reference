package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: kr  reason: default package */
/* loaded from: classes2.dex */
public final class kr implements ck {
    private final int b;
    private final ck c;

    public static ck a(Context context) {
        return new kr(context.getResources().getConfiguration().uiMode & 48, ks.a(context));
    }

    private kr(int i, ck ckVar) {
        this.b = i;
        this.c = ckVar;
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof kr) {
            kr krVar = (kr) obj;
            if (this.b == krVar.b && this.c.equals(krVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        return lg.a(this.c, this.b);
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }
}
