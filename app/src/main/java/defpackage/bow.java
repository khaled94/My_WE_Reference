package defpackage;

/* renamed from: bow  reason: default package */
/* loaded from: classes2.dex */
public final class bow<V> {
    private static final Object f = new Object();
    final String a;
    private final box<V> b;
    private final V c;
    private final V d;
    private final Object e;
    private volatile V g;
    private volatile V h;

    private bow(String str, V v, V v2, box<V> boxVar) {
        this.e = new Object();
        this.g = null;
        this.h = null;
        this.a = str;
        this.c = v;
        this.d = v2;
        this.b = boxVar;
    }

    public final V a(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (blk.a == null) {
            return this.c;
        }
        bve bveVar = blk.a;
        synchronized (f) {
            if (bve.a()) {
                return this.h == null ? this.c : this.h;
            } else if (bve.a()) {
                throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
            } else {
                bve bveVar2 = blk.a;
                try {
                    for (bow bowVar : blk.aH()) {
                        synchronized (f) {
                            if (bve.a()) {
                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                            }
                            bowVar.h = bowVar.b != null ? bowVar.b.a() : null;
                        }
                    }
                } catch (SecurityException e) {
                    blk.a(e);
                }
                box<V> boxVar = this.b;
                if (boxVar == null) {
                    bve bveVar3 = blk.a;
                    return this.c;
                }
                try {
                    return boxVar.a();
                } catch (SecurityException e2) {
                    blk.a(e2);
                    bve bveVar4 = blk.a;
                    return this.c;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bow(String str, Object obj, Object obj2, box boxVar, byte b) {
        this(str, obj, obj2, boxVar);
    }
}
