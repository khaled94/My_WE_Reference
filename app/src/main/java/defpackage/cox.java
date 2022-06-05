package defpackage;

import java.util.Arrays;

/* renamed from: cox  reason: default package */
/* loaded from: classes2.dex */
public final class cox {
    private String a;

    public cox(String str) {
        this.a = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cox)) {
            return false;
        }
        return aar.a(this.a, ((cox) obj).a);
    }

    public final String toString() {
        return aar.a(this).a("token", this.a).toString();
    }
}
