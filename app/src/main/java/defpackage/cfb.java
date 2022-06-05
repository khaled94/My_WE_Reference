package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cfg;
import java.io.IOException;

/* renamed from: cfb  reason: default package */
/* loaded from: classes2.dex */
final class cfb extends cez<cfa, cfa> {
    @Override // defpackage.cez
    final /* bridge */ /* synthetic */ cfa a(cfa cfaVar) {
        cfa cfaVar2 = cfaVar;
        cfaVar2.e = false;
        return cfaVar2;
    }

    @Override // defpackage.cez
    final /* synthetic */ void a(cfa cfaVar, int i, int i2) {
        cfaVar.a(cff.a(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ void a(cfa cfaVar, int i, long j) {
        cfaVar.a(cff.a(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* bridge */ /* synthetic */ void a(cfa cfaVar, int i, ccu ccuVar) {
        cfaVar.a(cff.a(i, 2), ccuVar);
    }

    @Override // defpackage.cez
    final /* bridge */ /* synthetic */ void a(cfa cfaVar, int i, cfa cfaVar2) {
        cfaVar.a(cff.a(i, 3), cfaVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* bridge */ /* synthetic */ void a(cfa cfaVar, cfg cfgVar) throws IOException {
        cfaVar.a(cfgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* bridge */ /* synthetic */ void a(Object obj, cfa cfaVar) {
        a2(obj, cfaVar);
    }

    @Override // defpackage.cez
    final /* synthetic */ void b(cfa cfaVar, int i, long j) {
        cfaVar.a(cff.a(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ void b(cfa cfaVar, cfg cfgVar) throws IOException {
        cfa cfaVar2 = cfaVar;
        if (cfgVar.a() == cfg.a.b) {
            for (int i = cfaVar2.a - 1; i >= 0; i--) {
                cfgVar.a(cff.b(cfaVar2.b[i]), cfaVar2.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < cfaVar2.a; i2++) {
            cfgVar.a(cff.b(cfaVar2.b[i2]), cfaVar2.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ void b(Object obj, cfa cfaVar) {
        a2(obj, cfaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ cfa c(cfa cfaVar, cfa cfaVar2) {
        cfa cfaVar3 = cfaVar;
        cfa cfaVar4 = cfaVar2;
        return cfaVar4.equals(cfa.a()) ? cfaVar3 : cfa.a(cfaVar3, cfaVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ int e(cfa cfaVar) {
        cfa cfaVar2 = cfaVar;
        int i = cfaVar2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < cfaVar2.a; i3++) {
            i2 += CodedOutputStream.d(cff.b(cfaVar2.b[i3]), (ccu) cfaVar2.c[i3]);
        }
        cfaVar2.d = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ int f(cfa cfaVar) {
        return cfaVar.c();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(Object obj, cfa cfaVar) {
        ((cdk) obj).unknownFields = cfaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final void d(Object obj) {
        ((cdk) obj).unknownFields.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ cfa c(Object obj) {
        cfa cfaVar = ((cdk) obj).unknownFields;
        if (cfaVar == cfa.a()) {
            cfa b = cfa.b();
            a2(obj, b);
            return b;
        }
        return cfaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* bridge */ /* synthetic */ cfa b(Object obj) {
        return ((cdk) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cez
    public final /* synthetic */ cfa a() {
        return cfa.b();
    }
}
