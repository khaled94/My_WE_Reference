package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: blg  reason: default package */
/* loaded from: classes2.dex */
public final class blg implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ blh b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public blg(blh blhVar) {
        Bundle bundle;
        this.b = blhVar;
        bundle = this.b.a;
        this.a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }
}
