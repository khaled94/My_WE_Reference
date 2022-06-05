package defpackage;

import java.util.List;

/* renamed from: ats  reason: default package */
/* loaded from: classes.dex */
final class ats extends atr {
    private ats() {
        super((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.atr
    public final <L> List<L> a(Object obj, long j) {
        ati c = c(obj, j);
        if (!c.a()) {
            int size = c.size();
            ati a = c.a(size == 0 ? 10 : size << 1);
            avu.a(obj, j, a);
            return a;
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.atr
    public final void b(Object obj, long j) {
        c(obj, j).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ati] */
    @Override // defpackage.atr
    public final <E> void a(Object obj, Object obj2, long j) {
        ati<E> c = c(obj, j);
        ati<E> c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        ati<E> atiVar = c;
        atiVar = c;
        if (size > 0 && size2 > 0) {
            boolean a = c.a();
            ati<E> atiVar2 = c;
            if (!a) {
                atiVar2 = c.a(size2 + size);
            }
            atiVar2.addAll(c2);
            atiVar = atiVar2;
        }
        if (size > 0) {
            c2 = atiVar;
        }
        avu.a(obj, j, c2);
    }

    private static <E> ati<E> c(Object obj, long j) {
        return (ati) avu.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ats(byte b) {
        this();
    }
}
