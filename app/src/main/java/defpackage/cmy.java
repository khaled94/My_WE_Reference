package defpackage;

import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: cmy  reason: default package */
/* loaded from: classes2.dex */
public final class cmy {
    public final KeyPair a;
    final long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cmy(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cmy)) {
            return false;
        }
        cmy cmyVar = (cmy) obj;
        return this.b == cmyVar.b && this.a.getPublic().equals(cmyVar.a.getPublic()) && this.a.getPrivate().equals(cmyVar.a.getPrivate());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }
}
