package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aza  reason: default package */
/* loaded from: classes.dex */
public final class aza extends bar {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    @Override // defpackage.bas
    public final void a(Bundle bundle) {
        synchronized (this.a) {
            this.a.set(bundle);
            this.b = true;
            this.a.notify();
        }
    }

    public final String a(long j) {
        return (String) a(b(j), String.class);
    }

    public final Bundle b(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T a(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L32
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String.format(r1, r2)
            throw r0
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aza.a(android.os.Bundle, java.lang.Class):java.lang.Object");
    }
}
