package defpackage;

import com.google.android.gms.internal.places.zzaj;
import defpackage.bcc;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: bbl  reason: default package */
/* loaded from: classes2.dex */
public final class bbl implements bfi {
    private final zzaj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bbl(zzaj zzajVar) {
        zzaj zzajVar2 = (zzaj) bcd.a(zzajVar, "output");
        this.a = zzajVar2;
        zzajVar2.c = this;
    }

    @Override // defpackage.bfi
    public final int a() {
        return bcc.d.j;
    }

    @Override // defpackage.bfi
    public final void a(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.bfi
    public final void a(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.bfi
    public final void b(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.bfi
    public final void a(int i, float f) throws IOException {
        this.a.a(i, f);
    }

    @Override // defpackage.bfi
    public final void a(int i, double d) throws IOException {
        this.a.a(i, d);
    }

    @Override // defpackage.bfi
    public final void b(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.bfi
    public final void c(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.bfi
    public final void c(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.bfi
    public final void d(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.bfi
    public final void d(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.bfi
    public final void a(int i, boolean z) throws IOException {
        this.a.a(i, z);
    }

    @Override // defpackage.bfi
    public final void a(int i, String str) throws IOException {
        this.a.a(i, str);
    }

    @Override // defpackage.bfi
    public final void a(int i, bgb bgbVar) throws IOException {
        this.a.a(i, bgbVar);
    }

    @Override // defpackage.bfi
    public final void e(int i, int i2) throws IOException {
        this.a.c(i, i2);
    }

    @Override // defpackage.bfi
    public final void f(int i, int i2) throws IOException {
        this.a.d(i, i2);
    }

    @Override // defpackage.bfi
    public final void e(int i, long j) throws IOException {
        this.a.b(i, j);
    }

    @Override // defpackage.bfi
    public final void a(int i, Object obj, bdy bdyVar) throws IOException {
        this.a.a(i, (bdh) obj, bdyVar);
    }

    @Override // defpackage.bfi
    public final void b(int i, Object obj, bdy bdyVar) throws IOException {
        zzaj zzajVar = this.a;
        zzajVar.a(i, 3);
        bdyVar.a((bdy) ((bdh) obj), (bfi) zzajVar.c);
        zzajVar.a(i, 4);
    }

    @Override // defpackage.bfi
    public final void a(int i) throws IOException {
        this.a.a(i, 3);
    }

    @Override // defpackage.bfi
    public final void b(int i) throws IOException {
        this.a.a(i, 4);
    }

    @Override // defpackage.bfi
    public final void a(int i, Object obj) throws IOException {
        if (obj instanceof bgb) {
            this.a.b(i, (bgb) obj);
        } else {
            this.a.a(i, (bdh) obj);
        }
    }

    @Override // defpackage.bfi
    public final void a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m(list.get(i4).intValue());
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

    @Override // defpackage.bfi
    public final void b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += zzaj.a();
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

    @Override // defpackage.bfi
    public final void c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.d(list.get(i4).longValue());
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

    @Override // defpackage.bfi
    public final void d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.e(list.get(i4).longValue());
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

    @Override // defpackage.bfi
    public final void e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += zzaj.c();
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

    @Override // defpackage.bfi
    public final void f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += zzaj.e();
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

    @Override // defpackage.bfi
    public final void g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += zzaj.f();
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

    @Override // defpackage.bfi
    public final void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.p(list.get(i4).intValue());
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

    @Override // defpackage.bfi
    public final void i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3 += zzaj.g();
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

    @Override // defpackage.bfi
    public final void a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof bco) {
            bco bcoVar = (bco) list;
            while (i2 < list.size()) {
                Object b = bcoVar.b(i2);
                if (b instanceof String) {
                    this.a.a(i, (String) b);
                } else {
                    this.a.a(i, (bgb) b);
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

    @Override // defpackage.bfi
    public final void b(int i, List<bgb> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, list.get(i2));
        }
    }

    @Override // defpackage.bfi
    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.n(list.get(i4).intValue());
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

    @Override // defpackage.bfi
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += zzaj.b();
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

    @Override // defpackage.bfi
    public final void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += zzaj.d();
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

    @Override // defpackage.bfi
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.o(list.get(i4).intValue());
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

    @Override // defpackage.bfi
    public final void n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.f(list.get(i4).longValue());
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

    @Override // defpackage.bfi
    public final void a(int i, List<?> list, bdy bdyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), bdyVar);
        }
    }

    @Override // defpackage.bfi
    public final void b(int i, List<?> list, bdy bdyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), bdyVar);
        }
    }

    @Override // defpackage.bfi
    public final <K, V> void a(int i, bcy<K, V> bcyVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.b(bcz.a(bcyVar, entry.getKey(), entry.getValue()));
            bcz.a(this.a, bcyVar, entry.getKey(), entry.getValue());
        }
    }
}
