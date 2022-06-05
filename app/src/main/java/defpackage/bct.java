package defpackage;

import defpackage.bcc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bct  reason: default package */
/* loaded from: classes2.dex */
public final class bct implements bdw {
    private static final bde b = new bcx();
    private final bde a;

    public bct() {
        this(new bcv(bca.a(), a()));
    }

    private bct(bde bdeVar) {
        this.a = (bde) bcd.a(bdeVar, "messageInfoFactory");
    }

    @Override // defpackage.bdw
    public final <T> bdy<T> a(Class<T> cls) {
        bea.a((Class<?>) cls);
        bdf b2 = this.a.b(cls);
        if (b2.b()) {
            if (bcc.class.isAssignableFrom(cls)) {
                return bdn.a(bea.c(), bbr.a(), b2.c());
            }
            return bdn.a(bea.a(), bbr.b(), b2.c());
        } else if (bcc.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return bdl.a(b2, bdr.b(), bcq.b(), bea.c(), bbr.a(), bdc.b());
            }
            return bdl.a(b2, bdr.b(), bcq.b(), bea.c(), (bbq<?>) null, bdc.b());
        } else if (a(b2)) {
            return bdl.a(b2, bdr.a(), bcq.a(), bea.a(), bbr.b(), bdc.a());
        } else {
            return bdl.a(b2, bdr.a(), bcq.a(), bea.b(), (bbq<?>) null, bdc.a());
        }
    }

    private static boolean a(bdf bdfVar) {
        return bdfVar.a() == bcc.d.h;
    }

    private static bde a() {
        try {
            return (bde) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }
}
