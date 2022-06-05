package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: lc  reason: default package */
/* loaded from: classes2.dex */
public class lc<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(Y y) {
        return 1;
    }

    protected void a(T t, Y y) {
    }

    public lc(long j) {
        this.b = j;
        this.c = j;
    }

    public final synchronized long b() {
        return this.c;
    }

    public final synchronized Y b(T t) {
        a<Y> aVar = this.a.get(t);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final synchronized Y b(T t, Y y) {
        int a2 = a((lc<T, Y>) y);
        long j = a2;
        if (j >= this.c) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        a<Y> put = this.a.put(t, y == null ? null : new a<>(y, a2));
        if (put != null) {
            this.d -= put.b;
            if (!put.a.equals(y)) {
                a(t, put.a);
            }
        }
        a(this.c);
        if (put == null) {
            return null;
        }
        return put.a;
    }

    public final synchronized Y c(T t) {
        a<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.d -= remove.b;
        return remove.a;
    }

    public final void a() {
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void a(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= value.b;
            T key = next.getKey();
            it.remove();
            a(key, value.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lc$a */
    /* loaded from: classes2.dex */
    public static final class a<Y> {
        final Y a;
        final int b;

        a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }
}
