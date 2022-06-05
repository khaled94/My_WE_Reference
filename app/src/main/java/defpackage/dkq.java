package defpackage;

import io.realm.log.RealmLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dkq  reason: default package */
/* loaded from: classes2.dex */
public final class dkq {
    final AtomicBoolean a;
    private final EnumMap<a, b> c;
    private dks d;
    private static final List<WeakReference<dkq>> e = new ArrayList();
    static final Collection<dkq> b = new ConcurrentLinkedQueue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dkq$b */
    /* loaded from: classes2.dex */
    public static class b {
        final ThreadLocal<dkl> a = new ThreadLocal<>();
        final ThreadLocal<Integer> b = new ThreadLocal<>();
        int c = 0;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dkq$a */
    /* loaded from: classes2.dex */
    public enum a {
        TYPED_REALM,
        DYNAMIC_REALM;

        static a valueOf(Class<? extends dkl> cls) {
            if (cls == dkp.class) {
                return TYPED_REALM;
            }
            if (cls == dkm.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(dkl dklVar) {
        String a2 = dklVar.a();
        b bVar = this.c.get(a.valueOf((Class<? extends dkl>) dklVar.getClass()));
        Integer num = bVar.b.get();
        if (num == null) {
            num = 0;
        }
        if (num.intValue() <= 0) {
            RealmLog.a("%s has been closed already. refCount is %s", a2, num);
            return;
        }
        Integer valueOf = Integer.valueOf(num.intValue() - 1);
        if (valueOf.intValue() == 0) {
            bVar.b.set(null);
            bVar.a.set(null);
            bVar.c--;
            if (bVar.c < 0) {
                throw new IllegalStateException("Global reference counter of Realm" + a2 + " got corrupted.");
            }
            dklVar.b();
            if (a() == 0) {
                this.d = null;
                dlg.b();
            }
        } else {
            bVar.b.set(valueOf);
        }
    }

    private int a() {
        int i = 0;
        for (b bVar : this.c.values()) {
            i += bVar.c;
        }
        return i;
    }
}
