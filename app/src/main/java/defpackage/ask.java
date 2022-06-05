package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import defpackage.ata;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: ask  reason: default package */
/* loaded from: classes.dex */
public final class ask implements awm {
    private final zzee a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ask(zzee zzeeVar) {
        zzee zzeeVar2 = (zzee) atb.a(zzeeVar, "output");
        this.a = zzeeVar2;
        zzeeVar2.b = this;
    }

    @Override // defpackage.awm
    public final int a() {
        return ata.d.j;
    }

    @Override // defpackage.awm
    public final void a(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.awm
    public final void a(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.awm
    public final void b(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.awm
    public final void a(int i, float f) throws IOException {
        this.a.a(i, f);
    }

    @Override // defpackage.awm
    public final void a(int i, double d) throws IOException {
        this.a.a(i, d);
    }

    @Override // defpackage.awm
    public final void b(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.awm
    public final void c(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    @Override // defpackage.awm
    public final void c(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    @Override // defpackage.awm
    public final void d(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    @Override // defpackage.awm
    public final void d(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    @Override // defpackage.awm
    public final void a(int i, boolean z) throws IOException {
        this.a.a(i, z);
    }

    @Override // defpackage.awm
    public final void a(int i, String str) throws IOException {
        this.a.a(i, str);
    }

    @Override // defpackage.awm
    public final void a(int i, art artVar) throws IOException {
        this.a.a(i, artVar);
    }

    @Override // defpackage.awm
    public final void e(int i, int i2) throws IOException {
        this.a.c(i, i2);
    }

    @Override // defpackage.awm
    public final void f(int i, int i2) throws IOException {
        this.a.d(i, i2);
    }

    @Override // defpackage.awm
    public final void e(int i, long j) throws IOException {
        this.a.b(i, j);
    }

    @Override // defpackage.awm
    public final void a(int i, Object obj, aux auxVar) throws IOException {
        this.a.a(i, (aui) obj, auxVar);
    }

    @Override // defpackage.awm
    public final void b(int i, Object obj, aux auxVar) throws IOException {
        zzee zzeeVar = this.a;
        zzeeVar.a(i, 3);
        auxVar.a((aux) ((aui) obj), (awm) zzeeVar.b);
        zzeeVar.a(i, 4);
    }

    @Override // defpackage.awm
    public final void a(int i) throws IOException {
        this.a.a(i, 3);
    }

    @Override // defpackage.awm
    public final void b(int i) throws IOException {
        this.a.a(i, 4);
    }

    @Override // defpackage.awm
    public final void a(int i, Object obj) throws IOException {
        if (obj instanceof art) {
            this.a.b(i, (art) obj);
        } else {
            this.a.b(i, (aui) obj);
        }
    }

    @Override // defpackage.awm
    public final void a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.m(list.get(i4).intValue());
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

    @Override // defpackage.awm
    public final void b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += zzee.a();
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

    @Override // defpackage.awm
    public final void c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.d(list.get(i4).longValue());
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

    @Override // defpackage.awm
    public final void d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.e(list.get(i4).longValue());
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

    @Override // defpackage.awm
    public final void e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += zzee.c();
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

    @Override // defpackage.awm
    public final void f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += zzee.e();
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

    @Override // defpackage.awm
    public final void g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += zzee.f();
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

    @Override // defpackage.awm
    public final void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.p(list.get(i4).intValue());
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

    @Override // defpackage.awm
    public final void i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3 += zzee.g();
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

    @Override // defpackage.awm
    public final void a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof atp) {
            atp atpVar = (atp) list;
            while (i2 < list.size()) {
                Object b = atpVar.b(i2);
                if (b instanceof String) {
                    this.a.a(i, (String) b);
                } else {
                    this.a.a(i, (art) b);
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

    @Override // defpackage.awm
    public final void b(int i, List<art> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, list.get(i2));
        }
    }

    @Override // defpackage.awm
    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.n(list.get(i4).intValue());
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

    @Override // defpackage.awm
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += zzee.b();
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

    @Override // defpackage.awm
    public final void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += zzee.d();
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

    @Override // defpackage.awm
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.o(list.get(i4).intValue());
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

    @Override // defpackage.awm
    public final void n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzee.f(list.get(i4).longValue());
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

    @Override // defpackage.awm
    public final void a(int i, List<?> list, aux auxVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), auxVar);
        }
    }

    @Override // defpackage.awm
    public final void b(int i, List<?> list, aux auxVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), auxVar);
        }
    }

    @Override // defpackage.awm
    public final <K, V> void a(int i, aty<K, V> atyVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.b(aua.a(atyVar, entry.getKey(), entry.getValue()));
            aua.a(this.a, atyVar, entry.getKey(), entry.getValue());
        }
    }
}
