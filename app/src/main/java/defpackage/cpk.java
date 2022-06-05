package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cpk  reason: default package */
/* loaded from: classes2.dex */
public class cpk {
    private static volatile cpk b;
    private final Set<cpl> a = new HashSet();

    cpk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<cpl> a() {
        Set<cpl> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }

    public static cpk b() {
        cpk cpkVar = b;
        if (cpkVar == null) {
            synchronized (cpk.class) {
                cpkVar = b;
                if (cpkVar == null) {
                    cpkVar = new cpk();
                    b = cpkVar;
                }
            }
        }
        return cpkVar;
    }
}
