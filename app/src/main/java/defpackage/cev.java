package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cdg;
import defpackage.cdm;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cev  reason: default package */
/* loaded from: classes2.dex */
public final class cev {
    private static final Class<?> a = d();
    private static final cez<?, ?> b = a(false);
    private static final cez<?, ?> c = a(true);
    private static final cez<?, ?> d = new cfb();

    private cev() {
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (cdk.class.isAssignableFrom(cls) || (cls2 = a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static void a(int i, List<Double> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.g(i, list, z);
    }

    public static void b(int i, List<Float> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.f(i, list, z);
    }

    public static void c(int i, List<Long> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.c(i, list, z);
    }

    public static void d(int i, List<Long> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.d(i, list, z);
    }

    public static void e(int i, List<Long> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.n(i, list, z);
    }

    public static void f(int i, List<Long> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.e(i, list, z);
    }

    public static void g(int i, List<Long> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.l(i, list, z);
    }

    public static void h(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.a(i, list, z);
    }

    public static void i(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.j(i, list, z);
    }

    public static void j(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.m(i, list, z);
    }

    public static void k(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.b(i, list, z);
    }

    public static void l(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.k(i, list, z);
    }

    public static void m(int i, List<Integer> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.h(i, list, z);
    }

    public static void n(int i, List<Boolean> list, cfg cfgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.i(i, list, z);
    }

    public static void a(int i, List<String> list, cfg cfgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.a(i, list);
    }

    public static void b(int i, List<ccu> list, cfg cfgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.b(i, list);
    }

    public static void a(int i, List<?> list, cfg cfgVar, cet cetVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.a(i, list, cetVar);
    }

    public static void b(int i, List<?> list, cfg cfgVar, cet cetVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        cfgVar.b(i, list, cetVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.d(cdtVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.d(list.get(i2).longValue());
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
        return a(list) + (list.size() * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.e(cdtVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.e(list.get(i2).longValue());
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
        return b(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.f(cdtVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.f(list.get(i2).longValue());
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
        return c(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.p(cdlVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.p(list.get(i2).intValue());
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
        return d(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m(cdlVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m(list.get(i2).intValue());
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
        return e(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.n(cdlVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.n(list.get(i2).intValue());
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
        return f(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.o(cdlVar.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.o(list.get(i2).intValue());
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
        return g(list) + (size * CodedOutputStream.l(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * CodedOutputStream.e(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * CodedOutputStream.g(i);
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
        return size * CodedOutputStream.k(i);
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
        int l = CodedOutputStream.l(i) * size;
        if (list instanceof cdr) {
            cdr cdrVar = (cdr) list;
            while (i4 < size) {
                Object b2 = cdrVar.b(i4);
                if (b2 instanceof ccu) {
                    i3 = CodedOutputStream.b((ccu) b2);
                } else {
                    i3 = CodedOutputStream.b((String) b2);
                }
                l += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ccu) {
                    i2 = CodedOutputStream.b((ccu) obj);
                } else {
                    i2 = CodedOutputStream.b((String) obj);
                }
                l += i2;
                i4++;
            }
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, cet cetVar) {
        if (obj instanceof cdp) {
            return CodedOutputStream.a(i, (cdp) obj);
        }
        return CodedOutputStream.b(i, (cec) obj, cetVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, cet cetVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = CodedOutputStream.l(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof cdp) {
                i2 = CodedOutputStream.a((cdp) obj);
            } else {
                i2 = CodedOutputStream.a((cec) obj, cetVar);
            }
            l += i2;
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i, List<ccu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * CodedOutputStream.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += CodedOutputStream.b(list.get(i2));
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<cec> list, cet cetVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.c(i, list.get(i3), cetVar);
        }
        return i2;
    }

    public static cez<?, ?> a() {
        return b;
    }

    public static cez<?, ?> b() {
        return c;
    }

    public static cez<?, ?> c() {
        return d;
    }

    private static cez<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e != null) {
                return (cez) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
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
    public static <T> void a(cdx cdxVar, T t, T t2, long j) {
        cfd.a(t, j, cdxVar.a(cfd.f(t, j), cfd.f(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends cdg.a<FT>> void a(cdc<FT> cdcVar, T t, T t2) {
        cdg<FT> a2 = cdcVar.a(t2);
        if (!a2.a.isEmpty()) {
            cdg<FT> b2 = cdcVar.b(t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Map.Entry<FT, Object> entry : a2.a.c()) {
                b2.a(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void a(cez<UT, UB> cezVar, T t, T t2) {
        cezVar.a(t, cezVar.c(cezVar.b(t), cezVar.b(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, cdm.d<?> dVar, UB ub, cez<UT, UB> cezVar) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, cezVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) a(i, intValue2, ub, cezVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, cdm.e eVar, UB ub, cez<UT, UB> cezVar) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, cezVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, cezVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, int i2, UB ub, cez<UT, UB> cezVar) {
        if (ub == null) {
            ub = cezVar.a();
        }
        cezVar.a((cez<UT, UB>) ub, i, i2);
        return ub;
    }
}
