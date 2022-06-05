package defpackage;

import java.util.Iterator;

/* renamed from: avv  reason: default package */
/* loaded from: classes.dex */
final class avv implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ avt b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avv(avt avtVar) {
        atp atpVar;
        this.b = avtVar;
        atpVar = this.b.a;
        this.a = atpVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }
}
