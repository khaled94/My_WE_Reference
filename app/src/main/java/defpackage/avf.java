package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: avf  reason: default package */
/* loaded from: classes.dex */
final class avf implements Iterator<Map.Entry<K, V>> {
    private int a;
    private Iterator<Map.Entry<K, V>> b;
    private final /* synthetic */ avd c;

    private avf(avd avdVar) {
        List list;
        this.c = avdVar;
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
    public /* synthetic */ avf(avd avdVar, byte b) {
        this(avdVar);
    }
}
