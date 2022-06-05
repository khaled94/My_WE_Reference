package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: akf  reason: default package */
/* loaded from: classes.dex */
final class akf extends ajw<Map.Entry<K, V>> {
    private final /* synthetic */ akc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public akf(akc akcVar) {
        this.a = akcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.a.d;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.a.d;
        ajj.a(i, i2);
        objArr = this.a.b;
        int i3 = i * 2;
        Object obj = objArr[i3];
        objArr2 = this.a.b;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
