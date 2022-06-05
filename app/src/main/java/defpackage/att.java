package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: att  reason: default package */
/* loaded from: classes.dex */
final class att extends atr {
    private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private att() {
        super((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.atr
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.atr
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) avu.f(obj, j);
        if (list instanceof atp) {
            obj2 = ((atp) list).j_();
        } else if (a.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof auu) && (list instanceof ati)) {
                ati atiVar = (ati) list;
                if (!atiVar.a()) {
                    return;
                }
                atiVar.b();
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        avu.a(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j, int i) {
        atq atqVar;
        List<L> list;
        List<L> c = c(obj, j);
        if (c.isEmpty()) {
            if (c instanceof atp) {
                list = new atq(i);
            } else if ((c instanceof auu) && (c instanceof ati)) {
                list = ((ati) c).a(i);
            } else {
                list = new ArrayList<>(i);
            }
            avu.a(obj, j, list);
            return list;
        }
        if (a.isAssignableFrom(c.getClass())) {
            ArrayList arrayList = new ArrayList(c.size() + i);
            arrayList.addAll(c);
            avu.a(obj, j, arrayList);
            atqVar = arrayList;
        } else if (c instanceof avt) {
            atq atqVar2 = new atq(c.size() + i);
            atqVar2.addAll((avt) c);
            avu.a(obj, j, atqVar2);
            atqVar = atqVar2;
        } else if (!(c instanceof auu) || !(c instanceof ati)) {
            return c;
        } else {
            ati atiVar = (ati) c;
            if (atiVar.a()) {
                return c;
            }
            ati a2 = atiVar.a(c.size() + i);
            avu.a(obj, j, a2);
            return a2;
        }
        return atqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.atr
    public final <E> void a(Object obj, Object obj2, long j) {
        List c = c(obj2, j);
        List a2 = a(obj, j, c.size());
        int size = a2.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(c);
        }
        if (size > 0) {
            c = a2;
        }
        avu.a(obj, j, c);
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) avu.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ att(byte b) {
        this();
    }
}
