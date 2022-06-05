package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ars  reason: default package */
/* loaded from: classes.dex */
public final class ars extends aru {
    private int a = 0;
    private final int b;
    private final /* synthetic */ art c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ars(art artVar) {
        this.c = artVar;
        this.b = this.c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.ary
    public final byte a() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.b(i);
    }
}
