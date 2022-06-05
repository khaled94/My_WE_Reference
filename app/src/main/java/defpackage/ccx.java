package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cdv;
import defpackage.cff;
import defpackage.cfg;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: ccx  reason: default package */
/* loaded from: classes2.dex */
public final class ccx implements cfg {
    private final CodedOutputStream a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ccx(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) cdm.a(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.b = this;
    }

    @Override // defpackage.cfg
    public final int a() {
        return cfg.a.a;
    }

    @Override // defpackage.cfg
    public final void a(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.cfg
    public final void a(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.cfg
    public final void b(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.cfg
    public final void a(int i, float f) throws IOException {
        this.a.a(i, f);
    }

    @Override // defpackage.cfg
    public final void a(int i, double d) throws IOException {
        this.a.a(i, d);
    }

    @Override // defpackage.cfg
    public final void b(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.cfg
    public final void c(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.cfg
    public final void c(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.cfg
    public final void d(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.cfg
    public final void d(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.cfg
    public final void a(int i, boolean z) throws IOException {
        this.a.a(i, z);
    }

    @Override // defpackage.cfg
    public final void a(int i, String str) throws IOException {
        this.a.a(i, str);
    }

    @Override // defpackage.cfg
    public final void a(int i, ccu ccuVar) throws IOException {
        this.a.a(i, ccuVar);
    }

    @Override // defpackage.cfg
    public final void e(int i, int i2) throws IOException {
        this.a.c(i, i2);
    }

    @Override // defpackage.cfg
    public final void f(int i, int i2) throws IOException {
        this.a.d(i, i2);
    }

    @Override // defpackage.cfg
    public final void e(int i, long j) throws IOException {
        this.a.b(i, j);
    }

    @Override // defpackage.cfg
    public final void a(int i, Object obj, cet cetVar) throws IOException {
        this.a.a(i, (cec) obj, cetVar);
    }

    @Override // defpackage.cfg
    public final void b(int i, Object obj, cet cetVar) throws IOException {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.a(i, 3);
        cetVar.a((cet) ((cec) obj), (cfg) codedOutputStream.b);
        codedOutputStream.a(i, 4);
    }

    @Override // defpackage.cfg
    public final void a(int i) throws IOException {
        this.a.a(i, 3);
    }

    @Override // defpackage.cfg
    public final void b(int i) throws IOException {
        this.a.a(i, 4);
    }

    @Override // defpackage.cfg
    public final void a(int i, Object obj) throws IOException {
        if (obj instanceof ccu) {
            this.a.b(i, (ccu) obj);
        } else {
            this.a.a(i, (cec) obj);
        }
    }

    @Override // defpackage.cfg
    public final void a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m(list.get(i4).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += CodedOutputStream.a();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.d(list.get(i4).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.e(list.get(i4).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += CodedOutputStream.c();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += CodedOutputStream.e();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += CodedOutputStream.f();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3 += CodedOutputStream.g();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof cdr) {
            cdr cdrVar = (cdr) list;
            while (i2 < list.size()) {
                Object b = cdrVar.b(i2);
                if (b instanceof String) {
                    this.a.a(i, (String) b);
                } else {
                    this.a.a(i, (ccu) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, list.get(i2));
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void b(int i, List<ccu> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, list.get(i2));
        }
    }

    @Override // defpackage.cfg
    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.n(list.get(i4).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += CodedOutputStream.b();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += CodedOutputStream.d();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.o(list.get(i4).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.f(list.get(i4).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cfg
    public final void a(int i, List<?> list, cet cetVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), cetVar);
        }
    }

    @Override // defpackage.cfg
    public final void b(int i, List<?> list, cet cetVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), cetVar);
        }
    }

    @Override // defpackage.cfg
    public final <K, V> void a(int i, cdv.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (!this.a.c) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                this.a.a(i, 2);
                this.a.b(cdv.a(aVar, entry.getKey(), entry.getValue()));
                cdv.a(this.a, aVar, entry.getKey(), entry.getValue());
            }
            return;
        }
        int i2 = 0;
        switch (AnonymousClass1.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    a(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 == null) {
                    return;
                }
                a(i, true, v2, aVar);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int size = map.size();
                int[] iArr = new int[size];
                int i3 = 0;
                for (K k : map.keySet()) {
                    iArr[i3] = k.intValue();
                    i3++;
                }
                Arrays.sort(iArr);
                while (i2 < size) {
                    int i4 = iArr[i2];
                    V v3 = map.get(Integer.valueOf(i4));
                    this.a.a(i, 2);
                    this.a.b(cdv.a(aVar, Integer.valueOf(i4), v3));
                    cdv.a(this.a, aVar, Integer.valueOf(i4), v3);
                    i2++;
                }
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                int size2 = map.size();
                long[] jArr = new long[size2];
                int i5 = 0;
                for (K k2 : map.keySet()) {
                    jArr[i5] = k2.longValue();
                    i5++;
                }
                Arrays.sort(jArr);
                while (i2 < size2) {
                    long j = jArr[i2];
                    V v4 = map.get(Long.valueOf(j));
                    this.a.a(i, 2);
                    this.a.b(cdv.a(aVar, Long.valueOf(j), v4));
                    cdv.a(this.a, aVar, Long.valueOf(j), v4);
                    i2++;
                }
                return;
            case 12:
                int size3 = map.size();
                String[] strArr = new String[size3];
                int i6 = 0;
                for (K k3 : map.keySet()) {
                    strArr[i6] = k3;
                    i6++;
                }
                Arrays.sort(strArr);
                while (i2 < size3) {
                    String str = strArr[i2];
                    V v5 = map.get(str);
                    this.a.a(i, 2);
                    this.a.b(cdv.a(aVar, str, v5));
                    cdv.a(this.a, aVar, str, v5);
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    /* renamed from: ccx$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cff.a.values().length];
            a = iArr;
            try {
                iArr[cff.a.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cff.a.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cff.a.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cff.a.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[cff.a.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private <V> void a(int i, boolean z, V v, cdv.a<Boolean, V> aVar) throws IOException {
        this.a.a(i, 2);
        this.a.b(cdv.a(aVar, Boolean.valueOf(z), v));
        cdv.a(this.a, aVar, Boolean.valueOf(z), v);
    }
}
