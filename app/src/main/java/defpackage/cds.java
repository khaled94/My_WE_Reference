package defpackage;

import defpackage.cdm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cds  reason: default package */
/* loaded from: classes2.dex */
public abstract class cds {
    private static final cds a = new a((byte) 0);
    private static final cds b = new b((byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> a(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Object obj, long j);

    /* synthetic */ cds(byte b2) {
        this();
    }

    private cds() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cds a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cds b() {
        return b;
    }

    /* renamed from: cds$a */
    /* loaded from: classes2.dex */
    static final class a extends cds {
        private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private a() {
            super((byte) 0);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // defpackage.cds
        final <L> List<L> a(Object obj, long j) {
            return a(obj, j, 10);
        }

        @Override // defpackage.cds
        final void b(Object obj, long j) {
            Object obj2;
            List list = (List) cfd.f(obj, j);
            if (list instanceof cdr) {
                obj2 = ((cdr) list).e();
            } else if (a.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof cem) && (list instanceof cdm.i)) {
                    cdm.i iVar = (cdm.i) list;
                    if (!iVar.a()) {
                        return;
                    }
                    iVar.b();
                    return;
                }
                obj2 = Collections.unmodifiableList(list);
            }
            cfd.a(obj, j, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> a(Object obj, long j, int i) {
            cdq cdqVar;
            List<L> list;
            List<L> c = c(obj, j);
            if (c.isEmpty()) {
                if (c instanceof cdr) {
                    list = new cdq(i);
                } else if ((c instanceof cem) && (c instanceof cdm.i)) {
                    list = ((cdm.i) c).a(i);
                } else {
                    list = new ArrayList<>(i);
                }
                cfd.a(obj, j, list);
                return list;
            }
            if (a.isAssignableFrom(c.getClass())) {
                ArrayList arrayList = new ArrayList(c.size() + i);
                arrayList.addAll(c);
                cfd.a(obj, j, arrayList);
                cdqVar = arrayList;
            } else if (c instanceof cfc) {
                cdq cdqVar2 = new cdq(c.size() + i);
                cdqVar2.addAll((cfc) c);
                cfd.a(obj, j, cdqVar2);
                cdqVar = cdqVar2;
            } else if (!(c instanceof cem) || !(c instanceof cdm.i)) {
                return c;
            } else {
                cdm.i iVar = (cdm.i) c;
                if (iVar.a()) {
                    return c;
                }
                cdm.i a2 = iVar.a(c.size() + i);
                cfd.a(obj, j, a2);
                return a2;
            }
            return cdqVar;
        }

        @Override // defpackage.cds
        final <E> void a(Object obj, Object obj2, long j) {
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
            cfd.a(obj, j, c);
        }

        private static <E> List<E> c(Object obj, long j) {
            return (List) cfd.f(obj, j);
        }
    }

    /* renamed from: cds$b */
    /* loaded from: classes2.dex */
    static final class b extends cds {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // defpackage.cds
        final <L> List<L> a(Object obj, long j) {
            cdm.i c = c(obj, j);
            if (!c.a()) {
                int size = c.size();
                cdm.i a = c.a(size == 0 ? 10 : size * 2);
                cfd.a(obj, j, a);
                return a;
            }
            return c;
        }

        @Override // defpackage.cds
        final void b(Object obj, long j) {
            c(obj, j).b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [cdm$i] */
        @Override // defpackage.cds
        final <E> void a(Object obj, Object obj2, long j) {
            cdm.i<E> c = c(obj, j);
            cdm.i<E> c2 = c(obj2, j);
            int size = c.size();
            int size2 = c2.size();
            cdm.i<E> iVar = c;
            iVar = c;
            if (size > 0 && size2 > 0) {
                boolean a = c.a();
                cdm.i<E> iVar2 = c;
                if (!a) {
                    iVar2 = c.a(size2 + size);
                }
                iVar2.addAll(c2);
                iVar = iVar2;
            }
            if (size > 0) {
                c2 = iVar;
            }
            cfd.a(obj, j, c2);
        }

        private static <E> cdm.i<E> c(Object obj, long j) {
            return (cdm.i) cfd.f(obj, j);
        }
    }
}
