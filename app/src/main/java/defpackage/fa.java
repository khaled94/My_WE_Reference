package defpackage;

import defpackage.ex;
import java.io.File;

/* renamed from: fa  reason: default package */
/* loaded from: classes2.dex */
public class fa implements ex.a {
    private final long a = 262144000;
    private final a b;

    /* renamed from: fa$a */
    /* loaded from: classes2.dex */
    public interface a {
        File a();
    }

    public fa(a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.ex.a
    public final ex a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (!a2.isDirectory() && !a2.mkdirs()) {
            return null;
        }
        return new fb(a2, this.a);
    }
}
