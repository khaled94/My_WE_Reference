package defpackage;

import defpackage.bcc;
import java.io.IOException;
import java.util.Map;

/* renamed from: bbs  reason: default package */
/* loaded from: classes2.dex */
final class bbs extends bbq<Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final boolean a(bdh bdhVar) {
        return bdhVar instanceof bcc.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final bbu<Object> a(Object obj) {
        return ((bcc.b) obj).zzik;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final bbu<Object> b(Object obj) {
        return ((bcc.b) obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final void c(Object obj) {
        a(obj).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final int a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final void b(Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbq
    public final Object a(bbo bboVar, bdh bdhVar, int i) {
        return bboVar.a(bdhVar, i);
    }
}
