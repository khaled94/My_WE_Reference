package defpackage;

import defpackage.bfr;
import defpackage.bft;

/* renamed from: bft  reason: default package */
/* loaded from: classes2.dex */
public abstract class bft<MessageType extends bfr<MessageType, BuilderType>, BuilderType extends bft<MessageType, BuilderType>> implements bdg {
    /* renamed from: a */
    public abstract BuilderType clone();

    protected abstract BuilderType a(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bdg
    public final /* synthetic */ bdg a(bdh bdhVar) {
        if (!g().getClass().isInstance(bdhVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return a((bft<MessageType, BuilderType>) ((bfr) bdhVar));
    }
}
