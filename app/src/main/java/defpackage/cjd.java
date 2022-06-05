package defpackage;

import defpackage.vc;
import java.util.Arrays;

/* renamed from: cjd  reason: default package */
/* loaded from: classes2.dex */
public final class cjd extends chy implements vc.d.c {
    final String b;

    private cjd(String str) {
        this.b = aat.a(str, (Object) "A valid API key must be provided");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjd) {
            return aar.a(this.b, ((cjd) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // defpackage.chy
    public final /* synthetic */ chy a() {
        return (cjd) clone();
    }

    @Override // defpackage.chy
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new cjc(this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ cjd(String str, byte b) {
        this(str);
    }
}
