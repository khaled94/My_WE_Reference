package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bcs  reason: default package */
/* loaded from: classes2.dex */
final class bcs extends bcq {
    private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bcs() {
        super((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bcq
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) beu.f(obj, j);
        if (list instanceof bco) {
            obj2 = ((bco) list).l_();
        } else if (a.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof bdt) && (list instanceof bch)) {
                bch bchVar = (bch) list;
                if (!bchVar.c()) {
                    return;
                }
                bchVar.b();
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        beu.a(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bcq
    public final <E> void a(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List b = b(obj2, j);
        int size = b.size();
        List b2 = b(obj, j);
        if (b2.isEmpty()) {
            if (b2 instanceof bco) {
                b2 = new bcp(size);
            } else if ((b2 instanceof bdt) && (b2 instanceof bch)) {
                b2 = ((bch) b2).a(size);
            } else {
                b2 = new ArrayList(size);
            }
            beu.a(obj, j, b2);
        } else {
            if (a.isAssignableFrom(b2.getClass())) {
                ArrayList arrayList2 = new ArrayList(b2.size() + size);
                arrayList2.addAll(b2);
                beu.a(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (b2 instanceof bep) {
                List bcpVar = new bcp(b2.size() + size);
                bcpVar.addAll((bep) b2);
                beu.a(obj, j, bcpVar);
                arrayList = bcpVar;
            } else if ((b2 instanceof bdt) && (b2 instanceof bch)) {
                bch bchVar = (bch) b2;
                if (!bchVar.c()) {
                    b2 = bchVar.a(b2.size() + size);
                    beu.a(obj, j, b2);
                }
            }
            b2 = arrayList;
        }
        int size2 = b2.size();
        int size3 = b.size();
        if (size2 > 0 && size3 > 0) {
            b2.addAll(b);
        }
        if (size2 > 0) {
            b = b2;
        }
        beu.a(obj, j, b);
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) beu.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bcs(byte b) {
        this();
    }
}
