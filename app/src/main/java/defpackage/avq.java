package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import defpackage.ata;
import java.io.IOException;

/* renamed from: avq  reason: default package */
/* loaded from: classes.dex */
final class avq extends avp<avr, avr> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(Object obj, avr avrVar) {
        ((ata) obj).zzahz = avrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final void d(Object obj) {
        ((ata) obj).zzahz.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ int f(avr avrVar) {
        return avrVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ int e(avr avrVar) {
        avr avrVar2 = avrVar;
        int i = avrVar2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < avrVar2.a; i3++) {
            i2 += zzee.d(avrVar2.b[i3] >>> 3, (art) avrVar2.c[i3]);
        }
        avrVar2.d = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ avr c(avr avrVar, avr avrVar2) {
        avr avrVar3 = avrVar;
        avr avrVar4 = avrVar2;
        return avrVar4.equals(avr.a()) ? avrVar3 : avr.a(avrVar3, avrVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void b(avr avrVar, awm awmVar) throws IOException {
        avr avrVar2 = avrVar;
        if (awmVar.a() == ata.d.k) {
            for (int i = avrVar2.a - 1; i >= 0; i--) {
                awmVar.a(avrVar2.b[i] >>> 3, avrVar2.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < avrVar2.a; i2++) {
            awmVar.a(avrVar2.b[i2] >>> 3, avrVar2.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void a(avr avrVar, awm awmVar) throws IOException {
        avrVar.a(awmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void b(Object obj, avr avrVar) {
        a2(obj, avrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ avr c(Object obj) {
        avr avrVar = ((ata) obj).zzahz;
        if (avrVar == avr.a()) {
            avr b = avr.b();
            a2(obj, b);
            return b;
        }
        return avrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ avr b(Object obj) {
        return ((ata) obj).zzahz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void a(Object obj, avr avrVar) {
        a2(obj, avrVar);
    }

    @Override // defpackage.avp
    final /* synthetic */ avr a(avr avrVar) {
        avr avrVar2 = avrVar;
        avrVar2.e = false;
        return avrVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ avr a() {
        return avr.b();
    }

    @Override // defpackage.avp
    final /* synthetic */ void a(avr avrVar, int i, avr avrVar2) {
        avrVar.a((i << 3) | 3, avrVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void a(avr avrVar, int i, art artVar) {
        avrVar.a((i << 3) | 2, artVar);
    }

    @Override // defpackage.avp
    final /* synthetic */ void b(avr avrVar, int i, long j) {
        avrVar.a((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.avp
    final /* synthetic */ void a(avr avrVar, int i, int i2) {
        avrVar.a((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avp
    public final /* synthetic */ void a(avr avrVar, int i, long j) {
        avrVar.a(i << 3, Long.valueOf(j));
    }
}
