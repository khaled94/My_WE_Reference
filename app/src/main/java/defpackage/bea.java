package defpackage;

import com.google.android.gms.internal.places.zzaj;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bea  reason: default package */
/* loaded from: classes2.dex */
public final class bea {
    private static final Class<?> a = d();
    private static final beo<?, ?> b = a(false);
    private static final beo<?, ?> c = a(true);
    private static final beo<?, ?> d = new beq();

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (bcc.class.isAssignableFrom(cls) || (cls2 = a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static void a(int i, List<Double> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.g(i, list, z);
    }

    public static void b(int i, List<Float> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.f(i, list, z);
    }

    public static void c(int i, List<Long> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.c(i, list, z);
    }

    public static void d(int i, List<Long> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.d(i, list, z);
    }

    public static void e(int i, List<Long> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.n(i, list, z);
    }

    public static void f(int i, List<Long> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.e(i, list, z);
    }

    public static void g(int i, List<Long> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.l(i, list, z);
    }

    public static void h(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.a(i, list, z);
    }

    public static void i(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.j(i, list, z);
    }

    public static void j(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.m(i, list, z);
    }

    public static void k(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.b(i, list, z);
    }

    public static void l(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.k(i, list, z);
    }

    public static void m(int i, List<Integer> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.h(i, list, z);
    }

    public static void n(int i, List<Boolean> list, bfi bfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.i(i, list, z);
    }

    public static void a(int i, List<String> list, bfi bfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.a(i, list);
    }

    public static void b(int i, List<bgb> list, bfi bfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.b(i, list);
    }

    public static void a(int i, List<?> list, bfi bfiVar, bdy bdyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.a(i, list, bdyVar);
    }

    public static void b(int i, List<?> list, bfi bfiVar, bdy bdyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        bfiVar.b(i, list, bdyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bcu) {
            bcu bcuVar = (bcu) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.d(bcuVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bcu) {
            bcu bcuVar = (bcu) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.e(bcuVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bcu) {
            bcu bcuVar = (bcu) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.f(bcuVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bce) {
            bce bceVar = (bce) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.p(bceVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.p(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bce) {
            bce bceVar = (bce) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m(bceVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bce) {
            bce bceVar = (bce) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.n(bceVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.n(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bce) {
            bce bceVar = (bce) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.o(bceVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.o(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * zzaj.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.e(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.k(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int l = zzaj.l(i) * size;
        if (list instanceof bco) {
            bco bcoVar = (bco) list;
            while (i4 < size) {
                Object b2 = bcoVar.b(i4);
                if (b2 instanceof bgb) {
                    i3 = zzaj.b((bgb) b2);
                } else {
                    i3 = zzaj.b((String) b2);
                }
                l += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof bgb) {
                    i2 = zzaj.b((bgb) obj);
                } else {
                    i2 = zzaj.b((String) obj);
                }
                l += i2;
                i4++;
            }
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, bdy bdyVar) {
        if (obj instanceof bcm) {
            return zzaj.a(i, (bcm) obj);
        }
        return zzaj.b(i, (bdh) obj, bdyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, bdy bdyVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzaj.l(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof bcm) {
                i2 = zzaj.a((bcm) obj);
            } else {
                i2 = zzaj.a((bdh) obj, bdyVar);
            }
            l += i2;
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i, List<bgb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * zzaj.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += zzaj.b(list.get(i2));
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<bdh> list, bdy bdyVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzaj.c(i, list.get(i3), bdyVar);
        }
        return i2;
    }

    public static beo<?, ?> a() {
        return b;
    }

    public static beo<?, ?> b() {
        return c;
    }

    public static beo<?, ?> c() {
        return d;
    }

    private static beo<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e != null) {
                return (beo) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(bda bdaVar, T t, T t2, long j) {
        beu.a(t, j, bdaVar.a(beu.f(t, j), beu.f(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends bbw<FT>> void a(bbq<FT> bbqVar, T t, T t2) {
        bbu<FT> a2 = bbqVar.a(t2);
        if (!a2.a.isEmpty()) {
            bbu<FT> b2 = bbqVar.b(t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Map.Entry<FT, Object> entry : a2.a.c()) {
                b2.a(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void a(beo<UT, UB> beoVar, T t, T t2) {
        beoVar.a(t, beoVar.c(beoVar.a(t), beoVar.a(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, bcf bcfVar, UB ub, beo<UT, UB> beoVar) {
        if (bcfVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (bcfVar.a()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, beoVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bcfVar.a()) {
                    ub = (UB) a(i, intValue2, ub, beoVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static <UT, UB> UB a(int i, int i2, UB ub, beo<UT, UB> beoVar) {
        if (ub == null) {
            ub = beoVar.a();
        }
        beoVar.a((beo<UT, UB>) ub, i, i2);
        return ub;
    }
}
