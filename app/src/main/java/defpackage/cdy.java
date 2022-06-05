package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cdv;
import java.util.Map;

/* renamed from: cdy  reason: default package */
/* loaded from: classes2.dex */
final class cdy implements cdx {
    @Override // defpackage.cdx
    public final Map<?, ?> a(Object obj) {
        return (cdw) obj;
    }

    @Override // defpackage.cdx
    public final cdv.a<?, ?> e(Object obj) {
        return ((cdv) obj).a;
    }

    @Override // defpackage.cdx
    public final Map<?, ?> b(Object obj) {
        return (cdw) obj;
    }

    @Override // defpackage.cdx
    public final boolean c(Object obj) {
        return !((cdw) obj).a;
    }

    @Override // defpackage.cdx
    public final Object d(Object obj) {
        ((cdw) obj).a = false;
        return obj;
    }

    @Override // defpackage.cdx
    public final Object a() {
        return cdw.a().b();
    }

    @Override // defpackage.cdx
    public final Object a(Object obj, Object obj2) {
        cdw cdwVar = (cdw) obj;
        cdw cdwVar2 = (cdw) obj2;
        if (!cdwVar2.isEmpty()) {
            if (!cdwVar.a) {
                cdwVar = cdwVar.b();
            }
            cdwVar.c();
            if (!cdwVar2.isEmpty()) {
                cdwVar.putAll(cdwVar2);
            }
        }
        return cdwVar;
    }

    @Override // defpackage.cdx
    public final int a(int i, Object obj, Object obj2) {
        cdw cdwVar = (cdw) obj;
        cdv cdvVar = (cdv) obj2;
        int i2 = 0;
        if (cdwVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : cdwVar.entrySet()) {
            i2 += CodedOutputStream.l(i) + CodedOutputStream.q(cdv.a(cdvVar.a, entry.getKey(), entry.getValue()));
        }
        return i2;
    }
}
