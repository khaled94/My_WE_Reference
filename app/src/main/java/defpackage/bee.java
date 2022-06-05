package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bee  reason: default package */
/* loaded from: classes2.dex */
final class bee extends bej {
    private final /* synthetic */ bdz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private bee(bdz bdzVar) {
        super(bdzVar, (byte) 0);
        this.a = bdzVar;
    }

    @Override // defpackage.bej, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new beb(this.a, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bee(bdz bdzVar, byte b) {
        this(bdzVar);
    }
}
