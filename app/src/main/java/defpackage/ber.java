package defpackage;

import java.util.Iterator;

/* renamed from: ber  reason: default package */
/* loaded from: classes2.dex */
final class ber implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ bep b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ber(bep bepVar) {
        bco bcoVar;
        this.b = bepVar;
        bcoVar = this.b.a;
        this.a = bcoVar.iterator();
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
