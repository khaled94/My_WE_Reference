package defpackage;

import java.util.Arrays;

/* renamed from: aww  reason: default package */
/* loaded from: classes.dex */
final class aww {
    final int a;
    final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aww(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aww)) {
            return false;
        }
        aww awwVar = (aww) obj;
        return this.a == awwVar.a && Arrays.equals(this.b, awwVar.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
