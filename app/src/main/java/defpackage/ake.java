package defpackage;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ake  reason: default package */
/* loaded from: classes.dex */
final class ake<K> extends akb<K> {
    private final transient ajx<K, ?> a;
    private final transient ajw<K> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ake(ajx<K, ?> ajxVar, ajw<K> ajwVar) {
        this.a = ajxVar;
        this.b = ajwVar;
    }

    @Override // defpackage.ajt
    public final akj<K> a() {
        return (akj) e().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final int a(Object[] objArr, int i) {
        return e().a(objArr, i);
    }

    @Override // defpackage.akb, defpackage.ajt
    public final ajw<K> e() {
        return this.b;
    }

    @Override // defpackage.ajt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.akb, defpackage.ajt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
