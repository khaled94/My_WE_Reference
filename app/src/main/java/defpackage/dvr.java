package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dvr  reason: default package */
/* loaded from: classes2.dex */
public abstract class dvr extends dtx {
    public abstract dvr a();

    @Override // defpackage.dtx
    public String toString() {
        String b = b();
        if (b == null) {
            return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b() {
        dvr dvrVar;
        dvr b = dup.b();
        if (this == b) {
            return "Dispatchers.Main";
        }
        try {
            dvrVar = b.a();
        } catch (UnsupportedOperationException unused) {
            dvrVar = null;
        }
        if (this != dvrVar) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }
}
