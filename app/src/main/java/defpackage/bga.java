package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bga  reason: default package */
/* loaded from: classes2.dex */
public final class bga extends bgc {
    private int a = 0;
    private final int b;
    private final /* synthetic */ bgb c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bga(bgb bgbVar) {
        this.c = bgbVar;
        this.b = this.c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.bbd
    public final byte a() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.b(i);
    }
}
