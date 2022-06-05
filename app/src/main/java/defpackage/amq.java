package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: amq  reason: default package */
/* loaded from: classes.dex */
final class amq extends WeakReference<Throwable> {
    private final int a;

    public amq(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            amq amqVar = (amq) obj;
            if (this.a == amqVar.a && get() == amqVar.get()) {
                return true;
            }
        }
        return false;
    }
}
