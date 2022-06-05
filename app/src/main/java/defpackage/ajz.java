package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ajz  reason: default package */
/* loaded from: classes.dex */
public final class ajz extends ajw<E> {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ ajw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ajz(ajw ajwVar, int i, int i2) {
        this.c = ajwVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final Object[] b() {
        return this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // defpackage.ajt
    final int d() {
        return this.c.c() + this.a + this.b;
    }

    @Override // java.util.List
    public final E get(int i) {
        ajj.a(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.ajw
    public final ajw<E> a(int i, int i2) {
        ajj.a(i, i2, this.b);
        ajw ajwVar = this.c;
        int i3 = this.a;
        return (ajw) ajwVar.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.ajw, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
