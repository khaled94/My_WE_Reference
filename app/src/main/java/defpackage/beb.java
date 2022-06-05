package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: beb  reason: default package */
/* loaded from: classes2.dex */
final class beb implements Iterator<Map.Entry<K, V>> {
    private int a;
    private Iterator<Map.Entry<K, V>> b;
    private final /* synthetic */ bdz c;

    private beb(bdz bdzVar) {
        List list;
        this.c = bdzVar;
        list = this.c.c;
        this.a = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.a;
        if (i > 0) {
            list = this.c.c;
            if (i <= list.size()) {
                return true;
            }
        }
        return a().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.b == null) {
            map = this.c.f;
            this.b = map.entrySet().iterator();
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        list = this.c.c;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ beb(bdz bdzVar, byte b) {
        this(bdzVar);
    }
}
