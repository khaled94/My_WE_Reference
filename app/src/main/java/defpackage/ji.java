package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ji  reason: default package */
/* loaded from: classes2.dex */
public final class ji {
    public final Set<jy> a = Collections.newSetFromMap(new WeakHashMap());
    public final Set<jy> b = new HashSet();
    public boolean c;

    public final boolean a(jy jyVar) {
        boolean z = true;
        if (jyVar == null) {
            return true;
        }
        boolean remove = this.a.remove(jyVar);
        if (!this.b.remove(jyVar) && !remove) {
            z = false;
        }
        if (z) {
            jyVar.b();
        }
        return z;
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
