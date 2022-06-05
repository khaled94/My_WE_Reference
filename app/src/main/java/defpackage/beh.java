package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: beh  reason: default package */
/* loaded from: classes2.dex */
final class beh implements Iterator<Map.Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ bdz d;

    private beh(bdz bdzVar) {
        this.d = bdzVar;
        this.a = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.a + 1;
        list = this.d.c;
        if (i >= list.size()) {
            map = this.d.d;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.e();
        int i = this.a;
        list = this.d.c;
        if (i < list.size()) {
            bdz bdzVar = this.d;
            int i2 = this.a;
            this.a = i2 - 1;
            bdzVar.c(i2);
            return;
        }
        a().remove();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.c == null) {
            map = this.d.d;
            this.c = map.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        list = this.d.c;
        if (i >= list.size()) {
            return (Map.Entry) a().next();
        }
        list2 = this.d.c;
        return (Map.Entry) list2.get(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ beh(bdz bdzVar, byte b) {
        this(bdzVar);
    }
}
