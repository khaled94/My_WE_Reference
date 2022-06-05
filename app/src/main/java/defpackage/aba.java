package defpackage;

import defpackage.vc;
import java.util.Arrays;

/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
public final class aba implements vc.d.f {
    public static final aba a = new aba(new a((byte) 0).a);
    public final String b;

    /* renamed from: aba$a */
    /* loaded from: classes.dex */
    public static class a {
        String a;

        private a() {
        }

        /* synthetic */ a(byte b) {
        }
    }

    private /* synthetic */ aba(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aba) {
            return aar.a(this.b, ((aba) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
