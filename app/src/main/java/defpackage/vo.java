package defpackage;

import defpackage.vc;
import defpackage.vc.d;
import java.util.Arrays;

/* renamed from: vo  reason: default package */
/* loaded from: classes2.dex */
public final class vo<O extends vc.d> {
    public final vc<O> a;
    private final int b;
    private final O c;
    private final String d;

    public vo(vc<O> vcVar, O o, String str) {
        this.a = vcVar;
        this.c = o;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{vcVar, o, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return aar.a(this.a, voVar.a) && aar.a(this.c, voVar.c) && aar.a(this.d, voVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
