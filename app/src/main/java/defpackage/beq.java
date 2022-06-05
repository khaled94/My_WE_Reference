package defpackage;

import com.google.android.gms.internal.places.zzaj;
import defpackage.bcc;
import java.io.IOException;

/* renamed from: beq  reason: default package */
/* loaded from: classes2.dex */
final class beq extends beo<ben, ben> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(Object obj, ben benVar) {
        ((bcc) obj).zzih = benVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final void b(Object obj) {
        ((bcc) obj).zzih.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ int d(ben benVar) {
        return benVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ int c(ben benVar) {
        ben benVar2 = benVar;
        int i = benVar2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < benVar2.a; i3++) {
            i2 += zzaj.d(benVar2.b[i3] >>> 3, (bgb) benVar2.c[i3]);
        }
        benVar2.d = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ ben c(ben benVar, ben benVar2) {
        ben benVar3 = benVar;
        ben benVar4 = benVar2;
        return benVar4.equals(ben.a()) ? benVar3 : ben.a(benVar3, benVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void b(ben benVar, bfi bfiVar) throws IOException {
        ben benVar2 = benVar;
        if (bfiVar.a() == bcc.d.k) {
            for (int i = benVar2.a - 1; i >= 0; i--) {
                bfiVar.a(benVar2.b[i] >>> 3, benVar2.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < benVar2.a; i2++) {
            bfiVar.a(benVar2.b[i2] >>> 3, benVar2.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void a(ben benVar, bfi bfiVar) throws IOException {
        benVar.a(bfiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void b(Object obj, ben benVar) {
        a2(obj, benVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ ben a(Object obj) {
        return ((bcc) obj).zzih;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void a(Object obj, ben benVar) {
        a2(obj, benVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ ben a() {
        return ben.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void a(ben benVar, int i, bgb bgbVar) {
        benVar.a((i << 3) | 2, bgbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.beo
    public final /* synthetic */ void a(ben benVar, int i, long j) {
        benVar.a(i << 3, Long.valueOf(j));
    }
}
