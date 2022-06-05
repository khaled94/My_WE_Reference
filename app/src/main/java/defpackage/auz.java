package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: auz  reason: default package */
/* loaded from: classes.dex */
public final class auz {
    private static final Class<?> a = d();
    private static final avp<?, ?> b = a(false);
    private static final avp<?, ?> c = a(true);
    private static final avp<?, ?> d = new avq();

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (ata.class.isAssignableFrom(cls) || (cls2 = a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static void a(int i, List<Double> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.g(i, list, z);
    }

    public static void b(int i, List<Float> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.f(i, list, z);
    }

    public static void c(int i, List<Long> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.c(i, list, z);
    }

    public static void d(int i, List<Long> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.d(i, list, z);
    }

    public static void e(int i, List<Long> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.n(i, list, z);
    }

    public static void f(int i, List<Long> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.e(i, list, z);
    }

    public static void g(int i, List<Long> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.l(i, list, z);
    }

    public static void h(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.a(i, list, z);
    }

    public static void i(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.j(i, list, z);
    }

    public static void j(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.m(i, list, z);
    }

    public static void k(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.b(i, list, z);
    }

    public static void l(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.k(i, list, z);
    }

    public static void m(int i, List<Integer> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.h(i, list, z);
    }

    public static void n(int i, List<Boolean> list, awm awmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.i(i, list, z);
    }

    public static void a(int i, List<String> list, awm awmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.a(i, list);
    }

    public static void b(int i, List<art> list, awm awmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.b(i, list);
    }

    public static void a(int i, List<?> list, awm awmVar, aux auxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.a(i, list, auxVar);
    }

    public static void b(int i, List<?> list, awm awmVar, aux auxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        awmVar.b(i, list, auxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            i = 0;
            while (i2 < size) {
                i += zzee.d(atvVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.d(list.get(i2).longValue());
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
        return a(list) + (list.size() * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            i = 0;
            while (i2 < size) {
                i += zzee.e(atvVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.e(list.get(i2).longValue());
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
        return b(list) + (size * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            i = 0;
            while (i2 < size) {
                i += zzee.f(atvVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.f(list.get(i2).longValue());
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
        return c(list) + (size * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            i = 0;
            while (i2 < size) {
                i += zzee.p(atdVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.p(list.get(i2).intValue());
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
        return d(list) + (size * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            i = 0;
            while (i2 < size) {
                i += zzee.m(atdVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.m(list.get(i2).intValue());
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
        return e(list) + (size * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            i = 0;
            while (i2 < size) {
                i += zzee.n(atdVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.n(list.get(i2).intValue());
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
        return f(list) + (size * zzee.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            i = 0;
            while (i2 < size) {
                i += zzee.o(atdVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.o(list.get(i2).intValue());
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
        return g(list) + (size * zzee.l(i));
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
        return size * zzee.e(i);
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
        return size * zzee.g(i);
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
        return size * zzee.k(i);
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
        int l = zzee.l(i) * size;
        if (list instanceof atp) {
            atp atpVar = (atp) list;
            while (i4 < size) {
                Object b2 = atpVar.b(i4);
                if (b2 instanceof art) {
                    i3 = zzee.b((art) b2);
                } else {
                    i3 = zzee.b((String) b2);
                }
                l += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof art) {
                    i2 = zzee.b((art) obj);
                } else {
                    i2 = zzee.b((String) obj);
                }
                l += i2;
                i4++;
            }
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, aux auxVar) {
        if (obj instanceof atn) {
            return zzee.a(i, (atn) obj);
        }
        return zzee.b(i, (aui) obj, auxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, aux auxVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzee.l(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof atn) {
                i2 = zzee.a((atn) obj);
            } else {
                i2 = zzee.b((aui) obj, auxVar);
            }
            l += i2;
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i, List<art> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * zzee.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += zzee.b(list.get(i2));
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<aui> list, aux auxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzee.c(i, list.get(i3), auxVar);
        }
        return i2;
    }

    public static avp<?, ?> a() {
        return b;
    }

    public static avp<?, ?> b() {
        return c;
    }

    public static avp<?, ?> c() {
        return d;
    }

    private static avp<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e != null) {
                return (avp) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
    public static <T> void a(aub aubVar, T t, T t2, long j) {
        avu.a(t, j, aubVar.a(avu.f(t, j), avu.f(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends ass<FT>> void a(asp<FT> aspVar, T t, T t2) {
        asq<FT> a2 = aspVar.a(t2);
        if (!a2.a.isEmpty()) {
            asq<FT> b2 = aspVar.b(t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Map.Entry<FT, Object> entry : a2.a.c()) {
                b2.a(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void a(avp<UT, UB> avpVar, T t, T t2) {
        avpVar.a(t, avpVar.c(avpVar.b(t), avpVar.b(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, ath athVar, UB ub, avp<UT, UB> avpVar) {
        if (athVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (athVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, avpVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!athVar.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, avpVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, int i2, UB ub, avp<UT, UB> avpVar) {
        if (ub == null) {
            ub = avpVar.a();
        }
        avpVar.a((avp<UT, UB>) ub, i, i2);
        return ub;
    }
}
