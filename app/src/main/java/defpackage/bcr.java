package defpackage;

/* renamed from: bcr  reason: default package */
/* loaded from: classes2.dex */
final class bcr extends bcq {
    private bcr() {
        super((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bcq
    public final void a(Object obj, long j) {
        b(obj, j).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bch] */
    @Override // defpackage.bcq
    public final <E> void a(Object obj, Object obj2, long j) {
        bch<E> b = b(obj, j);
        bch<E> b2 = b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        bch<E> bchVar = b;
        bchVar = b;
        if (size > 0 && size2 > 0) {
            boolean c = b.c();
            bch<E> bchVar2 = b;
            if (!c) {
                bchVar2 = b.a(size2 + size);
            }
            bchVar2.addAll(b2);
            bchVar = bchVar2;
        }
        if (size > 0) {
            b2 = bchVar;
        }
        beu.a(obj, j, b2);
    }

    private static <E> bch<E> b(Object obj, long j) {
        return (bch) beu.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bcr(byte b) {
        this();
    }
}
