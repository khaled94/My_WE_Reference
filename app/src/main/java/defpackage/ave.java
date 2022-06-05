package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ave  reason: default package */
/* loaded from: classes.dex */
final class ave extends avk {
    private final /* synthetic */ avd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ave(avd avdVar) {
        super(avdVar, (byte) 0);
        this.a = avdVar;
    }

    @Override // defpackage.avk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new avf(this.a, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ave(avd avdVar, byte b) {
        this(avdVar);
    }
}
